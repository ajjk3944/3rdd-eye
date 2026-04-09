package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.zz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class emc {
    public final AtomicBoolean aa;
    public int but;
    public boolean bv;
    public final String bw;
    public final AtomicBoolean cf;
    public com.bytedance.sdk.openadsdk.component.reward.ypw.ypw cn;
    public final sup cuf;
    public final ru db;
    public final boolean dg;
    public com.bytedance.sdk.openadsdk.sz.zz dr;
    public final gbl ee;
    private int ej;
    public final int emc;
    public boolean ffd;
    public boolean fu;
    public final AtomicBoolean gbl;
    public long hj;
    public final com.bytedance.sdk.openadsdk.component.reward.view.zz hxp;
    public boolean ipv;
    public final com.bytedance.sdk.openadsdk.component.reward.view.msw iyl;
    public boolean jp;
    public final boolean jxk;
    public final sz lt;
    public boolean ltx;
    public final com.bytedance.sdk.openadsdk.component.reward.view.gbl mkp;
    public int msw;
    public final Activity mxo;
    public boolean ndl;
    public com.bytedance.sdk.openadsdk.utils.qh nw;
    public com.bytedance.sdk.openadsdk.activity.msw pe;
    public boolean pm;
    public int pxa;
    public final AtomicBoolean qh;
    public final sf ra;
    public boolean rgy;
    public final msw rie;
    public com.bytedance.sdk.openadsdk.component.reward.top.xq rig;
    public int rqm;
    public final bw rtt;
    public final AtomicBoolean ru;
    public final ycc sb;
    public final AtomicBoolean sba;
    private long se;
    public final xq sf;
    public final dg sra;
    public final AtomicBoolean sup;
    public final AtomicBoolean sz;
    public final com.bytedance.sdk.openadsdk.core.sz.dg.ypw tp;
    public final AtomicBoolean ul;
    public int uym;
    private long vhn;
    public final AtomicBoolean vk;
    private int vum;
    public final Context vw;
    public boolean wa;
    public float wad;
    public boolean wbn;
    public int wd;
    public final boolean wo;
    public boolean wpn;
    public boolean xhi;
    public final vk xmt;
    public final boolean xq;
    public String xxg;
    public final int ycc;
    public com.bytedance.sdk.openadsdk.component.reward.sup yid;
    public final cf ylm;
    public rie ypw;
    private String yuz;
    public boolean yz;
    public final AtomicBoolean yzg;
    public final AtomicBoolean zz;

    public emc(Activity activity, sf sfVar, rie rieVar, com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, int i, boolean z6) {
        this(activity, sfVar, rieVar, ypwVar, i, z6, null);
    }

    public void bw() {
        if (this.se <= 0) {
            this.se = SystemClock.elapsedRealtime();
        }
        this.vhn = (SystemClock.elapsedRealtime() - this.se) + this.vhn;
    }

    public void dg() {
        this.se = SystemClock.elapsedRealtime();
    }

    public int emc() {
        return this.vum;
    }

    public com.bytedance.sdk.openadsdk.dg.uym msw() {
        if (!this.ypw.ycc()) {
            com.bytedance.sdk.openadsdk.dg.uym uymVar = new com.bytedance.sdk.openadsdk.dg.uym();
            uymVar.emc(System.currentTimeMillis(), 1.0f);
            return uymVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.hxp;
        if (zzVar != null && zzVar.emc() != null) {
            return this.hxp.emc().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.dg.uym uymVar2 = new com.bytedance.sdk.openadsdk.dg.uym();
        uymVar2.emc(System.currentTimeMillis(), 1.0f);
        return uymVar2;
    }

    public boolean uym() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        return !this.wbn || (mswVar = this.pe) == null || !(mswVar instanceof com.bytedance.sdk.openadsdk.activity.bw) || ((com.bytedance.sdk.openadsdk.activity.bw) mswVar).emc;
    }

    public boolean xq() {
        return this.vum != 0;
    }

    public long ycc() {
        return (SystemClock.elapsedRealtime() - this.se) + this.vhn;
    }

    public int ypw() {
        return this.ej;
    }

    public Map<String, Object> zz() {
        rie rieVar;
        HashMap map = new HashMap();
        if (this.hxp != null && (rieVar = this.ypw) != null && rieVar.yid() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.hxp.gbl()));
            JSONObject jSONObjectEmc = this.hxp.emc((JSONObject) null);
            if (jSONObjectEmc != null) {
                Iterator<String> itKeys = jSONObjectEmc.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        map.put(next, jSONObjectEmc.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        return map;
    }

    public emc(Activity activity, sf sfVar, rie rieVar, com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, int i, boolean z6, emc emcVar) {
        this.uym = 0;
        this.msw = 0;
        this.zz = new AtomicBoolean(false);
        this.ru = new AtomicBoolean(false);
        this.gbl = new AtomicBoolean(false);
        this.sup = new AtomicBoolean(false);
        this.sz = new AtomicBoolean(false);
        this.qh = new AtomicBoolean(false);
        this.cf = new AtomicBoolean(false);
        this.vk = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.sba = new AtomicBoolean(false);
        this.yzg = new AtomicBoolean(false);
        this.ul = new AtomicBoolean(false);
        this.wpn = false;
        this.rqm = 1;
        this.hj = 0L;
        this.pe = null;
        this.bv = true;
        this.ipv = false;
        this.rgy = false;
        this.ej = -1;
        this.yuz = "";
        this.vum = 0;
        this.mxo = activity;
        this.tp = ypwVar;
        Context contextEmc = com.bytedance.sdk.openadsdk.core.aa.emc();
        this.vw = contextEmc;
        this.ypw = rieVar;
        this.emc = i;
        this.pm = emcVar != null;
        this.fu = i == 0 || i == 1;
        this.wo = i == 0 || i == 2;
        this.ra = sfVar;
        this.jxk = z6;
        boolean z7 = rieVar.vaf().getDurationSlotType() == 7;
        this.dg = z7;
        this.bw = z7 ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.xhi = rieVar.ycc();
        int iTx = rieVar.tx();
        this.ycc = iTx;
        this.yz = com.bytedance.sdk.openadsdk.core.aa.dg().aa(String.valueOf(iTx));
        this.xq = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().qh(String.valueOf(iTx));
        this.ee = new gbl(this);
        this.mkp = i == 2 ? new com.bytedance.sdk.openadsdk.component.reward.view.sup(this) : rieVar.ycc() ? new com.bytedance.sdk.openadsdk.component.reward.view.gbl(this) : new com.bytedance.sdk.openadsdk.component.reward.view.ru(this);
        this.iyl = new com.bytedance.sdk.openadsdk.component.reward.view.msw(this);
        this.ylm = new cf(this);
        this.sra = new dg(this);
        this.rie = new msw(this, rieVar);
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = emcVar != null ? emcVar.hxp : new com.bytedance.sdk.openadsdk.component.reward.view.zz(this);
        this.hxp = zzVar;
        zzVar.emc(this);
        this.xmt = new vk(this);
        this.lt = new sz(this);
        this.cuf = new sup(this);
        this.rtt = new bw(this);
        this.db = new ru(this);
        ycc yccVar = emcVar != null ? emcVar.sb : new ycc(this);
        this.sb = yccVar;
        yccVar.emc(this);
        this.sf = new xq(this);
        this.dr = new com.bytedance.sdk.openadsdk.sz.zz(contextEmc);
        this.nw = com.bytedance.sdk.openadsdk.utils.zz.emc(activity, new zz.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.emc.1
            @Override // com.bytedance.sdk.openadsdk.utils.zz.emc
            public View emc() {
                com.bytedance.sdk.openadsdk.component.reward.view.gbl gblVar = emc.this.mkp;
                if (gblVar != null) {
                    return gblVar.ru();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.utils.zz.emc
            public void ypw() {
                sup supVar = emc.this.cuf;
                if (supVar != null) {
                    supVar.bw();
                }
            }
        });
    }

    public void emc(int i, String str, int i3) {
        this.ej = i;
        this.yuz = str;
        this.vum = i3;
    }

    public void emc(boolean z6) {
        this.ndl = z6;
        this.cuf.dg(z6);
    }
}
