pipeline {
        agent any
		        stage('One') {
				        steps {
						       echo 'hi,this is Nawrin'
						}
					}
				stage('Two'){
				        steps {
						       input('procees the following')
						}
				}
					
				