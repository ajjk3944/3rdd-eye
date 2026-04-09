package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b9.d;
import b9.f;
import com.bytedance.sdk.component.utils.bly;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ko.jg;
import com.bytedance.sdk.openadsdk.ko.mwh;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.fkw.vt.ko;
import com.bytedance.sdk.openadsdk.yu.ra;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import i9.a;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONException;
import v8.b;
import v8.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh extends com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw {

    /* renamed from: cj, reason: collision with root package name */
    private final String f8358cj;
    vt fqk;
    public int hun;
    WeakReference<d> jvy;
    private WeakReference<ouw> kn;
    private long lso;
    private int mt;
    private int myk;

    /* renamed from: ng, reason: collision with root package name */
    private boolean f8359ng;
    private final boolean pv;
    public boolean rrs;

    /* renamed from: ub, reason: collision with root package name */
    private final boolean f8360ub;
    private int ucs;
    private long ux;

    /* renamed from: vh, reason: collision with root package name */
    private int f8361vh;
    private final boolean wp;
    private final Runnable xdk;
    private final b yhj;
    private ra yib;
    private final ksc.ouw zvq;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        void le();

        void ra();
    }

    public lh(Context context, ViewGroup viewGroup, vpp vppVar, String str, boolean z3, boolean z10, boolean z11, ra raVar) {
        lh lhVar;
        super(context, vppVar, viewGroup);
        this.ux = 0L;
        this.lso = 0L;
        this.rrs = true;
        this.ucs = 0;
        this.f8361vh = 0;
        this.yhj = new b() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1
            @Override // v8.b
            public final void fkw(c cVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.vt(lh.this.bly);
                }
                if (lh.this.f8333cd != null) {
                    lh.this.f8333cd.ouw(1);
                }
            }

            @Override // v8.b
            public final void ouw(c cVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.1
                    @Override // java.lang.Runnable
                    public final void run() throws JSONException {
                        try {
                            com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 5);
                            com.bytedance.sdk.openadsdk.tc.ouw.lh.ouw(lh.this.pno, 5);
                            if (lh.this.f8333cd != null) {
                                lh.this.f8333cd.ouw(9);
                            }
                        } catch (Exception unused) {
                        }
                        lh.fkw(lh.this);
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
                    return;
                }
                yuVar.lh(lh.this.bly);
            }

            @Override // v8.b
            public final void vt(c cVar) throws JSONException {
                lh.this.f8337lh.removeCallbacks(lh.this.xdk);
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.jvy != null && lh.this.jvy.get() != null) {
                            ((d) lh.this.jvy.get()).k_();
                        }
                        if (lh.this.ra != null) {
                            lh.this.ra.vt();
                        }
                    }
                });
                if (lh.this.f8360ub) {
                    return;
                }
                lh lhVar2 = lh.this;
                lhVar2.ouw(lhVar2.yib);
            }

            @Override // v8.b
            public final void yu(c cVar) {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.ouw(lh.this.bly);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 3);
                if (lh.this.f8333cd != null) {
                    lh.this.f8333cd.ouw(0);
                }
            }

            @Override // v8.b
            public final void ouw(c cVar, long j) throws JSONException {
                if (!lh.this.zin.get()) {
                    lh.this.bs();
                }
                lh.cf(lh.this);
                lh.this.f8337lh.removeCallbacks(lh.this.xdk);
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.ra != null) {
                            lh.this.ra.vt();
                        }
                        if (!lh.this.ko || lh.this.kn == null || lh.this.kn.get() == null) {
                            return;
                        }
                        ((ouw) lh.this.kn.get()).le();
                    }
                });
                lh.this.osn();
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 0);
                if (lh.this.f8333cd != null) {
                    lh.this.f8333cd.vt();
                }
                lh lhVar2 = lh.this;
                lhVar2.ouw(lhVar2.yib);
            }

            @Override // v8.b
            public final void vt(c cVar, int i4) {
            }

            @Override // v8.b
            public final void ouw(c cVar, final com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar) throws JSONException {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                if (vpp.le(lh.this.pno)) {
                    com.bytedance.sdk.openadsdk.vm.lh.lh(new com.bytedance.sdk.openadsdk.vm.yu() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.5
                        @Override // com.bytedance.sdk.openadsdk.vm.yu
                        public final com.bytedance.sdk.openadsdk.vm.vt.ouw ouw() {
                            com.bytedance.sdk.openadsdk.vm.vt.ouw ouwVar = new com.bytedance.sdk.openadsdk.vm.vt.ouw();
                            try {
                                ouwVar.f8751lh = "video_player";
                                ouwVar.pno = uoy.ouw(lh.this.pno);
                                ouwVar.vt = BuildConfig.VERSION_NAME;
                            } catch (Throwable unused) {
                            }
                            return ouwVar;
                        }
                    });
                }
                ko.fkw(lh.this.ouw, "onError: " + bVar.f6570a + ", " + bVar.f6571b + ", " + bVar.f6572c);
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.6
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar2 = bVar;
                        int i4 = bVar2.f6570a;
                        int i10 = bVar2.f6571b;
                        if (!lh.this.fvf() || i10 == -1004) {
                            if (lh.ouw(lh.this, i4, i10)) {
                                ko.fkw(lh.this.ouw, "Play video error，show result page、、、、、、、");
                                lh.this.ra.ouw(lh.this.pno);
                                lh lhVar2 = lh.this;
                                lhVar2.f8335jg = true;
                                lhVar2.ko();
                            }
                            if (lh.this.ra != null) {
                                lh.this.ra.vt();
                            }
                            if (lh.this.f8338od != null) {
                                lh.this.f8338od.vt(lh.this.lso, a.a(lh.this.bly, lh.this.bs));
                            }
                            if (lh.this.jvy == null || lh.this.jvy.get() == null || lh.this.fvf()) {
                                return;
                            }
                            ((d) lh.this.jvy.get()).ouw(i4, i10);
                        }
                    }
                });
                lh.this.ouw(bVar);
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = lh.this.pno.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 6);
                com.bytedance.sdk.openadsdk.tc.ouw.lh.vt(lh.this.pno);
                if (lh.this.f8333cd != null) {
                    lh.this.f8333cd.ouw(14);
                }
            }

            @Override // v8.b
            public final void lh(c cVar) {
            }

            @Override // v8.b
            public final void ouw(c cVar, boolean z12) {
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.7
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.ra != null) {
                            lh.this.ra.vt();
                        }
                    }
                });
            }

            @Override // v8.b
            public final void ouw(c cVar, int i4, int i10) {
                bly.ouw().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ksc();
                    }
                });
            }

            @Override // v8.b
            public final void ouw(c cVar, int i4, int i10, int i11) {
                lh.mt(lh.this);
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.9
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (lh.this.ra != null) {
                            lh.this.ra.vm();
                            lh.this.f8337lh.postDelayed(lh.this.xdk, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 2);
                if (lh.this.f8333cd != null) {
                    lh.this.f8333cd.ouw(4);
                }
            }

            @Override // v8.b
            public final void ouw(c cVar, int i4) {
                lh.sd(lh.this);
                lh.this.f8337lh.removeCallbacks(lh.this.xdk);
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ra.vt();
                    }
                });
                com.bytedance.sdk.openadsdk.tc.vt.fkw.ouw(lh.this.pno, 0);
                if (lh.this.f8333cd != null) {
                    lh.this.f8333cd.ouw(5);
                }
            }

            @Override // v8.b
            public final void ouw(c cVar, final long j, final long j8) throws JSONException {
                if (Math.abs(j - lh.this.bly) < 50) {
                    return;
                }
                if (!lh.this.zin.get()) {
                    lh.this.bs();
                }
                lh lhVar2 = lh.this;
                lhVar2.ouw(lhVar2.yib);
                lh.this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.this.ouw(j, j8);
                        lh.this.vt(j, j8);
                    }
                });
            }
        };
        this.mt = 0;
        this.xdk = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.4
            @Override // java.lang.Runnable
            public final void run() {
                if (lh.this.ra != null) {
                    lh.this.ra.ouw(lh.this.pno);
                    lh.this.ra.vt();
                    lh lhVar2 = lh.this;
                    lhVar2.f8335jg = true;
                    ko.fkw(lhVar2.ouw, "Show result page after error.......showAdCard");
                }
            }
        };
        this.zvq = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.6
            @Override // com.bytedance.sdk.component.utils.ksc.ouw
            public final void ouw(boolean z12, final int i4) {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.6.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        lh.ouw(lh.this, i4);
                    }
                });
            }
        };
        this.f8359ng = false;
        this.myk = ksc.ouw(context, 60000L);
        vt(z3);
        this.f8358cj = str;
        try {
            this.ucs = viewGroup.getWidth();
            this.f8361vh = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        ViewGroup jgVar = this.ko ? new jg(context) : new mwh(context);
        boolean z12 = this.ko;
        if (z12) {
            lhVar = this;
            lhVar.ra = new fkw(context, jgVar, this.pno, lhVar, z12);
        } else {
            lhVar = this;
            lhVar.ra = new yu(context, jgVar, lhVar.pno, this);
        }
        lhVar.ra.ouw((f) this);
        lhVar.f8360ub = true;
        lhVar.pv = z10;
        lhVar.wp = z11;
        if (raVar != null) {
            lhVar.yib = raVar;
        }
    }

    public static /* synthetic */ boolean cf(lh lhVar) {
        lhVar.tc = false;
        return false;
    }

    public static /* synthetic */ boolean mt(lh lhVar) {
        lhVar.tc = true;
        return true;
    }

    public static /* synthetic */ boolean sd(lh lhVar) {
        lhVar.tc = false;
        return false;
    }

    public final void fkw(boolean z3) {
        if (z3 || this.fvf) {
            if (z3) {
                this.fvf = false;
            }
            if (this.vpp || !this.qbp.get()) {
                return;
            }
            ko.ouw ouwVar = new ko.ouw();
            ouwVar.ouw(rn());
            ouwVar.vt(th());
            ouwVar.vt = zih();
            ouwVar.tlj = 3;
            ouwVar.ryl = vm();
            com.bytedance.sdk.openadsdk.yu.fkw.ouw.ouw.ouw(this.ra, ouwVar, this.yib);
        }
    }

    private void fqk() throws JSONException {
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f8336le;
        if (lhVar != null) {
            if (lhVar.ra()) {
                if (this.mwh) {
                    cd();
                } else {
                    vt(this.fak);
                }
                com.bytedance.sdk.component.utils.ko.vt(this.ouw, "resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.mwh));
            } else {
                this.f8336le.ouw(false, this.bly, this.rn);
            }
        }
        if (this.qbp.get()) {
            fak();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public x8.f hun() {
        fkw fkwVar;
        if (this.f8334cf.getResources().getConfiguration().orientation != 1 || (fkwVar = this.ra) == null) {
            return null;
        }
        return fkwVar.f8344le;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void bly() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.ryl();
        }
    }

    public final void ey() {
        if (this.f8359ng || !this.jqy) {
            return;
        }
        Context applicationContext = zih.ouw().getApplicationContext();
        this.f8359ng = true;
        ksc.ouw(this.zvq, applicationContext);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final void jg() {
        if (!this.vpp && this.qbp.get()) {
            fkw(false);
            this.vpp = false;
        }
        ko();
        com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.f8333cd;
        if (leVar != null) {
            leVar.yu();
        }
    }

    public final void jvy() {
        if (this.f8336le != null) {
            this.f8335jg = false;
            uoy();
            this.qbp.set(false);
            this.vpp = false;
            ouw(this.yib);
            this.f8336le.ryl();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void ko() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f8336le;
        if (lhVar != null) {
            lhVar.jg();
            this.f8336le = null;
        }
        if (this.rrs) {
            if ("embeded_ad".equals(this.f8358cj)) {
                this.ra.zin();
            } else {
                this.ra.ouw(this.pno);
            }
            this.f8337lh.removeCallbacksAndMessages(null);
            this.ryl.clear();
            if (this.ko) {
                rrs();
            }
        }
    }

    public final void ksc() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar;
        int i4;
        int i10;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-0]  TAG is 'ChangeVideoSize' ....... start  changeVideoSize >>>>>>>>>>>>>>>>>>>>>>>");
        try {
            if (hun() != null && (lhVar = this.f8336le) != null && this.ksc != null) {
                int iYu = lhVar.yu();
                int iFkw = this.f8336le.fkw();
                final int width = this.ksc.getWidth();
                final int height = this.ksc.getHeight();
                if (width > 0 && height > 0 && iFkw > 0 && iYu > 0) {
                    if (iYu == iFkw) {
                        i10 = width > height ? height : width;
                        i4 = i10;
                    } else if (iYu > iFkw) {
                        i10 = (int) ((width * 1.0d) / ((iYu * 1.0f) / iFkw));
                        i4 = width;
                    } else {
                        i4 = (int) ((height * 1.0d) / ((iFkw * 1.0f) / iYu));
                        i10 = height;
                    }
                    if (i10 <= height && i10 > 0) {
                        height = i10;
                    }
                    if (i4 <= width && i4 > 0) {
                        width = i4;
                    }
                    this.f8337lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (lh.this.hun() instanceof TextureView) {
                                    ((TextureView) lh.this.hun()).setLayoutParams(layoutParams);
                                    com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] >>>>> setLayoutParams to TextureView complete ! >>>>>>>");
                                } else if (lh.this.hun() instanceof SurfaceView) {
                                    ((SurfaceView) lh.this.hun()).setLayoutParams(layoutParams);
                                    com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] >>>>> setLayoutParams to SurfaceView complete !>>>>>>>");
                                }
                            } catch (Throwable unused) {
                                com.bytedance.sdk.component.utils.ko.vt(lh.this.ouw, "[step-9] setLayoutParams exception");
                            }
                        }
                    });
                    return;
                }
                com.bytedance.sdk.component.utils.ko.vt(this.ouw, " container or video exist size <= 0");
                return;
            }
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-1] >>>>> mContextRef=" + this.f8334cf + ",getIRenderView() =" + hun());
            String str = this.ouw;
            StringBuilder sb2 = new StringBuilder("[step-1] >>>>> mMediaPlayerProxy == null:");
            sb2.append(this.f8336le == null);
            sb2.append(",mMediaPlayerProxy.getMediaPlayer() == null:");
            sb2.append(this.f8336le != null);
            com.bytedance.sdk.component.utils.ko.vt(str, sb2.toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[step-11] >>>>> changeVideoSize error !!!!! ：".concat(String.valueOf(th2)));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void mwh() {
        jg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw
    public final void pd() {
        this.f8340th = !this.f8340th;
        if (!(this.f8334cf instanceof Activity)) {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "context is not activity, not support this function.");
            return;
        }
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.vt(this.ksc);
            this.ra.yu(false);
        }
        lh(1);
        WeakReference<b9.c> weakReference = this.jae;
        b9.c cVar = weakReference != null ? weakReference.get() : null;
        if (cVar != null) {
            cVar.ouw(this.f8340th);
        }
    }

    public final void rrs() {
        if (this.f8359ng && this.jqy) {
            this.f8359ng = false;
            ksc.ouw(this.zvq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final void ryl() {
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        fkw fkwVar2 = this.ra;
        if (fkwVar2 != null) {
            fkwVar2.th();
        }
        fqk();
    }

    public final void yu(boolean z3) {
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw();
        }
        fkw fkwVar2 = this.ra;
        if (fkwVar2 != null && z3) {
            fkwVar2.th();
        }
        fqk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt(long j, long j8) {
        com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
        this.pno.uq = j;
        this.bly = j;
        this.bs = j8;
        this.ra.ouw(j, j8);
        this.ra.ouw(a.a(j, j8));
        try {
            b9.b bVar = this.f8338od;
            if (bVar != null) {
                bVar.ouw(j, j8);
            }
        } catch (Throwable th2) {
            qbp.ouw(this.ouw, "onProgressUpdate error: ", th2);
        }
        com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = this.pno.sd();
        if (yuVarSd == null || (yuVar = yuVarSd.ouw) == null) {
            return;
        }
        yuVar.ouw(j, j8, this.f8333cd);
    }

    public final void ouw(int i4, int i10) {
        if (i4 == 0 || i10 == 0) {
            return;
        }
        this.ucs = i4;
        this.f8361vh = i10;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "width=" + i4 + "height=" + i10);
    }

    public final void yu(int i4) {
        Context context;
        View view;
        View view2;
        qbp.vt vtVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.myk == i4) {
            return;
        }
        this.myk = i4;
        if (i4 != 4 && i4 != 0) {
            this.vm = false;
        }
        if (!this.vm && !jqy() && this.pv) {
            if (i4 == 0) {
                cf();
                this.zih = true;
                fkw fkwVar = this.ra;
                if (fkwVar != null) {
                    fkwVar.ouw(this.pno);
                }
            }
            if (i4 != 4 && i4 != 0) {
                fkw fkwVar2 = this.ra;
                if (fkwVar2 != null) {
                    fkwVar2.ouw();
                }
                cf();
                this.zih = true;
                this.vm = false;
                fkw fkwVar3 = this.ra;
                if (fkwVar3 != null) {
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.c cVar = this.pno.f8309sd;
                    boolean z3 = this.wp;
                    com.bytedance.sdk.openadsdk.core.widget.qbp qbpVar = fkwVar3.f8341cd;
                    if (qbpVar != null && (context = qbpVar.f8503lh) != null && cVar != null) {
                        ViewGroup viewGroup = qbpVar.pno;
                        if (context != null && viewGroup != null && qbpVar.ouw == null) {
                            if (viewGroup instanceof RelativeLayout) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                            } else if (viewGroup instanceof LinearLayout) {
                                layoutParams = new LinearLayout.LayoutParams(-1, -1);
                            } else {
                                layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(-1, -1) : null;
                            }
                            if (layoutParams != null) {
                                com.bytedance.sdk.openadsdk.ko.ko koVar = new com.bytedance.sdk.openadsdk.ko.ko(context);
                                qbpVar.ouw = koVar;
                                koVar.setLayoutParams(layoutParams);
                                qbpVar.pno.addView(qbpVar.ouw);
                                qbpVar.vt = (TextView) qbpVar.ouw.findViewById(rn.f8712ak);
                                View viewFindViewById = qbpVar.ouw.findViewById(rn.f8727rh);
                                if (z3) {
                                    viewFindViewById.setClickable(true);
                                    viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.qbp.1
                                        public AnonymousClass1() {
                                        }

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            qbp qbpVar2 = qbp.this;
                                            if (qbpVar2.f8503lh != null) {
                                                qbpVar2.vt();
                                            }
                                            com.bytedance.sdk.openadsdk.core.mwh.vt.ouw ouwVar = qbp.this.yu;
                                            if (ouwVar != null) {
                                                ouwVar.ouw(ouw.START_VIDEO);
                                            }
                                        }
                                    });
                                } else {
                                    viewFindViewById.setOnClickListener(null);
                                    viewFindViewById.setClickable(false);
                                }
                            }
                        }
                        qbpVar.ra = cVar;
                        if (!qbpVar.ouw() && !qbpVar.f8502le) {
                            if (qbpVar.yu != null && (vtVar = qbpVar.fkw) != null) {
                                if (vtVar.ryl()) {
                                    qbpVar.yu.le();
                                }
                                qbpVar.yu.ouw(qbp.ouw.PAUSE_VIDEO);
                            }
                            if (qbpVar.ra != null && (view = qbpVar.ouw) != null && qbpVar.f8503lh != null && view.getVisibility() != 0) {
                                qbp.vt vtVar2 = qbpVar.fkw;
                                if (vtVar2 != null) {
                                    vtVar2.mwh();
                                }
                                String str = String.format(com.bytedance.sdk.component.utils.vpp.ouw(qbpVar.f8503lh, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(Math.ceil((r0.f6575c * 1.0d) / 1048576.0d)).floatValue()));
                                osn.ouw(qbpVar.ouw, 0);
                                osn.ouw(qbpVar.vt, str);
                                Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
                                if (osn.yu(qbpVar.ouw) && (view2 = qbpVar.ouw) != null) {
                                    view2.bringToFront();
                                    Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
                                }
                            }
                        }
                    }
                }
            } else if (i4 == 4) {
                this.zih = false;
                fkw fkwVar4 = this.ra;
                if (fkwVar4 != null) {
                    fkwVar4.rn();
                }
            }
        }
        WeakReference<ouw> weakReference = this.kn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kn.get().ra();
    }

    public final com.bytedance.sdk.openadsdk.core.ryl.le ouw(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.pno.uq()) {
            return null;
        }
        if (this.f8333cd == null) {
            this.f8333cd = new com.bytedance.sdk.openadsdk.core.ryl.le();
        }
        this.f8333cd.ouw(view, this.pno);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    Object obj = pair.second;
                    this.f8333cd.ouw((View) pair.first, obj == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) obj);
                }
            }
        }
        return this.f8333cd;
    }

    public static /* synthetic */ void fkw(lh lhVar) throws JSONException {
        lhVar.mt++;
        fkw fkwVar = lhVar.ra;
        if (fkwVar != null) {
            fkwVar.vt();
            b9.b bVar = lhVar.f8338od;
            if (bVar != null) {
                bVar.ouw(lhVar.lso, a.a(lhVar.bly, lhVar.bs));
            }
            lhVar.lso = System.currentTimeMillis() - lhVar.ux;
            if (lhVar.rrs) {
                lhVar.ra.ouw(lhVar.pno);
            }
            if (!lhVar.vpp) {
                lhVar.vpp = true;
                long j = lhVar.bs;
                lhVar.vt(j, j);
                long j8 = lhVar.bs;
                lhVar.bly = j8;
                lhVar.tlj = j8;
                lhVar.vt(lhVar.yib);
            }
            if (!lhVar.ko && lhVar.f8340th) {
                lhVar.pd();
            }
            lhVar.f8335jg = true;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, b9.e
    public final boolean ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.a aVar) {
        super.ouw(aVar);
        if (this.f8336le != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(aVar.pno())) {
            com.bytedance.sdk.component.utils.ko.fkw(this.ouw, "[video] play video stop , because no video info");
            return false;
        }
        this.f8335jg = false;
        com.bytedance.sdk.component.utils.ko.vt(this.ouw, "url is " + aVar.pno());
        aVar.yu = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("player_force_raw_url", 0) == 1;
        int i4 = this.hun + 1;
        this.hun = i4;
        aVar.jqy = i4;
        vt(aVar);
        uoy();
        com.bytedance.sdk.openadsdk.core.ryl.le leVar = this.f8333cd;
        if (leVar != null) {
            leVar.ouw(false, 0.0f);
        }
        if (!ex.vt(this.f8358cj) || this.bly <= 0) {
            this.bly = aVar.tlj;
        }
        if (ex.vt(this.f8358cj) && this.bly == this.bs) {
            this.bly = 0L;
        }
        long j = aVar.tlj;
        if (j <= 0) {
            this.vpp = false;
            this.qbp.set(false);
        } else {
            this.bly = j;
            this.tlj = Math.max(this.tlj, j);
        }
        fkw fkwVar = this.ra;
        if (fkwVar != null) {
            fkwVar.ouw();
            if (this.mt == 0) {
                this.ra.tlj();
            }
            this.ra.vt(aVar.ra, aVar.pno);
            this.ra.lh(this.ksc);
            this.ra.ouw(aVar.ra, aVar.pno);
        }
        if (this.f8336le == null) {
            com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = new com.bytedance.sdk.openadsdk.core.mwh.yu.lh();
            this.f8336le = lhVar;
            lhVar.ouw(this.yhj);
        }
        od();
        this.lso = 0L;
        try {
            com.bytedance.sdk.component.utils.ko.vt(this.ouw, "[video] playVideo has invoke !");
            aVar.ko = 0;
            this.f8336le.ouw(aVar);
            this.ux = System.currentTimeMillis();
            this.ra.lh(8);
            this.ra.lh(0);
            ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.lh.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (lh.this.f8336le == null) {
                        return;
                    }
                    lh.this.ux = System.currentTimeMillis();
                    lh.this.ra.yu(0);
                    lh.this.f8336le.ouw(true, lh.this.bly, lh.this.rn);
                }
            });
            if (this.ko) {
                ey();
            }
            return true;
        } catch (Exception e2) {
            String message = e2.getMessage();
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.b bVar = new com.bykv.vk.openvk.ouw.ouw.ouw.lh.b();
            bVar.f6570a = -10;
            bVar.f6571b = 0;
            bVar.f6572c = message;
            ouw(bVar);
            com.bytedance.sdk.component.utils.qbp.lh(this.ouw, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e2)));
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.ouw.ouw, com.bytedance.sdk.openadsdk.core.mwh.vt.ouw
    public final void ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.lh lhVar = this.f8336le;
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
        yu(false);
        fkw fkwVar3 = this.ra;
        if (fkwVar3 != null) {
            fkwVar3.le(false);
        }
    }

    public final void ouw(ouw ouwVar) {
        this.kn = new WeakReference<>(ouwVar);
    }

    public static /* synthetic */ boolean ouw(lh lhVar, int i4, int i10) {
        com.bytedance.sdk.component.utils.ko.vt(lhVar.ouw, "OnError - Error code: " + i4 + " Extra code: " + i10);
        boolean z3 = i4 == -1010 || i4 == -1007 || i4 == -1004 || i4 == -110 || i4 == 100 || i4 == 200;
        if (i10 == 1 || i10 == 700 || i10 == 800) {
            return true;
        }
        return z3;
    }

    public static /* synthetic */ void ouw(lh lhVar, int i4) {
        lhVar.yu(i4);
        if (i4 == 4) {
            lhVar.zih = false;
        }
    }
}
