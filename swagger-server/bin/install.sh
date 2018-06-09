#!/bin/bash

pwd=$(cd `dirname $0`; pwd);cd $pwd
CLIENT_HOME=$pwd/../../client
SERVER_HOME=$pwd/../../server
ASCII_HOME=$pwd/../../asciidoc
DOC_HOME=$pwd/../../docs
CLIENT_JAR="swagger-codegen-cli-2.2.3.jar"

echo "generated client source folder: $CLIENT_HOME"
echo "generated server source folder: $SERVER_HOME"

# do clean
rm -rf $CLIENT_HOME $SERVER_HOME $ASCII_HOME $DOC_HOME

# clients
java -jar $CLIENT_JAR generate \
  -i $pwd/../src/main/resources/swagger.yml \
  -l java \
  -c generate-client-java-config.json \
  -o $CLIENT_HOME/java

java -jar $CLIENT_JAR generate \
  -i $pwd/../src/main/resources/swagger.yml \
  -l go \
  -o $CLIENT_HOME/go

java -jar $CLIENT_JAR generate \
  -i $pwd/../src/main/resources/swagger.yml \
  -l html2 \
  -c generate-client-html-config.json \
  -o $CLIENT_HOME/html2

# servers
java -jar $CLIENT_JAR generate \
  -i $pwd/../src/main/resources/swagger.yml \
  -l spring \
  -c generate-server-spring-config.json \
  -o $SERVER_HOME/spring

java -jar $CLIENT_JAR generate \
  -i $pwd/../src/main/resources/swagger.yml \
  -l jaxrs-resteasy \
  -c generate-server-jaxrs-resteasy-config.json \
  -o $SERVER_HOME/jaxrs-resteasy

cd $pwd/../..
mvn clean install -Dmaven.test.skip