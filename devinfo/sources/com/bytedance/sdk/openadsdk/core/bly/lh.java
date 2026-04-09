package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.fkw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class lh {
    private int bly;
    ScheduledFuture<?> fkw;

    /* renamed from: le, reason: collision with root package name */
    private final Context f8061le;

    /* renamed from: lh, reason: collision with root package name */
    qbp f8062lh;
    ouw ouw;
    private int pno;
    private int ra;
    com.bytedance.sdk.component.adexpress.vt.ko vt;
    com.bytedance.sdk.openadsdk.core.model.vpp yu;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.core.bly.lh$lh, reason: collision with other inner class name */
    public interface InterfaceC0071lh {
        void ouw();

        void ouw(int i4, int i10);

        void ouw(String str);

        void vt(String str);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt implements Runnable {
        InterfaceC0071lh ouw;

        public vt(InterfaceC0071lh interfaceC0071lh) {
            this.ouw = interfaceC0071lh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0071lh interfaceC0071lh = this.ouw;
            if (interfaceC0071lh != null) {
                interfaceC0071lh.ouw(FacebookMediationAdapter.ERROR_NULL_CONTEXT, FacebookMediationAdapter.ERROR_NULL_CONTEXT);
            }
        }
    }

    public lh(Context context, qbp qbpVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        this.yu = vppVar;
        this.f8061le = context;
        this.f8062lh = qbpVar;
        if (vppVar == null || !vppVar.lso()) {
            vm vmVarOuw = com.bytedance.sdk.openadsdk.core.yu.vt.ouw(qbpVar.getExpectExpressWidth(), qbpVar.getExpectExpressHeight());
            this.bly = vmVarOuw.ouw;
            if (qbpVar.getExpectExpressWidth() <= 0 || qbpVar.getExpectExpressHeight() <= 0) {
                int iYu = osn.yu(context);
                this.ra = iYu;
                this.pno = Float.valueOf(iYu / vmVarOuw.vt).intValue();
            } else {
                this.ra = osn.ouw(context, qbpVar.getExpectExpressWidth());
                this.pno = osn.ouw(context, qbpVar.getExpectExpressHeight());
            }
            int i4 = this.ra;
            if (i4 > 0 && i4 > osn.yu(context)) {
                this.ra = osn.yu(context);
                this.pno = Float.valueOf(this.pno * (osn.yu(context) / this.ra)).intValue();
            }
        } else {
            this.ra = -1;
            this.pno = -1;
        }
        this.ouw = new ouw(context, vppVar, this.ra, this.pno, str, this.bly);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.fkw;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.fkw.cancel(false);
            this.fkw = null;
        } catch (Throwable unused) {
        }
    }

    public final void ouw() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.yu();
            this.ouw = null;
        }
        vt();
        this.vt = null;
        this.f8062lh = null;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class ouw implements com.bytedance.sdk.component.adexpress.vt.yu<View>, fkw.vt {
        PAGExpressAdWrapperListener bly;

        /* renamed from: cf, reason: collision with root package name */
        private final int f8063cf;
        com.bytedance.sdk.openadsdk.core.model.vpp fkw;

        /* renamed from: jg, reason: collision with root package name */
        private int f8064jg;
        private com.bytedance.sdk.component.adexpress.vt.ra ko;

        /* renamed from: le, reason: collision with root package name */
        AtomicBoolean f8065le = new AtomicBoolean(false);

        /* renamed from: lh, reason: collision with root package name */
        String f8066lh;
        private final int mwh;
        com.bytedance.sdk.openadsdk.lh.lh ouw;
        fkw pno;
        String ra;
        private FrameLayout ryl;
        private final int tlj;
        TTDislikeDialogAbstract vt;
        final Context yu;

        public ouw(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i4, int i10, String str, int i11) {
            fkw fkwVarRemove;
            this.ra = str;
            if (vppVar != null && vppVar.lso()) {
                this.ra = "fullscreen_interstitial_ad";
            }
            this.yu = context;
            this.tlj = i4;
            this.f8063cf = i10;
            this.fkw = vppVar;
            int iOuw = osn.ouw(context, 3.0f);
            this.mwh = iOuw;
            this.f8064jg = i11;
            FrameLayout frameLayout = new FrameLayout(context);
            this.ryl = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams = layoutParams == null ? new FrameLayout.LayoutParams(i4, i10) : layoutParams;
            layoutParams.width = i4;
            layoutParams.height = i10;
            layoutParams.gravity = 17;
            this.ryl.setLayoutParams(layoutParams);
            yu yuVarOuw = yu.ouw();
            fkw fkwVar = null;
            if (yuVarOuw.ouw.size() > 0 && (fkwVarRemove = yuVarOuw.ouw.remove(0)) != null) {
                fkwVar = fkwVarRemove;
            }
            this.pno = fkwVar;
            if (fkwVar == null) {
                this.pno = new fkw(context);
            }
            yu.ouw();
            yu.vt(this.pno);
            this.pno.ouw(this.fkw, this, this.ra);
            this.pno.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            fkw fkwVar2 = this.pno;
            this.ryl.addView(fkwVar2);
            View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, this.fkw);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.fkw;
            if (vppVar2 == null || !vppVar2.lso()) {
                layoutParams2.topMargin = iOuw;
                layoutParams2.leftMargin = iOuw;
            } else {
                layoutParams2.leftMargin = osn.ouw(context, 20.0f);
                layoutParams2.bottomMargin = osn.ouw(context, 20.0f);
                layoutParams2.gravity = 8388691;
            }
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
            viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.lh.ouw.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ouw ouwVar = ouw.this;
                    TTWebsiteActivity.ouw(ouwVar.yu, ouwVar.fkw, ouwVar.ra);
                }
            });
            this.ryl.addView(viewCreatePAGLogoViewByMaterial);
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = this.fkw;
            if (vppVar3 != null && vppVar3.lso()) {
                fkwVar2.setBackgroundColor(-16777216);
                fkwVar2.ouw(((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.rn.upp), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            fkwVar2.ouw(viewCreatePAGLogoViewByMaterial, friendlyObstructionPurpose);
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.rn.amr);
            if (viewFindViewById != null) {
                fkwVar2.ouw(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.rn.f8731uj);
            if (viewFindViewById2 != null) {
                fkwVar2.ouw(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.vt.yu
        public final View lh() {
            return this.ryl;
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        public final void m_() {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.bly;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        @SuppressLint({"ClickableViewAccessibility"})
        public final void n_() {
            if (this.ko != null) {
                com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
                jgVar.vt = true;
                jgVar.f7393lh = osn.vt(this.yu, this.tlj);
                jgVar.yu = osn.vt(this.yu, this.f8063cf);
                this.ko.ouw(this.ryl, jgVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.vt.yu
        public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
            if (this.f8065le.get()) {
                return;
            }
            if (this.yu == null || (vppVar = this.fkw) == null) {
                raVar.ouw(106, "material null");
                return;
            }
            this.ko = raVar;
            if (TextUtils.isEmpty(vppVar.swm)) {
                raVar.ouw(106, "dsp data is null");
            } else {
                this.pno.cf();
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.vt.yu
        public final int vt() {
            return 5;
        }

        public final void yu() {
            this.ryl = null;
            this.ouw = null;
            this.vt = null;
            this.ko = null;
            this.fkw = null;
            fkw fkwVar = this.pno;
            if (fkwVar != null) {
                fkwVar.bly();
                yu.ouw().ouw(this.pno);
            }
            this.f8065le.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        public final View ouw() {
            FrameLayout frameLayout = this.ryl;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        public final void ouw(int i4) {
            com.bytedance.sdk.component.adexpress.vt.ra raVar = this.ko;
            if (raVar != null) {
                raVar.ouw(i4, "render fail");
            }
        }
    }
}
