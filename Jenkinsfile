pipeline {
    agent any

    environment {
        SONAR_PROJECT_KEY = 'sonar1'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/tejaswia472-teju/sonarqube-maven-example.git'
            }
        }

        stage('Build & Test') {
            steps {
                sh '''
                  mvn clean verify -Dmaven.test.failure.ignore=true
                '''
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh '''
                      mvn sonar:sonar \
                      -Dsonar.projectKey=${SONAR_PROJECT_KEY}
                    '''
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
