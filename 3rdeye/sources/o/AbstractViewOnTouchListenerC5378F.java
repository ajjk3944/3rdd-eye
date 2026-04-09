package o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import n.InterfaceC5344f;

/* compiled from: ForwardingListener.java */
/* renamed from: o.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC5378F implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f44517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44518c;

    /* renamed from: d, reason: collision with root package name */
    public final int f44519d;

    /* renamed from: e, reason: collision with root package name */
    public final View f44520e;

    /* renamed from: f, reason: collision with root package name */
    public a f44521f;

    /* renamed from: g, reason: collision with root package name */
    public b f44522g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44523h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f44524j = new int[2];

    /* compiled from: ForwardingListener.java */
    /* renamed from: o.F$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = AbstractViewOnTouchListenerC5378F.this.f44520e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* renamed from: o.F$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC5378F abstractViewOnTouchListenerC5378F = AbstractViewOnTouchListenerC5378F.this;
            abstractViewOnTouchListenerC5378F.a();
            View view = abstractViewOnTouchListenerC5378F.f44520e;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC5378F.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                abstractViewOnTouchListenerC5378F.f44523h = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC5378F(View view) {
        this.f44520e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f44517b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f44518c = tapTimeout;
        this.f44519d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f44522g;
        View view = this.f44520e;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f44521f;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract InterfaceC5344f b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC5344f interfaceC5344fB = b();
        if (interfaceC5344fB == null || !interfaceC5344fB.a()) {
            return true;
        }
        interfaceC5344fB.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractViewOnTouchListenerC5378F.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f44523h = false;
        this.i = -1;
        a aVar = this.f44521f;
        if (aVar != null) {
            this.f44520e.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
