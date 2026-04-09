package zc;

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
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {
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
    public final TextInputLayout f38170a;

    /* renamed from: a0, reason: collision with root package name */
    public float f38171a0;

    /* renamed from: b, reason: collision with root package name */
    public float f38172b;

    /* renamed from: b0, reason: collision with root package name */
    public float f38173b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f38174c;

    /* renamed from: c0, reason: collision with root package name */
    public float f38175c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f38176d;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f38177d0;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f38178e;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f38188k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f38189k0;

    /* renamed from: l, reason: collision with root package name */
    public int f38190l;

    /* renamed from: m, reason: collision with root package name */
    public float f38191m;

    /* renamed from: n, reason: collision with root package name */
    public float f38192n;

    /* renamed from: o, reason: collision with root package name */
    public float f38193o;

    /* renamed from: p, reason: collision with root package name */
    public float f38194p;

    /* renamed from: q, reason: collision with root package name */
    public float f38195q;

    /* renamed from: r, reason: collision with root package name */
    public float f38196r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f38197s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f38198t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f38199u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f38200v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f38201w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f38202x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f38203y;

    /* renamed from: z, reason: collision with root package name */
    public bd.a f38204z;

    /* renamed from: f, reason: collision with root package name */
    public int f38180f = 16;
    public int g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f38183h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f38185i = 15.0f;
    public final TextUtils.TruncateAt A = TextUtils.TruncateAt.END;
    public final boolean E = true;

    /* renamed from: e0, reason: collision with root package name */
    public int f38179e0 = 1;

    /* renamed from: f0, reason: collision with root package name */
    public int f38181f0 = 1;

    /* renamed from: g0, reason: collision with root package name */
    public final float f38182g0 = 1.0f;

    /* renamed from: h0, reason: collision with root package name */
    public final int f38184h0 = 1;

    /* renamed from: i0, reason: collision with root package name */
    public int f38186i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    public int f38187j0 = -1;

    public b(TextInputLayout textInputLayout) {
        this.f38170a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.f38176d = new Rect();
        this.f38174c = new Rect();
        this.f38178e = new RectF();
        i(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i4, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i4) * f11)), Math.round((Color.red(i10) * f10) + (Color.red(i4) * f11)), Math.round((Color.green(i10) * f10) + (Color.green(i4) * f11)), Math.round((Color.blue(i10) * f10) + (Color.blue(i4) * f11)));
    }

    public static float h(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return jc.a.a(f10, f11, f12);
    }

    public final void b() {
        float f10 = this.f38172b;
        float f11 = this.f38174c.left;
        Rect rect = this.f38176d;
        float fH = h(f11, rect.left, f10, this.Q);
        RectF rectF = this.f38178e;
        rectF.left = fH;
        rectF.top = h(this.f38191m, this.f38192n, f10, this.Q);
        rectF.right = h(r1.right, rect.right, f10, this.Q);
        rectF.bottom = h(r1.bottom, rect.bottom, f10, this.Q);
        this.f38195q = h(this.f38193o, this.f38194p, f10, this.Q);
        this.f38196r = h(this.f38191m, this.f38192n, f10, this.Q);
        d(f10, false);
        TextInputLayout textInputLayout = this.f38170a;
        textInputLayout.postInvalidateOnAnimation();
        d5.a aVar = jc.a.f27483b;
        this.f38173b0 = 1.0f - h(0.0f, 1.0f, 1.0f - f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        this.f38175c0 = h(1.0f, 0.0f, f10, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f38188k;
        ColorStateList colorStateList2 = this.j;
        TextPaint textPaint = this.O;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, g(colorStateList2), g(this.f38188k)));
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
        this.H = jc.a.a(0.0f, this.S, f10);
        this.I = jc.a.a(0.0f, this.T, f10);
        this.J = jc.a.a(0.0f, this.U, f10);
        int iA = a(f10, 0, g(this.V));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z3 = this.f38170a.getLayoutDirection() == 1;
        if (this.E) {
            return (z3 ? c4.f.f2757d : c4.f.f2756c).g(charSequence.length(), charSequence);
        }
        return z3;
    }

    public final void d(float f10, boolean z3) {
        float f11;
        Typeface typeface;
        float f12;
        if (this.B == null) {
            return;
        }
        float fWidth = this.f38176d.width();
        float fWidth2 = this.f38174c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = o() ? this.f38185i : this.f38183h;
            f12 = o() ? this.W : this.X;
            this.F = o() ? 1.0f : h(this.f38183h, this.f38185i, f10, this.R) / this.f38183h;
            if (!o()) {
                fWidth = fWidth2;
            }
            typeface = this.f38197s;
            fWidth2 = fWidth;
        } else {
            f11 = this.f38183h;
            float f13 = this.X;
            typeface = this.f38200v;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = h(this.f38183h, this.f38185i, f10, this.R) / this.f38183h;
            }
            float f14 = this.f38185i / this.f38183h;
            float f15 = fWidth2 * f14;
            if (!z3 && f15 > fWidth && o()) {
                fWidth2 = Math.min(fWidth / f14, fWidth2);
            }
            f12 = f13;
        }
        int i4 = f10 < 0.5f ? this.f38179e0 : this.f38181f0;
        TextPaint textPaint = this.O;
        if (fWidth2 > 0.0f) {
            boolean z10 = this.G != f11;
            boolean z11 = this.Y != f12;
            boolean z12 = this.f38203y != typeface;
            StaticLayout staticLayout = this.Z;
            boolean z13 = z10 || z11 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z12 || (this.L != i4) || this.N;
            this.G = f11;
            this.Y = f12;
            this.f38203y = typeface;
            this.N = false;
            this.L = i4;
            textPaint.setLinearText(this.F != 1.0f);
            z = z13;
        }
        if (this.C == null || z) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f38203y);
            textPaint.setLetterSpacing(this.Y);
            boolean zC = c(this.B);
            this.D = zC;
            StaticLayout staticLayoutE = e(((this.f38179e0 > 1 || this.f38181f0 > 1) && !zC) ? i4 : 1, textPaint, this.B, fWidth2 * (o() ? 1.0f : this.F), this.D);
            this.Z = staticLayoutE;
            this.C = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i4, TextPaint textPaint, CharSequence charSequence, float f10, boolean z3) {
        Layout.Alignment alignment;
        if (i4 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f38180f, this.D ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.D ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.D ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        i iVar = new i(charSequence, textPaint, (int) f10);
        iVar.f38226l = this.A;
        iVar.f38225k = z3;
        iVar.f38221e = alignment;
        iVar.j = false;
        iVar.f38222f = i4;
        float f11 = this.f38182g0;
        iVar.g = 0.0f;
        iVar.f38223h = f11;
        iVar.f38224i = this.f38184h0;
        iVar.f38227m = null;
        StaticLayout staticLayoutA = iVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final float f() {
        int i4 = this.f38186i0;
        if (i4 != -1) {
            return i4;
        }
        float f10 = this.f38185i;
        TextPaint textPaint = this.P;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f38197s);
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
            Typeface typeface = this.f38199u;
            if (typeface != null) {
                this.f38198t = bd.e.c(configuration, typeface);
            }
            Typeface typeface2 = this.f38202x;
            if (typeface2 != null) {
                this.f38201w = bd.e.c(configuration, typeface2);
            }
            Typeface typeface3 = this.f38198t;
            if (typeface3 == null) {
                typeface3 = this.f38199u;
            }
            this.f38197s = typeface3;
            Typeface typeface4 = this.f38201w;
            if (typeface4 == null) {
                typeface4 = this.f38202x;
            }
            this.f38200v = typeface4;
            j(true);
        }
    }

    public final void j(boolean z3) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.f38170a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z3) {
            return;
        }
        d(1.0f, z3);
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.O;
        if (charSequence != null && this.Z != null) {
            this.f38177d0 = o() ? TextUtils.ellipsize(this.C, textPaint, this.Z.getWidth(), this.A) : this.C;
        }
        CharSequence charSequence2 = this.f38177d0;
        if (charSequence2 != null) {
            this.f38171a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f38171a0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.D ? 1 : 0);
        int i4 = absoluteGravity & AppLovinMediationAdapter.ERROR_CHILD_USER;
        Rect rect = this.f38176d;
        if (i4 == 48) {
            this.f38192n = rect.top;
        } else if (i4 != 80) {
            this.f38192n = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f38192n = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f38194p = rect.centerX() - (this.f38171a0 / 2.0f);
        } else if (i10 != 5) {
            this.f38194p = rect.left;
        } else {
            this.f38194p = rect.right - this.f38171a0;
        }
        if (this.f38171a0 <= rect.width()) {
            float f10 = this.f38194p;
            float fMax = Math.max(0.0f, rect.left - f10) + f10;
            this.f38194p = fMax;
            this.f38194p = Math.min(0.0f, rect.right - (this.f38171a0 + fMax)) + fMax;
        }
        float f11 = this.f38185i;
        TextPaint textPaint2 = this.P;
        textPaint2.setTextSize(f11);
        textPaint2.setTypeface(this.f38197s);
        textPaint2.setLetterSpacing(this.W);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f12 = this.f38192n;
            float fMax2 = Math.max(0.0f, rect.top - f12) + f12;
            this.f38192n = fMax2;
            this.f38192n = Math.min(0.0f, rect.bottom - (f() + fMax2)) + fMax2;
        }
        d(0.0f, z3);
        float height = this.Z != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.Z;
        if (staticLayout == null || this.f38179e0 <= 1) {
            CharSequence charSequence3 = this.C;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.Z;
        this.f38190l = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f38180f, this.D ? 1 : 0);
        int i11 = absoluteGravity2 & AppLovinMediationAdapter.ERROR_CHILD_USER;
        Rect rect2 = this.f38174c;
        if (i11 == 48) {
            this.f38191m = rect2.top;
        } else if (i11 != 80) {
            this.f38191m = rect2.centerY() - (height / 2.0f);
        } else {
            this.f38191m = (rect2.bottom - height) + (this.f38189k0 ? textPaint.descent() : 0.0f);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f38193o = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f38193o = rect2.left;
        } else {
            this.f38193o = rect2.right - fMeasureText;
        }
        d(this.f38172b, false);
        textInputLayout.postInvalidateOnAnimation();
        b();
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f38188k == colorStateList && this.j == colorStateList) {
            return;
        }
        this.f38188k = colorStateList;
        this.j = colorStateList;
        j(false);
    }

    public final boolean l(Typeface typeface) {
        bd.a aVar = this.f38204z;
        if (aVar != null) {
            aVar.f2119c = true;
        }
        if (this.f38199u == typeface) {
            return false;
        }
        this.f38199u = typeface;
        Typeface typefaceC = bd.e.c(this.f38170a.getContext().getResources().getConfiguration(), typeface);
        this.f38198t = typefaceC;
        if (typefaceC == null) {
            typefaceC = this.f38199u;
        }
        this.f38197s = typefaceC;
        return true;
    }

    public final void m(float f10) {
        float fH = com.bumptech.glide.d.h(f10, 0.0f, 1.0f);
        if (fH != this.f38172b) {
            this.f38172b = fH;
            b();
        }
    }

    public final void n(Typeface typeface) {
        boolean z3;
        boolean zL = l(typeface);
        if (this.f38202x != typeface) {
            this.f38202x = typeface;
            Typeface typefaceC = bd.e.c(this.f38170a.getContext().getResources().getConfiguration(), typeface);
            this.f38201w = typefaceC;
            if (typefaceC == null) {
                typefaceC = this.f38202x;
            }
            this.f38200v = typefaceC;
            z3 = true;
        } else {
            z3 = false;
        }
        if (zL || z3) {
            j(false);
        }
    }

    public final boolean o() {
        return this.f38181f0 == 1;
    }
}
