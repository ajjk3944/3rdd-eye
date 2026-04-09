package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.bly;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw {
    public com.bytedance.sdk.openadsdk.component.reward.top.lh an;
    public int bly;
    public final rn bs;

    /* renamed from: cd, reason: collision with root package name */
    public final tlj f7956cd;

    /* renamed from: cf, reason: collision with root package name */
    public final AtomicBoolean f7957cf;

    /* renamed from: cj, reason: collision with root package name */
    public boolean f7958cj;
    public com.bytedance.sdk.openadsdk.component.reward.vt.vt coz;
    public boolean euf;
    public final ko ex;
    public final com.bytedance.sdk.openadsdk.component.reward.view.ryl ey;
    public final mwh fak;
    public final String fkw;
    public final com.bytedance.sdk.openadsdk.core.mwh.yu.vt fqk;
    public com.bytedance.sdk.openadsdk.mwh.bly fvf;
    public boolean fwd;

    /* renamed from: gh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.activity.pno f7959gh;
    public final Context hun;
    public final com.bytedance.sdk.openadsdk.component.reward.view.tlj jae;

    /* renamed from: jg, reason: collision with root package name */
    public final AtomicBoolean f7960jg;
    public final AtomicBoolean jqy;
    public final Activity jvy;
    public long kfa;
    public boolean kn;
    public final AtomicBoolean ko;
    public final pno ksc;

    /* renamed from: le, reason: collision with root package name */
    public final int f7961le;

    /* renamed from: lh, reason: collision with root package name */
    public final boolean f7962lh;
    public final boolean lso;
    public boolean lvd;
    public boolean mq;
    public boolean mt;
    public final AtomicBoolean mwh;
    public long myk;

    /* renamed from: ng, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.common.jg f7963ng;
    public boolean njr;
    public boolean npr;

    /* renamed from: od, reason: collision with root package name */
    public final cf f7964od;
    public boolean odc;
    public final fkw osn;
    public final int ouw;

    /* renamed from: pd, reason: collision with root package name */
    public final lh f7965pd;
    public int pno;
    public boolean pv;
    public final AtomicBoolean qbp;
    public final boolean ra;
    public final AtomicBoolean rn;
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly rrs;
    public final AtomicBoolean ryl;

    /* renamed from: sd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.utils.jg f7966sd;
    public final yu tc;

    /* renamed from: th, reason: collision with root package name */
    public final AtomicBoolean f7967th;
    public final AtomicBoolean tlj;

    /* renamed from: ub, reason: collision with root package name */
    public String f7968ub;
    public int ucs;
    public final ryl uoy;
    public final le uq;
    public final jae ux;

    /* renamed from: vh, reason: collision with root package name */
    public float f7969vh;

    /* renamed from: vi, reason: collision with root package name */
    public boolean f7970vi;
    public final AtomicBoolean vm;
    public final AtomicBoolean vpp;
    public vpp vt;
    public int wp;
    public boolean xdk;
    public boolean xn;
    public com.bytedance.sdk.openadsdk.component.reward.tlj ycd;
    public int yhj;
    public int yib;
    public final boolean yu;
    public long yw;
    public final AtomicBoolean zih;
    public final AtomicBoolean zin;
    public final boolean zjp;
    public boolean zvq;

    public ouw(Activity activity, jae jaeVar, vpp vppVar, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, int i4, boolean z3) {
        this(activity, jaeVar, vppVar, vtVar, i4, z3, null);
    }

    public final Map<String, Object> lh() {
        vpp vppVar;
        HashMap map = new HashMap();
        if (this.jae != null && (vppVar = this.vt) != null && vppVar.rn() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.jae.fkw()));
            JSONObject jSONObjectOuw = this.jae.ouw((JSONObject) null);
            if (jSONObjectOuw != null) {
                Iterator<String> itKeys = jSONObjectOuw.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectOuw.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public final void ouw(boolean z3) {
        this.xdk = z3;
        this.uoy.yu(z3);
    }

    public final boolean vt() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        return !this.euf || (pnoVar = this.f7959gh) == null || !(pnoVar instanceof com.bytedance.sdk.openadsdk.activity.fkw) || ((com.bytedance.sdk.openadsdk.activity.fkw) pnoVar).ouw;
    }

    public ouw(Activity activity, jae jaeVar, vpp vppVar, com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar, int i4, boolean z3, ouw ouwVar) {
        this.pno = 0;
        this.bly = 0;
        this.tlj = new AtomicBoolean(false);
        this.f7957cf = new AtomicBoolean(false);
        this.ryl = new AtomicBoolean(false);
        this.mwh = new AtomicBoolean(false);
        this.f7960jg = new AtomicBoolean(false);
        this.ko = new AtomicBoolean(false);
        this.rn = new AtomicBoolean(false);
        this.zih = new AtomicBoolean(false);
        this.vm = new AtomicBoolean(false);
        this.f7967th = new AtomicBoolean(false);
        this.qbp = new AtomicBoolean(false);
        this.zin = new AtomicBoolean(false);
        this.vpp = new AtomicBoolean(false);
        this.jqy = new AtomicBoolean(false);
        this.pv = false;
        this.ucs = 1;
        this.myk = 0L;
        this.f7959gh = null;
        this.odc = true;
        this.npr = false;
        this.xn = false;
        this.jvy = activity;
        this.fqk = vtVar;
        Context contextOuw = com.bytedance.sdk.openadsdk.core.zih.ouw();
        this.hun = contextOuw;
        this.vt = vppVar;
        this.ouw = i4;
        this.f7970vi = ouwVar != null;
        this.lvd = i4 == 0 || i4 == 1;
        this.lso = i4 == 0 || i4 == 2;
        this.ux = jaeVar;
        this.zjp = z3;
        boolean z10 = vppVar.yiz.getDurationSlotType() == 7;
        this.yu = z10;
        this.fkw = z10 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.fwd = vppVar.lh();
        this.ra = th.mwh(vppVar);
        int iFqk = vppVar.fqk();
        this.f7961le = iFqk;
        com.bytedance.sdk.openadsdk.core.zih.yu();
        this.f7958cj = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(iFqk));
        com.bytedance.sdk.openadsdk.core.settings.cf.vt();
        this.f7962lh = com.bytedance.sdk.openadsdk.core.settings.cf.tlj(String.valueOf(iFqk));
        this.f7964od = new cf(this);
        this.ey = i4 == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.mwh(this) : vppVar.lh() ? new com.bytedance.sdk.openadsdk.component.reward.view.ryl(this) : new com.bytedance.sdk.openadsdk.component.reward.view.cf(this);
        this.rrs = new com.bytedance.sdk.openadsdk.component.reward.view.bly(this);
        this.ex = new ko(this);
        this.tc = new yu(this);
        this.ksc = new pno(this, vppVar);
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar = ouwVar != null ? ouwVar.jae : new com.bytedance.sdk.openadsdk.component.reward.view.tlj(this);
        this.jae = tljVar;
        tljVar.ra = this;
        this.bs = new rn(this);
        this.fak = new mwh(this);
        this.uoy = new ryl(this);
        this.osn = new fkw(this);
        this.f7956cd = new tlj(this);
        le leVar = ouwVar != null ? ouwVar.uq : new le(this);
        this.uq = leVar;
        leVar.ouw = this;
        this.f7965pd = new lh(this);
        this.fvf = new com.bytedance.sdk.openadsdk.mwh.bly(contextOuw);
        this.f7966sd = com.bytedance.sdk.openadsdk.utils.bly.ouw(activity, new bly.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.ouw.1
            @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
            public final View ouw() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar = ouw.this.ey;
                if (rylVar != null) {
                    return rylVar.tlj();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bly.ouw
            public final void vt() {
                ryl rylVar = ouw.this.uoy;
                if (rylVar != null) {
                    rylVar.yu();
                }
            }
        });
    }

    public final long ouw() {
        return (SystemClock.elapsedRealtime() - this.kfa) + this.yw;
    }
}
