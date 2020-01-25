node("linux") {
    stage('Run container') {
        sh "docker stop training && docker rm training"
        sh "docker run -d --restart always --name training -p 8080:5000 training/webapp"
    }
}