def gitDownload(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}


def mavenBuild()
{
     sh 'mvn package'
}

