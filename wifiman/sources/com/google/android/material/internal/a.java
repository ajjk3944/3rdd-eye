package com.google.android.material.internal;

import F1.AbstractC2771s;
import F1.W;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import c4.C4223a;
import z1.AbstractC8707a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: t0, reason: collision with root package name */
    private static final boolean f37498t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    private static final Paint f37499u0 = null;

    /* renamed from: A, reason: collision with root package name */
    private Typeface f37500A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f37501B;

    /* renamed from: C, reason: collision with root package name */
    private Typeface f37502C;

    /* renamed from: D, reason: collision with root package name */
    private C4223a f37503D;

    /* renamed from: E, reason: collision with root package name */
    private C4223a f37504E;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f37506G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f37507H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f37508I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f37510K;

    /* renamed from: L, reason: collision with root package name */
    private Bitmap f37511L;

    /* renamed from: M, reason: collision with root package name */
    private Paint f37512M;

    /* renamed from: N, reason: collision with root package name */
    private float f37513N;

    /* renamed from: O, reason: collision with root package name */
    private float f37514O;

    /* renamed from: P, reason: collision with root package name */
    private float f37515P;

    /* renamed from: Q, reason: collision with root package name */
    private float f37516Q;

    /* renamed from: R, reason: collision with root package name */
    private float f37517R;

    /* renamed from: S, reason: collision with root package name */
    private int f37518S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f37519T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f37520U;

    /* renamed from: V, reason: collision with root package name */
    private final TextPaint f37521V;

    /* renamed from: W, reason: collision with root package name */
    private final TextPaint f37522W;

    /* renamed from: X, reason: collision with root package name */
    private TimeInterpolator f37523X;

    /* renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f37524Y;

    /* renamed from: Z, reason: collision with root package name */
    private float f37525Z;

    /* renamed from: a, reason: collision with root package name */
    private final View f37526a;

    /* renamed from: a0, reason: collision with root package name */
    private float f37527a0;

    /* renamed from: b, reason: collision with root package name */
    private float f37528b;

    /* renamed from: b0, reason: collision with root package name */
    private float f37529b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37530c;

    /* renamed from: c0, reason: collision with root package name */
    private ColorStateList f37531c0;

    /* renamed from: d, reason: collision with root package name */
    private float f37532d;

    /* renamed from: d0, reason: collision with root package name */
    private float f37533d0;

    /* renamed from: e, reason: collision with root package name */
    private float f37534e;

    /* renamed from: e0, reason: collision with root package name */
    private float f37535e0;

    /* renamed from: f, reason: collision with root package name */
    private int f37536f;

    /* renamed from: f0, reason: collision with root package name */
    private float f37537f0;

    /* renamed from: g, reason: collision with root package name */
    private final Rect f37538g;

    /* renamed from: g0, reason: collision with root package name */
    private ColorStateList f37539g0;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f37540h;

    /* renamed from: h0, reason: collision with root package name */
    private float f37541h0;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f37542i;

    /* renamed from: i0, reason: collision with root package name */
    private float f37543i0;

    /* renamed from: j0, reason: collision with root package name */
    private float f37545j0;

    /* renamed from: k0, reason: collision with root package name */
    private StaticLayout f37547k0;

    /* renamed from: l0, reason: collision with root package name */
    private float f37549l0;

    /* renamed from: m0, reason: collision with root package name */
    private float f37551m0;

    /* renamed from: n, reason: collision with root package name */
    private ColorStateList f37552n;

    /* renamed from: n0, reason: collision with root package name */
    private float f37553n0;

    /* renamed from: o, reason: collision with root package name */
    private ColorStateList f37554o;

    /* renamed from: o0, reason: collision with root package name */
    private CharSequence f37555o0;

    /* renamed from: p, reason: collision with root package name */
    private int f37556p;

    /* renamed from: q, reason: collision with root package name */
    private float f37558q;

    /* renamed from: r, reason: collision with root package name */
    private float f37560r;

    /* renamed from: s, reason: collision with root package name */
    private float f37562s;

    /* renamed from: t, reason: collision with root package name */
    private float f37564t;

    /* renamed from: u, reason: collision with root package name */
    private float f37565u;

    /* renamed from: v, reason: collision with root package name */
    private float f37566v;

    /* renamed from: w, reason: collision with root package name */
    private Typeface f37567w;

    /* renamed from: x, reason: collision with root package name */
    private Typeface f37568x;

    /* renamed from: y, reason: collision with root package name */
    private Typeface f37569y;

    /* renamed from: z, reason: collision with root package name */
    private Typeface f37570z;

    /* renamed from: j, reason: collision with root package name */
    private int f37544j = 16;

    /* renamed from: k, reason: collision with root package name */
    private int f37546k = 16;

    /* renamed from: l, reason: collision with root package name */
    private float f37548l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    private float f37550m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f37505F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    private boolean f37509J = true;

    /* renamed from: p0, reason: collision with root package name */
    private int f37557p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    private float f37559q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    private float f37561r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    private int f37563s0 = g.f37580n;

    /* renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C1207a implements C4223a.InterfaceC1176a {
        C1207a() {
        }

        @Override // c4.C4223a.InterfaceC1176a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f37526a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f37521V = textPaint;
        this.f37522W = new TextPaint(textPaint);
        this.f37540h = new Rect();
        this.f37538g = new Rect();
        this.f37542i = new RectF();
        this.f37534e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f37548l);
        textPaint.setTypeface(this.f37570z);
        textPaint.setLetterSpacing(this.f37543i0);
    }

    private void B(float f10) {
        if (this.f37530c) {
            this.f37542i.set(f10 < this.f37534e ? this.f37538g : this.f37540h);
            return;
        }
        this.f37542i.left = G(this.f37538g.left, this.f37540h.left, f10, this.f37523X);
        this.f37542i.top = G(this.f37558q, this.f37560r, f10, this.f37523X);
        this.f37542i.right = G(this.f37538g.right, this.f37540h.right, f10, this.f37523X);
        this.f37542i.bottom = G(this.f37538g.bottom, this.f37540h.bottom, f10, this.f37523X);
    }

    private static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean D() {
        return W.z(this.f37526a) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z10) {
        return (z10 ? D1.m.f2805d : D1.m.f2804c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return P3.a.a(f10, f11, f12);
    }

    private float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean L(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private void Q(float f10) {
        this.f37551m0 = f10;
        W.d0(this.f37526a);
    }

    private boolean U(Typeface typeface) {
        C4223a c4223a = this.f37504E;
        if (c4223a != null) {
            c4223a.c();
        }
        if (this.f37569y == typeface) {
            return false;
        }
        this.f37569y = typeface;
        Typeface typefaceB = c4.h.b(this.f37526a.getContext().getResources().getConfiguration(), typeface);
        this.f37568x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f37569y;
        }
        this.f37567w = typefaceB;
        return true;
    }

    private void Y(float f10) {
        this.f37553n0 = f10;
        W.d0(this.f37526a);
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.f37507H;
        if (charSequence != null && (staticLayout = this.f37547k0) != null) {
            this.f37555o0 = TextUtils.ellipsize(charSequence, this.f37521V, staticLayout.getWidth(), this.f37505F);
        }
        CharSequence charSequence2 = this.f37555o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.f37549l0 = I(this.f37521V, charSequence2);
        } else {
            this.f37549l0 = 0.0f;
        }
        int iB = AbstractC2771s.b(this.f37546k, this.f37508I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f37560r = this.f37540h.top;
        } else if (i10 != 80) {
            this.f37560r = this.f37540h.centerY() - ((this.f37521V.descent() - this.f37521V.ascent()) / 2.0f);
        } else {
            this.f37560r = this.f37540h.bottom + this.f37521V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f37564t = this.f37540h.centerX() - (this.f37549l0 / 2.0f);
        } else if (i11 != 5) {
            this.f37564t = this.f37540h.left;
        } else {
            this.f37564t = this.f37540h.right - this.f37549l0;
        }
        i(0.0f, z10);
        float height = this.f37547k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f37547k0;
        if (staticLayout2 == null || this.f37557p0 <= 1) {
            CharSequence charSequence3 = this.f37507H;
            if (charSequence3 != null) {
                fI = I(this.f37521V, charSequence3);
            }
        } else {
            fI = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f37547k0;
        this.f37556p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iB2 = AbstractC2771s.b(this.f37544j, this.f37508I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f37558q = this.f37538g.top;
        } else if (i12 != 80) {
            this.f37558q = this.f37538g.centerY() - (height / 2.0f);
        } else {
            this.f37558q = (this.f37538g.bottom - height) + this.f37521V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f37562s = this.f37538g.centerX() - (fI / 2.0f);
        } else if (i13 != 5) {
            this.f37562s = this.f37538g.left;
        } else {
            this.f37562s = this.f37538g.right - fI;
        }
        j();
        d0(this.f37528b);
    }

    private boolean b0(Typeface typeface) {
        C4223a c4223a = this.f37503D;
        if (c4223a != null) {
            c4223a.c();
        }
        if (this.f37501B == typeface) {
            return false;
        }
        this.f37501B = typeface;
        Typeface typefaceB = c4.h.b(this.f37526a.getContext().getResources().getConfiguration(), typeface);
        this.f37500A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f37501B;
        }
        this.f37570z = typefaceB;
        return true;
    }

    private void c() {
        g(this.f37528b);
    }

    private float d(float f10) {
        float f11 = this.f37534e;
        return f10 <= f11 ? P3.a.b(1.0f, 0.0f, this.f37532d, f11, f10) : P3.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private void d0(float f10) {
        h(f10);
        boolean z10 = f37498t0 && this.f37513N != 1.0f;
        this.f37510K = z10;
        if (z10) {
            n();
        }
        W.d0(this.f37526a);
    }

    private float e() {
        float f10 = this.f37532d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zD = D();
        return this.f37509J ? F(charSequence, zD) : zD;
    }

    private void g(float f10) {
        float f11;
        B(f10);
        if (!this.f37530c) {
            this.f37565u = G(this.f37562s, this.f37564t, f10, this.f37523X);
            this.f37566v = G(this.f37558q, this.f37560r, f10, this.f37523X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f37534e) {
            this.f37565u = this.f37562s;
            this.f37566v = this.f37558q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f37565u = this.f37564t;
            this.f37566v = this.f37560r - Math.max(0, this.f37536f);
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = P3.a.f18022b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f37554o != this.f37552n) {
            this.f37521V.setColor(a(v(), t(), f11));
        } else {
            this.f37521V.setColor(t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f37541h0;
        float f13 = this.f37543i0;
        if (f12 != f13) {
            this.f37521V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.f37521V.setLetterSpacing(f12);
        }
        this.f37515P = G(this.f37533d0, this.f37525Z, f10, null);
        this.f37516Q = G(this.f37535e0, this.f37527a0, f10, null);
        this.f37517R = G(this.f37537f0, this.f37529b0, f10, null);
        int iA = a(u(this.f37539g0), u(this.f37531c0), f10);
        this.f37518S = iA;
        this.f37521V.setShadowLayer(this.f37515P, this.f37516Q, this.f37517R, iA);
        if (this.f37530c) {
            this.f37521V.setAlpha((int) (d(f10) * this.f37521V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.f37521V;
                textPaint.setShadowLayer(this.f37515P, this.f37516Q, this.f37517R, V3.a.a(this.f37518S, textPaint.getAlpha()));
            }
        }
        W.d0(this.f37526a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f37506G == null) {
            return;
        }
        float fWidth = this.f37540h.width();
        float fWidth2 = this.f37538g.width();
        if (C(f10, 1.0f)) {
            f11 = this.f37550m;
            f12 = this.f37541h0;
            this.f37513N = 1.0f;
            typeface = this.f37567w;
        } else {
            float f13 = this.f37548l;
            float f14 = this.f37543i0;
            Typeface typeface2 = this.f37570z;
            if (C(f10, 0.0f)) {
                this.f37513N = 1.0f;
            } else {
                this.f37513N = G(this.f37548l, this.f37550m, f10, this.f37524Y) / this.f37548l;
            }
            float f15 = this.f37550m / this.f37548l;
            fWidth = (z10 || this.f37530c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        if (fWidth > 0.0f) {
            boolean z11 = this.f37514O != f11;
            boolean z12 = this.f37545j0 != f12;
            boolean z13 = this.f37502C != typeface;
            StaticLayout staticLayout = this.f37547k0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f37520U;
            this.f37514O = f11;
            this.f37545j0 = f12;
            this.f37502C = typeface;
            this.f37520U = false;
            this.f37521V.setLinearText(this.f37513N != 1.0f);
            z = z14;
        }
        if (this.f37507H == null || z) {
            this.f37521V.setTextSize(this.f37514O);
            this.f37521V.setTypeface(this.f37502C);
            this.f37521V.setLetterSpacing(this.f37545j0);
            this.f37508I = f(this.f37506G);
            StaticLayout staticLayoutK = k(j0() ? this.f37557p0 : 1, fWidth, this.f37508I);
            this.f37547k0 = staticLayoutK;
            this.f37507H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f37511L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f37511L = null;
        }
    }

    private boolean j0() {
        return this.f37557p0 > 1 && (!this.f37508I || this.f37530c) && !this.f37510K;
    }

    private StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) E1.h.g(g.b(this.f37506G, this.f37521V, (int) f10).d(this.f37505F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f37559q0, this.f37561r0).e(this.f37563s0).j(null).a());
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f37521V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f37530c) {
            this.f37521V.setAlpha((int) (this.f37553n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f37521V;
                textPaint.setShadowLayer(this.f37515P, this.f37516Q, this.f37517R, V3.a.a(this.f37518S, textPaint.getAlpha()));
            }
            this.f37547k0.draw(canvas);
        }
        if (!this.f37530c) {
            this.f37521V.setAlpha((int) (this.f37551m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.f37521V;
            textPaint2.setShadowLayer(this.f37515P, this.f37516Q, this.f37517R, V3.a.a(this.f37518S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f37547k0.getLineBaseline(0);
        CharSequence charSequence = this.f37555o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f37521V);
        if (i10 >= 31) {
            this.f37521V.setShadowLayer(this.f37515P, this.f37516Q, this.f37517R, this.f37518S);
        }
        if (this.f37530c) {
            return;
        }
        String strTrim = this.f37555o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f37521V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f37547k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.f37521V);
    }

    private void n() {
        if (this.f37511L != null || this.f37538g.isEmpty() || TextUtils.isEmpty(this.f37507H)) {
            return;
        }
        g(0.0f);
        int width = this.f37547k0.getWidth();
        int height = this.f37547k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f37511L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f37547k0.draw(new Canvas(this.f37511L));
        if (this.f37512M == null) {
            this.f37512M = new Paint(3);
        }
    }

    private float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f37549l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f37508I ? this.f37540h.left : this.f37540h.right - this.f37549l0 : this.f37508I ? this.f37540h.right - this.f37549l0 : this.f37540h.left;
    }

    private float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f37549l0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.f37508I ? rectF.left + this.f37549l0 : this.f37540h.right : this.f37508I ? this.f37540h.right : rectF.left + this.f37549l0;
    }

    private int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f37519T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int v() {
        return u(this.f37552n);
    }

    private Layout.Alignment y() {
        int iB = AbstractC2771s.b(this.f37544j, this.f37508I ? 1 : 0) & 7;
        return iB != 1 ? iB != 5 ? this.f37508I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f37508I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f37550m);
        textPaint.setTypeface(this.f37567w);
        textPaint.setLetterSpacing(this.f37541h0);
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f37554o;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f37552n) != null && colorStateList.isStateful());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f37569y;
            if (typeface != null) {
                this.f37568x = c4.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.f37501B;
            if (typeface2 != null) {
                this.f37500A = c4.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f37568x;
            if (typeface3 == null) {
                typeface3 = this.f37569y;
            }
            this.f37567w = typeface3;
            Typeface typeface4 = this.f37500A;
            if (typeface4 == null) {
                typeface4 = this.f37501B;
            }
            this.f37570z = typeface4;
            K(true);
        }
    }

    public void J() {
        K(false);
    }

    public void K(boolean z10) {
        if ((this.f37526a.getHeight() <= 0 || this.f37526a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f37554o == colorStateList && this.f37552n == colorStateList) {
            return;
        }
        this.f37554o = colorStateList;
        this.f37552n = colorStateList;
        J();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (L(this.f37540h, i10, i11, i12, i13)) {
            return;
        }
        this.f37540h.set(i10, i11, i12, i13);
        this.f37520U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        c4.d dVar = new c4.d(this.f37526a.getContext(), i10);
        if (dVar.i() != null) {
            this.f37554o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f37550m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f33839c;
        if (colorStateList != null) {
            this.f37531c0 = colorStateList;
        }
        this.f37527a0 = dVar.f33844h;
        this.f37529b0 = dVar.f33845i;
        this.f37525Z = dVar.f33846j;
        this.f37541h0 = dVar.f33848l;
        C4223a c4223a = this.f37504E;
        if (c4223a != null) {
            c4223a.c();
        }
        this.f37504E = new C4223a(new C1207a(), dVar.e());
        dVar.h(this.f37526a.getContext(), this.f37504E);
        J();
    }

    public void R(ColorStateList colorStateList) {
        if (this.f37554o != colorStateList) {
            this.f37554o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f37546k != i10) {
            this.f37546k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (L(this.f37538g, i10, i11, i12, i13)) {
            return;
        }
        this.f37538g.set(i10, i11, i12, i13);
        this.f37520U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f37543i0 != f10) {
            this.f37543i0 = f10;
            J();
        }
    }

    public void Z(int i10) {
        if (this.f37544j != i10) {
            this.f37544j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f37548l != f10) {
            this.f37548l = f10;
            J();
        }
    }

    public void c0(float f10) {
        float fA = AbstractC8707a.a(f10, 0.0f, 1.0f);
        if (fA != this.f37528b) {
            this.f37528b = fA;
            c();
        }
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f37523X = timeInterpolator;
        J();
    }

    public final boolean f0(int[] iArr) {
        this.f37519T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f37506G, charSequence)) {
            this.f37506G = charSequence;
            this.f37507H = null;
            j();
            J();
        }
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f37524Y = timeInterpolator;
        J();
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f37507H == null || this.f37542i.width() <= 0.0f || this.f37542i.height() <= 0.0f) {
            return;
        }
        this.f37521V.setTextSize(this.f37514O);
        float f10 = this.f37565u;
        float f11 = this.f37566v;
        boolean z10 = this.f37510K && this.f37511L != null;
        float f12 = this.f37513N;
        if (f12 != 1.0f && !this.f37530c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.f37511L, f10, f11, this.f37512M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f37530c && this.f37528b <= this.f37534e)) {
            canvas.translate(f10, f11);
            this.f37547k0.draw(canvas);
        } else {
            m(canvas, this.f37565u - this.f37547k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f37508I = f(this.f37506G);
        rectF.left = Math.max(r(i10, i11), this.f37540h.left);
        rectF.top = this.f37540h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f37540h.right);
        rectF.bottom = this.f37540h.top + q();
    }

    public ColorStateList p() {
        return this.f37554o;
    }

    public float q() {
        z(this.f37522W);
        return -this.f37522W.ascent();
    }

    public int t() {
        return u(this.f37554o);
    }

    public float w() {
        A(this.f37522W);
        return -this.f37522W.ascent();
    }

    public float x() {
        return this.f37528b;
    }
}
