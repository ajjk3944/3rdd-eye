package ur;

/* loaded from: classes.dex */
public abstract class c0 extends o implements rr.f0 {
    public final String B;

    /* renamed from: y, reason: collision with root package name */
    public final qs.c f23629y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(rr.a0 a0Var, qs.c cVar) {
        super(a0Var, sr.g.f22217a, cVar.g(), rr.o0.f21696s);
        br.l.e(a0Var, "module");
        br.l.e(cVar, "fqName");
        this.f23629y = cVar;
        this.B = "package " + cVar + " of " + a0Var;
    }

    @Override // ur.o, rr.m
    public rr.o0 h() {
        return rr.o0.f21696s;
    }

    @Override // ur.n, androidx.lifecycle.o
    public String toString() {
        return this.B;
    }

    @Override // ur.o, rr.l
    /* renamed from: v1, reason: merged with bridge method [inline-methods] */
    public final rr.a0 o() {
        rr.l lVarO = super.o();
        br.l.c(lVarO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (rr.a0) lVarO;
    }

    @Override // rr.l
    public final Object w0(rr.n nVar, Object obj) {
        return nVar.D(this, obj);
    }
}
