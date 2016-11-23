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
 * class dunia game
 * 
 * @author (Gun Gun Priatna) 
 * @version (1.0.0-dev)
 */
public class Gpworld extends World
{

    GreenfootSound bg = new GreenfootSound("battle.wav");

    /**
     * Constructor class Gpworld.
     * 
     */
    public Gpworld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Player player = new Player();
        addObject(player,174,290);
        
        Enemy enemy = new Enemy();
        addObject(enemy,753,274);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,524,94);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,514,433);
    }

    public void started() {
      bg.playLoop();
    }


    public void act() {
        //memunculkan musuh kembali secara random
        respawnMusuh();
    }
    
    public void respawnMusuh(){
        if (Greenfoot.getRandomNumber(500) < 3) {
            int y;
            y = Greenfoot.getRandomNumber(448);
            addObject(new Enemy(), 795, y);
        }    
    }
}
