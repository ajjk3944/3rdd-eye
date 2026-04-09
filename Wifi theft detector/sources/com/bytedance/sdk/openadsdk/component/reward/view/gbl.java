package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.emc.qh;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.cf;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.model.ul;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class gbl {
    ImageView bw;
    public ul cf;
    final rie dg;
    RelativeLayout gbl;
    View msw;

    @Nullable
    private com.bytedance.sdk.openadsdk.core.widget.gbl rie;
    ImageView ru;
    private final boolean sba;
    private dg sra;
    qh sup;
    private int ul;
    View uym;
    com.bytedance.sdk.openadsdk.core.ycc.ycc vk;
    protected final com.bytedance.sdk.openadsdk.component.reward.emc.emc xq;
    FrameLayout ycc;
    private boolean ylm;
    final Activity ypw;
    private final String yzg;
    PAGLogoView zz;
    int emc = 3;
    protected int sz = 0;
    protected final AtomicBoolean qh = new AtomicBoolean(false);

    /* renamed from: aa, reason: collision with root package name */
    Runnable f9277aa = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gbl.2
        @Override // java.lang.Runnable
        public void run() {
            ImageView imageView;
            try {
                rie rieVar = gbl.this.dg;
                if ((rieVar == null || !rieVar.tze()) && (imageView = gbl.this.bw) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    gbl.this.xq.cuf.emc(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    public gbl(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.xq = emcVar;
        this.ypw = emcVar.mxo;
        this.dg = emcVar.ypw;
        this.yzg = emcVar.bw;
        this.sba = emcVar.dg;
    }

    private void sba() {
        RelativeLayout relativeLayout;
        dg dgVar = (dg) this.xq.iyl.findViewById(vk.qh);
        this.sra = dgVar;
        dgVar.emc(this.xq);
        com.bytedance.sdk.openadsdk.core.widget.gbl gblVar = (com.bytedance.sdk.openadsdk.core.widget.gbl) this.xq.iyl.findViewById(vk.vhn);
        this.rie = gblVar;
        if (gblVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.xq;
            gblVar.emc(emcVar.ypw, emcVar.bw, null);
        }
        this.zz = (PAGLogoView) this.xq.iyl.findViewById(520093757);
        this.ru = (ImageView) this.xq.iyl.findViewById(vk.kda);
        this.bw = (ImageView) this.xq.iyl.findViewById(520093708);
        this.ycc = (FrameLayout) this.xq.iyl.findViewById(vk.sz);
        this.uym = this.xq.iyl.findViewById(vk.sba);
        this.msw = this.xq.iyl.findViewById(vk.pxj);
        this.gbl = (RelativeLayout) this.xq.iyl.findViewById(vk.mjd);
        qh qhVar = this.sup;
        if (qhVar == null || qhVar.dg() == null || (relativeLayout = this.gbl) == null) {
            return;
        }
        relativeLayout.addView(this.sup.dg(), new LinearLayout.LayoutParams(-1, -1));
        this.sup.ypw();
    }

    public void aa() {
        com.bytedance.sdk.openadsdk.core.xq.bw bwVarBw = this.xq.db.bw();
        View view = this.sra;
        if (view == null) {
            view = this.xq.iyl;
        }
        bwVarBw.onClick(view);
    }

    public void bw() {
        int iHoq = this.dg.hoq();
        this.emc = iHoq;
        if (iHoq == -200) {
            this.emc = aa.dg().cf(String.valueOf(this.dg.tx()));
        }
        if (this.emc != -1 || emc()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq.cn;
        if ((ypwVar instanceof com.bytedance.sdk.openadsdk.component.reward.ypw.dg) || (ypwVar instanceof com.bytedance.sdk.openadsdk.component.reward.ypw.xq)) {
            return;
        }
        ypw(0);
    }

    public void cf() {
        ul ulVar = this.cf;
        if (ulVar != null) {
            ulVar.uym();
        }
    }

    public void dg() {
        if (this.xq.ypw.gn() && dr.xq(this.xq.ypw)) {
            return;
        }
        vw.emc((View) this.ycc, 8);
        vw.emc((View) this.rie, 8);
        vw.emc(this.uym, 8);
        vw.emc(this.msw, 8);
        ypw(8);
        vw.emc((View) this.bw, 8);
        vw.emc((View) this.zz, 8);
        vw.emc((View) this.gbl, 8);
        vw.emc((View) this.ru, 8);
    }

    public boolean emc() {
        return true;
    }

    public View gbl() {
        return this.sra;
    }

    public void msw() {
        dg dgVar = this.sra;
        if (dgVar == null) {
            return;
        }
        dgVar.emc();
    }

    public void qh() {
        ul ulVar = this.cf;
        if (ulVar != null) {
            ulVar.ycc();
        }
        ImageView imageView = this.bw;
        if (imageView != null) {
            imageView.removeCallbacks(this.f9277aa);
        }
    }

    public View ru() {
        return this.bw;
    }

    public void sup() {
        try {
            qh qhVar = this.sup;
            if (qhVar != null) {
                qhVar.xq();
            }
            RelativeLayout relativeLayout = this.gbl;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.gbl;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void sz() {
        try {
            Activity activity = this.xq.mxo;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, com.bytedance.sdk.component.utils.rie.zz(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.xq.mkp.sup();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gbl.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        gbl.this.xq.mkp.sup();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                this.xq.mkp.emc(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.xq.mkp.sup();
        }
    }

    public void uym() {
        if (this.ru.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ru.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.ru.setLayoutParams(marginLayoutParams);
        }
    }

    public void vk() {
        ul ulVar = this.cf;
        if (ulVar != null) {
            ulVar.msw();
        }
    }

    public void xq() {
        this.ycc.removeAllViews();
    }

    public FrameLayout ycc() {
        return this.ycc;
    }

    public void ypw() {
        if (this.ylm) {
            return;
        }
        this.ylm = true;
        this.ul = this.xq.rqm;
        if (emc()) {
            qh qhVar = new qh(this.xq);
            this.sup = qhVar;
            qhVar.emc();
        }
        sba();
        Activity activity = this.ypw;
        rie rieVar = this.dg;
        String str = this.yzg;
        FrameLayout frameLayout = this.ycc;
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.xq;
        ul ulVar = new ul(activity, rieVar, str, frameLayout, emcVar.tp, emcVar.iyl);
        this.cf = ulVar;
        ulVar.emc();
    }

    public boolean zz() {
        ImageView imageView = this.bw;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void xq(int i10) {
        rie rieVar = this.dg;
        if (rieVar != null && rieVar.gn() && dr.xq(this.dg)) {
            vw.emc((View) this.rie, i10);
        }
    }

    public void ycc(int i10) {
        vw.emc((View) this.bw, i10);
    }

    public void emc(boolean z10) {
        vw.emc((View) this.zz, dr.xq(this.dg) ? 8 : 0);
        vw.emc((View) this.ru, (this.dg.ak() && this.dg.rie()) ? 0 : 8);
        ypw(z10);
        if (this.sba) {
            bw();
        }
    }

    public void bw(int i10) {
        int i11 = this.emc;
        if (i11 == -1 || i10 != i11 || this.qh.get()) {
            return;
        }
        ypw(0);
        this.qh.set(true);
        msw();
    }

    public void emc(int i10) {
        if (this.vk == null) {
            this.vk = new com.bytedance.sdk.openadsdk.core.ycc.ycc(this.xq.mxo);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.vk.setLayoutParams(layoutParams);
            this.vk.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.gbl.emc(this.xq.mxo, "tt_video_loading_progress_bar"));
            this.xq.mkp.ycc().addView(this.vk);
        }
        this.vk.setVisibility(i10);
    }

    public void ypw(boolean z10) {
        ImageView imageView;
        int iEmc;
        if (this.ul != 1 && (imageView = this.bw) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (iEmc = emc("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (iEmc > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = iEmc;
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ypw.ypw ypwVar = this.xq.cn;
        if ((ypwVar instanceof com.bytedance.sdk.openadsdk.component.reward.ypw.dg) || (ypwVar instanceof com.bytedance.sdk.openadsdk.component.reward.ypw.xq)) {
            return;
        }
        ypw(0);
    }

    public void dg(int i10) {
        vw.emc((View) this.zz, i10);
    }

    public void emc(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.dg.pxj() == 1 && (frameLayout = this.ycc) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iXq = vw.xq((Context) this.ypw);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ycc.getLayoutParams();
            layoutParams.width = iXq;
            int i12 = (iXq * 9) / 16;
            layoutParams.height = i12;
            this.ycc.setLayoutParams(layoutParams);
            this.sz = (vw.bw(this.ypw) - i12) / 2;
        }
    }

    public void ypw(int i10) {
        rie rieVar = this.dg;
        if (rieVar != null && rieVar.ak() && cf.emc(this.dg)) {
            vw.emc((View) this.sra, 8);
        } else {
            vw.emc((View) this.sra, i10);
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.xq.xq xqVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        rie rieVar;
        if (this.ycc != null && (rieVar = this.dg) != null && rieVar.xxs() != null) {
            if (this.dg.xxs().ycc && !ul.ypw(this.dg)) {
                emc((View.OnClickListener) xqVar);
                emc(xqVar);
            } else {
                emc(onClickListener);
            }
        }
        rie rieVar2 = this.dg;
        if (rieVar2 != null && rieVar2.pxj() == 1) {
            if (this.dg.xxs() != null && (view2 = this.uym) != null) {
                vw.emc(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.uym.getLayoutParams();
                layoutParams.height = this.sz;
                this.uym.setLayoutParams(layoutParams);
                if (this.dg.xxs().ypw) {
                    this.uym.setOnClickListener(xqVar);
                    this.uym.setOnTouchListener(onTouchListener);
                } else {
                    this.uym.setOnClickListener(onClickListener);
                }
            }
            if (this.dg.xxs() != null && (view = this.msw) != null) {
                vw.emc(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.msw.getLayoutParams();
                layoutParams2.height = this.sz;
                this.msw.setLayoutParams(layoutParams2);
                if (this.dg.xxs().dg) {
                    this.msw.setOnClickListener(xqVar);
                    this.msw.setOnTouchListener(onTouchListener);
                } else {
                    this.msw.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.zz;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gbl.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        gbl gblVar = gbl.this;
                        TTWebsiteActivity.emc(gblVar.ypw, gblVar.dg, gblVar.yzg);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ul.xq("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.ru;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc((int) vw.emc(aa.emc(), 14.0f, true), this.ru, this.xq.ypw);
        }
    }

    private int emc(String str) {
        Resources resources = this.ypw.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void emc(View.OnClickListener onClickListener) {
        vw.emc(this.ycc, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void emc(com.bytedance.sdk.openadsdk.core.xq.xq xqVar) {
        vw.emc((View) this.ycc, (View.OnTouchListener) xqVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void emc(float f10) {
        vw.emc(this.bw, f10);
    }

    public void emc(Animation animation) {
        RelativeLayout relativeLayout = this.gbl;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void emc(int i10, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        ul ulVar = this.cf;
        if (ulVar != null) {
            ulVar.emc(i10, qhVar);
        }
    }
}
