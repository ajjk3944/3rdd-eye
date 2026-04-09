package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.shadow.okio.a;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.ouw.jg;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.qbp;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class ryl {
    View bly;

    /* renamed from: cf, reason: collision with root package name */
    ImageView f8026cf;
    final String fkw;
    private com.bytedance.sdk.openadsdk.core.widget.cf jqy;

    /* renamed from: le, reason: collision with root package name */
    ImageView f8028le;

    /* renamed from: lh, reason: collision with root package name */
    protected final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f8029lh;
    jg mwh;
    View pno;
    private int qbp;
    FrameLayout ra;
    public th rn;
    RelativeLayout ryl;

    /* renamed from: th, reason: collision with root package name */
    private final boolean f8030th;
    PAGLogoView tlj;
    private fkw vpp;
    final Activity vt;
    final vpp yu;
    com.bytedance.sdk.openadsdk.core.le.le zih;
    private boolean zin;
    int ouw = 3;

    /* renamed from: jg, reason: collision with root package name */
    protected int f8027jg = 0;
    protected final AtomicBoolean ko = new AtomicBoolean(false);
    Runnable vm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ryl.2
        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageView;
            View viewFindViewById;
            try {
                vpp vppVar = ryl.this.yu;
                if ((vppVar == null || !vppVar.lso()) && (imageView = ryl.this.f8028le) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ryl rylVar = ryl.this.f8029lh.uoy;
                    int i4 = iArr[0];
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = rylVar.f7989lh;
                    if (lhVar == null || lhVar.getITopLayout() == null || i4 == 0 || (viewFindViewById = rylVar.f7989lh.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
                        return;
                    }
                    int[] iArr2 = new int[2];
                    viewFindViewById.getLocationOnScreen(iArr2);
                    int width = i4 - (iArr2[0] + viewFindViewById.getWidth());
                    if (width < osn.ouw(rylVar.ouw, 16.0f)) {
                        ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin = (osn.ouw(rylVar.ouw, 16.0f) - width) + ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin;
                        viewFindViewById.requestLayout();
                    }
                }
            } catch (Exception unused) {
            }
        }
    };

    public ryl(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f8029lh = ouwVar;
        this.vt = ouwVar.jvy;
        this.yu = ouwVar.vt;
        this.fkw = ouwVar.fkw;
        this.f8030th = ouwVar.yu;
    }

    public boolean bly() {
        ImageView imageView = this.f8028le;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public View cf() {
        return this.vpp;
    }

    public void fkw() {
        int i4 = this.yu.mwe;
        this.ouw = i4;
        if (i4 == -200) {
            zih.yu();
            this.ouw = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(this.yu.fqk())).tlj;
        }
        if (this.ouw != -1 || ouw()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f8029lh.coz;
        if ((vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.yu) || (vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.lh)) {
            return;
        }
        vt(0);
    }

    public void jg() {
        com.bytedance.sdk.component.bly.le leVar;
        th thVar = this.rn;
        if (thVar != null) {
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = thVar.uq;
            if (mwhVar != null && (leVar = thVar.ko) != null) {
                mwhVar.ouw(leVar);
            }
            Handler handler = thVar.ouw;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ValueAnimator valueAnimator = thVar.myk;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                thVar.myk.cancel();
            }
            ValueAnimator valueAnimator2 = thVar.bs;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
                thVar.bs.cancel();
            }
            ObjectAnimator objectAnimator = thVar.fak;
            if (objectAnimator != null) {
                objectAnimator.removeAllUpdateListeners();
                thVar.fak.cancel();
            }
            com.bytedance.sdk.openadsdk.common.mwh mwhVar2 = thVar.zih;
            if (mwhVar2 != null) {
                mwhVar2.vt();
            }
            ObjectAnimator objectAnimator2 = thVar.fvf;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            com.bytedance.sdk.component.bly.le leVar2 = thVar.ko;
            if (leVar2 != null) {
                ey.ouw(leVar2.getWebView());
            }
            thVar.ko = null;
            bs bsVar = thVar.f8266jg;
            if (bsVar != null) {
                bsVar.lh();
            }
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = thVar.uq;
            if (mwhVar3 != null) {
                mwhVar3.ouw(true);
            }
            if (!TextUtils.isEmpty(thVar.jvy) && thVar.f8271pd) {
                lh.ouw.ouw(thVar.ux, thVar.hun, thVar.jqy);
            }
            com.bytedance.sdk.openadsdk.ra.vt.ouw();
            com.bytedance.sdk.openadsdk.ra.vt.ouw(thVar.fqk);
        }
        ImageView imageView = this.f8028le;
        if (imageView != null) {
            imageView.removeCallbacks(this.vm);
        }
    }

    public void ko() {
        th thVar = this.rn;
        if (thVar != null) {
            bs bsVar = thVar.f8266jg;
            if (bsVar != null) {
                bsVar.vt();
            }
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = thVar.uq;
            if (mwhVar != null) {
                mwhVar.fkw();
            }
        }
    }

    public FrameLayout le() {
        return this.ra;
    }

    public void lh() {
        this.ra.removeAllViews();
    }

    public void mwh() {
        try {
            Activity activity = this.f8029lh.jvy;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, com.bytedance.sdk.component.utils.vpp.pno(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.f8029lh.ey.ryl();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ryl.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        ryl.this.f8029lh.ey.ryl();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                this.f8029lh.ey.ouw(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.f8029lh.ey.ryl();
        }
    }

    public boolean ouw() {
        return true;
    }

    public void pno() {
        fkw fkwVar = this.vpp;
        if (fkwVar == null) {
            return;
        }
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(fkwVar, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void ra() {
        if (this.f8026cf.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8026cf.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.f8026cf.setLayoutParams(marginLayoutParams);
        }
    }

    public void rn() {
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar;
        th thVar = this.rn;
        if (thVar == null || (mwhVar = thVar.uq) == null) {
            return;
        }
        mwhVar.le();
    }

    public void ryl() {
        AnimatorSet animatorSet;
        try {
            jg jgVar = this.mwh;
            if (jgVar != null && (animatorSet = jgVar.f7942le) != null) {
                animatorSet.cancel();
            }
            RelativeLayout relativeLayout = this.ryl;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.ryl;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public View tlj() {
        return this.f8028le;
    }

    public void vt() {
        View view;
        com.bytedance.sdk.openadsdk.common.ryl loadingStyle;
        List<com.bytedance.sdk.openadsdk.core.model.zih> list;
        com.bytedance.sdk.openadsdk.common.mwh mwhVar;
        qbp qbpVar;
        com.bytedance.sdk.openadsdk.core.widget.ra raVar;
        if (this.zin) {
            return;
        }
        this.zin = true;
        this.qbp = this.f8029lh.ucs;
        if (ouw()) {
            jg jgVar = new jg(this.f8029lh);
            this.mwh = jgVar;
            try {
                if (!od.lh(jgVar.ouw)) {
                    com.bytedance.sdk.openadsdk.core.widget.ra raVar2 = new com.bytedance.sdk.openadsdk.core.widget.ra(jgVar.vt);
                    jgVar.fkw = raVar2;
                    jgVar.yu = raVar2.getLoadingProgressBar();
                    com.bytedance.sdk.openadsdk.core.le.pno downloadButton = jgVar.fkw.getDownloadButton();
                    if (downloadButton != null) {
                        downloadButton.setOnClickListener(jgVar.f7943lh.f7956cd.f7990lh);
                    }
                    jgVar.fkw.ouw(jgVar.ouw);
                }
            } catch (Throwable unused) {
            }
        }
        fkw fkwVar = (fkw) this.f8029lh.rrs.findViewById(rn.ryl);
        this.vpp = fkwVar;
        fkwVar.ouw(this.f8029lh);
        com.bytedance.sdk.openadsdk.core.widget.cf cfVar = (com.bytedance.sdk.openadsdk.core.widget.cf) this.f8029lh.rrs.findViewById(rn.npr);
        this.jqy = cfVar;
        if (cfVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f8029lh;
            vpp vppVar = ouwVar.vt;
            String str = ouwVar.fkw;
            cfVar.ouw = vppVar;
            cfVar.vt = str;
            cfVar.f8477lh = null;
        }
        this.tlj = (PAGLogoView) this.f8029lh.rrs.findViewById(520093757);
        this.f8026cf = (ImageView) this.f8029lh.rrs.findViewById(rn.lk);
        this.f8028le = (ImageView) this.f8029lh.rrs.findViewById(520093708);
        this.ra = (FrameLayout) this.f8029lh.rrs.findViewById(rn.f8714cf);
        this.pno = this.f8029lh.rrs.findViewById(rn.rn);
        this.bly = this.f8029lh.rrs.findViewById(rn.xn);
        RelativeLayout relativeLayout = (RelativeLayout) this.f8029lh.rrs.findViewById(rn.f8731uj);
        this.ryl = relativeLayout;
        jg jgVar2 = this.mwh;
        if (jgVar2 != null && (raVar = jgVar2.fkw) != null && relativeLayout != null) {
            relativeLayout.addView(raVar, new LinearLayout.LayoutParams(-1, -1));
            final jg jgVar3 = this.mwh;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
            valueAnimatorOfInt.setDuration(2000L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.jg.1
                public AnonymousClass1() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    com.bytedance.sdk.openadsdk.core.widget.pno pnoVar = jg.this.yu;
                    if (pnoVar != null) {
                        pnoVar.setProgress(iIntValue);
                    }
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
            valueAnimatorOfInt2.setDuration(3000L);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.jg.2
                public AnonymousClass2() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    com.bytedance.sdk.openadsdk.core.widget.pno pnoVar = jg.this.yu;
                    if (pnoVar != null) {
                        pnoVar.setProgress(iIntValue);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            jgVar3.f7942le = animatorSet;
            animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
            jgVar3.f7942le.start();
        }
        Activity activity = this.vt;
        vpp vppVar2 = this.yu;
        String str2 = this.fkw;
        FrameLayout frameLayout = this.ra;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f8029lh;
        final th thVar = new th(activity, vppVar2, str2, frameLayout, ouwVar2.fqk, ouwVar2.rrs);
        this.rn = thVar;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.bly.le leVar = (com.bytedance.sdk.component.bly.le) thVar.jae.findViewById(rn.qbp);
        thVar.ko = leVar;
        if (leVar == null || vpp.ouw(thVar.jqy)) {
            osn.ouw((View) thVar.ko, 8);
        } else {
            com.bytedance.sdk.component.bly.le leVar2 = thVar.ko;
            if (!leVar2.f7425lh) {
                leVar2.o_();
            }
        }
        thVar.rn = (FrameLayout) thVar.jae.findViewById(rn.f8729th);
        thVar.zih = (com.bytedance.sdk.openadsdk.common.mwh) thVar.jae.findViewById(rn.ex);
        thVar.vm = thVar.jae.findViewById(rn.zin);
        thVar.f8273th = (ImageView) thVar.jae.findViewById(rn.vpp);
        thVar.qbp = thVar.jae.findViewById(rn.fvf);
        thVar.f8268lh = (FrameLayout) thVar.jae.findViewById(rn.zih);
        thVar.vt = (ImageView) thVar.jae.findViewById(rn.vm);
        thVar.ra = (RelativeLayout) thVar.jae.findViewById(rn.jqy);
        thVar.yu = (TextView) thVar.jae.findViewById(rn.nit);
        thVar.fkw = (FrameLayout) thVar.jae.findViewById(rn.tlj);
        View viewFindViewById = thVar.jae.findViewById(rn.tc);
        thVar.pno = viewFindViewById;
        if (viewFindViewById == null) {
            thVar.pno = thVar.jae.findViewById(rn.fak);
        }
        thVar.bly = thVar.vpp.findViewById(rn.ksc);
        thVar.tlj = (TextView) thVar.jae.findViewById(rn.f8724od);
        thVar.f8264cf = (TextView) thVar.jae.findViewById(rn.f8713cd);
        thVar.ryl = (com.bytedance.sdk.openadsdk.core.widget.zih) thVar.jae.findViewById(rn.jae);
        thVar.mwh = (TextView) thVar.jae.findViewById(rn.uq);
        TextView textView = thVar.yu;
        if (textView != null && (qbpVar = thVar.jqy.kq) != null) {
            textView.setText(qbpVar.fkw);
        }
        thVar.f8267le = thVar.jae.findViewById(rn.f8725pd);
        thVar.wp = (com.bytedance.sdk.openadsdk.core.le.yu) thVar.jae.findViewById(rn.vby);
        if ((th.yu(thVar.jqy) || th.vt(thVar.jqy) || th.ra(thVar.jqy) || th.lh(thVar.jqy)) && thVar.jqy.kq != null) {
            View view2 = thVar.f8267le;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.th.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (th.this.f8269ng.get()) {
                        return;
                    }
                    th thVar2 = th.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(thVar2.jqy, thVar2.tc, System.currentTimeMillis() - th.this.zin, false);
                    th.le(th.this);
                }
            }, (th.ra(thVar.jqy) ? thVar.jqy.kq.f8259lh : thVar.jqy.kq.ouw) * 1000);
        }
        com.bytedance.sdk.component.bly.le leVar3 = thVar.ko;
        if (leVar3 != null && leVar3.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(zih.ouw());
            lhVarOuw.vt = false;
            lhVarOuw.ouw = false;
            lhVarOuw.ouw(thVar.ko.getWebView());
            com.bytedance.sdk.component.bly.le leVar4 = thVar.ko;
            if (leVar4 != null && leVar4.getWebView() != null) {
                thVar.zvq = new th.vt(thVar.f8274ub, thVar.jqy, thVar.tc, thVar);
                com.bytedance.sdk.component.bly.le leVar5 = thVar.ko;
                if (leVar5.f7425lh && (leVar5.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.ouw.fkw)) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVarVt = ((com.bytedance.sdk.openadsdk.core.widget.ouw.fkw) thVar.ko.getWebViewClient()).vt();
                    thVar.uq = mwhVarVt;
                    if (mwhVarVt != null) {
                        mwhVarVt.uq = thVar.zvq;
                        mwhVarVt.jae = true;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar2 = new com.bytedance.sdk.openadsdk.yu.mwh(thVar.jqy, thVar.ko.getWebView(), thVar.zvq, thVar.f8265cj);
                    mwhVar2.jae = true;
                    thVar.uq = mwhVar2;
                }
                thVar.uq.ouw(thVar.tc);
                com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(thVar.jqy, thVar.ko, thVar.vpp);
                thVar.pv = fkwVarOuw;
                if (fkwVarOuw != null) {
                    fkwVarOuw.ouw(thVar.tc);
                }
                uoy.ouw(thVar.jqy, thVar.ko);
            }
            bs bsVar = new bs(thVar.vpp);
            thVar.f8266jg = bsVar;
            bsVar.uq = thVar.ksc;
            bs bsVarVt = bsVar.vt(thVar.ko);
            bsVarVt.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(thVar.jqy);
            vpp vppVar3 = thVar.jqy;
            bsVarVt.f8108lh = vppVar3.pv;
            bsVarVt.fkw = vppVar3.yhj;
            bs bsVarOuw = bsVarVt.ouw(vppVar3);
            bsVarOuw.f8107le = th.ra(thVar.jqy) ? thVar.f8270od : -1;
            vpp vppVar4 = thVar.jqy;
            bsVarOuw.pno = vppVar4.f8316vi;
            bsVarOuw.ouw = thVar.tc;
            bsVarOuw.ra = vppVar4.hun();
            bsVarOuw.ouw(thVar.ko).vt = new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.core.model.th.17
                @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
                public final void ouw() {
                    if (th.ra(th.this.jqy) && (th.this.vpp instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.vt)) {
                        ((com.bytedance.sdk.openadsdk.core.mwh.yu.vt) th.this.vpp).osn();
                    } else if (th.this.rrs != null) {
                        th.this.rrs.lh();
                    }
                }
            };
            com.bytedance.sdk.component.bly.le leVar6 = thVar.ko;
            if (leVar6.f7425lh && leVar6 != null && leVar6.getWebView() != null) {
                thVar.hun = thVar.ko.ra;
                thVar.ux = thVar.ko.pno;
                thVar.lso = thVar.ko.bly;
                if (thVar.ko.yu) {
                    thVar.ksc.zih();
                    thVar.zin = System.currentTimeMillis();
                }
                if (thVar.ko.f7424le) {
                    thVar.ouw();
                }
                if (thVar.ko.fkw) {
                    thVar.ouw();
                    int iOuw = uoy.ouw(thVar.ko.getWebView());
                    th.vt vtVar = thVar.zvq;
                    if (vtVar != null) {
                        vtVar.ouw(iOuw == 1 ? 1 : 0);
                    }
                }
            }
            thVar.ko.setLandingPage(true);
            thVar.ko.setTag(thVar.tc);
            thVar.ko.setMaterialMeta(thVar.jqy.bs());
            final Context contextOuw = zih.ouw();
            final bs bsVar2 = thVar.f8266jg;
            final String str3 = thVar.jqy.pv;
            final com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = thVar.pv;
            final com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = thVar.uq;
            com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(contextOuw, bsVar2, str3, fkwVar2, mwhVar3) { // from class: com.bytedance.sdk.openadsdk.core.model.th.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str4) {
                    super.onPageFinished(webView, str4);
                    th.this.ouw();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str4, Bitmap bitmap) {
                    super.onPageStarted(webView, str4, bitmap);
                    th.this.ksc.zih();
                    th.this.zin = System.currentTimeMillis();
                    if (!th.vt(th.this.jqy) || th.this.ouw == null || vpp.fkw(th.this.jqy)) {
                        return;
                    }
                    th.this.ouw.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i4, String str4, String str5) {
                    super.onReceivedError(webView, i4, str4, str5);
                    boolean z3 = false;
                    com.bytedance.sdk.component.utils.ko.ouw("LandingPageModel", "onReceivedError errorCode:%d, description:%s, failingUrl:%s", Integer.valueOf(i4), str4, str5);
                    String strOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.ouw(str5);
                    if (this.f8481le != null) {
                        this.f8481le.ouw(i4, str4, str5, com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.ouw(str5), (webView == null || str5 == null || !str5.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z10 = strOuw != null && strOuw.startsWith("image");
                    if (strOuw != null && strOuw.startsWith("mp4")) {
                        z3 = true;
                    }
                    if (z10 || z3 || th.this.f8269ng.get()) {
                        return;
                    }
                    th.le(th.this);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    com.bytedance.sdk.component.utils.ko.ouw("LandingPageModel", "onReceivedSslError error:%s", sslError);
                    if (sslErrorHandler != null) {
                        th.le(th.this);
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final WebResourceResponse shouldInterceptRequest(WebView webView, String str4) {
                    try {
                        if (TextUtils.isEmpty(th.this.jvy)) {
                            return super.shouldInterceptRequest(webView, str4);
                        }
                        th.ryl(th.this);
                        com.bytedance.sdk.openadsdk.ra.vt.ouw();
                        WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(th.this.fqk, th.this.jvy, str4);
                        if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                            th.jg(th.this);
                            com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "GeckoLog: hit++");
                            return webResourceResponseModelOuw.getWebResourceResponse();
                        }
                        if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                            th.ko(th.this);
                        }
                        return super.shouldInterceptRequest(webView, str4);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.qbp.ouw("LandingPageModel", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str4);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str4) {
                    if (!th.lh(th.this.jqy) || uoy.ouw(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str4);
                    }
                    Intent intent = new Intent(th.this.vpp, (Class<?>) TTCeilingLandingPageActivity.class);
                    th.this.jqy.f8310th = str4;
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.od.ouw().ouw(th.this.jqy));
                    com.bytedance.sdk.component.utils.vt.ouw(this.yu, intent, null);
                    return true;
                }
            };
            thVar = thVar;
            thVar.rrs = fkwVar3;
            thVar.ko.setWebViewClient(fkwVar3);
            com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar4 = thVar.rrs;
            fkwVar4.ko = thVar.jqy;
            fkwVar4.tlj = thVar.tc;
            fkwVar4.mwh = thVar.ksc;
            com.bytedance.sdk.component.bly.le leVar7 = thVar.ko;
            final bs bsVar3 = thVar.f8266jg;
            final com.bytedance.sdk.openadsdk.yu.mwh mwhVar4 = thVar.uq;
            final com.bytedance.sdk.openadsdk.common.fkw fkwVar5 = thVar.pv;
            leVar7.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(bsVar3, mwhVar4, fkwVar5) { // from class: com.bytedance.sdk.openadsdk.core.model.th.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView, int i4) {
                    super.onProgressChanged(webView, i4);
                    if (th.this.vpp != null && !th.this.vpp.isFinishing() && i4 == 100) {
                        th.this.ouw();
                    }
                    if (th.this.zih != null) {
                        th.this.zih.ouw(i4);
                    }
                }
            });
            if (thVar.f8263cd == null) {
                thVar.f8263cd = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(zih.ouw(), thVar.tc);
            }
            thVar.ko.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.14
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str4, String str5, String str6, String str7, long j) {
                    if (th.this.f8263cd != null) {
                        th.this.f8263cd.ouw(th.this.jqy);
                    }
                }
            });
            com.bytedance.sdk.component.bly.le leVar8 = thVar.ko;
            leVar8.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar8.getWebView()));
            thVar.ko.setMixedContentMode(0);
            thVar.ko.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.15
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view3, int i4, int i10, int i11, int i12) {
                    if (th.this.uq != null) {
                        th.this.uq.ouw(i10);
                    }
                }
            });
            thVar.ko.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.16
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    if (th.this.fkw()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            th.this.f8272sd = motionEvent.getY();
                        } else if (action == 1) {
                            if (osn.ouw(th.this.f8272sd, motionEvent.getY(), th.this.vpp)) {
                                th.this.vt(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (th.this.mq && motionEvent.getAction() == 1 && th.this.ksc != null) {
                        th.ouw(th.this, new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.th.16.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "onTouch event");
                                th.this.ksc.wp();
                            }
                        });
                    }
                    if ((!th.this.coz || th.tlj(th.this.jqy)) && !th.ra(th.this.jqy)) {
                        th.this.ey.onTouch(view3, motionEvent);
                    }
                    if ((!th.this.coz || th.tlj(th.this.jqy)) && !th.ra(th.this.jqy) && motionEvent.getAction() == 1 && th.this.ey.yu()) {
                        th.this.ko.getWebView().performClick();
                        th.vpp(th.this);
                    }
                    if (th.this.uq != null) {
                        th.this.uq.ouw(motionEvent);
                    }
                    if (th.this.pv == null) {
                        return false;
                    }
                    th.this.pv.ouw(motionEvent);
                    return false;
                }
            });
            thVar.ko.getWebView().setOnClickListener(thVar.ey);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(thVar.jqy, thVar.tc, thVar.f8265cj);
            if (!thVar.ko.f7425lh) {
                com.bytedance.sdk.component.utils.qbp.ouw("LandingPageModel", "loadUrlWithRefer url  = " + thVar.jqy.osn);
                zin.ouw(thVar.ko, thVar.jqy.osn);
            }
            thVar.f8271pd = true;
        }
        com.bytedance.sdk.component.bly.le leVar9 = thVar.ko;
        if (leVar9 != null && (mwhVar = thVar.zih) != null && !leVar9.fkw) {
            mwhVar.ouw();
        }
        if (th.vt(thVar.jqy)) {
            if (thVar.vt()) {
                thVar.vm.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(thVar.f8273th, "translationY", 16.0f, 0.0f).setDuration(500L);
                thVar.fvf = duration;
                duration.setRepeatMode(2);
                thVar.fvf.setRepeatCount(-1);
                thVar.fvf.start();
                thVar.vm.setClickable(true);
                thVar.vm.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.5
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        if (!th.this.coz) {
                            th.this.ey.onTouch(view3, motionEvent);
                        }
                        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                            return false;
                        }
                        th.this.bs = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                        th.this.bs.setDuration(200L);
                        th.this.bs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.5.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) th.this.rn.getLayoutParams();
                                layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                                th thVar2 = th.this;
                                ((Float) valueAnimator.getAnimatedValue()).getClass();
                                thVar2.lh();
                                th.this.rn.setLayoutParams(layoutParams);
                            }
                        });
                        if (th.this.ey.yu()) {
                            th.this.vm.performClick();
                            th.vpp(th.this);
                        }
                        th.this.bs.start();
                        th.this.vm.setVisibility(8);
                        return true;
                    }
                });
                thVar.vm.setOnClickListener(thVar.ey);
            }
            if (!vpp.fkw(thVar.jqy)) {
                thVar.ex.setVisibility(8);
                thVar.f8268lh.setVisibility(0);
                thVar.vt.setScaleType(ImageView.ScaleType.FIT_CENTER);
                thVar.vt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        th thVar2 = th.this;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(thVar2.jqy, thVar2.tc);
                    }
                });
                vpp vppVar5 = thVar.jqy;
                if (vppVar5 != null && (list = vppVar5.tc) != null && list.size() > 0 && thVar.jqy.tc.get(0) != null && !TextUtils.isEmpty(thVar.jqy.tc.get(0).ouw)) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    com.bytedance.sdk.openadsdk.th.vt.ouw(thVar.jqy.tc.get(0), thVar.vt, thVar.jqy, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.model.th.7
                        @Override // com.bytedance.sdk.component.fkw.rn
                        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar2) {
                            if (th.this.ouw != null) {
                                th.this.ouw.removeMessages(101);
                            }
                        }

                        @Override // com.bytedance.sdk.component.fkw.rn
                        public final void ouw(int i4, String str4, Throwable th2) {
                            if (th.this.ouw != null) {
                                th.this.ouw.removeMessages(101);
                            }
                            th.this.le();
                        }
                    });
                }
            }
            try {
                String str4 = thVar.jqy.tc.get(0).ouw;
                yu.ouw.vt.ouw(str4).ouw(thVar.jqy.tc.get(0).vt).vt(thVar.jqy.tc.get(0).f8323lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(1).ouw(new th.ouw()).vt(new com.bytedance.sdk.openadsdk.tlj.vt(thVar.jqy, str4, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.model.th.8
                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(int i4, String str5, Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar2) {
                        Drawable bitmapDrawable;
                        try {
                            Object objVt = cfVar2.vt();
                            if (objVt != null && cfVar2.lh() != null) {
                                if (objVt instanceof Bitmap) {
                                    bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.zih.ouw().getResources(), (Bitmap) objVt);
                                } else if (objVt instanceof Drawable) {
                                    if (Build.VERSION.SDK_INT >= 28 && a.i(objVt)) {
                                        a.c(objVt).start();
                                    }
                                    bitmapDrawable = (Drawable) objVt;
                                } else {
                                    bitmapDrawable = null;
                                }
                                if (!th.uq(th.this)) {
                                    th.this.f8268lh.setBackground(bitmapDrawable);
                                    return;
                                }
                                th.this.fkw.setBackground(bitmapDrawable);
                                View viewRn = th.this.ksc.rn();
                                if (viewRn == null || !(viewRn.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewRn.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }));
            } catch (Exception unused2) {
            }
            if (!thVar.vt()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) thVar.rn.getLayoutParams();
                layoutParams.weight = 2.33f;
                thVar.rn.setLayoutParams(layoutParams);
            }
        }
        if ((th.yu(thVar.jqy) || th.ra(thVar.jqy)) && (view = thVar.qbp) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.mwh mwhVar5 = thVar.zih;
        if (mwhVar5 != null) {
            mwhVar5.ouw(thVar.jqy);
        }
        if (th.lh(thVar.jqy)) {
            com.bytedance.sdk.openadsdk.common.mwh mwhVar6 = thVar.zih;
            if (mwhVar6 != null && (loadingStyle = mwhVar6.getLoadingStyle()) != null) {
                thVar.f8275vh = loadingStyle.f7846lh;
                thVar.yib = loadingStyle.yu;
            }
            com.bytedance.sdk.openadsdk.core.le.yu yuVar = thVar.wp;
            if (yuVar != null) {
                yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        if (th.this.wp.getTag() != null) {
                            if (th.this.wp.getTag().equals(1)) {
                                th.this.vt(3);
                            } else if (th.this.wp.getTag().equals(2)) {
                                th.this.vt(4);
                            }
                        }
                    }
                });
            }
        }
        lh.ouw.ouw(SystemClock.elapsedRealtime() - jElapsedRealtime, thVar.jqy, thVar.tc, thVar.fqk, thVar.jvy);
    }

    public void yu() {
        if (this.f8029lh.vt.an() && od.lh(this.f8029lh.vt)) {
            return;
        }
        osn.ouw((View) this.ra, 8);
        osn.ouw((View) this.jqy, 8);
        osn.ouw(this.pno, 8);
        osn.ouw(this.bly, 8);
        vt(8);
        osn.ouw((View) this.f8028le, 8);
        osn.ouw((View) this.tlj, 8);
        osn.ouw((View) this.ryl, 8);
        osn.ouw((View) this.f8026cf, 8);
    }

    public final void zih() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f8029lh;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar = ouwVar.f7956cd.f7990lh;
        View view = this.vpp;
        if (view == null) {
            view = ouwVar.rrs;
        }
        fkwVar.onClick(view);
    }

    public void le(int i4) {
        osn.ouw((View) this.f8028le, i4);
    }

    public final void lh(int i4) {
        vpp vppVar = this.yu;
        if (vppVar != null && vppVar.an() && od.lh(this.yu)) {
            osn.ouw((View) this.jqy, i4);
        }
    }

    public void ouw(boolean z3) {
        osn.ouw((View) this.tlj, od.lh(this.yu) ? 8 : 0);
        osn.ouw((View) this.f8026cf, (this.yu.cd() && this.yu.le()) ? 0 : 8);
        vt(z3);
        if (this.f8030th) {
            fkw();
        }
    }

    public void ouw(int i4) {
        if (this.zih == null) {
            this.zih = new com.bytedance.sdk.openadsdk.core.le.le(this.f8029lh.jvy);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.zih.setLayoutParams(layoutParams);
            this.zih.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(this.f8029lh.jvy, "tt_video_loading_progress_bar"));
            this.f8029lh.ey.le().addView(this.zih);
        }
        this.zih.setVisibility(i4);
    }

    public void fkw(int i4) {
        int i10 = this.ouw;
        if (i10 == -1 || i4 != i10 || this.ko.get()) {
            return;
        }
        vt(0);
        this.ko.set(true);
        pno();
    }

    public void yu(int i4) {
        osn.ouw((View) this.tlj, i4);
    }

    public void ouw(int i4, int i10) {
        FrameLayout frameLayout;
        if (this.yu.zih() == 1 && (frameLayout = this.ra) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iYu = osn.yu((Context) this.vt);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.ra.getLayoutParams();
            layoutParams.width = iYu;
            int i11 = (iYu * 9) / 16;
            layoutParams.height = i11;
            this.ra.setLayoutParams(layoutParams);
            this.f8027jg = (osn.le(this.vt) - i11) / 2;
            ko.fkw("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.f8027jg);
        }
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.lh.lh lhVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.tlj tljVar;
        if (this.ra != null && (vppVar = this.yu) != null && (tljVar = vppVar.ms) != null) {
            if (tljVar.f8281le && !th.vt(vppVar)) {
                ouw(lhVar);
                osn.ouw((View) this.ra, (View.OnTouchListener) lhVar, "TTBaseVideoActivity#mVideoNativeFrame");
            } else {
                ouw(onClickListener);
            }
        }
        vpp vppVar2 = this.yu;
        if (vppVar2 != null && vppVar2.zih() == 1) {
            if (this.yu.ms != null && (view2 = this.pno) != null) {
                osn.ouw(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.pno.getLayoutParams();
                layoutParams.height = this.f8027jg;
                this.pno.setLayoutParams(layoutParams);
                if (this.yu.ms.vt) {
                    this.pno.setOnClickListener(lhVar);
                    this.pno.setOnTouchListener(onTouchListener);
                } else {
                    this.pno.setOnClickListener(onClickListener);
                }
            }
            if (this.yu.ms != null && (view = this.bly) != null) {
                osn.ouw(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.bly.getLayoutParams();
                layoutParams2.height = this.f8027jg;
                this.bly.setLayoutParams(layoutParams2);
                if (this.yu.ms.yu) {
                    this.bly.setOnClickListener(lhVar);
                    this.bly.setOnTouchListener(onTouchListener);
                } else {
                    this.bly.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.tlj;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ryl.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    ko.lh("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        ryl rylVar = ryl.this;
                        TTWebsiteActivity.ouw(rylVar.vt, rylVar.yu, rylVar.fkw);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.qbp.lh("TTAD.RFullVideoLayout", th2.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.f8026cf;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(zih.ouw(), 14.0f, true), this.f8026cf, this.f8029lh.vt);
        }
    }

    public void ouw(View.OnClickListener onClickListener) {
        osn.ouw(this.ra, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void ouw(float f10) {
        osn.ouw(this.f8028le, f10);
    }

    public void ouw(Animation animation) {
        RelativeLayout relativeLayout = this.ryl;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void vt(boolean z3) {
        ImageView imageView;
        if (this.qbp != 1 && (imageView = this.f8028le) != null && z3) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Resources resources = this.vt.getResources();
                int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) : 0;
                if (dimensionPixelSize > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (dimensionPixelSize > marginLayoutParams.rightMargin) {
                        marginLayoutParams.rightMargin = dimensionPixelSize;
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f8029lh.coz;
        if ((vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.yu) || (vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.lh)) {
            return;
        }
        vt(0);
    }

    public void vt(int i4) {
        vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.jg jgVar;
        vpp vppVar2 = this.yu;
        if (vppVar2 != null && vppVar2.cd() && (vppVar = this.yu) != null && vppVar.cd() && (jgVar = vppVar.kbx) != null && jgVar.vt == 1) {
            osn.ouw((View) this.vpp, 8);
        } else {
            osn.ouw((View) this.vpp, i4);
        }
    }
}
