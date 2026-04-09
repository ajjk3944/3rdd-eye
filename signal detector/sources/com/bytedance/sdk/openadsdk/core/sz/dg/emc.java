package com.bytedance.sdk.openadsdk.core.sz.dg;

import J1.b;
import L1.c;
import O1.g;
import R1.a;
import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.cf.dg;
import com.bytedance.sdk.openadsdk.component.reward.view.msw;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.sup.ycc;
import com.bytedance.sdk.openadsdk.core.sz.dg.xq;
import com.bytedance.sdk.openadsdk.core.sz.ypw.bw;
import com.bytedance.sdk.openadsdk.dg.uym;
import com.bytedance.sdk.openadsdk.utils.ra;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.openadsdk.core.sz.emc.emc {
    protected long iyl;
    protected boolean mxo;
    private boolean pxa;
    private long ra;
    private InterfaceC0077emc rqm;
    final xq.ypw tp;
    private final uym vw;
    private final Runnable wa;
    private long wo;
    private final AtomicBoolean wpn;
    private boolean xxg;
    private final int yz;

    /* renamed from: com.bytedance.sdk.openadsdk.core.sz.dg.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0077emc {
        void emc(int i);
    }

    public emc(Context context, ViewGroup viewGroup, rie rieVar, uym uymVar) {
        super(context, rieVar, viewGroup);
        this.ra = 0L;
        this.wo = 0L;
        this.xxg = false;
        this.iyl = 0L;
        this.mxo = false;
        this.wpn = new AtomicBoolean(false);
        this.tp = new AnonymousClass1();
        this.wa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf != null) {
                    emc.this.vk();
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf.emc();
                }
            }
        };
        this.vw = uymVar;
        this.yz = rieVar.tx();
        if (rieVar.nwn() && this.db != null) {
            if (this.dr == null) {
                this.dr = ycc.emc();
            }
            this.dr.emc(this.db, rieVar);
        }
        bw bwVar = new bw(context.getApplicationContext(), new dg(context), true, 17, this.msw, this);
        this.uym = bwVar;
        bwVar.emc(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public boolean ee() {
        return true;
    }

    public void vk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pxa() {
        return this.msw.kx() == 100.0f;
    }

    private boolean wa() {
        return tp() == null || this.ycc == null || (!com.bytedance.sdk.openadsdk.core.gbl.bw.emc(this.msw.ej()) ? this.msw.zhk() != null : this.msw.kv() != null) || this.msw.pxj() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wo() {
        ypw(this.vw);
        this.hxp.bw = this.ycc.ylm();
        if (rie.ycc(this.msw)) {
            com.bytedance.sdk.openadsdk.sba.xq.emc(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.2
                @Override // com.bytedance.sdk.openadsdk.sba.dg
                public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                    com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                    try {
                        emcVar.ypw("video_player");
                        emcVar.dg(tp.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw));
                        emcVar.emc(BuildConfig.VERSION_NAME);
                    } catch (Throwable unused) {
                    }
                    return emcVar;
                }
            });
        }
        lt();
        this.ul.set(false);
        this.wpn.set(false);
        emc(this.vw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wpn() {
        if (this.uym == null) {
            return;
        }
        this.xq.removeCallbacks(this.wa);
        this.uym.ypw();
        this.wo = System.currentTimeMillis() - this.ra;
        if (!this.xxg) {
            this.xxg = true;
            long j6 = this.rtt;
            ypw(j6, j6);
            long j7 = this.rtt;
            this.zz = j7;
            this.ru = j7;
            ypw(this.vw);
        }
        c cVar = this.sf;
        if (cVar != null) {
            cVar.emc(this.wo, a.a(this.zz, this.rtt));
        }
        this.qh = true;
    }

    private void xxg() {
        this.ycc.xq(cuf());
        this.ycc.emc(this.hxp);
        this.ra = System.currentTimeMillis();
        this.uym.xq(8);
        this.uym.xq(0);
        emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ycc == null) {
                    return;
                }
                emc.this.ra = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.dg(0);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ycc.emc(true, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).zz, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).vk);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yz() {
        int i = this.hxp.ycc;
        int iRqm = (i == 2 || i == 1) ? aa.dg().rqm() * TTAdConstant.STYLE_SIZE_RADIO_1_1 : i == 4 ? aa.dg().zz(String.valueOf(this.yz)) : PAGErrorCode.LOAD_FACTORY_NULL_CODE;
        this.xq.removeCallbacks(this.wa);
        this.xq.postDelayed(this.wa, iRqm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void bw() {
        dg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void dg() {
        xq xqVar = this.ycc;
        if (xqVar == null) {
            return;
        }
        xqVar.sup();
        this.ycc = null;
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.zz();
        }
        this.xq.removeCallbacks(this.wa);
        this.xq.removeCallbacksAndMessages(null);
        ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.dg();
        }
    }

    public void iyl() {
        this.tp.emc((b) null, 0, 0);
    }

    public void mxo() {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        if (this.xxg || !this.ul.get()) {
            return;
        }
        dr();
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = this.msw.eh();
        if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.xq(ycc());
    }

    public void ra() {
        ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.emc(13);
        }
    }

    public g tp() {
        bw bwVar = this.uym;
        if (bwVar != null) {
            return bwVar.sz();
        }
        return null;
    }

    public void vw() {
        ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.emc(2);
        }
    }

    public void ycc(boolean z6) {
        this.pxa = z6;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.sz.dg.emc$1, reason: invalid class name */
    public class AnonymousClass1 implements xq.ypw {
        private boolean ypw = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void bw(b bVar) {
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 0);
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(1);
            }
            if (emc.this.rqm != null) {
                emc.this.rqm.emc(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void dg(b bVar) {
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.eh();
            if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                dgVarEmc.ypw(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).zz);
            }
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 3);
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(0);
            }
            if (emc.this.rqm != null) {
                emc.this.rqm.emc(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar) {
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            if (emc.this.wpn.compareAndSet(false, true)) {
                String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                            try {
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(9);
                            } catch (Exception unused2) {
                            }
                        }
                        emc.this.wpn();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.eh();
                if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    long jYcc = emc.this.ycc();
                    dgVarEmc.dg(jYcc);
                    dgVarEmc.bw(jYcc);
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 5);
                com.bytedance.sdk.openadsdk.ee.emc.xq.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 5);
                if (emc.this.rqm != null) {
                    emc.this.rqm.emc(3);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void xq(b bVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void ypw(b bVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.removeCallbacks(emc.this.wa);
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.ypw();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void ypw(b bVar, int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar, long j6) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ul.get()) {
                emc.this.sf();
            }
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ee = false;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.removeCallbacks(emc.this.wa);
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.ypw();
                    }
                }
            });
            if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ul.get()) {
                emc emcVar = emc.this;
                emcVar.iyl = j6;
                emcVar.emc(emcVar.vw);
                emc.this.mkp();
            }
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.xq();
            }
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 0);
            if (emc.this.rqm != null) {
                emc.this.rqm.emc(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar, com.bykv.vk.openvk.emc.emc.emc.xq.a aVar) {
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            int i = aVar.f6577a;
            if (rie.ycc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw)) {
                com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.5
                    @Override // com.bytedance.sdk.openadsdk.sba.dg
                    public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                        com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                        try {
                            emcVar.ypw("video_player");
                            emcVar.dg(tp.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw));
                            emcVar.emc(BuildConfig.VERSION_NAME);
                        } catch (Throwable unused2) {
                        }
                        return emcVar;
                    }
                });
            }
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.removeCallbacks(emc.this.wa);
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.ypw();
                    }
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf.ypw(emc.this.wo, a.a(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).zz, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).rtt));
                    }
                }
            });
            emc.this.emc(aVar);
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 6);
            com.bytedance.sdk.openadsdk.ee.emc.xq.ypw(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw);
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(14);
            }
            if (emc.this.rqm != null) {
                emc.this.rqm.emc(4);
            }
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.eh();
            if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
                return;
            }
            dgVarEmc.emc(com.bytedance.sdk.openadsdk.core.sup.emc.emc.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar, boolean z6) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.removeCallbacks(emc.this.wa);
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.ypw();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar, int i, int i3) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ycc == null) {
                        return;
                    }
                    try {
                        final float fDg = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ycc.dg();
                        final float fBw = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ycc.bw();
                        if (fDg == 0.0f || fBw == 0.0f) {
                            return;
                        }
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (!emc.this.pxa()) {
                                    emc.this.emc(fDg, fBw);
                                    return;
                                }
                                if (ul.ypw(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw) || ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).hxp.ycc == 4) {
                                    emc.this.emc(true, fDg, fBw);
                                    return;
                                }
                                if (ul.xq(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw)) {
                                    emc.this.emc(true, fDg, fBw);
                                    return;
                                }
                                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.se() == 3) {
                                    emc.this.emc(true, fDg, fBw);
                                } else if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.se() == 0) {
                                    emc.this.xq(fDg, fBw);
                                } else {
                                    emc.this.ypw(fDg, fBw);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ul.xq(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar, int i, int i3, int i6) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ee = true;
            emc.this.yz();
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.9
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.aa();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 3);
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(b bVar, int i) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ee = false;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.removeCallbacks(emc.this.wa);
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.10
                @Override // java.lang.Runnable
                public void run() {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.ypw();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 0);
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, J1.a
        public void emc(final b bVar, long j6, long j7) {
            long j8;
            long j9;
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            if (Math.abs(j6 - ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).zz) < 50) {
                return;
            }
            if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ul.get()) {
                emc.this.sf();
            }
            emc emcVar = emc.this;
            emcVar.emc(emcVar.vw);
            emc.this.emc(j6, j7);
            emc.this.ypw(j6, j7);
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.eh();
            if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
                j8 = j6;
                j9 = j7;
            } else {
                j8 = j6;
                j9 = j7;
                dgVarEmc.emc(j8, j9, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr);
            }
            if (!this.ypw || j9 - j8 >= 500) {
                return;
            }
            this.ypw = false;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.emc(bVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw
        public void emc(int i, int i3) {
            emc.this.wo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void xq() {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
            this.uym.cf();
            this.uym.sba();
        }
        xq xqVar = this.ycc;
        if (xqVar != null) {
            if (xqVar.uym()) {
                if (this.sz) {
                    if (com.bytedance.sdk.openadsdk.core.zz.sra()) {
                        this.ycc.ypw(3);
                        xq xqVar2 = this.ycc;
                        xqVar2.emc(false, xqVar2.sba(), this.vk);
                    } else {
                        ul();
                    }
                } else {
                    ypw(this.mkp);
                }
            } else {
                this.ycc.emc(false, this.zz, this.vk);
            }
        }
        if (this.xxg || !this.ul.get()) {
            return;
        }
        dr();
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = this.msw.eh();
        if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.xq(ycc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void ypw(float r12, float r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sz.dg.emc.ypw(float, float):void");
    }

    public void emc(boolean z6, float f2, float f5) {
        try {
            Objects.toString(this.msw.vaf());
            if (!wa() || z6) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f2, (int) f5);
                layoutParams.addRule(13);
                if (tp() != null) {
                    if (tp() instanceof TextureView) {
                        ((TextureView) tp()).setLayoutParams(layoutParams);
                    } else if (tp() instanceof SurfaceView) {
                        ((SurfaceView) tp()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.db.getLayoutParams();
                    if (this.db.getHeight() > 0) {
                        float fMin = Math.min(this.db.getWidth() / f2, this.db.getHeight() / f5);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f2 * fMin);
                            layoutParams.height = (int) (f5 * fMin);
                            if (tp() instanceof TextureView) {
                                ((TextureView) tp()).setLayoutParams(layoutParams);
                            } else if (tp() instanceof SurfaceView) {
                                ((SurfaceView) tp()).setLayoutParams(layoutParams);
                            }
                            if (this.hxp.ycc == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.db.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc(this.emc, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq(float f2, float f5) {
        try {
            if (tp() != null && this.ycc != null) {
                boolean z6 = this.msw.ono() == 1;
                int[] iArrYpw = vw.ypw(aa.emc());
                emc(iArrYpw[0], iArrYpw[1], f2, f5, z6);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(final long j6, final long j7) {
        this.msw.dg(j6);
        this.zz = j6;
        this.rtt = j7;
        final int iA = a.a(j6, j7);
        this.xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.5
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.emc(j6, j7);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.emc(iA);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf.emc(j6, j7);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        int iBhr;
        super.emc(bVar);
        if (this.ycc != null) {
            return false;
        }
        bVar.vk();
        if (TextUtils.isEmpty(bVar.vk())) {
            return false;
        }
        bVar.ypw(com.bytedance.sdk.openadsdk.sra.emc.emc("player_force_raw_url", 0) == 1);
        ypw(bVar);
        bVar.dg(1);
        this.mxo = !bVar.vk().startsWith("http");
        if (this.dr != null) {
            if (this.hxp.ycc == 1) {
                iBhr = this.msw.iw();
            } else {
                iBhr = this.msw.bhr();
            }
            if (this.db != null) {
                try {
                    int iBlf = this.msw.blf();
                    if (iBlf == 7 || iBlf == 8) {
                        View viewEmc = ra.emc(this.db, (Class<? extends View>) msw.class);
                        if (viewEmc != null) {
                            View viewFindViewById = viewEmc.findViewById(vk.qh);
                            View viewFindViewById2 = viewEmc.findViewById(vk.fw);
                            View viewFindViewById3 = viewEmc.findViewById(vk.mjd);
                            ycc yccVar = this.dr;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            yccVar.emc(viewFindViewById2, friendlyObstructionPurpose);
                            this.dr.emc(viewFindViewById, friendlyObstructionPurpose);
                            this.dr.emc(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.pxa) {
                                View viewEmc2 = ra.emc(this.db, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc.emc.class);
                                if (viewEmc2 instanceof com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc.emc) {
                                    this.dr.emc(((com.bytedance.sdk.openadsdk.core.gbl.ypw.ycc.emc) viewEmc2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        ArrayList<View> arrayListEmc = ra.emc(this.db, 1);
                        int size = arrayListEmc.size();
                        int i = 0;
                        while (i < size) {
                            View view = arrayListEmc.get(i);
                            i++;
                            this.dr.emc(view, FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iBlf == 3) {
                        ArrayList<View> arrayListEmc2 = ra.emc(this.db, 2);
                        int size2 = arrayListEmc2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            View view2 = arrayListEmc2.get(i3);
                            i3++;
                            this.dr.emc(view2, FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.dr.emc(iBhr > 0, iBhr / 1000.0f);
        }
        lt();
        if (bVar.ru() > 0) {
            long jRu = bVar.ru();
            this.zz = jRu;
            this.ru = Math.max(this.ru, jRu);
        }
        if (this.zz == this.rtt) {
            this.zz = 0L;
        }
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
            this.uym.uym();
            this.uym.xq(bVar.msw(), bVar.zz());
            this.uym.xq(this.db);
        }
        xq xqVar = new xq();
        this.ycc = xqVar;
        xqVar.emc(this.tp);
        sba();
        this.wo = 0L;
        xxg();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(boolean z6, int i) {
        dg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(float f2, float f5) {
        ViewGroup viewGroup;
        try {
            if (tp() != null && this.ycc != null && (viewGroup = this.db) != null) {
                float width = viewGroup.getWidth();
                float f6 = f2 / (width * 1.0f);
                float height = this.db.getHeight();
                if (f6 <= f5 / (1.0f * height)) {
                    width = (height / f5) * f2;
                } else {
                    height = (width / f2) * f5;
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (tp() instanceof TextureView) {
                    ((TextureView) tp()).setLayoutParams(layoutParams);
                } else if (tp() instanceof SurfaceView) {
                    ((SurfaceView) tp()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc(this.emc, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private void emc(float f2, float f5, float f6, float f7, boolean z6) {
        RelativeLayout.LayoutParams layoutParams;
        if (f6 <= 0.0f || f7 <= 0.0f) {
            try {
                f6 = this.msw.iat().f6581b;
                f7 = this.msw.iat().f6580a;
            } catch (Throwable unused) {
                return;
            }
        }
        if (f7 > 0.0f && f6 > 0.0f) {
            if (z6) {
                if (f6 < f7) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f2, (int) ((f7 * f2) / f6));
            } else if (f6 > f7) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f6 * f5) / f7), (int) f5);
            }
            layoutParams.addRule(13);
            if (tp() != null) {
                if (tp() instanceof TextureView) {
                    ((TextureView) tp()).setLayoutParams(layoutParams);
                } else if (tp() instanceof SurfaceView) {
                    ((SurfaceView) tp()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.db.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.dg.ypw.emc(aa.emc()) || this.db.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.db.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void emc(L1.g gVar, View view) {
        xq xqVar = this.ycc;
        if (xqVar == null) {
            return;
        }
        if (xqVar.ycc()) {
            ypw();
            this.uym.ypw(true, false);
            this.uym.ycc();
            return;
        }
        if (!this.ycc.uym()) {
            bw bwVar = this.uym;
            if (bwVar != null) {
                bwVar.xq(this.db);
            }
            bw(this.zz);
            bw bwVar2 = this.uym;
            if (bwVar2 != null) {
                bwVar2.ypw(false, false);
                return;
            }
            return;
        }
        xq();
        bw bwVar3 = this.uym;
        if (bwVar3 != null) {
            bwVar3.ypw(false, false);
        }
    }

    public void emc(InterfaceC0077emc interfaceC0077emc) {
        this.rqm = interfaceC0077emc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void emc() {
        if (this.ycc != null) {
            wo();
            this.ycc.zz();
        }
    }
}
