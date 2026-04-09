package jt;

import ht.x;

/* loaded from: classes.dex */
public final /* synthetic */ class o extends br.j implements ar.n {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11, Object obj) {
        super(i10, obj);
        this.E = i11;
    }

    @Override // br.d
    public final String B() {
        switch (this.E) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    @Override // br.d, ir.c
    public final String getName() {
        switch (this.E) {
            case 0:
                return "isStrictSupertype";
            default:
                return "equalTypes";
        }
    }

    @Override // ar.n
    public final Object w(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                x xVar = (x) obj;
                x xVar2 = (x) obj2;
                br.l.e(xVar, "p0");
                br.l.e(xVar2, "p1");
                ((p) this.f2904d).getClass();
                k.f13857b.getClass();
                l lVar = j.f13856b;
                return Boolean.valueOf(lVar.b(xVar, xVar2) && !lVar.b(xVar2, xVar));
            default:
                x xVar3 = (x) obj;
                x xVar4 = (x) obj2;
                br.l.e(xVar3, "p0");
                br.l.e(xVar4, "p1");
                return Boolean.valueOf(((l) this.f2904d).a(xVar3, xVar4));
        }
    }

    @Override // br.d
    public final ir.f z() {
        switch (this.E) {
            case 0:
                return br.x.f2918a.b(p.class);
            default:
                return br.x.f2918a.b(l.class);
        }
    }
}
