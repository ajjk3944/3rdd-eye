package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.aa;
import com.bytedance.sdk.openadsdk.core.model.dr;
import com.bytedance.sdk.openadsdk.core.model.ee;
import com.bytedance.sdk.openadsdk.core.widget.ycc;
import com.bytedance.sdk.openadsdk.core.ycc.bw;
import com.bytedance.sdk.openadsdk.core.ycc.dg;
import com.bytedance.sdk.openadsdk.core.ycc.msw;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vk;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class TopLayoutDislike2 extends bw implements emc<TopLayoutDislike2> {
    bw container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private dg mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private bw mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private ypw mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        dg dgVar = new dg(getContext());
        int iYpw = vw.ypw(getContext(), 5.0f);
        dgVar.setPadding(iYpw, iYpw, iYpw, iYpw);
        dgVar.setScaleType(ImageView.ScaleType.CENTER);
        dgVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.emc());
        return dgVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ypw(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TopLayoutDislike2.this.mIsSoundMute = !r0.mIsSoundMute;
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(TopLayoutDislike2.this.mSkipIV != null ? TopLayoutDislike2.this.mIsSoundMute ? rie.xq(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : rie.xq(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute") : TopLayoutDislike2.this.mIsSoundMute ? gbl.emc(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : gbl.emc(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper"));
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.emc(view2, tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.emc(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.emc(view2);
                        }
                    }
                });
            }
        }
        dg dgVar = this.mCloseBtn;
        if (dgVar != null) {
            dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.xq(view2);
                    }
                }
            });
        }
        bw bwVar = this.mPlayableNextAd;
        if (bwVar != null) {
            bwVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.dg(view2);
                    }
                }
            });
        }
    }

    private void initProgressBar(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        ee eeVarSup;
        ee.ypw ypwVarAa;
        if (rieVar == null || rieVar.dg() == null || rieVar.dg().sup() == null || (eeVarSup = rieVar.dg().sup()) == null || eeVarSup.aa() == null || (ypwVarAa = eeVarSup.aa()) == null) {
            return;
        }
        if (!TextUtils.isEmpty(ypwVarAa.ypw())) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.uym.emc.emc(ypwVarAa.ypw());
        }
        if (!TextUtils.isEmpty(ypwVarAa.xq())) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.uym.emc.emc(ypwVarAa.xq());
        }
        if (ypwVarAa.dg() <= 0.0f) {
            this.mProgressSize = vw.ypw(getContext(), 1.0f);
        } else {
            this.mProgressSize = vw.ypw(getContext(), ypwVarAa.dg());
        }
        if (ypwVarAa.bw() > 0.0f) {
            this.mProgressRadiusSize = vw.ypw(getContext(), ypwVarAa.bw());
        }
        this.mProgressType = ypwVarAa.emc();
    }

    private void initView(com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        bw bwVar = new bw(getContext());
        this.container = bwVar;
        bwVar.setOrientation(0);
        int iYpw = vw.ypw(getContext(), 16.0f);
        int iYpw2 = vw.ypw(getContext(), 12.0f);
        int iYpw3 = vw.ypw(getContext(), 24.0f);
        int iYpw4 = vw.ypw(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iYpw4, iYpw4);
        layoutParams.topMargin = iYpw3;
        layoutParams.leftMargin = iYpw;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iYpw4, iYpw4);
        layoutParams2.leftMargin = iYpw2;
        layoutParams2.topMargin = iYpw3;
        this.mImgSound.setId(vk.ak);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        msw mswVar = new msw(getContext());
        this.mTextViewCountDown = mswVar;
        mswVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.ypw());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, vw.ypw(getContext(), 28.0f));
        layoutParams4.topMargin = iYpw3;
        layoutParams4.rightMargin = iYpw;
        this.mTextViewCountDown.setPadding(iYpw2, 0, iYpw2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        bw bwVar2 = new bw(getContext());
        this.mPlayableNextAd = bwVar2;
        bwVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iYpw4);
        layoutParams5.topMargin = iYpw3;
        if (rieVar == null || !rieVar.vcl()) {
            layoutParams5.rightMargin = iYpw;
        } else {
            layoutParams5.rightMargin = vw.ypw(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.dg.ypw());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new msw(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, vw.ypw(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iYpw2, 0, 0, 0);
        String strSra = dr.sra(rieVar);
        if (TextUtils.isEmpty(strSra)) {
            this.mNextAdTextTv.setText(rie.ypw(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strSra);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        dg dgVar = new dg(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iYpw2, iYpw2);
        layoutParams7.rightMargin = iYpw2;
        dgVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        dgVar.setLayoutParams(layoutParams7);
        dgVar.setImageResource(rie.dg(aa.emc(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(dgVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iYpw4, iYpw4);
        layoutParams8.topMargin = iYpw3;
        layoutParams8.rightMargin = iYpw;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        dg dgVarYpw = ycc.ypw(getContext());
        this.mCloseBtn = dgVarYpw;
        dgVarYpw.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = iYpw3;
        layoutParams9.rightMargin = iYpw3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(rie.emc(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(vw.ypw(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iYpw4, iYpw4);
            layoutParams10.topMargin = iYpw3;
            layoutParams10.rightMargin = iYpw;
            this.mProgressRing.setLayoutParams(layoutParams10);
            this.mProgressRing.emc("ring").emc(this.mProgressSize).emc(this.mProgressColor).ypw(this.mProgressBgColor).ypw(this.mProgressRadiusSize);
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar = new com.bytedance.sdk.openadsdk.core.ycc.xq(getContext());
        xqVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc emcVar = this.mProgressRing;
        if (emcVar != null) {
            xqVar.addView(emcVar);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.mProgressBar.emc("line").emc(this.mProgressSize).emc(this.mProgressColor).ypw(this.mProgressBgColor).ypw(this.mProgressRadiusSize);
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            xqVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(xqVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc emcVar2 = this.mProgressBar;
        if (emcVar2 != null) {
            addView(emcVar2);
        }
        addView(this.container);
    }

    private void updateTime(boolean z6) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z6) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setCountDownFor1InN(CharSequence charSequence, int i) {
        int i3 = this.mProgressType;
        if (i3 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(TTAdConstant.STYLE_SIZE_RADIO_1_1);
            this.mProgressRing.setProgress(i);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i3 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(TTAdConstant.STYLE_SIZE_RADIO_1_1);
                this.mProgressBar.setProgress(i);
                return;
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setListener(ypw ypwVar) {
        this.mTopListener = ypwVar;
    }

    public void setShouldShowSkipTime(boolean z6) {
        this.shouldShowSkipTime = z6;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowDislike(boolean z6) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z6 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowEndCardNextAd(boolean z6, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        bw bwVar = this.mPlayableNextAd;
        if (bwVar != null) {
            bwVar.setVisibility(z6 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z6 || rieVar == null || rieVar.ivb() == null) {
                return;
            }
            String strXq = rieVar.ivb().xq();
            if (TextUtils.isEmpty(strXq)) {
                return;
            }
            this.mNextAdTextTv.setText(strXq);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowPlayableNextAd(boolean z6, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        bw bwVar = this.mPlayableNextAd;
        if (bwVar != null) {
            bwVar.setVisibility(z6 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z6) {
                return;
            }
            String strSra = dr.sra(rieVar);
            if (TextUtils.isEmpty(strSra)) {
                this.mNextAdTextTv.setText(rie.ypw(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strSra);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowSkip(boolean z6) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z6) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z6;
        this.mSkipIV.setVisibility((z6 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z6 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setShowSound(boolean z6) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipEnable(boolean z6) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z6);
            this.mSkipIV.setClickable(z6);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z6);
            this.mTextViewCountDown.setClickable(z6);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.mTextViewCountDown.setVisibility(8);
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void setSoundMute(boolean z6) {
        this.mIsSoundMute = z6;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z6 ? rie.xq(getContext(), "tt_reward_full_mute") : rie.xq(getContext(), "tt_reward_full_unmute") : z6 ? gbl.emc(getContext(), "tt_mute_wrapper") : gbl.emc(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i = this.skipTime;
            int i3 = i == 0 ? Integer.parseInt(str) : i - (this.videoDuration - Integer.parseInt(str));
            if (i3 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i3 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc emcVar = this.mProgressRing;
        if (emcVar != null) {
            emcVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc emcVar2 = this.mProgressBar;
        if (emcVar2 != null) {
            emcVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.emc
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc emcVar = this.mProgressRing;
        if (emcVar != null) {
            emcVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.gbl.ypw.dg.emc emcVar2 = this.mProgressBar;
        if (emcVar2 != null) {
            emcVar2.setVisibility(8);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 load(com.bytedance.sdk.openadsdk.core.model.rie r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.load(com.bytedance.sdk.openadsdk.core.model.rie):com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2");
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.uym.emc.emc("#FFD813");
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.uym.emc.emc("rgba(0, 0, 0, 0.5)");
        setOrientation(1);
    }
}
