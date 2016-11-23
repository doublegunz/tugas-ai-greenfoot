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
 * Class Enemy
 * 
 * @author (Gun Gun Priatna) 
 * @version (1.0.0-dev)
 */
public class Enemy extends Actor
{
 
     /**
     * 
     * Enemy bergerak acak
     */
    public void act() {
        move (3) ;  
       
       if (Greenfoot.getRandomNumber (50) < 10) {  
         turn (Greenfoot.getRandomNumber (50) - 20) ;  
       }   
       
       if (getX () <= 5 || getX() >= getWorld().getWidth () - 5) {  
           turn (60) ;  
       }
       
       if (getY () <= 5 || getY() >= getWorld().getHeight () - 5) {  
         turn (60) ;  
       } 
    }    
}
