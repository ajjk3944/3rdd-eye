package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.du0;
import com.yandex.mobile.ads.impl.eu0;
import com.yandex.mobile.ads.impl.gu0;
import com.yandex.mobile.ads.impl.gy1;
import com.yandex.mobile.ads.impl.hu;
import com.yandex.mobile.ads.impl.yq;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class ExtendedViewContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final hu f23664a;

    /* renamed from: b, reason: collision with root package name */
    private gu0 f23665b;

    /* renamed from: c, reason: collision with root package name */
    private gu0 f23666c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(Context context) {
        this(context, null, 0, 6, null);
        l.f(context, "context");
    }

    private final yq a(float f10, float f11) {
        Context applicationContext = getContext().getApplicationContext();
        l.e(applicationContext, "getApplicationContext(...)");
        eu0 eu0Var = new eu0(this, f10, applicationContext, new gu0.a());
        Context applicationContext2 = getContext().getApplicationContext();
        l.e(applicationContext2, "getApplicationContext(...)");
        return new yq(eu0Var, new du0(this, f11, applicationContext2));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        this.f23664a.a(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        gu0.a aVarA = this.f23666c.a(i, i10);
        super.onMeasure(aVarA.f27985a, aVarA.f27986b);
        this.f23664a.a();
    }

    public final void setMeasureSpecProvider(gu0 measureSpecProvider) {
        l.f(measureSpecProvider, "measureSpecProvider");
        this.f23666c = new yq(this.f23665b, measureSpecProvider);
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public /* synthetic */ ExtendedViewContainer(Context context, AttributeSet attributeSet, int i, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedViewContainer(Context context, AttributeSet attributeSet, int i) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int dimensionPixelSize3;
        int dimensionPixelSize4;
        super(context, attributeSet, i);
        l.f(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalExtendedContainer, i, 0);
            l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int dimensionPixelSize5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_corner_radius, 0);
            dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_left_corner_radius, dimensionPixelSize5);
            dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_top_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_right_corner_radius, dimensionPixelSize5);
            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_bottom_left_corner_radius, dimensionPixelSize5);
            this.f23665b = a(typedArrayObtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_width, 1.0f), typedArrayObtainStyledAttributes.getFloat(R.styleable.MonetizationAdsInternalExtendedContainer_monetization_internal_max_screen_height, 1.0f));
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f23665b = new gy1();
            dimensionPixelSize = 0;
            dimensionPixelSize2 = 0;
            dimensionPixelSize3 = 0;
            dimensionPixelSize4 = 0;
        }
        this.f23666c = this.f23665b;
        this.f23664a = new hu(this, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize);
        setWillNotDraw(false);
    }
}
