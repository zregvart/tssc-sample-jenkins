
def info(message) {
    echo "XX INFO: ${message}" 
}

def init( ) {
    rhtap.info ("Loading libraryResource('init.sh')")
    contents = libraryResource('init.sh')
    rhtap.info ("------")  
    rhtap.info ("Contents of init.sh")
    printf("<%s>\n", contents); 
    rhtap.info ("------")  
    rhtap.info ("Running init.sh")
    sh contents  
    rhtap.info ("-----------------------")
}   

