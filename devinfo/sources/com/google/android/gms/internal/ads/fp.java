package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fp implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11251b;

    public /* synthetic */ fp(int i4, Object obj) {
        this.f11250a = i4;
        this.f11251b = obj;
    }

    private final /* synthetic */ vd.b a(Object obj) {
        fu0 fu0Var = (fu0) this.f11251b;
        Exception exc = (Exception) obj;
        synchronized (fu0Var) {
            fu0Var.f11262b = true;
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) throws uf0, JSONException {
        int length;
        vq1 vq1Var;
        x71 x71VarG;
        ar0 ar0Var;
        uo0 uo0Var;
        switch (this.f11250a) {
            case 0:
                cp cpVar = (cp) obj;
                gx gxVar = new gx();
                ep epVar = new ep(this, gxVar);
                ap apVar = (ap) this.f11251b;
                Parcel parcelT = cpVar.T();
                ng.c(parcelT, apVar);
                ng.e(parcelT, epVar);
                cpVar.u1(parcelT, 2);
                return gxVar;
            case 1:
                sv svVar = (sv) this.f11251b;
                Map map = (Map) obj;
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = svVar.f16558h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            vq1Var = (vq1) svVar.f16553b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (vq1Var == null) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb2.append("Cannot find the corresponding resource object for ");
                                    sb2.append(str);
                                    jz.j(sb2.toString());
                                } else {
                                    for (int i4 = 0; i4 < length; i4++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i4).getString("threat_type");
                                        vq1Var.b();
                                        ((wq1) vq1Var.f14755b).G(string);
                                    }
                                    svVar.f16557f = (length > 0) | svVar.f16557f;
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        if (((Boolean) cm.f10166a.u()).booleanValue()) {
                            za.i.d("Failed to get SafeBrowsing metadata", e2);
                        }
                        return yo0.w(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (svVar.f16557f) {
                    synchronized (svVar.f16558h) {
                        yp1 yp1Var = svVar.f16552a;
                        yp1Var.b();
                        ((dr1) yp1Var.f14755b).O(10);
                    }
                }
                boolean z3 = svVar.f16557f;
                if (!(z3 && svVar.g.g) && (!(svVar.f16560k && svVar.g.f16973f) && (z3 || !svVar.g.f16971d))) {
                    return s81.f15906b;
                }
                synchronized (svVar.f16558h) {
                    try {
                        for (vq1 vq1Var2 : svVar.f16553b.values()) {
                            yp1 yp1Var2 = svVar.f16552a;
                            wq1 wq1Var = (wq1) vq1Var2.e();
                            yp1Var2.b();
                            ((dr1) yp1Var2.f14755b).H(wq1Var);
                        }
                        yp1 yp1Var3 = svVar.f16552a;
                        ArrayList arrayList = svVar.f16554c;
                        yp1Var3.b();
                        ((dr1) yp1Var3.f14755b).M(arrayList);
                        ArrayList arrayList2 = svVar.f16555d;
                        yp1Var3.b();
                        ((dr1) yp1Var3.f14755b).N(arrayList2);
                        if (((Boolean) cm.f10166a.u()).booleanValue()) {
                            String strA = ((dr1) yp1Var3.f14755b).A();
                            String strC = ((dr1) yp1Var3.f14755b).C();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strA).length() + 38 + String.valueOf(strC).length() + 15);
                            sb3.append("Sending SB report\n  url: ");
                            sb3.append(strA);
                            sb3.append("\n  clickUrl: ");
                            sb3.append(strC);
                            sb3.append("\n  resources: \n");
                            StringBuilder sb4 = new StringBuilder(sb3.toString());
                            for (wq1 wq1Var2 : DesugarCollections.unmodifiableList(((dr1) yp1Var3.f14755b).B())) {
                                sb4.append("    [");
                                sb4.append(wq1Var2.B());
                                sb4.append("] ");
                                sb4.append(wq1Var2.A());
                            }
                            jz.j(sb4.toString());
                        }
                        ya.p pVarA = new ya.r(svVar.f16556e).a(1, svVar.g.f16969b, null, ((dr1) yp1Var3.e()).b());
                        if (((Boolean) cm.f10166a.u()).booleanValue()) {
                            pVarA.f11625a.a(ce.f10088b, fx.f11274a);
                        }
                        x71VarG = yo0.G(pVarA, o5.f14543d, fx.g);
                    } finally {
                    }
                }
                return x71VarG;
            case 2:
                String str2 = (String) va.s.f36163e.f36166c.a(sk.f16405xb);
                Uri.Builder builder = (Uri.Builder) this.f11251b;
                builder.appendQueryParameter(str2, "12");
                return yo0.e(builder.toString());
            case 3:
                ((r7) this.f11251b).n((Throwable) obj);
                return s81.f15906b;
            case 4:
                return ((mg0) this.f11251b).j((iu) obj);
            case 5:
                return obj != null ? (x71) this.f11251b : yo0.w(new qj0(1, "Retrieve required value in native ad response failed."));
            case 6:
                pg0 pg0Var = (pg0) obj;
                return yo0.e(new dq0(new rg0(9, ((bg0) this.f11251b).f9678c), aw.f(new InputStreamReader(pg0Var.f15002a), pg0Var.f15003b.f12483m)));
            case 7:
                cg0 cg0Var = (cg0) this.f11251b;
                return yo0.e(new dq0(new rg0(9, cg0Var.f10108d), aw.f(new StringReader(((JSONObject) obj).toString()), cg0Var.f10117o)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f11251b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return yo0.e(jSONObject);
                } catch (JSONException e10) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e10.getCause())));
                }
            case 9:
                jl0 jl0Var = (jl0) this.f11251b;
                Throwable th2 = (Throwable) obj;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.K2)).booleanValue()) {
                    qn0 qn0Var = (qn0) jl0Var.f12779c;
                    zw zwVar = ua.j.C.f35265h;
                    int iA = qn0Var.a();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(iA).length() + 22);
                    sb5.append("OptionalSignalTimeout:");
                    sb5.append(iA);
                    zwVar.f(sb5.toString(), th2);
                }
                return s81.f15906b;
            case 10:
                Throwable th3 = (Throwable) obj;
                String str5 = "";
                ((ex) ((zn0) this.f11251b).f19128c).c(new s30(20, th3));
                return yo0.e(th3 instanceof SecurityException ? new am0(str5, 2, 2) : th3 instanceof IllegalStateException ? new am0(str5, 3, 2) : th3 instanceof IllegalArgumentException ? new am0(str5, 4, 2) : th3 instanceof TimeoutException ? new am0(str5, 5, 2) : new am0(str5, 0, 2));
            case 11:
                return yo0.e(new ml0((String) ((xl0) this.f11251b).f18422c, 4));
            case 12:
                ai aiVar = (ai) this.f11251b;
                gr0 gr0Var = (gr0) obj;
                if (gr0Var == null || (ar0Var = gr0Var.f11597a) == null || (uo0Var = gr0Var.f11598b) == null) {
                    throw new uf0(1, "Empty prefetch");
                }
                kj kjVarA = pj.A();
                ij ijVarB = jj.B();
                ijVarB.b();
                ((jj) ijVarB.f14755b).C();
                mj mjVarB = mj.B();
                ijVarB.b();
                ((jj) ijVarB.f14755b).D(mjVarB);
                kjVarA.b();
                ((pj) kjVarA.f14755b).B((jj) ijVarB.e());
                ar0Var.f9390a.b().f18632f.u((pj) kjVarA.e());
                return aiVar.q(ar0Var, uo0Var.f17274b);
            case 13:
                return a(obj);
            case 14:
                return yo0.e(((lr0) this.f11251b).mo170c(obj));
            case 15:
                az0 az0Var = (az0) obj;
                if (az0Var != null) {
                    return yo0.e(az0Var);
                }
                dz0 dz0Var = (dz0) this.f11251b;
                dz0Var.f10621e.b(51);
                return yo0.F(n81.s(yo0.z(dz0Var.f10620d, new cz0(dz0Var, 2))), k20.f12999n, k81.f13081a);
            case 16:
                return ((a11) this.f11251b).f9184b.c();
            case 17:
                c11 c11Var = (c11) this.f11251b;
                if (!c11Var.f9915a.a((zy0) obj)) {
                    c11Var.f9919e.b(20103);
                    throw new ac.m(1);
                }
                r11 r11Var = c11Var.f9916b;
                ky0 ky0Var = r11Var.f15503b;
                ky0Var.getClass();
                h91 h91VarZ = yo0.z(ky0Var.f13290b, new go0(4, ky0Var));
                r11Var.f15505d.e(20304, h91VarZ);
                return yo0.G(h91VarZ, new hu(12, c11Var), k81.f13081a);
            default:
                return ((i11) ((f11) this.f11251b).f10962f).a();
        }
    }

    public /* synthetic */ fp(fu0 fu0Var, rg0 rg0Var) {
        this.f11250a = 13;
        this.f11251b = fu0Var;
    }

    public fp(hp hpVar, ap apVar) {
        this.f11250a = 0;
        this.f11251b = apVar;
    }

    public fp(dz0 dz0Var) {
        this.f11250a = 15;
        Objects.requireNonNull(dz0Var);
        this.f11251b = dz0Var;
    }
}
