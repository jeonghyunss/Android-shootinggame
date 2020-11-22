package framework.gameframework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import framework.Shooting_Game.GameState;
import framework.Shooting_Game.Missile_Player;

public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀 없애기
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //풀스크린 실행
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //현재 액티비티 정보 AppManager로 넘기기
        AppManager.getInstance().setMainAct(this);
        //View에 GameView띄우기
        setContentView(new GameView(this));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onPause() {
        super.onPause();
      //  AppManager.getInstance().getGameView().stopGameViewThread();
    }
    //팝업창 띄어서 게임 종료
    @Override
    public void onBackPressed(){
        AlertDialog.Builder alert_ex = new AlertDialog.Builder(this);
        alert_ex.setMessage("게임을 종료하시겠습니까?");
        alert_ex.setPositiveButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alert_ex.setNegativeButton("종료", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                System.exit(0);
            }
        });
        alert_ex.setTitle("게임 종료 안내");
        AlertDialog alert = alert_ex.create();
        alert.show();
    }
}
