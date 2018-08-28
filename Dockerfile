# 192.168.12.129
# FROM 192.168.12.129:7709/library/java:8

# localhost 
FROM java:8

VOLUME /tmp
ADD ./target/springboot.hello.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8000
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

