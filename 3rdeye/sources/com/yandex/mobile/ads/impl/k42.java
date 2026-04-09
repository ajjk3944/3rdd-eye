package com.yandex.mobile.ads.impl;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* loaded from: classes3.dex */
public final class k42 extends Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f29490a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29491b;

    /* renamed from: c, reason: collision with root package name */
    private final int f29492c;

    public k42(Drawable drawable, int i, int i10) {
        this.f29490a = drawable;
        this.f29491b = i;
        this.f29492c = i10;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence source) {
        kotlin.jvm.internal.l.f(source, "source");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f29490a != null && this.f29491b > 0) {
            spannableStringBuilder.append((CharSequence) "  ");
            Drawable drawable = this.f29490a;
            int i = this.f29491b;
            drawable.setBounds(0, 0, i, i);
            tc tcVar = new tc(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i10 = this.f29492c;
            colorDrawable.setBounds(0, 0, i10, i10);
            tc tcVar2 = new tc(colorDrawable);
            spannableStringBuilder.setSpan(tcVar, 0, 1, 33);
            spannableStringBuilder.setSpan(tcVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(source);
        return spannableStringBuilder;
    }
}
