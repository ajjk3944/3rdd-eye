package com.bytedance.sdk.openadsdk.component.bly;

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
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rn;
import com.bytedance.sdk.openadsdk.core.widget.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class yu extends lh {

    /* renamed from: jg, reason: collision with root package name */
    private final rn f7870jg;
    private final com.bytedance.sdk.openadsdk.core.le.pno ko;
    private final com.bytedance.sdk.openadsdk.core.le.lh mwh;
    private final com.bytedance.sdk.openadsdk.core.le.yu rn;
    private final com.bytedance.sdk.openadsdk.core.le.fkw zih;

    public yu(Context context, vpp vppVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iOuw = osn.ouw(context, 8.0f);
        int iOuw2 = osn.ouw(context, 9.0f);
        int iOuw3 = osn.ouw(context, 10.0f);
        int iOuw4 = osn.ouw(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.lh lhVar = new com.bytedance.sdk.openadsdk.core.widget.lh(context);
        this.ryl = lhVar;
        lhVar.setPadding(iOuw2, 0, iOuw2, 0);
        this.ryl.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(osn.ouw(context, 32.0f), osn.ouw(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iOuw3, iOuw3);
        this.ryl.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar2 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        this.mwh = lhVar2;
        lhVar2.setBackgroundColor(-1);
        lhVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, osn.ouw(context, 107.0f));
        layoutParams2.addRule(12);
        lhVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setOrientation(0);
        fkwVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        fkwVar.setLayoutParams(layoutParams3);
        lhVar2.addView(fkwVar);
        zih zihVar = new zih(context);
        this.f7863le = zihVar;
        zihVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iOuw4, iOuw4);
        layoutParams4.rightMargin = iOuw;
        layoutParams4.setMarginEnd(iOuw);
        this.f7863le.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.ra = pnoVar;
        pnoVar.setId(520093761);
        this.ra.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = this.ra;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        pnoVar2.setEllipsize(truncateAt);
        this.ra.setMaxLines(2);
        this.ra.setTextColor(Color.parseColor("#161823"));
        this.ra.setTextSize(30.0f);
        fkwVar.addView(this.f7863le);
        fkwVar.addView(this.ra);
        com.bytedance.sdk.openadsdk.core.le.lh lhVar3 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, lhVar2.getId());
        layoutParams5.addRule(10);
        lhVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.ouw = yuVar;
        yuVar.setId(520093754);
        this.ouw.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lhVar3.addView(this.ouw, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.lh lhVar4 = new com.bytedance.sdk.openadsdk.core.le.lh(context);
        this.vt = lhVar4;
        lhVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        lhVar3.addView(this.vt, layoutParams6);
        com.bytedance.sdk.openadsdk.core.le.yu yuVar2 = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        this.f7864lh = yuVar2;
        yuVar2.setId(520093756);
        lhVar3.addView(this.f7864lh, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar3 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.fkw = pnoVar3;
        pnoVar3.setId(520093717);
        this.fkw.setBackground(cf.ouw(context, Color.parseColor("#b3000000"), 24));
        this.fkw.setEllipsize(truncateAt);
        this.fkw.setGravity(17);
        this.fkw.setSingleLine(true);
        this.fkw.setText(com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_video_download_apk"));
        this.fkw.setTextColor(-1);
        this.fkw.setTextSize(1, 16.0f);
        this.fkw.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(osn.ouw(context, 236.0f), osn.ouw(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = osn.ouw(context, 32.0f);
        lhVar3.addView(this.fkw, layoutParams7);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        this.zih = fkwVar2;
        fkwVar2.setOrientation(0);
        fkwVar2.setGravity(16);
        fkwVar2.setBackground(new ouw(context));
        fkwVar2.setPadding(osn.ouw(context, 16.0f), osn.ouw(context, 8.0f), osn.ouw(context, 16.0f), osn.ouw(context, 8.0f));
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(10);
        layoutParams8.topMargin = osn.ouw(context, 90.0f);
        fkwVar2.setLayoutParams(layoutParams8);
        zih zihVar2 = new zih(context);
        this.rn = zihVar2;
        fkwVar2.addView(zihVar2, new LinearLayout.LayoutParams(osn.ouw(context, 36.0f), osn.ouw(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams9.leftMargin = osn.ouw(context, 8.0f);
        fkwVar2.addView(fkwVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar4 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.ko = pnoVar4;
        pnoVar4.setTextColor(-1);
        fkwVar3.addView(pnoVar4, new LinearLayout.LayoutParams(-2, -2));
        rn rnVar = new rn(context, true);
        this.f7870jg = rnVar;
        fkwVar3.addView(rnVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, vppVar);
        this.yu = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams10.gravity = 83;
        lhVar3.addView(this.yu, layoutParams10);
        addView(lhVar3);
        addView(this.ryl);
        addView(lhVar2);
        addView(this.pno);
        addView(fkwVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.yu getAdIconView() {
        return this.rn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.pno getAdTitleTextView() {
        return this.ko;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final com.bytedance.sdk.openadsdk.core.le.fkw getOverlayLayout() {
        return this.zih;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final rn getScoreBar() {
        return this.f7870jg;
    }

    @Override // com.bytedance.sdk.openadsdk.component.bly.lh
    public final View getUserInfo() {
        return this.mwh;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw extends Drawable {
        private static final int fkw = Color.parseColor("#b0000000");

        /* renamed from: le, reason: collision with root package name */
        private static final int f7871le = Color.parseColor("#40000000");
        private final boolean yu;
        private final RectF ouw = new RectF();
        private final Paint vt = new Paint();

        /* renamed from: lh, reason: collision with root package name */
        private final Path f7872lh = new Path();

        public ouw(Context context) {
            this.yu = com.bytedance.sdk.component.adexpress.yu.vt.ouw(context);
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            canvas.drawPath(this.f7872lh, this.vt);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public final void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.ouw.set(rect);
            this.f7872lh.reset();
            int iHeight = rect.height() / 2;
            Path path = this.f7872lh;
            RectF rectF = this.ouw;
            if (this.yu) {
                float f10 = iHeight;
                fArr = new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10};
            } else {
                float f11 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f11, f11, f11, f11, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f12 = rect.right;
            boolean z3 = this.yu;
            this.vt.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{z3 ? f7871le : fkw, z3 ? fkw : f7871le}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i4) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
