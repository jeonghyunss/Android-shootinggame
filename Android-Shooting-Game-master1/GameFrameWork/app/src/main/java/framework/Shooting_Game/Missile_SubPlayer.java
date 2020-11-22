package framework.Shooting_Game;

import framework.gameframework.AppManager;
import framework.gameframework.R;

public class Missile_SubPlayer extends Missile {
    public Missile_SubPlayer(int x, int y) {
        super(AppManager.getInstance().getBitmap(R.drawable.missile_3));
        this.setPosition(x,y);
        this.setSpeed(20);
    }
    public void Update(){
        this.setY(getY()-getSpeed());
        if(getY()<0) state = STATE_OUT;
        m_BoundBox.left=getX();
        m_BoundBox.top=getY();
        m_BoundBox.right=getX()+43;
        m_BoundBox.bottom = getY()+43;
    }
}