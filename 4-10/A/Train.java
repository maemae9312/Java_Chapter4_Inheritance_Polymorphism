package mypack;

public class Train extends Vehicle{
  public Train(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("�d�Ԃ̏�q�F" + crewNum + "��");
  }
}
