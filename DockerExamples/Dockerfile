FROM ubuntu:latest

MAINTAINER Rajashekhar

RUN apt-get update && \
    
    apt-get upgrade -y && \

    apt-get install -y  software-properties-common && \

    add-apt-repository ppa:webupd8team/java -y && \

    apt-get update && \

    apt-get install -y openjdk-8-jdk && \

    apt-get clean
WORKDIR /app
RUN mvn install
ADD ./DockerExamples-0.0.1-SNAPSHOT.jar /app

EXPOSE 8091

ENTRYPOINT [ "sh", "-c", "java -jar DockerExamples-0.0.1-SNAPSHOT.jar" ]
