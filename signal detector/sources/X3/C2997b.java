package x3;

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
import android.view.Gravity;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import e3.AbstractC2303a;
import h0.C2352b;
import m0.C2650a;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2997b {

    /* renamed from: A, reason: collision with root package name */
    public Typeface f24040A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f24041B;

    /* renamed from: C, reason: collision with root package name */
    public Typeface f24042C;

    /* renamed from: D, reason: collision with root package name */
    public Typeface f24043D;

    /* renamed from: E, reason: collision with root package name */
    public D3.b f24044E;

    /* renamed from: F, reason: collision with root package name */
    public D3.b f24045F;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f24047H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f24048I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f24049J;

    /* renamed from: L, reason: collision with root package name */
    public float f24051L;
    public float M;

    /* renamed from: N, reason: collision with root package name */
    public float f24052N;

    /* renamed from: O, reason: collision with root package name */
    public float f24053O;

    /* renamed from: P, reason: collision with root package name */
    public float f24054P;

    /* renamed from: Q, reason: collision with root package name */
    public int f24055Q;

    /* renamed from: R, reason: collision with root package name */
    public int f24056R;

    /* renamed from: S, reason: collision with root package name */
    public int[] f24057S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f24058T;

    /* renamed from: U, reason: collision with root package name */
    public final TextPaint f24059U;

    /* renamed from: V, reason: collision with root package name */
    public final TextPaint f24060V;

    /* renamed from: W, reason: collision with root package name */
    public TimeInterpolator f24061W;

    /* renamed from: X, reason: collision with root package name */
    public TimeInterpolator f24062X;

    /* renamed from: Y, reason: collision with root package name */
    public float f24063Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f24064Z;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f24065a;

    /* renamed from: a0, reason: collision with root package name */
    public float f24066a0;

    /* renamed from: b, reason: collision with root package name */
    public float f24067b;
    public ColorStateList b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24068c;

    /* renamed from: c0, reason: collision with root package name */
    public float f24069c0;

    /* renamed from: d, reason: collision with root package name */
    public float f24070d;

    /* renamed from: d0, reason: collision with root package name */
    public float f24071d0;

    /* renamed from: e, reason: collision with root package name */
    public float f24072e;

    /* renamed from: e0, reason: collision with root package name */
    public float f24073e0;

    /* renamed from: f, reason: collision with root package name */
    public int f24074f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f24075f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f24076g;

    /* renamed from: g0, reason: collision with root package name */
    public float f24077g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f24078h;

    /* renamed from: h0, reason: collision with root package name */
    public float f24079h0;
    public Rect i;

    /* renamed from: i0, reason: collision with root package name */
    public float f24080i0;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f24081j;

    /* renamed from: j0, reason: collision with root package name */
    public StaticLayout f24082j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f24084k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f24086l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f24088m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f24090n0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f24091o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f24093p;

    /* renamed from: q, reason: collision with root package name */
    public int f24095q;

    /* renamed from: r, reason: collision with root package name */
    public float f24097r;

    /* renamed from: s, reason: collision with root package name */
    public float f24099s;

    /* renamed from: t, reason: collision with root package name */
    public float f24101t;

    /* renamed from: u, reason: collision with root package name */
    public float f24103u;

    /* renamed from: v, reason: collision with root package name */
    public float f24105v;
    public boolean v0;

    /* renamed from: w, reason: collision with root package name */
    public float f24106w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f24107x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f24108y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f24109z;

    /* renamed from: k, reason: collision with root package name */
    public int f24083k = 16;

    /* renamed from: l, reason: collision with root package name */
    public int f24085l = 16;

    /* renamed from: m, reason: collision with root package name */
    public float f24087m = 15.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f24089n = 15.0f;

    /* renamed from: G, reason: collision with root package name */
    public TextUtils.TruncateAt f24046G = TextUtils.TruncateAt.END;

    /* renamed from: K, reason: collision with root package name */
    public boolean f24050K = true;

    /* renamed from: o0, reason: collision with root package name */
    public int f24092o0 = 1;

    /* renamed from: p0, reason: collision with root package name */
    public int f24094p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    public float f24096q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    public float f24098r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f24100s0 = 1;

    /* renamed from: t0, reason: collision with root package name */
    public int f24102t0 = -1;

    /* renamed from: u0, reason: collision with root package name */
    public int f24104u0 = -1;

    public C2997b(ViewGroup viewGroup) {
        this.f24065a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.f24059U = textPaint;
        this.f24060V = new TextPaint(textPaint);
        this.f24078h = new Rect();
        this.f24076g = new Rect();
        this.f24081j = new RectF();
        float f2 = this.f24070d;
        this.f24072e = AbstractC1135f5.h(1.0f, f2, 0.5f, f2);
        k(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int a(float f2, int i, int i3) {
        float f5 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i3) * f2) + (Color.alpha(i) * f5)), Math.round((Color.red(i3) * f2) + (Color.red(i) * f5)), Math.round((Color.green(i3) * f2) + (Color.green(i) * f5)), Math.round((Color.blue(i3) * f2) + (Color.blue(i) * f5)));
    }

    public static float j(float f2, float f5, float f6, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return AbstractC2303a.a(f2, f5, f6);
    }

    public static boolean m(Rect rect, int i, int i3, int i6, int i7) {
        return rect.left == i && rect.top == i3 && rect.right == i6 && rect.bottom == i7;
    }

    public final void A(float f2) {
        float fE = d5.y.e(f2, 0.0f, 1.0f);
        if (fE != this.f24067b) {
            this.f24067b = fE;
            b();
        }
    }

    public final void B(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f24047H, charSequence)) {
            this.f24047H = charSequence;
            this.f24048I = null;
            l(false);
        }
    }

    public final boolean C() {
        return this.f24094p0 == 1;
    }

    public final void b() {
        float f2;
        float f5 = this.f24067b;
        boolean z6 = this.f24068c;
        Rect rect = this.f24078h;
        Rect rect2 = this.f24076g;
        RectF rectF = this.f24081j;
        if (z6) {
            if (f5 < this.f24072e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = j(rect2.left, rect.left, f5, this.f24061W);
            rectF.top = j(this.f24097r, this.f24099s, f5, this.f24061W);
            rectF.right = j(rect2.right, rect.right, f5, this.f24061W);
            rectF.bottom = j(rect2.bottom, rect.bottom, f5, this.f24061W);
        }
        boolean z7 = this.f24068c;
        ViewGroup viewGroup = this.f24065a;
        if (!z7) {
            this.f24105v = j(this.f24101t, this.f24103u, f5, this.f24061W);
            this.f24106w = j(this.f24097r, this.f24099s, f5, this.f24061W);
            d(f5, false);
            viewGroup.postInvalidateOnAnimation();
            f2 = f5;
        } else if (f5 < this.f24072e) {
            this.f24105v = this.f24101t;
            this.f24106w = this.f24097r;
            d(0.0f, false);
            viewGroup.postInvalidateOnAnimation();
            f2 = 0.0f;
        } else {
            this.f24105v = this.f24103u;
            this.f24106w = this.f24099s - Math.max(0, this.f24074f);
            d(1.0f, false);
            viewGroup.postInvalidateOnAnimation();
            f2 = 1.0f;
        }
        C2650a c2650a = AbstractC2303a.f19928b;
        this.f24086l0 = 1.0f - j(0.0f, 1.0f, 1.0f - f5, c2650a);
        viewGroup.postInvalidateOnAnimation();
        this.f24088m0 = j(1.0f, 0.0f, f5, c2650a);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f24093p;
        ColorStateList colorStateList2 = this.f24091o;
        TextPaint textPaint = this.f24059U;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f2, h(colorStateList2), h(this.f24093p)));
        } else {
            textPaint.setColor(h(colorStateList));
        }
        float f6 = this.f24077g0;
        float f7 = this.f24079h0;
        if (f6 != f7) {
            textPaint.setLetterSpacing(j(f7, f6, f5, c2650a));
        } else {
            textPaint.setLetterSpacing(f6);
        }
        this.f24052N = AbstractC2303a.a(this.f24069c0, this.f24063Y, f5);
        this.f24053O = AbstractC2303a.a(this.f24071d0, this.f24064Z, f5);
        this.f24054P = AbstractC2303a.a(this.f24073e0, this.f24066a0, f5);
        int iA = a(f5, h(this.f24075f0), h(this.b0));
        this.f24055Q = iA;
        textPaint.setShadowLayer(this.f24052N, this.f24053O, this.f24054P, iA);
        if (this.f24068c) {
            int alpha = textPaint.getAlpha();
            float f8 = this.f24072e;
            textPaint.setAlpha((int) ((f5 <= f8 ? AbstractC2303a.b(1.0f, 0.0f, this.f24070d, f8, f5) : AbstractC2303a.b(0.0f, 1.0f, f8, 1.0f, f5)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint.setShadowLayer(this.f24052N, this.f24053O, this.f24054P, com.bumptech.glide.e.c(this.f24055Q, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z6 = this.f24065a.getLayoutDirection() == 1;
        if (this.f24050K) {
            return (z6 ? P.h.f3122d : P.h.f3121c).e(charSequence, charSequence.length());
        }
        return z6;
    }

    public final void d(float f2, boolean z6) {
        float f5;
        Typeface typeface;
        float f6;
        if (this.f24047H == null) {
            return;
        }
        float fWidth = this.f24078h.width();
        float fWidth2 = this.f24076g.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f5 = C() ? this.f24089n : this.f24087m;
            f6 = C() ? this.f24077g0 : this.f24079h0;
            this.f24051L = C() ? 1.0f : j(this.f24087m, this.f24089n, f2, this.f24062X) / this.f24087m;
            if (!C()) {
                fWidth = fWidth2;
            }
            typeface = this.f24107x;
            fWidth2 = fWidth;
        } else {
            f5 = this.f24087m;
            float f7 = this.f24079h0;
            typeface = this.f24040A;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.f24051L = 1.0f;
            } else {
                this.f24051L = j(this.f24087m, this.f24089n, f2, this.f24062X) / this.f24087m;
            }
            float f8 = this.f24089n / this.f24087m;
            float f9 = fWidth2 * f8;
            if (!z6 && !this.f24068c && f9 > fWidth && C()) {
                fWidth2 = Math.min(fWidth / f8, fWidth2);
            }
            f6 = f7;
        }
        int i = f2 < 0.5f ? this.f24092o0 : this.f24094p0;
        TextPaint textPaint = this.f24059U;
        if (fWidth2 > 0.0f) {
            boolean z7 = this.M != f5;
            boolean z8 = this.f24080i0 != f6;
            boolean z9 = this.f24043D != typeface;
            StaticLayout staticLayout = this.f24082j0;
            boolean z10 = z7 || z8 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z9 || (this.f24056R != i) || this.f24058T;
            this.M = f5;
            this.f24080i0 = f6;
            this.f24043D = typeface;
            this.f24058T = false;
            this.f24056R = i;
            textPaint.setLinearText(this.f24051L != 1.0f);
            z = z10;
        }
        if (this.f24048I == null || z) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.f24043D);
            textPaint.setLetterSpacing(this.f24080i0);
            boolean zC = c(this.f24047H);
            this.f24049J = zC;
            StaticLayout staticLayoutE = e(((this.f24092o0 > 1 || this.f24094p0 > 1) && (!zC || this.f24068c)) ? i : 1, textPaint, this.f24047H, fWidth2 * (C() ? 1.0f : this.f24051L), this.f24049J);
            this.f24082j0 = staticLayoutE;
            this.f24048I = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i, TextPaint textPaint, CharSequence charSequence, float f2, boolean z6) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f24083k, this.f24049J ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f24049J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f24049J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        v vVar = new v(charSequence, textPaint, (int) f2);
        vVar.f24174l = this.f24046G;
        vVar.f24173k = z6;
        vVar.f24168e = alignment;
        vVar.f24172j = false;
        vVar.f24169f = i;
        float f5 = this.f24096q0;
        float f6 = this.f24098r0;
        vVar.f24170g = f5;
        vVar.f24171h = f6;
        vVar.i = this.f24100s0;
        vVar.f24175m = null;
        StaticLayout staticLayoutA = vVar.a();
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final void f(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f24048I != null) {
            RectF rectF = this.f24081j;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            float f2 = this.M;
            TextPaint textPaint = this.f24059U;
            textPaint.setTextSize(f2);
            float f5 = this.f24105v;
            float f6 = this.f24106w;
            float f7 = this.f24051L;
            if (f7 != 1.0f && !this.f24068c) {
                canvas.scale(f7, f7, f5, f6);
            }
            if ((this.f24092o0 > 1 || this.f24094p0 > 1) && ((!this.f24049J || this.f24068c) && C() && (!this.f24068c || this.f24067b > this.f24072e))) {
                float lineStart = this.f24105v - this.f24082j0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f6);
                if (!this.f24068c) {
                    textPaint.setAlpha((int) (this.f24088m0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.f24052N, this.f24053O, this.f24054P, com.bumptech.glide.e.c(this.f24055Q, textPaint.getAlpha()));
                    }
                    this.f24082j0.draw(canvas);
                }
                if (!this.f24068c) {
                    textPaint.setAlpha((int) (this.f24086l0 * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f24052N, this.f24053O, this.f24054P, com.bumptech.glide.e.c(this.f24055Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f24082j0.getLineBaseline(0);
                CharSequence charSequence = this.f24090n0;
                float f8 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f8, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.f24052N, this.f24053O, this.f24054P, this.f24055Q);
                }
                if (!this.f24068c) {
                    String strTrim = this.f24090n0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f24082j0.getLineEnd(0), str.length()), 0.0f, f8, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f5, f6);
                this.f24082j0.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final float g() {
        int i = this.f24102t0;
        if (i != -1) {
            return i;
        }
        float f2 = this.f24089n;
        TextPaint textPaint = this.f24060V;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(this.f24107x);
        textPaint.setLetterSpacing(this.f24077g0);
        return -textPaint.ascent();
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f24057S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float i() {
        float f2 = this.f24087m;
        TextPaint textPaint = this.f24060V;
        textPaint.setTextSize(f2);
        textPaint.setTypeface(this.f24040A);
        textPaint.setLetterSpacing(this.f24079h0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final void k(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f24109z;
            if (typeface != null) {
                this.f24108y = com.bumptech.glide.e.u(configuration, typeface);
            }
            Typeface typeface2 = this.f24042C;
            if (typeface2 != null) {
                this.f24041B = com.bumptech.glide.e.u(configuration, typeface2);
            }
            Typeface typeface3 = this.f24108y;
            if (typeface3 == null) {
                typeface3 = this.f24109z;
            }
            this.f24107x = typeface3;
            Typeface typeface4 = this.f24041B;
            if (typeface4 == null) {
                typeface4 = this.f24042C;
            }
            this.f24040A = typeface4;
            l(true);
        }
    }

    public final void l(boolean z6) {
        float fMeasureText;
        ViewGroup viewGroup = this.f24065a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z6) {
            return;
        }
        d(1.0f, z6);
        CharSequence charSequence = this.f24048I;
        TextPaint textPaint = this.f24059U;
        if (charSequence != null && this.f24082j0 != null) {
            this.f24090n0 = C() ? TextUtils.ellipsize(this.f24048I, textPaint, this.f24082j0.getWidth(), this.f24046G) : this.f24048I;
        }
        CharSequence charSequence2 = this.f24090n0;
        if (charSequence2 != null) {
            this.f24084k0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f24084k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f24085l, this.f24049J ? 1 : 0);
        Rect rect = this.i;
        Rect rect2 = this.f24078h;
        if (rect == null) {
            rect = rect2;
        }
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.f24099s = rect.top;
        } else if (i != 80) {
            this.f24099s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f24099s = textPaint.ascent() + rect.bottom;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 == 1) {
            this.f24103u = rect.centerX() - (this.f24084k0 / 2.0f);
        } else if (i3 != 5) {
            this.f24103u = rect.left;
        } else {
            this.f24103u = rect.right - this.f24084k0;
        }
        if (this.f24084k0 <= rect2.width()) {
            float f2 = this.f24103u;
            float fMax = Math.max(0.0f, rect2.left - f2) + f2;
            this.f24103u = fMax;
            this.f24103u = Math.min(0.0f, rect2.right - (this.f24084k0 + fMax)) + fMax;
        }
        float f5 = this.f24089n;
        TextPaint textPaint2 = this.f24060V;
        textPaint2.setTextSize(f5);
        textPaint2.setTypeface(this.f24107x);
        textPaint2.setLetterSpacing(this.f24077g0);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect2.height()) {
            float f6 = this.f24099s;
            float fMax2 = Math.max(0.0f, rect2.top - f6) + f6;
            this.f24099s = fMax2;
            this.f24099s = Math.min(0.0f, rect2.bottom - (g() + fMax2)) + fMax2;
        }
        d(0.0f, z6);
        float height = this.f24082j0 != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.f24082j0;
        if (staticLayout == null || this.f24092o0 <= 1) {
            CharSequence charSequence3 = this.f24048I;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.f24082j0;
        this.f24095q = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f24083k, this.f24049J ? 1 : 0);
        int i6 = absoluteGravity2 & 112;
        Rect rect3 = this.f24076g;
        if (i6 == 48) {
            this.f24097r = rect3.top;
        } else if (i6 != 80) {
            this.f24097r = rect3.centerY() - (height / 2.0f);
        } else {
            this.f24097r = (rect3.bottom - height) + (this.v0 ? textPaint.descent() : 0.0f);
        }
        int i7 = absoluteGravity2 & 8388615;
        if (i7 == 1) {
            this.f24101t = rect3.centerX() - (fMeasureText / 2.0f);
        } else if (i7 != 5) {
            this.f24101t = rect3.left;
        } else {
            this.f24101t = rect3.right - fMeasureText;
        }
        d(this.f24067b, false);
        viewGroup.postInvalidateOnAnimation();
        b();
    }

    public final void n(ColorStateList colorStateList) {
        if (this.f24093p == colorStateList && this.f24091o == colorStateList) {
            return;
        }
        this.f24093p = colorStateList;
        this.f24091o = colorStateList;
        l(false);
    }

    public final void o(int i, int i3, int i6, int i7) {
        Rect rect = this.f24078h;
        if (m(rect, i, i3, i6, i7)) {
            return;
        }
        rect.set(i, i3, i6, i7);
        this.f24058T = true;
    }

    public final void p(int i, int i3, int i6, int i7) {
        if (this.i == null) {
            this.i = new Rect(i, i3, i6, i7);
            this.f24058T = true;
        }
        if (m(this.i, i, i3, i6, i7)) {
            return;
        }
        this.i.set(i, i3, i6, i7);
        this.f24058T = true;
    }

    public final void q(int i) {
        ViewGroup viewGroup = this.f24065a;
        D3.e eVar = new D3.e(viewGroup.getContext(), i);
        ColorStateList colorStateList = eVar.f1276k;
        if (colorStateList != null) {
            this.f24093p = colorStateList;
        }
        float f2 = eVar.f1277l;
        if (f2 != 0.0f) {
            this.f24089n = f2;
        }
        ColorStateList colorStateList2 = eVar.f1267a;
        if (colorStateList2 != null) {
            this.b0 = colorStateList2;
        }
        this.f24064Z = eVar.f1272f;
        this.f24066a0 = eVar.f1273g;
        this.f24063Y = eVar.f1274h;
        this.f24077g0 = eVar.f1275j;
        D3.b bVar = this.f24045F;
        if (bVar != null) {
            bVar.f1261c = true;
        }
        C2352b c2352b = new C2352b(16, this);
        eVar.a();
        this.f24045F = new D3.b(c2352b, eVar.f1281p);
        eVar.b(viewGroup.getContext(), this.f24045F);
        l(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.f24093p != colorStateList) {
            this.f24093p = colorStateList;
            l(false);
        }
    }

    public final void s(int i) {
        if (this.f24085l != i) {
            this.f24085l = i;
            l(false);
        }
    }

    public final boolean t(Typeface typeface) {
        D3.b bVar = this.f24045F;
        if (bVar != null) {
            bVar.f1261c = true;
        }
        if (this.f24109z == typeface) {
            return false;
        }
        this.f24109z = typeface;
        Typeface typefaceU = com.bumptech.glide.e.u(this.f24065a.getContext().getResources().getConfiguration(), typeface);
        this.f24108y = typefaceU;
        if (typefaceU == null) {
            typefaceU = this.f24109z;
        }
        this.f24107x = typefaceU;
        return true;
    }

    public final void u(int i, int i3, int i6, int i7, boolean z6) {
        Rect rect = this.f24076g;
        if (m(rect, i, i3, i6, i7) && z6 == this.v0) {
            return;
        }
        rect.set(i, i3, i6, i7);
        this.f24058T = true;
        this.v0 = z6;
    }

    public final void v(int i) {
        if (i != this.f24092o0) {
            this.f24092o0 = i;
            l(false);
        }
    }

    public final void w(int i) {
        ViewGroup viewGroup = this.f24065a;
        D3.e eVar = new D3.e(viewGroup.getContext(), i);
        ColorStateList colorStateList = eVar.f1276k;
        if (colorStateList != null) {
            this.f24091o = colorStateList;
        }
        float f2 = eVar.f1277l;
        if (f2 != 0.0f) {
            this.f24087m = f2;
        }
        ColorStateList colorStateList2 = eVar.f1267a;
        if (colorStateList2 != null) {
            this.f24075f0 = colorStateList2;
        }
        this.f24071d0 = eVar.f1272f;
        this.f24073e0 = eVar.f1273g;
        this.f24069c0 = eVar.f1274h;
        this.f24079h0 = eVar.f1275j;
        D3.b bVar = this.f24044E;
        if (bVar != null) {
            bVar.f1261c = true;
        }
        d4.h hVar = new d4.h(23, this);
        eVar.a();
        this.f24044E = new D3.b(hVar, eVar.f1281p);
        eVar.b(viewGroup.getContext(), this.f24044E);
        l(false);
    }

    public final void x(int i) {
        if (this.f24083k != i) {
            this.f24083k = i;
            l(false);
        }
    }

    public final void y(float f2) {
        if (this.f24087m != f2) {
            this.f24087m = f2;
            l(false);
        }
    }

    public final boolean z(Typeface typeface) {
        D3.b bVar = this.f24044E;
        if (bVar != null) {
            bVar.f1261c = true;
        }
        if (this.f24042C == typeface) {
            return false;
        }
        this.f24042C = typeface;
        Typeface typefaceU = com.bumptech.glide.e.u(this.f24065a.getContext().getResources().getConfiguration(), typeface);
        this.f24041B = typefaceU;
        if (typefaceU == null) {
            typefaceU = this.f24042C;
        }
        this.f24040A = typefaceU;
        return true;
    }
}
