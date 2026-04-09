package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.k42;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import z0.C5848a;

/* loaded from: classes2.dex */
public final class CallToActionView extends Button {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f23659a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(Context context) {
        this(context, null, 0, 6, null);
        l.f(context, "context");
    }

    private static Drawable a(Context context, int i) {
        return C5848a.getDrawable(context, i);
    }

    @Override // android.widget.TextView
    public final CharSequence getText() {
        return this.f23659a;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        l.f(text, "text");
        l.f(type, "type");
        if (text instanceof String) {
            this.f23659a = text;
        }
        super.setText(this.f23659a, TextView.BufferType.SPANNABLE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        l.f(context, "context");
    }

    public final void a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f23659a);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i, int i10, g gVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(Context context, AttributeSet attributeSet, int i) {
        int i10;
        super(context, attributeSet, i);
        l.f(context, "context");
        int i11 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalIconButton, i, 0);
            l.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_size, 0);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon_offset, 0);
            typedArrayObtainStyledAttributes.recycle();
            drawableA = resourceId != 0 ? a(context, resourceId) : null;
            i10 = dimensionPixelSize2;
            i11 = dimensionPixelSize;
        } else {
            i10 = 0;
        }
        setSpannableFactory(new k42(drawableA, i11, i10));
    }
}
