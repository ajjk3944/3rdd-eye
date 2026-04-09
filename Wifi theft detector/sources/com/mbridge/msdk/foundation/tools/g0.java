package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f15437a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f15438b;

    /* renamed from: c, reason: collision with root package name */
    private long f15439c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f15440d;

    /* renamed from: e, reason: collision with root package name */
    IntentFilter f15441e;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final g0 f15442a = new g0();
    }

    public static g0 a() {
        return b.f15442a;
    }

    public String b() throws JSONException {
        try {
            if (this.f15437a == null) {
                this.f15437a = new JSONObject();
            }
            if (this.f15437a.length() < 2) {
                try {
                    this.f15437a.put("KEY_INFO", (String) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e10) {
                    q0.b("NetAddressManager", e10.getMessage());
                }
                try {
                    this.f15437a.put("KEY_TIME", ((Long) d.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e11) {
                    q0.b("NetAddressManager", e11.getMessage());
                }
            }
            String strOptString = this.f15437a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f15437a.optLong("KEY_TIME") > (gVarB != null ? gVarB.S() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e12) {
            q0.b("NetAddressManager", e12.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b()).T() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.f15441e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextD.registerReceiver(this.f15440d, this.f15441e);
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f15439c > 3000) {
            if (this.f15438b == null) {
                this.f15438b = new com.mbridge.msdk.setting.j();
            }
            this.f15438b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.f15439c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.f15440d);
            } catch (Exception e10) {
                q0.b("NetAddressManager", e10.getMessage());
            }
        }
    }

    private g0() {
        this.f15437a = new JSONObject();
        this.f15440d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f15441e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f15437a == null) {
            this.f15437a = new JSONObject();
        }
        try {
            if (!this.f15437a.optString("KEY_INFO", "").equals(str)) {
                this.f15437a.put("KEY_INFO", str);
                d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e10) {
            q0.b("NetAddressManager", e10.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f15437a.put("KEY_TIME", jCurrentTimeMillis);
            d.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e11) {
            q0.b("NetAddressManager", e11.getMessage());
        }
    }
}
