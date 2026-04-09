package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gh;
import com.yandex.mobile.ads.impl.lf2;
import com.yandex.mobile.ads.impl.mf2;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public class CustomizableMediaView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final int f23769f = R.layout.monetization_ads_internal_outstream_controls_default;

    /* renamed from: a, reason: collision with root package name */
    private int f23770a;

    /* renamed from: b, reason: collision with root package name */
    private int f23771b;

    /* renamed from: c, reason: collision with root package name */
    private int f23772c;

    /* renamed from: d, reason: collision with root package name */
    private lf2 f23773d;

    /* renamed from: e, reason: collision with root package name */
    private a f23774e;

    public interface a {
        void a(int i, int i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalMediaView);
            l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f23770a = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f23769f);
            this.f23773d = mf2.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f23770a = f23769f;
            this.f23773d = null;
        }
        addOnAttachStateChangeListener(new gh(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: R5.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(this.f11731b);
            }
        }));
    }

    public final void a(int i) {
        this.f23770a = i;
    }

    public final int getHeightMeasureSpec() {
        return this.f23772c;
    }

    public final a getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f23774e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f23770a;
    }

    public final lf2 getVideoScaleType() {
        return this.f23773d;
    }

    public final int getWidthMeasureSpec() {
        return this.f23771b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        this.f23771b = i;
        this.f23772c = i10;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        a aVar = this.f23774e;
        if (aVar != null) {
            aVar.a(i, i10);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(a aVar) {
        this.f23774e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView this$0) {
        l.f(this$0, "this$0");
        a aVar = this$0.f23774e;
        if (aVar != null) {
            aVar.a(this$0.getWidth(), this$0.getHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableMediaView(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }
}
