pipeline {

    tools {
        maven 'Maven 3.6.3'
        jdk 'Adopt Openjdk21.0.1+12'
    }

    environment {
        JAVA_HOME = "${tool 'Adopt Openjdk21.0.1+12'}"
        MVN_HOME = "${tool 'Maven 3.6.3'}"
    }

    agent any

    stages {

        stage('build') {

            steps {
                echo 'building application spring-boot-kubernetes'
                echo 'JAVA_HOME='$JAVA_HOME
                echo 'PATH='$PATH
                echo java -version
                echo mvn -version
            }
        }

        stage('test') {

            steps {
                echo 'testing application spring-boot-kubernetes'
            }
        }

        stage('deploy') {

            steps {
                echo 'deploying application spring-boot-kubernetes'
                sh 'docker version'
            }
        }
    }
}
