package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;

/* loaded from: classes3.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f13922a;

    /* renamed from: b, reason: collision with root package name */
    private int f13923b;

    /* renamed from: c, reason: collision with root package name */
    private int f13924c;

    /* renamed from: d, reason: collision with root package name */
    private int f13925d;

    /* renamed from: e, reason: collision with root package name */
    private LinearGradient f13926e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13927a;

        /* renamed from: b, reason: collision with root package name */
        public int f13928b;

        /* renamed from: c, reason: collision with root package name */
        public int f13929c;

        /* renamed from: d, reason: collision with root package name */
        public int f13930d = 40;

        /* renamed from: e, reason: collision with root package name */
        public float f13931e = 3.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f13932f = 1.5f;

        /* renamed from: g, reason: collision with root package name */
        public float f13933g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f13922a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f13923b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f13924c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f13925d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f13925d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f13926e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f13922a, this.f13923b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f13924c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f13926e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f13922a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f13923b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f13924c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f13925d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f13922a = aVar.f13927a;
            this.f13923b = aVar.f13928b;
            this.f13924c = aVar.f13929c;
            this.f13925d = aVar.f13930d;
            this.mShadowRadius = aVar.f13931e;
            this.mShadowDx = aVar.f13932f;
            this.mShadowDy = aVar.f13933g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13922a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f13923b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f13924c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f13925d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13922a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f13923b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f13924c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f13925d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13922a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f13923b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f13924c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f13925d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
