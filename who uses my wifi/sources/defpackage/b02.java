package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b02 {
    public final ScheduledExecutorService a;
    public final jd4 b;
    public final k63 c;
    public final pv2 d;
    public fu1 e;
    public zz1 f;
    public mc2 g;
    public String h;
    public long i = 0;
    public long j;
    public JSONArray k;
    public Context l;

    public b02(ScheduledExecutorService scheduledExecutorService, jd4 jd4Var, k63 k63Var, pv2 pv2Var) {
        this.a = scheduledExecutorService;
        this.b = jd4Var;
        this.c = k63Var;
        this.d = pv2Var;
    }

    public final void a(String str) throws JSONException {
        try {
            mc2 mc2Var = this.g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.j).toString());
            e(jSONObject);
            if (((Boolean) x02.c.w()).booleanValue()) {
                jSONObject.put("as", this.c.b());
            }
            mc2Var.h(jSONObject.toString());
            a02 a02Var = new a02(this, str);
            if (((Boolean) x02.e.w()).booleanValue()) {
                this.b.a(this.g, a02Var);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            ug0.r(this.l, new b3((a3) new a3(1).i1(bundle)), a02Var);
        } catch (JSONException e) {
            gi2.c0("Error creating JSON: ", e);
        }
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) x02.e.w()).booleanValue() ? ((Long) x02.h.w()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) x02.c.w()).booleanValue()) {
            jSONObject.put("as", this.c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) x02.e.w()).booleanValue() ? ((Long) x02.h.w()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) x02.c.w()).booleanValue()) {
            jSONObject.put("as", this.c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (((java.lang.Boolean) defpackage.tw1.e.c.a(defpackage.mz1.Ga)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            zz1 r0 = r7.f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            defpackage.gi2.Z(r0)
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.a
            boolean r0 = r0.get()
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.String r0 = r7.h
            if (r0 == 0) goto L98
            mc2 r0 = r7.g
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r7.a
            if (r0 == 0) goto L98
            long r1 = r7.i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            goto L3a
        L28:
            hg4 r1 = defpackage.hg4.C
            ym r1 = r1.k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3a
            goto L4c
        L3a:
            iz1 r1 = defpackage.mz1.Ga
            tw1 r2 = defpackage.tw1.e
            kz1 r2 = r2.c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L4c:
            mc2 r1 = r7.g
            java.lang.String r2 = r7.h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.Object r4 = r1.i
            nl r4 = (defpackage.nl) r4
            java.lang.Object r1 = r1.h
            p10 r1 = (defpackage.p10) r1
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r5.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L70
            r5 = 0
        L70:
            if (r5 == 0) goto L7b
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L80
            n10 r1 = (defpackage.n10) r1     // Catch: android.os.RemoteException -> L80
            r1.M0(r4, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            n10 r1 = (defpackage.n10) r1     // Catch: android.os.RemoteException -> L80
            r1.Y(r4, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            fu1 r1 = r7.e
            iz1 r2 = defpackage.mz1.Ha
            tw1 r3 = defpackage.tw1.e
            kz1 r3 = r3.c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            defpackage.gi2.G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b02.d():void");
    }

    public final void e(JSONObject jSONObject) throws JSONException {
        try {
            if (this.k == null) {
                this.k = new JSONArray((String) tw1.e.c.a(mz1.Ja));
            }
            jSONObject.put("eids", this.k);
        } catch (JSONException e) {
            gi2.c0("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
