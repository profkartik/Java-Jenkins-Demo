node {
    try {
        stage('Build') {
            echo 'Building application...'
        }
        
        stage('Test') {
            echo 'Running tests...'
        }
    } catch (Exception e) {
        echo "Build failed: ${e.getMessage()}"
    } finally {
        echo 'Pipeline finished!'
    }
}