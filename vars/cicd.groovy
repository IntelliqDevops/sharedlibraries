def gitDownload(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}


def mavenBuild()
{
     sh 'mvn package'
}

def tomcatDeploy(jobname,ip,context)
{

sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war vagrant@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}


