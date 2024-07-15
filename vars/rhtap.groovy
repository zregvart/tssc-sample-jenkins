
def info(message) {
    echo "XX INFO: ${message}" 
}

def init( ) {  
    echo "XX2" 
    sh "pwd"
    echo " "  
    sh "ls -al " 
    echo " "  
    sh "ls -al .." 
    echo " " 
    sh "ls -al ../.." 
}  

