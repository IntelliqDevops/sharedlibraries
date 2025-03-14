def gitDownload(repo)
{
   git "https://github.com/IntelliqDevops/${repo}.git"

}

def buildArtifact()
{
    sh 'mvn package'

}
