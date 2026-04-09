package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.ycc.dg mAdLogo;
    private com.bytedance.sdk.openadsdk.core.ycc.msw mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, rie rieVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(rieVar);
        return pAGLogoView;
    }

    private void initView(Context context) {
        int iYpw = vw.ypw(context, 2.0f);
        this.containerHeight = vw.ypw(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(vw.ypw(context, 14.0f), vw.ypw(context, 6.0f));
        layoutParams.leftMargin = iYpw;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = iYpw;
        layoutParams2.rightMargin = iYpw;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(iYpw);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public void initData(rie rieVar) {
        if (rieVar == null) {
            return;
        }
        initData(rieVar.pvi());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.ycc.zz.emc(this, layoutParams));
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.ypw ypwVar) {
        if (ypwVar == null) {
            return;
        }
        if (ypwVar.bw()) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(com.bytedance.sdk.openadsdk.core.aa.emc(), "tt_ad_logo"));
        } else {
            String strEmc = ypwVar.emc();
            if (TextUtils.isEmpty(strEmc)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (strEmc.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(com.bytedance.sdk.openadsdk.core.aa.emc(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.ru.dg.emc(strEmc).xq(1).emc(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String strYpw = ypwVar.ypw();
        if (ypwVar.bw()) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.rie.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(strYpw)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(strYpw);
            this.mAdText.setVisibility(0);
        }
    }

    public PAGLogoView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        initView(context);
    }

    @RequiresApi(api = 21)
    public PAGLogoView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        initView(context);
    }
}
