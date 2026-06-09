pipeline{

agent any
stages{

   stage("compile"){

     steps{
       sh 'src/javac FindFirstThreeLargeNumber.java'
     }
   }

   stage("run"){

     steps{
       sh 'java FindFirstThreeLargeNumber'
     }
   }

 }
}