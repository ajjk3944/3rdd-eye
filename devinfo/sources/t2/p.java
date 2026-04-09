package t2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.lifecycle.f1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f34140a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f34141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34142c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f34143d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f34144e;

    /* renamed from: f, reason: collision with root package name */
    public final int f34145f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f34146h;

    /* renamed from: i, reason: collision with root package name */
    public final float f34147i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f34148k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f34149l;

    /* renamed from: m, reason: collision with root package name */
    public final int f34150m;

    /* renamed from: n, reason: collision with root package name */
    public final u2.h[] f34151n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f34152o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public f1 f34153p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ac A[PHI: r7
  0x01ac: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:105:0x01be, B:98:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, t2.j r35) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.p.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, t2.j):void");
    }

    public final int a() {
        boolean z3 = this.f34143d;
        Layout layout = this.f34144e;
        return (z3 ? layout.getLineBottom(this.f34145f - 1) : layout.getHeight()) + this.g + this.f34146h + this.f34150m;
    }

    public final f1 b() {
        f1 f1Var = this.f34153p;
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(this.f34144e);
        this.f34153p = f1Var2;
        return f1Var2;
    }

    public final float c(int i4) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.g + ((i4 != this.f34145f + (-1) || (fontMetricsInt = this.f34149l) == null) ? this.f34144e.getLineBaseline(i4) : f(i4) - fontMetricsInt.ascent);
    }

    public final float d(int i4) {
        Paint.FontMetricsInt fontMetricsInt;
        int i10 = this.f34145f;
        int i11 = i10 - 1;
        Layout layout = this.f34144e;
        if (i4 != i11 || (fontMetricsInt = this.f34149l) == null) {
            return this.g + layout.getLineBottom(i4) + (i4 == i10 + (-1) ? this.f34146h : 0);
        }
        return layout.getLineBottom(i4 - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i4) {
        ThreadLocal threadLocal = q.f34154a;
        Layout layout = this.f34144e;
        return (layout.getEllipsisCount(i4) <= 0 || this.f34141b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i4) : layout.getText().length();
    }

    public final float f(int i4) {
        return this.f34144e.getLineTop(i4) + (i4 == 0 ? 0 : this.g);
    }

    public final float g(int i4, boolean z3) {
        return (this.f34144e.getLineForOffset(i4) == this.f34145f - 1 ? this.f34147i + this.j : 0.0f) + b().B(i4, true, z3);
    }

    public final float h(int i4, boolean z3) {
        return (this.f34144e.getLineForOffset(i4) == this.f34145f + (-1) ? this.f34147i + this.j : 0.0f) + b().B(i4, false, z3);
    }
}
