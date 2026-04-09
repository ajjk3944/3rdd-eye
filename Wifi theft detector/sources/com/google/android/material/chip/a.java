package com.google.android.material.chip;

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
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.y;
import com.google.android.material.shape.MaterialShapeDrawable;
import d5.c;
import d5.e;
import j4.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import k4.h;
import w4.d;

/* loaded from: classes2.dex */
public class a extends MaterialShapeDrawable implements Drawable.Callback, y.b {
    public static final int[] T0 = {R.attr.state_enabled};
    public static final ShapeDrawable U0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public int F0;
    public int G0;
    public ColorFilter H0;
    public PorterDuffColorFilter I0;
    public ColorStateList J;
    public ColorStateList J0;
    public ColorStateList K;
    public PorterDuff.Mode K0;
    public float L;
    public int[] L0;
    public float M;
    public boolean M0;
    public ColorStateList N;
    public ColorStateList N0;
    public float O;
    public WeakReference O0;
    public ColorStateList P;
    public TextUtils.TruncateAt P0;
    public CharSequence Q;
    public boolean Q0;
    public boolean R;
    public int R0;
    public Drawable S;
    public boolean S0;
    public ColorStateList T;
    public float U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public Drawable Y;
    public ColorStateList Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f10241a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f10242b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f10243c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f10244d0;

    /* renamed from: e0, reason: collision with root package name */
    public Drawable f10245e0;

    /* renamed from: f0, reason: collision with root package name */
    public ColorStateList f10246f0;

    /* renamed from: g0, reason: collision with root package name */
    public h f10247g0;

    /* renamed from: h0, reason: collision with root package name */
    public h f10248h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f10249i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f10250j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f10251k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f10252l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f10253m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f10254n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f10255o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f10256p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Context f10257q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Paint f10258r0;

    /* renamed from: s0, reason: collision with root package name */
    public final Paint f10259s0;

    /* renamed from: t0, reason: collision with root package name */
    public final Paint.FontMetrics f10260t0;

    /* renamed from: u0, reason: collision with root package name */
    public final RectF f10261u0;

    /* renamed from: v0, reason: collision with root package name */
    public final PointF f10262v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Path f10263w0;

    /* renamed from: x0, reason: collision with root package name */
    public final y f10264x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f10265y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f10266z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0205a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.M = -1.0f;
        this.f10258r0 = new Paint(1);
        this.f10260t0 = new Paint.FontMetrics();
        this.f10261u0 = new RectF();
        this.f10262v0 = new PointF();
        this.f10263w0 = new Path();
        this.G0 = 255;
        this.K0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        W(context);
        this.f10257q0 = context;
        y yVar = new y(this);
        this.f10264x0 = yVar;
        this.Q = "";
        yVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f10259s0 = null;
        int[] iArr = T0;
        setState(iArr);
        E2(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    public static boolean F1(int[] iArr, int i10) {
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

    public static boolean J1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean K1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean L1(e eVar) {
        return (eVar == null || eVar.j() == null || !eVar.j().isStateful()) ? false : true;
    }

    public static a N0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.M1(attributeSet, i10, i11);
        return aVar;
    }

    public e A1() {
        return this.f10264x0.e();
    }

    public void A2(float f10) {
        if (this.f10241a0 != f10) {
            this.f10241a0 = f10;
            invalidateSelf();
            if (i3()) {
                N1();
            }
        }
    }

    public float B1() {
        return this.f10253m0;
    }

    public void B2(int i10) {
        A2(this.f10257q0.getResources().getDimension(i10));
    }

    public final void C0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        k0.a.m(drawable, k0.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(o1());
            }
            drawable.setTintList(this.Z);
            return;
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            drawable2.setTintList(this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float C1() {
        return this.f10252l0;
    }

    public void C2(float f10) {
        if (this.f10254n0 != f10) {
            this.f10254n0 = f10;
            invalidateSelf();
            if (i3()) {
                N1();
            }
        }
    }

    public final void D0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (h3() || g3()) {
            float f10 = this.f10249i0 + this.f10250j0;
            float fS1 = s1();
            if (k0.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fS1;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fS1;
            }
            float fR1 = r1();
            float fExactCenterY = rect.exactCenterY() - (fR1 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fR1;
        }
    }

    public final ColorFilter D1() {
        ColorFilter colorFilter = this.H0;
        return colorFilter != null ? colorFilter : this.I0;
    }

    public void D2(int i10) {
        C2(this.f10257q0.getResources().getDimension(i10));
    }

    public float E0() {
        if (h3() || g3()) {
            return this.f10250j0 + s1() + this.f10251k0;
        }
        return 0.0f;
    }

    public boolean E1() {
        return this.M0;
    }

    public boolean E2(int[] iArr) {
        if (Arrays.equals(this.L0, iArr)) {
            return false;
        }
        this.L0 = iArr;
        if (i3()) {
            return O1(getState(), iArr);
        }
        return false;
    }

    public final void F0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (i3()) {
            float f10 = this.f10256p0 + this.f10255o0 + this.f10241a0 + this.f10254n0 + this.f10253m0;
            if (k0.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    public void F2(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (i3()) {
                this.X.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (i3()) {
            float f10 = this.f10256p0 + this.f10255o0;
            if (k0.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f10241a0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f10241a0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f10241a0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    public boolean G1() {
        return this.f10243c0;
    }

    public void G2(int i10) {
        F2(d.a.a(this.f10257q0, i10));
    }

    public final void H0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (i3()) {
            float f10 = this.f10256p0 + this.f10255o0 + this.f10241a0 + this.f10254n0 + this.f10253m0;
            if (k0.a.f(this) == 0) {
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

    public boolean H1() {
        return K1(this.X);
    }

    public void H2(boolean z10) {
        if (this.W != z10) {
            boolean zI3 = i3();
            this.W = z10;
            boolean zI32 = i3();
            if (zI3 != zI32) {
                if (zI32) {
                    C0(this.X);
                } else {
                    j3(this.X);
                }
                invalidateSelf();
                N1();
            }
        }
    }

    public float I0() {
        if (i3()) {
            return this.f10254n0 + this.f10241a0 + this.f10255o0;
        }
        return 0.0f;
    }

    public boolean I1() {
        return this.W;
    }

    public void I2(InterfaceC0205a interfaceC0205a) {
        this.O0 = new WeakReference(interfaceC0205a);
    }

    public final void J0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.Q != null) {
            float fE0 = this.f10249i0 + E0() + this.f10252l0;
            float fI0 = this.f10256p0 + I0() + this.f10253m0;
            if (k0.a.f(this) == 0) {
                rectF.left = rect.left + fE0;
                rectF.right = rect.right - fI0;
            } else {
                rectF.left = rect.left + fI0;
                rectF.right = rect.right - fE0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void J2(TextUtils.TruncateAt truncateAt) {
        this.P0 = truncateAt;
    }

    public final float K0() {
        this.f10264x0.g().getFontMetrics(this.f10260t0);
        Paint.FontMetrics fontMetrics = this.f10260t0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void K2(h hVar) {
        this.f10248h0 = hVar;
    }

    public Paint.Align L0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.Q != null) {
            float fE0 = this.f10249i0 + E0() + this.f10252l0;
            if (k0.a.f(this) == 0) {
                pointF.x = rect.left + fE0;
            } else {
                pointF.x = rect.right - fE0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - K0();
        }
        return align;
    }

    public void L2(int i10) {
        K2(h.d(this.f10257q0, i10));
    }

    public final boolean M0() {
        return this.f10244d0 && this.f10245e0 != null && this.f10243c0;
    }

    public final void M1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = a0.i(this.f10257q0, attributeSet, l.Chip, i10, i11, new int[0]);
        this.S0 = typedArrayI.hasValue(l.Chip_shapeAppearance);
        u2(c.a(this.f10257q0, typedArrayI, l.Chip_chipSurfaceColor));
        Y1(c.a(this.f10257q0, typedArrayI, l.Chip_chipBackgroundColor));
        m2(typedArrayI.getDimension(l.Chip_chipMinHeight, 0.0f));
        int i12 = l.Chip_chipCornerRadius;
        if (typedArrayI.hasValue(i12)) {
            a2(typedArrayI.getDimension(i12, 0.0f));
        }
        q2(c.a(this.f10257q0, typedArrayI, l.Chip_chipStrokeColor));
        s2(typedArrayI.getDimension(l.Chip_chipStrokeWidth, 0.0f));
        R2(c.a(this.f10257q0, typedArrayI, l.Chip_rippleColor));
        W2(typedArrayI.getText(l.Chip_android_text));
        e eVarG = c.g(this.f10257q0, typedArrayI, l.Chip_android_textAppearance);
        eVarG.o(typedArrayI.getDimension(l.Chip_android_textSize, eVarG.k()));
        X2(eVarG);
        int i13 = typedArrayI.getInt(l.Chip_android_ellipsize, 0);
        if (i13 == 1) {
            J2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            J2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            J2(TextUtils.TruncateAt.END);
        }
        l2(typedArrayI.getBoolean(l.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            l2(typedArrayI.getBoolean(l.Chip_chipIconEnabled, false));
        }
        e2(c.d(this.f10257q0, typedArrayI, l.Chip_chipIcon));
        int i14 = l.Chip_chipIconTint;
        if (typedArrayI.hasValue(i14)) {
            i2(c.a(this.f10257q0, typedArrayI, i14));
        }
        g2(typedArrayI.getDimension(l.Chip_chipIconSize, -1.0f));
        H2(typedArrayI.getBoolean(l.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            H2(typedArrayI.getBoolean(l.Chip_closeIconEnabled, false));
        }
        v2(c.d(this.f10257q0, typedArrayI, l.Chip_closeIcon));
        F2(c.a(this.f10257q0, typedArrayI, l.Chip_closeIconTint));
        A2(typedArrayI.getDimension(l.Chip_closeIconSize, 0.0f));
        Q1(typedArrayI.getBoolean(l.Chip_android_checkable, false));
        X1(typedArrayI.getBoolean(l.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            X1(typedArrayI.getBoolean(l.Chip_checkedIconEnabled, false));
        }
        S1(c.d(this.f10257q0, typedArrayI, l.Chip_checkedIcon));
        int i15 = l.Chip_checkedIconTint;
        if (typedArrayI.hasValue(i15)) {
            U1(c.a(this.f10257q0, typedArrayI, i15));
        }
        U2(h.c(this.f10257q0, typedArrayI, l.Chip_showMotionSpec));
        K2(h.c(this.f10257q0, typedArrayI, l.Chip_hideMotionSpec));
        o2(typedArrayI.getDimension(l.Chip_chipStartPadding, 0.0f));
        O2(typedArrayI.getDimension(l.Chip_iconStartPadding, 0.0f));
        M2(typedArrayI.getDimension(l.Chip_iconEndPadding, 0.0f));
        c3(typedArrayI.getDimension(l.Chip_textStartPadding, 0.0f));
        Z2(typedArrayI.getDimension(l.Chip_textEndPadding, 0.0f));
        C2(typedArrayI.getDimension(l.Chip_closeIconStartPadding, 0.0f));
        x2(typedArrayI.getDimension(l.Chip_closeIconEndPadding, 0.0f));
        c2(typedArrayI.getDimension(l.Chip_chipEndPadding, 0.0f));
        Q2(typedArrayI.getDimensionPixelSize(l.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayI.recycle();
    }

    public void M2(float f10) {
        if (this.f10251k0 != f10) {
            float fE0 = E0();
            this.f10251k0 = f10;
            float fE02 = E0();
            invalidateSelf();
            if (fE0 != fE02) {
                N1();
            }
        }
    }

    public void N1() {
        InterfaceC0205a interfaceC0205a = (InterfaceC0205a) this.O0.get();
        if (interfaceC0205a != null) {
            interfaceC0205a.a();
        }
    }

    public void N2(int i10) {
        M2(this.f10257q0.getResources().getDimension(i10));
    }

    public final void O0(Canvas canvas, Rect rect) {
        if (g3()) {
            D0(rect, this.f10261u0);
            RectF rectF = this.f10261u0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f10245e0.setBounds(0, 0, (int) this.f10261u0.width(), (int) this.f10261u0.height());
            this.f10245e0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public final boolean O1(int[] iArr, int[] iArr2) {
        boolean z10;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.J;
        int iQ = q(colorStateList != null ? colorStateList.getColorForState(iArr, this.f10265y0) : 0);
        boolean state = true;
        if (this.f10265y0 != iQ) {
            this.f10265y0 = iQ;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.K;
        int iQ2 = q(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f10266z0) : 0);
        if (this.f10266z0 != iQ2) {
            this.f10266z0 = iQ2;
            zOnStateChange = true;
        }
        int i10 = u4.a.i(iQ, iQ2);
        if ((this.A0 != i10) | (D() == null)) {
            this.A0 = i10;
            i0(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.N;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.B0) : 0;
        if (this.B0 != colorForState) {
            this.B0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.N0 == null || !e5.a.e(iArr)) ? 0 : this.N0.getColorForState(iArr, this.C0);
        if (this.C0 != colorForState2) {
            this.C0 = colorForState2;
            if (this.M0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f10264x0.e() == null || this.f10264x0.e().j() == null) ? 0 : this.f10264x0.e().j().getColorForState(iArr, this.D0);
        if (this.D0 != colorForState3) {
            this.D0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z11 = F1(getState(), R.attr.state_checked) && this.f10243c0;
        if (this.E0 == z11 || this.f10245e0 == null) {
            z10 = false;
        } else {
            float fE0 = E0();
            this.E0 = z11;
            if (fE0 != E0()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.J0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.F0) : 0;
        if (this.F0 != colorForState4) {
            this.F0 = colorForState4;
            this.I0 = d.l(this, this.J0, this.K0);
        } else {
            state = zOnStateChange;
        }
        if (K1(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (K1(this.f10245e0)) {
            state |= this.f10245e0.setState(iArr);
        }
        if (K1(this.X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.X.setState(iArr3);
        }
        if (K1(this.Y)) {
            state |= this.Y.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            N1();
        }
        return state;
    }

    public void O2(float f10) {
        if (this.f10250j0 != f10) {
            float fE0 = E0();
            this.f10250j0 = f10;
            float fE02 = E0();
            invalidateSelf();
            if (fE0 != fE02) {
                N1();
            }
        }
    }

    public final void P0(Canvas canvas, Rect rect) {
        if (this.S0) {
            return;
        }
        this.f10258r0.setColor(this.f10266z0);
        this.f10258r0.setStyle(Paint.Style.FILL);
        this.f10258r0.setColorFilter(D1());
        this.f10261u0.set(rect);
        canvas.drawRoundRect(this.f10261u0, a1(), a1(), this.f10258r0);
    }

    public boolean P1(boolean z10) {
        if (this.X != null) {
            return E2(z10 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : T0);
        }
        return false;
    }

    public void P2(int i10) {
        O2(this.f10257q0.getResources().getDimension(i10));
    }

    public final void Q0(Canvas canvas, Rect rect) {
        if (h3()) {
            D0(rect, this.f10261u0);
            RectF rectF = this.f10261u0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.S.setBounds(0, 0, (int) this.f10261u0.width(), (int) this.f10261u0.height());
            this.S.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void Q1(boolean z10) {
        if (this.f10243c0 != z10) {
            this.f10243c0 = z10;
            float fE0 = E0();
            if (!z10 && this.E0) {
                this.E0 = false;
            }
            float fE02 = E0();
            invalidateSelf();
            if (fE0 != fE02) {
                N1();
            }
        }
    }

    public void Q2(int i10) {
        this.R0 = i10;
    }

    public final void R0(Canvas canvas, Rect rect) {
        if (this.O <= 0.0f || this.S0) {
            return;
        }
        this.f10258r0.setColor(this.B0);
        this.f10258r0.setStyle(Paint.Style.STROKE);
        if (!this.S0) {
            this.f10258r0.setColorFilter(D1());
        }
        RectF rectF = this.f10261u0;
        float f10 = rect.left;
        float f11 = this.O;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.M - (this.O / 2.0f);
        canvas.drawRoundRect(this.f10261u0, f12, f12, this.f10258r0);
    }

    public void R1(int i10) {
        Q1(this.f10257q0.getResources().getBoolean(i10));
    }

    public void R2(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            k3();
            onStateChange(getState());
        }
    }

    public final void S0(Canvas canvas, Rect rect) {
        if (this.S0) {
            return;
        }
        this.f10258r0.setColor(this.f10265y0);
        this.f10258r0.setStyle(Paint.Style.FILL);
        this.f10261u0.set(rect);
        canvas.drawRoundRect(this.f10261u0, a1(), a1(), this.f10258r0);
    }

    public void S1(Drawable drawable) {
        if (this.f10245e0 != drawable) {
            float fE0 = E0();
            this.f10245e0 = drawable;
            float fE02 = E0();
            j3(this.f10245e0);
            C0(this.f10245e0);
            invalidateSelf();
            if (fE0 != fE02) {
                N1();
            }
        }
    }

    public void S2(int i10) {
        R2(d.a.a(this.f10257q0, i10));
    }

    public final void T0(Canvas canvas, Rect rect) {
        if (i3()) {
            G0(rect, this.f10261u0);
            RectF rectF = this.f10261u0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.X.setBounds(0, 0, (int) this.f10261u0.width(), (int) this.f10261u0.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    public void T1(int i10) {
        S1(d.a.b(this.f10257q0, i10));
    }

    public void T2(boolean z10) {
        this.Q0 = z10;
    }

    public final void U0(Canvas canvas, Rect rect) {
        this.f10258r0.setColor(this.C0);
        this.f10258r0.setStyle(Paint.Style.FILL);
        this.f10261u0.set(rect);
        if (!this.S0) {
            canvas.drawRoundRect(this.f10261u0, a1(), a1(), this.f10258r0);
        } else {
            l(new RectF(rect), this.f10263w0);
            super.u(canvas, this.f10258r0, this.f10263w0, z());
        }
    }

    public void U1(ColorStateList colorStateList) {
        if (this.f10246f0 != colorStateList) {
            this.f10246f0 = colorStateList;
            if (M0()) {
                this.f10245e0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void U2(h hVar) {
        this.f10247g0 = hVar;
    }

    public final void V0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f10259s0;
        if (paint != null) {
            paint.setColor(j0.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f10259s0);
            if (h3() || g3()) {
                D0(rect, this.f10261u0);
                canvas.drawRect(this.f10261u0, this.f10259s0);
            }
            if (this.Q != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f10259s0);
            } else {
                canvas2 = canvas;
            }
            if (i3()) {
                G0(rect, this.f10261u0);
                canvas2.drawRect(this.f10261u0, this.f10259s0);
            }
            this.f10259s0.setColor(j0.a.k(-65536, 127));
            F0(rect, this.f10261u0);
            canvas2.drawRect(this.f10261u0, this.f10259s0);
            this.f10259s0.setColor(j0.a.k(-16711936, 127));
            H0(rect, this.f10261u0);
            canvas2.drawRect(this.f10261u0, this.f10259s0);
        }
    }

    public void V1(int i10) {
        U1(d.a.a(this.f10257q0, i10));
    }

    public void V2(int i10) {
        U2(h.d(this.f10257q0, i10));
    }

    public final void W0(Canvas canvas, Rect rect) {
        if (this.Q != null) {
            Paint.Align alignL0 = L0(rect, this.f10262v0);
            J0(rect, this.f10261u0);
            if (this.f10264x0.e() != null) {
                this.f10264x0.g().drawableState = getState();
                this.f10264x0.n(this.f10257q0);
            }
            this.f10264x0.g().setTextAlign(alignL0);
            int iSave = 0;
            boolean z10 = Math.round(this.f10264x0.h(z1().toString())) > Math.round(this.f10261u0.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(this.f10261u0);
            }
            CharSequence charSequenceEllipsize = this.Q;
            if (z10 && this.P0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f10264x0.g(), this.f10261u0.width(), this.P0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f10262v0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f10264x0.g());
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void W1(int i10) {
        X1(this.f10257q0.getResources().getBoolean(i10));
    }

    public void W2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.Q, charSequence)) {
            return;
        }
        this.Q = charSequence;
        this.f10264x0.m(true);
        invalidateSelf();
        N1();
    }

    public Drawable X0() {
        return this.f10245e0;
    }

    public void X1(boolean z10) {
        if (this.f10244d0 != z10) {
            boolean zG3 = g3();
            this.f10244d0 = z10;
            boolean zG32 = g3();
            if (zG3 != zG32) {
                if (zG32) {
                    C0(this.f10245e0);
                } else {
                    j3(this.f10245e0);
                }
                invalidateSelf();
                N1();
            }
        }
    }

    public void X2(e eVar) {
        this.f10264x0.k(eVar, this.f10257q0);
    }

    public ColorStateList Y0() {
        return this.f10246f0;
    }

    public void Y1(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y2(int i10) {
        X2(new e(this.f10257q0, i10));
    }

    public ColorStateList Z0() {
        return this.K;
    }

    public void Z1(int i10) {
        Y1(d.a.a(this.f10257q0, i10));
    }

    public void Z2(float f10) {
        if (this.f10253m0 != f10) {
            this.f10253m0 = f10;
            invalidateSelf();
            N1();
        }
    }

    @Override // com.google.android.material.internal.y.b
    public void a() {
        N1();
        invalidateSelf();
    }

    public float a1() {
        return this.S0 ? P() : this.M;
    }

    public void a2(float f10) {
        if (this.M != f10) {
            this.M = f10;
            setShapeAppearanceModel(K().x(f10));
        }
    }

    public void a3(int i10) {
        Z2(this.f10257q0.getResources().getDimension(i10));
    }

    public float b1() {
        return this.f10256p0;
    }

    public void b2(int i10) {
        a2(this.f10257q0.getResources().getDimension(i10));
    }

    public void b3(float f10) {
        e eVarA1 = A1();
        if (eVarA1 != null) {
            eVarA1.o(f10);
            this.f10264x0.g().setTextSize(f10);
            a();
        }
    }

    public Drawable c1() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return k0.a.q(drawable);
        }
        return null;
    }

    public void c2(float f10) {
        if (this.f10256p0 != f10) {
            this.f10256p0 = f10;
            invalidateSelf();
            N1();
        }
    }

    public void c3(float f10) {
        if (this.f10252l0 != f10) {
            this.f10252l0 = f10;
            invalidateSelf();
            N1();
        }
    }

    public float d1() {
        return this.U;
    }

    public void d2(int i10) {
        c2(this.f10257q0.getResources().getDimension(i10));
    }

    public void d3(int i10) {
        c3(this.f10257q0.getResources().getDimension(i10));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.G0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = p4.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        S0(canvas2, bounds);
        P0(canvas2, bounds);
        if (this.S0) {
            super.draw(canvas2);
        }
        R0(canvas2, bounds);
        U0(canvas2, bounds);
        Q0(canvas2, bounds);
        O0(canvas2, bounds);
        if (this.Q0) {
            W0(canvas2, bounds);
        }
        T0(canvas2, bounds);
        V0(canvas2, bounds);
        if (this.G0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public ColorStateList e1() {
        return this.T;
    }

    public void e2(Drawable drawable) {
        Drawable drawableC1 = c1();
        if (drawableC1 != drawable) {
            float fE0 = E0();
            this.S = drawable != null ? k0.a.r(drawable).mutate() : null;
            float fE02 = E0();
            j3(drawableC1);
            if (h3()) {
                C0(this.S);
            }
            invalidateSelf();
            if (fE0 != fE02) {
                N1();
            }
        }
    }

    public void e3(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            k3();
            onStateChange(getState());
        }
    }

    public float f1() {
        return this.L;
    }

    public void f2(int i10) {
        e2(d.a.b(this.f10257q0, i10));
    }

    public boolean f3() {
        return this.Q0;
    }

    public float g1() {
        return this.f10249i0;
    }

    public void g2(float f10) {
        if (this.U != f10) {
            float fE0 = E0();
            this.U = f10;
            float fE02 = E0();
            invalidateSelf();
            if (fE0 != fE02) {
                N1();
            }
        }
    }

    public final boolean g3() {
        return this.f10244d0 && this.f10245e0 != null && this.E0;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f10249i0 + E0() + this.f10252l0 + this.f10264x0.h(z1().toString()) + this.f10253m0 + I0() + this.f10256p0), this.R0);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList h1() {
        return this.N;
    }

    public void h2(int i10) {
        g2(this.f10257q0.getResources().getDimension(i10));
    }

    public final boolean h3() {
        return this.R && this.S != null;
    }

    public float i1() {
        return this.O;
    }

    public void i2(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (h3()) {
                this.S.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean i3() {
        return this.W && this.X != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (J1(this.J) || J1(this.K) || J1(this.N)) {
            return true;
        }
        return (this.M0 && J1(this.N0)) || L1(this.f10264x0.e()) || M0() || K1(this.S) || K1(this.f10245e0) || J1(this.J0);
    }

    public Drawable j1() {
        Drawable drawable = this.X;
        if (drawable != null) {
            return k0.a.q(drawable);
        }
        return null;
    }

    public void j2(int i10) {
        i2(d.a.a(this.f10257q0, i10));
    }

    public final void j3(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public CharSequence k1() {
        return this.f10242b0;
    }

    public void k2(int i10) {
        l2(this.f10257q0.getResources().getBoolean(i10));
    }

    public final void k3() {
        this.N0 = this.M0 ? e5.a.d(this.P) : null;
    }

    public float l1() {
        return this.f10255o0;
    }

    public void l2(boolean z10) {
        if (this.R != z10) {
            boolean zH3 = h3();
            this.R = z10;
            boolean zH32 = h3();
            if (zH3 != zH32) {
                if (zH32) {
                    C0(this.S);
                } else {
                    j3(this.S);
                }
                invalidateSelf();
                N1();
            }
        }
    }

    public final void l3() {
        this.Y = new RippleDrawable(e5.a.d(x1()), this.X, U0);
    }

    public float m1() {
        return this.f10241a0;
    }

    public void m2(float f10) {
        if (this.L != f10) {
            this.L = f10;
            invalidateSelf();
            N1();
        }
    }

    public float n1() {
        return this.f10254n0;
    }

    public void n2(int i10) {
        m2(this.f10257q0.getResources().getDimension(i10));
    }

    public int[] o1() {
        return this.L0;
    }

    public void o2(float f10) {
        if (this.f10249i0 != f10) {
            this.f10249i0 = f10;
            invalidateSelf();
            N1();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (h3()) {
            zOnLayoutDirectionChanged |= k0.a.m(this.S, i10);
        }
        if (g3()) {
            zOnLayoutDirectionChanged |= k0.a.m(this.f10245e0, i10);
        }
        if (i3()) {
            zOnLayoutDirectionChanged |= k0.a.m(this.X, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (h3()) {
            zOnLevelChange |= this.S.setLevel(i10);
        }
        if (g3()) {
            zOnLevelChange |= this.f10245e0.setLevel(i10);
        }
        if (i3()) {
            zOnLevelChange |= this.X.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.y.b
    public boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return O1(iArr, o1());
    }

    public ColorStateList p1() {
        return this.Z;
    }

    public void p2(int i10) {
        o2(this.f10257q0.getResources().getDimension(i10));
    }

    public void q1(RectF rectF) {
        H0(getBounds(), rectF);
    }

    public void q2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.S0) {
                u0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final float r1() {
        Drawable drawable = this.E0 ? this.f10245e0 : this.S;
        float fCeil = this.U;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(d0.g(this.f10257q0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void r2(int i10) {
        q2(d.a.a(this.f10257q0, i10));
    }

    public final float s1() {
        Drawable drawable = this.E0 ? this.f10245e0 : this.S;
        float f10 = this.U;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    public void s2(float f10) {
        if (this.O != f10) {
            this.O = f10;
            this.f10258r0.setStrokeWidth(f10);
            if (this.S0) {
                super.v0(f10);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.G0 != i10) {
            this.G0 = i10;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.H0 != colorFilter) {
            this.H0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.K0 != mode) {
            this.K0 = mode;
            this.I0 = d.l(this, this.J0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (h3()) {
            visible |= this.S.setVisible(z10, z11);
        }
        if (g3()) {
            visible |= this.f10245e0.setVisible(z10, z11);
        }
        if (i3()) {
            visible |= this.X.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public TextUtils.TruncateAt t1() {
        return this.P0;
    }

    public void t2(int i10) {
        s2(this.f10257q0.getResources().getDimension(i10));
    }

    public h u1() {
        return this.f10248h0;
    }

    public final void u2(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.f10251k0;
    }

    public void v2(Drawable drawable) {
        Drawable drawableJ1 = j1();
        if (drawableJ1 != drawable) {
            float fI0 = I0();
            this.X = drawable != null ? k0.a.r(drawable).mutate() : null;
            l3();
            float fI02 = I0();
            j3(drawableJ1);
            if (i3()) {
                C0(this.X);
            }
            invalidateSelf();
            if (fI0 != fI02) {
                N1();
            }
        }
    }

    public float w1() {
        return this.f10250j0;
    }

    public void w2(CharSequence charSequence) {
        if (this.f10242b0 != charSequence) {
            this.f10242b0 = q0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public ColorStateList x1() {
        return this.P;
    }

    public void x2(float f10) {
        if (this.f10255o0 != f10) {
            this.f10255o0 = f10;
            invalidateSelf();
            if (i3()) {
                N1();
            }
        }
    }

    public h y1() {
        return this.f10247g0;
    }

    public void y2(int i10) {
        x2(this.f10257q0.getResources().getDimension(i10));
    }

    public CharSequence z1() {
        return this.Q;
    }

    public void z2(int i10) {
        v2(d.a.b(this.f10257q0, i10));
    }
}
