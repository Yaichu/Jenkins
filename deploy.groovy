node("linux") {
    stage ("pull image") {
        sh 'docker pull docker.io/training/webapp'
    }
    stage("deploy webapp") {
        sh "kubectl apply -f k8sdeploy.yml"
        sh "kubectl apply -f k8sservice.yml"
    }
}