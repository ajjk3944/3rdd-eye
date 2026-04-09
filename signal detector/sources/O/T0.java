package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class T0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f22423a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f22424b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f22425c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f22426d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22427e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22428f;

    public T0(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f22427e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f22424b = rect3;
        Rect rect4 = new Rect();
        this.f22426d = rect4;
        Rect rect5 = new Rect();
        this.f22425c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f22423a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z6;
        boolean z7;
        int x6 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z7 = this.f22428f;
                if (z7 && !this.f22426d.contains(x6, y3)) {
                    z8 = z7;
                    z6 = false;
                }
            } else {
                if (action == 3) {
                    z7 = this.f22428f;
                    this.f22428f = false;
                }
                z6 = true;
                z8 = false;
            }
            z8 = z7;
            z6 = true;
        } else if (this.f22424b.contains(x6, y3)) {
            this.f22428f = true;
            z6 = true;
        } else {
            z6 = true;
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        Rect rect = this.f22425c;
        View view = this.f22423a;
        if (!z6 || rect.contains(x6, y3)) {
            motionEvent.setLocation(x6 - rect.left, y3 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
