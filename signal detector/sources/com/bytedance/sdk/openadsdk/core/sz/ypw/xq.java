package com.bytedance.sdk.openadsdk.core.sz.ypw;

import J1.a;
import L1.b;
import L1.c;
import L1.e;
import O1.g;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.sb;
import com.bytedance.sdk.component.utils.sba;
import com.bytedance.sdk.component.utils.ul;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.core.zz.hxp;
import com.bytedance.sdk.openadsdk.dg.bw.ypw.cf;
import com.bytedance.sdk.openadsdk.dg.uym;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends com.bytedance.sdk.openadsdk.core.sz.emc.emc {
    private int but;
    private boolean cn;
    private int ffd;
    private final sb.emc hj;
    private long iyl;
    private long mxo;
    private final Runnable ndl;
    private int pxa;
    private final boolean ra;
    private uym rqm;
    private final boolean tp;
    private final String vw;
    private int wa;
    private ypw wad;
    private final a wd;
    private final boolean wo;
    private WeakReference<emc> wpn;
    private int xhi;
    private boolean xxg;
    private WeakReference<b> yz;

    public interface emc {
        void emc(int i);

        void ycc();
    }

    public xq(Context context, ViewGroup viewGroup, rie rieVar, String str, boolean z6, boolean z7, boolean z8, uym uymVar) {
        super(context, rieVar, viewGroup);
        this.iyl = 0L;
        this.mxo = 0L;
        this.xxg = true;
        this.pxa = 0;
        this.wa = 0;
        this.wd = new a() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1
            @Override // J1.a
            public void bw(J1.b bVar) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw.eh();
                if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    dgVarEmc.xq(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz);
                }
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(1);
                }
            }

            @Override // J1.a
            public void dg(J1.b bVar) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw.eh();
                if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    dgVarEmc.ypw(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz);
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 3);
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(0);
                }
            }

            @Override // J1.a
            public void emc(J1.b bVar) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 5);
                            com.bytedance.sdk.openadsdk.ee.emc.xq.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 5);
                            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(9);
                            }
                        } catch (Exception unused) {
                        }
                        xq.this.ra();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw.eh();
                if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
                    return;
                }
                dgVarEmc.dg(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz);
            }

            @Override // J1.a
            public void ypw(J1.b bVar) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.removeCallbacks(xq.this.ndl);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (xq.this.yz != null && xq.this.yz.get() != null) {
                            xq.this.yz.get();
                        }
                        if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                        }
                    }
                });
                if (xq.this.tp) {
                    return;
                }
                xq xqVar = xq.this;
                xqVar.emc(xqVar.rqm);
            }

            @Override // J1.a
            public void emc(J1.b bVar, long j6) {
                if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ylm.get()) {
                    xq.this.sf();
                }
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ee = false;
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.removeCallbacks(xq.this.ndl);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                        }
                        if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).cf || xq.this.wpn == null || xq.this.wpn.get() == null) {
                            return;
                        }
                        ((emc) xq.this.wpn.get()).ycc();
                    }
                });
                xq.this.mkp();
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 0);
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.xq();
                }
                xq xqVar = xq.this;
                xqVar.emc(xqVar.rqm);
            }

            @Override // J1.a
            public void ypw(J1.b bVar, int i) {
            }

            @Override // J1.a
            public void emc(J1.b bVar, final com.bykv.vk.openvk.emc.emc.emc.xq.a aVar) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                if (rie.ycc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw)) {
                    com.bytedance.sdk.openadsdk.sba.xq.xq(new com.bytedance.sdk.openadsdk.sba.dg() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.5
                        @Override // com.bytedance.sdk.openadsdk.sba.dg
                        public com.bytedance.sdk.openadsdk.sba.ypw.emc emc() {
                            com.bytedance.sdk.openadsdk.sba.ypw.emc emcVar = new com.bytedance.sdk.openadsdk.sba.ypw.emc();
                            try {
                                emcVar.ypw("video_player");
                                emcVar.dg(tp.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw));
                                emcVar.emc(BuildConfig.VERSION_NAME);
                            } catch (Throwable unused) {
                            }
                            return emcVar;
                        }
                    });
                }
                String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                int i = aVar.f6577a;
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bykv.vk.openvk.emc.emc.emc.xq.a aVar2 = aVar;
                        int i3 = aVar2.f6577a;
                        int i6 = aVar2.f6578b;
                        if (!xq.this.sb() || i6 == -1004) {
                            if (xq.this.dg(i3, i6)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, (WeakReference<Context>) null, false);
                                xq.this.ypw(true);
                                xq.this.bw();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).sf != null) {
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).sf.ypw(xq.this.mxo, R1.a.a(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).rtt));
                            }
                            if (xq.this.yz == null || xq.this.yz.get() == null || xq.this.sb()) {
                                return;
                            }
                            ((b) xq.this.yz.get()).emc(i3, i6);
                        }
                    }
                });
                xq.this.emc(aVar);
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw.eh();
                if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    dgVarEmc.emc(com.bytedance.sdk.openadsdk.core.sup.emc.emc.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 6);
                com.bytedance.sdk.openadsdk.ee.emc.xq.ypw(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw);
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(14);
                }
            }

            @Override // J1.a
            public void emc(J1.b bVar, boolean z9) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                        }
                    }
                });
            }

            @Override // J1.a
            public void emc(J1.b bVar, int i, int i3) {
                zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.xxg();
                    }
                });
            }

            @Override // J1.a
            public void emc(J1.b bVar, int i, int i3, int i6) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ee = true;
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.aa();
                            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.postDelayed(xq.this.ndl, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 2);
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(4);
                }
            }

            @Override // J1.a
            public void xq(J1.b bVar) {
            }

            @Override // J1.a
            public void emc(J1.b bVar, int i) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ee = false;
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.removeCallbacks(xq.this.ndl);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.10
                    @Override // java.lang.Runnable
                    public void run() {
                        ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                    }
                });
                com.bytedance.sdk.openadsdk.ee.ypw.bw.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, 0);
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(5);
                }
            }

            @Override // J1.a
            public void emc(J1.b bVar, final long j6, final long j7) {
                if (Math.abs(j6 - ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz) < 50) {
                    return;
                }
                if (!((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ylm.get()) {
                    xq.this.sf();
                }
                xq xqVar = xq.this;
                xqVar.emc(xqVar.rqm);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.emc(j6, j7);
                        xq.this.ypw(j6, j7);
                    }
                });
            }
        };
        this.ffd = 0;
        this.ndl = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.4
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, (WeakReference<Context>) null, false);
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                    xq.this.ypw(true);
                    String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                }
            }
        };
        this.hj = new sb.emc() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.6
            @Override // com.bytedance.sdk.component.utils.sb.emc
            public void emc(Context context2, Intent intent, boolean z9, final int i) {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.ycc(i);
                    }
                });
            }
        };
        this.cn = false;
        this.xhi = sba.xq(context);
        emc(z6);
        this.vw = str;
        try {
            this.pxa = viewGroup.getWidth();
            this.wa = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        emc(context);
        this.tp = true;
        this.ra = z7;
        this.wo = z8;
        if (uymVar != null) {
            this.rqm = uymVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dg(int i, int i3) {
        boolean z6 = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i3 == 1 || i3 == 700 || i3 == 800) {
            return true;
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ra() {
        this.ffd++;
        bw bwVar = this.uym;
        if (bwVar == null) {
            return;
        }
        bwVar.ypw();
        c cVar = this.sf;
        if (cVar != null) {
            cVar.emc(this.mxo, R1.a.a(this.zz, this.rtt));
        }
        this.mxo = System.currentTimeMillis() - this.iyl;
        if (this.xxg) {
            this.uym.emc(this.msw, (WeakReference<Context>) null, true);
        }
        if (!this.sra) {
            this.sra = true;
            long j6 = this.rtt;
            ypw(j6, j6);
            long j7 = this.rtt;
            this.zz = j7;
            this.ru = j7;
            ypw(this.rqm);
        }
        if (!this.cf && this.yzg) {
            bw(this.uym, null);
        }
        this.qh = true;
    }

    private void wo() {
        com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar = this.ycc;
        if (xqVar != null) {
            if (!xqVar.uym()) {
                this.ycc.emc(false, this.zz, this.vk);
            } else if (this.sz) {
                ul();
            } else {
                ypw(this.mkp);
            }
        }
        if (this.ul.get()) {
            dr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xxg() {
        com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar;
        int i;
        int i3;
        try {
            if (yz() != null && (xqVar = this.ycc) != null && this.db != null) {
                int iDg = xqVar.dg();
                int iBw = this.ycc.bw();
                final int width = this.db.getWidth();
                final int height = this.db.getHeight();
                if (width > 0 && height > 0 && iBw > 0 && iDg > 0) {
                    if (iDg == iBw) {
                        i3 = width > height ? height : width;
                        i = i3;
                    } else if (iDg > iBw) {
                        i3 = (int) ((width * 1.0d) / ((iDg * 1.0f) / iBw));
                        i = width;
                    } else {
                        i = (int) ((height * 1.0d) / ((iBw * 1.0f) / iDg));
                        i3 = height;
                    }
                    if (i3 <= height && i3 > 0) {
                        height = i3;
                    }
                    if (i <= width && i > 0) {
                        width = i;
                    }
                    this.xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (xq.this.yz() instanceof TextureView) {
                                    ((TextureView) xq.this.yz()).setLayoutParams(layoutParams);
                                    String unused = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                                } else if (xq.this.yz() instanceof SurfaceView) {
                                    ((SurfaceView) xq.this.yz()).setLayoutParams(layoutParams);
                                    String unused2 = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            Objects.toString(this.gbl);
            Objects.toString(yz());
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public g yz() {
        bw bwVar;
        if (this.gbl.getResources().getConfiguration().orientation != 1 || (bwVar = this.uym) == null) {
            return null;
        }
        return bwVar.sz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void bw() {
        com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.sup();
            this.ycc = null;
        }
        if (this.xxg) {
            if ("embeded_ad".equals(this.vw)) {
                this.uym.ul();
            } else {
                this.uym.emc(this.msw, (WeakReference<Context>) null, true);
            }
            this.xq.removeCallbacksAndMessages(null);
            this.sup.clear();
            if (this.cf) {
                iyl();
            }
        }
    }

    public void iyl() {
        if (this.cn && this.rie) {
            this.cn = false;
            sb.emc(this.hj);
        }
    }

    public void mxo() {
        com.bytedance.sdk.openadsdk.core.sup.ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.emc(13);
        }
    }

    public void tp() {
        if (this.ycc != null) {
            ypw(false);
            lt();
            this.ul.set(false);
            this.sra = false;
            emc(this.rqm);
            this.ycc.zz();
        }
    }

    public void uym(boolean z6) {
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
        }
        bw bwVar2 = this.uym;
        if (bwVar2 != null && z6) {
            bwVar2.sba();
        }
        wo();
    }

    public void vk() {
        if (this.cn || !this.rie) {
            return;
        }
        Context applicationContext = aa.emc().getApplicationContext();
        this.cn = true;
        sb.emc(this.hj, applicationContext);
    }

    public int vw() {
        return this.but;
    }

    public void ycc(boolean z6) {
        this.xxg = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycc(int i) {
        bw(i);
        if (i == 4) {
            this.aa = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void dg() {
        emc(true, 3);
    }

    private void xq(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        bVar.dg(0);
        this.ycc.emc(bVar);
        this.iyl = System.currentTimeMillis();
        this.uym.xq(8);
        this.uym.xq(0);
        emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.3
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ycc == null) {
                    return;
                }
                xq.this.iyl = System.currentTimeMillis();
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.dg(0);
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).ycc.emc(true, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).vk);
            }
        });
        if (this.cf) {
            vk();
        }
    }

    public void dg(int i) {
        this.but = i;
    }

    public void ypw(int i, int i3) {
        emc(i, i3);
        bw bwVar = this.uym;
        if (bwVar == null || i <= 0 || i3 <= 0) {
            return;
        }
        bwVar.xq(i, i3);
        this.uym.emc(i, i3);
        xxg();
    }

    public void emc(final ycc.emc emcVar) {
        bw bwVar;
        if (!this.cf || (bwVar = this.uym) == null) {
            return;
        }
        bwVar.emc(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.2
            @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.emc
            public void emc(View view, int i) {
                ycc.emc emcVar2 = emcVar;
                if (emcVar2 != null) {
                    emcVar2.emc(view, i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(long j6, long j7) {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        this.msw.dg(j6);
        this.zz = j6;
        this.rtt = j7;
        this.uym.emc(j6, j7);
        this.uym.emc(R1.a.a(j6, j7));
        try {
            c cVar = this.sf;
            if (cVar != null) {
                cVar.emc(j6, j7);
            }
        } catch (Throwable th) {
            ul.emc(this.emc, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = this.msw.eh();
        if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.emc(j6, j7, this.dr);
    }

    public void emc(PAGNativeAd pAGNativeAd) {
        bw bwVar;
        if (!this.cf || (bwVar = this.uym) == null) {
            return;
        }
        bwVar.emc(pAGNativeAd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void xq() {
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
        }
        bw bwVar2 = this.uym;
        if (bwVar2 != null) {
            bwVar2.sba();
        }
        wo();
    }

    private void bw(int i) {
        if (this.xhi == i) {
            return;
        }
        this.xhi = i;
        if (i != 4 && i != 0) {
            this.sba = false;
        }
        if (!this.sba && !sz() && this.ra) {
            xq(2, i);
        }
        WeakReference<emc> weakReference = this.wpn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.wpn.get().emc(this.xhi);
    }

    public void emc(int i, int i3) {
        if (i == 0 || i3 == 0) {
            return;
        }
        this.pxa = i;
        this.wa = i3;
    }

    public void emc(ypw ypwVar) {
        this.wad = ypwVar;
    }

    private void emc(Context context) {
        ViewGroup xqVar;
        xq xqVar2;
        if (this.cf) {
            xqVar = new com.bytedance.sdk.openadsdk.cf.dg(context);
        } else {
            xqVar = new com.bytedance.sdk.openadsdk.cf.xq(context);
        }
        ViewGroup viewGroup = xqVar;
        if (this.cf) {
            xqVar2 = this;
            xqVar2.uym = new bw(context, viewGroup, true, 17, this.msw, xqVar2, sra());
        } else {
            xqVar2 = this;
            xqVar2.uym = new dg(context, viewGroup, true, 17, xqVar2.msw, xqVar2, false);
        }
        xqVar2.uym.emc(this);
    }

    private boolean xq(int i, int i3) {
        if (i3 == 0) {
            ypw();
            this.aa = true;
            bw bwVar = this.uym;
            if (bwVar != null) {
                bwVar.emc(this.msw, (WeakReference<Context>) null, false);
            }
        }
        if (i3 != 4 && i3 != 0) {
            bw bwVar2 = this.uym;
            if (bwVar2 != null) {
                bwVar2.emc();
            }
            ypw();
            this.aa = true;
            this.sba = false;
            bw bwVar3 = this.uym;
            if (bwVar3 != null) {
                return bwVar3.emc(i, this.msw.iat(), this.wo);
            }
        } else if (i3 == 4) {
            this.aa = false;
            bw bwVar4 = this.uym;
            if (bwVar4 != null) {
                bwVar4.cf();
            }
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.sup.ycc emc(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.msw.nwn()) {
            return null;
        }
        if (this.dr == null) {
            this.dr = com.bytedance.sdk.openadsdk.core.sup.ycc.emc();
        }
        this.dr.emc(view, this.msw);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.dr.emc((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.dr;
    }

    public void xq(int i) {
        bw(i);
        if (i == 4) {
            this.aa = false;
            xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(b bVar) {
        this.yz = new WeakReference<>(bVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public void emc() {
        com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.zz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, L1.f
    public boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.b bVar) {
        super.emc(bVar);
        if (this.ycc != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(bVar.vk())) {
            return false;
        }
        ypw(false);
        bVar.vk();
        bVar.ypw(com.bytedance.sdk.openadsdk.sra.emc.emc("player_force_raw_url", 0) == 1);
        int i = this.but + 1;
        this.but = i;
        bVar.bw = i;
        ypw(bVar);
        lt();
        com.bytedance.sdk.openadsdk.core.sup.ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.emc(false, 0.0f);
        }
        if (!hxp.ypw(this.vw) || this.zz <= 0) {
            this.zz = bVar.ru();
        }
        if (hxp.ypw(this.vw) && this.zz == this.rtt) {
            this.zz = 0L;
        }
        if (bVar.ru() <= 0) {
            this.sra = false;
            this.ul.set(false);
        } else {
            long jRu = bVar.ru();
            this.zz = jRu;
            this.ru = Math.max(this.ru, jRu);
        }
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
            if (this.ffd == 0) {
                this.uym.uym();
            }
            this.uym.xq(bVar.msw(), bVar.zz());
            this.uym.xq(this.db);
            this.uym.emc(bVar.msw(), bVar.zz());
        }
        if (this.ycc == null) {
            com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar = new com.bytedance.sdk.openadsdk.core.sz.dg.xq();
            this.ycc = xqVar;
            xqVar.emc(this.wd);
        }
        sba();
        this.mxo = 0L;
        try {
            xq(bVar);
            return true;
        } catch (Exception e6) {
            String message = e6.getMessage();
            com.bykv.vk.openvk.emc.emc.emc.xq.a aVar = new com.bykv.vk.openvk.emc.emc.emc.xq.a();
            aVar.f6577a = -10;
            aVar.f6578b = 0;
            aVar.f6579c = message;
            emc(aVar);
            ul.xq(this.emc, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e6)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(boolean z6, int i) {
        if (!this.sra && this.ul.get()) {
            if (z6) {
                emc(i, false);
                this.sra = false;
            } else {
                xmt();
            }
        }
        bw();
        com.bytedance.sdk.openadsdk.core.sup.ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.dg();
        }
    }

    public final void emc(int i, boolean z6) {
        if (z6 || this.cuf) {
            if (z6) {
                this.cuf = false;
            }
            if (this.sra || !this.ul.get()) {
                return;
            }
            cf.emc emcVar = new cf.emc();
            emcVar.ypw(ycc());
            emcVar.dg(zz());
            emcVar.xq(uym());
            emcVar.xq(i);
            emcVar.dg(msw());
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.uym, emcVar, this.rqm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void emc(L1.g gVar, View view) {
        com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar = this.ycc;
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
        uym(false);
        bw bwVar3 = this.uym;
        if (bwVar3 != null) {
            bwVar3.ypw(false, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(L1.g gVar, View view, boolean z6) {
        xq(!this.yzg);
        if (this.gbl instanceof Activity) {
            bw bwVar = this.uym;
            if (bwVar != null) {
                bwVar.ypw(this.db);
                this.uym.xq(false);
            }
            emc(1);
            WeakReference<e> weakReference = this.sb;
            e eVar = weakReference != null ? weakReference.get() : null;
            if (eVar != null) {
                eVar.emc(this.yzg);
            }
        }
    }

    public void emc(emc emcVar) {
        this.wpn = new WeakReference<>(emcVar);
    }
}
