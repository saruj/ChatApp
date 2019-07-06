/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.util.Random;

class Client
{
   private String userName;
   private String ipAddress;
   private java.net.Socket socket = null;

   public Client (String userName, String ipAddress, java.net.Socket socket)
   {
      this.userName = userName;
      this.ipAddress = ipAddress;
      this.socket = socket;
   }

   public java.net.Socket getSocket()
   {
       return this.socket;
   }
   
   
}