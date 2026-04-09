package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import d5.a;

/* loaded from: classes2.dex */
public final class b {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public d5.a E;
    public d5.a F;
    public CharSequence H;
    public CharSequence I;
    public boolean J;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int[] S;
    public boolean T;
    public final TextPaint U;
    public final TextPaint V;
    public TimeInterpolator W;
    public TimeInterpolator X;
    public float Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f10633a;

    /* renamed from: a0, reason: collision with root package name */
    public float f10634a0;

    /* renamed from: b, reason: collision with root package name */
    public float f10635b;

    /* renamed from: b0, reason: collision with root package name */
    public ColorStateList f10636b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10637c;

    /* renamed from: c0, reason: collision with root package name */
    public float f10638c0;

    /* renamed from: d, reason: collision with root package name */
    public float f10639d;

    /* renamed from: d0, reason: collision with root package name */
    public float f10640d0;

    /* renamed from: e, reason: collision with root package name */
    public float f10641e;

    /* renamed from: e0, reason: collision with root package name */
    public float f10642e0;

    /* renamed from: f, reason: collision with root package name */
    public int f10643f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f10644f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f10645g;

    /* renamed from: g0, reason: collision with root package name */
    public float f10646g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f10647h;

    /* renamed from: h0, reason: collision with root package name */
    public float f10648h0;

    /* renamed from: i, reason: collision with root package name */
    public Rect f10649i;

    /* renamed from: i0, reason: collision with root package name */
    public float f10650i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f10651j;

    /* renamed from: j0, reason: collision with root package name */
    public StaticLayout f10652j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f10654k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f10656l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f10658m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f10660n0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f10661o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f10663p;

    /* renamed from: q, reason: collision with root package name */
    public int f10665q;

    /* renamed from: r, reason: collision with root package name */
    public float f10667r;

    /* renamed from: s, reason: collision with root package name */
    public float f10669s;

    /* renamed from: t, reason: collision with root package name */
    public float f10671t;

    /* renamed from: t0, reason: collision with root package name */
    public x f10672t0;

    /* renamed from: u, reason: collision with root package name */
    public float f10673u;

    /* renamed from: v, reason: collision with root package name */
    public float f10675v;

    /* renamed from: w, reason: collision with root package name */
    public float f10677w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f10678w0;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f10679x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f10680y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f10681z;

    /* renamed from: k, reason: collision with root package name */
    public int f10653k = 16;

    /* renamed from: l, reason: collision with root package name */
    public int f10655l = 16;

    /* renamed from: m, reason: collision with root package name */
    public float f10657m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f10659n = 15.0f;
    public TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    public boolean K = true;

    /* renamed from: o0, reason: collision with root package name */
    public int f10662o0 = 1;

    /* renamed from: p0, reason: collision with root package name */
    public int f10664p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    public float f10666q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    public float f10668r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f10670s0 = StaticLayoutBuilderCompat.f10609o;

    /* renamed from: u0, reason: collision with root package name */
    public int f10674u0 = -1;

    /* renamed from: v0, reason: collision with root package name */
    public int f10676v0 = -1;

    public class a implements a.InterfaceC0384a {
        public a() {
        }

        @Override // d5.a.InterfaceC0384a
        public void a(Typeface typeface) {
            b.this.Y(typeface);
        }
    }

    public b(View view) {
        this.f10633a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f10647h = new Rect();
        this.f10645g = new Rect();
        this.f10651j = new RectF();
        this.f10641e = e();
        L(view.getContext().getResources().getConfiguration());
    }

    public static boolean G(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    public static float K(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return k4.a.a(f10, f11, f12);
    }

    public static boolean P(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public float A() {
        E(this.V);
        return -this.V.ascent();
    }

    public float B() {
        return this.f10635b;
    }

    public final Layout.Alignment C() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f10653k, this.J ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public final void D(TextPaint textPaint) {
        textPaint.setTextSize(this.f10659n);
        textPaint.setTypeface(this.f10679x);
        textPaint.setLetterSpacing(this.f10646g0);
    }

    public final void E(TextPaint textPaint) {
        textPaint.setTextSize(this.f10657m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f10648h0);
    }

    public final void F(float f10) {
        if (this.f10637c) {
            this.f10651j.set(f10 < this.f10641e ? this.f10645g : this.f10647h);
            return;
        }
        this.f10651j.left = K(this.f10645g.left, this.f10647h.left, f10, this.W);
        this.f10651j.top = K(this.f10667r, this.f10669s, f10, this.W);
        this.f10651j.right = K(this.f10645g.right, this.f10647h.right, f10, this.W);
        this.f10651j.bottom = K(this.f10645g.bottom, this.f10647h.bottom, f10, this.W);
    }

    public final boolean H() {
        return this.f10633a.getLayoutDirection() == 1;
    }

    public final boolean I() {
        ColorStateList colorStateList = this.f10663p;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f10661o;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean J(CharSequence charSequence, boolean z10) {
        return (z10 ? q0.p.f23971d : q0.p.f23970c).isRtl(charSequence, 0, charSequence.length());
    }

    public void L(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10681z;
            if (typeface != null) {
                this.f10680y = d5.j.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = d5.j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f10680y;
            if (typeface3 == null) {
                typeface3 = this.f10681z;
            }
            this.f10679x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            O(true);
        }
    }

    public final float M(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void N() {
        O(false);
    }

    public void O(boolean z10) {
        if ((this.f10633a.getHeight() <= 0 || this.f10633a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void Q(ColorStateList colorStateList) {
        if (this.f10663p == colorStateList && this.f10661o == colorStateList) {
            return;
        }
        this.f10663p = colorStateList;
        this.f10661o = colorStateList;
        N();
    }

    public void R(int i10, int i11, int i12, int i13) {
        if (P(this.f10647h, i10, i11, i12, i13)) {
            return;
        }
        this.f10647h.set(i10, i11, i12, i13);
        this.T = true;
    }

    public void S(Rect rect) {
        R(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void T(int i10) {
        if (i10 != this.f10664p0) {
            this.f10664p0 = i10;
            N();
        }
    }

    public void U(int i10) {
        d5.e eVar = new d5.e(this.f10633a.getContext(), i10);
        if (eVar.j() != null) {
            this.f10663p = eVar.j();
        }
        if (eVar.k() != 0.0f) {
            this.f10659n = eVar.k();
        }
        ColorStateList colorStateList = eVar.f20766c;
        if (colorStateList != null) {
            this.f10636b0 = colorStateList;
        }
        this.Z = eVar.f20772i;
        this.f10634a0 = eVar.f20773j;
        this.Y = eVar.f20774k;
        this.f10646g0 = eVar.f20776m;
        d5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        this.F = new d5.a(new a(), eVar.e());
        eVar.h(this.f10633a.getContext(), this.F);
        N();
    }

    public final void V(float f10) {
        this.f10656l0 = f10;
        this.f10633a.postInvalidateOnAnimation();
    }

    public void W(ColorStateList colorStateList) {
        if (this.f10663p != colorStateList) {
            this.f10663p = colorStateList;
            N();
        }
    }

    public void X(int i10) {
        if (this.f10655l != i10) {
            this.f10655l = i10;
            N();
        }
    }

    public void Y(Typeface typeface) {
        if (Z(typeface)) {
            N();
        }
    }

    public final boolean Z(Typeface typeface) {
        d5.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f10681z == typeface) {
            return false;
        }
        this.f10681z = typeface;
        Typeface typefaceB = d5.j.b(this.f10633a.getContext().getResources().getConfiguration(), typeface);
        this.f10680y = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f10681z;
        }
        this.f10679x = typefaceB;
        return true;
    }

    public void a0(int i10, int i11, int i12, int i13) {
        b0(i10, i11, i12, i13, true);
    }

    public final void b(boolean z10) {
        float fM;
        i(1.0f, z10);
        if (this.I != null && this.f10652j0 != null) {
            this.f10660n0 = r0() ? TextUtils.ellipsize(this.I, this.U, this.f10652j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence = this.f10660n0;
        if (charSequence != null) {
            this.f10654k0 = M(this.U, charSequence);
        } else {
            this.f10654k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f10655l, this.J ? 1 : 0);
        Rect rect = this.f10649i;
        if (rect == null) {
            rect = this.f10647h;
        }
        int i10 = absoluteGravity & 112;
        if (i10 == 48) {
            this.f10669s = rect.top;
        } else if (i10 != 80) {
            this.f10669s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
        } else {
            this.f10669s = rect.bottom + this.U.ascent();
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f10673u = rect.centerX() - (this.f10654k0 / 2.0f);
        } else if (i11 != 5) {
            this.f10673u = rect.left;
        } else {
            this.f10673u = rect.right - this.f10654k0;
        }
        if (this.f10654k0 <= this.f10647h.width()) {
            float f10 = this.f10673u;
            float fMax = f10 + Math.max(0.0f, this.f10647h.left - f10);
            this.f10673u = fMax;
            this.f10673u = fMax + Math.min(0.0f, this.f10647h.right - (this.f10654k0 + fMax));
        }
        if (m() <= this.f10647h.height()) {
            float f11 = this.f10669s;
            float fMax2 = f11 + Math.max(0.0f, this.f10647h.top - f11);
            this.f10669s = fMax2;
            this.f10669s = fMax2 + Math.min(0.0f, this.f10647h.bottom - (q() + fMax2));
        }
        i(0.0f, z10);
        float height = this.f10652j0 != null ? r11.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f10652j0;
        if (staticLayout == null || this.f10662o0 <= 1) {
            CharSequence charSequence2 = this.I;
            fM = charSequence2 != null ? M(this.U, charSequence2) : 0.0f;
        } else {
            fM = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f10652j0;
        this.f10665q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f10653k, this.J ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        if (i12 == 48) {
            this.f10667r = this.f10645g.top;
        } else if (i12 != 80) {
            this.f10667r = this.f10645g.centerY() - (height / 2.0f);
        } else {
            this.f10667r = (this.f10645g.bottom - height) + (this.f10678w0 ? this.U.descent() : 0.0f);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f10671t = this.f10645g.centerX() - (fM / 2.0f);
        } else if (i13 != 5) {
            this.f10671t = this.f10645g.left;
        } else {
            this.f10671t = this.f10645g.right - fM;
        }
        k0(this.f10635b);
    }

    public void b0(int i10, int i11, int i12, int i13, boolean z10) {
        if (P(this.f10645g, i10, i11, i12, i13) && z10 == this.f10678w0) {
            return;
        }
        this.f10645g.set(i10, i11, i12, i13);
        this.T = true;
        this.f10678w0 = z10;
    }

    public final void c() {
        g(this.f10635b);
    }

    public void c0(Rect rect) {
        a0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final float d(float f10) {
        float f11 = this.f10641e;
        return f10 <= f11 ? k4.a.b(1.0f, 0.0f, this.f10639d, f11, f10) : k4.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    public void d0(float f10) {
        if (this.f10648h0 != f10) {
            this.f10648h0 = f10;
            N();
        }
    }

    public final float e() {
        float f10 = this.f10639d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    public void e0(int i10) {
        if (i10 != this.f10662o0) {
            this.f10662o0 = i10;
            N();
        }
    }

    public final boolean f(CharSequence charSequence) {
        boolean zH = H();
        return this.K ? J(charSequence, zH) : zH;
    }

    public final void f0(float f10) {
        this.f10658m0 = f10;
        this.f10633a.postInvalidateOnAnimation();
    }

    public final void g(float f10) {
        float f11;
        F(f10);
        if (!this.f10637c) {
            this.f10675v = K(this.f10671t, this.f10673u, f10, this.W);
            this.f10677w = K(this.f10667r, this.f10669s, f10, this.W);
            k0(f10);
            f11 = f10;
        } else if (f10 < this.f10641e) {
            this.f10675v = this.f10671t;
            this.f10677w = this.f10667r;
            k0(0.0f);
            f11 = 0.0f;
        } else {
            this.f10675v = this.f10673u;
            this.f10677w = this.f10669s - Math.max(0, this.f10643f);
            k0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = k4.a.f21835b;
        V(1.0f - K(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        f0(K(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f10663p != this.f10661o) {
            this.U.setColor(a(v(), t(), f11));
        } else {
            this.U.setColor(t());
        }
        float f12 = this.f10646g0;
        float f13 = this.f10648h0;
        if (f12 != f13) {
            this.U.setLetterSpacing(K(f13, f12, f10, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f12);
        }
        this.N = K(this.f10638c0, this.Y, f10, null);
        this.O = K(this.f10640d0, this.Z, f10, null);
        this.P = K(this.f10642e0, this.f10634a0, f10, null);
        int iA = a(u(this.f10644f0), u(this.f10636b0), f10);
        this.Q = iA;
        this.U.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f10637c) {
            this.U.setAlpha((int) (d(f10) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, u4.a.a(this.Q, textPaint.getAlpha()));
            }
        }
        this.f10633a.postInvalidateOnAnimation();
    }

    public void g0(int i10) {
        if (this.f10653k != i10) {
            this.f10653k = i10;
            N();
        }
    }

    public final void h(float f10) {
        i(f10, false);
    }

    public void h0(float f10) {
        if (this.f10657m != f10) {
            this.f10657m = f10;
            N();
        }
    }

    public final void i(float f10, boolean z10) {
        Typeface typeface;
        float f11;
        float f12;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f10647h.width();
        float fWidth2 = this.f10645g.width();
        if (G(f10, 1.0f)) {
            f11 = r0() ? this.f10659n : this.f10657m;
            f12 = r0() ? this.f10646g0 : this.f10648h0;
            this.L = r0() ? 1.0f : K(this.f10657m, this.f10659n, f10, this.X) / this.f10657m;
            if (!r0()) {
                fWidth = fWidth2;
            }
            typeface = this.f10679x;
            fWidth2 = fWidth;
        } else {
            float f13 = this.f10657m;
            float f14 = this.f10648h0;
            typeface = this.A;
            if (G(f10, 0.0f)) {
                this.L = 1.0f;
            } else {
                this.L = K(this.f10657m, this.f10659n, f10, this.X) / this.f10657m;
            }
            float f15 = this.f10659n / this.f10657m;
            float f16 = fWidth2 * f15;
            if (!z10 && !this.f10637c && f16 > fWidth && r0()) {
                fWidth2 = Math.min(fWidth / f15, fWidth2);
            }
            f11 = f13;
            f12 = f14;
        }
        int i10 = f10 < 0.5f ? this.f10662o0 : this.f10664p0;
        if (fWidth2 > 0.0f) {
            boolean z11 = this.M != f11;
            boolean z12 = this.f10650i0 != f12;
            boolean z13 = this.D != typeface;
            StaticLayout staticLayout = this.f10652j0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || (this.R != i10) || this.T;
            this.M = f11;
            this.f10650i0 = f12;
            this.D = typeface;
            this.T = false;
            this.R = i10;
            this.U.setLinearText(this.L != 1.0f);
            z = z14;
        }
        if (this.I == null || z) {
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.f10650i0);
            this.J = f(this.H);
            StaticLayout staticLayoutJ = j(q0() ? i10 : 1, this.U, this.H, fWidth2 * (r0() ? 1.0f : this.L), this.J);
            this.f10652j0 = staticLayoutJ;
            this.I = staticLayoutJ.getText();
        }
    }

    public final boolean i0(Typeface typeface) {
        d5.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceB = d5.j.b(this.f10633a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.C;
        }
        this.A = typefaceB;
        return true;
    }

    public final StaticLayout j(int i10, TextPaint textPaint, CharSequence charSequence, float f10, boolean z10) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = StaticLayoutBuilderCompat.b(charSequence, textPaint, (int) f10).d(this.G).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : C()).f(false).i(i10).h(this.f10666q0, this.f10668r0).e(this.f10670s0).j(this.f10672t0).a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e10) {
            Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
            staticLayoutA = null;
        }
        return (StaticLayout) r0.i.g(staticLayoutA);
    }

    public void j0(float f10) {
        float fA = m0.a.a(f10, 0.0f, 1.0f);
        if (fA != this.f10635b) {
            this.f10635b = fA;
            c();
        }
    }

    public void k(Canvas canvas) {
        int iSave = canvas.save();
        if (this.I == null || this.f10651j.width() <= 0.0f || this.f10651j.height() <= 0.0f) {
            return;
        }
        this.U.setTextSize(this.M);
        float f10 = this.f10675v;
        float f11 = this.f10677w;
        float f12 = this.L;
        if (f12 != 1.0f && !this.f10637c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (q0() && r0() && (!this.f10637c || this.f10635b > this.f10641e)) {
            l(canvas, this.f10675v - this.f10652j0.getLineStart(0), f11);
        } else {
            canvas.translate(f10, f11);
            this.f10652j0.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public final void k0(float f10) {
        h(f10);
        this.f10633a.postInvalidateOnAnimation();
    }

    public final void l(Canvas canvas, float f10, float f11) {
        int alpha = this.U.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f10637c) {
            this.U.setAlpha((int) (this.f10658m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, u4.a.a(this.Q, textPaint.getAlpha()));
            }
            this.f10652j0.draw(canvas);
        }
        if (!this.f10637c) {
            this.U.setAlpha((int) (this.f10656l0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, u4.a.a(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f10652j0.getLineBaseline(0);
        CharSequence charSequence = this.f10660n0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.U);
        if (i10 >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (this.f10637c) {
            return;
        }
        String strTrim = this.f10660n0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.U.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f10652j0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.U);
    }

    public void l0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        N();
    }

    public float m() {
        D(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public final boolean m0(int[] iArr) {
        this.S = iArr;
        if (!I()) {
            return false;
        }
        N();
        return true;
    }

    public float n() {
        D(this.V);
        return -this.V.ascent();
    }

    public void n0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            N();
        }
    }

    public void o(RectF rectF, int i10, int i11) {
        this.J = f(this.H);
        rectF.left = Math.max(r(i10, i11), this.f10647h.left);
        rectF.top = this.f10647h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f10647h.right);
        rectF.bottom = this.f10647h.top + q();
        if (this.f10652j0 == null || r0()) {
            return;
        }
        float lineWidth = this.f10652j0.getLineWidth(r4.getLineCount() - 1) * (this.f10659n / this.f10657m);
        if (this.J) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public void o0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        N();
    }

    public ColorStateList p() {
        return this.f10663p;
    }

    public void p0(Typeface typeface) {
        boolean Z = Z(typeface);
        boolean zI0 = i0(typeface);
        if (Z || zI0) {
            N();
        }
    }

    public float q() {
        int i10 = this.f10674u0;
        return i10 != -1 ? i10 : n();
    }

    public final boolean q0() {
        if (this.f10662o0 > 1 || this.f10664p0 > 1) {
            return !this.J || this.f10637c;
        }
        return false;
    }

    public final float r(int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) - (this.f10654k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.J ? this.f10647h.left : this.f10647h.right - this.f10654k0 : this.J ? this.f10647h.right - this.f10654k0 : this.f10647h.left;
    }

    public final boolean r0() {
        return this.f10664p0 == 1;
    }

    public final float s(RectF rectF, int i10, int i11) {
        return (i11 == 17 || (i11 & 7) == 1) ? (i10 / 2.0f) + (this.f10654k0 / 2.0f) : ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) ? this.J ? rectF.left + this.f10654k0 : this.f10647h.right : this.J ? this.f10647h.right : rectF.left + this.f10654k0;
    }

    public void s0(int i10) {
        D(this.V);
        float f10 = i10;
        this.f10674u0 = j(this.f10664p0, this.V, this.H, f10 * (this.f10659n / this.f10657m), this.J).getHeight();
        E(this.V);
        this.f10676v0 = j(this.f10662o0, this.V, this.H, f10, this.J).getHeight();
    }

    public int t() {
        return u(this.f10663p);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.f10661o);
    }

    public int w() {
        return this.f10665q;
    }

    public int x() {
        return this.f10662o0;
    }

    public float y() {
        E(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public float z() {
        int i10 = this.f10676v0;
        return i10 != -1 ? i10 : A();
    }
}
