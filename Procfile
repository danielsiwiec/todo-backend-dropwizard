---
default_process_types:
  web: ./gradlew buildFatJar && cd build/libs && java -Ddw.server.applicationConnectors\[0\].port=$PORT -Ddw.server.adminConnectors\[0\].port=$PORT -jar todo-backend-standalone.jar server ../../src/main/resources/config.yaml
i
