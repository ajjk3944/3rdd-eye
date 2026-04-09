package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.rie;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.aa;
import com.bytedance.sdk.openadsdk.core.widget.vk;
import com.bytedance.sdk.openadsdk.utils.gbl;
import com.bytedance.sdk.openadsdk.utils.vw;

/* loaded from: classes.dex */
public class dg extends xq {
    private final com.bytedance.sdk.openadsdk.core.ycc.bw aa;
    private final com.bytedance.sdk.openadsdk.core.ycc.msw cf;
    private final vk qh;
    private final com.bytedance.sdk.openadsdk.core.ycc.xq sz;
    private final com.bytedance.sdk.openadsdk.core.ycc.dg vk;

    public static final class emc extends Drawable {
        private static final int bw = Color.parseColor("#b0000000");
        private static final int ycc = Color.parseColor("#40000000");
        private final boolean dg;
        private final RectF emc = new RectF();
        private final Paint ypw = new Paint();
        private final Path xq = new Path();

        public emc(Context context) {
            this.dg = com.bytedance.sdk.component.adexpress.dg.ypw.emc(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.xq, this.ypw);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.emc.set(rect);
            this.xq.reset();
            int iHeight = rect.height() / 2;
            Path path = this.xq;
            RectF rectF = this.emc;
            if (this.dg) {
                float f2 = iHeight;
                fArr = new float[]{f2, f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, f2};
            } else {
                float f5 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f5, f5, f5, f5, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f6 = rect.right;
            boolean z6 = this.dg;
            this.ypw.setShader(new LinearGradient(0.0f, 0.0f, f6, 0.0f, new int[]{z6 ? ycc : bw, z6 ? bw : ycc}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public dg(Context context, rie rieVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iYpw = vw.ypw(context, 8.0f);
        int iYpw2 = vw.ypw(context, 9.0f);
        int iYpw3 = vw.ypw(context, 10.0f);
        int iYpw4 = vw.ypw(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.xq xqVar = new com.bytedance.sdk.openadsdk.core.widget.xq(context);
        this.sup = xqVar;
        xqVar.setPadding(iYpw2, 0, iYpw2, 0);
        this.sup.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(vw.ypw(context, 32.0f), vw.ypw(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iYpw3, iYpw3);
        this.sup.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar2 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        this.sz = xqVar2;
        xqVar2.setBackgroundColor(-1);
        xqVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, vw.ypw(context, 107.0f));
        layoutParams2.addRule(12);
        xqVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar.setOrientation(0);
        bwVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        bwVar.setLayoutParams(layoutParams3);
        xqVar2.addView(bwVar);
        aa aaVar = new aa(context);
        this.ycc = aaVar;
        aaVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iYpw4, iYpw4);
        layoutParams4.rightMargin = iYpw;
        layoutParams4.setMarginEnd(iYpw);
        this.ycc.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.uym = mswVar;
        mswVar.setId(520093761);
        this.uym.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar2 = this.uym;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        mswVar2.setEllipsize(truncateAt);
        this.uym.setMaxLines(2);
        this.uym.setTextColor(Color.parseColor("#161823"));
        this.uym.setTextSize(30.0f);
        bwVar.addView(this.ycc);
        bwVar.addView(this.uym);
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar3 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, xqVar2.getId());
        layoutParams5.addRule(10);
        xqVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        this.emc = dgVar;
        dgVar.setId(520093754);
        this.emc.setScaleType(ImageView.ScaleType.CENTER_CROP);
        xqVar3.addView(this.emc, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.xq xqVar4 = new com.bytedance.sdk.openadsdk.core.ycc.xq(context);
        this.ypw = xqVar4;
        xqVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        xqVar3.addView(this.ypw, layoutParams6);
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar2 = new com.bytedance.sdk.openadsdk.core.ycc.dg(context);
        this.xq = dgVar2;
        dgVar2.setId(520093756);
        xqVar3.addView(this.xq, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar3 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.bw = mswVar3;
        mswVar3.setId(520093717);
        this.bw.setBackground(gbl.emc(context, Color.parseColor("#b3000000"), 24));
        this.bw.setEllipsize(truncateAt);
        this.bw.setGravity(17);
        this.bw.setSingleLine(true);
        this.bw.setText(com.bytedance.sdk.component.utils.rie.emc(context, "tt_video_download_apk"));
        this.bw.setTextColor(-1);
        this.bw.setTextSize(1, 16.0f);
        this.bw.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(vw.ypw(context, 236.0f), vw.ypw(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = vw.ypw(context, 32.0f);
        xqVar3.addView(this.bw, layoutParams7);
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar2 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        this.aa = bwVar2;
        bwVar2.setOrientation(0);
        bwVar2.setGravity(16);
        bwVar2.setBackground(new emc(context));
        bwVar2.setPadding(vw.ypw(context, 16.0f), vw.ypw(context, 8.0f), vw.ypw(context, 16.0f), vw.ypw(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = vw.ypw(context, 90.0f);
        bwVar2.setLayoutParams(layoutParams8);
        aa aaVar2 = new aa(context);
        this.vk = aaVar2;
        bwVar2.addView(aaVar2, new LinearLayout.LayoutParams(vw.ypw(context, 36.0f), vw.ypw(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.ycc.bw bwVar3 = new com.bytedance.sdk.openadsdk.core.ycc.bw(context);
        bwVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = vw.ypw(context, 8.0f);
        bwVar2.addView(bwVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.ycc.msw mswVar4 = new com.bytedance.sdk.openadsdk.core.ycc.msw(context);
        this.cf = mswVar4;
        mswVar4.setTextColor(-1);
        bwVar3.addView(mswVar4, new LinearLayout.LayoutParams(-2, -2));
        vk vkVar = new vk(context, true);
        this.qh = vkVar;
        bwVar3.addView(vkVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, rieVar);
        this.dg = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, vw.ypw(context, 14.0f));
        layoutParams10.gravity = 83;
        xqVar3.addView(this.dg, layoutParams10);
        addView(xqVar3);
        addView(this.sup);
        addView(xqVar2);
        addView(this.msw);
        addView(bwVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.dg getAdIconView() {
        return this.vk;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.msw getAdTitleTextView() {
        return this.cf;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public com.bytedance.sdk.openadsdk.core.ycc.bw getOverlayLayout() {
        return this.aa;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public vk getScoreBar() {
        return this.qh;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.xq
    public View getUserInfo() {
        return this.sz;
    }
}
