package com.bytedance.sdk.openadsdk.component.reward.emc;

import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class sz {
    private boolean aa;
    final rie emc;
    private volatile long msw;
    private com.bytedance.adsdk.ugeno.ypw.xq qh;
    private com.bytedance.adsdk.ugeno.ypw.xq sz;
    private volatile long uym;
    private FrameLayout xq;
    private volatile long ycc;
    private final emc ypw;
    private String zz;
    private final AtomicBoolean dg = new AtomicBoolean(false);
    private final AtomicBoolean bw = new AtomicBoolean(false);
    private final AtomicBoolean ru = new AtomicBoolean(false);
    private long gbl = 0;
    private long sup = 0;
    private String cf = null;
    private boolean vk = false;

    public sz(emc emcVar) {
        this.ypw = emcVar;
        this.emc = emcVar.ypw;
        this.zz = emcVar.bw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qh() {
        com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVarMxo;
        rie rieVar = this.emc;
        if (rieVar == null || (emcVarMxo = rieVar.mxo()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbl.dg.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.gbl.dg.ypw(this.ypw.mxo, this.emc, emcVarMxo, this.zz, new com.bytedance.sdk.openadsdk.core.gbl.uym.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.sz.3
            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.ypw
            public void emc() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
            public void ypw(String str) {
                sz szVar = sz.this;
                com.bytedance.sdk.openadsdk.dg.xq.emc(szVar.emc, true, szVar.zz, "success", SystemClock.elapsedRealtime() - sz.this.sup, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
            public void emc(String str) {
                sz.this.sup = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
            public void emc(int i, String str, String str2) {
                sz.this.bw.set(false);
                sz szVar = sz.this;
                com.bytedance.sdk.openadsdk.dg.xq.emc(szVar.emc, true, szVar.zz, "fail", SystemClock.elapsedRealtime() - sz.this.sup, str2, "endcard", i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.ypw
            public void emc(int i, String str) {
                sz.this.bw.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.ypw
            public void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
                sz.this.qh = xqVar;
                sz.this.bw.set(true);
            }
        });
        ypwVar.emc(new com.bytedance.sdk.openadsdk.core.gbl.uym.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.sz.4
            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.emc
            public String emc() {
                return "overlay";
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.emc
            public void ypw() {
                sz.this.vk = true;
                sz.this.ypw.mkp.ru().performClick();
            }
        });
        ypwVar.emc();
        ypwVar.emc(this.ypw.mkp.ru());
    }

    public void gbl() {
        com.bytedance.sdk.openadsdk.dg.xq.emc(SystemClock.elapsedRealtime() - this.msw, this.emc, this.zz);
    }

    public void ru() {
        com.bytedance.sdk.openadsdk.dg.xq.xq(this.emc, this.zz);
    }

    public boolean sup() {
        return this.dg.get();
    }

    public boolean sz() {
        return this.bw.get();
    }

    public void bw() {
        this.ycc = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.dg.xq.emc(this.emc, this.zz);
    }

    public boolean dg() {
        return this.vk;
    }

    public void msw() {
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.qh;
        if (xqVar != null) {
            this.xq.addView(xqVar.gbl(), new FrameLayout.LayoutParams(this.qh.iyl(), this.qh.mxo()));
        }
    }

    public void uym() {
        ru();
        zz();
        com.bytedance.adsdk.ugeno.ypw.xq xqVar = this.sz;
        if (xqVar != null) {
            this.xq.addView(xqVar.gbl(), new FrameLayout.LayoutParams(this.sz.iyl(), this.sz.mxo()));
        }
    }

    public void ycc() {
        this.msw = SystemClock.elapsedRealtime();
    }

    public void zz() {
        if (this.msw <= 0 || this.uym <= 0 || this.ru.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.xq.ypw(this.uym - this.msw, this.emc, this.zz, this.cf);
    }

    public void xq() {
        com.bytedance.sdk.openadsdk.core.gbl.msw.emc emcVarIyl;
        rie rieVar = this.emc;
        if (rieVar == null || (emcVarIyl = rieVar.iyl()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbl.dg.ypw ypwVar = new com.bytedance.sdk.openadsdk.core.gbl.dg.ypw(this.ypw.mxo, this.emc, emcVarIyl, this.zz, new com.bytedance.sdk.openadsdk.core.gbl.uym.ypw() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.sz.1
            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
            public void emc(String str) {
                sz.this.gbl = SystemClock.elapsedRealtime();
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
            public void ypw(String str) {
                sz.this.cf = str;
                sz szVar = sz.this;
                com.bytedance.sdk.openadsdk.dg.xq.emc(szVar.emc, false, szVar.zz, "success", SystemClock.elapsedRealtime() - sz.this.gbl, str, "endcard", 0, null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.xq
            public void emc(int i, String str, String str2) {
                sz.this.cf = str2;
                sz.this.dg.set(false);
                sz szVar = sz.this;
                com.bytedance.sdk.openadsdk.dg.xq.emc(szVar.emc, false, szVar.zz, "fail", SystemClock.elapsedRealtime() - sz.this.gbl, str2, "endcard", i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.ypw
            public void emc() {
                sz.this.bw();
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.ypw
            public void emc(int i, String str) {
                sz.this.dg.set(false);
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                sz szVar = sz.this;
                com.bytedance.sdk.openadsdk.dg.xq.emc(szVar.emc, szVar.zz, jElapsedRealtime - sz.this.ycc, i, str, (String) null);
            }

            @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.ypw
            public void emc(com.bytedance.adsdk.ugeno.ypw.xq<View> xqVar) {
                sz.this.sz = xqVar;
                sz.this.dg.set(true);
                sz.this.uym = SystemClock.elapsedRealtime();
                if (sz.this.ypw.xmt.ul()) {
                    View viewRu = sz.this.ypw.mkp.ru();
                    if (viewRu instanceof com.bytedance.sdk.openadsdk.core.ycc.dg) {
                        ((com.bytedance.sdk.openadsdk.core.ycc.dg) viewRu).setImageResource(com.bytedance.sdk.component.utils.rie.dg(sz.this.ypw.vw, "tt_skip_btn"));
                    }
                }
                sz.this.qh();
                sz.this.zz();
                sz szVar = sz.this;
                com.bytedance.sdk.openadsdk.dg.xq.emc(szVar.emc, szVar.zz, sz.this.uym - sz.this.ycc);
            }
        });
        if (this.emc.mxo() != null) {
            ypwVar.emc(new com.bytedance.sdk.openadsdk.core.gbl.uym.emc() { // from class: com.bytedance.sdk.openadsdk.component.reward.emc.sz.2
                @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.emc
                public String emc() {
                    return "normal";
                }

                @Override // com.bytedance.sdk.openadsdk.core.gbl.uym.emc
                public void ypw() {
                }
            });
        }
        ypwVar.emc();
        ypwVar.emc(this.ypw.mkp.ru());
    }

    public void ypw() {
        this.xq = (FrameLayout) this.ypw.iyl.findViewById(com.bytedance.sdk.openadsdk.utils.vk.aa);
    }

    public void emc() {
        if (this.aa) {
            return;
        }
        this.aa = true;
        ypw();
    }

    public void emc(int i) {
        vw.emc((View) this.xq, i);
    }
}
