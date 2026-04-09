package com.bytedance.sdk.openadsdk.core.mwh.yu;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import b9.b;
import b9.f;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.core.bly;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.mwh.vt.fkw;
import com.bytedance.sdk.openadsdk.core.mwh.yu.lh;
import com.bytedance.sdk.openadsdk.core.ryl.le;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.jg;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.vm.yu;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import i9.a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import v8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ouw extends com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw {

    /* renamed from: cj, reason: collision with root package name */
    final AtomicBoolean f8372cj;
    long fqk;
    boolean hun;
    long jvy;
    final Runnable kn;
    protected long lso;
    final lh.vt pv;
    final ra rrs;

    /* renamed from: ub, reason: collision with root package name */
    protected boolean f8373ub;
    public InterfaceC0093ouw ucs;
    final int ux;
    public boolean wp;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0093ouw {
        void ouw(int i4);
    }

    public ouw(Context context, ViewGroup viewGroup, vpp vppVar, ra raVar) {
        super(context, vppVar, viewGroup);
        this.jvy = 0L;
        this.fqk = 0L;
        this.hun = false;
        this.lso = 0L;
        this.f8373ub = false;
        this.f8372cj = new AtomicBoolean(false);
        this.pv = new AnonymousClass1();
        this.kn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.4
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                if (ouwVar.f8338od != null) {
                    ouwVar.ksc();
                    ouw.this.f8338od.ouw();
                }
            }
        };
        this.rrs = raVar;
        this.ux = vppVar.fqk();
        if (vppVar.uq() && this.ksc != null) {
            if (this.f8333cd == null) {
                this.f8333cd = new le();
            }
            this.f8333cd.ouw(this.ksc, vppVar);
        }
        fkw fkwVar = new fkw(context.getApplicationContext(), new jg(context), this.pno, this);
        this.ra = fkwVar;
        fkwVar.ouw((f) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lso() throws JSONException {
        vt(this.rrs);
        this.ex.jqy = this.f8336le.ko;
        if (vpp.le(this.pno)) {
            com.bytedance.sdk.openadsdk.vm.lh.ouw(new yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.2
                @Override // com.bytedance.sdk.openadsdk.vm.yu
                public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                    com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                    try {
                        ouwVar.f8751lh = "video_player";
                        ouwVar.pno = uoy.ouw(ouw.this.pno);
                        ouwVar.vt = BuildConfig.VERSION_NAME;
                    } catch (Throwable unused) {
                    }
                    return ouwVar;
                }
            });
        }
        uoy();
        this.qbp.set(false);
        this.f8372cj.set(false);
        ouw(this.rrs);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void bly() throws JSONException {
        if (this.f8336le != null) {
            lso();
            this.f8336le.ryl();
        }
    }

    public final void ey() {
        this.pv.ouw((c) null, 0, 0);
    }

    public final x8.f fqk() {
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            return fkwVar.f8344le;
        }
        return null;
    }

    public final void hun() {
        le leVar = this.f8333cd;
        if (leVar != null) {
            leVar.ouw(2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final void jg() {
        mwh();
    }

    public final boolean jvy() {
        return fqk() == null || this.f8336le == null || (!com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.pno.kfa) ? this.pno.xn != null : this.pno.lht != null) || this.pno.zih() == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void ko() {
        mwh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void mwh() {
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return;
        }
        lhVar.jg();
        this.f8336le = null;
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.cf();
        }
        this.f8337lh.removeCallbacks(this.kn);
        this.f8337lh.removeCallbacksAndMessages(null);
        le leVar = this.f8333cd;
        if (leVar != null) {
            leVar.yu();
        }
    }

    public final void rrs() {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        if (this.hun || !this.qbp.get()) {
            return;
        }
        fak();
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.vt(rn());
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void ryl() {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            this.ra.rn();
            this.ra.th();
        }
        ko.vt(this.ouw, "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
        lh lhVar = this.f8336le;
        if (lhVar != null) {
            if (lhVar.ra()) {
                if (!this.mwh) {
                    vt(this.fak);
                } else if (bly.rn()) {
                    lh lhVar2 = this.f8336le;
                    lhVar2.yu = 3;
                    lhVar2.ouw(false, lhVar2.rn(), this.rn);
                } else {
                    cd();
                }
                ko.vt(this.ouw, "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
            } else {
                this.f8336le.ouw(false, this.bly, this.rn);
            }
        }
        if (this.hun || !this.qbp.get()) {
            return;
        }
        fak();
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.vt(rn());
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final boolean uq() {
        return true;
    }

    public final void ux() {
        le leVar = this.f8333cd;
        if (leVar != null) {
            leVar.ouw(13);
        }
    }

    public final void vt(final long j, final long j8) {
        this.pno.uq = j;
        this.bly = j;
        this.bs = j8;
        final int iA = a.a(j, j8);
        this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.5
            @Override // java.lang.Runnable
            public final void run() {
                ouw.this.ra.ouw(j, j8);
                ouw.this.ra.ouw(iA);
                try {
                    b bVar = ouw.this.f8338od;
                    if (bVar != null) {
                        bVar.ouw(j, j8);
                    }
                } catch (Throwable th2) {
                    qbp.ouw(ouw.this.ouw, "onProgressUpdate error: ", th2);
                }
            }
        });
    }

    public final void ouw(float f10, float f11) {
        try {
            ko.lh(this.ouw, "landingPageChangeVideoSize start......." + this.pno.yiz);
            jvy();
            ko.lh(this.ouw, "landingPageChangeVideoSize start check condition complete ... go ..");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) f11);
            layoutParams.addRule(13);
            if (fqk() != null) {
                if (fqk() instanceof TextureView) {
                    ((TextureView) fqk()).setLayoutParams(layoutParams);
                } else if (fqk() instanceof SurfaceView) {
                    ((SurfaceView) fqk()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.ksc.getLayoutParams();
                if (this.ksc.getHeight() > 0) {
                    float fMin = Math.min(this.ksc.getWidth() / f10, this.ksc.getHeight() / f11);
                    if (layoutParams2 != null) {
                        layoutParams.width = (int) (f10 * fMin);
                        layoutParams.height = (int) (f11 * fMin);
                        if (fqk() instanceof TextureView) {
                            ((TextureView) fqk()).setLayoutParams(layoutParams);
                        } else if (fqk() instanceof SurfaceView) {
                            ((SurfaceView) fqk()).setLayoutParams(layoutParams);
                        }
                        if (this.ex.tc == 4) {
                            layoutParams2.width = layoutParams.width;
                            layoutParams2.height = layoutParams.height;
                            this.ksc.setLayoutParams(layoutParams2);
                        }
                    }
                }
            }
            ko.vt(this.ouw, "changeVideoSize .... complete ... end !!!");
        } catch (Throwable th2) {
            qbp.ouw(this.ouw, "changeSize error", th2);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw$1, reason: invalid class name */
    public class AnonymousClass1 implements lh.vt {
        private boolean vt = true;

        public AnonymousClass1() {
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void fkw(c cVar) {
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 0);
            le leVar = ouw.this.f8333cd;
            if (leVar != null) {
                leVar.ouw(1);
            }
            InterfaceC0093ouw interfaceC0093ouw = ouw.this.ucs;
            if (interfaceC0093ouw != null) {
                interfaceC0093ouw.ouw(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void lh(c cVar) {
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onRelease: ");
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar) {
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
            if (ouw.this.f8372cj.compareAndSet(false, true)) {
                ko.lh(ouw.this.ouw, "onCompletion: ");
                ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.1
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        le leVar = ouw.this.f8333cd;
                        if (leVar != null) {
                            try {
                                leVar.ouw(9);
                            } catch (Exception unused) {
                            }
                        }
                        ouw ouwVar = ouw.this;
                        if (ouwVar.ra != null) {
                            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
                            ouwVar.ra.vt();
                            ouwVar.fqk = System.currentTimeMillis() - ouwVar.jvy;
                            if (!ouwVar.hun) {
                                ouwVar.hun = true;
                                long j = ouwVar.bs;
                                ouwVar.vt(j, j);
                                long j8 = ouwVar.bs;
                                ouwVar.bly = j8;
                                ouwVar.tlj = j8;
                                ouwVar.vt(ouwVar.rrs);
                            }
                            b bVar = ouwVar.f8338od;
                            if (bVar != null) {
                                bVar.ouw(ouwVar.fqk, a.a(ouwVar.bly, ouwVar.bs));
                            }
                            ouwVar.f8335jg = true;
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    long j = ouw.this.bly;
                    yuVar.lh(j);
                    yuVar.yu(j);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 5);
                com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(ouw.this.pno, 5);
                InterfaceC0093ouw interfaceC0093ouw = ouw.this.ucs;
                if (interfaceC0093ouw != null) {
                    interfaceC0093ouw.ouw(3);
                }
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void vt(c cVar) {
            ko.lh(ouw.this.ouw, "onPrepared: ");
            ouw ouwVar = ouw.this;
            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
            ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.4
                @Override // java.lang.Runnable
                public final void run() {
                    fkw fkwVar = ouw.this.ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void yu(c cVar) {
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
            if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                yuVar.ouw(ouw.this.bly);
            }
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 3);
            le leVar = ouw.this.f8333cd;
            if (leVar != null) {
                leVar.ouw(0);
            }
            InterfaceC0093ouw interfaceC0093ouw = ouw.this.ucs;
            if (interfaceC0093ouw != null) {
                interfaceC0093ouw.ouw(2);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void vt(c cVar, int i4) {
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar, long j) throws JSONException {
            ko.lh(ouw.this.ouw, "onRenderStart: ");
            if (!ouw.this.qbp.get()) {
                ouw.this.bs();
            }
            ouw ouwVar = ouw.this;
            ouwVar.tc = false;
            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
            ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    fkw fkwVar = ouw.this.ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
            if (!ouw.this.qbp.get()) {
                ouw ouwVar2 = ouw.this;
                ouwVar2.lso = j;
                ouwVar2.ouw(ouwVar2.rrs);
                ouw.this.osn();
            }
            le leVar = ouw.this.f8333cd;
            if (leVar != null) {
                leVar.vt();
            }
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 0);
            InterfaceC0093ouw interfaceC0093ouw = ouw.this.ucs;
            if (interfaceC0093ouw != null) {
                interfaceC0093ouw.ouw(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar, com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar) throws JSONException {
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
            ko.fkw(ouw.this.ouw, "onError: " + bVar.f6570a + "," + bVar.f6571b + "," + bVar.f6572c);
            if (vpp.le(ouw.this.pno)) {
                com.bytedance.sdk.openadsdk.vm.lh.lh(new yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.5
                    @Override // com.bytedance.sdk.openadsdk.vm.yu
                    public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                        com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                        try {
                            ouwVar.f8751lh = "video_player";
                            ouwVar.pno = uoy.ouw(ouw.this.pno);
                            ouwVar.vt = BuildConfig.VERSION_NAME;
                        } catch (Throwable unused) {
                        }
                        return ouwVar;
                    }
                });
            }
            ouw ouwVar = ouw.this;
            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
            ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.6
                @Override // java.lang.Runnable
                public final void run() {
                    fkw fkwVar = ouw.this.ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                    ouw ouwVar2 = ouw.this;
                    b bVar2 = ouwVar2.f8338od;
                    if (bVar2 != null) {
                        bVar2.vt(ouwVar2.fqk, a.a(ouwVar2.bly, ouwVar2.bs));
                    }
                }
            });
            ouw.this.ouw(bVar);
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 6);
            com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(ouw.this.pno);
            le leVar = ouw.this.f8333cd;
            if (leVar != null) {
                leVar.ouw(14);
            }
            InterfaceC0093ouw interfaceC0093ouw = ouw.this.ucs;
            if (interfaceC0093ouw != null) {
                interfaceC0093ouw.ouw(4);
            }
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
            if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                return;
            }
            yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar, boolean z3) {
            ko.lh(ouw.this.ouw, "onSeekCompletion: ".concat(String.valueOf(z3)));
            ouw ouwVar = ouw.this;
            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
            ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.7
                @Override // java.lang.Runnable
                public final void run() {
                    fkw fkwVar = ouw.this.ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar, int i4, int i10) {
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onVideoSizeChanged: " + i4 + "x" + i10);
            com.bytedance.sdk.component.utils.bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.8
                @Override // java.lang.Runnable
                public final void run() {
                    lh lhVar = ouw.this.f8336le;
                    if (lhVar == null) {
                        return;
                    }
                    try {
                        final float fYu = lhVar.yu();
                        final float fFkw = ouw.this.f8336le.fkw();
                        if (fYu == 0.0f || fFkw == 0.0f) {
                            return;
                        }
                        ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.8.1
                            /* JADX WARN: Removed duplicated region for block: B:67:0x0198  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 679
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.AnonymousClass1.AnonymousClass8.RunnableC00921.run():void");
                            }
                        });
                    } catch (Throwable th2) {
                        qbp.lh(ouw.this.ouw, th2.getMessage());
                    }
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar, int i4, int i10, int i11) {
            int iOuw;
            String str = ouw.this.ouw;
            StringBuilder sbN = r5.c.n(i4, "IVideoPlayerCallback onBufferStart: ", ", ", i10, ", ");
            sbN.append(i11);
            ko.lh(str, sbN.toString());
            ouw ouwVar = ouw.this;
            ouwVar.tc = true;
            int i12 = ouwVar.ex.tc;
            if (i12 == 2 || i12 == 1) {
                iOuw = zih.yu().pno.ouw("vbtt", 5) * 1000;
            } else if (i12 == 4) {
                zih.yu();
                String strValueOf = String.valueOf(ouwVar.ux);
                iOuw = strValueOf == null ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : cf.qbp(strValueOf).rn;
            } else {
                iOuw = PAGErrorCode.LOAD_FACTORY_NULL_CODE;
            }
            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
            ouwVar.f8337lh.postDelayed(ouwVar.kn, iOuw);
            ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.9
                @Override // java.lang.Runnable
                public final void run() {
                    fkw fkwVar = ouw.this.ra;
                    if (fkwVar != null) {
                        fkwVar.vm();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 3);
            le leVar = ouw.this.f8333cd;
            if (leVar != null) {
                leVar.ouw(4);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(c cVar, int i4) {
            ko.lh(ouw.this.ouw, "IVideoPlayerCallback onBufferEnd: ".concat(String.valueOf(i4)));
            ouw ouwVar = ouw.this;
            ouwVar.tc = false;
            ouwVar.f8337lh.removeCallbacks(ouwVar.kn);
            ouw.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.10
                @Override // java.lang.Runnable
                public final void run() {
                    fkw fkwVar = ouw.this.ra;
                    if (fkwVar != null) {
                        fkwVar.vt();
                    }
                }
            });
            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(ouw.this.pno, 0);
            le leVar = ouw.this.f8333cd;
            if (leVar != null) {
                leVar.ouw(5);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt, v8.b
        public final void ouw(final c cVar, long j, long j8) throws JSONException {
            long j9;
            long j10;
            com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
            if (Math.abs(j - ouw.this.bly) < 50) {
                return;
            }
            if (!ouw.this.qbp.get()) {
                ouw.this.bs();
            }
            ouw ouwVar = ouw.this;
            ouwVar.ouw(ouwVar.rrs);
            ouw.this.ouw(j, j8);
            ouw.this.vt(j, j8);
            com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = ouw.this.pno.sd();
            if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                j9 = j;
                j10 = j8;
            } else {
                j9 = j;
                j10 = j8;
                yuVar.ouw(j9, j10, ouw.this.f8333cd);
            }
            if (!this.vt || j10 - j9 >= 500) {
                return;
            }
            this.vt = false;
            ouw.this.f8337lh.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1.this.ouw(cVar);
                }
            }, 1000L);
        }

        @Override // com.bytedance.sdk.openadsdk.core.mwh.yu.lh.vt
        public final void ouw() throws JSONException {
            ouw.this.lso();
        }
    }

    public void ksc() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) throws JSONException {
        int iMyk;
        super.ouw(aVar);
        if (this.f8336le != null) {
            ko.fkw(this.ouw, "playVideoUrl: already invoked");
            return false;
        }
        ko.vt(this.ouw, "video local url " + aVar.pno());
        if (TextUtils.isEmpty(aVar.pno())) {
            ko.fkw(this.ouw, "No video info");
            return false;
        }
        aVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        vt(aVar);
        aVar.ko = 1;
        this.f8373ub = !aVar.pno().startsWith("http");
        if (this.f8333cd != null) {
            if (this.ex.tc == 1) {
                iMyk = this.pno.ng();
            } else {
                iMyk = this.pno.myk();
            }
            ViewGroup viewGroup = this.ksc;
            if (viewGroup != null) {
                try {
                    int i4 = this.pno.lna;
                    if (i4 == 7 || i4 == 8) {
                        View viewOuw = ey.ouw(viewGroup, (Class<? extends View>) com.bytedance.sdk.openadsdk.component.reward.view.bly.class);
                        if (viewOuw != null) {
                            View viewFindViewById = viewOuw.findViewById(rn.ryl);
                            View viewFindViewById2 = viewOuw.findViewById(rn.amr);
                            View viewFindViewById3 = viewOuw.findViewById(rn.f8731uj);
                            le leVar = this.f8333cd;
                            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                            leVar.ouw(viewFindViewById2, friendlyObstructionPurpose);
                            this.f8333cd.ouw(viewFindViewById, friendlyObstructionPurpose);
                            this.f8333cd.ouw(viewFindViewById3, friendlyObstructionPurpose);
                            if (this.wp) {
                                View viewOuw2 = ey.ouw(this.ksc, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw.class);
                                if (viewOuw2 instanceof com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) {
                                    this.f8333cd.ouw(((com.bytedance.sdk.openadsdk.core.cf.vt.fkw.ouw) viewOuw2).getMarkView(), friendlyObstructionPurpose);
                                }
                            }
                        }
                        ArrayList<View> arrayListOuw = ey.ouw(this.ksc, 1);
                        int size = arrayListOuw.size();
                        int i10 = 0;
                        while (i10 < size) {
                            View view = arrayListOuw.get(i10);
                            i10++;
                            this.f8333cd.ouw(view, FriendlyObstructionPurpose.OTHER);
                        }
                    } else if (i4 == 3) {
                        ArrayList<View> arrayListOuw2 = ey.ouw(viewGroup, 2);
                        int size2 = arrayListOuw2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            View view2 = arrayListOuw2.get(i11);
                            i11++;
                            this.f8333cd.ouw(view2, FriendlyObstructionPurpose.OTHER);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            this.f8333cd.ouw(iMyk > 0, iMyk / 1000.0f);
        }
        uoy();
        long j = aVar.tlj;
        if (j > 0) {
            this.bly = j;
            this.tlj = Math.max(this.tlj, j);
        }
        if (this.bly == this.bs) {
            this.bly = 0L;
        }
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            this.ra.tlj();
            this.ra.vt(aVar.ra, aVar.pno);
            this.ra.lh(this.ksc);
        }
        lh lhVar = new lh();
        this.f8336le = lhVar;
        lhVar.ouw(this.pv);
        od();
        this.fqk = 0L;
        this.f8336le.f8371jg = Math.max(1, this.ey);
        this.f8336le.ouw(this.ex);
        this.jvy = System.currentTimeMillis();
        this.ra.lh(8);
        this.ra.lh(0);
        ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.yu.ouw.3
            @Override // java.lang.Runnable
            public final void run() {
                ouw ouwVar = ouw.this;
                if (ouwVar.f8336le == null) {
                    return;
                }
                ouwVar.jvy = System.currentTimeMillis();
                ouw.this.ra.yu(0);
                ouw ouwVar2 = ouw.this;
                ouwVar2.f8336le.ouw(true, ouwVar2.bly, ouwVar2.rn);
            }
        });
        return true;
    }

    public final void ouw(float f10, float f11, float f12, float f13, boolean z3) {
        RelativeLayout.LayoutParams layoutParams;
        try {
            ko.vt(this.ouw, "sWh=" + f10 + "x" + f11 + ", vWH=" + f12 + "x" + f13 + ", " + z3);
            if (f12 <= 0.0f || f13 <= 0.0f) {
                com.bykv.vk.openvk.ouw.ouw.ouw.lh.c cVar = this.pno.f8309sd;
                float f14 = cVar.f6574b;
                f13 = cVar.f6573a;
                f12 = f14;
            }
            if (f13 > 0.0f && f12 > 0.0f) {
                if (z3) {
                    if (f12 < f13) {
                        return;
                    }
                    ko.vt(this.ouw, "Vertical screen mode use video width compute scale value");
                    layoutParams = new RelativeLayout.LayoutParams((int) f10, (int) ((f13 * f10) / f12));
                } else {
                    if (f12 > f13) {
                        return;
                    }
                    ko.vt(this.ouw, "Landscape screen mode use video height compute scale value");
                    layoutParams = new RelativeLayout.LayoutParams((int) ((f12 * f11) / f13), (int) f11);
                }
                layoutParams.addRule(13);
                if (fqk() != null) {
                    if (fqk() instanceof TextureView) {
                        ((TextureView) fqk()).setLayoutParams(layoutParams);
                    } else if (fqk() instanceof SurfaceView) {
                        ((SurfaceView) fqk()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.ksc.getLayoutParams();
                    if (!com.bytedance.sdk.component.adexpress.yu.vt.ouw(zih.ouw()) || this.ksc.getHeight() <= 0 || layoutParams2 == null) {
                        return;
                    }
                    layoutParams2.width = layoutParams.width;
                    layoutParams2.height = layoutParams.height;
                    this.ksc.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th2) {
            ko.ouw(this.ouw, "changeSize error", th2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw() {
        lh lhVar = this.f8336le;
        if (lhVar == null) {
            return;
        }
        if (lhVar.le()) {
            cf();
            this.ra.le(true);
            this.ra.pno();
            return;
        }
        if (!this.f8336le.ra()) {
            fkw fkwVar = this.ra;
            if (fkwVar != null) {
                fkwVar.lh(this.ksc);
            }
            lh(this.bly);
            fkw fkwVar2 = this.ra;
            if (fkwVar2 != null) {
                fkwVar2.le(false);
                return;
            }
            return;
        }
        ryl();
        fkw fkwVar3 = this.ra;
        if (fkwVar3 != null) {
            fkwVar3.le(false);
        }
    }
}
