package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class dt2 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe4 b;
    public final /* synthetic */ a83 c;
    public final /* synthetic */ c83 d;
    public final /* synthetic */ su1 e;
    public final /* synthetic */ sb2 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ Object i;

    public /* synthetic */ dt2(Object obj, xe4 xe4Var, a83 a83Var, c83 c83Var, su1 su1Var, sb2 sb2Var, String str, String str2, int i) {
        this.a = i;
        this.i = obj;
        this.b = xe4Var;
        this.c = a83Var;
        this.d = c83Var;
        this.e = su1Var;
        this.f = sb2Var;
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) {
        xv2 xv2Var;
        switch (this.a) {
            case 0:
                ft2 ft2Var = (ft2) this.i;
                xe4 xe4Var = this.b;
                a83 a83Var = this.c;
                c83 c83Var = this.d;
                su1 su1Var = this.e;
                sb2 sb2Var = this.f;
                String str = this.g;
                String str2 = this.h;
                ag2 ag2VarA = ft2Var.j.a(xe4Var, a83Var, c83Var);
                yw1 yw1Var = new yw1(ag2VarA);
                bu2 bu2Var = ft2Var.l.a;
                sg2 sg2VarE0 = ag2VarA.e0();
                iz1 iz1Var = mz1.pe;
                tw1 tw1Var = tw1.e;
                sg2VarE0.p(bu2Var, bu2Var, bu2Var, bu2Var, bu2Var, false, null, !((Boolean) tw1Var.c.a(iz1Var)).booleanValue() ? new su1(ft2Var.a, null) : su1Var, null, true != ((Boolean) tw1Var.c.a(iz1Var)).booleanValue() ? null : sb2Var, ft2Var.o, ft2Var.n, ft2Var.m, null, bu2Var, null, null, null, null, null, null);
                ag2VarA.v0("/getNativeAdViewSignals", x32.n);
                ag2VarA.v0("/getNativeClickMeta", x32.o);
                if (((Boolean) tw1Var.c.a(mz1.l8)).booleanValue()) {
                    if (((Boolean) tw1Var.c.a(mz1.n8)).booleanValue() && (xv2Var = ft2Var.s) != null) {
                        ag2VarA.v0("/onDeviceStorageEvent", new k32(3, xv2Var));
                    }
                }
                sg2 sg2VarE02 = ag2VarA.e0();
                synchronized (sg2VarE02.i) {
                    sg2VarE02.x = true;
                }
                ag2VarA.e0().l = new ug0(23, yw1Var);
                ag2VarA.J0(str, str2);
                return yw1Var;
            default:
                mt2 mt2Var = (mt2) this.i;
                xe4 xe4Var2 = this.b;
                a83 a83Var2 = this.c;
                c83 c83Var2 = this.d;
                su1 su1Var2 = this.e;
                sb2 sb2Var2 = this.f;
                String str3 = this.g;
                String str4 = this.h;
                ag2 ag2VarA2 = mt2Var.c.a(xe4Var2, a83Var2, c83Var2);
                yw1 yw1Var2 = new yw1(ag2VarA2);
                if (mt2Var.a.b != null) {
                    mt2Var.a(ag2VarA2, su1Var2, sb2Var2);
                    ag2VarA2.Z(new zq(5, 0, 0));
                } else {
                    bu2 bu2Var2 = mt2Var.d.a;
                    sg2 sg2VarE03 = ag2VarA2.e0();
                    iz1 iz1Var2 = mz1.pe;
                    tw1 tw1Var2 = tw1.e;
                    sg2VarE03.p(bu2Var2, bu2Var2, bu2Var2, bu2Var2, bu2Var2, false, null, !((Boolean) tw1Var2.c.a(iz1Var2)).booleanValue() ? new su1(mt2Var.e, null) : su1Var2, null, true != ((Boolean) tw1Var2.c.a(iz1Var2)).booleanValue() ? null : sb2Var2, mt2Var.h, mt2Var.g, mt2Var.f, null, bu2Var2, null, null, null, null, mt2Var.j, null);
                    mt2.b(ag2VarA2);
                }
                ag2VarA2.e0().l = new t83(mt2Var, ag2VarA2, yw1Var2, 21, false);
                ag2VarA2.J0(str3, str4);
                return yw1Var2;
        }
    }
}
