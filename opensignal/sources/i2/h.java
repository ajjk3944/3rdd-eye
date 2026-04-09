package i2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f11169a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f11170b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11171c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11172d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f11173e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11174f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11175g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11176h;

    /* renamed from: i, reason: collision with root package name */
    public final float f11177i;
    public final float j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f11178l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11179m;

    /* renamed from: n, reason: collision with root package name */
    public final j2.h[] f11180n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f11181o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public cj.a f11182p;

    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, i2.d r35) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.h.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, i2.d):void");
    }

    public final int a() {
        boolean z10 = this.f11172d;
        Layout layout = this.f11173e;
        return (z10 ? layout.getLineBottom(this.f11174f - 1) : layout.getHeight()) + this.f11175g + this.f11176h + this.f11179m;
    }

    public final cj.a b() {
        cj.a aVar = this.f11182p;
        if (aVar != null) {
            return aVar;
        }
        cj.a aVar2 = new cj.a(this.f11173e);
        this.f11182p = aVar2;
        return aVar2;
    }

    public final float c(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f11175g + ((i10 != this.f11174f + (-1) || (fontMetricsInt = this.f11178l) == null) ? this.f11173e.getLineBaseline(i10) : f(i10) - fontMetricsInt.ascent);
    }

    public final float d(int i10) {
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f11174f;
        int i12 = i11 - 1;
        Layout layout = this.f11173e;
        if (i10 != i12 || (fontMetricsInt = this.f11178l) == null) {
            return this.f11175g + layout.getLineBottom(i10) + (i10 == i11 + (-1) ? this.f11176h : 0);
        }
        return layout.getLineBottom(i10 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i10) {
        g gVar = i.f11183a;
        Layout layout = this.f11173e;
        return (layout.getEllipsisCount(i10) <= 0 || this.f11170b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i10) : layout.getText().length();
    }

    public final float f(int i10) {
        return this.f11173e.getLineTop(i10) + (i10 == 0 ? 0 : this.f11175g);
    }

    public final float g(int i10, boolean z10) {
        return (this.f11173e.getLineForOffset(i10) == this.f11174f - 1 ? this.f11177i + this.j : 0.0f) + b().x(i10, true, z10);
    }

    public final float h(int i10, boolean z10) {
        return (this.f11173e.getLineForOffset(i10) == this.f11174f + (-1) ? this.f11177i + this.j : 0.0f) + b().x(i10, false, z10);
    }
}
