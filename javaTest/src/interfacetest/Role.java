package interfacetest;

/**
 * @author zhaohonghong
 * @version 1.0
 * @Description: 角色类
 * @date 2021/6/29 23:34
 */
public class Role {
    FaShiSkill faShiSkill;

    public FaShiSkill getFaShiSkill() {
        return faShiSkill;
    }

    public void setFaShiSkill(FaShiSkill faShiSkill) {
        this.faShiSkill = faShiSkill;
    }

    /**
     * 角色类的法师攻击方法
     */
    public void faShiSkillAttack(){
        System.out.print("发动法术攻击:");
        faShiSkill.faShiAttack();
        System.out.println("攻击完毕");
    }

}
