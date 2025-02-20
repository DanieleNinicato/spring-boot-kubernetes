pipeline {

    tools {
        maven 'Maven 3.6.3'
    }

    agent any

    stages {

        stage('build') {

            steps {
                echo 'building application spring-boot-kubernetes'
                sh "mvn -T 2C clean package"
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
