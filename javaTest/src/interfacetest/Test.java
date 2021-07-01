package interfacetest;

/**
 * @author zhaohonghong
 * @version 1.0
 * @Description: interface作为成员变量测试类
 * @date 2021/6/29 23:42
 */
public class Test {
     public static void main(String[] args) {

         //创建角色对象
         Role role = new Role();
         //设置角色法术技能  此处是用了匿名内部类的创建方法
         role.setFaShiSkill(new FaShiSkill() {
             @Override
             public void faShiAttack() {
                 System.out.println("纵横天下");
             }
         });

         //调用法师攻击方法
         role.faShiSkillAttack();

         //换个对象
         role.setFaShiSkill(new FaShiSkill() {
             @Override
             public void faShiAttack() {
                 System.out.println("biu~biu~biu~biu");
             }
         });


         role.faShiSkillAttack();
    }

}
