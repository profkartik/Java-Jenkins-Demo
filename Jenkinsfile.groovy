pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Stage 1: Pulling latest code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Stage 2: Building application...'
                // Add your build commands here (e.g., bat 'mvn clean compile')
            }
        }

        stage('Test') {
            steps {
                echo 'Stage 3: Running automated tests...'
                // Add test commands here
            }
        }

        stage('Deploy') {
            steps {
                echo 'Stage 4: Deploying build artifacts...'
            }
        }
    }
}