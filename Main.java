class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree ( );
        tree2 = new Tree ("maple","broadleaf", true, "red");


    private String treeName;
    //oak, maple, spruce
    private char treeType;
    //confifer or broadleaf
    private boolean leavesFall;
    //loses its leaves
    private char leafColor;
    //current leaf color: green, red, orange, yellow, brown, none

    Tree (); {
        name = " ";
        type = " ";
        leaves = false;
        color = " ";
    }

    Tree (aName, aType, aLeaves, aColor); {
      name = aName;
      type = aType;
      leaves = aLeaves;
      color = aColor;
    }

    type getName()
    type getType()
    type getColor()
    type getLeafLoss()
    type setType()
    type setLeafLoss()
    type setColor()
    type setName()
    //don't know what to name the method types 

    System.out.print ("This is a" + treeName + "It is a" + treeType + "its leaves are currently" + leafColor + " It " + leavesFall + " lose its leaves for the winter.");


  }
}