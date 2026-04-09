package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import l.InterfaceC6524e;

/* loaded from: classes.dex */
public abstract class N implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f27139a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27140b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27141c;

    /* renamed from: d, reason: collision with root package name */
    final View f27142d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f27143e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f27144f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27145g;

    /* renamed from: h, reason: collision with root package name */
    private int f27146h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f27147i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = N.this.f27142d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            N.this.e();
        }
    }

    public N(View view) {
        this.f27142d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f27139a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f27140b = tapTimeout;
        this.f27141c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f27144f;
        if (runnable != null) {
            this.f27142d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f27143e;
        if (runnable2 != null) {
            this.f27142d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException {
        L l10;
        View view = this.f27142d;
        InterfaceC6524e interfaceC6524eB = b();
        if (interfaceC6524eB == null || !interfaceC6524eB.a() || (l10 = (L) interfaceC6524eB.j()) == null || !l10.isShown()) {
            return false;
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, motionEventObtainNoHistory);
        j(l10, motionEventObtainNoHistory);
        boolean zE = l10.e(motionEventObtainNoHistory, this.f27146h);
        motionEventObtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return zE && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f27142d
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f27146h
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f27139a
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f27146h = r6
            java.lang.Runnable r6 = r5.f27143e
            if (r6 != 0) goto L52
            androidx.appcompat.widget.N$a r6 = new androidx.appcompat.widget.N$a
            r6.<init>()
            r5.f27143e = r6
        L52:
            java.lang.Runnable r6 = r5.f27143e
            int r1 = r5.f27140b
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f27144f
            if (r6 != 0) goto L65
            androidx.appcompat.widget.N$b r6 = new androidx.appcompat.widget.N$b
            r6.<init>()
            r5.f27144f = r6
        L65:
            java.lang.Runnable r6 = r5.f27144f
            int r1 = r5.f27141c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.N.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f27147i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f27147i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract InterfaceC6524e b();

    protected abstract boolean c();

    protected boolean d() {
        InterfaceC6524e interfaceC6524eB = b();
        if (interfaceC6524eB == null || !interfaceC6524eB.a()) {
            return true;
        }
        interfaceC6524eB.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f27142d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f27145g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f27145g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f27142d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f27145g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f27145g = false;
        this.f27146h = -1;
        Runnable runnable = this.f27143e;
        if (runnable != null) {
            this.f27142d.removeCallbacks(runnable);
        }
    }
}
