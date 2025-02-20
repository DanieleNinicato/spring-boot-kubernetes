pipeline {

    tools {
        maven 'Maven 3.6.3'
        jdk 'Adopt Openjdk21.0.1+12'
    }

    agent any

    stages {

        stage('build') {

            steps {
                echo 'building application spring-boot-kubernetes'
                echo $JAVA_HOME
                sh "java -version"
                sh "mvn -version"
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
