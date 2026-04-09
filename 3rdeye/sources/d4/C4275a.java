package d4;

import L0.I;
import L0.S;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
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
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import d4.g;
import h4.C4413a;
import java.util.WeakHashMap;

/* compiled from: CollapsingTextHelper.java */
/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4275a {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f37427A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f37428B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f37429C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f37431E;

    /* renamed from: F, reason: collision with root package name */
    public float f37432F;

    /* renamed from: G, reason: collision with root package name */
    public float f37433G;

    /* renamed from: H, reason: collision with root package name */
    public float f37434H;

    /* renamed from: I, reason: collision with root package name */
    public float f37435I;

    /* renamed from: J, reason: collision with root package name */
    public float f37436J;

    /* renamed from: K, reason: collision with root package name */
    public int f37437K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f37438L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f37439M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f37440N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f37441O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f37442P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f37443Q;

    /* renamed from: R, reason: collision with root package name */
    public float f37444R;

    /* renamed from: S, reason: collision with root package name */
    public float f37445S;

    /* renamed from: T, reason: collision with root package name */
    public float f37446T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f37447U;

    /* renamed from: V, reason: collision with root package name */
    public float f37448V;

    /* renamed from: W, reason: collision with root package name */
    public float f37449W;

    /* renamed from: X, reason: collision with root package name */
    public float f37450X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f37451Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f37452Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f37453a;

    /* renamed from: a0, reason: collision with root package name */
    public float f37454a0;

    /* renamed from: b, reason: collision with root package name */
    public float f37455b;

    /* renamed from: b0, reason: collision with root package name */
    public float f37456b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f37457c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f37458c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f37459d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f37461e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f37467j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f37468k;

    /* renamed from: l, reason: collision with root package name */
    public float f37469l;

    /* renamed from: m, reason: collision with root package name */
    public float f37470m;

    /* renamed from: n, reason: collision with root package name */
    public float f37471n;

    /* renamed from: o, reason: collision with root package name */
    public float f37472o;

    /* renamed from: p, reason: collision with root package name */
    public float f37473p;

    /* renamed from: q, reason: collision with root package name */
    public float f37474q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f37475r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f37476s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f37477t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f37478u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f37479v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f37480w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f37481x;

    /* renamed from: y, reason: collision with root package name */
    public C4413a f37482y;

    /* renamed from: f, reason: collision with root package name */
    public int f37463f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f37465g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f37466h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f37483z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f37430D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f37460d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f37462e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f37464f0 = 1;

    public C4275a(TextInputLayout textInputLayout) {
        this.f37453a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f37440N = textPaint;
        this.f37441O = new TextPaint(textPaint);
        this.f37459d = new Rect();
        this.f37457c = new Rect();
        this.f37461e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i) * f11)), Math.round((Color.red(i10) * f10) + (Color.red(i) * f11)), Math.round((Color.green(i10) * f10) + (Color.green(i) * f11)), Math.round((Color.blue(i10) * f10) + (Color.blue(i) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return L3.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        boolean z10 = this.f37453a.getLayoutDirection() == 1;
        if (this.f37430D) {
            return (z10 ? J0.i.f2711d : J0.i.f2710c).b(charSequence, charSequence.length());
        }
        return z10;
    }

    public final void c(float f10, boolean z10) throws g.a {
        float f11;
        float f12;
        Typeface typeface;
        boolean z11;
        Layout.Alignment alignment;
        if (this.f37427A == null) {
            return;
        }
        float fWidth = this.f37459d.width();
        float fWidth2 = this.f37457c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.i;
            f12 = this.f37448V;
            this.f37432F = 1.0f;
            typeface = this.f37475r;
        } else {
            float f13 = this.f37466h;
            float f14 = this.f37449W;
            Typeface typeface2 = this.f37478u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.f37432F = 1.0f;
            } else {
                this.f37432F = f(this.f37466h, this.i, f10, this.f37443Q) / this.f37466h;
            }
            float f15 = this.i / this.f37466h;
            fWidth = (z10 || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f37440N;
        if (fWidth > 0.0f) {
            boolean z12 = this.f37433G != f11;
            boolean z13 = this.f37450X != f12;
            boolean z14 = this.f37481x != typeface;
            StaticLayout staticLayout = this.f37451Y;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.f37439M;
            this.f37433G = f11;
            this.f37450X = f12;
            this.f37481x = typeface;
            this.f37439M = false;
            textPaint.setLinearText(this.f37432F != 1.0f);
            z11 = z15;
        } else {
            z11 = false;
        }
        if (this.f37428B == null || z11) {
            textPaint.setTextSize(this.f37433G);
            textPaint.setTypeface(this.f37481x);
            textPaint.setLetterSpacing(this.f37450X);
            boolean zB = b(this.f37427A);
            this.f37429C = zB;
            int i = this.f37460d0;
            if (i <= 1 || zB) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f37463f, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f37429C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f37429C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.f37427A, textPaint, (int) fWidth);
            gVar.f37509k = this.f37483z;
            gVar.f37508j = zB;
            gVar.f37504e = alignment;
            gVar.i = false;
            gVar.f37505f = i;
            gVar.f37506g = this.f37462e0;
            gVar.f37507h = this.f37464f0;
            StaticLayout staticLayoutA = gVar.a();
            staticLayoutA.getClass();
            this.f37451Y = staticLayoutA;
            this.f37428B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f37441O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f37475r);
        textPaint.setLetterSpacing(this.f37448V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f37438L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f37477t;
            if (typeface != null) {
                this.f37476s = h4.f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f37480w;
            if (typeface2 != null) {
                this.f37479v = h4.f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f37476s;
            if (typeface3 == null) {
                typeface3 = this.f37477t;
            }
            this.f37475r = typeface3;
            Typeface typeface4 = this.f37479v;
            if (typeface4 == null) {
                typeface4 = this.f37480w;
            }
            this.f37478u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z10) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f37453a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z10) {
            return;
        }
        c(1.0f, z10);
        CharSequence charSequence = this.f37428B;
        TextPaint textPaint = this.f37440N;
        if (charSequence != null && (staticLayout = this.f37451Y) != null) {
            this.f37458c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f37483z);
        }
        CharSequence charSequence2 = this.f37458c0;
        if (charSequence2 != null) {
            this.f37452Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f37452Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f37465g, this.f37429C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f37459d;
        if (i == 48) {
            this.f37470m = rect.top;
        } else if (i != 80) {
            this.f37470m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f37470m = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f37472o = rect.centerX() - (this.f37452Z / 2.0f);
        } else if (i10 != 5) {
            this.f37472o = rect.left;
        } else {
            this.f37472o = rect.right - this.f37452Z;
        }
        c(0.0f, z10);
        float height = this.f37451Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f37451Y;
        if (staticLayout2 == null || this.f37460d0 <= 1) {
            CharSequence charSequence3 = this.f37428B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f37451Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f37463f, this.f37429C ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f37457c;
        if (i11 == 48) {
            this.f37469l = rect2.top;
        } else if (i11 != 80) {
            this.f37469l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f37469l = textPaint.descent() + (rect2.bottom - height);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f37471n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f37471n = rect2.left;
        } else {
            this.f37471n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.f37431E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f37431E = null;
        }
        l(this.f37455b);
        float f10 = this.f37455b;
        float f11 = f(rect2.left, rect.left, f10, this.f37442P);
        RectF rectF = this.f37461e;
        rectF.left = f11;
        rectF.top = f(this.f37469l, this.f37470m, f10, this.f37442P);
        rectF.right = f(rect2.right, rect.right, f10, this.f37442P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.f37442P);
        this.f37473p = f(this.f37471n, this.f37472o, f10, this.f37442P);
        this.f37474q = f(this.f37469l, this.f37470m, f10, this.f37442P);
        l(f10);
        h1.b bVar = L3.a.f4035b;
        this.f37454a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        textInputLayout.postInvalidateOnAnimation();
        this.f37456b0 = f(1.0f, 0.0f, f10, bVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f37468k;
        ColorStateList colorStateList2 = this.f37467j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, e(colorStateList2), e(this.f37468k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.f37448V;
        float f13 = this.f37449W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, bVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.f37434H = L3.a.a(0.0f, this.f37444R, f10);
        this.f37435I = L3.a.a(0.0f, this.f37445S, f10);
        this.f37436J = L3.a.a(0.0f, this.f37446T, f10);
        int iA = a(f10, 0, e(this.f37447U));
        this.f37437K = iA;
        textPaint.setShadowLayer(this.f37434H, this.f37435I, this.f37436J, iA);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f37468k == colorStateList && this.f37467j == colorStateList) {
            return;
        }
        this.f37468k = colorStateList;
        this.f37467j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        C4413a c4413a = this.f37482y;
        if (c4413a != null) {
            c4413a.f38223d = true;
        }
        if (this.f37477t == typeface) {
            return false;
        }
        this.f37477t = typeface;
        Typeface typefaceA = h4.f.a(this.f37453a.getContext().getResources().getConfiguration(), typeface);
        this.f37476s = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f37477t;
        }
        this.f37475r = typefaceA;
        return true;
    }

    public final void k(float f10) {
        float fG = B7.d.g(f10, 0.0f, 1.0f);
        if (fG != this.f37455b) {
            this.f37455b = fG;
            float f11 = this.f37457c.left;
            Rect rect = this.f37459d;
            float f12 = f(f11, rect.left, fG, this.f37442P);
            RectF rectF = this.f37461e;
            rectF.left = f12;
            rectF.top = f(this.f37469l, this.f37470m, fG, this.f37442P);
            rectF.right = f(r2.right, rect.right, fG, this.f37442P);
            rectF.bottom = f(r2.bottom, rect.bottom, fG, this.f37442P);
            this.f37473p = f(this.f37471n, this.f37472o, fG, this.f37442P);
            this.f37474q = f(this.f37469l, this.f37470m, fG, this.f37442P);
            l(fG);
            h1.b bVar = L3.a.f4035b;
            this.f37454a0 = 1.0f - f(0.0f, 1.0f, 1.0f - fG, bVar);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            TextInputLayout textInputLayout = this.f37453a;
            textInputLayout.postInvalidateOnAnimation();
            this.f37456b0 = f(1.0f, 0.0f, fG, bVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f37468k;
            ColorStateList colorStateList2 = this.f37467j;
            TextPaint textPaint = this.f37440N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(fG, e(colorStateList2), e(this.f37468k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.f37448V;
            float f14 = this.f37449W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, fG, bVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.f37434H = L3.a.a(0.0f, this.f37444R, fG);
            this.f37435I = L3.a.a(0.0f, this.f37445S, fG);
            this.f37436J = L3.a.a(0.0f, this.f37446T, fG);
            int iA = a(fG, 0, e(this.f37447U));
            this.f37437K = iA;
            textPaint.setShadowLayer(this.f37434H, this.f37435I, this.f37436J, iA);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f10) throws g.a {
        c(f10, false);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        this.f37453a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z10;
        boolean zJ = j(typeface);
        if (this.f37480w != typeface) {
            this.f37480w = typeface;
            Typeface typefaceA = h4.f.a(this.f37453a.getContext().getResources().getConfiguration(), typeface);
            this.f37479v = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f37480w;
            }
            this.f37478u = typefaceA;
            z10 = true;
        } else {
            z10 = false;
        }
        if (zJ || z10) {
            h(false);
        }
    }
}
