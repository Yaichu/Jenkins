node("docker") {
    stage("build") {
        customImage = docker.build("proj_app")
    }

    // stage('Run container') {
    //     sh "docker stop training && docker rm training"
    //     sh "docker run -d --restart always --name training -p 8080:5000 training/webapp"
    // }
}