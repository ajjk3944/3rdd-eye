package com.bytedance.sdk.openadsdk.core.sz.dg;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.BuildConfig;
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
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import s2.b;
import s2.c;
import v2.f;
import y2.a;

/* loaded from: classes.dex */
public class emc extends com.bytedance.sdk.openadsdk.core.sz.emc.emc {
    protected long iyl;
    protected boolean mxo;
    private boolean pxa;
    private long ra;
    private InterfaceC0162emc rqm;
    final xq.ypw tp;
    private final uym vw;
    private final Runnable wa;
    private long wo;
    private final AtomicBoolean wpn;
    private boolean xxg;
    private final int yz;

    /* renamed from: com.bytedance.sdk.openadsdk.core.sz.dg.emc$emc, reason: collision with other inner class name */
    public interface InterfaceC0162emc {
        void emc(int i10);
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
            long j10 = this.rtt;
            ypw(j10, j10);
            long j11 = this.rtt;
            this.zz = j11;
            this.ru = j11;
            ypw(this.vw);
        }
        b.InterfaceC0477b interfaceC0477b = this.sf;
        if (interfaceC0477b != null) {
            interfaceC0477b.emc(this.wo, a.a(this.zz, this.rtt));
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
        int i10 = this.hxp.ycc;
        int iRqm = (i10 == 2 || i10 == 1) ? aa.dg().rqm() * 1000 : i10 == 4 ? aa.dg().zz(String.valueOf(this.yz)) : 5000;
        this.xq.removeCallbacks(this.wa);
        this.xq.postDelayed(this.wa, iRqm);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public void bw() {
        dg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
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
        this.tp.emc((q2.a) null, 0, 0);
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

    public f tp() {
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

    public void ycc(boolean z10) {
        this.pxa = z10;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.sz.dg.emc$1, reason: invalid class name */
    public class AnonymousClass1 implements xq.ypw {
        private boolean ypw = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void bw(q2.a aVar) {
            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw, 0);
            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr != null) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr.emc(1);
            }
            if (emc.this.rqm != null) {
                emc.this.rqm.emc(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void dg(q2.a aVar) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void xq(q2.a aVar) {
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void ypw(q2.a aVar) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void ypw(q2.a aVar, int i10) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar, long j10) {
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
                emcVar.iyl = j10;
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar, com.bykv.vk.openvk.emc.emc.emc.xq.a aVar2) {
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc;
            aVar2.a();
            aVar2.d();
            aVar2.c();
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
            emc.this.emc(aVar2);
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar, boolean z10) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar, int i10, int i11) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar, int i10, int i11, int i12) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(q2.a aVar, int i10) {
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

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw, q2.a.InterfaceC0459a
        public void emc(final q2.a aVar, long j10, long j11) {
            long j12;
            long j13;
            com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
            if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).zz) < 50) {
                return;
            }
            if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).ul.get()) {
                emc.this.sf();
            }
            emc emcVar = emc.this;
            emcVar.emc(emcVar.vw);
            emc.this.emc(j10, j11);
            emc.this.ypw(j10, j11);
            com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).msw.eh();
            if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
                j12 = j10;
                j13 = j11;
            } else {
                j12 = j10;
                j13 = j11;
                dgVarEmc.emc(j12, j13, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).dr);
            }
            if (!this.ypw || j13 - j12 >= 500) {
                return;
            }
            this.ypw = false;
            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).xq.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.1.2
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.emc(aVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.sz.dg.xq.ypw
        public void emc(int i10, int i11) {
            emc.this.wo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
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

    public void emc(boolean z10, float f10, float f11) {
        try {
            Objects.toString(this.msw.vaf());
            if (!wa() || z10) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
                layoutParams.addRule(13);
                if (tp() != null) {
                    if (tp() instanceof TextureView) {
                        ((TextureView) tp()).setLayoutParams(layoutParams);
                    } else if (tp() instanceof SurfaceView) {
                        ((SurfaceView) tp()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.db.getLayoutParams();
                    if (this.db.getHeight() > 0) {
                        float fMin = Math.min(this.db.getWidth() / f10, this.db.getHeight() / f11);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f10 * fMin);
                            layoutParams.height = (int) (f11 * fMin);
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
    public void xq(float f10, float f11) {
        try {
            if (tp() != null && this.ycc != null) {
                boolean z10 = this.msw.ono() == 1;
                int[] iArrYpw = vw.ypw(aa.emc());
                emc(iArrYpw[0], iArrYpw[1], f10, f11, z10);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(final long j10, final long j11) {
        this.msw.dg(j10);
        this.zz = j10;
        this.rtt = j11;
        final int iA = a.a(j10, j11);
        this.xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.dg.emc.5
            @Override // java.lang.Runnable
            public void run() {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.emc(j10, j11);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).uym.emc(iA);
                try {
                    if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf != null) {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).sf.emc(j10, j11);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) emc.this).emc, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public boolean emc(@NonNull com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) {
        int iBhr;
        super.emc(xqVar);
        if (this.ycc != null) {
            return false;
        }
        xqVar.vk();
        if (TextUtils.isEmpty(xqVar.vk())) {
            return false;
        }
        xqVar.ypw(com.bytedance.sdk.openadsdk.sra.emc.emc("player_force_raw_url", 0) == 1);
        ypw(xqVar);
        xqVar.dg(1);
        this.mxo = !xqVar.vk().startsWith("http");
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
                        int i10 = 0;
                        while (i10 < size) {
                            View view = arrayListEmc.get(i10);
                            i10++;
                            this.dr.emc(view, FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (iBlf == 3) {
                        ArrayList<View> arrayListEmc2 = ra.emc(this.db, 2);
                        int size2 = arrayListEmc2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            View view2 = arrayListEmc2.get(i11);
                            i11++;
                            this.dr.emc(view2, FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.dr.emc(iBhr > 0, iBhr / 1000.0f);
        }
        lt();
        if (xqVar.ru() > 0) {
            long jRu = xqVar.ru();
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
            this.uym.xq(xqVar.msw(), xqVar.zz());
            this.uym.xq(this.db);
        }
        xq xqVar2 = new xq();
        this.ycc = xqVar2;
        xqVar2.emc(this.tp);
        sba();
        this.wo = 0L;
        xxg();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(boolean z10, int i10) {
        dg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(float f10, float f11) {
        ViewGroup viewGroup;
        try {
            if (tp() != null && this.ycc != null && (viewGroup = this.db) != null) {
                float width = viewGroup.getWidth();
                float f12 = f10 / (width * 1.0f);
                float height = this.db.getHeight();
                if (f12 <= f11 / (1.0f * height)) {
                    width = f10 * (height / f11);
                } else {
                    height = f11 * (width / f10);
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

    private void emc(float f10, float f11, float f12, float f13, boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        if (f12 <= 0.0f || f13 <= 0.0f) {
            try {
                f12 = this.msw.iat().B();
                f13 = this.msw.iat().I();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f13 > 0.0f && f12 > 0.0f) {
            if (z10) {
                if (f12 < f13) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
            } else if (f12 > f13) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
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
    public void emc(c cVar, View view) {
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

    public void emc(InterfaceC0162emc interfaceC0162emc) {
        this.rqm = interfaceC0162emc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public void emc() {
        if (this.ycc != null) {
            wo();
            this.ycc.zz();
        }
    }
}
