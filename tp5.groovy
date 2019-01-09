node{   
 stage('Hello'){
  echo "Hello ADEO"
 }
 stage('SHELL'){
  sh 'env'
 }
 stage('DIR'){
  sh 'ls -alrt /root'
 }
}
