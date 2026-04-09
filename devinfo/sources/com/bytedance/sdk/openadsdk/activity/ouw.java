package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import b9.b;
import b9.e;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.component.reward.ouw.fkw;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.view.tlj;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.yu.ouw;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.yu.vt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw extends pno implements jae.ouw, fkw.ouw {

    /* renamed from: cd, reason: collision with root package name */
    private boolean f7759cd;
    private int ex;
    protected boolean fkw;
    private long jae;
    private Bundle jqy;
    private boolean ksc;

    /* renamed from: lh, reason: collision with root package name */
    protected int f7760lh;

    /* renamed from: od, reason: collision with root package name */
    private long f7761od;
    protected final jae ouw;

    /* renamed from: pd, reason: collision with root package name */
    private boolean f7762pd;
    private boolean tc;
    private CountDownTimer uq;
    private int vpp;
    protected com.bytedance.sdk.openadsdk.component.reward.vt.vt vt;
    protected boolean yu;

    public ouw(vt vtVar, vpp vppVar, int i4, int i10, boolean z3) {
        super(vtVar, vppVar, i4, i10, z3);
        this.ouw = new jae(Looper.getMainLooper(), this);
        this.vpp = 1;
        this.ex = 0;
        this.tc = false;
        this.yu = false;
        yib();
    }

    private Map<String, Object> mt() {
        vpp vppVar;
        HashMap map = new HashMap();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && ouwVar.jae != null && (vppVar = this.f7765le) != null && vppVar.rn() == 2) {
            map.put("dynamic_show_type", Integer.valueOf(this.bly.jae.fkw()));
            JSONObject jSONObjectOuw = this.bly.jae.ouw((JSONObject) null);
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

    private com.bytedance.sdk.openadsdk.yu.ra xdk() {
        tlj tljVar;
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        if (!this.f7765le.lh()) {
            com.bytedance.sdk.openadsdk.yu.ra raVar = new com.bytedance.sdk.openadsdk.yu.ra();
            raVar.ouw(System.currentTimeMillis(), 1.0f);
            return raVar;
        }
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && (tljVar = ouwVar.jae) != null && (yuVar = tljVar.ouw) != null) {
            return yuVar.getAdShowTime();
        }
        com.bytedance.sdk.openadsdk.yu.ra raVar2 = new com.bytedance.sdk.openadsdk.yu.ra();
        raVar2.ouw(System.currentTimeMillis(), 1.0f);
        return raVar2;
    }

    private void yhj() {
        if (this.f7765le.lh() && !this.tc) {
            this.tc = true;
            this.bly.rrs.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.ouw.3
                @Override // java.lang.Runnable
                public final void run() {
                    float[] fArrOuw;
                    ouw ouwVar = ouw.this;
                    if (ouwVar.ra.tlj instanceof yu) {
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouwVar.bly;
                        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = ouw.this.bly;
                        fArrOuw = new float[]{osn.vt(ouwVar2.jvy, ouwVar2.rrs.getWidth()), osn.vt(ouwVar3.jvy, ouwVar3.rrs.getHeight())};
                    } else {
                        fArrOuw = ouwVar.bly.f7964od.ouw(ouwVar.vpp);
                    }
                    ouw ouwVar4 = ouw.this;
                    com.bytedance.sdk.openadsdk.component.reward.ouw.le leVar = ouwVar4.bly.uq;
                    if (!leVar.vt) {
                        leVar.ouw(fArrOuw);
                        return;
                    }
                    vpp vppVar = ouwVar4.f7765le;
                    tlj tljVar = leVar.ouw.jae;
                    if (tljVar != null) {
                        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = tljVar.ouw;
                        ViewParent parent = yuVar.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(yuVar);
                        }
                        leVar.ouw.ey.le().addView(yuVar);
                        if (!leVar.ouw.jae.yu()) {
                            leVar.ouw.coz.ouw(false);
                        }
                        tlj tljVar2 = leVar.ouw.jae;
                        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar2 = tljVar2.ouw;
                        if (yuVar2 != null) {
                            yuVar2.ouw(vppVar, vppVar.yiz, vppVar.vt(), tljVar2.ra.f7958cj, !r0.euf);
                        }
                        leVar.ouw();
                    }
                }
            });
        }
    }

    private void yib() {
        this.f7759cd = od.lh(this.f7765le) && this.f7765le.an();
        qbp.ouw("TTAD.AdScene", "current scene is isOnlyPlayable -> " + this.f7759cd);
        if (this.f7759cd) {
            this.f7761od = this.f7765le.od() * 1000;
        }
    }

    public abstract FrameLayout bly();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void bs() {
        this.yu = true;
    }

    public final void cd() {
        yhj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void cf() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.ryl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final String ex() {
        return this.bly.f7968ub;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean fak() {
        return this.f7765le.kfa == 10 && !jae();
    }

    public final void fkw() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.osn.ouw(true, false, false, ouwVar.coz, 4);
    }

    public final void fvf() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar != null && ouwVar.ex.yu()) {
            this.bly.ex.cf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean jae() {
        return this.bly.jae.yu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void jg() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.jg();
        if (this.f7759cd) {
            this.jae = System.currentTimeMillis();
            qbp.ouw("TTAD.AdScene", "onPause: remainingTime = " + this.f7761od);
            CountDownTimer countDownTimer = this.uq;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.zih();
        tlj tljVar = this.bly.jae;
        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
            yuVar.ryl();
        }
        if (this.ra.tlj instanceof yu) {
            this.bly.jae.ouw(8, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean jqy() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        return ouwVar != null && ouwVar.ex.yu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ko() {
        this.bly.ex.vpp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ksc() {
        return this.bly;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void le() {
        qbp.ouw("TTAD.AdScene", "onPlayableLoadingDismiss()---" + this.tlj);
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.ouw(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void lh() {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        super.lh();
        if (this.bly == null || (vtVar = this.vt) == null) {
            return;
        }
        vtVar.rn();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        ouwVar.pv = true;
        if ((ouwVar.tlj.get() && this.bly.ra) ? false : this.f7765le.lh() ? this.bly.tlj.get() : true) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            ouwVar2.uoy.ouw(ouwVar2.vt.ksc());
        }
        this.bly.ey.ko();
        this.bly.bs.tlj();
        this.bly.ksc.lh();
        if (this.vt.vt()) {
            this.bly.ex.ouw(this.vt);
            ko koVar = this.bly.ex;
            if (koVar.bly) {
                ouw(koVar.ouw, true);
            } else if (koVar.vt() && (this.ra.tlj instanceof yu)) {
                rrs();
            } else {
                this.bly.ex.ouw(this, this.ex != 0);
            }
        }
        this.ex++;
        yhj();
        tlj tljVar = this.bly.jae;
        if (tljVar != null) {
            tljVar.lh();
        }
        this.bly.f7964od.ouw(this.ouw);
        if (this.ra.tlj instanceof yu) {
            this.bly.jae.ouw(0, false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f7759cd) {
            long j = this.jae;
            if (j != 0 && jCurrentTimeMillis - j > this.f7761od) {
                qbp.ouw("TTAD.AdScene", "onResume: Exceed playable_duration_time, switch to next ad");
                hun().ouw(this, ouw(8));
                return;
            }
            if (j != 0) {
                this.f7761od -= jCurrentTimeMillis - j;
            }
            qbp.ouw("TTAD.AdScene", "onResume: The playable display time has not yet arrived, continue the countdown -> remainingTime = " + this.f7761od);
            this.uq = new CountDownTimer(this.f7761od) { // from class: com.bytedance.sdk.openadsdk.activity.ouw.2
                @Override // android.os.CountDownTimer
                public final void onFinish() {
                    qbp.ouw("TTAD.AdScene", "onFinish: remainingTime = " + ouw.this.f7761od);
                    vt vtVarHun = ouw.this.hun();
                    ouw ouwVar3 = ouw.this;
                    vtVarHun.ouw(ouwVar3, ouwVar3.ouw(8));
                }

                @Override // android.os.CountDownTimer
                public final void onTick(long j8) {
                    ouw.this.f7761od = j8;
                    qbp.ouw("TTAD.AdScene", "onTick: remainingTime = " + ouw.this.f7761od);
                }
            }.start();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void mwh() {
        super.mwh();
        if (this.bly == null || com.bytedance.sdk.component.utils.vt.ouw(ux())) {
            return;
        }
        this.bly.bs.rn();
        com.bytedance.sdk.openadsdk.utils.yu.ouw(ux(), this.bly.vt);
    }

    public final void od() {
        this.bly.f7956cd.ouw();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(boolean z3) {
    }

    public final void pd() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        ouwVar.ex.ra();
    }

    public final void pno() {
        Message message = new Message();
        message.what = 400;
        if (this.f7765le.ey()) {
            jvy();
        }
        this.ouw.sendMessageDelayed(message, 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void qbp() {
        super.qbp();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.vt(this.qbp);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ra() {
        qbp.ouw("TTAD.AdScene", "onPlayableHappenInteraction()---" + this.tlj + " isHappenInteraction:true");
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final View rn() {
        return this.bly.ex.jqy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ryl() {
        vt vtVar = this.ra;
        if (vtVar == null) {
            return;
        }
        vtVar.vt(this, ouw(10));
    }

    public final void tc() {
        this.ra.ouw(this, ouw(vt.C0123vt.vt));
    }

    public final void th() {
        this.ouw.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno, com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void tlj() {
        super.tlj();
        if (this.f7765le.lh()) {
            this.bly.jae.le();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final boolean uoy() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar = this.bly.jae.ouw;
        return (yuVar == null || !yuVar.uq.get() || jae()) ? false : true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void uq() {
        com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
        super.uq();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (yuVar = ouwVar.jae.ouw) == null || !yuVar.uq.get()) {
            return;
        }
        od();
    }

    public final void vpp() {
        if (this.ksc) {
            qbp.ouw("TTAD.AdScene", "tryPreloadNextAdVideo: Already tried preloading the video");
        } else {
            this.ksc = true;
            cj();
        }
    }

    public abstract void vt();

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public void yu() {
        super.yu();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.vm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void zih() {
        if (!this.bly.f7960jg.getAndSet(true) || od.lh(this.bly.vt)) {
            this.bly.f7956cd.ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void zin() {
        super.zin();
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar != null) {
            vtVar.qbp();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void vt(boolean z3) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.tlj tljVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (tljVar = ouwVar.f7956cd) == null) {
            return;
        }
        tljVar.vt(z3);
        this.bly.f7956cd.lh(z3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity, Bundle bundle) {
        this.jqy = bundle;
        super.ouw(activity, bundle);
        ouw(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final com.bytedance.sdk.openadsdk.component.reward.view.bly ouw() {
        return this.bly.rrs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public void ouw(Activity activity, vt.fkw fkwVar) {
        vpp vppVar;
        Bundle bundle;
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar;
        try {
            this.vpp = this.f7765le.jqy();
            vppVar = this.f7765le;
            bundle = this.jqy;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = new com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(activity, this.ouw, vppVar, this, 1, this.ra.zin, this.bly);
            this.bly = ouwVar;
            boolean z3 = this.ra.bly;
            ouwVar.euf = z3;
            ouwVar.njr = this.mwh;
            ouwVar.xn = z3 && th.fkw(vppVar);
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            vt vtVar2 = this.ra;
            ouwVar2.mq = vtVar2.f7772cf;
            ouwVar2.an = vtVar2.tlj.ryl();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = this.bly;
            ouwVar3.f7959gh = this;
            ouwVar3.fvf = this.ra.fkw;
            Intent intent = activity.getIntent();
            com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(this.bly, intent, bundle);
            if (intent != null) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.vt.ouw(intent, this.bly);
                vppVar.ouw = intent.getLongExtra("start_show_time", 0L);
            }
            if (bundle != null && this.bly.xdk) {
                vt();
            }
            com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVarOuw = com.bytedance.sdk.openadsdk.component.reward.vt.le.ouw(this.bly);
            this.vt = vtVarOuw;
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = this.bly;
            ouwVar4.coz = vtVarOuw;
            ouwVar4.osn.vt = this;
            if (ouwVar4.euf) {
                ouwVar4.ex.qbp = new ouw.InterfaceC0093ouw() { // from class: com.bytedance.sdk.openadsdk.activity.ouw.1
                    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.InterfaceC0093ouw
                    public final void ouw(int i4) {
                        ouw ouwVar5 = ouw.this;
                        vt vtVar3 = ouwVar5.ra;
                        if (vtVar3 == null) {
                            return;
                        }
                        vtVar3.ouw(ouwVar5, i4);
                    }
                };
                lh lhVar = this.ra.tlj;
                if (!(lhVar instanceof yu)) {
                    lhVar.ryl().setShowSound(vpp.fkw(vppVar));
                }
            }
            com.bytedance.sdk.openadsdk.utils.ko.ouw(this.bly);
            com.bytedance.sdk.component.utils.ko.vt("TTAD.AdScene", "init: mAdType = " + this.vt);
            if (this.bly.euf && this.f7765le.an()) {
                this.bly.f7958cj = fkwVar.yu;
            }
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = this.bly;
            if (ouwVar5.euf && this.tlj > 0) {
                ouwVar5.f7958cj = fkwVar.yu;
            }
            ouwVar5.rrs.ouw(this.vt);
            this.vt.ouw(this, this.ouw);
            this.vt.cf();
            this.vt.jqy();
            this.f7760lh = (int) this.bly.ex.zin();
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar6 = this.bly;
            if (ouwVar6.euf) {
                ouw(ouwVar6.f7956cd.f7990lh);
                ouw(this.bly.f7956cd.vt);
            }
            b_();
            if (!this.f7765le.lh() && (vtVar = this.vt) != null) {
                vtVar.ouw(this.bly.ey.le());
                this.vt.vpp();
            }
            if (th.fkw(this.f7765le)) {
                vh();
            }
        } catch (Throwable th3) {
            th = th3;
            qbp.ouw("TTAD.AdScene", "onCreate: ", th);
            com.bytedance.sdk.openadsdk.rn.lh.vt();
            lso();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void vm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void lh(boolean z3) {
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.tlj.ouw(this, z3);
        }
    }

    private void ouw(com.bytedance.sdk.openadsdk.core.lh.vt vtVar) {
        if (vtVar != null) {
            HashMap map = new HashMap();
            try {
                int i4 = this.f7763cf + 1;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i4);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            vtVar.ouw(map);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Activity activity) {
        super.ouw(activity);
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return;
        }
        ouwVar.f7964od.ouw();
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.vt;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void ouw(String str, JSONObject jSONObject) {
        vt vtVar;
        if (str == null || !"skipToNextAd".equals(str) || (vtVar = this.ra) == null) {
            return;
        }
        vtVar.vt(this, ouw(7));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final boolean ouw(long j, boolean z3) {
        th thVar;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null) {
            return false;
        }
        ouwVar.jae.fkw = false;
        this.fkw = false;
        com.bytedance.sdk.openadsdk.yu.ra raVarXdk = xdk();
        if (bly() == null) {
            return false;
        }
        this.bly.ex.ouw(bly(), raVarXdk);
        Map<String, Object> mapMt = this.f7765le.lh() ? mt() : null;
        b bVar = new b() { // from class: com.bytedance.sdk.openadsdk.activity.ouw.4
            @Override // b9.b
            public final void ouw(long j8, int i4) {
                qbp.ouw("TTAD.AdScene", "onComplete() called with: totalPlayTime = [" + j8 + "], percent = [" + i4 + "], mVideoHasCompleted=" + ouw.this.fkw);
                ouw ouwVar2 = ouw.this;
                if (ouwVar2.fkw) {
                    return;
                }
                ouwVar2.fkw = true;
                boolean zLh = ouwVar2.f7765le.lh();
                ouw.this.ouw.removeMessages(300);
                ouw.this.th();
                ouw.this.bly.ex.ouw(j8, j8);
                if (zLh) {
                    ouw.this.bly.jae.fkw = true;
                } else {
                    ouw.this.bly.f7967th.set(true);
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3 = ouw.this.bly;
                vpp vppVar = ouwVar3.vt;
                if (vppVar.fvf == 36 && ouwVar3.f7962lh) {
                    ouwVar3.tc.f7993lh.ouw(vppVar);
                    com.bytedance.sdk.openadsdk.utils.ko.vt();
                }
                if (!zLh && ouw.this.bly.vt.ub()) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = ouw.this.bly;
                    ouwVar4.vt.ycd = 1;
                    ouwVar4.ey.zih();
                }
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar5 = ouw.this.bly;
                vpp vppVar2 = ouwVar5.vt;
                if (vppVar2.fvf == 21 && !vppVar2.mq) {
                    vppVar2.an = true;
                    ouwVar5.ey.zih();
                }
                vt.fkw fkwVarOuw = ouw.this.ouw(5);
                fkwVarOuw.fkw = true;
                ouw ouwVar6 = ouw.this;
                ouwVar6.ra.ouw(ouwVar6, fkwVarOuw);
            }

            @Override // b9.b
            public final void vt(long j8, int i4) {
                qbp.ouw("TTAD.AdScene", "onError() called with: totalPlayTime = [" + j8 + "], percent = [" + i4 + "]");
                ouw.this.ouw.removeMessages(300);
                th thVar2 = ouw.this.bly.ey.rn;
                if (thVar2 != null) {
                    thVar2.le();
                }
                if (ouw.this.bly.ex.ouw()) {
                    ouw.this.pno();
                    return;
                }
                ouw.this.bly.ex.tlj();
                if (ouw.this.f7765le.lh()) {
                    ouw.this.bly.jae.yu = true;
                }
                ouw ouwVar2 = ouw.this;
                ouwVar2.ra.ouw(ouwVar2, ouwVar2.ouw(3));
            }

            @Override // b9.b
            public final void ouw() {
                qbp.ouw("TTAD.AdScene", "onTimeOut() called with: ");
                ouw.this.ouw.removeMessages(300);
                ouw.this.th();
                ouw ouwVar2 = ouw.this;
                ouwVar2.ra.ouw(ouwVar2, ouwVar2.ouw(6));
            }

            @Override // b9.b
            public final void ouw(long j8, long j9) throws NumberFormatException {
                com.bytedance.sdk.openadsdk.component.reward.view.yu yuVar;
                ko koVar;
                e eVar;
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = ouw.this.bly;
                if (!ouwVar2.pv && ouwVar2.ex.ouw() && (eVar = (koVar = ouw.this.bly.ex).ra) != null) {
                    eVar.cf();
                    koVar.tlj = true;
                }
                if (ouw.this.bly.tlj.get()) {
                    return;
                }
                ouw.this.ouw.removeMessages(300);
                ouw ouwVar3 = ouw.this;
                if (j8 != ouwVar3.bly.ex.pno) {
                    ouwVar3.th();
                }
                if (ouw.this.bly.ex.ouw()) {
                    ouw.this.bly.ex.ouw(j8, j9);
                    int i4 = (int) (j8 / 1000);
                    if ((ouw.this.bly.qbp.get() || ouw.this.bly.f7957cf.get()) && ouw.this.bly.ex.ouw()) {
                        ouw.this.bly.ex.ryl();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar4 = ouw.this.bly;
                    if (ouwVar4.yu) {
                        ouwVar4.ey.fkw(i4);
                    }
                    if (ouw.this.f7765le.lh()) {
                        ouw ouwVar5 = ouw.this;
                        tlj tljVar = ouwVar5.bly.jae;
                        if (tljVar != null && (yuVar = tljVar.ouw) != null) {
                            yuVar.setTime(String.valueOf(ouwVar5.f7760lh), i4, 0, false);
                            ouw.this.bly.jae.ouw.ouw(j8, j9);
                        }
                    }
                    ouw.this.ouw((j8 * 1.0f) / j9);
                    ouw.this.bly.ouw(true);
                }
            }
        };
        this.bly.ex.ouw(bVar);
        if (!this.f7765le.lh() && (thVar = this.bly.ey.rn) != null) {
            thVar.uoy = bVar;
        }
        return this.bly.ex.ouw(j, z3, mapMt, this.vt);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.ouw.fkw.ouw
    public final void ouw(boolean z3, boolean z10, boolean z11, int i4) {
        vt(z3, z10, z11, i4);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
        super.ouw(pnoVar, pnoVar2, fkwVar);
        if (pnoVar == this && (pnoVar2 instanceof fkw)) {
            int i4 = fkwVar.vt;
            if (i4 == 3) {
                ko koVar = this.bly.ex;
                koVar.ouw(!koVar.qbp() ? 1 : 0, 2);
            } else if (i4 == 6) {
                ko koVar2 = this.bly.ex;
                koVar2.ouw(!koVar2.qbp() ? 1 : 0, !this.bly.ex.qbp() ? 1 : 0);
            } else if (i4 == 5 && !vpp.fkw(this.bly.vt) && fkwVar.fkw) {
                this.bly.ex.ouw("skip", true);
            }
            this.bly.uoy.ouw(false);
            this.bly.uoy.yu(false);
        }
    }

    public final void ouw(float f10) {
        vt vtVar = this.ra;
        if (vtVar == null) {
            return;
        }
        vtVar.tlj.ouw(f10);
        if (this.ksc) {
            return;
        }
        if (this.f7765le.fvf == 43 || f10 < r0.f8303ob / 100.0f) {
            return;
        }
        pno pnoVarMwh = this.ra.tlj.mwh();
        if (pnoVarMwh instanceof ouw) {
            ((ouw) pnoVarMwh).vpp();
        }
    }

    public final vt.fkw ouw(int i4) {
        vt.fkw fkwVar = new vt.fkw(i4, this.bly);
        fkwVar.yu = this.bly.f7958cj;
        return fkwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(Map<String, Object> map, float f10, float f11) {
        super.ouw(map, f10, f11);
        this.ra.tlj.ouw(map, this);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.pno
    public final void ouw(vpp vppVar, int i4, int i10) {
        super.ouw(vppVar, i4, i10);
        yib();
        this.tc = false;
        this.f7762pd = true;
    }
}
