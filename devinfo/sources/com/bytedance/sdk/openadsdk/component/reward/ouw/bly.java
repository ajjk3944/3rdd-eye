package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.yu;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ksc;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.vm;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class bly {
    protected final Activity bly;

    /* renamed from: cf, reason: collision with root package name */
    protected final String f7935cf;

    /* renamed from: jg, reason: collision with root package name */
    protected boolean f7936jg;
    protected boolean ko;
    protected boolean mwh;
    private yu.le ouw;
    protected volatile boolean pno;
    public vm qbp;
    protected boolean rn;
    protected final ouw ryl;

    /* renamed from: th, reason: collision with root package name */
    protected AtomicBoolean f7937th = new AtomicBoolean(false);
    protected final vpp tlj;
    protected com.bytedance.sdk.openadsdk.zin.ouw.ouw vm;
    private boolean vt;
    protected FrameLayout zih;

    public bly(ouw ouwVar) {
        this.ryl = ouwVar;
        this.bly = ouwVar.jvy;
        this.f7935cf = ouwVar.fkw;
        vpp vppVar = ouwVar.vt;
        this.tlj = vppVar;
        this.f7936jg = od.fkw(vppVar);
    }

    public boolean bly() {
        return false;
    }

    public final int cf() {
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
        com.bytedance.sdk.openadsdk.activity.pno pnoVar = this.ryl.f7959gh;
        if (pnoVar == null || (vtVarHun = pnoVar.hun()) == null) {
            return 0;
        }
        return vtVarHun.tlj.pno();
    }

    public void fkw() {
        if (!this.f7936jg || this.f7937th.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.vm;
        if (ouwVar != null) {
            ouwVar.lh();
        }
        yu.le leVar = this.ouw;
        if (leVar != null) {
            leVar.vt();
        }
    }

    public void le() {
        if (this.f7936jg && !this.rn) {
            this.rn = true;
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.vm;
            if (ouwVar != null) {
                ouwVar.yu();
            }
            FrameLayout frameLayout = this.zih;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            vm vmVar = this.qbp;
            if (vmVar != null) {
                vmVar.bly();
                this.qbp = null;
            }
            yu.le leVar = this.ouw;
            if (leVar != null) {
                leVar.yu();
                this.ouw = null;
            }
        }
    }

    public void lh() {
        ouw ouwVar;
        if (this.f7936jg) {
            this.pno = true;
            lh(this.ryl.f7958cj);
            this.vm.ouw();
            vpp vppVar = this.tlj;
            int i4 = vppVar.mu;
            if (i4 == -1) {
                if (od.ra(vppVar)) {
                    com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar2 = this.vm;
                    if (ouwVar2 == null || !ouwVar2.tlj) {
                        this.ryl.coz.zin();
                    } else {
                        this.ryl.f7967th.set(true);
                        this.ryl.coz.jg();
                    }
                } else {
                    this.ryl.f7967th.set(true);
                    this.ryl.coz.jg();
                }
                ouwVar = this.ryl;
                if (ouwVar.f7966sd != null && ouwVar.vt()) {
                    this.ryl.f7966sd.ouw(i4);
                }
            } else if (i4 >= 0) {
                this.ryl.uoy.yu(false);
                if (od.ra(this.tlj)) {
                    com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar3 = this.vm;
                    if (ouwVar3 == null || !ouwVar3.tlj) {
                        yu.le leVar = new yu.le(i4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.5
                            @Override // com.bytedance.sdk.openadsdk.activity.yu.le
                            public final void ouw() {
                                bly.this.ryl.ux.sendEmptyMessage(1);
                            }
                        };
                        this.ouw = leVar;
                        leVar.fkw();
                    } else {
                        yu.le leVar2 = new yu.le(i4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.4
                            @Override // com.bytedance.sdk.openadsdk.activity.yu.le
                            public final void ouw() {
                                bly.this.ryl.ux.sendEmptyMessage(600);
                            }
                        };
                        this.ouw = leVar2;
                        leVar2.fkw();
                    }
                } else {
                    yu.le leVar3 = new yu.le(i4) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.6
                        @Override // com.bytedance.sdk.openadsdk.activity.yu.le
                        public final void ouw() {
                            bly.this.ryl.ux.sendEmptyMessage(600);
                        }
                    };
                    this.ouw = leVar3;
                    leVar3.fkw();
                }
                ouwVar = this.ryl;
                if (ouwVar.f7966sd != null) {
                    this.ryl.f7966sd.ouw(i4);
                }
            }
            if (od.pno(this.tlj)) {
                this.ryl.bs.vt();
            }
        }
    }

    public final void mwh() {
        if (!this.f7937th.compareAndSet(false, true)) {
            this.ryl.bs.lh();
            return;
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.vm;
        if (ouwVar != null) {
            ouwVar.ouw(true);
        }
        ouw ouwVar2 = this.ryl;
        ouwVar2.bs.yib = true;
        ouwVar2.osn.ouw(true, ouwVar2.coz);
        ouw ouwVar3 = this.ryl;
        if (ouwVar3.osn.ouw.fkw) {
            ouwVar3.f7966sd.ouw(ouwVar3.pno);
            return;
        }
        ouwVar3.bs.vt(ouwVar3.f7958cj);
        this.ryl.bs.bly();
        this.ryl.bs.le();
        this.ryl.ux.removeMessages(600);
    }

    public void ouw(int i4) {
    }

    public void pno() {
        yu.le leVar = this.ouw;
        if (leVar != null) {
            leVar.vt();
        }
    }

    public int ra() {
        long jElapsedRealtime;
        long j;
        yu.le leVar = this.ouw;
        if (leVar == null) {
            return 0;
        }
        if (leVar.yu > leVar.f7805le) {
            jElapsedRealtime = leVar.f7806lh - (SystemClock.elapsedRealtime() - leVar.yu);
            j = leVar.fkw;
        } else {
            jElapsedRealtime = leVar.f7806lh;
            j = leVar.fkw;
        }
        long j8 = jElapsedRealtime - j;
        if (j8 < 0) {
            j8 = 0;
        }
        return (int) (j8 / 1000);
    }

    public final boolean ryl() {
        return this.pno;
    }

    public final boolean tlj() {
        return !this.vt;
    }

    public final void vt(boolean z3) {
        if (this.f7936jg) {
            ouw ouwVar = this.ryl;
            if (ouwVar.lso) {
                this.zih = (FrameLayout) ouwVar.rrs.findViewById(com.bytedance.sdk.openadsdk.utils.rn.ybr);
                ouw(z3);
                if (this.ryl.vt.euf()) {
                    vm vmVar = new vm(this.ryl, new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.1
                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void fkw() {
                            bly.ouw(bly.this);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void le() {
                            bly.ouw(bly.this, false);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void lh() {
                            com.bytedance.sdk.openadsdk.activity.pno pnoVar;
                            com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
                            bs bsVar = bly.this.vm.yu;
                            if (bsVar != null) {
                                bsVar.ouw("popupDidShow", (JSONObject) null);
                            }
                            ouw ouwVar2 = bly.this.ryl;
                            if (!ouwVar2.euf || (pnoVar = ouwVar2.f7959gh) == null || (vtVarHun = pnoVar.hun()) == null) {
                                return;
                            }
                            vtVarHun.tlj.th();
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void ouw() {
                            bly.this.ryl.fqk.ouw("skipToNextAd", (JSONObject) null);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final void vt() {
                            bs bsVar = bly.this.vm.yu;
                            if (bsVar != null) {
                                bsVar.ouw("popupDidDismiss", (JSONObject) null);
                            }
                            bly.ouw(bly.this, true);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.widget.vm.ouw
                        public final int yu() {
                            bly blyVar = bly.this;
                            return blyVar.ryl.euf ? blyVar.cf() : blyVar.ra();
                        }
                    });
                    this.qbp = vmVar;
                    vmVar.ouw(this.ryl.rrs);
                    bs bsVar = this.vm.yu;
                    if (bsVar != null) {
                        bsVar.f8110pd = new ksc() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.2
                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void p_() throws JSONException {
                                bly blyVar = bly.this;
                                vm vmVar2 = blyVar.qbp;
                                if (vmVar2 != null) {
                                    vmVar2.ouw(blyVar.ryl.jvy);
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final int q_() {
                                bly blyVar = bly.this;
                                return blyVar.ryl.euf ? blyVar.cf() : blyVar.ra();
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void r_() {
                                bly.ouw(bly.this);
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void s_() {
                                bly.ouw(bly.this, false);
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void vt() throws JSONException {
                                vm vmVar2 = bly.this.qbp;
                                if (vmVar2 != null) {
                                    vmVar2.vt();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.core.ksc
                            public final void t_() {
                            }
                        };
                    }
                }
            }
        }
    }

    public void yu() {
        if (!this.f7936jg || this.f7937th.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar = this.vm;
        if (ouwVar != null) {
            ouwVar.vt();
        }
        if (this.ouw == null || !tlj()) {
            return;
        }
        this.ouw.lh();
    }

    public void ouw() {
        if (this.f7936jg && !this.mwh) {
            this.mwh = true;
        }
    }

    public void ouw(boolean z3) {
        FrameLayout frameLayout = this.zih;
        if (frameLayout != null) {
            ouw ouwVar = this.ryl;
            Context context = ouwVar.hun;
            vpp vppVar = this.tlj;
            int i4 = ouwVar.ucs;
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f7959gh;
            com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar2 = new com.bytedance.sdk.openadsdk.zin.ouw.ouw(context, vppVar, i4, z3, frameLayout, false, pnoVar != null ? pnoVar.f7763cf : 0);
            this.vm = ouwVar2;
            ouwVar2.ouw(this.ryl.fqk);
            this.vm.ouw(true, vt());
        }
    }

    public void ouw(long j) {
        yu.le leVar = this.ouw;
        if (leVar != null) {
            leVar.lh();
        }
    }

    public com.bytedance.sdk.openadsdk.mwh.le vt() {
        return new com.bytedance.sdk.openadsdk.mwh.le() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.bly.3
            @Override // com.bytedance.sdk.openadsdk.mwh.le
            public final void ouw() {
                bly.this.ryl.fqk.ouw(false);
            }
        };
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar) {
        com.bytedance.sdk.openadsdk.zin.ouw.ouw ouwVar;
        if (this.f7936jg && (ouwVar = this.vm) != null) {
            ouwVar.ouw(fkwVar);
        }
    }

    public static /* synthetic */ void ouw(bly blyVar, boolean z3) {
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
        ouw ouwVar = blyVar.ryl;
        if (ouwVar.euf) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f7959gh;
            if (pnoVar == null || (vtVarHun = pnoVar.hun()) == null) {
                return;
            }
            if (z3) {
                vtVarHun.tlj.vm();
            }
            vtVarHun.ouw(1);
            return;
        }
        if (blyVar instanceof ra) {
            blyVar.ouw(0L);
        } else {
            yu.le leVar = blyVar.ouw;
            if (leVar != null) {
                leVar.lh();
            }
        }
        blyVar.vt = false;
    }

    public static /* synthetic */ void ouw(bly blyVar) {
        com.bytedance.sdk.openadsdk.activity.vt vtVarHun;
        ouw ouwVar = blyVar.ryl;
        if (ouwVar.euf) {
            com.bytedance.sdk.openadsdk.activity.pno pnoVar = ouwVar.f7959gh;
            if (pnoVar == null || (vtVarHun = pnoVar.hun()) == null) {
                return;
            }
            vtVarHun.ouw(2);
            return;
        }
        if (blyVar instanceof ra) {
            blyVar.pno();
        } else {
            yu.le leVar = blyVar.ouw;
            if (leVar != null) {
                leVar.vt();
            }
        }
        blyVar.vt = true;
    }

    public final void lh(boolean z3) {
        if (this.f7936jg && this.vm != null && this.pno) {
            this.vm.ouw(z3);
        }
    }
}
