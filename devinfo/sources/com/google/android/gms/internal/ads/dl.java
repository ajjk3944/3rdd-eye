package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    public long f10497a = 9205357640488583168L;

    /* renamed from: b, reason: collision with root package name */
    public long f10498b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10499c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10500d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10501e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10502f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10503h;

    /* renamed from: i, reason: collision with root package name */
    public Object f10504i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f10505k;

    /* renamed from: l, reason: collision with root package name */
    public Object f10506l;

    public dl(ScheduledExecutorService scheduledExecutorService, fb.z zVar, fb.v vVar, ud0 ud0Var) {
        this.f10499c = scheduledExecutorService;
        this.f10500d = zVar;
        this.f10501e = vVar;
        this.f10502f = ud0Var;
    }

    public static void c(dl dlVar, z1.b bVar, long j, long j8, int i4) {
        if ((i4 & 4) != 0) {
            j8 = 0;
        }
        d0.s1 s1Var = (d0.s1) dlVar.f10499c;
        d0.p0 p0Var = (d0.p0) dlVar.f10502f;
        if (p0Var == null) {
            p0Var = new d0.p0();
            p0Var.f21811e = null;
            p0Var.f21812f = Long.MAX_VALUE;
            p0Var.g = false;
            dlVar.f10502f = p0Var;
        }
        p0Var.f21811e = bVar;
        p0Var.f21812f = j;
        androidx.recyclerview.widget.d dVar = (androidx.recyclerview.widget.d) dlVar.j;
        if (dVar == null) {
            dlVar.j = new androidx.recyclerview.widget.d(s1Var.f21831q);
        } else {
            dVar.f1324c = s1Var.f21831q;
            dVar.f1323b = j8;
        }
        p0Var.g = false;
        dlVar.f10503h = p0Var;
    }

    public void a() {
        d0.n0 n0Var = (d0.n0) this.f10500d;
        d0.m0 m0Var = d0.m0.f21789c;
        if (n0Var == null) {
            n0Var = new d0.n0();
            n0Var.f21797e = m0Var;
            n0Var.f21798f = false;
            this.f10500d = n0Var;
        }
        n0Var.f21797e = m0Var;
        n0Var.f21798f = false;
        this.f10503h = n0Var;
    }

    public void b(z1.b bVar, long j, androidx.recyclerview.widget.d dVar) {
        d0.o0 o0Var = (d0.o0) this.g;
        if (o0Var == null) {
            o0Var = new d0.o0();
            o0Var.f21805e = null;
            o0Var.f21806f = Long.MAX_VALUE;
            this.g = o0Var;
        }
        o0Var.f21805e = bVar;
        o0Var.f21806f = j;
        dVar.f1323b = 0L;
        this.f10503h = o0Var;
    }

    public o7.d d() {
        o7.d dVar = (o7.d) this.f10504i;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public void e(z1.b bVar, z1.a aVar, long j) {
        d0.s1 s1Var = (d0.s1) this.f10499c;
        long jU = i2.k.r(s1Var).u(0L);
        if (!o1.b.b(this.f10497a, 9205357640488583168L) && !o1.b.b(jU, this.f10497a)) {
            this.f10498b = o1.b.h(this.f10498b, o1.b.g(jU, this.f10497a));
        }
        this.f10497a = jU;
        d0.a1 a1Var = s1Var.f21831q;
        nk.k.b(a1Var);
        int i4 = d0.j0.f21764a;
        if (Math.abs(Float.intBitsToFloat((int) (a1Var == d0.a1.f21662a ? j & 4294967295L : j >> 32))) > 2.0f) {
            d0.m1.a(d(), bVar, s1Var.f21831q, aVar, (dc) this.f10505k, this.f10498b);
            dc dcVar = (dc) this.f10506l;
            ArrayList arrayList = dcVar.f10425b;
            if (arrayList.size() == 3) {
                int i10 = dcVar.f10424a;
                dcVar.f10424a = i10 + 1;
                arrayList.set(i10, new o1.b(j));
            } else {
                arrayList.add(new o1.b(j));
            }
            if (dcVar.f10424a == 3) {
                dcVar.f10424a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((o1.b) arrayList.get(i11)).f30364a >> 32))));
            }
            float fY = (float) zj.n.Y(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((o1.b) arrayList.get(i12)).f30364a & 4294967295L))));
            }
            s1Var.z0(new d0.s((Float.floatToRawIntBits((float) zj.n.Y(arrayList3)) & 4294967295L) | (Float.floatToRawIntBits(fY) << 32), true));
        }
    }

    public void f(z1.b bVar, z1.b bVar2, z1.a aVar, long j) {
        d0.s1 s1Var = (d0.s1) this.f10499c;
        if (((o7.d) this.f10504i) == null) {
            this.f10504i = new o7.d(9);
        }
        this.f10498b = 0L;
        d0.m1.a(d(), bVar, s1Var.f21831q, aVar, (dc) this.f10505k, this.f10498b);
        long jG = o1.b.g(d0.m1.g(bVar2, s1Var.f21831q, aVar), j);
        s1Var.f21832r.getClass();
        this.f10497a = i2.k.r(s1Var).u(0L);
        s1Var.z0(new d0.t(jG));
        dc dcVar = (dc) this.f10506l;
        dcVar.f10424a = 0;
        dcVar.f10425b.clear();
    }

    public void g(String str) throws Throwable {
        try {
            u.p pVar = (u.p) this.f10504i;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f10498b).toString());
            k(jSONObject);
            if (((Boolean) zl.f19112c.u()).booleanValue()) {
                jSONObject.put("as", ((fb.v) this.f10501e).b());
            }
            pVar.a(jSONObject.toString());
            cl clVar = new cl(this, str);
            if (((Boolean) zl.f19114e.u()).booleanValue()) {
                ((fb.z) this.f10500d).a((u.p) this.f10504i, clVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            o7.d.m((Context) this.f10506l, new pa.g((pa.f) new pa.f(7).l(bundle)), clVar);
        } catch (JSONException e2) {
            za.i.f("Error creating JSON: ", e2);
        }
    }

    public JSONObject h(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zl.f19114e.u()).booleanValue() ? ((Long) zl.f19116h.u()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) zl.f19112c.u()).booleanValue()) {
            jSONObject.put("as", ((fb.v) this.f10501e).b());
        }
        return jSONObject;
    }

    public JSONObject i(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zl.f19114e.u()).booleanValue() ? ((Long) zl.f19116h.u()).longValue() : 0L);
        k(jSONObject);
        if (((Boolean) zl.f19112c.u()).booleanValue()) {
            jSONObject.put("as", ((fb.v) this.f10501e).b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (((java.lang.Boolean) va.s.f36163e.f36166c.a(com.google.android.gms.internal.ads.sk.f16127fb)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f10503h
            com.google.android.gms.internal.ads.bl r0 = (com.google.android.gms.internal.ads.bl) r0
            if (r0 != 0) goto Lc
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            za.i.e(r0)
            return
        Lc:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f9709c
            boolean r0 = r0.get()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.Object r0 = r7.j
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto La2
            java.lang.Object r0 = r7.f10504i
            u.p r0 = (u.p) r0
            if (r0 == 0) goto La2
            java.lang.Object r0 = r7.f10499c
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0
            if (r0 == 0) goto La2
            long r1 = r7.f10497a
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L30
            goto L42
        L30:
            ua.j r1 = ua.j.C
            tb.a r1 = r1.f35267k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.f10497a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L42
            goto L54
        L42:
            com.google.android.gms.internal.ads.pk r1 = com.google.android.gms.internal.ads.sk.f16127fb
            va.s r2 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r2 = r2.f36166c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto La2
        L54:
            java.lang.Object r1 = r7.f10504i
            u.p r1 = (u.p) r1
            java.lang.Object r2 = r7.j
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            u.g r4 = r1.f34722c
            b.d r1 = r1.f34721b
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L88
            r5.<init>()     // Catch: android.os.RemoteException -> L88
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L88
            if (r6 == 0) goto L78
            r5 = 0
        L78:
            if (r5 == 0) goto L83
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L88
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L88
            r1.r0(r4, r2, r3)     // Catch: android.os.RemoteException -> L88
            goto L88
        L83:
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L88
            r1.e0(r4, r2)     // Catch: android.os.RemoteException -> L88
        L88:
            java.lang.Object r1 = r7.g
            com.google.android.gms.internal.ads.s r1 = (com.google.android.gms.internal.ads.s) r1
            com.google.android.gms.internal.ads.pk r2 = com.google.android.gms.internal.ads.sk.f16142gb
            va.s r3 = va.s.f36163e
            com.google.android.gms.internal.ads.rk r3 = r3.f36166c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        La2:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            ya.a0.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dl.j():void");
    }

    public void k(JSONObject jSONObject) throws JSONException {
        try {
            if (((JSONArray) this.f10505k) == null) {
                this.f10505k = new JSONArray((String) va.s.f36163e.f36166c.a(sk.f16171ib));
            }
            jSONObject.put("eids", (JSONArray) this.f10505k);
        } catch (JSONException e2) {
            za.i.f("Error fetching the PACT active eids JSON: ", e2);
        }
    }

    public dl(d0.s1 s1Var) {
        this.f10499c = s1Var;
        dc dcVar = new dc();
        dcVar.f10425b = new ArrayList();
        this.f10505k = dcVar;
        dc dcVar2 = new dc();
        dcVar2.f10425b = new ArrayList();
        this.f10506l = dcVar2;
        this.f10498b = 0L;
    }
}
