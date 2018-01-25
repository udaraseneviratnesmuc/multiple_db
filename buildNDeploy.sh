rm -rf /home/udara/apps/apache-tomcat-8.5.5/webapps/multiple-dbs*
mvn clean install -DskipTests
cp ./target/multiple-dbs.war /home/udara/apps/apache-tomcat-8.5.5/webapps/
export JPDA_ADDRESS=5005
export JPDA_TRANSPORT=dt_socket
/home/udara/apps/apache-tomcat-8.5.5/bin/catalina.sh jpda run