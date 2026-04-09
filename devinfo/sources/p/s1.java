package p;

import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class s1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f30853a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30855c;

    /* renamed from: d, reason: collision with root package name */
    public final View f30856d;

    /* renamed from: e, reason: collision with root package name */
    public r1 f30857e;

    /* renamed from: f, reason: collision with root package name */
    public r1 f30858f;
    public boolean g;

    /* renamed from: h, reason: collision with root package name */
    public int f30859h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f30860i = new int[2];

    public s1(View view) {
        this.f30856d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f30853a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f30854b = tapTimeout;
        this.f30855c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        r1 r1Var = this.f30858f;
        View view = this.f30856d;
        if (r1Var != null) {
            view.removeCallbacks(r1Var);
        }
        r1 r1Var2 = this.f30857e;
        if (r1Var2 != null) {
            view.removeCallbacks(r1Var2);
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
        throw new UnsupportedOperationException("Method not decompiled: p.s1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.g = false;
        this.f30859h = -1;
        r1 r1Var = this.f30857e;
        if (r1Var != null) {
            this.f30856d.removeCallbacks(r1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
