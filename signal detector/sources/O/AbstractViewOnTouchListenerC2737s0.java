package o;

import android.view.View;
import android.view.ViewConfiguration;
import n.InterfaceC2664A;

/* renamed from: o.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC2737s0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f22627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22629c;

    /* renamed from: d, reason: collision with root package name */
    public final View f22630d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC2735r0 f22631e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC2735r0 f22632f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22633g;

    /* renamed from: h, reason: collision with root package name */
    public int f22634h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC2737s0(View view) {
        this.f22630d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f22627a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f22628b = tapTimeout;
        this.f22629c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC2735r0 runnableC2735r0 = this.f22632f;
        View view = this.f22630d;
        if (runnableC2735r0 != null) {
            view.removeCallbacks(runnableC2735r0);
        }
        RunnableC2735r0 runnableC2735r02 = this.f22631e;
        if (runnableC2735r02 != null) {
            view.removeCallbacks(runnableC2735r02);
        }
    }

    public abstract InterfaceC2664A b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC2664A interfaceC2664AB = b();
        if (interfaceC2664AB == null || !interfaceC2664AB.a()) {
            return true;
        }
        interfaceC2664AB.dismiss();
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
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractViewOnTouchListenerC2737s0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f22633g = false;
        this.f22634h = -1;
        RunnableC2735r0 runnableC2735r0 = this.f22631e;
        if (runnableC2735r0 != null) {
            this.f22630d.removeCallbacks(runnableC2735r0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
