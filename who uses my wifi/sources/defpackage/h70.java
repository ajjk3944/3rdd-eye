package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h70 implements View.OnTouchListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ h70(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f) {
            case 0:
                i70 i70Var = (i70) this.g;
                f70 f70Var = i70Var.w;
                Handler handler = i70Var.A;
                r6 r6Var = i70Var.E;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && r6Var != null && r6Var.isShowing() && x >= 0 && x < r6Var.getWidth() && y >= 0 && y < r6Var.getHeight()) {
                    handler.postDelayed(f70Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(f70Var);
                    break;
                }
                break;
            case 1:
                if (((Checkable) view).isChecked()) {
                    break;
                }
                break;
            default:
                ou2 ou2Var = (ou2) this.g;
                if (((Boolean) tw1.e.c.a(mz1.Pa)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
                    ou2Var.r.a = motionEvent;
                }
                ou2Var.j.b = true;
                if (view != 0) {
                    view.performClick();
                    break;
                }
                break;
        }
        return false;
    }
}
