FROM registry.cn-hangzhou.aliyuncs.com/vst/lib:openjdk_17-jdk-alpine-font

# MAINTAINER
MAINTAINER yavst<ywj0327@126.com>


VOLUME /tmp


ARG JAR_FILE=.docker/application.jar
COPY ${JAR_FILE} /app.jar

ENV JAVA_OPTS ""
ENV APP_ARGS ""

EXPOSE 8080  9999

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} ${APP_ARGS} -jar /app.jar"]

