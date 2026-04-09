package e0;

import A0.i;
import V2.h;
import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import h0.C2351a;
import java.util.ArrayList;

/* renamed from: e0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2297e {

    /* renamed from: n, reason: collision with root package name */
    public static final C2295c f19869n = new C2295c(1);

    /* renamed from: o, reason: collision with root package name */
    public static final C2295c f19870o = new C2295c(2);

    /* renamed from: p, reason: collision with root package name */
    public static final C2295c f19871p = new C2295c(3);

    /* renamed from: q, reason: collision with root package name */
    public static final C2295c f19872q = new C2295c(4);

    /* renamed from: r, reason: collision with root package name */
    public static final C2295c f19873r = new C2295c(5);

    /* renamed from: s, reason: collision with root package name */
    public static final C2295c f19874s = new C2295c(0);

    /* renamed from: d, reason: collision with root package name */
    public final Object f19878d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.c f19879e;

    /* renamed from: h, reason: collision with root package name */
    public final float f19882h;

    /* renamed from: k, reason: collision with root package name */
    public f f19884k;

    /* renamed from: l, reason: collision with root package name */
    public float f19885l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19886m;

    /* renamed from: a, reason: collision with root package name */
    public float f19875a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f19876b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19877c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19880f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f19881g = 0;
    public final ArrayList i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f19883j = new ArrayList();

    public C2297e(Object obj, com.bumptech.glide.c cVar) {
        this.f19878d = obj;
        this.f19879e = cVar;
        if (cVar == f19871p || cVar == f19872q || cVar == f19873r) {
            this.f19882h = 0.1f;
        } else if (cVar == f19874s) {
            this.f19882h = 0.00390625f;
        } else if (cVar == f19869n || cVar == f19870o) {
            this.f19882h = 0.002f;
        } else {
            this.f19882h = 1.0f;
        }
        this.f19884k = null;
        this.f19885l = Float.MAX_VALUE;
        this.f19886m = false;
    }

    public static C2294b b() {
        ThreadLocal threadLocal = C2294b.i;
        if (threadLocal.get() == null) {
            threadLocal.set(new C2294b(new h(19)));
        }
        return (C2294b) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [e0.a, java.lang.Object] */
    public final void a(float f2) {
        if (this.f19880f) {
            this.f19885l = f2;
            return;
        }
        if (this.f19884k == null) {
            this.f19884k = new f(f2);
        }
        f fVar = this.f19884k;
        double d6 = f2;
        fVar.i = d6;
        double d7 = (float) d6;
        if (d7 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d7 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f19882h * 0.75f);
        fVar.f19890d = dAbs;
        fVar.f19891e = dAbs * 62.5d;
        h hVar = b().f19862e;
        hVar.getClass();
        if (Thread.currentThread() != ((Looper) hVar.f3876c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z6 = this.f19880f;
        if (z6 || z6) {
            return;
        }
        this.f19880f = true;
        if (!this.f19877c) {
            this.f19876b = this.f19879e.A(this.f19878d);
        }
        float f5 = this.f19876b;
        if (f5 > Float.MAX_VALUE || f5 < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        C2294b c2294bB = b();
        ArrayList arrayList = c2294bB.f19859b;
        if (arrayList.size() == 0) {
            ((Choreographer) c2294bB.f19862e.f3875b).postFrameCallback(new i(1, c2294bB.f19861d));
            if (Build.VERSION.SDK_INT >= 33) {
                c2294bB.f19864g = ValueAnimator.getDurationScale();
                if (c2294bB.f19865h == null) {
                    c2294bB.f19865h = new C2351a(21, c2294bB);
                }
                final C2351a c2351a = c2294bB.f19865h;
                if (((C2293a) c2351a.f20441b) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: e0.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f6) {
                            ((C2294b) c2351a.f20442c).f19864g = f6;
                        }
                    };
                    c2351a.f20441b = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f2) {
        this.f19879e.L(this.f19878d, f2);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f19883j;
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
        if (this.f19884k.f19888b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        h hVar = b().f19862e;
        hVar.getClass();
        if (Thread.currentThread() != ((Looper) hVar.f3876c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f19880f) {
            this.f19886m = true;
        }
    }
}
