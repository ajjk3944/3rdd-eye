package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nx0 {
    public static final uq n = new uq(1);
    public static final uq o = new uq(2);
    public static final uq p = new uq(3);
    public static final uq q = new uq(4);
    public static final uq r = new uq(5);
    public static final uq s = new uq(0);
    public final Object d;
    public final uk2 e;
    public final float h;
    public ox0 k;
    public float l;
    public boolean m;
    public float a = 0.0f;
    public float b = Float.MAX_VALUE;
    public boolean c = false;
    public boolean f = false;
    public long g = 0;
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();

    public nx0(Object obj, uk2 uk2Var) {
        this.d = obj;
        this.e = uk2Var;
        if (uk2Var == p || uk2Var == q || uk2Var == r) {
            this.h = 0.1f;
        } else if (uk2Var == s) {
            this.h = 0.00390625f;
        } else if (uk2Var == n || uk2Var == o) {
            this.h = 0.002f;
        } else {
            this.h = 1.0f;
        }
        this.k = null;
        this.l = Float.MAX_VALUE;
        this.m = false;
    }

    public static q4 b() {
        ThreadLocal threadLocal = q4.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new q4(new vq2(2)));
        }
        return (q4) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, o4] */
    public final void a(float f) {
        if (this.f) {
            this.l = f;
            return;
        }
        if (this.k == null) {
            this.k = new ox0(f);
        }
        ox0 ox0Var = this.k;
        double d = f;
        ox0Var.i = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.h * 0.75f);
        ox0Var.d = dAbs;
        ox0Var.e = dAbs * 62.5d;
        vq2 vq2Var = b().e;
        vq2Var.getClass();
        if (Thread.currentThread() != ((Looper) vq2Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.f;
        if (z || z) {
            return;
        }
        this.f = true;
        if (!this.c) {
            this.b = this.e.p(this.d);
        }
        float f2 = this.b;
        if (f2 > Float.MAX_VALUE || f2 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        q4 q4VarB = b();
        ArrayList arrayList = q4VarB.b;
        if (arrayList.size() == 0) {
            ((Choreographer) q4VarB.e.g).postFrameCallback(new p4(q4VarB.d));
            if (Build.VERSION.SDK_INT >= 33) {
                q4VarB.g = ValueAnimator.getDurationScale();
                if (q4VarB.h == null) {
                    q4VarB.h = new l92(q4VarB);
                }
                final l92 l92Var = q4VarB.h;
                if (((o4) l92Var.f) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: o4
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f3) {
                            ((q4) l92Var.g).g = f3;
                        }
                    };
                    l92Var.f = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f) {
        this.e.w(this.d, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            }
            i++;
        }
    }

    public final void d() {
        if (this.k.b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        vq2 vq2Var = b().e;
        vq2Var.getClass();
        if (Thread.currentThread() != ((Looper) vq2Var.h).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f) {
            this.m = true;
        }
    }
}
