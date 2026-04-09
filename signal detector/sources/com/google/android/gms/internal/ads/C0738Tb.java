package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.Tb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738Tb implements InterfaceC1736qD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11414b;

    public /* synthetic */ C0738Tb(int i, Object obj) {
        this.f11413a = i;
        this.f11414b = obj;
    }

    private final /* synthetic */ InterfaceFutureC2326a a(Object obj) {
        C0907aw c0907aw = (C0907aw) this.f11414b;
        Exception exc = (Exception) obj;
        synchronized (c0907aw) {
            c0907aw.f13265b = true;
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1736qD
    public final InterfaceFutureC2326a b(Object obj) throws JSONException, C0836Yo {
        int length;
        JM jm;
        C1358jD c1358jDG;
        C1877su c1877su;
        C1769qt c1769qt;
        switch (this.f11413a) {
            case 0:
                C0687Qb c0687Qb = (C0687Qb) obj;
                C0657Of c0657Of = new C0657Of();
                BinderC0721Sb binderC0721Sb = new BinderC0721Sb(this, c0657Of);
                C0653Ob c0653Ob = (C0653Ob) this.f11414b;
                Parcel parcelH0 = c0687Qb.h0();
                C7.c(parcelH0, c0653Ob);
                C7.e(parcelH0, binderC0721Sb);
                c0687Qb.d1(parcelH0, 2);
                return c0657Of;
            case 1:
                C0945bf c0945bf = (C0945bf) this.f11414b;
                Map map = (Map) obj;
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = c0945bf.f13405h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            jm = (JM) c0945bf.f13399b.get(str);
                                        }
                                    } finally {
                                    }
                                }
                                if (jm == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    AbstractC1114el.h(sb.toString());
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                        jm.b();
                                        ((KM) jm.f13551b).G(string);
                                    }
                                    c0945bf.f13403f = (length > 0) | c0945bf.f13403f;
                                }
                            }
                        }
                    } catch (JSONException e6) {
                        if (((Boolean) AbstractC1803ra.f16566a.v()).booleanValue()) {
                            u2.k.d("Failed to get SafeBrowsing metadata", e6);
                        }
                        return AbstractC1984ut.w(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (c0945bf.f13403f) {
                    synchronized (c0945bf.f13405h) {
                        C1529mM c1529mM = c0945bf.f13398a;
                        c1529mM.b();
                        ((RM) c1529mM.f13551b).O(10);
                    }
                }
                boolean z6 = c0945bf.f13403f;
                if (!(z6 && c0945bf.f13404g.f13594g) && (!(c0945bf.f13407k && c0945bf.f13404g.f13593f) && (z6 || !c0945bf.f13404g.f13591d))) {
                    return ED.f7928b;
                }
                synchronized (c0945bf.f13405h) {
                    try {
                        for (JM jm2 : c0945bf.f13399b.values()) {
                            C1529mM c1529mM2 = c0945bf.f13398a;
                            KM km = (KM) jm2.d();
                            c1529mM2.b();
                            ((RM) c1529mM2.f13551b).H(km);
                        }
                        C1529mM c1529mM3 = c0945bf.f13398a;
                        ArrayList arrayList = c0945bf.f13400c;
                        c1529mM3.b();
                        ((RM) c1529mM3.f13551b).M(arrayList);
                        ArrayList arrayList2 = c0945bf.f13401d;
                        c1529mM3.b();
                        ((RM) c1529mM3.f13551b).N(arrayList2);
                        if (((Boolean) AbstractC1803ra.f16566a.v()).booleanValue()) {
                            String strA = ((RM) c1529mM3.f13551b).A();
                            String strC = ((RM) c1529mM3.f13551b).C();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strA).length() + 38 + String.valueOf(strC).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(strA);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(strC);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (KM km2 : Collections.unmodifiableList(((RM) c1529mM3.f13551b).B())) {
                                sb3.append("    [");
                                sb3.append(km2.B());
                                sb3.append("] ");
                                sb3.append(km2.A());
                            }
                            AbstractC1114el.h(sb3.toString());
                        }
                        t2.s sVarA = new t2.u(c0945bf.f13402e).a(1, c0945bf.f13404g.f13589b, null, ((RM) c1529mM3.d()).b());
                        if (((Boolean) AbstractC1803ra.f16566a.v()).booleanValue()) {
                            sVarA.f10212a.a(RunnableC1944u6.f17057b, AbstractC0640Nf.f10005a);
                        }
                        c1358jDG = AbstractC1984ut.G(sVarA, C1563n2.f15712d, AbstractC0640Nf.f10011g);
                    } finally {
                    }
                }
                return c1358jDG;
            case 2:
                String str2 = (String) C2841s.f23267e.f23270c.a(H9.vb);
                Uri.Builder builder = (Uri.Builder) this.f11414b;
                builder.appendQueryParameter(str2, "12");
                return AbstractC1984ut.e(builder.toString());
            case 3:
                ((C1726q3) this.f11414b).u((Throwable) obj);
                return ED.f7928b;
            case 4:
                return ((C1657op) this.f11414b).e((C1807re) obj);
            case 5:
                return obj != null ? (C1358jD) this.f11414b : AbstractC1984ut.w(new C0736Sq(1, "Retrieve required value in native ad response failed."));
            case 6:
                C1818rp c1818rp = (C1818rp) obj;
                return AbstractC1984ut.e(new Xt(new Nx(28, ((C1118ep) this.f11414b).f13981c), C1431kf.f(new InputStreamReader(c1818rp.f16618a), c1818rp.f16619b.f16587m)));
            case 7:
                C1173fp c1173fp = (C1173fp) this.f11414b;
                return AbstractC1984ut.e(new Xt(new Nx(28, c1173fp.f14146d), C1431kf.f(new StringReader(((JSONObject) obj).toString()), c1173fp.f14156o)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f11414b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return AbstractC1984ut.e(jSONObject);
                } catch (JSONException e7) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e7.getCause())));
                }
            case 9:
                Lr lr = (Lr) this.f11414b;
                Throwable th = (Throwable) obj;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8623K2)).booleanValue()) {
                    Ms ms = (Ms) lr.f9772c;
                    C0538Hf c0538Hf = p2.j.f22785C.f22795h;
                    int iC = ms.c();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iC).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(iC);
                    c0538Hf.f(sb4.toString(), th);
                }
                return ED.f7928b;
            case 10:
                Throwable th2 = (Throwable) obj;
                String str5 = "";
                ((C0623Mf) ((Us) this.f11414b).f11806c).a(new RunnableC0558Ii(21, th2));
                return AbstractC1984ut.e(th2 instanceof SecurityException ? new C0958bs(str5, 2, 2) : th2 instanceof IllegalStateException ? new C0958bs(str5, 3, 2) : th2 instanceof IllegalArgumentException ? new C0958bs(str5, 4, 2) : th2 instanceof TimeoutException ? new C0958bs(str5, 5, 2) : new C0958bs(str5, 0, 2));
            case 11:
                return AbstractC1984ut.e(new Or((String) ((Yr) this.f11414b).f12716c, 4));
            case 12:
                C1677p8 c1677p8 = (C1677p8) this.f11414b;
                C2201yu c2201yu = (C2201yu) obj;
                if (c2201yu == null || (c1877su = c2201yu.f17785a) == null || (c1769qt = c2201yu.f17786b) == null) {
                    throw new C0836Yo(1, "Empty prefetch");
                }
                Z8 z8A = C1084e9.A();
                X8 x8B = Y8.B();
                x8B.b();
                ((Y8) x8B.f13551b).C();
                C0921b9 c0921b9B = C0921b9.B();
                x8B.b();
                ((Y8) x8B.f13551b).D(c0921b9B);
                z8A.b();
                ((C1084e9) z8A.f13551b).B((Y8) x8B.d());
                c1877su.f16818a.a().f7399f.H((C1084e9) z8A.d());
                return c1677p8.r(c1877su, c1769qt.f16415b);
            case 13:
                return a(obj);
            case 14:
                return AbstractC1984ut.e(((Eu) this.f11414b).b(obj));
            case 15:
                My my = (My) obj;
                if (my != null) {
                    return AbstractC1984ut.e(my);
                }
                Py py = (Py) this.f11414b;
                py.f10545e.b(51);
                return AbstractC1984ut.F(AbstractC2221zD.r(AbstractC1984ut.z(new Oy(py, 2), py.f10544d)), C1704pi.f16212n, EnumC2059wD.f17407a);
            case 16:
                return ((Nz) this.f11414b).f10112b.b();
            case 17:
                Pz pz = (Pz) this.f11414b;
                if (!pz.f10546a.a((Ly) obj)) {
                    pz.f10550e.b(20103);
                    throw new J0.c(1);
                }
                C1140fA c1140fA = pz.f10547b;
                C2043vy c2043vy = c1140fA.f14032b;
                c2043vy.getClass();
                TD tdZ = AbstractC1984ut.z(new Zs(4, c2043vy), c2043vy.f17373b);
                c1140fA.f14034d.e(20304, tdZ);
                return AbstractC1984ut.G(tdZ, new C1754qe(12, pz), EnumC2059wD.f17407a);
            default:
                return ((Vz) ((Sz) this.f11414b).f11305f).c();
        }
    }

    public /* synthetic */ C0738Tb(C0907aw c0907aw, L6 l6) {
        this.f11413a = 13;
        this.f11414b = c0907aw;
    }

    public C0738Tb(H1.h hVar, C0653Ob c0653Ob) {
        this.f11413a = 0;
        this.f11414b = c0653Ob;
    }

    public C0738Tb(Py py) {
        this.f11413a = 15;
        Objects.requireNonNull(py);
        this.f11414b = py;
    }
}
