package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class s1 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t1 f20167a;

    public s1(t1 t1Var) {
        this.f20167a = t1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        t1 t1Var = this.f20167a;
        q1 q1Var = t1Var.N;
        Handler handler = t1Var.R;
        v vVar = t1Var.V;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && vVar != null && vVar.isShowing() && x10 >= 0 && x10 < vVar.getWidth() && y10 >= 0 && y10 < vVar.getHeight()) {
            handler.postDelayed(q1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(q1Var);
        return false;
    }
}
