node {


    stage('Checkout') {
        // Pull code from GitHubinto jenkins (if not already done)
        checkout scm
    }


    stage('Build and Test') {
        // Run Maven in the workspace folder
        dir("${WORKSPACE}") {
            bat 'mvn clean test'
        }
    }
}
