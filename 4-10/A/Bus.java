package mypack;

public class Bus extends Vehicle implements Stopable{
  public Bus(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("�o�X�̏�q�F" + crewNum + "��");
  }
  public void stop(){
    System.out.println("���~�܂�܂�");
  }

}
