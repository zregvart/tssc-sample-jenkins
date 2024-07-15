
def info(message) {
    echo "XX INFO: ${message}" 
}

def xrun_script (scriptname) { 
    echo ("Loading libraryResource(${scriptname})")
    contents = libraryResource( scriptname )
    echo ("------")  
    echo ("Contents of ${scriptname}")
    printf("<%s>\n", contents); 
    echo ("------")  
    echo ("Running ${scriptname}")
    sh contents  
    echo ("-----------------------")
}

def install_script (scriptname) { 
    echo ("Loading libraryResource(${scriptname})")
    contents = libraryResource( scriptname )
    echo ("------")   
    writeFile(file:  "rhtap/${scriptname}"  , text: contents) 
    sh "ls -al rhtap" 
}

def run_script (scriptname) { 
    install_script ("common.sh")  
    install_script ("verify-deps-exist")  
    install_script (scriptname")  
    sh "rhtap/${scriptname}"  
    echo ("-----------------------")
}
 
def init( ) { 
    run_script ('init.sh') 
}   

def xinit( ) { 
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

