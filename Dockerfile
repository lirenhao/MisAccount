FROM jhouzard/docker-jdk6-mvn3

COPY settings.xml /opt/maven/conf/

ENV PROJECT_HOME=/opt/app
RUN mkdir -p $PROJECT_HOME
WORKDIR $PROJECT_HOME

# add source
ADD . $PROJECT_HOME