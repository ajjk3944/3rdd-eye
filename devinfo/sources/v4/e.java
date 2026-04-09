package v4;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import ed.y;
import j6.l;
import java.util.ArrayList;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: p, reason: collision with root package name */
    public static final d f35829p = new d(1);

    /* renamed from: q, reason: collision with root package name */
    public static final d f35830q = new d(2);

    /* renamed from: r, reason: collision with root package name */
    public static final d f35831r = new d(3);

    /* renamed from: s, reason: collision with root package name */
    public static final d f35832s = new d(4);

    /* renamed from: t, reason: collision with root package name */
    public static final d f35833t = new d(5);

    /* renamed from: u, reason: collision with root package name */
    public static final d f35834u = new d(0);

    /* renamed from: d, reason: collision with root package name */
    public final y f35838d;

    /* renamed from: e, reason: collision with root package name */
    public final ci.b f35839e;
    public final float j;

    /* renamed from: m, reason: collision with root package name */
    public f f35845m;

    /* renamed from: n, reason: collision with root package name */
    public float f35846n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35847o;

    /* renamed from: a, reason: collision with root package name */
    public float f35835a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f35836b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35837c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f35840f = false;
    public final float g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final float f35841h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public long f35842i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f35843k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f35844l = new ArrayList();

    public e(y yVar, ci.b bVar) {
        this.f35838d = yVar;
        this.f35839e = bVar;
        if (bVar == f35831r || bVar == f35832s || bVar == f35833t) {
            this.j = 0.1f;
        } else if (bVar == f35834u) {
            this.j = 0.00390625f;
        } else if (bVar == f35829p || bVar == f35830q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.f35845m = null;
        this.f35846n = Float.MAX_VALUE;
        this.f35847o = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f35820i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new o(26)));
        }
        return (c) threadLocal.get();
    }

    public final void a(float f10) {
        if (this.f35840f) {
            this.f35846n = f10;
            return;
        }
        if (this.f35845m == null) {
            this.f35845m = new f(f10);
        }
        f fVar = this.f35845m;
        double d10 = f10;
        fVar.f35855i = d10;
        double d11 = (float) d10;
        if (d11 > this.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < this.f35841h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        fVar.f35851d = dAbs;
        fVar.f35852e = dAbs * 62.5d;
        o oVar = b().f35825e;
        oVar.getClass();
        if (Thread.currentThread() != ((Looper) oVar.f28446b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z3 = this.f35840f;
        if (z3 || z3) {
            return;
        }
        this.f35840f = true;
        if (!this.f35837c) {
            this.f35836b = this.f35839e.q(this.f35838d);
        }
        float f11 = this.f35836b;
        if (f11 > this.g || f11 < this.f35841h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        b().a(this);
    }

    public final void c(float f10) {
        this.f35839e.A(this.f35838d, f10);
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f35844l;
            if (i4 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i4) != null) {
                ((l) arrayList.get(i4)).getClass();
                throw null;
            }
            i4++;
        }
    }

    public final void d() {
        if (this.f35845m.f35849b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        o oVar = b().f35825e;
        oVar.getClass();
        if (Thread.currentThread() != ((Looper) oVar.f28446b).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f35840f) {
            this.f35847o = true;
        }
    }
}
