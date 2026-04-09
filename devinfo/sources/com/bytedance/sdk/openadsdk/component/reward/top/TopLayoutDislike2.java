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
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.core.le.fkw;
import com.bytedance.sdk.openadsdk.core.le.pno;
import com.bytedance.sdk.openadsdk.core.le.yu;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.tc;
import com.bytedance.sdk.openadsdk.core.widget.le;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class TopLayoutDislike2 extends fkw implements ouw<TopLayoutDislike2> {
    fkw container;
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private yu mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private TextView mNextAdTextTv;
    private fkw mPlayableNextAd;
    private com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw mProgressBar;
    private int mProgressBgColor;
    private int mProgressColor;
    private int mProgressRadiusSize;
    private com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw mProgressRing;
    private int mProgressSize;
    private CharSequence mProgressStr;
    private int mProgressType;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private vt mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        yu yuVar = new yu(getContext());
        int iOuw = osn.ouw(getContext(), 5.0f);
        yuVar.setPadding(iOuw, iOuw, iOuw, iOuw);
        yuVar.setScaleType(ImageView.ScaleType.CENTER);
        yuVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.ouw());
        return yuVar;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.vt();
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TopLayoutDislike2.this.mIsSoundMute = !r3.mIsSoundMute;
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(TopLayoutDislike2.this.mSkipIV != null ? TopLayoutDislike2.this.mIsSoundMute ? vpp.lh(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : vpp.lh(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute") : TopLayoutDislike2.this.mIsSoundMute ? cf.ouw(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : cf.ouw(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper"));
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        Object tag = TopLayoutDislike2.this.mImgSound.getTag(TopLayoutDislike2.this.mImgSound.getId());
                        TopLayoutDislike2.this.mTopListener.ouw(tag instanceof String ? tag.toString() : "nativeClick");
                    }
                    TopLayoutDislike2.this.mImgSound.setTag(TopLayoutDislike2.this.mImgSound.getId(), null);
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ouw();
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.ouw();
                        }
                    }
                });
            }
        }
        yu yuVar = this.mCloseBtn;
        if (yuVar != null) {
            yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.lh();
                    }
                }
            });
        }
        fkw fkwVar = this.mPlayableNextAd;
        if (fkwVar != null) {
            fkwVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.yu();
                    }
                }
            });
        }
    }

    private void initProgressBar(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        ex exVar;
        ex.vt vtVar;
        if (vppVar == null || (ouwVar = vppVar.vm) == null || (exVar = ouwVar.f8252le) == null || exVar == null || (vtVar = exVar.rn) == null || vtVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(vtVar.vt)) {
            this.mProgressColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw(vtVar.vt, -16777216);
        }
        if (!TextUtils.isEmpty(vtVar.f8225lh)) {
            this.mProgressBgColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw(vtVar.f8225lh, -16777216);
        }
        if (vtVar.yu <= 0.0f) {
            this.mProgressSize = osn.ouw(getContext(), 1.0f);
        } else {
            this.mProgressSize = osn.ouw(getContext(), vtVar.yu);
        }
        if (vtVar.fkw > 0.0f) {
            this.mProgressRadiusSize = osn.ouw(getContext(), vtVar.fkw);
        }
        this.mProgressType = vtVar.ouw;
    }

    private void initView(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        fkw fkwVar = new fkw(getContext());
        this.container = fkwVar;
        fkwVar.setOrientation(0);
        int iOuw = osn.ouw(getContext(), 16.0f);
        int iOuw2 = osn.ouw(getContext(), 12.0f);
        int iOuw3 = osn.ouw(getContext(), 24.0f);
        int iOuw4 = osn.ouw(getContext(), 28.0f);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams.topMargin = iOuw3;
        layoutParams.leftMargin = iOuw;
        this.mImgDislike.setLayoutParams(layoutParams);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams2.leftMargin = iOuw2;
        layoutParams2.topMargin = iOuw3;
        this.mImgSound.setId(rn.tpk);
        this.mImgSound.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        pno pnoVar = new pno(getContext());
        this.mTextViewCountDown = pnoVar;
        pnoVar.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.vt());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(getContext(), 28.0f));
        layoutParams4.topMargin = iOuw3;
        layoutParams4.rightMargin = iOuw;
        this.mTextViewCountDown.setPadding(iOuw2, 0, iOuw2, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        fkw fkwVar2 = new fkw(getContext());
        this.mPlayableNextAd = fkwVar2;
        fkwVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, iOuw4);
        layoutParams5.topMargin = iOuw3;
        if (vppVar == null || !vppVar.euf()) {
            layoutParams5.rightMargin = iOuw;
        } else {
            layoutParams5.rightMargin = osn.ouw(getContext(), 8.0f);
        }
        this.mPlayableNextAd.setLayoutParams(layoutParams5);
        this.mPlayableNextAd.setBackground(com.bytedance.sdk.openadsdk.core.widget.yu.vt());
        this.mPlayableNextAd.setVisibility(8);
        this.mNextAdTextTv = new pno(getContext());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, osn.ouw(getContext(), 28.0f));
        layoutParams6.gravity = 16;
        this.mNextAdTextTv.setLayoutParams(layoutParams6);
        this.mNextAdTextTv.setPadding(iOuw2, 0, 0, 0);
        String strJg = od.jg(vppVar);
        if (TextUtils.isEmpty(strJg)) {
            this.mNextAdTextTv.setText(vpp.vt(getContext(), "tt_multiple_playable_next_ad_tips"));
        } else {
            this.mNextAdTextTv.setText(strJg);
        }
        this.mNextAdTextTv.setGravity(17);
        this.mNextAdTextTv.setTextColor(-1);
        this.mNextAdTextTv.setTextSize(14.0f);
        yu yuVar = new yu(getContext());
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iOuw2, iOuw2);
        layoutParams7.rightMargin = iOuw2;
        yuVar.setScaleType(ImageView.ScaleType.CENTER);
        layoutParams7.gravity = 16;
        yuVar.setLayoutParams(layoutParams7);
        yuVar.setImageResource(vpp.yu(zih.ouw(), "tt_ad_arrow_right"));
        this.mPlayableNextAd.addView(this.mNextAdTextTv);
        this.mPlayableNextAd.addView(yuVar);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams8.topMargin = iOuw3;
        layoutParams8.rightMargin = iOuw;
        this.mSkipIV.setLayoutParams(layoutParams8);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        yu yuVarVt = le.vt(getContext());
        this.mCloseBtn = yuVarVt;
        yuVarVt.setId(520093708);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams9.gravity = 8388661;
        layoutParams9.topMargin = iOuw3;
        layoutParams9.rightMargin = iOuw3;
        this.mCloseBtn.setLayoutParams(layoutParams9);
        this.mCloseBtn.setContentDescription(vpp.ouw(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        if (this.mProgressType == 1) {
            this.mProgressRing = new com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw(getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor("#66666666"));
            gradientDrawable.setCornerRadius(osn.ouw(getContext(), 14.0f));
            gradientDrawable.setShape(0);
            this.mProgressRing.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
            layoutParams10.topMargin = iOuw3;
            layoutParams10.rightMargin = iOuw;
            this.mProgressRing.setLayoutParams(layoutParams10);
            com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar = this.mProgressRing;
            ouwVar.vt = "ring";
            ouwVar.ouw(this.mProgressSize).ouw(this.mProgressColor).vt(this.mProgressBgColor).ouw = this.mProgressRadiusSize;
            this.mProgressRing.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(getContext());
        lhVar.addView(this.mSkipIV);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar2 = this.mProgressRing;
        if (ouwVar2 != null) {
            lhVar.addView(ouwVar2);
        }
        if (this.mProgressType == 2) {
            this.mProgressBar = new com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw(getContext());
            this.mProgressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar3 = this.mProgressBar;
            ouwVar3.vt = "line";
            ouwVar3.ouw(this.mProgressSize).ouw(this.mProgressColor).vt(this.mProgressBgColor).ouw = this.mProgressRadiusSize;
            this.mProgressBar.setVisibility(8);
        }
        this.container.addView(this.mImgDislike);
        this.container.addView(this.mImgSound);
        this.container.addView(view);
        if (this.mProgressRing == null) {
            this.container.addView(this.mPlayableNextAd);
        } else {
            lhVar.addView(this.mPlayableNextAd);
        }
        this.container.addView(this.mTextViewCountDown);
        this.container.addView(lhVar);
        this.container.addView(this.mCloseBtn);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar4 = this.mProgressBar;
        if (ouwVar4 != null) {
            addView(ouwVar4);
        }
        addView(this.container);
    }

    private void updateTime(boolean z3) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z3) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
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

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void clickSound(String str) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setTag(imageView.getId(), str);
            this.mImgSound.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    public void hideCountDownText() {
        this.mTextViewCountDown.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setCountDownFor1InN(CharSequence charSequence, int i4) {
        int i10 = this.mProgressType;
        if (i10 == 1) {
            this.mTextViewCountDown.setVisibility(8);
            if (i4 < 0) {
                this.mProgressRing.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            }
            this.mProgressRing.setVisibility(0);
            this.mProgressRing.setAnimationDuration(1000);
            this.mProgressRing.setProgress(i4);
            this.mProgressRing.setClickable(false);
            this.mProgressRing.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
            ImageView imageView = this.mSkipIV;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (i10 == 2) {
            this.mTextViewCountDown.setVisibility(8);
            if (i4 < 0) {
                this.mProgressBar.setVisibility(8);
                this.mSkipIV.setVisibility(8);
                return;
            } else {
                this.mProgressBar.setVisibility(0);
                this.mProgressBar.setAnimationDuration(1000);
                this.mProgressBar.setProgress(i4);
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

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setListener(vt vtVar) {
        this.mTopListener = vtVar;
    }

    public void setShouldShowSkipTime(boolean z3) {
        this.shouldShowSkipTime = z3;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowDislike(boolean z3) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z3 ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowEndCardNextAd(boolean z3, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        tc tcVar;
        fkw fkwVar = this.mPlayableNextAd;
        if (fkwVar != null) {
            fkwVar.setVisibility(z3 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z3 || vppVar == null || (tcVar = vppVar.ccd) == null) {
                return;
            }
            String str = tcVar.yu;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mNextAdTextTv.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowPlayableNextAd(boolean z3, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        fkw fkwVar = this.mPlayableNextAd;
        if (fkwVar != null) {
            fkwVar.setVisibility(z3 ? 0 : 8);
            if (this.mNextAdTextTv == null || !z3) {
                return;
            }
            String strJg = od.jg(vppVar);
            if (TextUtils.isEmpty(strJg)) {
                this.mNextAdTextTv.setText(vpp.vt(getContext(), "tt_multiple_playable_next_ad_tips"));
            } else {
                this.mNextAdTextTv.setText(strJg);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowSkip(boolean z3) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z3) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z3;
        this.mSkipIV.setVisibility((z3 && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z3 & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setShowSound(boolean z3) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSkipEnable(boolean z3) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z3);
            this.mSkipIV.setClickable(z3);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z3);
            this.mTextViewCountDown.setClickable(z3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
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

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void setSoundMute(boolean z3) {
        this.mIsSoundMute = z3;
        this.mImgSound.setImageDrawable(this.mSkipIV != null ? z3 ? vpp.lh(getContext(), "tt_reward_full_mute") : vpp.lh(getContext(), "tt_reward_full_unmute") : z3 ? cf.ouw(getContext(), "tt_mute_wrapper") : cf.ouw(getContext(), "tt_unmute_wrapper"));
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
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
            int i4 = this.skipTime;
            int i10 = i4 == 0 ? Integer.parseInt(str) : i4 - (this.videoDuration - Integer.parseInt(str));
            if (i10 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + "s");
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i10 + "s");
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar = this.mProgressRing;
        if (ouwVar != null) {
            ouwVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar2 = this.mProgressBar;
        if (ouwVar2 != null) {
            ouwVar2.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.ouw
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar = this.mProgressRing;
        if (ouwVar != null) {
            ouwVar.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.cf.vt.lh.ouw ouwVar2 = this.mProgressBar;
        if (ouwVar2 != null) {
            ouwVar2.setVisibility(8);
        }
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2 load(com.bytedance.sdk.openadsdk.core.model.vpp r7) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.load(com.bytedance.sdk.openadsdk.core.model.vpp):com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2");
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mProgressStr = "";
        this.mProgressColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw("#FFD813", -16777216);
        this.mProgressBgColor = com.bytedance.adsdk.ugeno.ra.ouw.ouw("rgba(0, 0, 0, 0.5)", -16777216);
        setOrientation(1);
    }

    public void clickDislike() {
    }
}
