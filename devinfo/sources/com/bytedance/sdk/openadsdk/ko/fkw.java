package com.bytedance.sdk.openadsdk.ko;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends tlj {
    private com.bytedance.sdk.openadsdk.core.le.pno pno;
    private com.bytedance.sdk.openadsdk.core.le.yu ra;

    public fkw(Context context) {
        this(context, null);
    }

    public final com.bytedance.sdk.openadsdk.core.le.pno getTtBuDescTV() {
        return this.pno;
    }

    public final com.bytedance.sdk.openadsdk.core.le.yu getTtBuImg() {
        return this.ra;
    }

    @Override // com.bytedance.sdk.openadsdk.ko.tlj
    public final void ouw(Context context) {
        int iOuw = osn.ouw(context, 6.0f);
        setPadding(iOuw, iOuw, iOuw, iOuw);
        com.bytedance.sdk.openadsdk.core.le.lh lhVarFkw = tlj.fkw(context);
        this.ouw = lhVarFkw;
        lhVarFkw.setId(rn.lgp);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int iOuw2 = osn.ouw(context, 26.0f);
        layoutParams.topMargin = iOuw2;
        this.ouw.setLayoutParams(layoutParams);
        addView(this.ouw);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.ra = yuVar;
        yuVar.setId(rn.eay);
        this.ra.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = iOuw2;
        this.ra.setLayoutParams(layoutParams2);
        addView(this.ra);
        View viewPno = tlj.pno(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int iOuw3 = osn.ouw(context, 10.0f);
        layoutParams3.leftMargin = iOuw3;
        layoutParams3.topMargin = iOuw3;
        layoutParams3.bottomMargin = iOuw3;
        viewPno.setLayoutParams(layoutParams3);
        addView(viewPno);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        fkwVar.setOrientation(0);
        fkwVar.setGravity(17);
        addView(fkwVar);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.pno = pnoVar;
        pnoVar.setId(rn.wbf);
        this.pno.setEllipsize(TextUtils.TruncateAt.END);
        this.pno.setMaxLines(1);
        this.pno.setTextColor(-1);
        this.pno.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.pno.setLayoutParams(layoutParams4);
        fkwVar.addView(this.pno);
    }

    private fkw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private fkw(Context context, AttributeSet attributeSet, byte b10) {
        super(context, attributeSet);
    }
}
