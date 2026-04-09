package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import org.snmp4j.mp.MPv3;

/* loaded from: classes3.dex */
final class g {

    /* renamed from: n, reason: collision with root package name */
    static final int f37580n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f37581a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f37582b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37583c;

    /* renamed from: e, reason: collision with root package name */
    private int f37585e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f37592l;

    /* renamed from: d, reason: collision with root package name */
    private int f37584d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f37586f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f37587g = MPv3.MAX_MESSAGE_ID;

    /* renamed from: h, reason: collision with root package name */
    private float f37588h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f37589i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f37590j = f37580n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f37591k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f37593m = null;

    static class a extends Exception {
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f37581a = charSequence;
        this.f37582b = textPaint;
        this.f37583c = i10;
        this.f37585e = charSequence.length();
    }

    public static g b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new g(charSequence, textPaint, i10);
    }

    public StaticLayout a() {
        if (this.f37581a == null) {
            this.f37581a = "";
        }
        int iMax = Math.max(0, this.f37583c);
        CharSequence charSequenceEllipsize = this.f37581a;
        if (this.f37587g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f37582b, iMax, this.f37593m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f37585e);
        this.f37585e = iMin;
        if (this.f37592l && this.f37587g == 1) {
            this.f37586f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f37584d, iMin, this.f37582b, iMax);
        builderObtain.setAlignment(this.f37586f);
        builderObtain.setIncludePad(this.f37591k);
        builderObtain.setTextDirection(this.f37592l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f37593m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f37587g);
        float f10 = this.f37588h;
        if (f10 != 0.0f || this.f37589i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f37589i);
        }
        if (this.f37587g > 1) {
            builderObtain.setHyphenationFrequency(this.f37590j);
        }
        return builderObtain.build();
    }

    public g c(Layout.Alignment alignment) {
        this.f37586f = alignment;
        return this;
    }

    public g d(TextUtils.TruncateAt truncateAt) {
        this.f37593m = truncateAt;
        return this;
    }

    public g e(int i10) {
        this.f37590j = i10;
        return this;
    }

    public g f(boolean z10) {
        this.f37591k = z10;
        return this;
    }

    public g g(boolean z10) {
        this.f37592l = z10;
        return this;
    }

    public g h(float f10, float f11) {
        this.f37588h = f10;
        this.f37589i = f11;
        return this;
    }

    public g i(int i10) {
        this.f37587g = i10;
        return this;
    }

    public g j(h hVar) {
        return this;
    }
}
