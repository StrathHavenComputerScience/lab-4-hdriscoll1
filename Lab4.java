public class Lab4
{
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }
  
  public static void turnAround()
  {
    Robot.turnLeft();
    Robot.turnLeft();
  }

  public static void backUp()
  {
    turnAround();
    Robot.move();
    turnAround();
  }
  public static void oneRow()
  { while (!Robot.onDark())
      { Robot.move();
        }
    turnAround();
    while (Robot.frontIsClear())
    {Robot.move();
     Robot.makeDark();
    }
    Robot.turnLeft();
    
    }
 
  public static void senseRow()
  { while (Robot.frontIsClear())
      { 
          Robot.move();
        Robot.turnLeft();
        oneRow();
        }
    
    }
  public static void completeBars()
  {
    Robot.turnLeft();
    oneRow();
    senseRow();
    
    
    

    
    
  }
  
  public static void testCompleteBars1()
  {
    Robot.load("bars1.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void testCompleteBars2()
  {
    Robot.load("bars2.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void combinePiles()
  {
    
      senseBlock();
   
    
  }
  
  public static void moveOneBlock()
  { 
    
    Robot.makeLight();
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();
    while (Robot.onDark())
    { Robot.move();
    }
    Robot.makeDark();
    Robot.turnLeft();
    Robot.move();
    Robot.turnLeft();
    
}

public static void senseBlock()
{ while (Robot.frontIsClear())
    {Robot.move();
    }
    turnAround();
  while (Robot.frontIsClear())
  {
      
    if (Robot.onDark())
    { moveOneBlock();
      
    }
    Robot.move();
    if (Robot.onDark())
    { moveOneBlock();
    }
    }
  
}


  public static void testCombinePiles1()
  {
    Robot.load("piles1.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void testCombinePiles2()
  {
    Robot.load("piles2.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static boolean dotOnLeft()
  { Robot.turnLeft();
    Robot.move();
    Robot.move();
    if (Robot.onDark())
    { turnAround();
      Robot.move();
      Robot.move();
      Robot.turnLeft();
      return true;
    }
    else
    { turnAround();
      Robot.move();
      Robot.move();
      Robot.turnLeft();
      return false;
    }
    }
    public static boolean dotOnRight()
  { turnRight();
    Robot.move();
    Robot.move();
    if (Robot.onDark())
    { turnAround();
      Robot.move();
      Robot.move();
      turnRight();
      return true;
    }
    else
    { turnAround();
      Robot.move();
      Robot.move();
      turnRight();
      return false;
    }
    }
    public static boolean dotAhead()
  { 
    Robot.move();
    Robot.move();
    if (Robot.onDark())
    { turnAround();
      Robot.move();
      Robot.move();
      turnAround();
      return true;
    }
    else
    { turnAround();
      Robot.move();
      Robot.move();
      turnAround();
      return false;
    }
    }
  public static void oneDot()
  { 
    if (dotOnLeft())
    { Robot.turnLeft();
      Robot.move();
      Robot.makeDark();
      Robot.move();
      
    }
    else
    {  if (dotOnRight())
            { turnRight();
              Robot.move();
              Robot.makeDark();
              Robot.move();
              
            }
                else
                { if (dotAhead())
                    {Robot.move();
                  Robot.makeDark();
                  Robot.move();
                }
                else
                { Robot.move();
                }
                }
    }
    }
 
  public static void connectDots()
  {
    while (Robot.onDark())
    {
        oneDot();

    }
    
  }
  
  public static void testConnectDots1()
  {
    Robot.load("connect1.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
  
  public static void testConnectDots2()
  {
    Robot.load("connect2.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
}
