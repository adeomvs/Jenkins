node{   
 stage('Hello'){
  echo "Hello ADEO"
 }
 stage('SHELL'){
  sh 'env'
 }
}
