package com.hollywood.idgenerator;

/**
 * 
 * @author andy
 *
 */
public class Id
{ 
  private static int id = 1;

  private Id()
  {
    // empty
  }
  
  /**
   * 
   * @return
   */
  public static int get()
  {
    return id++;
  }

}
