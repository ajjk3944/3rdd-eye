package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u12 implements ca4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u12(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public tr2 a() {
        tr2 tr2Var = (tr2) ((f23) this.b).g;
        i41.M(tr2Var);
        return tr2Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        Object en3Var;
        jg jgVar;
        int i = this.a;
        oj ojVar = null;
        int i2 = 11;
        int i3 = 3;
        int i4 = 6;
        int i5 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new z02(ld2Var, ((wb2) obj).a(), i5);
            case 1:
                return new yi2(i5, new x91(((hh2) ((ri2) obj).b).a()));
            case 2:
                return (ViewGroup) ((ug0) obj).g;
            case 3:
                return ((jk2) obj).a();
            case 4:
                wb2 wb2Var = (wb2) obj;
                return new up2(new rk2((ag2) ((mk2) wb2Var.b).b.i, (mv2) wb2Var.c.d(), ((ll2) wb2Var.d).a()), md2.a);
            case 5:
                rc2 rc2Var = (rc2) obj;
                sk2 sk2Var = new sk2((ag2) ((mk2) rc2Var.b).b.i, (Executor) rc2Var.c.d());
                if (((Boolean) tw1.e.c.a(mz1.sd)).booleanValue()) {
                    up2 up2Var = new up2(sk2Var, md2.a);
                    int i6 = dn3.h;
                    en3Var = new en3(up2Var);
                } else {
                    int i7 = dn3.h;
                    en3Var = yn3.o;
                }
                i41.M(en3Var);
                return en3Var;
            case 6:
                return ((bm2) obj).a();
            case 7:
                qk2 qk2Var = (qk2) obj;
                return new cl2(new nc2(((hh2) qk2Var.b).a(), ((qm2) qk2Var.c).a().g));
            case 8:
                return new fl2(((ea4) obj).d());
            case 9:
                return new gm2(((ll2) obj).b());
            case 10:
                return (vq2) obj;
            case 11:
                yr2 yr2Var = (yr2) ((xq2) obj).a.g;
                i41.M(yr2Var);
                Set setSingleton = yr2Var.d != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
                i41.M(setSingleton);
                return setSingleton;
            case 12:
                ur2 ur2Var = (ur2) ((zl2) obj).b.d();
                i41.M(ur2Var);
                JSONObject jSONObject = ur2Var.b;
                if (jSONObject == null) {
                    try {
                        jSONObject = new JSONObject(ur2Var.a.z);
                    } catch (JSONException unused) {
                        return null;
                    }
                }
                return jSONObject;
            case 13:
                ir2 ir2Var = new ir2(((jr2) obj).b.a());
                rr2 rr2Var = new rr2();
                rr2Var.a = ir2Var;
                return rr2Var;
            case 14:
                tr2 tr2Var = (tr2) ((f23) obj).g;
                i41.M(tr2Var);
                return tr2Var;
            case 15:
                return new cj2(1, (ag2) ((ca4) obj).d());
            case 16:
                return new up2(new cj2(1, (ag2) ((ca4) ((u12) obj).b).d()), md2.f);
            case 17:
                bh2 bh2Var = (bh2) obj;
                pm pmVar = (pm) bh2Var.b.d();
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                return new uu2(new mu2(pmVar, new kf3(27, ld2Var2), (vu2) bh2Var.c.d(), new tv2(11, (byte) 0)));
            case 18:
                ld2 ld2Var3 = md2.a;
                i41.M(ld2Var3);
                rc2 rc2Var2 = (rc2) obj;
                Set setSingleton2 = ((Boolean) tw1.e.c.a(mz1.A5)).booleanValue() ? Collections.singleton(new up2(new fv2((cx1) ((ba4) rc2Var2.b).d(), ((ea4) rc2Var2.c).d()), ld2Var3)) : Collections.EMPTY_SET;
                i41.M(setSingleton2);
                return setSingleton2;
            case 19:
                qk2 qk2Var2 = (qk2) obj;
                jy2 jy2Var = new jy2(((hh2) qk2Var2.b).a(), (oc2) qk2Var2.c.d());
                ld2 ld2Var4 = md2.a;
                i41.M(ld2Var4);
                return new up2(jy2Var, ld2Var4);
            case 20:
                rc2 rc2Var3 = (rc2) obj;
                ez2 ez2Var = (ez2) ((ba4) rc2Var3.b).d();
                rc2 rc2Var4 = (rc2) rc2Var3.c;
                fv2 fv2Var = new fv2(ez2Var, new fz2(((rc2) rc2Var4.b).a(), ((fh2) rc2Var4.c).d()));
                ld2 ld2Var5 = md2.a;
                i41.M(ld2Var5);
                return new up2(fv2Var, ld2Var5);
            case zy1.zzm /* 21 */:
                return new b33(5, (Bundle) ((om2) obj).b.c);
            case 22:
                i41.M(md2.a);
                i41.M(((fa2) ((n63) obj).b.h).i);
                return new f63();
            case 23:
                Context context = ((gh2) obj).b.b;
                i41.M(context);
                te3 te3Var = ue3.a;
                ve3 ve3Var = new ve3(context);
                hk jgVar2 = fp.b;
                cz0 cz0Var = new cz0();
                jgVar2.getClass();
                ls lsVar = ls.f;
                if (cz0Var != lsVar) {
                    hk hkVarI = jgVar2.i(cz0Var.getKey());
                    if (hkVarI == lsVar) {
                        jgVar2 = cz0Var;
                    } else {
                        pz pzVar = pz.h;
                        rj rjVar = (rj) hkVarI.h(pzVar);
                        if (rjVar == null) {
                            jgVar = new jg(hkVarI, cz0Var);
                        } else {
                            hk hkVarI2 = hkVarI.i(pzVar);
                            if (hkVarI2 == lsVar) {
                                jgVar2 = new jg(cz0Var, rjVar);
                            } else {
                                jgVar = new jg(new jg(hkVarI2, cz0Var), rjVar);
                            }
                        }
                        jgVar2 = jgVar;
                    }
                }
                return new yw0(ve3Var, zt0.o(new km(ns.f, ojVar, i5)), new pz(26), wl2.a(jgVar2));
            case 24:
                ep2 ep2Var = (ep2) ((f20) ((wf3) obj).d()).g;
                p21 p21Var = new p21();
                p21Var.g = p21Var;
                p21Var.f = ep2Var;
                ba4 ba4VarA = ba4.a(new bm2((da4) ep2Var.b, (da4) ep2Var.d, (ba4) ep2Var.l, ba4.a(a30.q), (ba4) ep2Var.n, (ba4) ep2Var.i, (da4) ep2Var.f));
                p21Var.h = ba4VarA;
                p21Var.i = ba4.a(new bm2((da4) ep2Var.d, ba4VarA, (ba4) ep2Var.l, (ba4) ep2Var.k, ba4.a(i30.p), new wf3(i3, p21Var), (da4) ep2Var.f));
                kh3 kh3Var = (kh3) ((ba4) p21Var.i).d();
                i41.M(kh3Var);
                return kh3Var;
            case 25:
                ep2 ep2Var2 = (ep2) ((sq0) ((wf3) obj).d()).g;
                da4 da4Var = (da4) ep2Var2.b;
                da4 da4Var2 = (da4) ep2Var2.d;
                ba4 ba4VarA2 = ba4.a(new q13(da4Var, da4Var2, (ba4) ep2Var2.h, 7));
                int i8 = 13;
                ba4 ba4VarA3 = ba4.a(new sj2(da4Var, ba4VarA2, i8));
                ba4 ba4Var = (ba4) ep2Var2.i;
                ba4 ba4Var2 = (ba4) ep2Var2.c;
                da4 da4Var3 = (da4) ep2Var2.f;
                ba4 ba4VarA4 = ba4.a(new hr2(ba4VarA3, ba4Var, ba4Var2, da4Var3, 1));
                ba4 ba4Var3 = (ba4) ep2Var2.n;
                ba4 ba4VarA5 = ba4.a(new u43(ba4Var3, 10));
                ba4 ba4Var4 = (ba4) ep2Var2.o;
                ba4 ba4VarA6 = ba4.a(new nt2(ba4.a(new g02(ba4VarA5, ba4Var4, ba4Var, 1)), ba4.a(new g02(ba4.a(new u43(ba4Var3, 12)), ba4Var4, ba4Var, 2)), ba4.a(new g02(ba4.a(new u43(ba4Var3, 14)), ba4Var4, ba4Var, 3)), ba4Var, 3));
                ba4 ba4VarA7 = ba4.a(new u43(ba4Var3, i8));
                ba4 ba4VarA8 = ba4.a(yc0.l);
                kh3 kh3Var2 = (kh3) ba4.a(new e02(ba4.a(new nt2(ba4VarA4, ba4.a(new bm2(da4Var, ba4VarA3, ba4VarA6, ba4Var, da4Var2, ba4.a(new b42(ba4VarA7, ba4VarA8, ba4Var, 2)), ba4VarA2)), ba4VarA6, ba4Var, 2)), ba4.a(new ar2(ba4.a(new yj2(da4Var, ba4.a(new q13(da4Var, da4Var3, (ba4) ep2Var2.k, i4)), ba4VarA2, da4Var3, ba4VarA8)), ba4VarA6, ba4VarA4, ba4Var, da4Var2, ba4.a(new u43(ba4Var3, i2)))), (ba4) ep2Var2.e, da4Var3, 16)).d();
                i41.M(kh3Var2);
                return kh3Var2;
            default:
                ep2 ep2Var3 = (ep2) ((yf3) ((wf3) obj).d()).f;
                ba4 ba4Var5 = (ba4) ep2Var3.c;
                ba4 ba4Var6 = (ba4) ep2Var3.i;
                da4 da4Var4 = (da4) ep2Var3.f;
                ba4 ba4VarA9 = ba4.a(new q13(ba4Var5, ba4Var6, da4Var4, 8));
                ba4 ba4VarA10 = ba4.a(zt0.n);
                da4 da4Var5 = (da4) ep2Var3.b;
                da4 da4Var6 = (da4) ep2Var3.d;
                ba4 ba4VarA11 = ba4.a(new ar2((ga4) da4Var5, (ga4) da4Var6, (ga4) da4Var4, (ga4) ep2Var3.g, (ga4) ba4Var6, (ga4) ba4VarA10, 14));
                ba4 ba4Var7 = (ba4) ep2Var3.n;
                ba4 ba4VarA12 = ba4.a(new u43(ba4Var7, 15));
                ba4 ba4Var8 = (ba4) ep2Var3.o;
                ba4 ba4VarA13 = ba4.a(new nt2(ba4.a(new g02(ba4VarA12, ba4Var8, ba4Var6, 4)), ba4.a(new g02(ba4.a(new u43(ba4Var7, 16)), ba4Var8, ba4Var6, 5)), ba4.a(new g02(ba4.a(new u43(ba4Var7, 17)), ba4Var8, ba4Var6, 6)), ba4Var6, 4));
                kh3 kh3Var3 = (kh3) ba4.a(new e02(ba4.a(new nt2(ba4VarA9, ba4VarA11, ba4VarA13, ba4Var6, 2)), ba4.a(new hj2(ba4VarA9, ba4VarA13, (ba4) ep2Var3.k, ba4Var6, da4Var4, da4Var6)), (ba4) ep2Var3.e, da4Var4, 16)).d();
                i41.M(kh3Var3);
                return kh3Var3;
        }
    }
}
