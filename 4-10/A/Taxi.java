package mypack;

public class Taxi extends Vehicle implements Stopable{
  public Taxi(int crewNum){
    this.crewNum = crewNum;
  }
  public void showCrewNum(){
    System.out.println("�^�N�V�[�̏�q�F" + crewNum + "��");
  }
  public void stop(){
    System.out.println("�����ō~��܂�");
  }
}
