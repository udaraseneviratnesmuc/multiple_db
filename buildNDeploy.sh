source ~/.bash_profile
rm -rf /home/udara/apps/apache-tomcat-7.0.42/webapps/multiple-dbs*
mvn clean install -DskipTests
cp ./rest/target/multiple-dbs.war /home/udara/apps/apache-tomcat-7.0.42/webapps/
export JPDA_ADDRESS=5005
export JPDA_TRANSPORT=dt_socket
/home/udara/apps/apache-tomcat-7.0.42/bin/catalina.sh jpda run