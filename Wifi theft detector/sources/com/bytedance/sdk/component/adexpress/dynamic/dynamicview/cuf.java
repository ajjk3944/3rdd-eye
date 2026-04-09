package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes.dex */
public class cuf extends ycc implements com.bytedance.sdk.component.adexpress.dynamic.bw {
    TextView emc;
    boolean ul;
    FrameLayout ypw;

    public cuf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVar) {
        super(context, dynamicRootView, mswVar);
        this.ul = false;
        View view = new View(context);
        this.cf = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.emc = new TextView(context);
        this.ypw = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.emc.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.emc.setBackground(gradientDrawable);
        this.emc.setTextSize(10.0f);
        this.emc.setGravity(17);
        this.emc.setTextColor(-1);
        this.emc.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            addView(this.ypw, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.emc);
        addView(this.cf, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.dg.ypw()) {
            addView(this.ypw, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.ypw;
        dynamicRootView.setVideoListener(this);
    }

    private void xq(View view) {
        if (view == this.emc || view == ((ycc) this).yzg) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.emc.ycc)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i10 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return;
            }
            xq(viewGroup.getChildAt(i10));
            i10++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw
    public boolean bw() {
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bw
    public void emc() {
        this.emc.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.bw
    public void setTimeUpdate(int i10) {
        if (!this.sz.ru().bw().gyw() || i10 <= 0 || this.ul) {
            this.ul = true;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                xq(getChildAt(i11));
            }
            this.emc.setVisibility(8);
            return;
        }
        String str = (i10 >= 60 ? "" + MBridgeConstans.ENDCARD_URL_TYPE_PL + (i10 / 60) : "00") + ":";
        int i12 = i10 % 60;
        this.emc.setText(i12 > 9 ? str + i12 : str + MBridgeConstans.ENDCARD_URL_TYPE_PL + i12);
        this.emc.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ycc, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rtt
    public boolean zz() {
        super.zz();
        double dUym = 0.0d;
        double dYcc = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.dg.msw mswVarSup = this.sz; mswVarSup != null; mswVarSup = mswVarSup.sup()) {
            dYcc = (dYcc + mswVarSup.ycc()) - mswVarSup.dg();
            dUym = (dUym + mswVarSup.uym()) - mswVarSup.bw();
        }
        try {
            float f10 = (float) dYcc;
            int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), f10);
            int iEmc2 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), f10 + this.bw);
            if (com.bytedance.sdk.component.adexpress.dg.ypw.emc(getContext())) {
                int dynamicWidth = ((sba) this.qh.getChildAt(0)).getDynamicWidth();
                int i10 = dynamicWidth - iEmc2;
                iEmc2 = dynamicWidth - iEmc;
                iEmc = i10;
            }
            if ("open_ad".equals(this.qh.getRenderRequest().dg())) {
                this.qh.videoView = this.ypw;
            } else {
                float f11 = (float) dUym;
                ((sba) this.qh.getChildAt(0)).emc.emc(iEmc, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), f11), iEmc2, (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(getContext(), f11 + this.ycc));
            }
        } catch (Exception unused) {
        }
        this.qh.updateRenderInfoForVideo(dYcc, dUym, this.bw, this.ycc, this.sup.cf());
        return true;
    }
}
