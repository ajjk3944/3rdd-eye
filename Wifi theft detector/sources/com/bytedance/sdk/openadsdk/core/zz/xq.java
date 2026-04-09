package com.bytedance.sdk.openadsdk.core.zz;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.dr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zz.bw;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class xq {
    private ul bw;
    private com.bytedance.sdk.component.adexpress.ypw.cf dg;
    com.bytedance.sdk.openadsdk.core.model.rie emc;
    private ScheduledFuture<?> msw;
    private int uym;
    private emc xq;
    private int ycc;
    private final Context ypw;
    private int zz;

    public static class emc implements com.bytedance.sdk.component.adexpress.ypw.dg<View>, bw.ypw {
        private final Context bw;
        private PAGExpressAdWrapperListener cf;
        private String dg;
        AtomicBoolean emc = new AtomicBoolean(false);
        private String gbl;
        private FrameLayout msw;
        private com.bytedance.sdk.component.adexpress.ypw.uym qh;
        private final int ru;
        private bw sup;
        private int sz;
        private final int uym;
        private TTDislikeDialogAbstract xq;
        private final int ycc;
        private com.bytedance.sdk.openadsdk.xq.xq ypw;
        private com.bytedance.sdk.openadsdk.core.model.rie zz;

        public emc(Context context, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i10, int i11, String str, int i12) {
            this.gbl = str;
            if (rieVar != null && rieVar.tze()) {
                this.gbl = "fullscreen_interstitial_ad";
            }
            this.bw = context;
            this.ycc = i10;
            this.uym = i11;
            this.zz = rieVar;
            this.ru = vw.ypw(context, 3.0f);
            this.sz = i12;
            ycc();
        }

        @SuppressLint({"ClickableViewAccessibility"})
        private bw msw() {
            bw bwVarYpw = dg.emc().ypw();
            this.sup = bwVarYpw;
            if (bwVarYpw == null) {
                this.sup = new bw(this.bw);
            }
            dg.emc().xq(this.sup);
            this.sup.emc(this.zz, this, this.gbl);
            this.sup.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.sup;
        }

        private View uym() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.bw, this.zz);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.zz;
            if (rieVar == null || !rieVar.tze()) {
                int i10 = this.ru;
                layoutParams.topMargin = i10;
                layoutParams.leftMargin = i10;
            } else {
                layoutParams.leftMargin = vw.ypw(this.bw, 20.0f);
                layoutParams.bottomMargin = vw.ypw(this.bw, 20.0f);
                layoutParams.gravity = 8388691;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.zz.xq.emc.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.emc(emc.this.bw, emc.this.zz, emc.this.gbl);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        private void ycc() {
            FrameLayout frameLayout = new FrameLayout(this.bw);
            this.msw = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.ycc, this.uym);
            }
            layoutParams.width = this.ycc;
            layoutParams.height = this.uym;
            layoutParams.gravity = 17;
            this.msw.setLayoutParams(layoutParams);
            bw bwVarMsw = msw();
            this.msw.addView(bwVarMsw);
            View viewUym = uym();
            this.msw.addView(viewUym);
            com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.zz;
            if (rieVar != null && rieVar.tze()) {
                bwVarMsw.setBackgroundColor(-16777216);
                bwVarMsw.emc(((Activity) this.bw).findViewById(com.bytedance.sdk.openadsdk.utils.vk.wcv), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            bwVarMsw.emc(viewUym, friendlyObstructionPurpose);
            Context context = this.bw;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.vk.fw);
            if (viewFindViewById != null) {
                bwVarMsw.emc(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) this.bw).findViewById(com.bytedance.sdk.openadsdk.utils.vk.mjd);
            if (viewFindViewById2 != null) {
                bwVarMsw.emc(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.ypw.dg
        public View bw() {
            return this.msw;
        }

        @Override // com.bytedance.sdk.component.adexpress.ypw.dg
        public int xq() {
            return 5;
        }

        public void dg() {
            this.msw = null;
            this.ypw = null;
            this.xq = null;
            this.qh = null;
            this.zz = null;
            bw bwVar = this.sup;
            if (bwVar != null) {
                bwVar.vk();
                dg.emc().emc(this.sup);
            }
            this.emc.set(true);
        }

        @Override // com.bytedance.sdk.component.adexpress.ypw.dg
        public void emc(com.bytedance.sdk.component.adexpress.ypw.uym uymVar) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar;
            if (this.emc.get()) {
                return;
            }
            if (this.bw == null || (rieVar = this.zz) == null) {
                uymVar.emc(106, "material null");
                return;
            }
            this.qh = uymVar;
            if (TextUtils.isEmpty(rieVar.al())) {
                uymVar.emc(106, "dsp data is null");
            } else {
                this.sup.ul();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
        @SuppressLint({"ClickableViewAccessibility"})
        public void ypw() {
            if (this.qh != null) {
                com.bytedance.sdk.component.adexpress.ypw.qh qhVar = new com.bytedance.sdk.component.adexpress.ypw.qh();
                qhVar.emc(true);
                qhVar.emc(vw.xq(this.bw, this.ycc));
                qhVar.ypw(vw.xq(this.bw, this.uym));
                this.qh.emc(this.msw, qhVar);
            }
        }

        public void emc(dr drVar) {
            if (drVar instanceof com.bytedance.sdk.openadsdk.xq.xq) {
                this.ypw = (com.bytedance.sdk.openadsdk.xq.xq) drVar;
            }
        }

        public void emc(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.rie rieVar;
            if (tTDislikeDialogAbstract != null && (rieVar = this.zz) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(rieVar.wdp(), this.zz.pz());
            }
            this.xq = tTDislikeDialogAbstract;
        }

        public void emc(String str) {
            this.dg = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
        public View emc() {
            FrameLayout frameLayout = this.msw;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
        public void emc(View view, int i10) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.cf;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.zz.bw.ypw
        public void emc(int i10, int i11) {
            com.bytedance.sdk.component.adexpress.ypw.uym uymVar = this.qh;
            if (uymVar != null) {
                uymVar.emc(i10, "render fail");
            }
        }

        public void emc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.cf = pAGExpressAdWrapperListener;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.zz.xq$xq, reason: collision with other inner class name */
    public interface InterfaceC0168xq {
        void emc();

        void emc(int i10, int i11);

        void emc(String str);

        void ypw(String str);
    }

    public static class ypw implements Runnable {
        InterfaceC0168xq emc;

        public ypw(InterfaceC0168xq interfaceC0168xq) {
            this.emc = interfaceC0168xq;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0168xq interfaceC0168xq = this.emc;
            if (interfaceC0168xq != null) {
                interfaceC0168xq.emc(107, 107);
            }
        }
    }

    public xq(Context context, ul ulVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str) {
        this.emc = rieVar;
        this.ypw = context;
        this.bw = ulVar;
        emc(ulVar);
        this.xq = new emc(context, rieVar, this.ycc, this.uym, str, this.zz);
    }

    private void emc(ul ulVar) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.emc;
        if (rieVar != null && rieVar.tze()) {
            this.ycc = -1;
            this.uym = -1;
            return;
        }
        sba sbaVarEmc = com.bytedance.sdk.openadsdk.core.dg.ypw.emc(ulVar.getExpectExpressWidth(), ulVar.getExpectExpressHeight());
        this.zz = sbaVarEmc.emc;
        if (ulVar.getExpectExpressWidth() <= 0 || ulVar.getExpectExpressHeight() <= 0) {
            int iXq = vw.xq(this.ypw);
            this.ycc = iXq;
            this.uym = Float.valueOf(iXq / sbaVarEmc.ypw).intValue();
        } else {
            this.ycc = vw.ypw(this.ypw, ulVar.getExpectExpressWidth());
            this.uym = vw.ypw(this.ypw, ulVar.getExpectExpressHeight());
        }
        int i10 = this.ycc;
        if (i10 <= 0 || i10 <= vw.xq(this.ypw)) {
            return;
        }
        this.ycc = vw.xq(this.ypw);
        this.uym = Float.valueOf(this.uym * (vw.xq(this.ypw) / this.ycc)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xq() {
        try {
            ScheduledFuture<?> scheduledFuture = this.msw;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.msw.cancel(false);
            this.msw = null;
        } catch (Throwable unused) {
        }
    }

    public void ypw() {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.dg();
            this.xq = null;
        }
        xq();
        this.dg = null;
        this.bw = null;
    }

    public void emc(com.bytedance.sdk.component.adexpress.ypw.cf cfVar) {
        this.dg = cfVar;
    }

    public void emc() {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.emc;
        if (rieVar != null && rieVar.tze()) {
            this.msw = iyl.emc().schedule(new ypw(this.xq.sup), com.bytedance.sdk.openadsdk.core.aa.dg().mkp(), TimeUnit.MILLISECONDS);
        }
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(new com.bytedance.sdk.component.adexpress.ypw.uym() { // from class: com.bytedance.sdk.openadsdk.core.zz.xq.1
                @Override // com.bytedance.sdk.component.adexpress.ypw.uym
                public void emc(View view, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
                    if (xq.this.bw == null || view == null) {
                        if (xq.this.dg != null) {
                            xq.this.dg.a_(106);
                        }
                    } else if (xq.this.dg != null) {
                        xq.this.dg.emc(xq.this.xq, qhVar);
                    }
                    xq.this.xq();
                }

                @Override // com.bytedance.sdk.component.adexpress.ypw.uym
                public void emc(int i10, String str) {
                    if (xq.this.dg != null) {
                        xq.this.dg.a_(106);
                    }
                    xq.this.xq();
                }
            });
            View viewBw = this.xq.bw();
            this.bw.removeView(viewBw);
            if (viewBw.getParent() != null) {
                ((ViewGroup) viewBw.getParent()).removeView(viewBw);
            }
            this.bw.addView(viewBw, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.ypw.cf cfVar = this.dg;
        if (cfVar != null) {
            cfVar.a_(106);
        }
    }

    public void emc(dr drVar) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(drVar);
        }
    }

    public void emc(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(tTDislikeDialogAbstract);
        }
    }

    public void emc(String str) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(str);
        }
    }

    public void emc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        emc emcVar = this.xq;
        if (emcVar != null) {
            emcVar.emc(pAGExpressAdWrapperListener);
        }
    }
}
