package p;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class l1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public boolean B;
    public int D;
    public final int[] E = new int[2];

    /* renamed from: a, reason: collision with root package name */
    public final float f20093a;

    /* renamed from: d, reason: collision with root package name */
    public final int f20094d;

    /* renamed from: g, reason: collision with root package name */
    public final int f20095g;

    /* renamed from: r, reason: collision with root package name */
    public final View f20096r;

    /* renamed from: x, reason: collision with root package name */
    public k1 f20097x;

    /* renamed from: y, reason: collision with root package name */
    public k1 f20098y;

    public l1(View view) {
        this.f20096r = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f20093a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f20094d = tapTimeout;
        this.f20095g = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        k1 k1Var = this.f20098y;
        View view = this.f20096r;
        if (k1Var != null) {
            view.removeCallbacks(k1Var);
        }
        k1 k1Var2 = this.f20097x;
        if (k1Var2 != null) {
            view.removeCallbacks(k1Var2);
        }
    }

    public abstract o.c0 b();

    public abstract boolean c();

    public boolean d() {
        o.c0 c0VarB = b();
        if (c0VarB == null || !c0VarB.a()) {
            return true;
        }
        c0VarB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.B = false;
        this.D = -1;
        k1 k1Var = this.f20097x;
        if (k1Var != null) {
            this.f20096r.removeCallbacks(k1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
