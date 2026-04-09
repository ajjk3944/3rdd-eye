package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.rie;
import com.bytedance.sdk.component.zz.ycc;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.utils.vw;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.ycc.xq {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.emc.emc adContext;
    private PAGLogoView adLogo;
    private aa ivIcon;
    private boolean mInit;
    private vk rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.ycc.msw tvDesc;
    private com.bytedance.sdk.openadsdk.core.ycc.msw tvDownload;
    private TextView tvTitle;

    public static final class emc extends Drawable {
        Path emc = new Path();
        private final int xq;
        private final Drawable ypw;

        public emc(Context context) {
            this.ypw = rie.xq(context, "tt_ad_bg_header_gradient");
            this.xq = vw.ypw(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.emc);
            canvas.drawColor(-1);
            this.ypw.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i3, int i6, int i7) {
            super.setBounds(i, i3, i6, i7);
            float f2 = i6;
            this.ypw.setBounds(i, i3, i6, (int) (((1.0f * f2) / this.ypw.getIntrinsicWidth()) * this.ypw.getIntrinsicHeight()));
            this.emc.reset();
            Path path = this.emc;
            RectF rectF = new RectF(0.0f, 0.0f, f2, i7);
            int i8 = this.xq;
            path.addRoundRect(rectF, i8, i8, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.vk.se);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.ycc.msw mswVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (mswVar == null) {
            return;
        }
        String strVyk = rieVar.vyk();
        if (TextUtils.isEmpty(strVyk)) {
            return;
        }
        mswVar.setText(strVyk);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.ycc.dg dgVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar) {
        if (dgVar == null || rieVar.ya() == null || TextUtils.isEmpty(rieVar.ya().emc())) {
            return;
        }
        com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(rieVar.ya(), dgVar, rieVar);
    }

    private void bindTitleData(TextView textView, com.bytedance.sdk.openadsdk.core.model.rie rieVar, String str) {
        if (textView != null) {
            if (rieVar.mjd() == null || TextUtils.isEmpty(rieVar.mjd().ypw())) {
                textView.setText(str);
            } else {
                textView.setText(rieVar.mjd().ypw());
            }
        }
    }

    private void initData(com.bytedance.sdk.openadsdk.core.model.rie rieVar, com.bytedance.sdk.openadsdk.core.ycc.msw mswVar) {
        setDownloadButtonData(mswVar, rieVar, -1);
        bindIconData(this.ivIcon, rieVar);
        vk vkVar = this.rbScore;
        if (vkVar != null) {
            vw.emc((TextView) null, vkVar, rieVar);
            if (rieVar.mjd() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (rieVar.mjd() != null && !TextUtils.isEmpty(rieVar.mjd().ypw())) {
                this.tvTitle.setText(rieVar.mjd().ypw());
            } else if (TextUtils.isEmpty(rieVar.hs())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(rieVar.hs());
            }
        }
        if (this.tvDesc != null) {
            String strXou = rieVar.xou();
            if (TextUtils.isEmpty(strXou)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strXou);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.emc(RFEndCardBackUpLayout.this.adContext.mxo, RFEndCardBackUpLayout.this.adContext.ypw, RFEndCardBackUpLayout.this.adContext.bw);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(vw.ypw(context, 16.0f), 0, vw.ypw(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(bwVar, layoutParams);
        if (this.adContext.rqm == 2) {
            com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
            bwVar2.setOrientation(0);
            bwVar.addView(bwVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(bwVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(bwVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(bwVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.adContext;
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(emcVar.mxo, emcVar.ypw);
        viewCreatePAGLogoViewByMaterial.setId(520093757);
        bwVar.addView(viewCreatePAGLogoViewByMaterial);
        viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.emc(RFEndCardBackUpLayout.this.adContext.mxo, RFEndCardBackUpLayout.this.adContext.ypw, RFEndCardBackUpLayout.this.adContext.bw);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.adContext.ypw;
        if (rieVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = rieVar.dg().dg();
            for (int i = 0; i < listDg.size() && i < 3; i++) {
                initSingleCardInThreeCardStyle(bwVar, listDg.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.adContext.ypw;
        if (rieVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = rieVar.dg().dg();
            for (int i = 0; i < listDg.size() && i < 2; i++) {
                initSingleCardInTwoCardStyle(bwVar, listDg.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar, int i) {
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.adContext.ypw;
        if (rieVar != null) {
            List<com.bytedance.sdk.openadsdk.core.model.rie> listDg = rieVar.dg().dg();
            for (int i3 = 0; i3 < listDg.size() && i3 < i && i3 < 3; i3++) {
                initSingleCardInTwoCardStyleLandscape(bwVar, listDg.get(i3), i3, i);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setOrientation(1);
        bwVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? vw.ypw(context, 12.0f) : 0, 0, 0);
        bwVar2.setBackground(new emc(context));
        bwVar.addView(bwVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar3.setOrientation(0);
        bwVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = vw.ypw(context, 20.0f);
        layoutParams2.leftMargin = vw.ypw(context, 17.0f);
        layoutParams2.rightMargin = vw.ypw(context, 30.0f);
        bwVar2.addView(bwVar3, layoutParams2);
        aa aaVar = new aa(context);
        bwVar3.addView(aaVar, new FrameLayout.LayoutParams(vw.ypw(context, 70.0f), vw.ypw(context, 63.0f)));
        bindIconData(aaVar, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar4 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = vw.ypw(context, 7.0f);
        bwVar3.addView(bwVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        mswVar.setTextSize(18.0f);
        mswVar.setTextColor(Color.parseColor("#161823"));
        mswVar.setGravity(8388611);
        mswVar.setTypeface(null, 1);
        bwVar4.addView(mswVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(mswVar, rieVar, rieVar.hs());
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar2.setSingleLine(true);
        mswVar2.setEllipsize(truncateAt);
        mswVar2.setTextSize(16.0f);
        mswVar2.setTextColor(Color.parseColor("#80161823"));
        bwVar4.addView(mswVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(mswVar2, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar5 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar5.setOrientation(0);
        bwVar5.setGravity(16);
        bwVar4.addView(bwVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar3.setTextSize(16.0f);
        mswVar3.setTextColor(Color.parseColor("#80161823"));
        bwVar5.addView(mswVar3, new ViewGroup.LayoutParams(-2, -2));
        vk vkVar = new vk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = vw.ypw(context, 8.0f);
        bwVar5.addView(vkVar, layoutParams4);
        vw.emc(mswVar3, vkVar, rieVar, 18);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar4.setGravity(17);
        mswVar4.setId(520093707);
        mswVar4.setText(rie.emc(context, "tt_video_download_apk"));
        mswVar4.setTextColor(-1);
        mswVar4.setTextSize(2, 16.0f);
        mswVar4.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, vw.ypw(context, 36.0f));
        layoutParams5.setMargins(vw.ypw(context, 20.0f), vw.ypw(context, 22.0f), vw.ypw(context, 20.0f), vw.ypw(context, 20.0f));
        bwVar2.addView(mswVar4, layoutParams5);
        setDownloadButtonData(mswVar4, rieVar, i);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setOrientation(1);
        bwVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? vw.ypw(context, 12.0f) : 0, 0, 0);
        bwVar2.setBackground(new emc(context));
        bwVar.addView(bwVar2, layoutParams);
        aa aaVar = new aa(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(vw.ypw(context, 70.0f), vw.ypw(context, 63.0f));
        layoutParams2.setMargins(0, vw.ypw(context, 24.0f), 0, vw.ypw(context, 12.0f));
        bwVar2.addView(aaVar, layoutParams2);
        bindIconData(aaVar, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        mswVar.setTextSize(18.0f);
        mswVar.setTextColor(Color.parseColor("#161823"));
        mswVar.setGravity(17);
        mswVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(vw.ypw(context, 56.0f), 0, vw.ypw(context, 56.0f), 0);
        bwVar2.addView(mswVar, layoutParams3);
        bindTitleData(mswVar, rieVar, rieVar.hs());
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar2.setSingleLine(true);
        mswVar2.setEllipsize(truncateAt);
        mswVar2.setTextSize(16.0f);
        mswVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(vw.ypw(context, 56.0f), vw.ypw(context, 4.0f), vw.ypw(context, 56.0f), 0);
        bwVar2.addView(mswVar2, layoutParams4);
        bindDescData(mswVar2, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar3.setOrientation(0);
        bwVar3.setGravity(16);
        bwVar2.addView(bwVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar3.setTextSize(16.0f);
        mswVar3.setTextColor(Color.parseColor("#80161823"));
        bwVar3.addView(mswVar3, new ViewGroup.LayoutParams(-2, -2));
        vk vkVar = new vk(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = vw.ypw(context, 8.0f);
        bwVar3.addView(vkVar, layoutParams5);
        vw.emc(mswVar3, vkVar, rieVar, 18);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar4.setGravity(17);
        mswVar4.setId(520093707);
        mswVar4.setText(rie.emc(context, "tt_video_download_apk"));
        mswVar4.setTextColor(-1);
        mswVar4.setTextSize(2, 16.0f);
        mswVar4.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, vw.ypw(context, 36.0f));
        layoutParams6.setMargins(vw.ypw(context, 20.0f), vw.ypw(context, 36.0f), vw.ypw(context, 20.0f), vw.ypw(context, 20.0f));
        bwVar2.addView(mswVar4, layoutParams6);
        setDownloadButtonData(mswVar4, rieVar, i);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.ycc.bw bwVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i, int i3) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar2.setOrientation(1);
        bwVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(vw.ypw(context, 12.0f), 0, 0, 0);
        }
        bwVar2.setBackground(new emc(context));
        bwVar.addView(bwVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar3.setOrientation(0);
        bwVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = vw.ypw(context, 20.0f);
        layoutParams2.leftMargin = vw.ypw(context, 17.0f);
        layoutParams2.rightMargin = vw.ypw(context, 30.0f);
        bwVar2.addView(bwVar3, layoutParams2);
        aa aaVar = new aa(context);
        bwVar3.addView(aaVar, new FrameLayout.LayoutParams(vw.ypw(context, 44.0f), vw.ypw(context, 44.0f)));
        bindIconData(aaVar, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar4 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = vw.ypw(context, 7.0f);
        bwVar3.addView(bwVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        mswVar.setTextSize(18.0f);
        mswVar.setTextColor(Color.parseColor("#161823"));
        mswVar.setGravity(8388611);
        mswVar.setTypeface(null, 1);
        bwVar4.addView(mswVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(mswVar, rieVar, rieVar.hs());
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar5 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar5.setOrientation(0);
        bwVar5.setGravity(16);
        bwVar4.addView(bwVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar2.setTextSize(16.0f);
        mswVar2.setTextColor(Color.parseColor("#80161823"));
        bwVar5.addView(mswVar2, new ViewGroup.LayoutParams(-2, -2));
        vk vkVar = new vk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = vw.ypw(context, 8.0f);
        bwVar5.addView(vkVar, layoutParams4);
        vw.emc(mswVar2, vkVar, rieVar, 18);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        if (i3 == 2) {
            mswVar3.setSingleLine(true);
        } else {
            mswVar3.setLines(2);
        }
        mswVar3.setEllipsize(truncateAt);
        mswVar3.setTextSize(16.0f);
        mswVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i6 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i6;
        layoutParams5.leftMargin = i6;
        layoutParams5.topMargin = vw.ypw(context, 12.0f);
        bwVar2.addView(mswVar3, layoutParams5);
        bindDescData(mswVar3, rieVar);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        mswVar4.setGravity(17);
        mswVar4.setId(520093707);
        mswVar4.setText(rie.emc(context, "tt_video_download_apk"));
        mswVar4.setTextColor(-1);
        mswVar4.setTextSize(2, 16.0f);
        mswVar4.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, vw.ypw(context, 36.0f));
        layoutParams6.setMargins(vw.ypw(context, 20.0f), vw.ypw(context, 22.0f), vw.ypw(context, 20.0f), vw.ypw(context, 20.0f));
        bwVar2.addView(mswVar4, layoutParams6);
        setDownloadButtonData(mswVar4, rieVar, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        com.bytedance.sdk.openadsdk.activity.msw mswVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        if (this.adContext.ypw.wpn() && (mswVar = this.adContext.pe) != null && mswVar.tp() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.rie rieVar = this.adContext.ypw;
        if (rieVar.ak()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(rieVar, this.tvDownload);
        }
    }

    private void initViewsDefault() {
        Context context = getContext();
        boolean z6 = this.adContext.ypw.ono() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setGravity(1);
        bwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z6 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(vw.ypw(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iYpw = vw.ypw(context, 24.0f);
        layoutParams.rightMargin = iYpw;
        layoutParams.leftMargin = iYpw;
        addView(bwVar, layoutParams);
        aa aaVar = new aa(context);
        this.ivIcon = aaVar;
        aaVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(vw.ypw(context, 80.0f), vw.ypw(context, 80.0f));
        layoutParams2.bottomMargin = vw.ypw(context, 12.0f);
        bwVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.tvTitle = mswVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(vw.ypw(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        bwVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.tvDesc = mswVar2;
        mswVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = vw.ypw(context, 8.0f);
        bwVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new vk(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, vw.ypw(context, 16.0f));
        layoutParams4.topMargin = vw.ypw(context, 12.0f);
        this.rbScore.setVisibility(8);
        bwVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.tvDownload = mswVar3;
        mswVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(rie.emc(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.gbl.emc(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, vw.ypw(context, 44.0f));
        layoutParams5.topMargin = vw.ypw(context, 54.0f);
        bwVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, this.adContext.ypw);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, vw.ypw(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = vw.ypw(context, 18.0f);
        if (z6) {
            layoutParams6.bottomMargin = vw.ypw(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = vw.ypw(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        dgVar.setId(com.bytedance.sdk.openadsdk.utils.vk.ru);
        dgVar.setVisibility(8);
        addView(dgVar, new FrameLayout.LayoutParams(-1, -1));
        View yccVar = new com.bytedance.sdk.component.zz.ycc(context, true, ycc.xq.VAST_ENDCARD);
        yccVar.setVisibility(8);
        yccVar.setId(com.bytedance.sdk.openadsdk.utils.vk.gbl);
        addView(yccVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.ycc.msw mswVar, com.bytedance.sdk.openadsdk.core.model.rie rieVar, int i) {
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.xq.bw bwVarEmc = emcVar.db.emc(emcVar, rieVar);
        com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar2 = this.adContext;
        bwVarEmc.emc(com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(emcVar2.mxo, emcVar2.bw));
        if (i != -1) {
            HashMap map = new HashMap();
            int i3 = i + 1;
            map.put("ad_show_order", Integer.valueOf(i3));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i3);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            bwVarEmc.emc(map);
        }
        mswVar.setOnClickListener(bwVarEmc);
        mswVar.setOnTouchListener(bwVarEmc);
        CharSequence charSequenceXxo = rieVar.xxo();
        if (TextUtils.isEmpty(charSequenceXxo)) {
            return;
        }
        mswVar.setText(charSequenceXxo);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.emc.emc emcVar) {
        this.adContext = emcVar;
        if (emcVar.ypw.ak()) {
            initViews();
        }
    }

    public void setShownAdCount(int i) {
        this.shownAdCount = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            initViews();
        }
    }
}
