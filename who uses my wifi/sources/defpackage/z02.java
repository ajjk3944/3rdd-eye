package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z02 implements yp3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ z02(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) throws e62, JSONException {
        r13 r13Var;
        int i = 23;
        e93 e93Var = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.c;
                fa2 fa2Var = (fa2) obj;
                String str = fa2Var.i;
                lf4 lf4Var = hg4.C.c;
                return pu1.O(pu1.L((gq3) pu1.N(gq3.r(lf4.e(str) ? pu1.B(new my2(1)) : (((Boolean) tw1.e.c.a(mz1.R7)).booleanValue() || ((Boolean) h12.a.w()).booleanValue()) ? ((ld2) ((pq3) g4Var.h)).c(new gs1(g4Var, fa2Var, 8)) : ((ay2) g4Var.i).c(fa2Var)), ((Integer) tw1.e.c.a(mz1.Z5)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) g4Var.g), Throwable.class, new ux2(g4Var, fa2Var, Binder.getCallingUid(), 1), (pq3) g4Var.j), new c02(fa2Var, 0), (Executor) this.b);
            case 1:
                c62 c62Var = (c62) obj;
                c62Var.p((String) this.b, (y32) this.c);
                return pu1.r(c62Var);
            case 2:
                p62 p62Var = (p62) this.b;
                Object obj2 = this.c;
                pd2 pd2Var = new pd2();
                lf4 lf4Var2 = hg4.C.c;
                String string = UUID.randomUUID().toString();
                x32.j.a(string, new j42(p62Var, pd2Var));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", string);
                jSONObject.put("args", (JSONObject) obj2);
                m52 m52Var = (m52) ((c62) obj);
                m52Var.getClass();
                m52Var.s("google.afma.activeView.handleUpdate", jSONObject.toString());
                return pd2Var;
            case 3:
                gj2 gj2Var = (gj2) this.b;
                Uri.Builder builder = (Uri.Builder) this.c;
                ((ld2) gj2Var.e).a(new fj2(gj2Var, (Throwable) obj, 0));
                builder.appendQueryParameter((String) tw1.e.c.a(mz1.Ya), "9");
                return pu1.r(builder.toString());
            case 4:
                nl2 nl2Var = (nl2) this.b;
                fa2 fa2Var2 = (fa2) obj;
                fa2Var2.n = (d93) this.c;
                t83 t83Var = nl2Var.h;
                return t83Var.b0(fa2Var2, new sq0(16, (iy2) t83Var.h), new f20(i, t83Var), new c02(fa2Var2, 3));
            case 5:
                mt2 mt2Var = (mt2) this.b;
                JSONObject jSONObject2 = (JSONObject) this.c;
                ag2 ag2Var = (ag2) obj;
                f52 f52Var = mt2Var.a.b;
                yw1 yw1Var = new yw1(ag2Var);
                if (f52Var != null) {
                    ag2Var.Z(new zq(5, 0, 0));
                } else {
                    ag2Var.Z(new zq(4, 0, 0));
                }
                ag2Var.e0().l = new xb4(mt2Var, ag2Var, yw1Var, i);
                ag2Var.b("google.afma.nativeAds.renderVideo", jSONObject2);
                return yw1Var;
            case 6:
                zx2 zx2Var = (zx2) this.b;
                k62 k62Var = (k62) this.c;
                JSONObject jSONObject3 = (JSONObject) obj;
                if (((Boolean) tw1.e.c.a(mz1.o2)).booleanValue()) {
                    ga1.n(hg4.C.k, zx2Var.i.e, "scar-preloader-processing-done");
                }
                return k62Var.a(jSONObject3);
            case 7:
                zx2 zx2Var2 = (zx2) this.b;
                List list = (List) this.c;
                Exception exc = (Exception) obj;
                hg4.C.h.e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    r13Var = new r13("Timed out waiting for ad response.", 1);
                } else if (exc instanceof r13) {
                    r13Var = (r13) exc;
                } else {
                    r13Var = new r13(exc.getMessage() == null ? "Fetch failed." : exc.getMessage(), 1);
                }
                String message = r13Var.getMessage() == null ? "" : r13Var.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str2 = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str2 = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listV = sq0.p(new yk3(':')).v(message);
                            if (listV.size() == 2) {
                                message = (String) listV.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(db3.c(db3.c((String) it.next(), "@gw_adnetstatus@", str2), "@error_code@", message));
                    }
                    zx2Var2.j.a(arrayList, null);
                }
                return pu1.B(r13Var);
            case 8:
                return ((ly2) ((ga4) this.b).d()).e((fa2) this.c);
            case 9:
                Bundle bundle = (Bundle) obj;
                p21 p21Var = (p21) this.b;
                t3 t3Var = (t3) p21Var.f;
                th2 th2Var = (th2) p21Var.g;
                Context context = th2Var.a.b;
                i41.M(context);
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                fa2 fa2Var3 = (fa2) t3Var.h;
                i41.M(fa2Var3.i);
                f63 f63Var = new f63();
                ba4 ba4Var = th2Var.d;
                x43 x43Var = new x43(f63Var, 0L, (ScheduledExecutorService) ba4Var.d());
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ba4Var.d();
                Context context2 = th2Var.a.b;
                i41.M(context2);
                x43 x43Var2 = new x43(new b33(6, scheduledExecutorService), ((Long) tw1.e.c.a(mz1.D4)).longValue(), (ScheduledExecutorService) ba4Var.d());
                us0 us0Var = new us0();
                i41.M(context2);
                x43 x43Var3 = new x43(new a63(us0Var, context2, (ScheduledExecutorService) ba4Var.d(), ld2Var, t3Var.g, fa2Var3.q, fa2Var3.p), 0L, (ScheduledExecutorService) ba4Var.d());
                x43 x43Var4 = new x43(new g43(ld2Var, 5), 0L, (ScheduledExecutorService) ba4Var.d());
                g43 g43Var = new g43(ld2Var, 4);
                i41.M(ld2Var);
                List list2 = ((fa2) t3Var.h).j;
                i41.M(list2);
                g33 g33Var = new g33(ld2Var, list2, 8);
                t3 t3Var2 = (t3) p21Var.f;
                ld2 ld2Var2 = md2.a;
                i41.M(ld2Var2);
                fa2 fa2Var4 = (fa2) t3Var2.h;
                String string2 = fa2Var4.f.getString("ms");
                if (string2 == null) {
                    string2 = "";
                }
                PackageInfo packageInfo = fa2Var4.k;
                g33 g33Var2 = new g33(ld2Var2, string2, 7);
                q53 q53Var = (q53) th2Var.O0.d();
                ba4 ba4Var2 = th2Var.U;
                i41.M(fa2Var3.i);
                return new s53(context, ld2Var, dn3.h(x43Var, x43Var2, x43Var3, x43Var4, g43Var, g33Var, g33Var2, q53Var, new k33((gd2) ba4Var2.d(), (ScheduledExecutorService) ba4Var.d(), ld2Var)), (da3) ((ba4) p21Var.h).d(), (mv2) th2Var.j.d()).a(sv1.f.a.j(bundle), ((fa2) this.c).r, false);
            case 10:
                return ((s53) this.b).a(sv1.f.a.j((Bundle) obj), ((fa2) this.c).r, false);
            case 11:
                c13 c13Var = (c13) this.b;
                au2 au2Var = (au2) this.c;
                JSONObject jSONObject4 = (JSONObject) obj;
                v83 v83Var = c13Var.d;
                lq3 lq3VarR = pu1.r(au2Var);
                synchronized (v83Var) {
                    v83Var.a.addFirst(lq3VarR);
                }
                if (!jSONObject4.optBoolean("success")) {
                    throw new e62("process json failed");
                }
                if (((Boolean) tw1.e.c.a(mz1.o2)).booleanValue()) {
                    ga1.n(hg4.C.k, c13Var.f.e, "rendering-native-ads-preprocess-end");
                }
                return pu1.r(jSONObject4.getJSONObject("json").getJSONArray("ads"));
            case 12:
                c13 c13Var2 = (c13) this.b;
                a83 a83Var = (a83) this.c;
                au2 au2Var2 = (au2) obj;
                iz1 iz1Var = mz1.o2;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    ga1.n(hg4.C.k, c13Var2.f.e, "rendering-native-ads-preprocess-start");
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isNonagon", true);
                if (((Boolean) tw1Var.c.a(mz1.p9)).booleanValue() && ob1.m()) {
                    jSONObject5.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("response", a83Var.s.c);
                jSONObject6.put("sdk_params", jSONObject5);
                return pu1.O(au2Var2.a("google.afma.nativeAds.preProcessJson", jSONObject6), new z02(c13Var2, au2Var2, 11), c13Var2.b);
            case 13:
                h83 h83Var = (h83) obj;
                ((e93) this.b).b = h83Var;
                Iterator it2 = ((List) h83Var.b.f).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((a83) it2.next()).a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i2 = 1;
                            }
                        }
                    } else if (i2 != 0) {
                        return ((nl2) this.c).c(pu1.r(h83Var));
                    }
                }
                return lq3.g;
            case 14:
                xb4 xb4Var = (xb4) this.b;
                lm2 lm2Var = (lm2) this.c;
                g73 g73Var = (g73) obj;
                t83 t83Var2 = (t83) xb4Var.g;
                f93 f93Var = g73Var.b;
                fa2 fa2Var5 = g73Var.a;
                synchronized (t83Var2) {
                    try {
                        z83 z83Var = (z83) ((ConcurrentHashMap) t83Var2.g).get(f93Var);
                        if (z83Var != null) {
                            m93 m93Var = z83Var.d;
                            m93Var.getClass();
                            hg4.C.k.getClass();
                            m93Var.c = System.currentTimeMillis();
                            m93Var.d++;
                            z83Var.a();
                            LinkedList linkedList = z83Var.a;
                            if (!linkedList.isEmpty() && (e93Var = (e93) linkedList.remove()) != null) {
                                m93Var.e++;
                                m93Var.b.f = true;
                            }
                            if (e93Var == null) {
                                ((b93) t83Var2.i).e++;
                            }
                            l93 l93Var = z83Var.d.b;
                            l93 l93VarClone = l93Var.clone();
                            l93Var.f = false;
                            l93Var.g = 0;
                            if (e93Var != null) {
                                by1 by1VarA = gy1.A();
                                zx1 zx1VarB = ay1.B();
                                zx1VarB.b();
                                ((ay1) zx1VarB.g).C();
                                cy1 cy1VarA = dy1.A();
                                boolean z = l93VarClone.f;
                                cy1VarA.b();
                                ((dy1) cy1VarA.g).C(z);
                                int i3 = l93VarClone.g;
                                cy1VarA.b();
                                ((dy1) cy1VarA.g).D(i3);
                                zx1VarB.b();
                                ((ay1) zx1VarB.g).D((dy1) cy1VarA.d());
                                by1VarA.b();
                                ((gy1) by1VarA.g).B((ay1) zx1VarB.d());
                                e93Var.a.a().f.H((gy1) by1VarA.d());
                            }
                            t83Var2.a0();
                        } else {
                            ((b93) t83Var2.i).d++;
                            t83Var2.a0();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (e93Var != null && fa2Var5 != null) {
                    nl2 nl2VarA = lm2Var.a();
                    t83 t83Var3 = nl2VarA.h;
                    q93 q93VarA = nl2VarA.c.a(t83Var3.b0(fa2Var5, new ug0(25, t83Var3), new vg0(21, t83Var3), fi1.g), s93.A).A();
                    q93VarA.c(new jq3(q93VarA, new z71(19, nl2VarA), i2), nl2VarA.j);
                    q93VarA.c(new jq3(q93VarA, (su2) xb4Var.i, i2), (Executor) xb4Var.h);
                }
                return pu1.r(new c73(f93Var, fa2Var5, e93Var));
            default:
                return ((kh3) ((tf3) this.c).b.f.get()).h((Context) this.b);
        }
    }

    public z02(tf3 tf3Var, Context context) {
        this.a = 15;
        this.b = context;
        Objects.requireNonNull(tf3Var);
        this.c = tf3Var;
    }
}
