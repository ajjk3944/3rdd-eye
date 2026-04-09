package m1;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public g1.f0 f16178b;

    /* renamed from: c, reason: collision with root package name */
    public float f16179c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f16180d;

    /* renamed from: e, reason: collision with root package name */
    public float f16181e;

    /* renamed from: f, reason: collision with root package name */
    public float f16182f;

    /* renamed from: g, reason: collision with root package name */
    public g1.f0 f16183g;

    /* renamed from: h, reason: collision with root package name */
    public int f16184h;

    /* renamed from: i, reason: collision with root package name */
    public int f16185i;
    public float j;
    public float k;

    /* renamed from: l, reason: collision with root package name */
    public float f16186l;

    /* renamed from: m, reason: collision with root package name */
    public float f16187m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16188n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16189o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16190p;

    /* renamed from: q, reason: collision with root package name */
    public i1.g f16191q;

    /* renamed from: r, reason: collision with root package name */
    public final g1.i f16192r;

    /* renamed from: s, reason: collision with root package name */
    public g1.i f16193s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f16194t;

    public f() {
        int i10 = f0.f16195a;
        this.f16180d = mq.w.f16945a;
        this.f16181e = 1.0f;
        this.f16184h = 0;
        this.f16185i = 0;
        this.j = 4.0f;
        this.f16186l = 1.0f;
        this.f16188n = true;
        this.f16189o = true;
        g1.i iVarA = g1.l.a();
        this.f16192r = iVarA;
        this.f16193s = iVarA;
        this.f16194t = kc.f.E(lq.j.NONE, e.f16169g);
    }

    @Override // m1.a0
    public final void a(i1.d dVar) {
        i1.d dVar2;
        i1.g gVar;
        if (this.f16188n) {
            a.c(this.f16180d, this.f16192r);
            e();
        } else if (this.f16190p) {
            e();
        }
        this.f16188n = false;
        this.f16190p = false;
        g1.f0 f0Var = this.f16178b;
        if (f0Var != null) {
            dVar2 = dVar;
            i1.d.P(dVar2, this.f16193s, f0Var, this.f16179c, null, 56);
        } else {
            dVar2 = dVar;
        }
        g1.f0 f0Var2 = this.f16183g;
        if (f0Var2 != null) {
            i1.g gVar2 = this.f16191q;
            if (this.f16189o || gVar2 == null) {
                i1.g gVar3 = new i1.g(this.f16182f, this.j, this.f16184h, this.f16185i, 16);
                this.f16191q = gVar3;
                this.f16189o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            i1.d.P(dVar2, this.f16193s, f0Var2, this.f16181e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, lq.h] */
    public final void e() {
        float f10 = this.k;
        g1.i iVar = this.f16192r;
        if (f10 == 0.0f && this.f16186l == 1.0f) {
            this.f16193s = iVar;
            return;
        }
        if (br.l.a(this.f16193s, iVar)) {
            this.f16193s = g1.l.a();
        } else {
            Path.FillType fillType = this.f16193s.f9238a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z10 = fillType == fillType2;
            this.f16193s.f9238a.rewind();
            Path path = this.f16193s.f9238a;
            if (!z10) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f16194t;
        ((g1.j) r02.getValue()).f9241a.setPath(iVar != null ? iVar.f9238a : null, false);
        float length = ((g1.j) r02.getValue()).f9241a.getLength();
        float f11 = this.k;
        float f12 = this.f16187m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f16186l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((g1.j) r02.getValue()).a(f13, f14, this.f16193s);
        } else {
            ((g1.j) r02.getValue()).a(f13, length, this.f16193s);
            ((g1.j) r02.getValue()).a(0.0f, f14, this.f16193s);
        }
    }

    public final String toString() {
        return this.f16192r.toString();
    }
}
