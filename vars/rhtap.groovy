
def info(message) {
    echo "INFO: ${message}" 
}

def init( ) { 
    echo " " 
    sh "pwd"
    sh "ls -al " 
    echo " " 
    sh "pwd"
    sh "ls -al .." 
    echo " " 
    sh "pwd"
    sh "ls -al ../.." 
}  

