package com.google.android.gms.internal.ads;

import A2.C0117e;
import android.content.Context;
import android.os.Bundle;
import j2.C2550f;
import j2.C2551g;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* loaded from: classes.dex */
public final class S9 {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f11139a;

    /* renamed from: b, reason: collision with root package name */
    public final A2.L f11140b;

    /* renamed from: c, reason: collision with root package name */
    public final A2.G f11141c;

    /* renamed from: d, reason: collision with root package name */
    public final C0852Zn f11142d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC1883t f11143e;

    /* renamed from: f, reason: collision with root package name */
    public R9 f11144f;

    /* renamed from: g, reason: collision with root package name */
    public c1.g f11145g;

    /* renamed from: h, reason: collision with root package name */
    public String f11146h;
    public long i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f11147j;

    /* renamed from: k, reason: collision with root package name */
    public JSONArray f11148k;

    /* renamed from: l, reason: collision with root package name */
    public Context f11149l;

    public S9(ScheduledExecutorService scheduledExecutorService, A2.L l2, A2.G g2, C0852Zn c0852Zn) {
        this.f11139a = scheduledExecutorService;
        this.f11140b = l2;
        this.f11141c = g2;
        this.f11142d = c0852Zn;
    }

    public final void a(String str) throws JSONException {
        try {
            c1.g gVar = this.f11145g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f11147j).toString());
            e(jSONObject);
            if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue()) {
                jSONObject.put("as", this.f11141c.b());
            }
            gVar.C(jSONObject.toString());
            A2.z zVar = new A2.z(this, str);
            if (((Boolean) AbstractC1642oa.f15959e.v()).booleanValue()) {
                this.f11140b.a(this.f11145g, zVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            C0117e.t(this.f11149l, new C2551g((C2550f) new C2550f(1).b(bundle)), zVar);
        } catch (JSONException e6) {
            u2.k.f("Error creating JSON: ", e6);
        }
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1642oa.f15959e.v()).booleanValue() ? ((Long) AbstractC1642oa.f15962h.v()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue()) {
            jSONObject.put("as", this.f11141c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) AbstractC1642oa.f15959e.v()).booleanValue() ? ((Long) AbstractC1642oa.f15962h.v()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue()) {
            jSONObject.put("as", this.f11141c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (((java.lang.Boolean) q2.C2841s.f23267e.f23270c.a(com.google.android.gms.internal.ads.H9.db)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.R9 r0 = r7.f11144f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            u2.k.e(r0)
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f10861a
            boolean r0 = r0.get()
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.String r0 = r7.f11146h
            if (r0 == 0) goto L98
            c1.g r0 = r7.f11145g
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r7.f11139a
            if (r0 == 0) goto L98
            long r1 = r7.i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            goto L3a
        L28:
            p2.j r1 = p2.j.f22785C
            Q2.a r1 = r1.f22797k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3a
            goto L4c
        L3a:
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.db
            q2.s r2 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r2 = r2.f23270c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L4c:
            c1.g r1 = r7.f11145g
            java.lang.String r2 = r7.f11146h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.Object r4 = r1.f5898d
            r.e r4 = (r.BinderC2862e) r4
            java.lang.Object r1 = r1.f5897c
            b.d r1 = (b.d) r1
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r5.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L70
            r5 = 0
        L70:
            if (r5 == 0) goto L7b
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L80
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L80
            r1.I0(r4, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L80
            r1.k0(r4, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            com.google.android.gms.internal.ads.t r1 = r7.f11143e
            com.google.android.gms.internal.ads.E9 r2 = com.google.android.gms.internal.ads.H9.eb
            q2.s r3 = q2.C2841s.f23267e
            com.google.android.gms.internal.ads.G9 r3 = r3.f23270c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            t2.AbstractC2907C.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.S9.d():void");
    }

    public final void e(JSONObject jSONObject) throws JSONException {
        try {
            if (this.f11148k == null) {
                this.f11148k = new JSONArray((String) C2841s.f23267e.f23270c.a(H9.gb));
            }
            jSONObject.put("eids", this.f11148k);
        } catch (JSONException e6) {
            u2.k.f("Error fetching the PACT active eids JSON: ", e6);
        }
    }
}
