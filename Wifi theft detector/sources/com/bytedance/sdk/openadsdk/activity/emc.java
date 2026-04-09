package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.activity.ypw;
import com.bytedance.sdk.openadsdk.component.reward.emc.bw;
import com.bytedance.sdk.openadsdk.component.reward.emc.ru;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.sz.dg.emc;
import com.bytedance.sdk.openadsdk.dg.ypw;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import s2.b;

/* loaded from: classes.dex */
public abstract class emc extends msw implements sf.emc, bw.emc {
    protected boolean bw;
    private long db;
    protected boolean dg;
    private CountDownTimer dr;
    private boolean ee;
    protected final sf emc;
    private boolean hxp;
    private int rie;
    private long sb;
    private boolean sf;
    private Bundle sra;
    private boolean xmt;
    protected int xq;
    private int ylm;

    @Nullable
    protected com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypw;

    public emc(ypw ypwVar, rie rieVar, int i10, int i11, boolean z10) {
        super(ypwVar, rieVar, i10, i11, z10);
        this.emc = new sf(Looper.getMainLooper(), this);
        this.ylm = 1;
        this.rie = 0;
        this.hxp = false;
        this.dg = false;
        nw();
    }

    private void jp() {
        this.ypw.hxp();
        this.xq = (int) this.zz.ylm.iyl();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar.wbn) {
            emc(emcVar.db.bw());
            emc(this.zz.db.dg());
        }
        a_();
        pe();
    }

    private boolean ltx() {
        if (this.ycc.ycc()) {
            return this.zz.zz.get();
        }
        return true;
    }

    private void nw() {
        this.sf = dr.xq(this.ycc) && this.ycc.gn();
        if (this.sf) {
            this.sb = this.ycc.un() * 1000;
        }
    }

    private void pe() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar;
        if (this.ycc.ycc() || (ypwVar = this.ypw) == null) {
            return;
        }
        ypwVar.emc(this.zz.mkp.ycc());
        this.ypw.rie();
    }

    private void rig() {
        if (this.ycc.ycc() && !this.hxp) {
            this.hxp = true;
            emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.emc.3
                @Override // java.lang.Runnable
                public void run() {
                    float[] fArrEmc;
                    if (emc.this.uym.ee()) {
                        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = emc.this.zz;
                        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = emc.this.zz;
                        fArrEmc = new float[]{vw.xq(emcVar.mxo, emcVar.iyl.getWidth()), vw.xq(emcVar2.mxo, emcVar2.iyl.getHeight())};
                    } else {
                        emc emcVar3 = emc.this;
                        fArrEmc = emcVar3.zz.ee.emc(emcVar3.ylm);
                    }
                    if (!emc.this.zz.sb.emc()) {
                        emc.this.zz.sb.emc(fArrEmc);
                    } else {
                        emc emcVar4 = emc.this;
                        emcVar4.zz.sb.emc(emcVar4.ycc);
                    }
                }
            });
        }
    }

    private void wbn() {
        this.zz.iyl.emc(this.ypw);
        this.ypw.emc(this, this.emc);
        this.ypw.ru();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void aa() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void bw() {
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final void cf() {
        this.zz.ylm.mxo();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean cuf() {
        return this.ycc.ej() == 10 && !db();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean db() {
        return this.zz.hxp.zz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void dg() {
        super.dg();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.ypw;
        if (ypwVar == null) {
            return;
        }
        ypwVar.sba();
    }

    public void dr() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null) {
            return;
        }
        emcVar.ylm.cf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public com.bytedance.sdk.openadsdk.component.reward.emc.emc ee() {
        return this.zz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final void gbl() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.ypw;
        if (ypwVar == null) {
            return;
        }
        ypwVar.gbl();
    }

    public void hxp() {
        this.uym.emc(this, emc(ypw.C0174ypw.ypw));
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void lt() {
        this.dg = true;
    }

    public Map<String, Object> msw() {
        rie rieVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar != null && emcVar.hxp != null && (rieVar = this.ycc) != null && rieVar.yid() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.zz.hxp.gbl()));
            JSONObject jSONObjectEmc = this.zz.hxp.emc((JSONObject) null);
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

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void qh() {
        super.qh();
        if (this.sf) {
            this.db = System.currentTimeMillis();
            CountDownTimer countDownTimer = this.dr;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.ypw;
        if (ypwVar == null) {
            return;
        }
        ypwVar.aa();
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.zz.hxp;
        if (zzVar != null) {
            zzVar.msw();
        }
        if (this.uym.ee()) {
            this.zz.hxp.emc(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public String rie() {
        return this.zz.xxg;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean rtt() {
        return this.zz.hxp.ru() && !db();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw, com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ru() {
        super.ru();
        if (this.ycc.ycc()) {
            this.zz.hxp.sz();
        }
    }

    public void sb() {
        rig();
    }

    public final void sba() {
        this.emc.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void sf() {
        com.bytedance.sdk.openadsdk.component.reward.view.xq xqVarEmc;
        super.sf();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null || (xqVarEmc = emcVar.hxp.emc()) == null || !xqVarEmc.rie()) {
            return;
        }
        fu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public boolean sra() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        return emcVar != null && emcVar.ylm.lt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void sup() {
        ypw ypwVar = this.uym;
        if (ypwVar == null) {
            return;
        }
        ypwVar.ypw(this, emc(10));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final void sz() {
        super.sz();
        if (this.zz == null || com.bytedance.sdk.component.utils.ypw.emc(xxg())) {
            return;
        }
        this.zz.xmt.db();
        com.bytedance.sdk.openadsdk.utils.dg.emc(xxg(), this.zz.ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void ul() {
        super.ul();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.ypw;
        if (ypwVar != null) {
            ypwVar.ul();
        }
    }

    public abstract FrameLayout uym();

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public final View vk() {
        return this.zz.ylm.tp();
    }

    public void xmt() {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar != null && emcVar.ylm.zz()) {
            this.zz.ylm.ul();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void xq() {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar;
        super.xq();
        if (this.zz == null || (ypwVar = this.ypw) == null) {
            return;
        }
        ypwVar.cf();
        this.zz.wpn = true;
        if (ltx()) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
            emcVar.cuf.emc(emcVar.ypw.lr());
        }
        this.zz.mkp.cf();
        this.zz.xmt.aa();
        this.zz.rie.bw();
        if (this.ypw.ypw()) {
            this.zz.ylm.emc(this.ypw);
            if (this.zz.ylm.yz()) {
                emc(this.zz.ylm.qh(), true);
            } else if (this.zz.ylm.uym() && this.uym.ee()) {
                mxo();
            } else {
                this.zz.ylm.emc(false, this, this.rie != 0);
            }
        }
        this.rie++;
        rig();
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar = this.zz.hxp;
        if (zzVar != null) {
            zzVar.uym();
        }
        this.zz.ee.emc(this.emc);
        if (this.uym.ee()) {
            this.zz.hxp.emc(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.sf) {
            long j10 = this.db;
            if (j10 != 0 && jCurrentTimeMillis - j10 > this.sb) {
                wo().emc(this, emc(8));
                return;
            }
            if (j10 != 0) {
                this.sb -= jCurrentTimeMillis - j10;
            }
            emc(this.sb);
        }
    }

    public final void ycc() {
        Message message = new Message();
        message.what = 400;
        if (this.ycc.zc()) {
            ypw(10000);
        }
        this.emc.sendMessageDelayed(message, 2000L);
    }

    public void ylm() {
        if (this.ee) {
            return;
        }
        this.ee = true;
        but();
    }

    public abstract void ypw();

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void ypw(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void yzg() {
        super.yzg();
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.ypw;
        if (ypwVar == null) {
            return;
        }
        ypwVar.ypw(this.yzg);
    }

    public com.bytedance.sdk.openadsdk.dg.uym zz() {
        com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar;
        if (!this.ycc.ycc()) {
            com.bytedance.sdk.openadsdk.dg.uym uymVar = new com.bytedance.sdk.openadsdk.dg.uym();
            uymVar.emc(System.currentTimeMillis(), 1.0f);
            return uymVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar != null && (zzVar = emcVar.hxp) != null && zzVar.emc() != null) {
            return this.zz.hxp.emc().getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.dg.uym uymVar2 = new com.bytedance.sdk.openadsdk.dg.uym();
        uymVar2.emc(System.currentTimeMillis(), 1.0f);
        return uymVar2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void dg(boolean z10) {
        ypw ypwVar = this.uym;
        if (ypwVar != null) {
            ypwVar.emc(this, z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final void emc(Activity activity, Bundle bundle) {
        this.sra = bundle;
        super.emc(activity, bundle);
        emc(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public final com.bytedance.sdk.openadsdk.component.reward.view.msw emc() {
        return this.zz.iyl;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(Activity activity, ypw.bw bwVar) {
        try {
            this.ylm = this.ycc.ono();
            emc(activity, this.ycc, this.sra);
            if (this.zz.wbn && this.ycc.gn()) {
                this.zz.yz = bwVar.dg;
            }
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
            if (emcVar.wbn && this.ru > 0) {
                emcVar.yz = bwVar.dg;
            }
            wbn();
            jp();
            if (ul.bw(this.ycc)) {
                cn();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.vk.xq.ypw();
            yz();
        }
    }

    private void emc(Activity activity, rie rieVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = new com.bytedance.sdk.openadsdk.component.reward.emc.emc(activity, this.emc, rieVar, this, 1, this.uym.ypw(), this.zz);
        this.zz = emcVar;
        emcVar.wbn = this.uym.ycc();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.zz;
        emcVar2.jp = this.sz;
        emcVar2.rgy = emcVar2.wbn && ul.bw(rieVar);
        this.zz.ltx = this.uym.dg();
        this.zz.rig = this.uym.rie();
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = this.zz;
        emcVar3.pe = this;
        emcVar3.dr = this.uym.ylm();
        Intent intent = activity.getIntent();
        com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(this.zz, intent, bundle);
        if (intent != null) {
            com.bytedance.sdk.openadsdk.component.reward.emc.ypw.emc(intent, this.zz);
            rieVar.emc(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.zz.ndl) {
            ypw();
        }
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVarEmc = com.bytedance.sdk.openadsdk.component.reward.ypw.ycc.emc(this.zz);
        this.ypw = ypwVarEmc;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar4 = this.zz;
        emcVar4.cn = ypwVarEmc;
        emcVar4.rtt.emc(this);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar5 = this.zz;
        if (emcVar5.wbn) {
            emcVar5.ylm.emc(new emc.InterfaceC0162emc() { // from class: com.bytedance.sdk.openadsdk.activity.emc.1
                @Override // com.bytedance.sdk.openadsdk.core.sz.dg.emc.InterfaceC0162emc
                public void emc(int i10) {
                    emc emcVar6 = emc.this;
                    ypw ypwVar = emcVar6.uym;
                    if (ypwVar == null) {
                        return;
                    }
                    ypwVar.ypw(emcVar6, i10);
                }
            });
            if (!this.uym.ee()) {
                this.uym.rie().setShowSound(rie.bw(rieVar));
            }
        }
        cf.emc(this.zz);
        Objects.toString(this.ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void xq(boolean z10) {
        ru ruVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null || (ruVar = emcVar.db) == null) {
            return;
        }
        ruVar.ypw(z10);
        this.zz.db.xq(z10);
    }

    private void emc(com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar) {
        if (ypwVar != null) {
            HashMap map = new HashMap();
            try {
                int i10 = this.gbl + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            ypwVar.emc(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(Activity activity) {
        super.emc(activity);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null) {
            return;
        }
        emcVar.ee.emc();
    }

    private void emc(long j10) {
        this.dr = new CountDownTimer(j10, 1000L) { // from class: com.bytedance.sdk.openadsdk.activity.emc.2
            @Override // android.os.CountDownTimer
            public void onFinish() {
                ypw ypwVarWo = emc.this.wo();
                emc emcVar = emc.this;
                ypwVarWo.emc(emcVar, emcVar.emc(8));
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j11) {
                emc.this.sb = j11;
            }
        }.start();
    }

    public final void emc(boolean z10, int i10) {
        emc(z10, false, i10);
    }

    public final void emc(boolean z10, boolean z11, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        emcVar.rtt.emc(z10, z11, false, emcVar.cn, i10);
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.ypw;
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public void emc(String str, JSONObject jSONObject) {
        ypw ypwVar;
        if (str == null || !"skipToNextAd".equals(str) || (ypwVar = this.uym) == null) {
            return;
        }
        ypwVar.ypw(this, emc(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.dg.ypw
    public boolean emc(long j10, boolean z10) {
        ul ulVar;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.zz;
        if (emcVar == null) {
            return false;
        }
        emcVar.hxp.ypw(false);
        this.bw = false;
        com.bytedance.sdk.openadsdk.dg.uym uymVarZz = zz();
        if (uym() == null) {
            return false;
        }
        this.zz.ylm.emc(uym(), uymVarZz);
        Map<String, Object> mapMsw = this.ycc.ycc() ? msw() : null;
        b.InterfaceC0477b interfaceC0477b = new b.InterfaceC0477b() { // from class: com.bytedance.sdk.openadsdk.activity.emc.4
            @Override // s2.b.InterfaceC0477b
            public void emc(long j11, int i10) {
                emc emcVar2 = emc.this;
                if (emcVar2.bw) {
                    return;
                }
                emcVar2.bw = true;
                boolean zYcc = emcVar2.ycc.ycc();
                emc.this.emc.removeMessages(300);
                emc.this.sba();
                emc.this.zz.ylm.emc(j11, j11);
                if (zYcc) {
                    emc.this.zz.hxp.ypw(true);
                } else {
                    emc.this.zz.vk.set(true);
                }
                if (emc.this.zz.ypw.fu() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = emc.this.zz;
                    if (emcVar3.xq) {
                        emcVar3.sra.xq().emc(emc.this.zz.ypw);
                        cf.ypw();
                    }
                }
                if (!zYcc && emc.this.zz.ypw.ri()) {
                    emc.this.zz.ypw.wa(1);
                    emc.this.zz.mkp.aa();
                }
                if (emc.this.zz.ypw.fu() == 21 && !emc.this.zz.ypw.yzg()) {
                    emc.this.zz.ypw.dg(true);
                    emc.this.zz.mkp.aa();
                }
                ypw.bw bwVarEmc = emc.this.emc(5);
                bwVarEmc.bw = true;
                emc emcVar4 = emc.this;
                emcVar4.uym.emc(emcVar4, bwVarEmc);
            }

            @Override // s2.b.InterfaceC0477b
            public void ypw(long j11, int i10) {
                emc.this.emc.removeMessages(300);
                ul ulVar2 = emc.this.zz.mkp.cf;
                if (ulVar2 != null) {
                    ulVar2.ru();
                }
                if (emc.this.zz.ylm.ycc()) {
                    emc.this.ycc();
                    return;
                }
                emc.this.zz.ylm.yzg();
                if (emc.this.ycc.ycc()) {
                    emc.this.zz.hxp.emc(true);
                }
                emc emcVar2 = emc.this;
                emcVar2.uym.emc(emcVar2, emcVar2.emc(3));
            }

            @Override // s2.b.InterfaceC0477b
            public void emc() {
                emc.this.emc.removeMessages(300);
                emc.this.sba();
                emc emcVar2 = emc.this;
                emcVar2.uym.emc(emcVar2, emcVar2.emc(6));
            }

            @Override // s2.b.InterfaceC0477b
            public void emc(long j11, long j12) throws NumberFormatException {
                com.bytedance.sdk.openadsdk.component.reward.view.zz zzVar;
                com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = emc.this.zz;
                if (!emcVar2.wpn && emcVar2.ylm.ycc()) {
                    emc.this.zz.ylm.ypw(true);
                }
                if (emc.this.zz.zz.get()) {
                    return;
                }
                emc.this.emc.removeMessages(300);
                if (j11 != emc.this.zz.ylm.sz()) {
                    emc.this.sba();
                }
                if (emc.this.zz.ylm.ycc()) {
                    emc.this.zz.ylm.emc(j11, j12);
                    int i10 = (int) (j11 / 1000);
                    if ((emc.this.zz.f9273aa.get() || emc.this.zz.ru.get()) && emc.this.zz.ylm.ycc()) {
                        emc.this.zz.ylm.ylm();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar3 = emc.this.zz;
                    if (emcVar3.dg) {
                        emcVar3.mkp.bw(i10);
                    }
                    if (emc.this.ycc.ycc() && (zzVar = emc.this.zz.hxp) != null && zzVar.emc() != null) {
                        emc.this.zz.hxp.emc().setTime(String.valueOf(emc.this.xq), i10, 0, false);
                        emc.this.zz.hxp.emc().emc(j11, j12);
                    }
                    emc.this.emc((j11 * 1.0f) / j12);
                    emc.this.zz.emc(true);
                }
            }
        };
        this.zz.ylm.emc(interfaceC0477b);
        if (!this.ycc.ycc() && (ulVar = this.zz.mkp.cf) != null) {
            ulVar.emc(interfaceC0477b);
        }
        return this.zz.ylm.emc(j10, z10, mapMsw, this.ypw);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.emc.bw.emc
    public void emc(boolean z10, boolean z11, boolean z12, com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar, int i10) {
        emc(z10, z11, z12, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(msw mswVar, msw mswVar2, ypw.bw bwVar) {
        super.emc(mswVar, mswVar2, bwVar);
        if (mswVar == this && (mswVar2 instanceof bw)) {
            int i10 = bwVar.ypw;
            if (i10 == 3) {
                com.bytedance.sdk.openadsdk.component.reward.emc.cf cfVar = this.zz.ylm;
                cfVar.emc(!cfVar.mkp() ? 1 : 0, 2);
            } else if (i10 == 6) {
                com.bytedance.sdk.openadsdk.component.reward.emc.cf cfVar2 = this.zz.ylm;
                cfVar2.emc(!cfVar2.mkp() ? 1 : 0, !this.zz.ylm.mkp() ? 1 : 0);
            } else if (i10 == 5 && !rie.bw(this.zz.ypw) && bwVar.bw) {
                this.zz.ylm.emc("skip", true);
            }
            this.zz.cuf.emc(false);
            this.zz.cuf.dg(false);
        }
    }

    public void emc(float f10) {
        ypw ypwVar = this.uym;
        if (ypwVar == null) {
            return;
        }
        ypwVar.emc(f10);
        if (this.ee || this.ycc.fu() == 43 || f10 < this.ycc.pxa() / 100.0f) {
            return;
        }
        msw mswVarHxp = this.uym.hxp();
        if (mswVarHxp instanceof emc) {
            ((emc) mswVarHxp).ylm();
        }
    }

    public ypw.bw emc(int i10) {
        ypw.bw bwVar = new ypw.bw(i10, this.zz);
        bwVar.dg = this.zz.yz;
        return bwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(Map<String, Object> map, float f10, float f11) {
        super.emc(map, f10, f11);
        this.uym.emc(map, this, f10, f11);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.msw
    public void emc(rie rieVar, int i10, int i11) {
        super.emc(rieVar, i10, i11);
        nw();
        this.hxp = false;
        this.xmt = true;
    }
}
