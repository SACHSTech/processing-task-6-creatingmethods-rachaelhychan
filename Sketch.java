import processing.core.PApplet;

public class Sketch extends PApplet {
	
    /**
     * Location Changing Flower and Location Changing, Colour Changing, and Centering House Drawing
     * @author: Rachael Chan
     */

    public void settings() {
        // put your size call here
        size(400, 400);
    }

    /** 
     * Called once at the beginning of execution.  Add initial set up
     * values here i.e background, stroke, fill etc.
     */
    public void setup() {
      background(210, 255, 173);
    }

    public void draw() {

        int intWidthOfTheHouse;
        int intHeightOfTheHouse;
        
        intWidthOfTheHouse = 242;
        intHeightOfTheHouse = 185;

        // Call the method drawHouseWithColorRGB to draw a Red House
        drawHouseWithColorRGB(140, 40, 255, 0, 0);

        // Call the method drawHouseWithColorRGB to draw a Green House
        drawHouseWithColorRGB(30, 200, 0, 255, 0);

        // Call the method drawHouseWithColorRGB to draw a Blue House
        drawHouseWithColorRGB(180, 180, 0, 0, 255);

        // Call the method getHorticalCenterOfHouse and getVerticalCenterOfHouse to get the 
        // center of canvas and drawHouseWithColorRGB to draw a White House
        drawHouseWithColorRGB(getHorizontalCenterOfHouse(intWidthOfTheHouse), getVerticalCenterOfHouse(intHeightOfTheHouse), 255, 255, 255);

        // Call the method drawFlower to draw a flower at the left top corner
        drawFlower(0, 0);

        // Call the method drawFlower to draw a flower at the right top corner
        drawFlower(width, 0);

        // Call the method drawFlower to draw a flower at the left bottom corner
        drawFlower(0, height);

        // Call the method drawFlower to draw a flower at the right bottom corner
        drawFlower(width, height);

        // Call the method drawFlower to draw a flower at the center
        drawFlower(width / 2, height / 2);

    }

    /**
    * Allows for input of location
    *
    * @param intX  x-coordinate location of flower
    * @param intY  y-coordinate location of flower
    * @return none
    *
    */
    public void drawFlower(int intX, int intY) {
        // Define a variable for the number of Petal
        int intPetalNum;

        // Set Colour of Stroke to Black
        stroke(0);

        // Use Translate Function to Move Origin to the X and Y coordinate from the input parameters
        translate(intX, intY);

        // Create the Eight Petals of the Flower
        for(intPetalNum = 1; intPetalNum <= 8; intPetalNum ++) {
            rotate(radians(45));
            fill(230, 120, 0);
            ellipse(0, -27, 16, 80);
        }

        // Create Center of the Flower
        fill(0, 77, 13);
        stroke(0, 77, 13);
        ellipse(0, 0, 36, 36);

        // Move Origin Back to the original location
        translate(-intX, -intY);
    }

    /**
    * Allows for input of location and colour using RGB
    *
    * @param intX  x-coordinate location of house
    * @param intY  y-coordinate location of house
    * @param intRColor red colour for RGB
    * @param intGColor green colour for RGB
    * @param intBColor blue colour for RBG
    * @return none
    *
    */
    public void drawHouseWithColorRGB(int intX, int intY, int intRColor, int intGColor, int intBColor) {

        // set the color with the input RGB parameters                        
        fill(intRColor, intGColor, intBColor);
                          
        // Triangle Roof
        triangle((float) 64 + intX, (float) 9 + intY, (float) intX, (float) 89 + intY, (float) 108 + intX, (float) 89 + intY);

        // Side Roof
        quad((float) 64 + intX, (float) 9 + intY, (float) 108 + intX, (float) 89 + intY, (float) 241 + intX, (float) 74 + intY, (float) 200 + intX, (float) intY);

        // Right Wall
        quad((float) 108 + intX, (float) 89 + intY, (float) 108 + intX, (float) 187 + intY, (float) 241 + intX, (float) 162 + intY, (float) 241 + intX, (float) 74 + intY);

        // Left Wall
        quad((float) intX, (float) 89 + intY, (float) 108 + intX, (float) 89 + intY, (float) 108 + intX, (float) 187 + intY, (float) intX, (float) 187 + intY);

        // Door
        quad((float) 35 + intX, (float) 132 + intY, (float) 65 + intX, (float) 132 + intY, (float) 65 + intX, (float) 187 + intY, (float) 35 + intX, (float) 187 + intY);
    }

    /**
    * Given the Width of the House, return the horizontal center
    *
    * @param intWidthOfHouse  The Width of the House
    * @return the horizontal center
    *
    */
    public int getHorizontalCenterOfHouse (int intWidthOfHouse) {
        // calculate the Horizontal center 
        return ((width - intWidthOfHouse) / 2);
    }

    /**
    * Given the height of the House, return the vertical center
    *
    * @param intHeightOfHouse  The Height of the House
    * @return the vertical center
    *
    */
    public int getVerticalCenterOfHouse (int intHeightOfHouse) {
        return ((height - intHeightOfHouse) / 2);
    }

}