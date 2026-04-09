package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class od {
    int bly;

    /* renamed from: cf, reason: collision with root package name */
    public int f8247cf;
    String fkw;

    /* renamed from: jg, reason: collision with root package name */
    public int f8248jg;
    public int ko;

    /* renamed from: le, reason: collision with root package name */
    String f8249le;

    /* renamed from: lh, reason: collision with root package name */
    boolean f8250lh;
    int mwh;
    public int ouw;
    int pno;
    public int ra;
    String rn;
    int ryl;
    public boolean tlj;
    String vm;
    int vt;
    int yu;
    public String zih;

    public od(JSONObject jSONObject) {
        this.ryl = 5;
        this.mwh = 5;
        this.f8248jg = 10;
        this.ko = 20;
        this.rn = "Next Ad";
        this.zih = "Next ad in %1$ds";
        this.vm = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.f8250lh = jSONObject.optBoolean("is_playable");
        this.yu = jSONObject.optInt("playable_type", 0);
        this.fkw = jSONObject.optString("playable_style");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("playable");
        if (jSONObjectOptJSONObject != null) {
            this.f8249le = jSONObjectOptJSONObject.optString("playable_url", "");
            this.ra = jSONObjectOptJSONObject.optInt("playable_orientation", 0);
            this.vt = jSONObjectOptJSONObject.optInt("new_style", 0);
            this.ouw = jSONObjectOptJSONObject.optInt("close_2_app", 0);
            int i4 = this.yu == 1 ? 10 : 5;
            this.pno = jSONObjectOptJSONObject.optInt("playable_webview_timeout", i4);
            this.bly = jSONObjectOptJSONObject.optInt("playable_js_timeout", i4);
            this.tlj = jSONObjectOptJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.ryl = jSONObjectOptJSONObject.optInt("wait_tips_time", 5);
            this.mwh = jSONObjectOptJSONObject.optInt("auto_to_next_time", 5);
            this.f8248jg = jSONObjectOptJSONObject.optInt("next_ad_tips_show_time", 10);
            this.ko = jSONObjectOptJSONObject.optInt("max_show_time", 20);
            this.zih = jSONObjectOptJSONObject.optString("next_ad_in_xs");
            this.rn = jSONObjectOptJSONObject.optString("next_ad_text");
            this.vm = jSONObjectOptJSONObject.optString("play_now_text");
            int iOptInt = jSONObjectOptJSONObject.optInt("countdown_show_type", 0);
            this.f8247cf = iOptInt;
            if (iOptInt == 0 || iOptInt == 1 || iOptInt == 2) {
                return;
            }
            this.f8247cf = 0;
        }
    }

    public static String bly(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.fkw;
    }

    public static String cf(vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        od odVar = vppVar.nbp;
        if (odVar != null && odVar.f8250lh) {
            String str = odVar.f8249le;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (vppVar.fvf == 20) {
            return vppVar.osn;
        }
        c cVar = vppVar.f8309sd;
        if (cVar != null) {
            return cVar.f6579h;
        }
        return null;
    }

    public static boolean fkw(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        return (odVarOuw == null || !odVarOuw.f8250lh || TextUtils.isEmpty(cf(vppVar))) ? false : true;
    }

    public static String jg(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.rn;
    }

    public static String ko(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.vm;
    }

    public static boolean le(vpp vppVar) {
        return fkw(vppVar) && zih(vppVar) == 1;
    }

    public static boolean lh(vpp vppVar) {
        return vt(vppVar) && zih(vppVar) == 1;
    }

    public static int mwh(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.ryl;
    }

    public static od ouw(vpp vppVar) {
        if (vppVar == null) {
            return null;
        }
        return vppVar.nbp;
    }

    public static boolean pno(vpp vppVar) {
        od odVar = vppVar.nbp;
        return odVar != null && odVar.f8250lh && odVar.vt == 1;
    }

    public static boolean ra(vpp vppVar) {
        od odVar = vppVar.nbp;
        return odVar != null && odVar.f8250lh && odVar.vt == 1;
    }

    public static int rn(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.mwh;
    }

    public static long ryl(vpp vppVar) {
        return Math.max(ouw(vppVar) == null ? 5L : r0.pno, ouw(vppVar) != null ? r5.bly : 5L);
    }

    public static String tlj(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return null;
        }
        return odVarOuw.f8249le;
    }

    public static boolean vt(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        return (odVarOuw == null || !odVarOuw.f8250lh || TextUtils.isEmpty(cf(vppVar))) ? false : true;
    }

    public static boolean yu(vpp vppVar) {
        return lh(vppVar) && !ra(vppVar);
    }

    private static int zih(vpp vppVar) {
        od odVarOuw = ouw(vppVar);
        if (odVarOuw == null) {
            return 0;
        }
        return odVarOuw.yu;
    }
}
