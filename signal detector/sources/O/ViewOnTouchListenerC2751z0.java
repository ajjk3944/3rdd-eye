package o;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: o.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2751z0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f22663a;

    public ViewOnTouchListenerC2751z0(A0 a02) {
        this.f22663a = a02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C2746x c2746x;
        A0 a02 = this.f22663a;
        RunnableC2747x0 runnableC2747x0 = a02.f22340F;
        Handler handler = a02.f22344J;
        int action = motionEvent.getAction();
        int x6 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (action == 0 && (c2746x = a02.f22347N) != null && c2746x.isShowing() && x6 >= 0 && x6 < a02.f22347N.getWidth() && y3 >= 0 && y3 < a02.f22347N.getHeight()) {
            handler.postDelayed(runnableC2747x0, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(runnableC2747x0);
        return false;
    }
}
