package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fvf extends le implements com.bytedance.sdk.component.adexpress.dynamic.fkw {
    TextView ouw;
    boolean qbp;
    FrameLayout vt;

    public fvf(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        super(context, dynamicRootView, pnoVar);
        this.qbp = false;
        View view = new View(context);
        this.ko = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.ouw = new TextView(context);
        this.vt = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.ouw.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.ouw.setBackground(gradientDrawable);
        this.ouw.setTextSize(10.0f);
        this.ouw.setGravity(17);
        this.ouw.setTextColor(-1);
        this.ouw.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            addView(this.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        addView(this.ouw);
        addView(this.ko, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
            addView(this.vt, getWidgetLayoutParams());
        }
        dynamicRootView.videoView = this.vt;
        dynamicRootView.setVideoListener(this);
    }

    private void vt(View view) {
        if (view == this.ouw || view == ((le) this).f7234th) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.ouw.f7274le)).intValue() == 1) {
                return;
            }
        } catch (Throwable unused) {
        }
        int i4 = 0;
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i4 >= viewGroup.getChildCount()) {
                return;
            }
            vt(viewGroup.getChildAt(i4));
            i4++;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw
    public final void ouw() {
        this.ouw.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.le, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bs
    public final boolean ra() {
        super.ra();
        double d10 = 0.0d;
        double d11 = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = this.mwh; pnoVar != null; pnoVar = pnoVar.f7303cf) {
            d11 = (d11 + pnoVar.vt) - pnoVar.yu;
            d10 = (d10 + pnoVar.f7306lh) - pnoVar.fkw;
        }
        try {
            float f10 = (float) d11;
            int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f10);
            int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f10 + this.fkw);
            if (com.bytedance.sdk.component.adexpress.yu.vt.ouw(getContext())) {
                int dynamicWidth = ((vm) this.f7230jg.getChildAt(0)).getDynamicWidth();
                int i4 = dynamicWidth - iOuw2;
                iOuw2 = dynamicWidth - iOuw;
                iOuw = i4;
            }
            if ("open_ad".equals(this.f7230jg.getRenderRequest().ouw)) {
                this.f7230jg.videoView = this.vt;
            } else {
                float f11 = (float) d10;
                ((vm) this.f7230jg.getChildAt(0)).ouw.ouw(iOuw, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f11), iOuw2, (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(getContext(), f11 + this.f7231le));
            }
        } catch (Exception unused) {
        }
        this.f7230jg.updateRenderInfoForVideo(d11, d10, this.fkw, this.f7231le, this.ryl.yu.ouw);
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fkw
    public final void setTimeUpdate(int i4) {
        if (!this.mwh.bly.f7280lh.f7297vi || i4 <= 0 || this.qbp) {
            this.qbp = true;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                vt(getChildAt(i10));
            }
            this.ouw.setVisibility(8);
            return;
        }
        String strS = h.s(i4 >= 60 ? "0" + (i4 / 60) : "00", ":");
        int i11 = i4 % 60;
        this.ouw.setText(i11 > 9 ? strS + i11 : strS + "0" + i11);
        this.ouw.setVisibility(0);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw
    public final boolean yu() {
        return true;
    }
}
