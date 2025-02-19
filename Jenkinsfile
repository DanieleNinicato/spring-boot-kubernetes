pipeline {

    agent any

    stages {

        stage('build') {

            steps {
                echo 'building application spring-boot-kubernetes'
                sh 'docker version'
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
            }
        }
    }
}
