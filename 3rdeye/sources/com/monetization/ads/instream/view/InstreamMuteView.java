package com.monetization.ads.instream.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.oi2;
import com.yandex.mobile.ads.impl.p31;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class InstreamMuteView extends ImageView implements p31 {

    /* renamed from: a, reason: collision with root package name */
    private final oi2 f23668a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23669b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstreamMuteView(Context context) {
        this(context, null, 0, 6, null);
        l.f(context, "context");
    }

    @SuppressLint({"CustomViewStyleable"})
    private static oi2 a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalInstreamMuteView);
        l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_on, R.drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalInstreamMuteView_monetization_internal_sound_off, R.drawable.monetization_ads_internal_ic_sound_off_default);
        typedArrayObtainStyledAttributes.recycle();
        return new oi2(resourceId2, resourceId);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i10) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = getResources();
        if (isFocused()) {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.monetization_instream_internal_mute_width);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.monetization_instream_internal_mute_height);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.monetization_instream_internal_mute_width_v2);
            dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.monetization_instream_internal_mute_height_v2);
        }
        setMeasuredDimension(dimensionPixelSize, dimensionPixelSize2);
    }

    @Override // com.yandex.mobile.ads.impl.p31
    public void setMuted(boolean z10) {
        this.f23669b = z10;
        this.f23668a.a(this, z10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstreamMuteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstreamMuteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.f23668a = a(context, attributeSet);
        a();
    }

    private final void a() {
        setMuted(this.f23669b);
    }
}
