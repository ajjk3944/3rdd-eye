package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class op1 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ op1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) throws JSONException {
        jv2 jv2Var;
        switch (this.a) {
            case 0:
                cr1 cr1Var = (cr1) this.b;
                au2[] au2VarArr = (au2[]) this.c;
                String str = (String) this.d;
                au2 au2Var = (au2) obj;
                cr1Var.getClass();
                au2VarArr[0] = au2Var;
                Context context = cr1Var.h;
                o92 o92Var = cr1Var.n;
                Map map = o92Var.g;
                JSONObject jSONObjectZ = uk2.Z(context, map, map, o92Var.f, null);
                JSONObject jSONObjectN = uk2.N(cr1Var.h, cr1Var.n.f);
                JSONObject jSONObjectS = uk2.S(cr1Var.n.f);
                JSONObject jSONObjectV = uk2.V(cr1Var.h, cr1Var.n.f);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", jSONObjectZ);
                jSONObject.put("ad_view_signal", jSONObjectN);
                jSONObject.put("scroll_view_signal", jSONObjectS);
                jSONObject.put("lock_screen_signal", jSONObjectV);
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
                    jSONObject.put("click_signal", uk2.b0(null, cr1Var.h, cr1Var.p, cr1Var.o));
                }
                return au2Var.a(str, jSONObject);
            case 1:
                kl2 kl2Var = (kl2) this.b;
                g4 g4Var = (g4) this.c;
                n70 n70Var = (n70) this.d;
                el2 el2Var = (el2) obj;
                kl2Var.getClass();
                if (el2Var != null) {
                    g4Var.p(el2Var);
                }
                return pu1.N(n70Var, ((Long) j12.a.w()).longValue(), TimeUnit.MILLISECONDS, kl2Var.b);
            case 2:
                mt2 mt2Var = (mt2) this.b;
                su1 su1Var = (su1) this.c;
                sb2 sb2Var = (sb2) this.d;
                ag2 ag2VarA = mt2Var.c.a(xe4.a(), null, null);
                yw1 yw1Var = new yw1(ag2VarA);
                mt2Var.a(ag2VarA, su1Var, sb2Var);
                ag2VarA.e0().m = new z71(23, yw1Var);
                ag2VarA.loadUrl((String) tw1.e.c.a(mz1.f4));
                return yw1Var;
            case 3:
                au2 au2Var2 = (au2) this.b;
                String str2 = (String) this.d;
                JSONObject jSONObject2 = (JSONObject) this.c;
                ag2 ag2Var = (ag2) obj;
                v32 v32Var = au2Var2.h;
                v32Var.getClass();
                pd2 pd2Var = new pd2();
                lf4 lf4Var = hg4.C.c;
                String string = UUID.randomUUID().toString();
                v32Var.a(string, new j42(v32Var, pd2Var));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("id", string);
                    jSONObject3.put("args", jSONObject2);
                    ag2Var.b(str2, jSONObject3);
                } catch (Exception e) {
                    pd2Var.b(e);
                }
                return pd2Var;
            case 4:
                h03 h03Var = (h03) this.b;
                a83 a83Var = (a83) this.c;
                h83 h83Var = (h83) this.d;
                jv2 jv2Var2 = h03Var.i;
                iz1 iz1Var = mz1.p2;
                kz1 kz1Var = tw1.e.c;
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var2.e, "rendering-webview-creation-start");
                }
                pu2 pu2Var = h03Var.b;
                l83 l83Var = h03Var.c;
                final ag2 ag2VarA2 = pu2Var.a(l83Var.f, a83Var, (c83) h83Var.b.g);
                ag2VarA2.x0(a83Var.W);
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var2.e, "rendering-webview-creation-end");
                }
                pd2 pd2Var2 = new pd2();
                zh2 zh2Var = h03Var.a;
                xb4 xb4Var = new xb4(h83Var, a83Var, (String) null);
                e51 e51Var = h03Var.e;
                boolean z = h03Var.g;
                e42 e42Var = h03Var.f;
                xh2 xh2Var = new xh2(zh2Var.c, zh2Var.d, xb4Var, new l92(new j03(e51Var, pd2Var2, a83Var, ag2VarA2, l83Var, z, e42Var, h03Var.h, h03Var.j), ag2VarA2), new h80(a83Var.a0, 4));
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var2.e, "rendering-ad-component-creation-end");
                }
                ba4 ba4Var = xh2Var.J;
                final int i = 0;
                ((ou2) ba4Var.d()).a(ag2VarA2, false, true != z ? null : e42Var, jv2Var2.e);
                pd2Var2.a(xh2Var);
                ((cn2) xh2Var.w.d()).L1(new dn2() { // from class: g03
                    @Override // defpackage.dn2
                    public final /* synthetic */ void D0() {
                        switch (i) {
                            case 0:
                                ag2 ag2Var2 = ag2VarA2;
                                if (ag2Var2.e0() != null) {
                                    ag2Var2.e0().U();
                                    break;
                                }
                                break;
                            case 1:
                                ag2 ag2Var3 = ag2VarA2;
                                if (ag2Var3.e0() != null) {
                                    ag2Var3.e0().U();
                                    break;
                                }
                                break;
                            case 2:
                                ag2 ag2Var4 = ag2VarA2;
                                if (ag2Var4.e0() != null) {
                                    ag2Var4.e0().U();
                                    break;
                                }
                                break;
                            default:
                                ag2 ag2Var5 = ag2VarA2;
                                if (ag2Var5.e0() != null) {
                                    ag2Var5.e0().U();
                                    break;
                                }
                                break;
                        }
                    }
                }, md2.g);
                e83 e83Var = a83Var.s;
                String strA = e83Var.a;
                if (((Boolean) kz1Var.a(mz1.J5)).booleanValue() && ((wz2) xh2Var.v.d()).a()) {
                    strA = tg2.a(strA, tg2.b(a83Var));
                }
                return pu1.P(ou2.b(ag2VarA2, e83Var.b, strA, jv2Var2.e, (da3) zh2Var.f.d()), new dm2(ag2VarA2, a83Var, xh2Var, 1), h03Var.d);
            case 5:
                o03 o03Var = (o03) this.b;
                h83 h83Var2 = (h83) this.c;
                a83 a83Var2 = (a83) this.d;
                Executor executor = o03Var.e;
                jv2 jv2Var3 = o03Var.g;
                iz1 iz1Var2 = mz1.p2;
                kz1 kz1Var2 = tw1.e.c;
                if (((Boolean) kz1Var2.a(iz1Var2)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var3.e, "rendering-webview-creation-start");
                }
                Context context2 = o03Var.b;
                xe4 xe4VarN = a30.n(context2, a83Var2.u);
                final ag2 ag2VarA3 = o03Var.c.a(xe4VarN, a83Var2, (c83) h83Var2.b.g);
                ag2VarA3.x0(a83Var2.W);
                View viewA = (((Boolean) kz1Var2.a(mz1.z8)).booleanValue() && a83Var2.g0) ? wk2.a(context2, ag2VarA3.p0(), a83Var2) : new ru2(context2, ag2VarA3.p0(), (mq1) o03Var.f.apply(a83Var2));
                if (((Boolean) kz1Var2.a(iz1Var2)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var3.e, "rendering-webview-creation-end");
                }
                bi2 bi2Var = o03Var.a;
                ai2 ai2Var = new ai2(bi2Var.d, bi2Var.e, new xb4(h83Var2, a83Var2, (String) null), new p21(viewA, ag2VarA3, (dl2) new vg0(22, ag2VarA3), xe4VarN.n ? new b83(-3, 0, true) : new b83(xe4VarN.j, xe4VarN.g, false)));
                if (((Boolean) kz1Var2.a(iz1Var2)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var3.e, "rendering-ad-component-creation-end");
                }
                ba4 ba4Var2 = ai2Var.M;
                ((ou2) ba4Var2.d()).a(ag2VarA3, false, null, jv2Var3.e);
                cn2 cn2Var = (cn2) ai2Var.A.d();
                final int i2 = 1;
                dn2 dn2Var = new dn2() { // from class: g03
                    @Override // defpackage.dn2
                    public final /* synthetic */ void D0() {
                        switch (i2) {
                            case 0:
                                ag2 ag2Var2 = ag2VarA3;
                                if (ag2Var2.e0() != null) {
                                    ag2Var2.e0().U();
                                    break;
                                }
                                break;
                            case 1:
                                ag2 ag2Var3 = ag2VarA3;
                                if (ag2Var3.e0() != null) {
                                    ag2Var3.e0().U();
                                    break;
                                }
                                break;
                            case 2:
                                ag2 ag2Var4 = ag2VarA3;
                                if (ag2Var4.e0() != null) {
                                    ag2Var4.e0().U();
                                    break;
                                }
                                break;
                            default:
                                ag2 ag2Var5 = ag2VarA3;
                                if (ag2Var5.e0() != null) {
                                    ag2Var5.e0().U();
                                    break;
                                }
                                break;
                        }
                    }
                };
                ld2 ld2Var = md2.g;
                cn2Var.L1(dn2Var, ld2Var);
                e83 e83Var2 = a83Var2.s;
                String strA2 = e83Var2.a;
                if (((Boolean) kz1Var2.a(mz1.J5)).booleanValue() && ((wz2) ai2Var.y.d()).a()) {
                    strA2 = tg2.a(strA2, tg2.b(a83Var2));
                }
                pd2 pd2VarB = ou2.b(ag2VarA3, e83Var2.b, strA2, jv2Var3.e, (da3) bi2Var.k.d());
                wq3 wq3Var = pd2VarB.f;
                if (a83Var2.M) {
                    wq3Var.c(new ig2(ag2VarA3, 7), executor);
                }
                wq3Var.c(new sz2(o03Var, ag2VarA3, 2), executor);
                return pu1.P(pd2VarB, new vn1(3, ai2Var), ld2Var);
            case 6:
                return pu1.r(wk2.a(((l03) this.b).b, (View) this.c, (a83) this.d));
            case 7:
                return pu1.r(wk2.a(((r03) this.b).b, (View) this.c, (a83) this.d));
            case 8:
                y03 y03Var = (y03) this.b;
                a83 a83Var3 = (a83) this.c;
                h83 h83Var3 = (h83) this.d;
                jv2 jv2Var4 = y03Var.j;
                iz1 iz1Var3 = mz1.p2;
                kz1 kz1Var3 = tw1.e.c;
                if (((Boolean) kz1Var3.a(iz1Var3)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var4.e, "rendering-webview-creation-start");
                }
                pu2 pu2Var2 = y03Var.c;
                l83 l83Var2 = y03Var.d;
                final ag2 ag2VarA4 = pu2Var2.a(l83Var2.f, a83Var3, (c83) h83Var3.b.g);
                ag2VarA4.x0(a83Var3.W);
                if (((Boolean) kz1Var3.a(iz1Var3)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var4.e, "rendering-webview-creation-end");
                }
                pd2 pd2Var3 = new pd2();
                ei2 ei2Var = (ei2) y03Var.l;
                xb4 xb4Var2 = new xb4(h83Var3, a83Var3, (String) null);
                Context context3 = y03Var.b;
                e51 e51Var2 = y03Var.f;
                boolean z2 = y03Var.h;
                e42 e42Var2 = y03Var.g;
                di2 di2Var = new di2(ei2Var.b, ei2Var.c, xb4Var2, new l92(new x03(context3, e51Var2, pd2Var3, a83Var3, ag2VarA4, l83Var2, z2, e42Var2, y03Var.i, y03Var.k), ag2VarA4));
                pd2Var3.a(di2Var);
                if (((Boolean) kz1Var3.a(iz1Var3)).booleanValue()) {
                    jv2Var = jv2Var4;
                    ga1.n(hg4.C.k, jv2Var.e, "rendering-ad-component-creation-end");
                } else {
                    jv2Var = jv2Var4;
                }
                final int i3 = 2;
                ((cn2) di2Var.v.d()).L1(new dn2() { // from class: g03
                    @Override // defpackage.dn2
                    public final /* synthetic */ void D0() {
                        switch (i3) {
                            case 0:
                                ag2 ag2Var2 = ag2VarA4;
                                if (ag2Var2.e0() != null) {
                                    ag2Var2.e0().U();
                                    break;
                                }
                                break;
                            case 1:
                                ag2 ag2Var3 = ag2VarA4;
                                if (ag2Var3.e0() != null) {
                                    ag2Var3.e0().U();
                                    break;
                                }
                                break;
                            case 2:
                                ag2 ag2Var4 = ag2VarA4;
                                if (ag2Var4.e0() != null) {
                                    ag2Var4.e0().U();
                                    break;
                                }
                                break;
                            default:
                                ag2 ag2Var5 = ag2VarA4;
                                if (ag2Var5.e0() != null) {
                                    ag2Var5.e0().U();
                                    break;
                                }
                                break;
                        }
                    }
                }, md2.g);
                e83 e83Var3 = a83Var3.s;
                String strA3 = e83Var3.a;
                if (((Boolean) kz1Var3.a(mz1.J5)).booleanValue() && ((wz2) di2Var.u.d()).a()) {
                    strA3 = tg2.a(strA3, tg2.b(a83Var3));
                }
                ba4 ba4Var3 = di2Var.L;
                ((ou2) ba4Var3.d()).a(ag2VarA4, true, true != z2 ? null : e42Var2, jv2Var.e);
                return pu1.P(ou2.b(ag2VarA4, e83Var3.b, strA3, jv2Var.e, (da3) ei2Var.h.d()), new dm2(ag2VarA4, a83Var3, di2Var, 2), y03Var.e);
            case 9:
                c13 c13Var = (c13) this.b;
                h83 h83Var4 = (h83) this.c;
                a83 a83Var4 = (a83) this.d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return pu1.B(new hx2(3));
                }
                int i4 = ((l83) h83Var4.a.g).l;
                if (i4 <= 1) {
                    return pu1.P(c13Var.c(h83Var4, a83Var4, jSONArray.getJSONObject(0)), gj1.m, c13Var.b);
                }
                int length = jSONArray.length();
                if (((Boolean) tw1.e.c.a(mz1.q2)).booleanValue()) {
                    c13Var.f.b("nsl", String.valueOf(length));
                }
                c13Var.d.a(Math.min(length, i4));
                ArrayList arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    if (i5 < length) {
                        arrayList.add(c13Var.c(h83Var4, a83Var4, jSONArray.getJSONObject(i5)));
                    } else {
                        arrayList.add(pu1.B(new hx2(3)));
                    }
                }
                return pu1.r(arrayList);
            default:
                y03 y03Var2 = (y03) this.b;
                a83 a83Var5 = (a83) this.c;
                h83 h83Var5 = (h83) this.d;
                jv2 jv2Var5 = y03Var2.j;
                iz1 iz1Var4 = mz1.p2;
                kz1 kz1Var4 = tw1.e.c;
                if (((Boolean) kz1Var4.a(iz1Var4)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var5.e, "rendering-webview-creation-start");
                }
                pu2 pu2Var3 = y03Var2.c;
                l83 l83Var3 = y03Var2.d;
                final ag2 ag2VarA5 = pu2Var3.a(l83Var3.f, a83Var5, (c83) h83Var5.b.g);
                ag2VarA5.x0(a83Var5.W);
                if (((Boolean) kz1Var4.a(iz1Var4)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var5.e, "rendering-webview-creation-end");
                }
                pd2 pd2Var4 = new pd2();
                ji2 ji2Var = (ji2) y03Var2.l;
                xb4 xb4Var3 = new xb4(h83Var5, a83Var5, (String) null);
                Context context4 = y03Var2.b;
                e51 e51Var3 = y03Var2.f;
                e42 e42Var3 = y03Var2.g;
                boolean z3 = y03Var2.h;
                pz2 pz2Var = y03Var2.i;
                jv2 jv2Var6 = y03Var2.j;
                ii2 ii2Var = new ii2(ji2Var.c, ji2Var.d, xb4Var3, new ju2(new uu0(context4, pu2Var3, l83Var3, e51Var3, a83Var5, pd2Var4, ag2VarA5, e42Var3, z3, pz2Var, jv2Var6, y03Var2.k), ag2VarA5, 0));
                pd2Var4.a(ii2Var);
                if (((Boolean) kz1Var4.a(iz1Var4)).booleanValue()) {
                    ga1.n(hg4.C.k, jv2Var6.e, "rendering-ad-component-creation-end");
                }
                ag2VarA5.v0("/reward", new k32(5, (cq2) ii2Var.K.d()));
                final int i6 = 3;
                ((cn2) ii2Var.v.d()).L1(new dn2() { // from class: g03
                    @Override // defpackage.dn2
                    public final /* synthetic */ void D0() {
                        switch (i6) {
                            case 0:
                                ag2 ag2Var2 = ag2VarA5;
                                if (ag2Var2.e0() != null) {
                                    ag2Var2.e0().U();
                                    break;
                                }
                                break;
                            case 1:
                                ag2 ag2Var3 = ag2VarA5;
                                if (ag2Var3.e0() != null) {
                                    ag2Var3.e0().U();
                                    break;
                                }
                                break;
                            case 2:
                                ag2 ag2Var4 = ag2VarA5;
                                if (ag2Var4.e0() != null) {
                                    ag2Var4.e0().U();
                                    break;
                                }
                                break;
                            default:
                                ag2 ag2Var5 = ag2VarA5;
                                if (ag2Var5.e0() != null) {
                                    ag2Var5.e0().U();
                                    break;
                                }
                                break;
                        }
                    }
                }, md2.g);
                ba4 ba4Var4 = ii2Var.L;
                ((ou2) ba4Var4.d()).a(ag2VarA5, true, true != z3 ? null : e42Var3, jv2Var6.e);
                e83 e83Var4 = a83Var5.s;
                String strA4 = e83Var4.a;
                if (((Boolean) kz1Var4.a(mz1.J5)).booleanValue() && ((wz2) ii2Var.u.d()).a()) {
                    strA4 = tg2.a(strA4, tg2.b(a83Var5));
                }
                return pu1.P(ou2.b(ag2VarA5, e83Var4.b, strA4, jv2Var6.e, (da3) ji2Var.g.d()), new dm2(ag2VarA5, a83Var5, ii2Var, 3), y03Var2.e);
        }
    }

    public /* synthetic */ op1(au2 au2Var, String str, JSONObject jSONObject) {
        this.a = 3;
        this.b = au2Var;
        this.d = str;
        this.c = jSONObject;
    }

    public /* synthetic */ op1(zz2 zz2Var, a83 a83Var, h83 h83Var, su2 su2Var, int i) {
        this.a = i;
        this.b = zz2Var;
        this.c = a83Var;
        this.d = h83Var;
    }
}
