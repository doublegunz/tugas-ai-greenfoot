/**
 * Tugas Mata Kuliah Pengantar Kecerdasan Buatan
 * Copyright (C) 2016 Gun Gun Priatna
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class player
 * 
 * @author (Gun Gun Priatna) 
 * @version (1.0.0-dev)
 */
public class Player extends Actor
{
 
    public void act() {
      
      //menyerang musuh dengan menekan tombol spasi
      if (Greenfoot.isKeyDown("space") == true){
          setImage("player_ritghtattack.png");
          Greenfoot.playSound("attack.wav");
          attack();
        }
       
       //controller untuk menggerakkan player
       if (Greenfoot.isKeyDown("up") == true)
        {
          setImage("player_back.png");
          setLocation(getX(),getY() -4);
        }
        else  if (Greenfoot.isKeyDown("down") == true)
        {
          setImage("player_front.png");
          setLocation(getX(),getY() + 4);
        }
        else  if (Greenfoot.isKeyDown("left") == true)
        {
          setImage("player_left.png");
          setLocation(getX()-4,getY());
        }
         else  if (Greenfoot.isKeyDown("right") == true)
        {
          setImage("player_right.png");
          setLocation(getX()+4,getY());
        }
    }    
    
    //fungsi untuk menyerang
    public void attack(){
        
        Actor Monster;
        Monster = getOneObjectAtOffset(4, 4, Enemy.class);
         
        if (Monster != null){
          
         World Gpworld;
         Gpworld = getWorld();
         Gpworld.removeObject(Monster);
         
         Greenfoot.playSound("mati.wav");

        }
    } 
}
