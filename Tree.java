class Tree {

  String treeName;
  String treeType;
  String leafColor;
  boolean leavesFall;

  Tree() {
    treeName = "";
    treeType = "";
    leafColor = "";
    leavesFall = false;
  }

  Tree(String tName, String tType, String lColor, boolean lFall) {
    treeName = tName;
    treeType = tType;
    leafColor = lColor;
    leavesFall = lFall;
  }

  void setName(String t){
    treeName = t;
  }

  String getName(){
    return treeName;
  }

  void setType(String t){
    treeType = t;
  }

  String getType(){
    return treeType;
  }

  void setColor(String t){
    leafColor = t;
  }

  String getColor(){
    return leafColor;
  }

  void setFall(boolean t){
    leavesFall = t;
  }

  boolean getFall(){
    return leavesFall;
  }

  void print() {
 
    if(leavesFall == true) {
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does lose its leaves for the winter.");
    } else {
      System.out.println("This is a " + treeName + " tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It does not lose its leaves for the winter.");
    }
    
  }
}