pipeline{

agent any
stages{

   stage("compile"){

     steps{
       sh 'javac src/FindFirstThreeLargeNumber.java'
     }
   }

   stage("run"){

     steps{
       sh 'java -cp src FindFirstThreeLargeNumber'
     }
   }

 }
}