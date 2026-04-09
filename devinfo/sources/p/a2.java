package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b2 f30612a;

    public a2(b2 b2Var) {
        this.f30612a = b2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        b2 b2Var = this.f30612a;
        y1 y1Var = b2Var.f30646r;
        Handler handler = b2Var.f30650v;
        y yVar = b2Var.f30654z;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && yVar != null && yVar.isShowing() && x10 >= 0 && x10 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
            handler.postDelayed(y1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(y1Var);
        return false;
    }
}
