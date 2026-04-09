package c0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2420a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2421b;

    /* renamed from: c, reason: collision with root package name */
    public long f2422c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f2423d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f2424e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f2425f;
    public EdgeEffect g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f2426h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f2427i;
    public EdgeEffect j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f2428k;

    public g0(Context context, int i4) {
        this.f2420a = context;
        this.f2421b = i4;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? m.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(d0.a1 a1Var) {
        int i4 = Build.VERSION.SDK_INT;
        Context context = this.f2420a;
        EdgeEffect edgeEffectA = i4 >= 31 ? m.a(context) : new l0(context);
        edgeEffectA.setColor(this.f2421b);
        if (!d3.k.a(this.f2422c, 0L)) {
            if (a1Var == d0.a1.f21662a) {
                long j = this.f2422c;
                edgeEffectA.setSize((int) (j >> 32), (int) (4294967295L & j));
                return edgeEffectA;
            }
            long j8 = this.f2422c;
            edgeEffectA.setSize((int) (4294967295L & j8), (int) (j8 >> 32));
        }
        return edgeEffectA;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f2424e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.a1.f21662a);
        this.f2424e = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f2425f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.a1.f21663b);
        this.f2425f = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.a1.f21663b);
        this.g = edgeEffectA;
        return edgeEffectA;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f2423d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectA = a(d0.a1.f21662a);
        this.f2423d = edgeEffectA;
        return edgeEffectA;
    }
}
