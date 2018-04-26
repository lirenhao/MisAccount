FROM jhouzard/docker-jdk6-mvn3

RUN mkdir -p /opt/ars
WORKDIR /opt/ars

COPY settings.xml /opt/maven/conf/
COPY . /opt/ars

RUN mvn clean package -Dmaven.test.skip=true \
     && cp -R ./target/*.jar ./app.jar

EXPOSE 9000
CMD ["java", "-jar", "/opt/ars/app.jar"]