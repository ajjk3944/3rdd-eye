package com.google.android.material.chip;

import O3.j;
import P3.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import c4.d;
import com.google.android.material.internal.i;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import d4.AbstractC5301b;
import f4.C5527g;
import i.AbstractC6050a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.MPv3;
import w1.AbstractC8253a;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public class a extends C5527g implements Drawable.Callback, i.b {

    /* renamed from: a2, reason: collision with root package name */
    private static final int[] f37270a2 = {R.attr.state_enabled};

    /* renamed from: b2, reason: collision with root package name */
    private static final ShapeDrawable f37271b2 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f37272A;

    /* renamed from: A1, reason: collision with root package name */
    private final Paint.FontMetrics f37273A1;

    /* renamed from: B, reason: collision with root package name */
    private float f37274B;

    /* renamed from: B1, reason: collision with root package name */
    private final RectF f37275B1;

    /* renamed from: C, reason: collision with root package name */
    private float f37276C;

    /* renamed from: C1, reason: collision with root package name */
    private final PointF f37277C1;

    /* renamed from: D, reason: collision with root package name */
    private ColorStateList f37278D;

    /* renamed from: D1, reason: collision with root package name */
    private final Path f37279D1;

    /* renamed from: E, reason: collision with root package name */
    private float f37280E;

    /* renamed from: E1, reason: collision with root package name */
    private final i f37281E1;

    /* renamed from: F, reason: collision with root package name */
    private ColorStateList f37282F;

    /* renamed from: F1, reason: collision with root package name */
    private int f37283F1;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f37284G;

    /* renamed from: G1, reason: collision with root package name */
    private int f37285G1;

    /* renamed from: H, reason: collision with root package name */
    private boolean f37286H;

    /* renamed from: H1, reason: collision with root package name */
    private int f37287H1;

    /* renamed from: I, reason: collision with root package name */
    private Drawable f37288I;

    /* renamed from: I1, reason: collision with root package name */
    private int f37289I1;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f37290J;

    /* renamed from: J1, reason: collision with root package name */
    private int f37291J1;

    /* renamed from: K1, reason: collision with root package name */
    private int f37292K1;

    /* renamed from: L1, reason: collision with root package name */
    private boolean f37293L1;

    /* renamed from: M1, reason: collision with root package name */
    private int f37294M1;

    /* renamed from: N, reason: collision with root package name */
    private float f37295N;

    /* renamed from: N1, reason: collision with root package name */
    private int f37296N1;

    /* renamed from: O1, reason: collision with root package name */
    private ColorFilter f37297O1;

    /* renamed from: P1, reason: collision with root package name */
    private PorterDuffColorFilter f37298P1;

    /* renamed from: Q1, reason: collision with root package name */
    private ColorStateList f37299Q1;

    /* renamed from: R1, reason: collision with root package name */
    private PorterDuff.Mode f37300R1;

    /* renamed from: S1, reason: collision with root package name */
    private int[] f37301S1;

    /* renamed from: T1, reason: collision with root package name */
    private boolean f37302T1;

    /* renamed from: U1, reason: collision with root package name */
    private ColorStateList f37303U1;

    /* renamed from: V1, reason: collision with root package name */
    private WeakReference f37304V1;

    /* renamed from: W1, reason: collision with root package name */
    private TextUtils.TruncateAt f37305W1;

    /* renamed from: X, reason: collision with root package name */
    private boolean f37306X;

    /* renamed from: X1, reason: collision with root package name */
    private boolean f37307X1;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f37308Y;

    /* renamed from: Y1, reason: collision with root package name */
    private int f37309Y1;

    /* renamed from: Z, reason: collision with root package name */
    private Drawable f37310Z;

    /* renamed from: Z1, reason: collision with root package name */
    private boolean f37311Z1;

    /* renamed from: f1, reason: collision with root package name */
    private Drawable f37312f1;

    /* renamed from: g1, reason: collision with root package name */
    private ColorStateList f37313g1;

    /* renamed from: h1, reason: collision with root package name */
    private float f37314h1;

    /* renamed from: i1, reason: collision with root package name */
    private CharSequence f37315i1;

    /* renamed from: j1, reason: collision with root package name */
    private boolean f37316j1;

    /* renamed from: k1, reason: collision with root package name */
    private boolean f37317k1;

    /* renamed from: l1, reason: collision with root package name */
    private Drawable f37318l1;

    /* renamed from: m1, reason: collision with root package name */
    private ColorStateList f37319m1;

    /* renamed from: n1, reason: collision with root package name */
    private c f37320n1;

    /* renamed from: o1, reason: collision with root package name */
    private c f37321o1;

    /* renamed from: p1, reason: collision with root package name */
    private float f37322p1;

    /* renamed from: q1, reason: collision with root package name */
    private float f37323q1;

    /* renamed from: r1, reason: collision with root package name */
    private float f37324r1;

    /* renamed from: s1, reason: collision with root package name */
    private float f37325s1;

    /* renamed from: t1, reason: collision with root package name */
    private float f37326t1;

    /* renamed from: u1, reason: collision with root package name */
    private float f37327u1;

    /* renamed from: v1, reason: collision with root package name */
    private float f37328v1;

    /* renamed from: w1, reason: collision with root package name */
    private float f37329w1;

    /* renamed from: x1, reason: collision with root package name */
    private final Context f37330x1;

    /* renamed from: y1, reason: collision with root package name */
    private final Paint f37331y1;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f37332z;

    /* renamed from: z1, reason: collision with root package name */
    private final Paint f37333z1;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC1204a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f37276C = -1.0f;
        this.f37331y1 = new Paint(1);
        this.f37273A1 = new Paint.FontMetrics();
        this.f37275B1 = new RectF();
        this.f37277C1 = new PointF();
        this.f37279D1 = new Path();
        this.f37296N1 = 255;
        this.f37300R1 = PorterDuff.Mode.SRC_IN;
        this.f37304V1 = new WeakReference(null);
        J(context);
        this.f37330x1 = context;
        i iVar = new i(this);
        this.f37281E1 = iVar;
        this.f37284G = "";
        iVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f37333z1 = null;
        int[] iArr = f37270a2;
        setState(iArr);
        f2(iArr);
        this.f37307X1 = true;
        if (AbstractC5301b.f45755a) {
            f37271b2.setTint(-1);
        }
    }

    private boolean H2() {
        return this.f37317k1 && this.f37318l1 != null && this.f37293L1;
    }

    private boolean I2() {
        return this.f37286H && this.f37288I != null;
    }

    private boolean J2() {
        return this.f37308Y && this.f37310Z != null;
    }

    private void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void L2() {
        this.f37303U1 = this.f37302T1 ? AbstractC5301b.a(this.f37282F) : null;
    }

    private void M2() {
        this.f37312f1 = new RippleDrawable(AbstractC5301b.a(Z0()), this.f37310Z, f37271b2);
    }

    private float T0() {
        Drawable drawable = this.f37293L1 ? this.f37318l1 : this.f37288I;
        float fCeil = this.f37295N;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(n.c(this.f37330x1, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private float U0() {
        Drawable drawable = this.f37293L1 ? this.f37318l1 : this.f37288I;
        float f10 = this.f37295N;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void V1(ColorStateList colorStateList) {
        if (this.f37332z != colorStateList) {
            this.f37332z = colorStateList;
            onStateChange(getState());
        }
    }

    private void e0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        AbstractC8416a.m(drawable, AbstractC8416a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f37310Z) {
            if (drawable.isStateful()) {
                drawable.setState(Q0());
            }
            AbstractC8416a.o(drawable, this.f37313g1);
            return;
        }
        Drawable drawable2 = this.f37288I;
        if (drawable == drawable2 && this.f37306X) {
            AbstractC8416a.o(drawable2, this.f37290J);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void f0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f10 = this.f37322p1 + this.f37323q1;
            float fU0 = U0();
            if (AbstractC8416a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fU0;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fU0;
            }
            float fT0 = T0();
            float fExactCenterY = rect.exactCenterY() - (fT0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fT0;
        }
    }

    private ColorFilter f1() {
        ColorFilter colorFilter = this.f37297O1;
        return colorFilter != null ? colorFilter : this.f37298P1;
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f10 = this.f37329w1 + this.f37328v1 + this.f37314h1 + this.f37327u1 + this.f37326t1;
            if (AbstractC8416a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean h1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f10 = this.f37329w1 + this.f37328v1;
            if (AbstractC8416a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f37314h1;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f37314h1;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f37314h1;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f10 = this.f37329w1 + this.f37328v1 + this.f37314h1 + this.f37327u1 + this.f37326t1;
            if (AbstractC8416a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f37284G != null) {
            float fG0 = this.f37322p1 + g0() + this.f37325s1;
            float fK0 = this.f37329w1 + k0() + this.f37326t1;
            if (AbstractC8416a.f(this) == 0) {
                rectF.left = rect.left + fG0;
                rectF.right = rect.right - fK0;
            } else {
                rectF.left = rect.left + fK0;
                rectF.right = rect.right - fG0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean l1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float m0() {
        this.f37281E1.f().getFontMetrics(this.f37273A1);
        Paint.FontMetrics fontMetrics = this.f37273A1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean m1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean n1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean o0() {
        return this.f37317k1 && this.f37318l1 != null && this.f37316j1;
    }

    private void o1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = k.i(this.f37330x1, attributeSet, j.f17365b0, i10, i11, new int[0]);
        this.f37311Z1 = typedArrayI.hasValue(j.f17251M0);
        V1(c4.c.a(this.f37330x1, typedArrayI, j.f17557z0));
        z1(c4.c.a(this.f37330x1, typedArrayI, j.f17453m0));
        N1(typedArrayI.getDimension(j.f17517u0, 0.0f));
        int i12 = j.f17461n0;
        if (typedArrayI.hasValue(i12)) {
            B1(typedArrayI.getDimension(i12, 0.0f));
        }
        R1(c4.c.a(this.f37330x1, typedArrayI, j.f17541x0));
        T1(typedArrayI.getDimension(j.f17549y0, 0.0f));
        s2(c4.c.a(this.f37330x1, typedArrayI, j.f17243L0));
        x2(typedArrayI.getText(j.f17405g0));
        d dVarF = c4.c.f(this.f37330x1, typedArrayI, j.f17373c0);
        dVarF.l(typedArrayI.getDimension(j.f17381d0, dVarF.j()));
        y2(dVarF);
        int i13 = typedArrayI.getInt(j.f17389e0, 0);
        if (i13 == 1) {
            k2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            k2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            k2(TextUtils.TruncateAt.END);
        }
        M1(typedArrayI.getBoolean(j.f17509t0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            M1(typedArrayI.getBoolean(j.f17485q0, false));
        }
        F1(c4.c.d(this.f37330x1, typedArrayI, j.f17477p0));
        int i14 = j.f17501s0;
        if (typedArrayI.hasValue(i14)) {
            J1(c4.c.a(this.f37330x1, typedArrayI, i14));
        }
        H1(typedArrayI.getDimension(j.f17493r0, -1.0f));
        i2(typedArrayI.getBoolean(j.f17203G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            i2(typedArrayI.getBoolean(j.f17163B0, false));
        }
        W1(c4.c.d(this.f37330x1, typedArrayI, j.f17155A0));
        g2(c4.c.a(this.f37330x1, typedArrayI, j.f17195F0));
        b2(typedArrayI.getDimension(j.f17179D0, 0.0f));
        r1(typedArrayI.getBoolean(j.f17413h0, false));
        y1(typedArrayI.getBoolean(j.f17445l0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            y1(typedArrayI.getBoolean(j.f17429j0, false));
        }
        t1(c4.c.d(this.f37330x1, typedArrayI, j.f17421i0));
        int i15 = j.f17437k0;
        if (typedArrayI.hasValue(i15)) {
            v1(c4.c.a(this.f37330x1, typedArrayI, i15));
        }
        v2(c.b(this.f37330x1, typedArrayI, j.f17259N0));
        l2(c.b(this.f37330x1, typedArrayI, j.f17219I0));
        P1(typedArrayI.getDimension(j.f17533w0, 0.0f));
        p2(typedArrayI.getDimension(j.f17235K0, 0.0f));
        n2(typedArrayI.getDimension(j.f17227J0, 0.0f));
        D2(typedArrayI.getDimension(j.f17275P0, 0.0f));
        A2(typedArrayI.getDimension(j.f17267O0, 0.0f));
        d2(typedArrayI.getDimension(j.f17187E0, 0.0f));
        Y1(typedArrayI.getDimension(j.f17171C0, 0.0f));
        D1(typedArrayI.getDimension(j.f17469o0, 0.0f));
        r2(typedArrayI.getDimensionPixelSize(j.f17397f0, MPv3.MAX_MESSAGE_ID));
        typedArrayI.recycle();
    }

    public static a p0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.o1(attributeSet, i10, i11);
        return aVar;
    }

    private void q0(Canvas canvas, Rect rect) {
        if (H2()) {
            f0(rect, this.f37275B1);
            RectF rectF = this.f37275B1;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f37318l1.setBounds(0, 0, (int) this.f37275B1.width(), (int) this.f37275B1.height());
            this.f37318l1.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean q1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f37332z;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f37283F1) : 0);
        boolean state = true;
        if (this.f37283F1 != iL) {
            this.f37283F1 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f37272A;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f37285G1) : 0);
        if (this.f37285G1 != iL2) {
            this.f37285G1 = iL2;
            zOnStateChange = true;
        }
        int i10 = V3.a.i(iL, iL2);
        if ((this.f37287H1 != i10) | (v() == null)) {
            this.f37287H1 = i10;
            T(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f37278D;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f37289I1) : 0;
        if (this.f37289I1 != colorForState) {
            this.f37289I1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f37303U1 == null || !AbstractC5301b.b(iArr)) ? 0 : this.f37303U1.getColorForState(iArr, this.f37291J1);
        if (this.f37291J1 != colorForState2) {
            this.f37291J1 = colorForState2;
            if (this.f37302T1) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f37281E1.e() == null || this.f37281E1.e().i() == null) ? 0 : this.f37281E1.e().i().getColorForState(iArr, this.f37292K1);
        if (this.f37292K1 != colorForState3) {
            this.f37292K1 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = h1(getState(), R.attr.state_checked) && this.f37316j1;
        if (this.f37293L1 == z11 || this.f37318l1 == null) {
            z10 = false;
        } else {
            float fG0 = g0();
            this.f37293L1 = z11;
            if (fG0 != g0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f37299Q1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f37294M1) : 0;
        if (this.f37294M1 != colorForState4) {
            this.f37294M1 = colorForState4;
            this.f37298P1 = com.google.android.material.drawable.d.j(this, this.f37299Q1, this.f37300R1);
        } else {
            state = zOnStateChange;
        }
        if (m1(this.f37288I)) {
            state |= this.f37288I.setState(iArr);
        }
        if (m1(this.f37318l1)) {
            state |= this.f37318l1.setState(iArr);
        }
        if (m1(this.f37310Z)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f37310Z.setState(iArr3);
        }
        if (AbstractC5301b.f45755a && m1(this.f37312f1)) {
            state |= this.f37312f1.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            p1();
        }
        return state;
    }

    private void r0(Canvas canvas, Rect rect) {
        if (this.f37311Z1) {
            return;
        }
        this.f37331y1.setColor(this.f37285G1);
        this.f37331y1.setStyle(Paint.Style.FILL);
        this.f37331y1.setColorFilter(f1());
        this.f37275B1.set(rect);
        canvas.drawRoundRect(this.f37275B1, C0(), C0(), this.f37331y1);
    }

    private void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            f0(rect, this.f37275B1);
            RectF rectF = this.f37275B1;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f37288I.setBounds(0, 0, (int) this.f37275B1.width(), (int) this.f37275B1.height());
            this.f37288I.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.f37280E <= 0.0f || this.f37311Z1) {
            return;
        }
        this.f37331y1.setColor(this.f37289I1);
        this.f37331y1.setStyle(Paint.Style.STROKE);
        if (!this.f37311Z1) {
            this.f37331y1.setColorFilter(f1());
        }
        RectF rectF = this.f37275B1;
        float f10 = rect.left;
        float f11 = this.f37280E;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f37276C - (this.f37280E / 2.0f);
        canvas.drawRoundRect(this.f37275B1, f12, f12, this.f37331y1);
    }

    private void u0(Canvas canvas, Rect rect) {
        if (this.f37311Z1) {
            return;
        }
        this.f37331y1.setColor(this.f37283F1);
        this.f37331y1.setStyle(Paint.Style.FILL);
        this.f37275B1.set(rect);
        canvas.drawRoundRect(this.f37275B1, C0(), C0(), this.f37331y1);
    }

    private void v0(Canvas canvas, Rect rect) {
        if (J2()) {
            i0(rect, this.f37275B1);
            RectF rectF = this.f37275B1;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f37310Z.setBounds(0, 0, (int) this.f37275B1.width(), (int) this.f37275B1.height());
            if (AbstractC5301b.f45755a) {
                this.f37312f1.setBounds(this.f37310Z.getBounds());
                this.f37312f1.jumpToCurrentState();
                this.f37312f1.draw(canvas);
            } else {
                this.f37310Z.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void w0(Canvas canvas, Rect rect) {
        this.f37331y1.setColor(this.f37291J1);
        this.f37331y1.setStyle(Paint.Style.FILL);
        this.f37275B1.set(rect);
        if (!this.f37311Z1) {
            canvas.drawRoundRect(this.f37275B1, C0(), C0(), this.f37331y1);
        } else {
            h(new RectF(rect), this.f37279D1);
            super.p(canvas, this.f37331y1, this.f37279D1, s());
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        Paint paint = this.f37333z1;
        if (paint != null) {
            paint.setColor(AbstractC8253a.k(-16777216, BER.MAX_OID_LENGTH));
            canvas.drawRect(rect, this.f37333z1);
            if (I2() || H2()) {
                f0(rect, this.f37275B1);
                canvas.drawRect(this.f37275B1, this.f37333z1);
            }
            if (this.f37284G != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f37333z1);
            }
            if (J2()) {
                i0(rect, this.f37275B1);
                canvas.drawRect(this.f37275B1, this.f37333z1);
            }
            this.f37333z1.setColor(AbstractC8253a.k(-65536, BER.MAX_OID_LENGTH));
            h0(rect, this.f37275B1);
            canvas.drawRect(this.f37275B1, this.f37333z1);
            this.f37333z1.setColor(AbstractC8253a.k(-16711936, BER.MAX_OID_LENGTH));
            j0(rect, this.f37275B1);
            canvas.drawRect(this.f37275B1, this.f37333z1);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.f37284G != null) {
            Paint.Align alignN0 = n0(rect, this.f37277C1);
            l0(rect, this.f37275B1);
            if (this.f37281E1.e() != null) {
                this.f37281E1.f().drawableState = getState();
                this.f37281E1.l(this.f37330x1);
            }
            this.f37281E1.f().setTextAlign(alignN0);
            int iSave = 0;
            boolean z10 = Math.round(this.f37281E1.g(b1().toString())) > Math.round(this.f37275B1.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f37275B1);
            }
            CharSequence charSequenceEllipsize = this.f37284G;
            if (z10 && this.f37305W1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f37281E1.f(), this.f37275B1.width(), this.f37305W1);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f37277C1;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f37281E1.f());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public ColorStateList A0() {
        return this.f37319m1;
    }

    public void A1(int i10) {
        z1(AbstractC6050a.a(this.f37330x1, i10));
    }

    public void A2(float f10) {
        if (this.f37326t1 != f10) {
            this.f37326t1 = f10;
            invalidateSelf();
            p1();
        }
    }

    public ColorStateList B0() {
        return this.f37272A;
    }

    public void B1(float f10) {
        if (this.f37276C != f10) {
            this.f37276C = f10;
            setShapeAppearanceModel(A().w(f10));
        }
    }

    public void B2(int i10) {
        A2(this.f37330x1.getResources().getDimension(i10));
    }

    public float C0() {
        return this.f37311Z1 ? C() : this.f37276C;
    }

    public void C1(int i10) {
        B1(this.f37330x1.getResources().getDimension(i10));
    }

    public void C2(float f10) {
        d dVarC1 = c1();
        if (dVarC1 != null) {
            dVarC1.l(f10);
            this.f37281E1.f().setTextSize(f10);
            a();
        }
    }

    public float D0() {
        return this.f37329w1;
    }

    public void D1(float f10) {
        if (this.f37329w1 != f10) {
            this.f37329w1 = f10;
            invalidateSelf();
            p1();
        }
    }

    public void D2(float f10) {
        if (this.f37325s1 != f10) {
            this.f37325s1 = f10;
            invalidateSelf();
            p1();
        }
    }

    public Drawable E0() {
        Drawable drawable = this.f37288I;
        if (drawable != null) {
            return AbstractC8416a.q(drawable);
        }
        return null;
    }

    public void E1(int i10) {
        D1(this.f37330x1.getResources().getDimension(i10));
    }

    public void E2(int i10) {
        D2(this.f37330x1.getResources().getDimension(i10));
    }

    public float F0() {
        return this.f37295N;
    }

    public void F1(Drawable drawable) {
        Drawable drawableE0 = E0();
        if (drawableE0 != drawable) {
            float fG0 = g0();
            this.f37288I = drawable != null ? AbstractC8416a.r(drawable).mutate() : null;
            float fG02 = g0();
            K2(drawableE0);
            if (I2()) {
                e0(this.f37288I);
            }
            invalidateSelf();
            if (fG0 != fG02) {
                p1();
            }
        }
    }

    public void F2(boolean z10) {
        if (this.f37302T1 != z10) {
            this.f37302T1 = z10;
            L2();
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.f37290J;
    }

    public void G1(int i10) {
        F1(AbstractC6050a.b(this.f37330x1, i10));
    }

    boolean G2() {
        return this.f37307X1;
    }

    public float H0() {
        return this.f37274B;
    }

    public void H1(float f10) {
        if (this.f37295N != f10) {
            float fG0 = g0();
            this.f37295N = f10;
            float fG02 = g0();
            invalidateSelf();
            if (fG0 != fG02) {
                p1();
            }
        }
    }

    public float I0() {
        return this.f37322p1;
    }

    public void I1(int i10) {
        H1(this.f37330x1.getResources().getDimension(i10));
    }

    public ColorStateList J0() {
        return this.f37278D;
    }

    public void J1(ColorStateList colorStateList) {
        this.f37306X = true;
        if (this.f37290J != colorStateList) {
            this.f37290J = colorStateList;
            if (I2()) {
                AbstractC8416a.o(this.f37288I, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float K0() {
        return this.f37280E;
    }

    public void K1(int i10) {
        J1(AbstractC6050a.a(this.f37330x1, i10));
    }

    public Drawable L0() {
        Drawable drawable = this.f37310Z;
        if (drawable != null) {
            return AbstractC8416a.q(drawable);
        }
        return null;
    }

    public void L1(int i10) {
        M1(this.f37330x1.getResources().getBoolean(i10));
    }

    public CharSequence M0() {
        return this.f37315i1;
    }

    public void M1(boolean z10) {
        if (this.f37286H != z10) {
            boolean zI2 = I2();
            this.f37286H = z10;
            boolean zI22 = I2();
            if (zI2 != zI22) {
                if (zI22) {
                    e0(this.f37288I);
                } else {
                    K2(this.f37288I);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public float N0() {
        return this.f37328v1;
    }

    public void N1(float f10) {
        if (this.f37274B != f10) {
            this.f37274B = f10;
            invalidateSelf();
            p1();
        }
    }

    public float O0() {
        return this.f37314h1;
    }

    public void O1(int i10) {
        N1(this.f37330x1.getResources().getDimension(i10));
    }

    public float P0() {
        return this.f37327u1;
    }

    public void P1(float f10) {
        if (this.f37322p1 != f10) {
            this.f37322p1 = f10;
            invalidateSelf();
            p1();
        }
    }

    public int[] Q0() {
        return this.f37301S1;
    }

    public void Q1(int i10) {
        P1(this.f37330x1.getResources().getDimension(i10));
    }

    public ColorStateList R0() {
        return this.f37313g1;
    }

    public void R1(ColorStateList colorStateList) {
        if (this.f37278D != colorStateList) {
            this.f37278D = colorStateList;
            if (this.f37311Z1) {
                Z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void S0(RectF rectF) {
        j0(getBounds(), rectF);
    }

    public void S1(int i10) {
        R1(AbstractC6050a.a(this.f37330x1, i10));
    }

    public void T1(float f10) {
        if (this.f37280E != f10) {
            this.f37280E = f10;
            this.f37331y1.setStrokeWidth(f10);
            if (this.f37311Z1) {
                super.a0(f10);
            }
            invalidateSelf();
        }
    }

    public void U1(int i10) {
        T1(this.f37330x1.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt V0() {
        return this.f37305W1;
    }

    public c W0() {
        return this.f37321o1;
    }

    public void W1(Drawable drawable) {
        Drawable drawableL0 = L0();
        if (drawableL0 != drawable) {
            float fK0 = k0();
            this.f37310Z = drawable != null ? AbstractC8416a.r(drawable).mutate() : null;
            if (AbstractC5301b.f45755a) {
                M2();
            }
            float fK02 = k0();
            K2(drawableL0);
            if (J2()) {
                e0(this.f37310Z);
            }
            invalidateSelf();
            if (fK0 != fK02) {
                p1();
            }
        }
    }

    public float X0() {
        return this.f37324r1;
    }

    public void X1(CharSequence charSequence) {
        if (this.f37315i1 != charSequence) {
            this.f37315i1 = D1.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Y0() {
        return this.f37323q1;
    }

    public void Y1(float f10) {
        if (this.f37328v1 != f10) {
            this.f37328v1 = f10;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public ColorStateList Z0() {
        return this.f37282F;
    }

    public void Z1(int i10) {
        Y1(this.f37330x1.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.internal.i.b
    public void a() {
        p1();
        invalidateSelf();
    }

    public c a1() {
        return this.f37320n1;
    }

    public void a2(int i10) {
        W1(AbstractC6050a.b(this.f37330x1, i10));
    }

    public CharSequence b1() {
        return this.f37284G;
    }

    public void b2(float f10) {
        if (this.f37314h1 != f10) {
            this.f37314h1 = f10;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public d c1() {
        return this.f37281E1.e();
    }

    public void c2(int i10) {
        b2(this.f37330x1.getResources().getDimension(i10));
    }

    public float d1() {
        return this.f37326t1;
    }

    public void d2(float f10) {
        if (this.f37327u1 != f10) {
            this.f37327u1 = f10;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f37296N1;
        int iA = i10 < 255 ? R3.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i10) : 0;
        u0(canvas, bounds);
        r0(canvas, bounds);
        if (this.f37311Z1) {
            super.draw(canvas);
        }
        t0(canvas, bounds);
        w0(canvas, bounds);
        s0(canvas, bounds);
        q0(canvas, bounds);
        if (this.f37307X1) {
            y0(canvas, bounds);
        }
        v0(canvas, bounds);
        x0(canvas, bounds);
        if (this.f37296N1 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public float e1() {
        return this.f37325s1;
    }

    public void e2(int i10) {
        d2(this.f37330x1.getResources().getDimension(i10));
    }

    public boolean f2(int[] iArr) {
        if (Arrays.equals(this.f37301S1, iArr)) {
            return false;
        }
        this.f37301S1 = iArr;
        if (J2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    float g0() {
        if (I2() || H2()) {
            return this.f37323q1 + U0() + this.f37324r1;
        }
        return 0.0f;
    }

    public boolean g1() {
        return this.f37302T1;
    }

    public void g2(ColorStateList colorStateList) {
        if (this.f37313g1 != colorStateList) {
            this.f37313g1 = colorStateList;
            if (J2()) {
                AbstractC8416a.o(this.f37310Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37296N1;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f37297O1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f37274B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f37322p1 + g0() + this.f37325s1 + this.f37281E1.g(b1().toString()) + this.f37326t1 + k0() + this.f37329w1), this.f37309Y1);
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f37311Z1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f37276C);
        } else {
            outline.setRoundRect(bounds, this.f37276C);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public void h2(int i10) {
        g2(AbstractC6050a.a(this.f37330x1, i10));
    }

    public boolean i1() {
        return this.f37316j1;
    }

    public void i2(boolean z10) {
        if (this.f37308Y != z10) {
            boolean zJ2 = J2();
            this.f37308Y = z10;
            boolean zJ22 = J2();
            if (zJ2 != zJ22) {
                if (zJ22) {
                    e0(this.f37310Z);
                } else {
                    K2(this.f37310Z);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return l1(this.f37332z) || l1(this.f37272A) || l1(this.f37278D) || (this.f37302T1 && l1(this.f37303U1)) || n1(this.f37281E1.e()) || o0() || m1(this.f37288I) || m1(this.f37318l1) || l1(this.f37299Q1);
    }

    public boolean j1() {
        return m1(this.f37310Z);
    }

    public void j2(InterfaceC1204a interfaceC1204a) {
        this.f37304V1 = new WeakReference(interfaceC1204a);
    }

    float k0() {
        if (J2()) {
            return this.f37327u1 + this.f37314h1 + this.f37328v1;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.f37308Y;
    }

    public void k2(TextUtils.TruncateAt truncateAt) {
        this.f37305W1 = truncateAt;
    }

    public void l2(c cVar) {
        this.f37321o1 = cVar;
    }

    public void m2(int i10) {
        l2(c.c(this.f37330x1, i10));
    }

    Paint.Align n0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f37284G != null) {
            float fG0 = this.f37322p1 + g0() + this.f37325s1;
            if (AbstractC8416a.f(this) == 0) {
                pointF.x = rect.left + fG0;
            } else {
                pointF.x = rect.right - fG0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m0();
        }
        return align;
    }

    public void n2(float f10) {
        if (this.f37324r1 != f10) {
            float fG0 = g0();
            this.f37324r1 = f10;
            float fG02 = g0();
            invalidateSelf();
            if (fG0 != fG02) {
                p1();
            }
        }
    }

    public void o2(int i10) {
        n2(this.f37330x1.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (I2()) {
            zOnLayoutDirectionChanged |= AbstractC8416a.m(this.f37288I, i10);
        }
        if (H2()) {
            zOnLayoutDirectionChanged |= AbstractC8416a.m(this.f37318l1, i10);
        }
        if (J2()) {
            zOnLayoutDirectionChanged |= AbstractC8416a.m(this.f37310Z, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (I2()) {
            zOnLevelChange |= this.f37288I.setLevel(i10);
        }
        if (H2()) {
            zOnLevelChange |= this.f37318l1.setLevel(i10);
        }
        if (J2()) {
            zOnLevelChange |= this.f37310Z.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable, com.google.android.material.internal.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.f37311Z1) {
            super.onStateChange(iArr);
        }
        return q1(iArr, Q0());
    }

    protected void p1() {
        InterfaceC1204a interfaceC1204a = (InterfaceC1204a) this.f37304V1.get();
        if (interfaceC1204a != null) {
            interfaceC1204a.a();
        }
    }

    public void p2(float f10) {
        if (this.f37323q1 != f10) {
            float fG0 = g0();
            this.f37323q1 = f10;
            float fG02 = g0();
            invalidateSelf();
            if (fG0 != fG02) {
                p1();
            }
        }
    }

    public void q2(int i10) {
        p2(this.f37330x1.getResources().getDimension(i10));
    }

    public void r1(boolean z10) {
        if (this.f37316j1 != z10) {
            this.f37316j1 = z10;
            float fG0 = g0();
            if (!z10 && this.f37293L1) {
                this.f37293L1 = false;
            }
            float fG02 = g0();
            invalidateSelf();
            if (fG0 != fG02) {
                p1();
            }
        }
    }

    public void r2(int i10) {
        this.f37309Y1 = i10;
    }

    public void s1(int i10) {
        r1(this.f37330x1.getResources().getBoolean(i10));
    }

    public void s2(ColorStateList colorStateList) {
        if (this.f37282F != colorStateList) {
            this.f37282F = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f37296N1 != i10) {
            this.f37296N1 = i10;
            invalidateSelf();
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f37297O1 != colorFilter) {
            this.f37297O1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f37299Q1 != colorStateList) {
            this.f37299Q1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // f4.C5527g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f37300R1 != mode) {
            this.f37300R1 = mode;
            this.f37298P1 = com.google.android.material.drawable.d.j(this, this.f37299Q1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (I2()) {
            visible |= this.f37288I.setVisible(z10, z11);
        }
        if (H2()) {
            visible |= this.f37318l1.setVisible(z10, z11);
        }
        if (J2()) {
            visible |= this.f37310Z.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(Drawable drawable) {
        if (this.f37318l1 != drawable) {
            float fG0 = g0();
            this.f37318l1 = drawable;
            float fG02 = g0();
            K2(this.f37318l1);
            e0(this.f37318l1);
            invalidateSelf();
            if (fG0 != fG02) {
                p1();
            }
        }
    }

    public void t2(int i10) {
        s2(AbstractC6050a.a(this.f37330x1, i10));
    }

    public void u1(int i10) {
        t1(AbstractC6050a.b(this.f37330x1, i10));
    }

    void u2(boolean z10) {
        this.f37307X1 = z10;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.f37319m1 != colorStateList) {
            this.f37319m1 = colorStateList;
            if (o0()) {
                AbstractC8416a.o(this.f37318l1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void v2(c cVar) {
        this.f37320n1 = cVar;
    }

    public void w1(int i10) {
        v1(AbstractC6050a.a(this.f37330x1, i10));
    }

    public void w2(int i10) {
        v2(c.c(this.f37330x1, i10));
    }

    public void x1(int i10) {
        y1(this.f37330x1.getResources().getBoolean(i10));
    }

    public void x2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f37284G, charSequence)) {
            return;
        }
        this.f37284G = charSequence;
        this.f37281E1.k(true);
        invalidateSelf();
        p1();
    }

    public void y1(boolean z10) {
        if (this.f37317k1 != z10) {
            boolean zH2 = H2();
            this.f37317k1 = z10;
            boolean zH22 = H2();
            if (zH2 != zH22) {
                if (zH22) {
                    e0(this.f37318l1);
                } else {
                    K2(this.f37318l1);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void y2(d dVar) {
        this.f37281E1.j(dVar, this.f37330x1);
    }

    public Drawable z0() {
        return this.f37318l1;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.f37272A != colorStateList) {
            this.f37272A = colorStateList;
            onStateChange(getState());
        }
    }

    public void z2(int i10) {
        y2(new d(this.f37330x1, i10));
    }
}
