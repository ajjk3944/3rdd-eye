package xd;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class a {
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int[] M;
    public boolean N;
    public final TextPaint O;
    public final TextPaint P;
    public TimeInterpolator Q;
    public TimeInterpolator R;
    public float S;
    public float T;
    public float U;
    public ColorStateList V;
    public float W;
    public float X;
    public float Y;
    public StaticLayout Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f25240a;

    /* renamed from: a0, reason: collision with root package name */
    public float f25241a0;

    /* renamed from: b, reason: collision with root package name */
    public float f25242b;

    /* renamed from: b0, reason: collision with root package name */
    public float f25243b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f25244c;

    /* renamed from: c0, reason: collision with root package name */
    public float f25245c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f25246d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f25247d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f25248e;
    public ColorStateList j;
    public ColorStateList k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f25259k0;

    /* renamed from: l, reason: collision with root package name */
    public int f25260l;

    /* renamed from: m, reason: collision with root package name */
    public float f25261m;

    /* renamed from: n, reason: collision with root package name */
    public float f25262n;

    /* renamed from: o, reason: collision with root package name */
    public float f25263o;

    /* renamed from: p, reason: collision with root package name */
    public float f25264p;

    /* renamed from: q, reason: collision with root package name */
    public float f25265q;

    /* renamed from: r, reason: collision with root package name */
    public float f25266r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f25267s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f25268t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f25269u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f25270v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f25271w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f25272x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f25273y;

    /* renamed from: z, reason: collision with root package name */
    public be.a f25274z;

    /* renamed from: f, reason: collision with root package name */
    public int f25250f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f25252g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f25254h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f25256i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f25249e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f25251f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f25253g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f25255h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f25257i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f25258j0 = -1;

    public a(TextInputLayout textInputLayout) {
        this.f25240a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f25246d = new Rect();
        this.f25244c = new Rect();
        this.f25248e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i10, float f10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float h(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return fd.a.a(f10, f11, f12);
    }

    public final void b() {
        float f10 = this.f25242b;
        float f11 = this.f25244c.left;
        Rect rect = this.f25246d;
        float fH = h(f11, rect.left, f10, this.Q);
        RectF rectF = this.f25248e;
        rectF.left = fH;
        rectF.top = h(this.f25261m, this.f25262n, f10, this.Q);
        rectF.right = h(r1.right, rect.right, f10, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f10, this.Q);
        this.f25265q = h(this.f25263o, this.f25264p, f10, this.Q);
        this.f25266r = h(this.f25261m, this.f25262n, f10, this.Q);
        d(f10, false);
        TextInputLayout textInputLayout = this.f25240a;
        textInputLayout.postInvalidateOnAnimation();
        q4.a aVar = fd.a.f8823b;
        this.f25243b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f25245c0 = h(1.0f, 0.0f, f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(g(colorStateList2), f10, g(this.k)));
        } else {
            textPaint.setColor(g(colorStateList));
        }
        float f12 = this.W;
        float f13 = this.X;
        if (f12 != f13) {
            textPaint.setLetterSpacing(h(f13, f12, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.H = fd.a.a(0.0f, this.S, f10);
        this.I = fd.a.a(0.0f, this.T, f10);
        this.J = fd.a.a(0.0f, this.U, f10);
        int iA = a(0, f10, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z10 = this.f25240a.getLayoutDirection() == 1;
        if (this.E) {
            return (z10 ? s3.g.f21871d : s3.g.f21870c).l(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void d(float f10, boolean z10) {
        float f11;
        Typeface typeface;
        float f12;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f25246d.width();
        float fWidth2 = this.f25244c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = o() ? this.f25256i : this.f25254h;
            f12 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f25254h, this.f25256i, f10, this.R) / this.f25254h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f25267s;
            fWidth2 = fWidth;
        } else {
            f11 = this.f25254h;
            float f13 = this.X;
            typeface = this.f25270v;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f25254h, this.f25256i, f10, this.R) / this.f25254h;
            }
            float f14 = this.f25256i / this.f25254h;
            float f15 = fWidth2 * f14;
            if (!z10 && f15 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f14, fWidth2);
            }
            f12 = f13;
        }
        int i10 = f10 < 0.5f ? this.f25249e0 : this.f25251f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.G != f11;
            boolean z12 = this.Y != f12;
            boolean z13 = this.f25273y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.L != i10) || this.N;
            this.G = f11;
            this.Y = f12;
            this.f25273y = typeface;
            this.N = false;
            this.L = i10;
            textPaint.setLinearText(this.F != 1.0f);
            z = z14;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f25273y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f25249e0 > 1 || this.f25251f0 > 1) && !zC) ? i10 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        Layout.Alignment alignment;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f25250f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        f fVar = new f(charSequence, textPaint, (int) f10);
        fVar.f25286l = this.A;
        fVar.k = z10;
        fVar.f25281e = alignment;
        fVar.j = false;
        fVar.f25282f = i10;
        float f11 = this.f25253g0;
        fVar.f25283g = 0.0f;
        fVar.f25284h = f11;
        fVar.f25285i = this.f25255h0;
        fVar.f25287m = null;
        StaticLayout staticLayoutA = fVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i10 = this.f25257i0;
        if (i10 != -1) {
            return i10;
        }
        float f10 = this.f25256i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f25267s);
        textPaint.setLetterSpacing(this.W);
        return -textPaint.ascent();
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f25269u;
            if (typeface != null) {
                this.f25268t = ba.m.E(configuration, typeface);
            }
            Typeface typeface2 = this.f25272x;
            if (typeface2 != null) {
                this.f25271w = ba.m.E(configuration, typeface2);
            }
            Typeface typeface3 = this.f25268t;
            if (typeface3 == null) {
                typeface3 = this.f25269u;
            }
            this.f25267s = typeface3;
            Typeface typeface4 = this.f25271w;
            if (typeface4 == null) {
                typeface4 = this.f25272x;
            }
            this.f25270v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z10) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f25240a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z10) {
            return;
        }
        d(1.0f, z10);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f25247d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f25247d0;
        if (charSequence2 != null) {
            this.f25241a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f25241a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f25252g, this.D ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f25246d;
        if (i10 == 48) {
            this.f25262n = rect.top;
        } else if (i10 != 80) {
            this.f25262n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f25262n = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f25264p = rect.centerX() - (this.f25241a0 / 2.0f);
        } else if (i11 != 5) {
            this.f25264p = rect.left;
        } else {
            this.f25264p = rect.right - this.f25241a0;
        }
        if (this.f25241a0 <= rect.width()) {
            float f10 = this.f25264p;
            float fMax = Math.max(0.0f, rect.left - f10) + f10;
            this.f25264p = fMax;
            this.f25264p = Math.min(0.0f, rect.right - (this.f25241a0 + fMax)) + fMax;
        }
        float f11 = this.f25256i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f11);
        textPaint2.setTypeface(this.f25267s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f12 = this.f25262n;
            float fMax2 = Math.max(0.0f, rect.top - f12) + f12;
            this.f25262n = fMax2;
            this.f25262n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z10);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f25249e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f25260l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f25250f, this.D ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f25244c;
        if (i12 == 48) {
            this.f25261m = rect2.top;
        } else if (i12 != 80) {
            this.f25261m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f25261m = (rect2.bottom - height) + (this.f25259k0 ? textPaint.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f25263o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f25263o = rect2.left;
        } else {
            this.f25263o = rect2.right - fMeasureText;
        }
        d(this.f25242b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        be.a aVar = this.f25274z;
        if (aVar != null) {
            aVar.f2673h = true;
        }
        if (this.f25269u == typeface) {
            return false;
        }
        this.f25269u = typeface;
        Typeface typefaceE = ba.m.E(this.f25240a.getContext().getResources().getConfiguration(), typeface);
        this.f25268t = typefaceE;
        if (typefaceE == null) {
            typefaceE = this.f25269u;
        }
        this.f25267s = typefaceE;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.f25242b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.f25242b = r3
            r2.b()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.a.m(float):void");
    }

    public final void n(Typeface typeface) {
        boolean z10;
        boolean zL = l(typeface);
        if (this.f25272x != typeface) {
            this.f25272x = typeface;
            Typeface typefaceE = ba.m.E(this.f25240a.getContext().getResources().getConfiguration(), typeface);
            this.f25271w = typefaceE;
            if (typefaceE == null) {
                typefaceE = this.f25272x;
            }
            this.f25270v = typefaceE;
            z10 = true;
        } else {
            z10 = false;
        }
        if (zL || z10) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f25251f0 == 1;
    }
}
