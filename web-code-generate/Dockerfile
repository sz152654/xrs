FROM registry.cn-hangzhou.aliyuncs.com/wuling/jdk8:1.0
RUN ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' > /etc/timezone
VOLUME /tmp
ADD target/web-code-generate-0.0.1-SNAPSHOT.jar /app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 80
CMD ["java -server -Dspring.profiles.active=test -jar /app.jar"]