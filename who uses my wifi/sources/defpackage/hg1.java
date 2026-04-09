package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hg1 extends sf1 {
    public final /* synthetic */ cg1 b;
    public final /* synthetic */ ue c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(ue ueVar, cg1 cg1Var, cg1 cg1Var2) {
        super(cg1Var);
        this.b = cg1Var2;
        this.c = ueVar;
    }

    @Override // defpackage.sf1, defpackage.cg1
    public final bg1 b(long j) {
        bg1 bg1VarB = this.b.b(j);
        dg1 dg1Var = bg1VarB.a;
        long j2 = dg1Var.a;
        long j3 = dg1Var.b;
        long j4 = this.c.g;
        dg1 dg1Var2 = new dg1(j2, j3 + j4);
        dg1 dg1Var3 = bg1VarB.b;
        return new bg1(dg1Var2, new dg1(dg1Var3.a, dg1Var3.b + j4));
    }
}
