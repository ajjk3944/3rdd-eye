package s;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: s.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7861w {

    /* renamed from: a, reason: collision with root package name */
    private final Context f60782a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60783b;

    /* renamed from: c, reason: collision with root package name */
    private long f60784c = Y0.r.f24545b.a();

    /* renamed from: d, reason: collision with root package name */
    private EdgeEffect f60785d;

    /* renamed from: e, reason: collision with root package name */
    private EdgeEffect f60786e;

    /* renamed from: f, reason: collision with root package name */
    private EdgeEffect f60787f;

    /* renamed from: g, reason: collision with root package name */
    private EdgeEffect f60788g;

    /* renamed from: h, reason: collision with root package name */
    private EdgeEffect f60789h;

    /* renamed from: i, reason: collision with root package name */
    private EdgeEffect f60790i;

    /* renamed from: j, reason: collision with root package name */
    private EdgeEffect f60791j;

    /* renamed from: k, reason: collision with root package name */
    private EdgeEffect f60792k;

    public C7861w(Context context, int i10) {
        this.f60782a = context;
        this.f60783b = i10;
    }

    private final EdgeEffect e() {
        EdgeEffect edgeEffectA = C7860v.f60781a.a(this.f60782a);
        edgeEffectA.setColor(this.f60783b);
        if (!Y0.r.e(this.f60784c, Y0.r.f24545b.a())) {
            edgeEffectA.setSize(Y0.r.g(this.f60784c), Y0.r.f(this.f60784c));
        }
        return edgeEffectA;
    }

    private final boolean n(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean x(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(C7860v.f60781a.b(edgeEffect) == 0.0f);
    }

    public final boolean A() {
        return x(this.f60785d);
    }

    public final void B(long j10) {
        this.f60784c = j10;
        EdgeEffect edgeEffect = this.f60785d;
        if (edgeEffect != null) {
            edgeEffect.setSize(Y0.r.g(j10), Y0.r.f(j10));
        }
        EdgeEffect edgeEffect2 = this.f60786e;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(Y0.r.g(j10), Y0.r.f(j10));
        }
        EdgeEffect edgeEffect3 = this.f60787f;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(Y0.r.f(j10), Y0.r.g(j10));
        }
        EdgeEffect edgeEffect4 = this.f60788g;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(Y0.r.f(j10), Y0.r.g(j10));
        }
        EdgeEffect edgeEffect5 = this.f60789h;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(Y0.r.g(j10), Y0.r.f(j10));
        }
        EdgeEffect edgeEffect6 = this.f60790i;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(Y0.r.g(j10), Y0.r.f(j10));
        }
        EdgeEffect edgeEffect7 = this.f60791j;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(Y0.r.f(j10), Y0.r.g(j10));
        }
        EdgeEffect edgeEffect8 = this.f60792k;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(Y0.r.f(j10), Y0.r.g(j10));
        }
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.f60786e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60786e = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.f60790i;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60790i = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f60787f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60787f = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.f60791j;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60791j = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.f60788g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60788g = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.f60792k;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60792k = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.f60785d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60785d = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.f60789h;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.f60789h = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean o() {
        return n(this.f60786e);
    }

    public final boolean p() {
        return x(this.f60790i);
    }

    public final boolean q() {
        return x(this.f60786e);
    }

    public final boolean r() {
        return n(this.f60787f);
    }

    public final boolean s() {
        return x(this.f60791j);
    }

    public final boolean t() {
        return x(this.f60787f);
    }

    public final boolean u() {
        return n(this.f60788g);
    }

    public final boolean v() {
        return x(this.f60792k);
    }

    public final boolean w() {
        return x(this.f60788g);
    }

    public final boolean y() {
        return n(this.f60785d);
    }

    public final boolean z() {
        return x(this.f60789h);
    }
}
