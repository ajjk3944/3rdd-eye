package ht;

/* loaded from: classes.dex */
public final class u extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final rr.r0[] f10945b;

    /* renamed from: c, reason: collision with root package name */
    public final p0[] f10946c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10947d;

    public u(rr.r0[] r0VarArr, p0[] p0VarArr, boolean z10) {
        br.l.e(r0VarArr, "parameters");
        br.l.e(p0VarArr, "arguments");
        this.f10945b = r0VarArr;
        this.f10946c = p0VarArr;
        this.f10947d = z10;
    }

    @Override // ht.s0
    public final boolean b() {
        return this.f10947d;
    }

    @Override // ht.s0
    public final p0 d(x xVar) {
        rr.i iVarP = xVar.Z().p();
        rr.r0 r0Var = iVarP instanceof rr.r0 ? (rr.r0) iVarP : null;
        if (r0Var != null) {
            int index = r0Var.getIndex();
            rr.r0[] r0VarArr = this.f10945b;
            if (index < r0VarArr.length && br.l.a(r0VarArr[index].v(), r0Var.v())) {
                return this.f10946c[index];
            }
        }
        return null;
    }

    @Override // ht.s0
    public final boolean e() {
        return this.f10946c.length == 0;
    }
}
