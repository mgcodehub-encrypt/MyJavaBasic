pipeline{

stages{

   stage("compile"){

     steps{
       sh 'javac FindFirstThreeLargeNumber.java'
     }
   }

   stage("run"){

     steps{
       sh 'java FindFirstThreeLargeNumber'
     }
   }

 }
}