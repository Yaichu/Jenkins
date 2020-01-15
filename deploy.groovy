stage("build docker") {
        customImage = docker.build("yaeldoc1/jenkins")
        withDockerRegistry(registry:[
                credentialsId: 'dockerhub.yaeldoc1'
                ]) {
            customImage.push()
        }
    }
stage("verify dockers") {
    sh "docker images"
}