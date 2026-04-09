package defpackage;

import android.net.Uri;
import android.os.Parcel;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u42 implements yp3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u42(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yp3
    public final n70 c(Object obj) throws JSONException, hx2 {
        int length;
        u84 u84Var;
        rp3 rp3VarP;
        e93 e93Var;
        a73 a73Var;
        ar3 ar3VarD;
        switch (this.a) {
            case 0:
                s42 s42Var = (s42) obj;
                pd2 pd2Var = new pd2();
                t42 t42Var = new t42(this, pd2Var);
                q42 q42Var = (q42) this.b;
                Parcel parcelU = s42Var.U();
                iv1.c(parcelU, q42Var);
                iv1.e(parcelU, t42Var);
                s42Var.X0(parcelU, 2);
                return pd2Var;
            case 1:
                qb2 qb2Var = (qb2) this.b;
                Map map = (Map) obj;
                qb2Var.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = qb2Var.h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            u84Var = (u84) qb2Var.b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (u84Var == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    wl2.F(sb.toString());
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                        u84Var.b();
                                        ((v84) u84Var.g).G(string);
                                    }
                                    qb2Var.f = (length > 0) | qb2Var.f;
                                }
                            }
                        }
                    } catch (JSONException unused) {
                        if (((Boolean) e12.a.w()).booleanValue()) {
                            gi2.q0(3);
                        }
                        return pu1.B(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (qb2Var.f) {
                    synchronized (qb2Var.h) {
                        y74 y74Var = qb2Var.a;
                        y74Var.b();
                        ((c94) y74Var.g).O(10);
                    }
                }
                boolean z = qb2Var.f;
                if (!(z && qb2Var.g.l) && (!(qb2Var.k && qb2Var.g.k) && (z || !qb2Var.g.i))) {
                    return lq3.g;
                }
                synchronized (qb2Var.h) {
                    try {
                        for (u84 u84Var2 : qb2Var.b.values()) {
                            y74 y74Var2 = qb2Var.a;
                            v84 v84Var = (v84) u84Var2.d();
                            y74Var2.b();
                            ((c94) y74Var2.g).H(v84Var);
                        }
                        y74 y74Var3 = qb2Var.a;
                        ArrayList arrayList = qb2Var.c;
                        y74Var3.b();
                        ((c94) y74Var3.g).M(arrayList);
                        ArrayList arrayList2 = qb2Var.d;
                        y74Var3.b();
                        ((c94) y74Var3.g).N(arrayList2);
                        if (((Boolean) e12.a.w()).booleanValue()) {
                            String strA = ((c94) y74Var3.g).A();
                            String strC = ((c94) y74Var3.g).C();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 38 + String.valueOf(strC).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(strA);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(strC);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (v84 v84Var2 : Collections.unmodifiableList(((c94) y74Var3.g).B())) {
                                sb3.append("    [");
                                sb3.append(v84Var2.B());
                                sb3.append("] ");
                                sb3.append(v84Var2.A());
                            }
                            wl2.F(sb3.toString());
                        }
                        t12 t12VarA = new p32(qb2Var.e).a(1, qb2Var.g.g, null, ((c94) y74Var3.d()).b());
                        if (((Boolean) e12.a.w()).booleanValue()) {
                            t12VarA.f.c(vr.g, md2.a);
                        }
                        rp3VarP = pu1.P(t12VarA, gj1.f, md2.g);
                    } finally {
                    }
                }
                return rp3VarP;
            case 2:
                String str2 = (String) tw1.e.c.a(mz1.Ya);
                Uri.Builder builder = (Uri.Builder) this.b;
                builder.appendQueryParameter(str2, "12");
                return pu1.r(builder.toString());
            case 3:
                ((g4) this.b).s((Throwable) obj);
                return lq3.g;
            case 4:
                return ((ky2) this.b).e((fa2) obj);
            case 5:
                return obj != null ? (rp3) this.b : pu1.B(new r13("Retrieve required value in native ad response failed.", 1));
            case 6:
                ny2 ny2Var = (ny2) obj;
                return pu1.r(new h83(new f20(26, ((yx2) this.b).c), p21.y(new InputStreamReader(ny2Var.a), ny2Var.b.r)));
            case 7:
                zx2 zx2Var = (zx2) this.b;
                return pu1.r(new h83(new f20(26, zx2Var.d), p21.y(new StringReader(((JSONObject) obj).toString()), zx2Var.o)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return pu1.r(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            case 9:
                x43 x43Var = (x43) this.b;
                Throwable th = (Throwable) obj;
                if (((Boolean) tw1.e.c.a(mz1.v2)).booleanValue()) {
                    q53 q53Var = x43Var.a;
                    gd2 gd2Var = hg4.C.h;
                    int iD = q53Var.d();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iD).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(iD);
                    gd2Var.d(sb4.toString(), th);
                }
                return lq3.g;
            case 10:
                Throwable th2 = (Throwable) obj;
                String str5 = "";
                ((ld2) ((y53) this.b).c).a(new bs2(13, th2));
                return pu1.r(th2 instanceof SecurityException ? new t33(str5, 2, 1) : th2 instanceof IllegalStateException ? new t33(str5, 3, 1) : th2 instanceof IllegalArgumentException ? new t33(str5, 4, 1) : th2 instanceof TimeoutException ? new t33(str5, 5, 1) : new t33(str5, 0, 1));
            case 11:
                return pu1.r(new j33((String) ((g33) this.b).c, 4));
            case 12:
                bu1 bu1Var = (bu1) this.b;
                k93 k93Var = (k93) obj;
                if (k93Var == null || (e93Var = k93Var.a) == null || (a73Var = k93Var.b) == null) {
                    throw new hx2("Empty prefetch", 1);
                }
                by1 by1VarA = gy1.A();
                zx1 zx1VarB = ay1.B();
                zx1VarB.b();
                ((ay1) zx1VarB.g).C();
                dy1 dy1VarB = dy1.B();
                zx1VarB.b();
                ((ay1) zx1VarB.g).D(dy1VarB);
                by1VarA.b();
                ((gy1) by1VarA.g).B((ay1) zx1VarB.d());
                e93Var.a.a().f.A0((gy1) by1VarA.d());
                return bu1Var.w(e93Var, a73Var.b);
            case 13:
                gc3 gc3Var = (gc3) this.b;
                Exception exc = (Exception) obj;
                synchronized (gc3Var) {
                    gc3Var.b = true;
                    throw exc;
                }
            case 14:
                return pu1.r(((o93) this.b).c(obj));
            case 15:
                kh3 kh3Var = (kh3) obj;
                if (kh3Var != null) {
                    return pu1.r(kh3Var);
                }
                nh3 nh3Var = (nh3) this.b;
                nh3Var.e.b(51);
                return pu1.O(gq3.r(pu1.D(new mh3(nh3Var, 2), nh3Var.d)), fi1.o, dq3.f);
            case 16:
                return ((kj3) ((xi3) this.b).b.d()).d();
            case 17:
                mj3 mj3Var = (mj3) this.b;
                if (!mj3Var.a.a((jh3) obj)) {
                    mj3Var.e.b(20103);
                    throw new rg(1);
                }
                rj3 rj3Var = mj3Var.b;
                switch (rj3Var.a) {
                    case 0:
                        lg3 lg3Var = rj3Var.c;
                        lg3Var.getClass();
                        ar3VarD = pu1.D(new w53(5, lg3Var), lg3Var.b);
                        rj3Var.e.d(15304, ar3VarD);
                        break;
                    default:
                        lg3 lg3Var2 = rj3Var.c;
                        lg3Var2.getClass();
                        ar3VarD = pu1.D(new w53(5, lg3Var2), lg3Var2.b);
                        rj3Var.e.d(20304, ar3VarD);
                        break;
                }
                return pu1.P(ar3VarD, new vn1(13, mj3Var), dq3.f);
            default:
                return ((rj3) ((pj3) this.b).f).a();
        }
    }

    public /* synthetic */ u42(gc3 gc3Var, z71 z71Var) {
        this.a = 13;
        this.b = gc3Var;
    }

    public u42(ij ijVar, q42 q42Var) {
        this.a = 0;
        this.b = q42Var;
    }

    public u42(nh3 nh3Var) {
        this.a = 15;
        Objects.requireNonNull(nh3Var);
        this.b = nh3Var;
    }
}
