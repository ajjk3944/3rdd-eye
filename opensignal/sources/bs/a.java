package bs;

import lq.b0;
import or.o;
import ur.a0;
import ur.x;
import x0.l;

/* loaded from: classes.dex */
public final class a implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2919a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2920d;

    public /* synthetic */ a(int i10, Object obj) {
        this.f2919a = i10;
        this.f2920d = obj;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        long j;
        switch (this.f2919a) {
            case 0:
                rr.d dVar = (rr.d) obj;
                if (dVar == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((b) this.f2920d).f2921b.c(dVar);
                return b0.f15562a;
            case 1:
                qs.g gVar = (qs.g) obj;
                a0 a0VarK = ((or.h) this.f2920d).k();
                qs.c cVar = o.j;
                at.j jVar = ((x) a0VarK.J0(cVar)).D;
                if (jVar == null) {
                    or.h.a(11);
                    throw null;
                }
                rr.i iVarC = jVar.c(gVar, zr.d.FROM_BUILTINS);
                if (iVarC == null) {
                    throw new AssertionError("Built-in class " + cVar.c(gVar) + " is not found");
                }
                if (iVarC instanceof rr.f) {
                    return (rr.f) iVarC;
                }
                throw new AssertionError("Must be a class descriptor " + gVar + ", but was " + iVarC);
            case 2:
                ur.a aVar = (ur.a) this.f2920d;
                ((jt.f) obj).getClass();
                return (ht.b0) aVar.f23621d.f23626d.c();
            case 3:
                x0.j jVar2 = (x0.j) obj;
                synchronized (l.f24717c) {
                    j = l.f24719e;
                    l.f24719e = 1 + j;
                }
                return new x0.e(j, jVar2, (ar.k) this.f2920d);
            default:
                wt.g gVar2 = (wt.g) this.f2920d;
                b0 b0Var = b0.f15562a;
                gVar2.g(b0Var);
                return b0Var;
        }
    }
}
