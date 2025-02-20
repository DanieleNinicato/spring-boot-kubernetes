pipeline {

    tools {
        maven 'Maven 3.6.3'
        jdk 'Adopt Openjdk21.0.1+12'
    }

    environment {
        JAVA_HOME = "${tool 'Adopt Openjdk21.0.1+12'}"
        PATH = "${JAVA_HOME}/bin:${env.PATH}" // Ensure JDK bin is in PATH
    }

    agent any

    stages {

        stage('build') {

            steps {
                echo 'building application spring-boot-kubernetes'
                sh 'echo JAVA_HOME=$JAVA_HOME'
                sh 'echo PATH=$PATH'
                sh 'java -version'
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
