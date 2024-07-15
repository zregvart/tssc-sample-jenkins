
def info(message) {
    echo "INFO: ${message}" 
}

def init( ) { 
   
    sh "pwd"
    echo " "  
    sh "ls -al " 
    echo " "  
    sh "ls -al .." 
    echo " " 
    sh "ls -al ../.." 
}  

