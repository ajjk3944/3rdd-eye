package com.bytedance.sdk.openadsdk.core.dg;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.sz.ypw.ycc;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.sup;
import com.bytedance.sdk.openadsdk.core.widget.sz;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.core.zz.sba;
import com.bytedance.sdk.openadsdk.core.zz.ul;
import com.bytedance.sdk.openadsdk.core.zz.yzg;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.List;

/* loaded from: classes.dex */
public class ypw extends com.bytedance.sdk.openadsdk.core.zz.emc {
    public static sba[] emc = {new sba(1, 6.4f, 320, 50), new sba(4, 1.2f, 300, 250)};
    private PAGBannerAdWrapperListener cf;
    private String qh;
    private emc sup;
    private ul sz;

    public ypw(Context context) {
        super(context);
        this.ypw = context;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.cf = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.qh = str;
    }

    private void bw() {
        TextView textView;
        rie rieVar = this.xq;
        if (rieVar != null) {
            int iIn = rieVar.in();
            if (this.xq.iat() == null) {
                emc emcVarMsw = msw();
                this.sup = emcVarMsw;
                sz szVar = emcVarMsw.emc;
                ImageView imageView = emcVarMsw.xq;
                TextView textView2 = emcVarMsw.ypw;
                TextView textView3 = emcVarMsw.uym;
                View view = emcVarMsw.ycc;
                if (view != null) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.ypw.3
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                            TTWebsiteActivity.emc(((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ypw, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).xq, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ycc);
                        }
                    });
                }
                ViewGroup.LayoutParams layoutParams = szVar.getLayoutParams();
                if (this.uym - (vw.ypw(this.ypw, 8.0f) * 2) >= ((this.msw - vw.ypw(this.ypw, 8.0f)) - (vw.ypw(this.ypw, 21.0f) * 2)) - vw.ypw(this.ypw, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                szVar.setLayoutParams(layoutParams);
                if (iIn == 33) {
                    szVar.setRatio(1.0f);
                } else {
                    szVar.setRatio(1.91f);
                }
                List<com.bytedance.sdk.openadsdk.core.model.sba> listRr = this.xq.rr();
                if (listRr != null && !listRr.isEmpty()) {
                    com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(listRr.get(0), szVar, this.xq);
                    com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(listRr.get(0).emc(), this.sup.bw);
                }
                if (this.xq.ya() == null || TextUtils.isEmpty(this.xq.ya().emc())) {
                    textView = textView2;
                } else {
                    textView = textView2;
                    com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.xq.ya().emc(), this.xq.ya().ypw(), this.xq.ya().xq(), imageView, this.xq);
                }
                textView.setText(this.xq.xou());
                if (TextUtils.isEmpty(this.xq.xxo())) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setText(this.xq.xxo());
                }
                vw.emc((TextView) null, this.sup.dg, this.xq);
                emc((View) szVar, true);
                szVar.setTag(520093762, Boolean.TRUE);
                emc((View) this, true);
                emc((View) textView3, true);
                return;
            }
            emc emcVarZz = zz();
            this.sup = emcVarZz;
            TextView textView4 = emcVarZz.ypw;
            TextView textView5 = emcVarZz.uym;
            sup supVar = emcVarZz.msw;
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.xq.iat().f6585f, this.sup.bw);
            View view2 = this.sup.ycc;
            if (view2 != null) {
                view2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.ypw.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        TTWebsiteActivity.emc(((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ypw, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).xq, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ycc);
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams2 = supVar.getLayoutParams();
            if (iIn == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                supVar.setLayoutParams(layoutParams2);
                supVar.setRatio(0.5625f);
            } else if (iIn == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                supVar.setLayoutParams(layoutParams2);
                supVar.setRatio(1.7777778f);
            } else {
                if (this.uym - (vw.ypw(this.ypw, 8.0f) * 2) >= ((this.msw - vw.ypw(this.ypw, 8.0f)) - (vw.ypw(this.ypw, 21.0f) * 2)) - vw.ypw(this.ypw, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                supVar.setLayoutParams(layoutParams2);
                supVar.setRatio(1.0f);
            }
            supVar.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.sz.ypw.ycc videoView = getVideoView();
            if (videoView != null) {
                if (this.sz instanceof yzg) {
                    videoView.setNeedSelfManagerVideo(!((yzg) r7).sz());
                    ((yzg) this.sz).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((yzg) this.sz);
                }
                supVar.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new ycc.emc() { // from class: com.bytedance.sdk.openadsdk.core.dg.ypw.5
                    @Override // com.bytedance.sdk.openadsdk.core.sz.ypw.ycc.emc
                    public void emc(View view3, int i) {
                        if (ypw.this.cf != null) {
                            ypw.this.cf.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.zz.msw clickCreativeListener = this.sz.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.emc(videoView.getNativeVideoController());
                }
            }
            if (this.xq.ya() != null && !TextUtils.isEmpty(this.xq.ya().emc())) {
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.xq.ya().emc(), this.xq.ya().ypw(), this.xq.ya().xq(), this.sup.xq, this.xq);
            }
            textView4.setText(this.xq.xou());
            vw.emc((TextView) null, this.sup.dg, this.xq);
            if (TextUtils.isEmpty(this.xq.xxo())) {
                textView5.setVisibility(8);
            } else {
                textView5.setText(this.xq.xxo());
            }
            emc((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            emc((View) this, true);
            emc((View) textView5, true);
            emc(supVar);
        }
    }

    private void dg() {
        emc emcVarYcc = ycc();
        this.sup = emcVarYcc;
        View view = emcVarYcc.ycc;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.ypw.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.emc(((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ypw, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).xq, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ycc);
                }
            });
        }
        sz szVar = this.sup.emc;
        if (szVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.sba> listRr = this.xq.rr();
            if (listRr != null && !listRr.isEmpty()) {
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(listRr.get(0), szVar, this.xq);
            }
            emc((View) szVar, true);
            szVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private emc msw() {
        int iYpw = vw.ypw(this.ypw, 8.0f);
        int iYpw2 = vw.ypw(this.ypw, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.ypw);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iYpw, iYpw, iYpw, iYpw2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.ypw);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        aa aaVar = new aa(this.ypw);
        aaVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(vw.ypw(this.ypw, 52.0f), vw.ypw(this.ypw, 52.0f));
        aaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        aaVar.setLayoutParams(layoutParams3);
        linearLayout.addView(aaVar);
        LinearLayout linearLayout2 = new LinearLayout(this.ypw);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iYpw;
        layoutParams4.rightMargin = iYpw;
        layoutParams4.setMarginStart(iYpw);
        layoutParams4.setMarginEnd(iYpw);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.ypw);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        vk vkVar = new vk(this.ypw);
        vkVar.setId(520093735);
        linearLayout2.addView(vkVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.ypw);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(vw.ypw(this.ypw, 76.0f), vw.ypw(this.ypw, 36.0f));
        textView2.setBackground(gbl.emc(this.ypw, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.rie.emc(this.ypw, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.ypw);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = iYpw2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        sz szVar = new sz(this.ypw);
        szVar.setId(520093736);
        szVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(szVar, layoutParams8);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.ypw, this.xq);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(iYpw, iYpw, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new emc(aaVar, viewCreatePAGLogoViewByMaterial, textView2, textView, szVar, vkVar, frameLayout);
    }

    private emc uym() {
        int iYpw = vw.ypw(this.ypw, 38.0f);
        int iYpw2 = (int) (vw.ypw(this.ypw, 25.0f) / 5.0d);
        int iYpw3 = vw.ypw(this.ypw, 10.0f);
        int iYpw4 = vw.ypw(this.ypw, 2.0f);
        int iYpw5 = vw.ypw(this.ypw, 6.0f);
        int iYpw6 = vw.ypw(this.ypw, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.ypw);
        addView(relativeLayout, -1, -1);
        aa aaVar = new aa(this.ypw);
        aaVar.setId(520093738);
        TextView textView = new TextView(this.ypw);
        textView.setId(520093730);
        vk vkVar = new vk(this.ypw);
        vkVar.setId(520093735);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.ypw, this.xq);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.ypw);
        textView2.setId(520093703);
        emc emcVar = new emc(aaVar, textView, vkVar, viewCreatePAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iYpw, iYpw);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(iYpw5);
        layoutParams.setMargins(iYpw5, 0, 0, 0);
        aaVar.setLayoutParams(layoutParams);
        aaVar.setBackgroundColor(-1);
        aaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(aaVar);
        LinearLayout linearLayout = new LinearLayout(this.ypw);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, aaVar.getId());
        layoutParams2.setMarginStart(iYpw6);
        layoutParams2.setMarginEnd(iYpw6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, aaVar.getId());
        layoutParams2.setMargins(iYpw6, 0, iYpw6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = iYpw4;
        vkVar.setLayoutParams(layoutParams4);
        linearLayout.addView(vkVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(iYpw5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = iYpw5;
        textView2.setBackground(gbl.emc(this.ypw, 12));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(iYpw3, iYpw2, iYpw3, iYpw2);
        textView2.setText(com.bytedance.sdk.component.utils.rie.emc(this.ypw, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return emcVar;
    }

    private void xq() {
        vw.ypw(this.ypw, 50.0f);
        emc emcVarUym = uym();
        this.sup = emcVarUym;
        ImageView imageView = emcVarUym.xq;
        TextView textView = emcVarUym.ypw;
        vk vkVar = emcVarUym.dg;
        TextView textView2 = emcVarUym.uym;
        View view = emcVarUym.ycc;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.dg.ypw.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TTWebsiteActivity.emc(((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ypw, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).xq, ((com.bytedance.sdk.openadsdk.core.zz.emc) ypw.this).ycc);
                }
            });
        }
        if (this.xq.ya() != null && !TextUtils.isEmpty(this.xq.ya().emc())) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.xq.ya().emc(), this.xq.ya().ypw(), this.xq.ya().xq(), imageView, this.xq);
        }
        textView.setText(this.xq.xou());
        if (TextUtils.isEmpty(this.xq.xxo())) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.xq.xxo());
        }
        vw.emc((TextView) null, vkVar, this.xq);
        emc((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        emc((View) this, true);
        emc((View) textView2, true);
    }

    private emc ycc() {
        int iYpw = vw.ypw(this.ypw, 8.0f);
        sz szVar = new sz(this.ypw);
        szVar.setId(520093736);
        szVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(szVar, layoutParams);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.ypw, this.xq);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(iYpw, iYpw, 0, 0);
        layoutParams2.gravity = 8388659;
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(viewCreatePAGLogoViewByMaterial);
        return new emc(viewCreatePAGLogoViewByMaterial, szVar);
    }

    private void ypw() {
        sba sbaVarEmc = emc(this.sz.getExpectExpressWidth(), this.sz.getExpectExpressHeight());
        if (this.sz.getExpectExpressWidth() <= 0 || this.sz.getExpectExpressHeight() <= 0) {
            int iXq = vw.xq(this.ypw);
            this.uym = iXq;
            this.msw = Float.valueOf(iXq / sbaVarEmc.ypw).intValue();
        } else {
            this.uym = vw.ypw(this.ypw, this.sz.getExpectExpressWidth());
            this.msw = vw.ypw(this.ypw, this.sz.getExpectExpressHeight());
        }
        int i = this.uym;
        if (i > 0 && i > vw.xq(this.ypw)) {
            this.uym = vw.xq(this.ypw);
            this.msw = Float.valueOf(this.msw * (vw.xq(this.ypw) / this.uym)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.uym, this.msw);
        }
        layoutParams.width = this.uym;
        layoutParams.height = this.msw;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        rie rieVar = this.xq;
        if (rieVar != null) {
            int iIn = rieVar.in();
            if (iIn == 1010 || iIn == 1011 || iIn == 1012) {
                dg();
            } else {
                emc(sbaVarEmc);
            }
        }
    }

    private emc zz() {
        int iYpw = vw.ypw(this.ypw, 8.0f);
        int iYpw2 = vw.ypw(this.ypw, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.ypw);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(iYpw, iYpw, iYpw, iYpw2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.ypw);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        aa aaVar = new aa(this.ypw);
        aaVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(vw.ypw(this.ypw, 52.0f), vw.ypw(this.ypw, 52.0f));
        aaVar.setScaleType(ImageView.ScaleType.FIT_XY);
        aaVar.setLayoutParams(layoutParams3);
        linearLayout.addView(aaVar);
        LinearLayout linearLayout2 = new LinearLayout(this.ypw);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = iYpw;
        layoutParams4.rightMargin = iYpw;
        layoutParams4.setMarginStart(iYpw);
        layoutParams4.setMarginEnd(iYpw);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.ypw);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        vk vkVar = new vk(this.ypw);
        vkVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = vw.ypw(this.ypw, 4.0f);
        linearLayout2.addView(vkVar, layoutParams6);
        TextView textView2 = new TextView(this.ypw);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(vw.ypw(this.ypw, 76.0f), vw.ypw(this.ypw, 36.0f));
        textView2.setBackground(gbl.emc(this.ypw, 18));
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(com.bytedance.sdk.component.utils.rie.emc(this.ypw, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.ypw);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = iYpw2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        sup supVar = new sup(this.ypw);
        supVar.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        supVar.setLayoutParams(layoutParams9);
        frameLayout.addView(supVar);
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.ypw, this.xq);
        viewCreatePAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(iYpw, iYpw, 0, 0);
        viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(viewCreatePAGLogoViewByMaterial);
        return new emc(aaVar, viewCreatePAGLogoViewByMaterial, textView2, textView, supVar, vkVar, frameLayout);
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.emc
    public void emc(View view, int i, com.bytedance.sdk.openadsdk.core.model.vk vkVar) {
        ul ulVar = this.sz;
        if (ulVar != null) {
            ulVar.emc(view, i, vkVar);
        }
    }

    public void emc(rie rieVar, ul ulVar, com.bytedance.sdk.openadsdk.ul.emc.emc.xq xqVar) {
        setBackgroundColor(-1);
        this.xq = rieVar;
        this.sz = ulVar;
        this.ycc = "banner_ad";
        ulVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        ypw();
    }

    public static class emc {
        FrameLayout bw;
        vk dg;
        public sz emc;
        private sup msw;
        TextView uym;
        ImageView xq;
        View ycc;
        public TextView ypw;

        public emc(ImageView imageView, TextView textView, vk vkVar, View view, TextView textView2) {
            this.xq = imageView;
            this.ypw = textView;
            this.dg = vkVar;
            this.ycc = view;
            this.uym = textView2;
        }

        public emc(ImageView imageView, View view, TextView textView, TextView textView2, sz szVar, vk vkVar, FrameLayout frameLayout) {
            this.xq = imageView;
            this.ycc = view;
            this.uym = textView;
            this.ypw = textView2;
            this.emc = szVar;
            this.dg = vkVar;
            this.bw = frameLayout;
        }

        public emc(ImageView imageView, View view, TextView textView, TextView textView2, sup supVar, vk vkVar, FrameLayout frameLayout) {
            this.xq = imageView;
            this.ycc = view;
            this.uym = textView;
            this.ypw = textView2;
            this.msw = supVar;
            this.dg = vkVar;
            this.bw = frameLayout;
        }

        public emc(View view, sz szVar) {
            this.ycc = view;
            this.emc = szVar;
        }
    }

    private void emc(sba sbaVar) {
        if (sbaVar.emc == 1) {
            xq();
        } else {
            bw();
        }
    }

    public static sba emc(int i, int i3) {
        try {
            return ((double) i3) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? emc[1] : emc[0];
        } catch (Throwable unused) {
            return emc[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zz.emc
    public void emc() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.bw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.xq.xq xqVar = this.dg;
        if (xqVar != null) {
            xqVar.emc();
        } else {
            TTDelegateActivity.emc(this.xq, this.qh);
        }
    }
}
