
def info(message) {
    echo "XX INFO: ${message}" 
}

def init( ) {
    echo ("Loading libraryResource('init.sh')")
    contents = libraryResource('init.sh')
    echo ("------")  
    echo ("Contents of init.sh")
    printf("<%s>\n", contents); 
    echo ("------")  
    echo ("Running init.sh")
    sh contents  
    echo ("-----------------------")
}   

