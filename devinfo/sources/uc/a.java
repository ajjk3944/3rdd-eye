package uc;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f35287a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35289c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35290d;

    public a(Dialog dialog, Rect rect) {
        this.f35287a = dialog;
        this.f35288b = rect.left;
        this.f35289c = rect.top;
        this.f35290d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f35288b;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.f35289c, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i4 = this.f35290d;
            motionEventObtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f35287a.onTouchEvent(motionEventObtain);
    }
}
