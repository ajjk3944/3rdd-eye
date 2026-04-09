package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;

/* loaded from: classes2.dex */
public final class StaticLayoutBuilderCompat {

    /* renamed from: o, reason: collision with root package name */
    public static final int f10609o = 1;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f10610a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f10611b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10612c;

    /* renamed from: e, reason: collision with root package name */
    public int f10614e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10621l;

    /* renamed from: n, reason: collision with root package name */
    public x f10623n;

    /* renamed from: d, reason: collision with root package name */
    public int f10613d = 0;

    /* renamed from: f, reason: collision with root package name */
    public Layout.Alignment f10615f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    public int f10616g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f10617h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f10618i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f10619j = f10609o;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10620k = true;

    /* renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f10622m = null;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f10610a = charSequence;
        this.f10611b = textPaint;
        this.f10612c = i10;
        this.f10614e = charSequence.length();
    }

    public static StaticLayoutBuilderCompat b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f10610a == null) {
            this.f10610a = "";
        }
        int iMax = Math.max(0, this.f10612c);
        CharSequence charSequenceEllipsize = this.f10610a;
        if (this.f10616g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f10611b, iMax, this.f10622m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f10614e);
        this.f10614e = iMin;
        if (this.f10621l && this.f10616g == 1) {
            this.f10615f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f10613d, iMin, this.f10611b, iMax);
        builderObtain.setAlignment(this.f10615f);
        builderObtain.setIncludePad(this.f10620k);
        builderObtain.setTextDirection(this.f10621l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f10622m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f10616g);
        float f10 = this.f10617h;
        if (f10 != 0.0f || this.f10618i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f10618i);
        }
        if (this.f10616g > 1) {
            builderObtain.setHyphenationFrequency(this.f10619j);
        }
        x xVar = this.f10623n;
        if (xVar != null) {
            xVar.a(builderObtain);
        }
        return builderObtain.build();
    }

    public StaticLayoutBuilderCompat c(Layout.Alignment alignment) {
        this.f10615f = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat d(TextUtils.TruncateAt truncateAt) {
        this.f10622m = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat e(int i10) {
        this.f10619j = i10;
        return this;
    }

    public StaticLayoutBuilderCompat f(boolean z10) {
        this.f10620k = z10;
        return this;
    }

    public StaticLayoutBuilderCompat g(boolean z10) {
        this.f10621l = z10;
        return this;
    }

    public StaticLayoutBuilderCompat h(float f10, float f11) {
        this.f10617h = f10;
        this.f10618i = f11;
        return this;
    }

    public StaticLayoutBuilderCompat i(int i10) {
        this.f10616g = i10;
        return this;
    }

    public StaticLayoutBuilderCompat j(x xVar) {
        this.f10623n = xVar;
        return this;
    }
}
