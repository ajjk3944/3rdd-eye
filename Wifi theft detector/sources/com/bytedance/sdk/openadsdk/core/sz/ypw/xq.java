package com.bytedance.sdk.openadsdk.core.sz.ypw;

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
import androidx.annotation.WorkerThread;
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
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import q2.a;
import s2.b;
import s2.c;
import v2.f;

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
    private final a.InterfaceC0459a wd;
    private final boolean wo;
    private WeakReference<emc> wpn;
    private int xhi;
    private boolean xxg;
    private WeakReference<b.a> yz;

    public interface emc {
        void emc(int i10);

        void ycc();
    }

    public xq(Context context, ViewGroup viewGroup, rie rieVar, String str, boolean z10, boolean z11, boolean z12, uym uymVar) {
        super(context, rieVar, viewGroup);
        this.iyl = 0L;
        this.mxo = 0L;
        this.xxg = true;
        this.pxa = 0;
        this.wa = 0;
        this.wd = new a.InterfaceC0459a() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1
            @Override // q2.a.InterfaceC0459a
            public void bw(a aVar) {
                com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
                com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw.eh();
                if (dgVarEh != null && (dgVarEmc = dgVarEh.emc()) != null) {
                    dgVarEmc.xq(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz);
                }
                if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr != null) {
                    ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).dr.emc(1);
                }
            }

            @Override // q2.a.InterfaceC0459a
            public void dg(a aVar) {
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

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar) {
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

            @Override // q2.a.InterfaceC0459a
            public void ypw(a aVar) {
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

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, long j10) {
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

            @Override // q2.a.InterfaceC0459a
            public void ypw(a aVar, int i10) {
            }

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, final com.bykv.vk.openvk.emc.emc.emc.xq.a aVar2) {
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
                aVar2.a();
                aVar2.d();
                aVar2.c();
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        int iA = aVar2.a();
                        int iD = aVar2.d();
                        if (!xq.this.sb() || iD == -1004) {
                            if (xq.this.dg(iA, iD)) {
                                String unused2 = ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).emc;
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.emc(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).msw, (WeakReference<Context>) null, false);
                                xq.this.ypw(true);
                                xq.this.bw();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                            }
                            if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).sf != null) {
                                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).sf.ypw(xq.this.mxo, y2.a.a(((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz, ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).rtt));
                            }
                            if (xq.this.yz == null || xq.this.yz.get() == null || xq.this.sb()) {
                                return;
                            }
                            ((b.a) xq.this.yz.get()).emc(iA, iD);
                        }
                    }
                });
                xq.this.emc(aVar2);
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

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, boolean z13) {
                ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).xq.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym != null) {
                            ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).uym.ypw();
                        }
                    }
                });
            }

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, int i10, int i11) {
                zz.emc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.xxg();
                    }
                });
            }

            @Override // q2.a.InterfaceC0459a
            public void xq(a aVar) {
            }

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, int i10, int i11, int i12) {
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

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, int i10) {
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

            @Override // q2.a.InterfaceC0459a
            public void emc(a aVar, final long j10, final long j11) {
                if (Math.abs(j10 - ((com.bytedance.sdk.openadsdk.core.sz.emc.emc) xq.this).zz) < 50) {
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
                        xq.this.emc(j10, j11);
                        xq.this.ypw(j10, j11);
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
            @WorkerThread
            public void emc(Context context2, Intent intent, boolean z13, final int i10) {
                iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        xq.this.ycc(i10);
                    }
                });
            }
        };
        this.cn = false;
        this.xhi = sba.xq(context);
        emc(z10);
        this.vw = str;
        try {
            this.pxa = viewGroup.getWidth();
            this.wa = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        emc(context);
        this.tp = true;
        this.ra = z11;
        this.wo = z12;
        if (uymVar != null) {
            this.rqm = uymVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dg(int i10, int i11) {
        boolean z10 = i10 == -1010 || i10 == -1007 || i10 == -1004 || i10 == -110 || i10 == 100 || i10 == 200;
        if (i11 == 1 || i11 == 700 || i11 == 800) {
            return true;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ra() {
        this.ffd++;
        bw bwVar = this.uym;
        if (bwVar == null) {
            return;
        }
        bwVar.ypw();
        b.InterfaceC0477b interfaceC0477b = this.sf;
        if (interfaceC0477b != null) {
            interfaceC0477b.emc(this.mxo, y2.a.a(this.zz, this.rtt));
        }
        this.mxo = System.currentTimeMillis() - this.iyl;
        if (this.xxg) {
            this.uym.emc(this.msw, (WeakReference<Context>) null, true);
        }
        if (!this.sra) {
            this.sra = true;
            long j10 = this.rtt;
            ypw(j10, j10);
            long j11 = this.rtt;
            this.zz = j11;
            this.ru = j11;
            ypw(this.rqm);
        }
        if (!this.cf && this.yzg) {
            bw(this.uym, null);
        }
        this.qh = true;
    }

    private void wo() throws JSONException {
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
        int i10;
        int i11;
        try {
            if (yz() != null && (xqVar = this.ycc) != null && this.db != null) {
                int iDg = xqVar.dg();
                int iBw = this.ycc.bw();
                final int width = this.db.getWidth();
                final int height = this.db.getHeight();
                if (width > 0 && height > 0 && iBw > 0 && iDg > 0) {
                    if (iDg == iBw) {
                        i11 = width > height ? height : width;
                        i10 = i11;
                    } else if (iDg > iBw) {
                        i11 = (int) ((width * 1.0d) / ((iDg * 1.0f) / iBw));
                        i10 = width;
                    } else {
                        i10 = (int) ((height * 1.0d) / ((iBw * 1.0f) / iDg));
                        i11 = height;
                    }
                    if (i11 <= height && i11 > 0) {
                        height = i11;
                    }
                    if (i10 <= width && i10 > 0) {
                        width = i10;
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
    public f yz() {
        bw bwVar;
        if (this.gbl.getResources().getConfiguration().orientation != 1 || (bwVar = this.uym) == null) {
            return null;
        }
        return bwVar.sz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
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

    public void uym(boolean z10) throws JSONException {
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
        }
        bw bwVar2 = this.uym;
        if (bwVar2 != null && z10) {
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

    public void ycc(boolean z10) {
        this.xxg = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycc(int i10) {
        bw(i10);
        if (i10 == 4) {
            this.f9300aa = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public void dg() throws JSONException {
        emc(true, 3);
    }

    private void xq(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) {
        xqVar.dg(0);
        this.ycc.emc(xqVar);
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

    public void dg(int i10) {
        this.but = i10;
    }

    public void ypw(int i10, int i11) {
        emc(i10, i11);
        bw bwVar = this.uym;
        if (bwVar == null || i10 <= 0 || i11 <= 0) {
            return;
        }
        bwVar.xq(i10, i11);
        this.uym.emc(i10, i11);
        xxg();
    }

    public void emc(final ycc.emc emcVar) {
        bw bwVar;
        if (!this.cf || (bwVar = this.uym) == null) {
            return;
        }
        bwVar.emc(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.core.sz.ypw.xq.2
            @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.emc
            public void emc(View view, int i10) {
                ycc.emc emcVar2 = emcVar;
                if (emcVar2 != null) {
                    emcVar2.emc(view, i10);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ypw(long j10, long j11) {
        com.bytedance.sdk.openadsdk.core.sup.dg dgVarEmc;
        this.msw.dg(j10);
        this.zz = j10;
        this.rtt = j11;
        this.uym.emc(j10, j11);
        this.uym.emc(y2.a.a(j10, j11));
        try {
            b.InterfaceC0477b interfaceC0477b = this.sf;
            if (interfaceC0477b != null) {
                interfaceC0477b.emc(j10, j11);
            }
        } catch (Throwable th) {
            ul.emc(this.emc, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.dg dgVarEh = this.msw.eh();
        if (dgVarEh == null || (dgVarEmc = dgVarEh.emc()) == null) {
            return;
        }
        dgVarEmc.emc(j10, j11, this.dr);
    }

    public void emc(PAGNativeAd pAGNativeAd) {
        bw bwVar;
        if (!this.cf || (bwVar = this.uym) == null) {
            return;
        }
        bwVar.emc(pAGNativeAd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public void xq() throws JSONException {
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

    private void bw(int i10) {
        if (this.xhi == i10) {
            return;
        }
        this.xhi = i10;
        if (i10 != 4 && i10 != 0) {
            this.sba = false;
        }
        if (!this.sba && !sz() && this.ra) {
            xq(2, i10);
        }
        WeakReference<emc> weakReference = this.wpn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.wpn.get().emc(this.xhi);
    }

    public void emc(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return;
        }
        this.pxa = i10;
        this.wa = i11;
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

    private boolean xq(int i10, int i11) {
        if (i11 == 0) {
            ypw();
            this.f9300aa = true;
            bw bwVar = this.uym;
            if (bwVar != null) {
                bwVar.emc(this.msw, (WeakReference<Context>) null, false);
            }
        }
        if (i11 != 4 && i11 != 0) {
            bw bwVar2 = this.uym;
            if (bwVar2 != null) {
                bwVar2.emc();
            }
            ypw();
            this.f9300aa = true;
            this.sba = false;
            bw bwVar3 = this.uym;
            if (bwVar3 != null) {
                return bwVar3.emc(i10, this.msw.iat(), this.wo);
            }
        } else if (i11 == 4) {
            this.f9300aa = false;
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

    public void xq(int i10) throws JSONException {
        bw(i10);
        if (i10 == 4) {
            this.f9300aa = false;
            xq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(b.a aVar) {
        this.yz = new WeakReference<>(aVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public void emc() {
        com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar = this.ycc;
        if (xqVar != null) {
            xqVar.zz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, s2.b
    public boolean emc(com.bykv.vk.openvk.emc.emc.emc.xq.xq xqVar) {
        super.emc(xqVar);
        if (this.ycc != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(xqVar.vk())) {
            return false;
        }
        ypw(false);
        xqVar.vk();
        xqVar.ypw(com.bytedance.sdk.openadsdk.sra.emc.emc("player_force_raw_url", 0) == 1);
        int i10 = this.but + 1;
        this.but = i10;
        xqVar.bw = i10;
        ypw(xqVar);
        lt();
        com.bytedance.sdk.openadsdk.core.sup.ycc yccVar = this.dr;
        if (yccVar != null) {
            yccVar.emc(false, 0.0f);
        }
        if (!hxp.ypw(this.vw) || this.zz <= 0) {
            this.zz = xqVar.ru();
        }
        if (hxp.ypw(this.vw) && this.zz == this.rtt) {
            this.zz = 0L;
        }
        if (xqVar.ru() <= 0) {
            this.sra = false;
            this.ul.set(false);
        } else {
            long jRu = xqVar.ru();
            this.zz = jRu;
            this.ru = Math.max(this.ru, jRu);
        }
        bw bwVar = this.uym;
        if (bwVar != null) {
            bwVar.emc();
            if (this.ffd == 0) {
                this.uym.uym();
            }
            this.uym.xq(xqVar.msw(), xqVar.zz());
            this.uym.xq(this.db);
            this.uym.emc(xqVar.msw(), xqVar.zz());
        }
        if (this.ycc == null) {
            com.bytedance.sdk.openadsdk.core.sz.dg.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.sz.dg.xq();
            this.ycc = xqVar2;
            xqVar2.emc(this.wd);
        }
        sba();
        this.mxo = 0L;
        try {
            xq(xqVar);
            return true;
        } catch (Exception e10) {
            emc(new com.bykv.vk.openvk.emc.emc.emc.xq.a(-10, 0, e10.getMessage()));
            ul.xq(this.emc, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e10)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc
    public void emc(boolean z10, int i10) throws JSONException {
        if (!this.sra && this.ul.get()) {
            if (z10) {
                emc(i10, false);
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

    public final void emc(int i10, boolean z10) {
        if (z10 || this.cuf) {
            if (z10) {
                this.cuf = false;
            }
            if (this.sra || !this.ul.get()) {
                return;
            }
            cf.emc emcVar = new cf.emc();
            emcVar.ypw(ycc());
            emcVar.dg(zz());
            emcVar.xq(uym());
            emcVar.xq(i10);
            emcVar.dg(msw());
            com.bytedance.sdk.openadsdk.dg.bw.emc.emc.emc(this.uym, emcVar, this.rqm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.sz.emc.emc, com.bytedance.sdk.openadsdk.core.sz.ypw.emc
    public void emc(c cVar, View view) throws JSONException {
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
    public void emc(c cVar, View view, boolean z10) {
        xq(!this.yzg);
        if (this.gbl instanceof Activity) {
            bw bwVar = this.uym;
            if (bwVar != null) {
                bwVar.ypw(this.db);
                this.uym.xq(false);
            }
            emc(1);
            WeakReference<b.d> weakReference = this.sb;
            b.d dVar = weakReference != null ? weakReference.get() : null;
            if (dVar != null) {
                dVar.emc(this.yzg);
            }
        }
    }

    public void emc(emc emcVar) {
        this.wpn = new WeakReference<>(emcVar);
    }
}
