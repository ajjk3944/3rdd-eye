package r3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: r3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2877a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f23396a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23399d;

    public ViewOnTouchListenerC2877a(Dialog dialog, Rect rect) {
        this.f23396a = dialog;
        this.f23397b = rect.left;
        this.f23398c = rect.top;
        this.f23399d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f23397b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f23398c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f23399d;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f23396a.onTouchEvent(motionEventObtain);
    }
}
