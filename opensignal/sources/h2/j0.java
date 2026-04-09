package h2;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f9839d;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f9840a;

    /* renamed from: b, reason: collision with root package name */
    public final s f9841b;

    /* renamed from: c, reason: collision with root package name */
    public final v f9842c;

    static {
        long j = g1.r.f9269g;
        long j7 = t2.k.f22394c;
        f9839d = new j0(new c0(j, j7, null, null, null, null, null, j7, null, null, null, j, null, null), new s(Integer.MIN_VALUE, Integer.MIN_VALUE, j7, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public j0(c0 c0Var, s sVar, v vVar) {
        this.f9840a = c0Var;
        this.f9841b = sVar;
        this.f9842c = vVar;
    }

    public static j0 a(j0 j0Var, long j, k2.r rVar, k2.h hVar, long j7, long j10, v vVar, r2.i iVar, int i10) {
        long jB = j0Var.f9840a.f9787a.b();
        long j11 = (i10 & 2) != 0 ? j0Var.f9840a.f9788b : j;
        k2.r rVar2 = (i10 & 4) != 0 ? j0Var.f9840a.f9789c : rVar;
        c0 c0Var = j0Var.f9840a;
        k2.n nVar = c0Var.f9790d;
        k2.o oVar = c0Var.f9791e;
        k2.h hVar2 = (i10 & 32) != 0 ? c0Var.f9792f : hVar;
        String str = c0Var.f9793g;
        long j12 = (i10 & 128) != 0 ? c0Var.f9794h : j7;
        r2.a aVar = c0Var.f9795i;
        r2.p pVar = c0Var.j;
        n2.b bVar = c0Var.k;
        long j13 = c0Var.f9796l;
        r2.l lVar = c0Var.f9797m;
        g1.h0 h0Var = c0Var.f9798n;
        i1.c cVar = c0Var.f9799o;
        s sVar = j0Var.f9841b;
        int i11 = sVar.f9869a;
        int i12 = sVar.f9870b;
        long j14 = (i10 & 131072) != 0 ? sVar.f9871c : j10;
        r2.q qVar = sVar.f9872d;
        v vVar2 = (i10 & 524288) != 0 ? j0Var.f9842c : vVar;
        return new j0(new c0(g1.r.c(jB, c0Var.f9787a.b()) ? c0Var.f9787a : jB != 16 ? new r2.c(jB) : r2.n.f21212a, j11, rVar2, nVar, oVar, hVar2, str, j12, aVar, pVar, bVar, j13, lVar, h0Var, cVar), new s(i11, i12, j14, qVar, vVar2 != null ? vVar2.f9881a : null, (i10 & 1048576) != 0 ? sVar.f9874f : iVar, sVar.f9875g, sVar.f9876h, sVar.f9877i), vVar2);
    }

    public static j0 d(j0 j0Var, long j, long j7, k2.r rVar, k2.h hVar, long j10, int i10, long j11, int i11) {
        long j12 = (i11 & 1) != 0 ? g1.r.f9269g : j;
        long j13 = (i11 & 2) != 0 ? t2.k.f22394c : j7;
        k2.r rVar2 = (i11 & 4) != 0 ? null : rVar;
        k2.h hVar2 = (i11 & 32) != 0 ? null : hVar;
        long j14 = (i11 & 128) != 0 ? t2.k.f22394c : j10;
        long j15 = g1.r.f9269g;
        int i12 = (32768 & i11) != 0 ? Integer.MIN_VALUE : i10;
        long j16 = (i11 & 131072) != 0 ? t2.k.f22394c : j11;
        c0 c0VarA = d0.a(j0Var.f9840a, j12, null, Float.NaN, j13, rVar2, null, null, hVar2, null, j14, null, null, null, j15, null, null, null);
        s sVarA = t.a(j0Var.f9841b, i12, Integer.MIN_VALUE, j16, null, null, null, 0, Integer.MIN_VALUE, null);
        return (j0Var.f9840a == c0VarA && j0Var.f9841b == sVarA) ? j0Var : new j0(c0VarA, sVarA);
    }

    public final long b() {
        return this.f9840a.f9787a.b();
    }

    public final boolean c(j0 j0Var) {
        if (this != j0Var) {
            return br.l.a(this.f9841b, j0Var.f9841b) && this.f9840a.a(j0Var.f9840a);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return br.l.a(this.f9840a, j0Var.f9840a) && br.l.a(this.f9841b, j0Var.f9841b) && br.l.a(this.f9842c, j0Var.f9842c);
    }

    public final int hashCode() {
        int iHashCode = (this.f9841b.hashCode() + (this.f9840a.hashCode() * 31)) * 31;
        v vVar = this.f9842c;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) g1.r.i(b()));
        sb2.append(", brush=");
        c0 c0Var = this.f9840a;
        sb2.append(c0Var.f9787a.c());
        sb2.append(", alpha=");
        sb2.append(c0Var.f9787a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) t2.k.d(c0Var.f9788b));
        sb2.append(", fontWeight=");
        sb2.append(c0Var.f9789c);
        sb2.append(", fontStyle=");
        sb2.append(c0Var.f9790d);
        sb2.append(", fontSynthesis=");
        sb2.append(c0Var.f9791e);
        sb2.append(", fontFamily=");
        sb2.append(c0Var.f9792f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(c0Var.f9793g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) t2.k.d(c0Var.f9794h));
        sb2.append(", baselineShift=");
        sb2.append(c0Var.f9795i);
        sb2.append(", textGeometricTransform=");
        sb2.append(c0Var.j);
        sb2.append(", localeList=");
        sb2.append(c0Var.k);
        sb2.append(", background=");
        h0.b.A(c0Var.f9796l, ", textDecoration=", sb2);
        sb2.append(c0Var.f9797m);
        sb2.append(", shadow=");
        sb2.append(c0Var.f9798n);
        sb2.append(", drawStyle=");
        sb2.append(c0Var.f9799o);
        sb2.append(", textAlign=");
        s sVar = this.f9841b;
        sb2.append((Object) r2.k.a(sVar.f9869a));
        sb2.append(", textDirection=");
        sb2.append((Object) r2.m.a(sVar.f9870b));
        sb2.append(", lineHeight=");
        sb2.append((Object) t2.k.d(sVar.f9871c));
        sb2.append(", textIndent=");
        sb2.append(sVar.f9872d);
        sb2.append(", platformStyle=");
        sb2.append(this.f9842c);
        sb2.append(", lineHeightStyle=");
        sb2.append(sVar.f9874f);
        sb2.append(", lineBreak=");
        sb2.append((Object) r2.e.a(sVar.f9875g));
        sb2.append(", hyphens=");
        sb2.append((Object) r2.d.a(sVar.f9876h));
        sb2.append(", textMotion=");
        sb2.append(sVar.f9877i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(c0 c0Var, s sVar) {
        c0Var.getClass();
        u uVar = sVar.f9873e;
        this(c0Var, sVar, uVar == null ? null : new v(uVar));
    }
}
