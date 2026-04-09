package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2730a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2731b;

    /* renamed from: c, reason: collision with root package name */
    public final b f2732c;

    /* renamed from: d, reason: collision with root package name */
    public final a f2733d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f2734e;

    /* renamed from: f, reason: collision with root package name */
    public float f2735f;

    /* renamed from: g, reason: collision with root package name */
    public int f2736g;

    /* renamed from: h, reason: collision with root package name */
    public int f2737h;

    /* renamed from: i, reason: collision with root package name */
    public int f2738i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f2739j;

    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public n(Context context, o oVar) {
        this(context, oVar, new b() { // from class: androidx.core.view.l
            @Override // androidx.core.view.n.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                n.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: androidx.core.view.m
            @Override // androidx.core.view.n.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return n.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = c1.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = c1.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        VelocityTrackerCompat.a(velocityTracker, motionEvent);
        VelocityTrackerCompat.b(velocityTracker, 1000);
        return VelocityTrackerCompat.d(velocityTracker, i10);
    }

    public final boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f2737h == source && this.f2738i == deviceId && this.f2736g == i10) {
            return false;
        }
        this.f2732c.a(this.f2730a, this.f2739j, motionEvent, i10);
        this.f2737h = source;
        this.f2738i = deviceId;
        this.f2736g = i10;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i10) {
        if (this.f2734e == null) {
            this.f2734e = VelocityTracker.obtain();
        }
        return this.f2733d.a(this.f2734e, motionEvent, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f2739j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f2734e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2734e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f2731b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f2735f) && fSignum != 0.0f)) {
            this.f2731b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f2739j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f2735f = this.f2731b.a(fMax) ? fMax : 0.0f;
    }

    public n(Context context, o oVar, b bVar, a aVar) {
        this.f2736g = -1;
        this.f2737h = -1;
        this.f2738i = -1;
        this.f2739j = new int[]{Integer.MAX_VALUE, 0};
        this.f2730a = context;
        this.f2731b = oVar;
        this.f2732c = bVar;
        this.f2733d = aVar;
    }
}
