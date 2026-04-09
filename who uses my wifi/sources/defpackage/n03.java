package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class n03 implements f03 {
    public final /* synthetic */ int a;
    public final Context b;
    public final Object c;

    public /* synthetic */ n03(Context context, Object obj, int i) {
        this.a = i;
        this.b = context;
        this.c = obj;
    }

    @Override // defpackage.f03
    public final Object a(h83 h83Var, a83 a83Var, c03 c03Var) {
        switch (this.a) {
            case 0:
                p21 p21Var = new p21(a83Var, (d82) c03Var.b, s2.APP_OPEN_AD);
                xb4 xb4Var = new xb4(h83Var, a83Var, c03Var.a);
                l92 l92Var = new l92(p21Var, (Object) null);
                h80 h80Var = new h80(a83Var.a0, 4);
                zh2 zh2Var = (zh2) this.c;
                th2 th2Var = zh2Var.c;
                zh2 zh2Var2 = zh2Var.d;
                xh2 xh2Var = new xh2(th2Var, zh2Var2, xb4Var, l92Var, h80Var);
                ba4 ba4Var = xh2Var.w;
                p21Var.i = (cn2) ba4Var.d();
                ((u03) c03Var.c).C3(new a23((sm2) xh2Var.A.d(), (wp2) xh2Var.C.d(), (cn2) ba4Var.d(), (gn2) xh2Var.z.d(), (qn2) xh2Var.D.d(), (vo2) zh2Var2.Q.d(), (xn2) xh2Var.E.d(), (fq2) xh2Var.F.d(), (so2) xh2Var.G.d(), (an2) xh2Var.I.d()));
                return xh2Var.y();
            case 1:
                p21 p21Var2 = new p21(a83Var, (d82) c03Var.b, s2.INTERSTITIAL);
                xb4 xb4Var2 = new xb4(h83Var, a83Var, c03Var.a);
                l92 l92Var2 = new l92(p21Var2, (Object) null);
                ei2 ei2Var = (ei2) this.c;
                th2 th2Var2 = ei2Var.b;
                ei2 ei2Var2 = ei2Var.c;
                di2 di2Var = new di2(th2Var2, ei2Var2, xb4Var2, l92Var2);
                ba4 ba4Var2 = di2Var.v;
                p21Var2.i = (cn2) ba4Var2.d();
                ((u03) c03Var.c).C3(new a23((sm2) di2Var.z.d(), (wp2) di2Var.C.d(), (cn2) ba4Var2.d(), (gn2) di2Var.y.d(), (qn2) di2Var.D.d(), (vo2) ei2Var2.Q.d(), (xn2) di2Var.F.d(), (fq2) di2Var.G.d(), (so2) di2Var.H.d(), (an2) di2Var.J.d()));
                return di2Var.y();
            default:
                p21 p21Var3 = new p21(a83Var, (d82) c03Var.b, s2.REWARDED);
                xb4 xb4Var3 = new xb4(h83Var, a83Var, c03Var.a);
                ju2 ju2Var = new ju2(p21Var3, null, 0);
                ji2 ji2Var = (ji2) this.c;
                th2 th2Var3 = ji2Var.c;
                ji2 ji2Var2 = ji2Var.d;
                ii2 ii2Var = new ii2(th2Var3, ji2Var2, xb4Var3, ju2Var);
                ba4 ba4Var3 = ii2Var.v;
                p21Var3.i = (cn2) ba4Var3.d();
                ((u03) c03Var.c).C3(new z13((sm2) ii2Var.z.d(), (wp2) ii2Var.B.d(), (cn2) ba4Var3.d(), (gn2) ii2Var.y.d(), (qn2) ii2Var.C.d(), (an2) ii2Var.I.d(), (vo2) ji2Var2.U.d(), (fq2) ii2Var.F.d(), (xn2) ii2Var.E.d(), (cq2) ii2Var.K.d(), (so2) ii2Var.G.d()));
                return ii2Var.y();
        }
    }

    @Override // defpackage.f03
    public final void b(h83 h83Var, a83 a83Var, c03 c03Var) throws n83 {
        switch (this.a) {
            case 0:
                try {
                    d82 d82Var = (d82) c03Var.b;
                    d82Var.j1(a83Var.Z);
                    d82Var.f2(a83Var.U, a83Var.v.toString(), ((l83) h83Var.a.g).d, new oi0(this.b), new m03(c03Var), (z62) c03Var.c);
                    return;
                } catch (RemoteException e) {
                    gi2.R();
                    throw new n83(e);
                }
            case 1:
                try {
                    d82 d82Var2 = (d82) c03Var.b;
                    d82Var2.j1(a83Var.Z);
                    d82Var2.B0(a83Var.U, a83Var.v.toString(), ((l83) h83Var.a.g).d, new oi0(this.b), new z03(this, c03Var), (z62) c03Var.c);
                    return;
                } catch (RemoteException e2) {
                    gi2.R();
                    throw new n83(e2);
                }
            default:
                try {
                    Object obj = c03Var.b;
                    IInterface iInterface = c03Var.c;
                    d82 d82Var3 = (d82) obj;
                    String str = a83Var.Z;
                    JSONObject jSONObject = a83Var.v;
                    d82Var3.j1(str);
                    l83 l83Var = (l83) h83Var.a.g;
                    int i = l83Var.p.g;
                    Context context = this.b;
                    if (i == 3) {
                        d82Var3.F2(a83Var.U, jSONObject.toString(), l83Var.d, new oi0(context), new u13(this, c03Var), (z62) iInterface);
                    } else {
                        d82Var3.g2(a83Var.U, jSONObject.toString(), l83Var.d, new oi0(context), new u13(this, c03Var), (z62) iInterface);
                    }
                    return;
                } catch (RemoteException unused) {
                    gi2.R();
                    return;
                }
        }
    }
}
