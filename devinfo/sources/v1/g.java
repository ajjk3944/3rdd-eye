package v1;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends b0 {

    /* renamed from: b, reason: collision with root package name */
    public p1.z f35676b;

    /* renamed from: c, reason: collision with root package name */
    public float f35677c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public List f35678d;

    /* renamed from: e, reason: collision with root package name */
    public float f35679e;

    /* renamed from: f, reason: collision with root package name */
    public float f35680f;
    public p1.z g;

    /* renamed from: h, reason: collision with root package name */
    public int f35681h;

    /* renamed from: i, reason: collision with root package name */
    public int f35682i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f35683k;

    /* renamed from: l, reason: collision with root package name */
    public float f35684l;

    /* renamed from: m, reason: collision with root package name */
    public float f35685m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f35686n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f35687o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35688p;

    /* renamed from: q, reason: collision with root package name */
    public r1.g f35689q;

    /* renamed from: r, reason: collision with root package name */
    public final p1.j f35690r;

    /* renamed from: s, reason: collision with root package name */
    public p1.j f35691s;

    /* renamed from: t, reason: collision with root package name */
    public p1.j f35692t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35693u;

    public g() {
        int i4 = g0.f35694a;
        this.f35678d = zj.s.f38317a;
        this.f35679e = 1.0f;
        this.f35681h = 0;
        this.f35682i = 0;
        this.j = 4.0f;
        this.f35684l = 1.0f;
        this.f35686n = true;
        this.f35687o = true;
        p1.j jVarA = p1.l.a();
        this.f35690r = jVarA;
        this.f35691s = jVarA;
        this.f35693u = a.a.t(yj.g.f37636b, f.f35665b);
    }

    @Override // v1.b0
    public final void a(r1.d dVar) {
        r1.d dVar2;
        r1.g gVar;
        if (this.f35686n) {
            b.d(this.f35678d, this.f35690r);
            e();
        } else if (this.f35688p) {
            e();
        }
        this.f35686n = false;
        this.f35688p = false;
        p1.z zVar = this.f35676b;
        if (zVar != null) {
            dVar2 = dVar;
            je.u.f(dVar2, this.f35691s, zVar, this.f35677c, null, 56);
        } else {
            dVar2 = dVar;
        }
        p1.z zVar2 = this.g;
        if (zVar2 != null) {
            r1.g gVar2 = this.f35689q;
            if (this.f35687o || gVar2 == null) {
                r1.g gVar3 = new r1.g(this.f35680f, this.j, this.f35681h, this.f35682i, 16);
                this.f35689q = gVar3;
                this.f35687o = false;
                gVar = gVar3;
            } else {
                gVar = gVar2;
            }
            je.u.f(dVar2, this.f35691s, zVar2, this.f35679e, gVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yj.f] */
    public final void e() {
        float f10 = this.f35683k;
        p1.j jVar = this.f35690r;
        if (f10 == 0.0f && this.f35684l == 1.0f) {
            this.f35691s = jVar;
            return;
        }
        if (nk.k.a(this.f35691s, jVar)) {
            this.f35691s = p1.l.a();
        } else {
            Path.FillType fillType = this.f35691s.f30986a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z3 = fillType == fillType2;
            this.f35691s.f30986a.rewind();
            Path path = this.f35691s.f30986a;
            if (!z3) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f35693u;
        ((p1.k) r02.getValue()).f30989a.setPath(jVar != null ? jVar.f30986a : null, false);
        float length = ((p1.k) r02.getValue()).f30989a.getLength();
        float f11 = this.f35683k;
        float f12 = this.f35685m;
        float f13 = ((f11 + f12) % 1.0f) * length;
        float f14 = ((this.f35684l + f12) % 1.0f) * length;
        if (f13 <= f14) {
            ((p1.k) r02.getValue()).a(f13, f14, this.f35691s);
            return;
        }
        p1.j jVarA = this.f35692t;
        if (jVarA == null) {
            jVarA = p1.l.a();
            this.f35692t = jVarA;
        }
        jVarA.c();
        ((p1.k) r02.getValue()).a(f13, length, jVarA);
        je.u.b(this.f35691s, jVarA);
        jVarA.c();
        ((p1.k) r02.getValue()).a(0.0f, f14, jVarA);
        je.u.b(this.f35691s, jVarA);
    }

    public final String toString() {
        return this.f35690r.toString();
    }
}
