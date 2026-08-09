node {
    try {
        stage('Build') {
            echo 'Building application...'
        }
        
        stage('Test') {
<<<<<<< HEAD:Jenkinsfile.groovy
            echo 'Running tests...'
=======
            steps {
                echo 'Stage 3: Running automated tests...'
                // Add test commands here
            }
        }

        stage('Deploy') {
            steps {
                echo 'Stage 5: Deploying build artifacts...'
            }
>>>>>>> 7aaf965195b6bac04df2a8ac1a5d0b8b493150c8:Jenkinsfile
        }
    } catch (Exception e) {
        echo "Build failed: ${e.getMessage()}"
    } finally {
        echo 'Pipeline finished!'
    }
}
