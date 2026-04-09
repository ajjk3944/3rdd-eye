package com.bytedance.sdk.openadsdk.component;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.common.sba;
import com.bytedance.sdk.openadsdk.component.ycc;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.lt;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.sb;
import com.bytedance.sdk.openadsdk.core.msw;
import com.bytedance.sdk.openadsdk.core.qh;
import com.bytedance.sdk.openadsdk.core.sra;
import com.bytedance.sdk.openadsdk.core.ul;
import com.bytedance.sdk.openadsdk.core.ylm;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.mxo;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public class uym implements sf.emc {
    private final Context emc;
    private boolean gbl;
    private int msw;
    private PAGAppOpenAdLoadListener uym;
    private final ycc xq;
    private AdSlot ycc;
    private final sra<com.bytedance.sdk.openadsdk.dg.emc> ypw;
    private final AtomicBoolean dg = new AtomicBoolean(false);
    private int bw = 0;
    private volatile int zz = 0;
    private final lt ru = new lt();

    public uym(Context context) {
        if (context != null) {
            this.emc = context.getApplicationContext();
        } else {
            this.emc = aa.emc();
        }
        this.ypw = aa.xq();
        this.xq = ycc.emc(this.emc);
    }

    private void dg(final AdSlot adSlot) {
        final mxo mxoVarYpw = mxo.ypw();
        sb sbVar = new sb();
        sbVar.gbl = this.ru;
        sbVar.dg = 1;
        sbVar.zz = 2;
        this.ypw.emc(adSlot, sbVar, 3, new sra.emc() { // from class: com.bytedance.sdk.openadsdk.component.uym.2
            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) throws JSONException {
                uym.this.zz = 3;
                uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) throws JSONException {
                uym.this.emc(emcVar, xqVar, adSlot, mxoVarYpw);
            }
        });
    }

    private void xq(final AdSlot adSlot) {
        final mxo mxoVarYpw = mxo.ypw();
        sb sbVar = new sb();
        sbVar.gbl = this.ru;
        sbVar.dg = 1;
        sbVar.zz = 2;
        this.ypw.emc(adSlot, sbVar, 3, (ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.uym.1
            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) throws JSONException {
                uym.this.zz = 3;
                uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) throws JSONException {
                uym.this.emc(emcVar, xqVar, adSlot, mxoVarYpw);
            }
        });
    }

    private void ypw(AdSlot adSlot) {
        this.zz = 1;
        if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
            xq(adSlot);
        } else {
            dg(adSlot);
        }
    }

    public static uym emc(Context context) {
        return new uym(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw() {
        final mxo mxoVarYpw = mxo.ypw();
        sb sbVar = new sb();
        sbVar.gbl = this.ru;
        sbVar.dg = 1;
        sbVar.zz = 2;
        this.zz = 1;
        this.ypw.emc(this.ycc, sbVar, 3, (ul) new ylm() { // from class: com.bytedance.sdk.openadsdk.component.uym.5
            boolean emc = false;

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public String emc() {
                if (!com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
                    return uym.this.xq.xq(uym.this.bw);
                }
                com.bytedance.sdk.openadsdk.component.bw.ypw ypwVarEmc = sba.emc().emc(uym.this.ycc);
                if (ypwVarEmc == null) {
                    return null;
                }
                uym.this.ycc.setCacheTime(ypwVarEmc.dg());
                return ypwVarEmc.ypw();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.ul
            public boolean emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar) throws Throwable {
                rie rieVarYcc;
                if (emcVar != null && emcVar.bw() && (rieVarYcc = emcVar.ycc()) != null) {
                    boolean zBw = rie.bw(rieVarYcc);
                    if (rieVarYcc.xmt() || !zBw || com.bytedance.sdk.openadsdk.component.uym.emc.ycc() || !TextUtils.isEmpty(uym.this.xq.emc(rieVarYcc))) {
                        this.emc = !uym.this.xq.dg(rieVarYcc.vaf());
                    } else {
                        this.emc = false;
                        com.bytedance.sdk.openadsdk.component.dg.emc.ypw(emcVar.ycc());
                    }
                    com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(rieVarYcc);
                }
                return this.emc;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(int i, String str) throws JSONException {
                uym.this.zz = 3;
                uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(2, 100, i, str));
            }

            @Override // com.bytedance.sdk.openadsdk.core.ylm, com.bytedance.sdk.openadsdk.core.sra.emc
            public void emc(com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar) throws JSONException {
                rie rieVarYcc;
                if (emcVar == null || (rieVarYcc = emcVar.ycc()) == null) {
                    return;
                }
                rieVarYcc.xq(uym.this.ru.ru());
                if (this.emc) {
                    uym.this.xq.emc(rieVarYcc.vaf(), rieVarYcc.lvs());
                    uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 101, rieVarYcc, (com.bytedance.sdk.openadsdk.core.model.emc) null));
                } else {
                    uym uymVar = uym.this;
                    uymVar.emc(emcVar, xqVar, uymVar.ycc, mxoVarYpw);
                }
            }
        });
    }

    public void emc(AdSlot adSlot, com.bytedance.sdk.openadsdk.common.uym uymVar, int i) {
        if (uymVar == null) {
            return;
        }
        if (i <= 0) {
            i = com.bytedance.sdk.openadsdk.component.uym.emc.uym();
        }
        this.ycc = adSlot;
        adSlot.setCacheScene(0);
        if (com.bytedance.sdk.openadsdk.component.uym.emc.bw()) {
            sba.emc().ypw(adSlot);
        }
        this.ru.emc = !TextUtils.isEmpty(this.ycc.getBidAdm());
        if (uymVar instanceof PAGAppOpenAdLoadListener) {
            this.uym = (PAGAppOpenAdLoadListener) uymVar;
        }
        this.bw = emc(this.ycc);
        this.msw = i;
        this.ru.emc(mxo.ypw());
        if (Build.VERSION.SDK_INT >= 24) {
            this.ru.ypw(com.bytedance.sdk.openadsdk.component.uym.emc.ypw());
            this.ru.ypw(com.bytedance.sdk.openadsdk.component.uym.emc.xq());
        }
        if (this.ru.emc) {
            ypw(this.ycc);
        } else {
            new sf(qh.ypw().getLooper(), this).sendEmptyMessageDelayed(1, i);
            emc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() throws Throwable {
        rie rieVarYpw = this.xq.ypw(this.ycc);
        if (rieVarYpw != null) {
            rieVarYpw.xq(this.ru.ru());
            if (rieVarYpw.vaf() == null) {
                rieVarYpw.emc(this.ycc);
            }
            com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(rieVarYpw);
            boolean zBw = rie.bw(rieVarYpw);
            if (!rieVarYpw.xmt() && zBw) {
                if (com.bytedance.sdk.openadsdk.component.uym.emc.ycc()) {
                    emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 101, rieVarYpw, (com.bytedance.sdk.openadsdk.core.model.emc) null));
                    return;
                } else if (TextUtils.isEmpty(this.xq.emc(rieVarYpw))) {
                    emc(false);
                    com.bytedance.sdk.openadsdk.component.dg.emc.ypw(rieVarYpw);
                    return;
                } else {
                    emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 101, rieVarYpw, (com.bytedance.sdk.openadsdk.core.model.emc) null));
                    return;
                }
            }
            emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 101, rieVarYpw, (com.bytedance.sdk.openadsdk.core.model.emc) null));
            return;
        }
        emc(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(final com.bytedance.sdk.openadsdk.core.model.emc emcVar, com.bytedance.sdk.openadsdk.core.model.xq xqVar, AdSlot adSlot, mxo mxoVar) throws JSONException {
        this.zz = 2;
        if (emcVar != null && emcVar.dg() != null && emcVar.dg().size() != 0) {
            final rie rieVar = emcVar.dg().get(0);
            long jXhi = rieVar.xhi();
            lt ltVar = this.ru;
            ltVar.ypw = jXhi;
            rieVar.xq(ltVar.ru());
            boolean zUym = rie.uym(rieVar);
            if (rieVar.xmt()) {
                emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar));
                return;
            }
            if (!zUym && !rieVar.wh()) {
                if (rie.bw(rieVar)) {
                    if (com.bytedance.sdk.openadsdk.component.uym.emc.ycc()) {
                        lt ltVar2 = this.ru;
                        ltVar2.ypw = -1L;
                        ltVar2.emc(3);
                        emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar));
                        emc(rieVar, adSlot, false, emcVar);
                        return;
                    }
                    emc(rieVar, adSlot, !this.ru.emc, emcVar);
                    if (this.ru.emc) {
                        com.bytedance.sdk.openadsdk.vk.xq.emc(rieVar, mxoVar.dg());
                        if (jXhi == 0) {
                            this.ru.emc(2);
                            emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar));
                            return;
                        } else {
                            qh.ypw().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.uym.3
                                @Override // java.lang.Runnable
                                public void run() throws JSONException {
                                    uym.this.ru.emc(2);
                                    uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar));
                                }
                            }, jXhi);
                            return;
                        }
                    }
                    return;
                }
                lt ltVar3 = this.ru;
                ltVar3.ypw = -1L;
                ltVar3.emc(3);
                emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar));
                emc(rieVar, false, emcVar);
                return;
            }
            emc(new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar));
            if (rie.bw(rieVar)) {
                emc(rieVar, adSlot, false, emcVar);
                return;
            } else {
                emc(rieVar, false, emcVar);
                return;
            }
        }
        this.zz = 3;
        emc(new com.bytedance.sdk.openadsdk.component.bw.xq(2, 100, 20001, msw.emc(20001)));
        xqVar.emc(-3);
        xqVar.xq(3);
        com.bytedance.sdk.openadsdk.core.model.xq.emc(xqVar);
    }

    private void emc() {
        iyl.ypw(new com.bytedance.sdk.component.msw.msw("tryGetAppOpenAdFromCache") { // from class: com.bytedance.sdk.openadsdk.component.uym.4
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (com.bytedance.sdk.openadsdk.utils.ypw.emc()) {
                    uym.this.ypw();
                } else {
                    uym.this.xq();
                }
            }
        });
    }

    private void emc(boolean z6) {
        if (z6) {
            this.xq.emc(this.bw, (String) null);
        }
        ypw(this.ycc);
    }

    private void emc(final rie rieVar, AdSlot adSlot, final boolean z6, final com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.xq.emc(rieVar, adSlot, this.ru, new ycc.ypw() { // from class: com.bytedance.sdk.openadsdk.component.uym.6
            @Override // com.bytedance.sdk.openadsdk.component.ycc.ypw
            public void emc() throws JSONException {
                if (z6) {
                    uym.this.zz = 4;
                    com.bytedance.sdk.openadsdk.component.bw.xq xqVar = new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar);
                    xqVar.emc(true);
                    uym.this.emc(xqVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ycc.ypw
            public void emc(int i, String str) throws JSONException {
                if (z6) {
                    uym.this.zz = 5;
                    uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(2, 100, 10003, msw.emc(10003)));
                }
            }
        });
    }

    private void emc(final rie rieVar, final boolean z6, final com.bytedance.sdk.openadsdk.core.model.emc emcVar) {
        this.xq.emc(rieVar, this.ru, new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.component.uym.7
            @Override // com.bytedance.sdk.openadsdk.component.ycc.emc
            public void emc(com.bytedance.sdk.openadsdk.yzg.emc.ypw ypwVar) throws JSONException {
                if (z6) {
                    uym.this.zz = 4;
                    com.bytedance.sdk.openadsdk.component.bw.xq xqVar = new com.bytedance.sdk.openadsdk.component.bw.xq(1, 100, rieVar, emcVar);
                    xqVar.emc(true);
                    uym.this.emc(xqVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.ycc.emc
            public void emc() throws JSONException {
                if (z6) {
                    uym.this.zz = 5;
                    uym.this.emc(new com.bytedance.sdk.openadsdk.component.bw.xq(2, 100, 10003, msw.emc(10003)));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.openadsdk.component.bw.xq xqVar) throws JSONException {
        int iYpw = xqVar.ypw();
        int iXq = xqVar.xq();
        com.bytedance.sdk.openadsdk.component.dg.emc.emc(this.ru, iXq, iYpw);
        if (!this.dg.compareAndSet(false, true)) {
            if (iYpw == 1 && iXq == 100 && !this.ru.emc) {
                ycc.emc(aa.emc()).emc(new com.bytedance.sdk.openadsdk.component.bw.emc(this.bw, xqVar.dg(), xqVar.emc()));
                if (this.gbl) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.dg.emc.emc(xqVar.dg(), 1, this.ru);
                return;
            }
            return;
        }
        if (iYpw != 1) {
            if (iYpw == 2 || iYpw == 3) {
                PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener = this.uym;
                if (pAGAppOpenAdLoadListener != null) {
                    pAGAppOpenAdLoadListener.onError(xqVar.bw(), xqVar.ycc());
                }
                if (iYpw == 3) {
                    com.bytedance.sdk.openadsdk.component.dg.emc.emc(this.zz, this.msw, this.ru);
                    return;
                }
                return;
            }
            return;
        }
        if (iXq == 100 && !this.ru.emc) {
            this.xq.emc(new com.bytedance.sdk.openadsdk.component.bw.emc(this.bw, xqVar.dg(), xqVar.emc()));
        }
        if (this.uym != null) {
            this.uym.onAdLoaded(new dg(this.emc, xqVar.dg(), iXq == 101, this.ycc));
        }
        if (iXq == 101) {
            com.bytedance.sdk.openadsdk.component.dg.emc.emc(xqVar.dg(), this.ru.emc().dg());
        } else if (iXq == 100) {
            com.bytedance.sdk.openadsdk.component.dg.emc.emc(xqVar.dg(), 0, this.ru);
            this.gbl = true;
        }
    }

    public int emc(AdSlot adSlot) {
        try {
            return Integer.parseInt(adSlot.getCodeId());
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.bytedance.sdk.component.utils.sf.emc
    public void emc(Message message) throws JSONException {
        if (message.what != 1 || this.dg.get()) {
            return;
        }
        emc(new com.bytedance.sdk.openadsdk.component.bw.xq(3, 102, 10002, msw.emc(10002)));
    }
}
