package p;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y2 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f30910a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f30911b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f30912c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f30913d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30915f;

    public y2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f30914e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f30911b = rect3;
        Rect rect4 = new Rect();
        this.f30913d = rect4;
        Rect rect5 = new Rect();
        this.f30912c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f30910a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z10 = this.f30915f;
                if (z10 && !this.f30913d.contains(x10, y10)) {
                    z11 = z10;
                    z3 = false;
                }
            } else {
                if (action == 3) {
                    z10 = this.f30915f;
                    this.f30915f = false;
                }
                z3 = true;
                z11 = false;
            }
            z11 = z10;
            z3 = true;
        } else if (this.f30911b.contains(x10, y10)) {
            this.f30915f = true;
            z3 = true;
        } else {
            z3 = true;
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        Rect rect = this.f30912c;
        View view = this.f30910a;
        if (!z3 || rect.contains(x10, y10)) {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
