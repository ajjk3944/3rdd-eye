package M0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final CharSequence f12363a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12364b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12365c;

    /* renamed from: d, reason: collision with root package name */
    private final TextPaint f12366d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12367e;

    /* renamed from: f, reason: collision with root package name */
    private final TextDirectionHeuristic f12368f;

    /* renamed from: g, reason: collision with root package name */
    private final Layout.Alignment f12369g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12370h;

    /* renamed from: i, reason: collision with root package name */
    private final TextUtils.TruncateAt f12371i;

    /* renamed from: j, reason: collision with root package name */
    private final int f12372j;

    /* renamed from: k, reason: collision with root package name */
    private final float f12373k;

    /* renamed from: l, reason: collision with root package name */
    private final float f12374l;

    /* renamed from: m, reason: collision with root package name */
    private final int f12375m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f12376n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f12377o;

    /* renamed from: p, reason: collision with root package name */
    private final int f12378p;

    /* renamed from: q, reason: collision with root package name */
    private final int f12379q;

    /* renamed from: r, reason: collision with root package name */
    private final int f12380r;

    /* renamed from: s, reason: collision with root package name */
    private final int f12381s;

    /* renamed from: t, reason: collision with root package name */
    private final int[] f12382t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f12383u;

    public c0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        this.f12363a = charSequence;
        this.f12364b = i10;
        this.f12365c = i11;
        this.f12366d = textPaint;
        this.f12367e = i12;
        this.f12368f = textDirectionHeuristic;
        this.f12369g = alignment;
        this.f12370h = i13;
        this.f12371i = truncateAt;
        this.f12372j = i14;
        this.f12373k = f10;
        this.f12374l = f11;
        this.f12375m = i15;
        this.f12376n = z10;
        this.f12377o = z11;
        this.f12378p = i16;
        this.f12379q = i17;
        this.f12380r = i18;
        this.f12381s = i19;
        this.f12382t = iArr;
        this.f12383u = iArr2;
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }

    public final Layout.Alignment a() {
        return this.f12369g;
    }

    public final int b() {
        return this.f12378p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f12371i;
    }

    public final int d() {
        return this.f12372j;
    }

    public final int e() {
        return this.f12365c;
    }

    public final int f() {
        return this.f12381s;
    }

    public final boolean g() {
        return this.f12376n;
    }

    public final int h() {
        return this.f12375m;
    }

    public final int[] i() {
        return this.f12382t;
    }

    public final int j() {
        return this.f12379q;
    }

    public final int k() {
        return this.f12380r;
    }

    public final float l() {
        return this.f12374l;
    }

    public final float m() {
        return this.f12373k;
    }

    public final int n() {
        return this.f12370h;
    }

    public final TextPaint o() {
        return this.f12366d;
    }

    public final int[] p() {
        return this.f12383u;
    }

    public final int q() {
        return this.f12364b;
    }

    public final CharSequence r() {
        return this.f12363a;
    }

    public final TextDirectionHeuristic s() {
        return this.f12368f;
    }

    public final boolean t() {
        return this.f12377o;
    }

    public final int u() {
        return this.f12367e;
    }
}
