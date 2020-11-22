package framework.Shooting_Game;

import framework.gameframework.AppManager;
import framework.gameframework.R;

public class Item_Hp  extends Item{

    //목숨 늘려주는 아이템
    public Item_Hp(){//★★★★
        super(AppManager.getInstance().getBitmap(R.drawable.item1));
        this.initSpriteData(m_bitmap.getWidth()/4,m_bitmap.getHeight(),2,4);
        speed= 15f;
    }
    @Override
    public void Update(long GameTime){
        super.Update(GameTime);
    }

    @Override
    public void useItem(Player p) {
        super.useItem(p);
        p.addLife();
    }
}