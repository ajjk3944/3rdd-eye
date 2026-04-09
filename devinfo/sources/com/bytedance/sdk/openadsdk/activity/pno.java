package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.f1;
import com.bykv.vk.openvk.ouw.ouw.ouw.lh.a;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.vt;
import com.bytedance.sdk.openadsdk.common.ko;
import com.bytedance.sdk.openadsdk.common.ouw;
import com.bytedance.sdk.openadsdk.common.zih;
import com.bytedance.sdk.openadsdk.core.jqy;
import com.bytedance.sdk.openadsdk.core.model.fvf;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.vpp;
import com.bytedance.sdk.openadsdk.core.widget.vm;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.ex;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.tlj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import w8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class pno implements com.bytedance.sdk.openadsdk.core.mwh.yu.vt {
    protected com.bytedance.sdk.openadsdk.component.reward.ouw.ouw bly;

    /* renamed from: cf, reason: collision with root package name */
    public int f7763cf;

    /* renamed from: jg, reason: collision with root package name */
    public String f7764jg;
    public String ko;

    /* renamed from: le, reason: collision with root package name */
    protected vpp f7765le;
    public boolean mwh;
    private boolean ouw;
    protected boolean qbp;
    protected final vt ra;
    public boolean ryl;

    /* renamed from: th, reason: collision with root package name */
    public boolean f7766th;
    public int tlj;
    protected IListenerManager vm;
    private vm vt;
    public boolean zih;
    protected zih zin;
    protected final AtomicBoolean pno = new AtomicBoolean(false);
    public boolean rn = false;

    public pno(vt vtVar, vpp vppVar, int i4, int i10, boolean z3) {
        this.ra = vtVar;
        this.f7765le = vppVar;
        this.tlj = i4;
        this.f7763cf = i10;
        this.zih = z3;
    }

    private void bly() {
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            vt("onAdVideoBarClick");
        } else {
            this.ra.yu();
        }
    }

    private JSONObject tc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.ko);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.f7764jg);
            jSONObject.put("trans_id", ex.ouw().replace("-", ""));
            if (ksc() != null) {
                com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = ksc();
                jSONObject.put("duration", (int) ouwVarKsc.ex.rn());
                jSONObject.put("reward_name", ouwVarKsc.vt.mt);
                jSONObject.put("reward_amount", ouwVarKsc.vt.xdk);
                jSONObject.put("network", ksc.ouw(ouwVarKsc.hun, 60000L));
                JSONObject jSONObjectFak = ouwVarKsc.vt.fak();
                jSONObjectFak.put("gaid", com.bytedance.sdk.openadsdk.qbp.ouw.vt.ouw.ouw().vt());
                jSONObject.put("extra", jSONObjectFak);
                jSONObject.put("video_duration", ouwVarKsc.vt.f8309sd.f6576d);
                String strFkw = "unKnow";
                int i4 = ouwVarKsc.vt.f8316vi;
                if (i4 == 2) {
                    strFkw = uoy.lh();
                } else if (i4 == 1) {
                    strFkw = uoy.fkw();
                }
                jSONObject.put("user_agent", strFkw);
            }
            return jSONObject;
        } catch (Throwable th2) {
            qbp.ouw("Scene", "", th2);
            return null;
        }
    }

    public void b_() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        vt vtVar = this.ra;
        boolean z3 = vtVar != null && vtVar.vpp;
        if (z3 && (ouwVar = this.bly) != null && !(ouwVar.f7959gh instanceof le)) {
            this.zin = new zih(ouwVar) { // from class: com.bytedance.sdk.openadsdk.activity.pno.1
                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final boolean lh() {
                    return pno.this.ra.yu.getBoolean("reward_verify", false);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final boolean ouw() {
                    return pno.this.ra.yu.getBoolean("user_has_give_up_reward", false);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final void vt() {
                    pno.this.ra.yu.putBoolean("user_has_give_up_reward", true);
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final void yu() {
                    pno.this.lso();
                }

                @Override // com.bytedance.sdk.openadsdk.common.zih
                public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2) {
                    pno.this.ouw(ouwVar2);
                }
            };
        }
        if (z3) {
            zih zihVar = this.zin;
            ko.ouw ouwVar2 = new ko.ouw(this.bly, "BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.pno.2
                @Override // java.lang.Runnable
                public final void run() {
                    pno.this.lso();
                }
            }, new ouw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.pno.3
                @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                public final void ouw() {
                    pno pnoVar = pno.this;
                    if (pnoVar instanceof ouw) {
                        ((ouw) pnoVar).fkw();
                    } else if (pnoVar instanceof fkw) {
                        pnoVar.cf();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.ouw.vt
                public final void vt() {
                    pno.this.lso();
                }
            });
            ouwVar2.fkw = c_();
            ouwVar2.f7836le = zihVar;
            ouwVar2.ra = new ouw.InterfaceC0068ouw() { // from class: com.bytedance.sdk.openadsdk.activity.pno.4
                @Override // com.bytedance.sdk.openadsdk.common.ouw.InterfaceC0068ouw
                public final void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar3) {
                    pno.this.vt(ouwVar3);
                }
            };
            com.bytedance.sdk.openadsdk.common.ouw.ouw(ouwVar2.ouw());
        }
    }

    public boolean c_() {
        return false;
    }

    public final void cj() {
        qbp.ouw("Scene", "tryPreloadVideo scene = " + this + ",index =" + this.tlj);
        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(((f1) CacheDirFactory.getICacheDir(this.f7765le.sm)).H(), this.f7765le);
        vtVarOuw.ouw("material_meta", this.f7765le);
        vtVarOuw.ouw("ad_slot", this.f7765le.yiz);
        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new c() { // from class: com.bytedance.sdk.openadsdk.activity.pno.8
            @Override // w8.a
            public final void ouw(a aVar, int i4) {
            }

            @Override // w8.a
            public final void ouw(a aVar, int i4, String str) {
            }
        });
    }

    public abstract boolean d_();

    public abstract String e_();

    public abstract String ex();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void ey() {
        lh(2);
    }

    public abstract void f_();

    public boolean fak() {
        return false;
    }

    public final boolean fqk() {
        vt vtVar = this.ra;
        if (vtVar != null) {
            return vtVar.tlj.ouw(this, this.tlj);
        }
        return false;
    }

    public abstract boolean g_();

    public final vt hun() {
        return this.ra;
    }

    public boolean jae() {
        return false;
    }

    public abstract boolean jqy();

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void kn() {
        vpp vppVar;
        bly();
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.bly;
        if (ouwVar == null || (vppVar = ouwVar.vt) == null) {
            return;
        }
        vppVar.pv();
        vpp vppVar2 = this.bly.vt;
        vppVar2.mq = true;
        if (vpp.fkw(vppVar2)) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.bly;
            vpp vppVar3 = ouwVar2.vt;
            com.bytedance.sdk.openadsdk.yu.lh.vt(vppVar3, ouwVar2.fkw, vppVar3.uq);
        }
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ksc();

    public void lh() {
    }

    public final void lso() {
        if (this.f7765le != null) {
            com.bytedance.sdk.openadsdk.le.vt.ouw().ouw("videoForceBreak", this.f7765le);
        }
        this.ra.vt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void osn() {
        bly();
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.bly ouw();

    public void ouw(Activity activity) {
    }

    public abstract void ouw(Activity activity, vt.fkw fkwVar);

    public abstract void ouw(String str);

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final List<vpp> pv() {
        return this.ra.tlj.ko();
    }

    public void qbp() {
        vm vmVar = this.vt;
        if (vmVar != null) {
            vmVar.bly();
            this.vt = null;
        }
        this.ouw = false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void tlj() {
        if (this.pno.compareAndSet(false, true)) {
            qbp.ouw("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            vt vtVar = this.ra;
            if (vtVar == null || vtVar.ko) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                vt("onAdShow");
            } else {
                vt vtVar2 = this.ra;
                if (!vtVar2.ko) {
                    vtVar2.fkw();
                    com.bytedance.sdk.component.utils.ko.vt("BVA", "invokeOnShowCallback: " + vtVar2.ra + ", " + vtVar2.pno);
                    com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar = vtVar2.ra;
                    if (ouwVar != null) {
                        ouwVar.ouw();
                    } else {
                        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar3 = vtVar2.pno;
                        if (vtVar3 != null) {
                            vtVar3.ouw();
                        } else {
                            tlj.ouw(vtVar2.f7775lh, "show", true);
                        }
                    }
                    Runnable runnable = vtVar2.zih;
                    if (runnable != null) {
                        runnable.run();
                        vtVar2.zih = null;
                    }
                }
            }
            this.ra.fkw();
        }
    }

    public final void ub() {
        lh(0);
    }

    public final boolean ucs() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc;
        vm vmVar;
        if (this.zih || (ouwVarKsc = ksc()) == null || !ouwVarKsc.vt.euf() || (vmVar = this.vt) == null) {
            return false;
        }
        return vmVar.ouw(ouwVarKsc.jvy);
    }

    public boolean uoy() {
        return false;
    }

    public final Activity ux() {
        return this.ra.lh();
    }

    public final void vh() {
        if (this.zih || ksc() == null || ksc().rrs == null || !ksc().vt.euf()) {
            return;
        }
        vm vmVar = new vm(ksc(), new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.pno.9
            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void fkw() {
                pno.this.yu(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void le() {
                pno.this.yu(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void lh() {
                com.bytedance.sdk.component.utils.ko.vt("Scene", "onDialogShow: ");
                vt vtVar = pno.this.ra;
                if (vtVar != null) {
                    vtVar.tlj.th();
                }
                pno.this.yu(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void ouw() {
                pno pnoVar = pno.this;
                pnoVar.lh(pnoVar.ksc());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final void vt() {
                com.bytedance.sdk.component.utils.ko.vt("Scene", "onDialogHide: ");
                vt vtVar = pno.this.ra;
                if (vtVar != null) {
                    vtVar.tlj.vm();
                }
                pno.this.yu(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
            public final int yu() {
                vt vtVar = pno.this.ra;
                if (vtVar != null) {
                    return vtVar.tlj.pno();
                }
                return 0;
            }
        });
        this.vt = vmVar;
        vmVar.ouw(ksc().rrs);
    }

    public abstract void vt(boolean z3);

    public final void vt(boolean z3, boolean z10, boolean z11, int i4) {
        this.ra.ouw(this, z3, z10, z11, i4);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void wp() {
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.vt(this);
        }
    }

    public void yu() {
    }

    public final void lh(final int i4) {
        if (!this.ra.yu.getBoolean("reward_verify", false)) {
            vt vtVar = this.ra;
            if (!vtVar.rn && !vtVar.yu.getBoolean("user_has_give_up_reward", false)) {
                this.ra.yu.putBoolean("reward_verify", true);
                if (ksc() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVarKsc = ksc();
                    com.bytedance.sdk.openadsdk.core.zih.yu();
                    if (cf.cf(String.valueOf(ouwVarKsc.f7961le))) {
                        vpp vppVar = ouwVarKsc.vt;
                        ouw(true, vppVar.xdk, vppVar.mt, 0, "", i4);
                    } else {
                        com.bytedance.sdk.openadsdk.core.zih.lh().ouw(tc(), new vpp.vt() { // from class: com.bytedance.sdk.openadsdk.activity.pno.7
                            @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                            public final void ouw(int i10, String str) {
                                pno.this.ouw(false, 0, "", i10, str, i4);
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.vpp.vt
                            public final void ouw(jqy.vt vtVar2) {
                                fvf fvfVar = vtVar2.f8190lh;
                                pno.this.ouw(vtVar2.vt, fvfVar.f8227lh, fvfVar.yu, 0, "", i4);
                            }
                        });
                    }
                }
            }
        }
    }

    public void ouw(Activity activity, Bundle bundle) {
    }

    public final void vt(Activity activity, vt.fkw fkwVar) {
        if (this.ouw) {
            return;
        }
        this.ouw = true;
        ouw(activity, fkwVar);
    }

    public final void yu(boolean z3) {
        this.qbp = z3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public final void ouw(Bundle bundle) {
    }

    public final void yu(int i4) {
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.ouw(i4);
        }
    }

    public void ouw(pno pnoVar, pno pnoVar2, vt.fkw fkwVar) {
    }

    private void vt(final String str) {
        if (d_()) {
            ouw(str, false, 0, "", 0, "");
        } else {
            bs.fkw(new com.bytedance.sdk.component.pno.pno("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.pno.6
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        pno.this.vt(1).executeFullVideoCallback(pno.this.ex(), str);
                    } catch (Throwable th2) {
                        qbp.yu("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                    }
                }
            });
        }
    }

    public void ouw(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
    }

    public void ouw(Map<String, Object> map, float f10, float f11) {
    }

    private void ouw(final String str, final boolean z3, final int i4, final String str2, final int i10, final String str3) {
        bs.fkw(new com.bytedance.sdk.component.pno.pno("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.pno.5
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    pno.this.vt(0).executeRewardVideoCallback(pno.this.ex(), str, z3, i4, str2, i10, str3);
                } catch (Throwable th2) {
                    qbp.yu("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        });
    }

    public final void ouw(boolean z3, int i4, String str, int i10, String str2, int i11) {
        if (this.ra.rn) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            ouw("onRewardVerify", z3, i4, str, i10, str2);
        } else {
            this.ra.ouw(this, z3, i4, str, i10, str2);
        }
        com.bytedance.sdk.openadsdk.component.reward.tlj.ouw(this.f7765le, z3, i11);
    }

    public final IListenerManager vt(int i4) {
        if (this.vm == null) {
            this.vm = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.ouw.ouw().ouw(i4));
        }
        return this.vm;
    }

    public final void vt(Activity activity) {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar;
        com.bytedance.sdk.openadsdk.component.reward.tlj tljVar;
        if (com.bytedance.sdk.openadsdk.vpp.ouw.ra() && activity != null && activity.isChangingConfigurations()) {
            qbp.ouw("BVA", "callback close is invoke by config change.");
            return;
        }
        vt vtVar = this.ra;
        if (!vtVar.ko) {
            tlj.ouw(vtVar.f7775lh);
        }
        if (d_() && (ouwVar = this.bly) != null && (tljVar = ouwVar.ycd) != null) {
            tljVar.lh();
        }
        if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
            vt("onAdClose");
            return;
        }
        vt vtVar2 = this.ra;
        com.bytedance.sdk.openadsdk.ouw.fkw.ouw ouwVar2 = vtVar2.ra;
        if (ouwVar2 != null) {
            ouwVar2.vt();
            return;
        }
        com.bytedance.sdk.openadsdk.ouw.lh.vt vtVar3 = vtVar2.pno;
        if (vtVar3 != null) {
            vtVar3.vt();
        } else {
            tlj.ouw(vtVar2.f7775lh, "close", true);
        }
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i4, int i10) {
        this.f7765le = vppVar;
        this.tlj = i4;
        this.f7763cf = i10;
    }

    public final void lh(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (fqk()) {
            return;
        }
        vt.fkw fkwVar = new vt.fkw(8, ouwVar);
        fkwVar.yu = ouwVar.f7958cj;
        vt vtVar = this.ra;
        if (vtVar != null) {
            vtVar.vt(this, fkwVar);
        }
    }

    public void jg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.vt
    public void jvy() {
    }

    public void mwh() {
    }

    public void rrs() {
    }

    public void uq() {
    }

    public void zin() {
    }

    public final void vt(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        if (ouwVar == null) {
            com.bytedance.sdk.component.utils.ko.fkw("Scene", "onPlayableChangeNext: adContext is null");
            return;
        }
        try {
            int iPno = this.ra.tlj.pno();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iPno, 0));
            com.bytedance.sdk.openadsdk.yu.lh.fkw(this.f7765le, ouwVar.fkw, jSONObject);
        } catch (Throwable unused) {
        }
        lh(ouwVar);
    }
}
