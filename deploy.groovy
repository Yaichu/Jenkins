node("linux") {
    stage('Run container') {
        sh "docker run -d --name training -p 8080:5000 training/webapp"
    }
}