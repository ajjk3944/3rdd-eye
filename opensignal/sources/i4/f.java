package i4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import com.google.android.gms.internal.measurement.y3;
import ee.v;
import java.util.ArrayList;
import t7.n;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: p, reason: collision with root package name */
    public static final d f11210p = new d(1);

    /* renamed from: q, reason: collision with root package name */
    public static final d f11211q = new d(2);

    /* renamed from: r, reason: collision with root package name */
    public static final d f11212r = new d(3);

    /* renamed from: s, reason: collision with root package name */
    public static final d f11213s = new d(4);

    /* renamed from: t, reason: collision with root package name */
    public static final d f11214t = new d(5);

    /* renamed from: u, reason: collision with root package name */
    public static final d f11215u = new d(0);

    /* renamed from: d, reason: collision with root package name */
    public final v f11219d;

    /* renamed from: e, reason: collision with root package name */
    public final y3 f11220e;
    public final float j;

    /* renamed from: m, reason: collision with root package name */
    public g f11226m;

    /* renamed from: n, reason: collision with root package name */
    public float f11227n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11228o;

    /* renamed from: a, reason: collision with root package name */
    public float f11216a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f11217b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11218c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11221f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f11222g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final float f11223h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public long f11224i = 0;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f11225l = new ArrayList();

    public f(v vVar, y3 y3Var) {
        this.f11219d = vVar;
        this.f11220e = y3Var;
        if (y3Var == f11212r || y3Var == f11213s || y3Var == f11214t) {
            this.j = 0.1f;
        } else if (y3Var == f11215u) {
            this.j = 0.00390625f;
        } else if (y3Var == f11210p || y3Var == f11211q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.f11226m = null;
        this.f11227n = Float.MAX_VALUE;
        this.f11228o = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f11198i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new b(0, false)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [i4.a, java.lang.Object] */
    public final void a(float f10) {
        if (this.f11221f) {
            this.f11227n = f10;
            return;
        }
        if (this.f11226m == null) {
            this.f11226m = new g(f10);
        }
        g gVar = this.f11226m;
        double d6 = f10;
        gVar.f11237i = d6;
        double d10 = (float) d6;
        if (d10 > this.f11222g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d10 < this.f11223h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        gVar.f11232d = dAbs;
        gVar.f11233e = dAbs * 62.5d;
        b bVar = b().f11203e;
        bVar.getClass();
        if (Thread.currentThread() != ((Looper) bVar.f11197d).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z10 = this.f11221f;
        if (z10 || z10) {
            return;
        }
        this.f11221f = true;
        if (!this.f11218c) {
            this.f11217b = this.f11220e.z(this.f11219d);
        }
        float f11 = this.f11217b;
        if (f11 > this.f11222g || f11 < this.f11223h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c cVarB = b();
        ArrayList arrayList = cVarB.f11200b;
        if (arrayList.size() == 0) {
            ((Choreographer) cVarB.f11203e.f11196a).postFrameCallback(new f7.f(cVarB.f11202d));
            if (Build.VERSION.SDK_INT >= 33) {
                cVarB.f11205g = ValueAnimator.getDurationScale();
                if (cVarB.f11206h == null) {
                    cVarB.f11206h = new bm.e(cVarB);
                }
                final bm.e eVar = cVarB.f11206h;
                if (((a) eVar.f2830d) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: i4.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f12) {
                            ((c) eVar.f2831g).f11205g = f12;
                        }
                    };
                    eVar.f2830d = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f10) {
        this.f11220e.O(this.f11219d, f10);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11225l;
            if (i10 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                ((n) arrayList.get(i10)).getClass();
                throw null;
            }
            i10++;
        }
    }

    public final void d() {
        if (this.f11226m.f11230b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        b bVar = b().f11203e;
        bVar.getClass();
        if (Thread.currentThread() != ((Looper) bVar.f11197d).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f11221f) {
            this.f11228o = true;
        }
    }
}
