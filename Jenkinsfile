node {
  stage("Clone the project") {
    git branch: 'develop', url: 'https://github.com/varunlallp/JenkinsTest.git'
  }

  stage("Compilation") {
    sh "./mvnw clean install -DskipTests"
  }

  stage("Tests and Deployment") {
    stage("Runing unit tests") {
      sh "./mvnw test -Punit"
    }
    stage("Deployment") {
      sh './mvnw spring-boot:run -Dserver.port=8001 &'
    }
  }
}