package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class w32 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w32(gj2 gj2Var, String str, int i) {
        this.a = i;
        this.b = gj2Var;
        this.c = str;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) {
        int i = this.a;
        String str = this.c;
        gj2 gj2Var = this.b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                o32 o32Var = x32.a;
                return (((Boolean) tw1.e.c.a(mz1.Pa)).booleanValue() && gj2Var != null && gj2.b(str)) ? gj2Var.a(str2, sv1.f.e) : pu1.r(str2);
            default:
                ((ld2) gj2Var.e).a(new fj2(gj2Var, (Throwable) obj, 1));
                return pu1.r(str);
        }
    }
}
