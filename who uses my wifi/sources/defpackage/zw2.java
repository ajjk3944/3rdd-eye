package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zw2 {
    public final ax2 a;
    public final fx2 b;
    public final pw2 c;
    public final vw2 d;
    public final z20 e;
    public final ex2 f;
    public final m92 g;
    public final m92 h;
    public final String i;
    public final Context j;
    public final String k;
    public JSONObject p;
    public boolean s;
    public int t;
    public boolean u;
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public String o = "{}";
    public long q = Long.MAX_VALUE;
    public ww2 r = ww2.f;
    public yw2 v = yw2.f;
    public long w = 0;
    public String x = "";

    public zw2(ax2 ax2Var, fx2 fx2Var, pw2 pw2Var, Context context, e51 e51Var, vw2 vw2Var, ex2 ex2Var, m92 m92Var, m92 m92Var2, String str) {
        this.a = ax2Var;
        this.b = fx2Var;
        this.c = pw2Var;
        this.e = new z20(context);
        this.i = e51Var.f;
        this.k = str;
        this.d = vw2Var;
        this.f = ex2Var;
        this.g = m92Var;
        this.h = m92Var2;
        this.j = context;
        hg4.C.o.g = this;
    }

    public final void a() throws JSONException {
        String str;
        boolean z;
        iz1 iz1Var = mz1.I9;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
            if (((Boolean) tw1Var.c.a(mz1.X9)).booleanValue()) {
                ra4 ra4VarG = hg4.C.h.g();
                ra4VarG.h();
                synchronized (ra4VarG.a) {
                    z = ra4VarG.y;
                }
                if (z) {
                    j();
                    return;
                }
            }
            ra4 ra4VarG2 = hg4.C.h.g();
            ra4VarG2.h();
            synchronized (ra4VarG2.a) {
                str = ra4VarG2.x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z) {
        if (!this.u && z) {
            j();
        }
        g(z, true);
    }

    public final synchronized void c(String str, rw2 rw2Var) {
        iz1 iz1Var = mz1.I9;
        tw1 tw1Var = tw1.e;
        if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && f()) {
            if (this.t >= ((Integer) tw1Var.c.a(mz1.K9)).intValue()) {
                gi2.i0("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.t++;
            ((List) map.get(str)).add(rw2Var);
            if (((Boolean) tw1Var.c.a(mz1.ga)).booleanValue()) {
                String str2 = rw2Var.h;
                this.m.put(str2, rw2Var);
                HashMap map2 = this.n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((pd2) it.next()).a(rw2Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized pd2 d(String str) {
        pd2 pd2Var;
        try {
            pd2Var = new pd2();
            HashMap map = this.m;
            if (map.containsKey(str)) {
                pd2Var.a((rw2) map.get(str));
            } else {
                HashMap map2 = this.n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(pd2Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return pd2Var;
    }

    public final synchronized void e(ms2 ms2Var, yw2 yw2Var) {
        if (!f()) {
            try {
                ms2Var.g0(zt0.Q(18, null, null));
                return;
            } catch (RemoteException unused) {
                gi2.i0("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) tw1.e.c.a(mz1.I9)).booleanValue()) {
            this.v = yw2Var;
            this.a.a(ms2Var, new z32(this, 1), new k32(4, this.f), new z32(this, 0));
            return;
        } else {
            try {
                ms2Var.g0(zt0.Q(1, null, null));
                return;
            } catch (RemoteException unused2) {
                gi2.i0("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean f() {
        if (((Boolean) tw1.e.c.a(mz1.X9)).booleanValue()) {
            return this.s || hg4.C.o.g();
        }
        return this.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            iz1 r2 = defpackage.mz1.X9     // Catch: java.lang.Throwable -> L27
            tw1 r0 = defpackage.tw1.e     // Catch: java.lang.Throwable -> L27
            kz1 r0 = r0.c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            hg4 r2 = defpackage.hg4.C     // Catch: java.lang.Throwable -> L27
            us1 r2 = r2.o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.k()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.f()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.l()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.m()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw2.g(boolean, boolean):void");
    }

    public final synchronized void h(ww2 ww2Var, boolean z) {
        try {
            if (this.r != ww2Var) {
                if (f()) {
                    l();
                }
                this.r = ww2Var;
                if (f()) {
                    k();
                }
                if (z) {
                    m();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (rw2 rw2Var : (List) entry.getValue()) {
                    if (rw2Var.j != qw2.f) {
                        jSONArray.put(rw2Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void j() throws JSONException {
        String str;
        String str2;
        this.u = true;
        vw2 vw2Var = this.d;
        vw2Var.getClass();
        tw2 tw2Var = new tw2(0, vw2Var);
        mw2 mw2Var = vw2Var.a;
        mw2Var.getClass();
        mw2Var.e.f.c(new n62(mw2Var, tw2Var, 24), mw2Var.j);
        this.a.h = this;
        this.b.f = this;
        this.c.i = this;
        this.f.k = this;
        iz1 iz1Var = mz1.ma;
        tw1 tw1Var = tw1.e;
        if (!TextUtils.isEmpty((CharSequence) tw1Var.c.a(iz1Var))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.j);
            List listAsList = Arrays.asList(((String) tw1Var.c.a(iz1Var)).split(","));
            m92 m92Var = this.g;
            m92Var.c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(m92Var);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                m92Var.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        iz1 iz1Var2 = mz1.na;
        if (!TextUtils.isEmpty((CharSequence) tw1Var.c.a(iz1Var2))) {
            SharedPreferences sharedPreferences = this.j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) tw1Var.c.a(iz1Var2)).split(","));
            m92 m92Var2 = this.h;
            m92Var2.c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(m92Var2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                m92Var2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        ra4 ra4VarG = hg4.C.h.g();
        ra4VarG.h();
        synchronized (ra4VarG.a) {
            str = ra4VarG.x;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((ww2) Enum.valueOf(ww2.class, jSONObject.optString("gesture", "NONE")), false);
                    this.o = jSONObject.optString("networkExtras", "{}");
                    this.q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        ra4 ra4VarG2 = hg4.C.h.g();
        ra4VarG2.h();
        synchronized (ra4VarG2.a) {
            str2 = ra4VarG2.A;
        }
        this.x = str2;
    }

    public final synchronized void k() {
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 1) {
            this.b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int iOrdinal = this.r.ordinal();
            if (iOrdinal == 1) {
                fx2 fx2Var = this.b;
                synchronized (fx2Var) {
                    try {
                        if (fx2Var.g) {
                            SensorManager sensorManager2 = fx2Var.b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(fx2Var, fx2Var.c);
                                gi2.G("Stopped listening for shake gestures.");
                            }
                            fx2Var.g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            pw2 pw2Var = this.c;
            synchronized (pw2Var) {
                try {
                    if (pw2Var.j && (sensorManager = pw2Var.a) != null && (sensor = pw2Var.b) != null) {
                        sensorManager.unregisterListener(pw2Var, sensor);
                        pw2Var.j = false;
                        gi2.G("Stopped listening for flick gestures.");
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final void m() {
        String string;
        hg4 hg4Var = hg4.C;
        ra4 ra4VarG = hg4Var.h.g();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.s);
                jSONObject.put("gesture", this.r);
                long j = this.q;
                hg4Var.k.getClass();
                if (j > System.currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.o);
                    jSONObject.put("networkExtrasExpirationSecs", this.q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        ra4VarG.getClass();
        if (((Boolean) tw1.e.c.a(mz1.I9)).booleanValue()) {
            ra4VarG.h();
            synchronized (ra4VarG.a) {
                try {
                    if (ra4VarG.x.equals(string)) {
                        return;
                    }
                    ra4VarG.x = string;
                    SharedPreferences.Editor editor = ra4VarG.g;
                    if (editor != null) {
                        editor.putString("inspector_info", string);
                        ra4VarG.g.apply();
                    }
                    ra4VarG.i();
                } finally {
                }
            }
        }
    }
}
