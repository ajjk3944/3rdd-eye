package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends com.bytedance.sdk.openadsdk.core.bly.ouw {

    /* renamed from: jg, reason: collision with root package name */
    private int f8022jg;
    private int ko;
    private boolean mwh;
    private float ouw;
    private com.bytedance.sdk.openadsdk.core.lh.fkw qbp;
    private int rn;

    /* renamed from: th, reason: collision with root package name */
    private FrameLayout f8023th;
    private View vm;
    private View zih;

    public lh(Context context, String str) {
        super(context, str);
        this.rn = 1;
        this.vt = context;
    }

    private float getHeightDp() {
        return osn.vt(this.vt, osn.mwh(this.vt));
    }

    private float getWidthDp() {
        return osn.vt(this.vt, osn.jg(this.vt));
    }

    public final FrameLayout getVideoContainer() {
        return this.f8023th;
    }

    @Override // com.bytedance.sdk.openadsdk.core.bly.ouw
    public final void ouw(View view, int i4, ko koVar) {
    }

    public final void setDownloadListener(com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar) {
        this.qbp = fkwVar;
    }

    public final void setIsMute(boolean z3) {
        this.mwh = z3;
        View view = this.vm;
        if (view != null && (view instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le)) {
            ((com.bytedance.sdk.openadsdk.core.mwh.vt.le) view).ouw(z3, "interactionStyle");
        }
    }

    private void lh() {
        this.f8023th = (FrameLayout) this.zih.findViewById(rn.lgp);
        ImageView imageView = (ImageView) this.zih.findViewById(rn.zrz);
        zih zihVar = (zih) this.zih.findViewById(rn.kfa);
        TextView textView = (TextView) this.zih.findViewById(rn.yiz);
        TextView textView2 = (TextView) this.zih.findViewById(rn.yw);
        View viewFindViewById = this.zih.findViewById(520093739);
        if (!TextUtils.isEmpty(this.f8071lh.vpp())) {
            textView2.setText(this.f8071lh.vpp());
        }
        ouw(this.f8023th, imageView);
        com.bytedance.sdk.openadsdk.core.model.zih zihVar2 = this.f8071lh.fak;
        if (zihVar2 != null && !TextUtils.isEmpty(zihVar2.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.f8071lh;
            com.bytedance.sdk.openadsdk.core.model.zih zihVar3 = vppVar.fak;
            com.bytedance.sdk.openadsdk.th.vt.ouw(zihVar3.ouw, zihVar3.vt, zihVar3.f8323lh, zihVar, vppVar);
        }
        textView.setText(getTitle());
        lh(this.f8023th);
        lh(imageView);
        lh(zihVar);
        lh(textView);
        lh(textView2);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f8071lh);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lh.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    TTWebsiteActivity.ouw(lh.this.vt, lh.this.f8071lh, lh.this.f8070le);
                } catch (Throwable th2) {
                    qbp.lh("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void vt() {
        com.bytedance.sdk.openadsdk.ko.ouw ouwVar = new com.bytedance.sdk.openadsdk.ko.ouw(this.vt);
        this.zih = ouwVar;
        vt(ouwVar);
        lh();
        yu();
    }

    private void yu() {
        TextView textView = (TextView) this.zih.findViewById(rn.ixm);
        if (textView != null) {
            textView.setText(getDescription());
            lh(textView);
        }
    }

    public final void ouw(vpp vppVar, float f10, int i4, int i10, int i11) {
        this.ouw = f10;
        this.rn = i4;
        this.f8071lh = vppVar;
        this.f8070le = "fullscreen_interstitial_ad";
        this.f8022jg = i10;
        this.ko = i11;
        ouw(this.bly);
        this.ra = osn.ouw(this.vt, this.f8022jg);
        this.pno = osn.ouw(this.vt, this.ko);
        int i12 = (int) (this.ouw * 1000.0f);
        if (this.rn != 1) {
            if (i12 == 562) {
                View leVar = new com.bytedance.sdk.openadsdk.ko.le(this.vt);
                this.zih = leVar;
                vt(leVar);
                lh();
                yu();
                return;
            }
            if (i12 == 666) {
                View vtVar = new com.bytedance.sdk.openadsdk.ko.vt(this.vt);
                this.zih = vtVar;
                vt(vtVar);
                lh();
                yu();
                return;
            }
            if (i12 == 1000) {
                vt();
                return;
            }
            if (i12 != 1500) {
                ouw(1.777f);
                View pnoVar = new com.bytedance.sdk.openadsdk.ko.pno(this.vt);
                this.zih = pnoVar;
                vt(pnoVar);
                lh();
                return;
            }
            View yuVar = new com.bytedance.sdk.openadsdk.ko.yu(this.vt);
            this.zih = yuVar;
            vt(yuVar);
            lh();
            return;
        }
        if (i12 == 666) {
            View lhVar = new com.bytedance.sdk.openadsdk.ko.lh(this.vt);
            this.zih = lhVar;
            vt(lhVar);
            lh();
            yu();
            return;
        }
        if (i12 == 1000) {
            vt();
            return;
        }
        if (i12 != 1500) {
            if (i12 != 1777) {
                ouw(0.562f);
                View raVar = new com.bytedance.sdk.openadsdk.ko.ra(this.vt);
                this.zih = raVar;
                vt(raVar);
                lh();
                return;
            }
            View blyVar = new com.bytedance.sdk.openadsdk.ko.bly(this.vt);
            this.zih = blyVar;
            vt(blyVar);
            lh();
            yu();
            return;
        }
        View fkwVar = new com.bytedance.sdk.openadsdk.ko.fkw(this.vt);
        this.zih = fkwVar;
        vt(fkwVar);
        this.f8023th = (FrameLayout) this.zih.findViewById(rn.lgp);
        ImageView imageView = (ImageView) this.zih.findViewById(rn.eay);
        TextView textView = (TextView) this.zih.findViewById(rn.wbf);
        View viewFindViewById = this.zih.findViewById(520093739);
        ouw(this.f8023th, imageView);
        textView.setText(getDescription());
        lh(this.f8023th);
        lh(imageView);
        lh(textView);
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.f8071lh);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.lh.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                try {
                    TTWebsiteActivity.ouw(lh.this.vt, lh.this.f8071lh, lh.this.f8070le);
                } catch (Throwable th2) {
                    qbp.lh("FullInteractionStyleView", th2.getMessage());
                }
            }
        });
    }

    private void vt(View view) {
        if (view.getParent() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            view.setLayoutParams(layoutParams);
            layoutParams.gravity = 17;
            addView(view);
        }
    }

    public final View getInteractionStyleRootView() {
        return this;
    }

    private void lh(View view) {
        if (view == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = this.qbp;
        if (ouwVar == null) {
            Context context = this.vt;
            vpp vppVar = this.f8071lh;
            String str = this.f8070le;
            ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, str, uoy.ouw(str));
            ouwVar.ouw(ouw(this.f8071lh, this.vt));
        }
        view.setOnTouchListener(ouwVar);
        view.setOnClickListener(ouwVar);
    }

    private void ouw(FrameLayout frameLayout, ImageView imageView) {
        vpp vppVar = this.f8071lh;
        if (vppVar == null) {
            return;
        }
        boolean zFkw = vpp.fkw(vppVar);
        if (this.f8071lh.f8309sd != null && zFkw) {
            osn.ouw((View) imageView, 8);
            osn.ouw((View) frameLayout, 0);
        } else {
            ouw(imageView);
            osn.ouw((View) imageView, 0);
            osn.ouw((View) frameLayout, 8);
        }
    }

    private void ouw(ImageView imageView) {
        List<com.bytedance.sdk.openadsdk.core.model.zih> list;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        vpp vppVar = this.f8071lh;
        if (vppVar == null || (list = vppVar.tc) == null || list.size() <= 0 || (zihVar = list.get(0)) == null) {
            return;
        }
        yu.ouw.ouw(yu.ouw.vt.ouw(zihVar.ouw).ouw(zihVar.vt).vt(zihVar.f8323lh).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).ouw(zihVar.f8322le)).lh(1).vt(com.bytedance.sdk.openadsdk.tlj.lh.ouw(this.f8071lh, zihVar.ouw, imageView));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void ouw(float r10) {
        /*
            r9 = this;
            float r0 = r9.getHeightDp()
            float r1 = r9.getWidthDp()
            int r2 = r9.rn
            r3 = 2
            if (r2 != r3) goto L16
            float r2 = java.lang.Math.max(r0, r1)
            float r0 = java.lang.Math.min(r0, r1)
            goto L1e
        L16:
            float r2 = java.lang.Math.min(r0, r1)
            float r0 = java.lang.Math.max(r0, r1)
        L1e:
            int r1 = r9.rn
            if (r1 == r3) goto L38
            android.content.Context r1 = r9.vt
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = com.bytedance.sdk.openadsdk.utils.osn.lh(r1)
            if (r1 == 0) goto L38
            android.content.Context r1 = r9.vt
            float r4 = com.bytedance.sdk.openadsdk.utils.osn.ouw()
            int r1 = com.bytedance.sdk.openadsdk.utils.osn.vt(r1, r4)
            float r1 = (float) r1
            float r0 = r0 - r1
        L38:
            int r1 = r9.rn
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1120403456(0x42c80000, float:100.0)
            r6 = 1101004800(0x41a00000, float:20.0)
            r7 = 20
            r8 = 0
            if (r1 == r3) goto L5b
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L71
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 == 0) goto L71
            float r2 = r2 - r6
            float r2 = r2 - r6
            float r2 = r2 / r10
            float r0 = r0 - r2
            float r0 = r0 / r4
            float r10 = java.lang.Math.max(r0, r8)
            int r10 = (int) r10
            r0 = r7
            r1 = r0
            r7 = r10
            goto L75
        L5b:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L71
            int r1 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r1 == 0) goto L71
            float r0 = r0 - r6
            float r0 = r0 - r6
            float r0 = r0 * r10
            float r2 = r2 - r0
            float r2 = r2 / r4
            float r10 = java.lang.Math.max(r2, r8)
            int r10 = (int) r10
            r0 = r10
            r1 = r0
            r10 = r7
            goto L75
        L71:
            r7 = 0
            r10 = r7
            r0 = r10
            r1 = r0
        L75:
            android.content.Context r2 = r9.vt
            float r3 = (float) r7
            int r2 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r2, r3)
            android.content.Context r3 = r9.vt
            float r10 = (float) r10
            int r10 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r3, r10)
            android.content.Context r3 = r9.vt
            float r0 = (float) r0
            int r0 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r3, r0)
            android.content.Context r3 = r9.vt
            float r1 = (float) r1
            int r1 = com.bytedance.sdk.openadsdk.utils.osn.ouw(r3, r1)
            android.content.Context r3 = r9.vt
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            r3.setPadding(r0, r2, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.view.lh.ouw(float):void");
    }

    private com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh ouw(vpp vppVar, Context context) {
        if (vppVar != null && vppVar.f8305pd == 4) {
            return new com.bytedance.sdk.openadsdk.qbp.ouw.ouw.vt(context, this.f8070le);
        }
        return null;
    }
}
