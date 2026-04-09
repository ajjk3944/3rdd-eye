package com.google.android.material.chip;

import ab.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import ed.b;
import ed.k;
import ed.l;
import ee.v;
import io.sentry.android.core.e0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import qd.a;
import qd.c;
import qd.d;
import qd.e;
import u3.i0;
import xd.h;

/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements d, v, Checkable {
    public static final int S = k.Widget_MaterialComponents_Chip_Action;
    public static final Rect T = new Rect();
    public static final int[] U = {R.attr.state_selected};
    public static final int[] V = {R.attr.state_checkable};
    public RippleDrawable B;
    public View.OnClickListener D;
    public CompoundButton.OnCheckedChangeListener E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public CharSequence M;
    public final c N;
    public boolean O;
    public final Rect P;
    public final RectF Q;
    public final a R;

    /* renamed from: x, reason: collision with root package name */
    public e f5570x;

    /* renamed from: y, reason: collision with root package name */
    public InsetDrawable f5571y;

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int i10 = b.chipStyle;
        int i11 = S;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.P = new Rect();
        this.Q = new RectF();
        this.R = new a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                e0.p("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                e0.p("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e eVar = new e(context2, attributeSet, i10);
        TypedArray typedArrayD = xd.k.d(eVar.K0, attributeSet, l.Chip, i10, i11, new int[0]);
        eVar.f20868k1 = typedArrayD.hasValue(l.Chip_shapeAppearance);
        int i12 = l.Chip_chipSurfaceColor;
        Context context3 = eVar.K0;
        ColorStateList colorStateListQ = xu.l.q(context3, typedArrayD, i12);
        if (eVar.f20853d0 != colorStateListQ) {
            eVar.f20853d0 = colorStateListQ;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList colorStateListQ2 = xu.l.q(context3, typedArrayD, l.Chip_chipBackgroundColor);
        if (eVar.f20855e0 != colorStateListQ2) {
            eVar.f20855e0 = colorStateListQ2;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = typedArrayD.getDimension(l.Chip_chipMinHeight, 0.0f);
        if (eVar.f20857f0 != dimension) {
            eVar.f20857f0 = dimension;
            eVar.invalidateSelf();
            eVar.F();
        }
        if (typedArrayD.hasValue(l.Chip_chipCornerRadius)) {
            eVar.L(typedArrayD.getDimension(l.Chip_chipCornerRadius, 0.0f));
        }
        eVar.Q(xu.l.q(context3, typedArrayD, l.Chip_chipStrokeColor));
        eVar.R(typedArrayD.getDimension(l.Chip_chipStrokeWidth, 0.0f));
        eVar.b0(xu.l.q(context3, typedArrayD, l.Chip_rippleColor));
        String text = typedArrayD.getText(l.Chip_android_text);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(eVar.f20867k0, text);
        h hVar = eVar.Q0;
        if (!zEquals) {
            eVar.f20867k0 = text;
            hVar.f25292e = true;
            eVar.invalidateSelf();
            eVar.F();
        }
        int i13 = l.Chip_android_textAppearance;
        be.d dVar = (!typedArrayD.hasValue(i13) || (resourceId = typedArrayD.getResourceId(i13, 0)) == 0) ? null : new be.d(context3, resourceId);
        dVar.f2689l = typedArrayD.getDimension(l.Chip_android_textSize, dVar.f2689l);
        hVar.b(dVar, context3);
        int i14 = typedArrayD.getInt(l.Chip_android_ellipsize, 0);
        if (i14 == 1) {
            eVar.f20862h1 = TextUtils.TruncateAt.START;
        } else if (i14 == 2) {
            eVar.f20862h1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i14 == 3) {
            eVar.f20862h1 = TextUtils.TruncateAt.END;
        }
        eVar.P(typedArrayD.getBoolean(l.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.P(typedArrayD.getBoolean(l.Chip_chipIconEnabled, false));
        }
        eVar.M(xu.l.t(context3, typedArrayD, l.Chip_chipIcon));
        if (typedArrayD.hasValue(l.Chip_chipIconTint)) {
            eVar.O(xu.l.q(context3, typedArrayD, l.Chip_chipIconTint));
        }
        eVar.N(typedArrayD.getDimension(l.Chip_chipIconSize, -1.0f));
        eVar.Y(typedArrayD.getBoolean(l.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.Y(typedArrayD.getBoolean(l.Chip_closeIconEnabled, false));
        }
        eVar.S(xu.l.t(context3, typedArrayD, l.Chip_closeIcon));
        eVar.X(xu.l.q(context3, typedArrayD, l.Chip_closeIconTint));
        eVar.U(typedArrayD.getDimension(l.Chip_closeIconSize, 0.0f));
        eVar.H(typedArrayD.getBoolean(l.Chip_android_checkable, false));
        eVar.K(typedArrayD.getBoolean(l.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.K(typedArrayD.getBoolean(l.Chip_checkedIconEnabled, false));
        }
        eVar.I(xu.l.t(context3, typedArrayD, l.Chip_checkedIcon));
        if (typedArrayD.hasValue(l.Chip_checkedIconTint)) {
            eVar.J(xu.l.q(context3, typedArrayD, l.Chip_checkedIconTint));
        }
        eVar.A0 = fd.d.a(context3, typedArrayD, l.Chip_showMotionSpec);
        eVar.B0 = fd.d.a(context3, typedArrayD, l.Chip_hideMotionSpec);
        float dimension2 = typedArrayD.getDimension(l.Chip_chipStartPadding, 0.0f);
        if (eVar.C0 != dimension2) {
            eVar.C0 = dimension2;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.a0(typedArrayD.getDimension(l.Chip_iconStartPadding, 0.0f));
        eVar.Z(typedArrayD.getDimension(l.Chip_iconEndPadding, 0.0f));
        float dimension3 = typedArrayD.getDimension(l.Chip_textStartPadding, 0.0f);
        if (eVar.F0 != dimension3) {
            eVar.F0 = dimension3;
            eVar.invalidateSelf();
            eVar.F();
        }
        float dimension4 = typedArrayD.getDimension(l.Chip_textEndPadding, 0.0f);
        if (eVar.G0 != dimension4) {
            eVar.G0 = dimension4;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.V(typedArrayD.getDimension(l.Chip_closeIconStartPadding, 0.0f));
        eVar.T(typedArrayD.getDimension(l.Chip_closeIconEndPadding, 0.0f));
        float dimension5 = typedArrayD.getDimension(l.Chip_chipEndPadding, 0.0f);
        if (eVar.J0 != dimension5) {
            eVar.J0 = dimension5;
            eVar.invalidateSelf();
            eVar.F();
        }
        eVar.f20866j1 = typedArrayD.getDimensionPixelSize(l.Chip_android_maxWidth, Integer.MAX_VALUE);
        typedArrayD.recycle();
        int[] iArr = l.Chip;
        xd.k.a(context2, attributeSet, i10, i11);
        xd.k.b(context2, attributeSet, iArr, i10, i11, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        this.J = typedArrayObtainStyledAttributes.getBoolean(l.Chip_ensureMinTouchTargetSize, false);
        int i15 = b.minTouchTargetSize;
        int i16 = ed.d.mtrl_min_touch_target_size;
        TypedValue typedValueC0 = xu.d.c0(context2, i15);
        this.L = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(l.Chip_chipMinTouchTargetSize, (int) ((typedValueC0 == null || typedValueC0.type != 5) ? context2.getResources().getDimension(i16) : typedValueC0.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.p(getElevation());
        int[] iArr2 = l.Chip;
        xd.k.a(context2, attributeSet, i10, i11);
        xd.k.b(context2, attributeSet, iArr2, i10, i11, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr2, i10, i11);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(l.Chip_shapeAppearance);
        typedArrayObtainStyledAttributes2.recycle();
        this.N = new c(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new qd.b(this));
        }
        setChecked(this.F);
        setText(eVar.f20867k0);
        setEllipsize(eVar.f20862h1);
        g();
        if (!this.f5570x.f20864i1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.J) {
            setMinHeight(this.L);
        }
        this.K = getLayoutDirection();
        super.setOnCheckedChangeListener(new mn.d(2, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.Q;
        rectF.setEmpty();
        if (c() && this.D != null) {
            e eVar = this.f5570x;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.e0()) {
                float f10 = eVar.J0 + eVar.I0 + eVar.f20878u0 + eVar.H0 + eVar.G0;
                if (eVar.getLayoutDirection() == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i10 = (int) closeIconTouchBounds.left;
        int i11 = (int) closeIconTouchBounds.top;
        int i12 = (int) closeIconTouchBounds.right;
        int i13 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.P;
        rect.set(i10, i11, i12, i13);
        return rect;
    }

    private be.d getTextAppearance() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.Q0.f25294g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            refreshDrawableState();
        }
    }

    public final void b(int i10) {
        this.L = i10;
        if (!this.J) {
            InsetDrawable insetDrawable = this.f5571y;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f5571y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i10 - ((int) this.f5570x.f20857f0));
        int iMax2 = Math.max(0, i10 - this.f5570x.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f5571y;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f5571y = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f5571y != null) {
            Rect rect = new Rect();
            this.f5571y.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                e();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f5571y = new InsetDrawable((Drawable) this.f5570x, i11, i12, i11, i12);
        e();
    }

    public final boolean c() {
        e eVar = this.f5570x;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.f20875r0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof l3.a) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        e eVar;
        if (!c() || (eVar = this.f5570x) == null || !eVar.f20874q0 || this.D == null) {
            i0.n(this, null);
            this.O = false;
        } else {
            i0.n(this, this.N);
            this.O = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.O
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            qd.c r0 = r8.N
            android.view.accessibility.AccessibilityManager r1 = r0.f2388h
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L6b
        L1c:
            int r1 = r9.getAction()
            r2 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L42
            r2 = 9
            if (r1 == r2) goto L42
            r2 = 10
            if (r1 == r2) goto L30
            goto L6b
        L30:
            int r1 = r0.f2391m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.f2391m = r2
            r0.r(r2, r6)
            r0.r(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.f20847q
            boolean r7 = r2.c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.f2391m
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.f2391m = r3
            r0.r(r3, r6)
            r0.r(r9, r5)
            return r4
        L6b:
            boolean r9 = super.dispatchHoverEvent(r9)
            if (r9 == 0) goto L72
        L71:
            return r4
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.O
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            qd.c r0 = r9.N
            r0.getClass()
            int r1 = r10.getAction()
            r2 = 0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            if (r1 == r4) goto L9d
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L87
            r5 = 66
            if (r1 == r5) goto L58
            switch(r1) {
                case 19: goto L2a;
                case 20: goto L2a;
                case 21: goto L2a;
                case 22: goto L2a;
                case 23: goto L58;
                default: goto L28;
            }
        L28:
            goto L9d
        L2a:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L9d
            r7 = 19
            if (r1 == r7) goto L42
            r7 = 21
            if (r1 == r7) goto L3f
            r7 = 22
            if (r1 == r7) goto L44
            r5 = 130(0x82, float:1.82E-43)
            goto L44
        L3f:
            r5 = 17
            goto L44
        L42:
            r5 = 33
        L44:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r4
            r7 = r2
        L4a:
            if (r2 >= r1) goto L56
            boolean r8 = r0.m(r5, r6)
            if (r8 == 0) goto L56
            int r2 = r2 + 1
            r7 = r4
            goto L4a
        L56:
            r2 = r7
            goto L9d
        L58:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L9d
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L9d
            int r1 = r0.f2390l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.f20847q
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.D
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.O
            if (r1 == 0) goto L85
            qd.c r1 = r5.N
            r1.r(r4, r4)
        L85:
            r2 = r4
            goto L9d
        L87:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L93
            r1 = 2
            boolean r2 = r0.m(r1, r6)
            goto L9d
        L93:
            boolean r1 = r10.hasModifiers(r4)
            if (r1 == 0) goto L9d
            boolean r2 = r0.m(r4, r6)
        L9d:
            if (r2 == 0) goto La4
            int r0 = r0.f2390l
            if (r0 == r3) goto La4
            return r4
        La4:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f5570x;
        boolean zW = false;
        int i10 = 0;
        zW = false;
        if (eVar != null && e.E(eVar.f20875r0)) {
            e eVar2 = this.f5570x;
            ?? IsEnabled = isEnabled();
            int i11 = IsEnabled;
            if (this.I) {
                i11 = IsEnabled + 1;
            }
            int i12 = i11;
            if (this.H) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.G) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            }
            if (this.I) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.H) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.G) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            zW = eVar2.W(iArr);
        }
        if (zW) {
            invalidate();
        }
    }

    public final void e() {
        this.B = new RippleDrawable(ce.a.c(this.f5570x.f20865j0), getBackgroundDrawable(), null);
        this.f5570x.getClass();
        setBackground(this.B);
        f();
    }

    public final void f() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f5570x) == null) {
            return;
        }
        int iB = (int) (eVar.B() + eVar.J0 + eVar.G0);
        e eVar2 = this.f5570x;
        int iA = (int) (eVar2.A() + eVar2.C0 + eVar2.F0);
        if (this.f5571y != null) {
            Rect rect = new Rect();
            this.f5571y.getPadding(rect);
            iA += rect.left;
            iB += rect.right;
        }
        setPaddingRelative(iA, getPaddingTop(), iB, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        e eVar = this.f5570x;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        be.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.R);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.M)) {
            return this.M;
        }
        e eVar = this.f5570x;
        if (eVar == null || !eVar.f20880w0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5571y;
        return insetDrawable == null ? this.f5570x : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20882y0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20883z0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20855e0;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return Math.max(0.0f, eVar.C());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5570x;
    }

    public float getChipEndPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.J0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f5570x;
        if (eVar == null || (drawable = eVar.f20870m0) == 0) {
            return null;
        }
        if (!(drawable instanceof l3.a)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20872o0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20871n0;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20857f0;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.C0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20861h0;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20863i0;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        e eVar = this.f5570x;
        if (eVar == null || (drawable = eVar.f20875r0) == 0) {
            return null;
        }
        if (!(drawable instanceof l3.a)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20879v0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.I0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20878u0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.H0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20877t0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20862h1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.O) {
            c cVar = this.N;
            if (cVar.f2390l == 1 || cVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public fd.d getHideMotionSpec() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.B0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.E0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.D0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.f20865j0;
        }
        return null;
    }

    public ee.l getShapeAppearanceModel() {
        return this.f5570x.f8117d.f8097a;
    }

    public fd.d getShowMotionSpec() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.A0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.G0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f5570x;
        if (eVar != null) {
            return eVar.F0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        se.b.U(this, this.f5570x);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, U);
        }
        e eVar = this.f5570x;
        if (eVar != null && eVar.f20880w0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.O) {
            c cVar = this.N;
            int i11 = cVar.f2390l;
            if (i11 != Integer.MIN_VALUE) {
                cVar.j(i11);
            }
            if (z10) {
                cVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f5570x;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f20880w0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.K != i10) {
            this.K = i10;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L45
            goto L50
        L21:
            boolean r0 = r5.G
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.G
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.D
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.O
            if (r0 == 0) goto L43
            qd.c r0 = r5.N
            r0.r(r2, r2)
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r3
        L46:
            r5.setCloseIconPressed(r3)
            goto L51
        L4a:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
            goto L2a
        L50:
            r0 = r3
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            return r3
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.M = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.B) {
            super.setBackground(drawable);
        } else {
            e0.p("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        e0.p("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.B) {
            super.setBackgroundDrawable(drawable);
        } else {
            e0.p("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        e0.p("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        e0.p("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        e0.p("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.H(z10);
        }
    }

    public void setCheckableResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.H(eVar.K0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        e eVar = this.f5570x;
        if (eVar == null) {
            this.F = z10;
        } else if (eVar.f20880w0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.I(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.I(ic.a.r(eVar.K0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.J(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.J(h3.c.c(eVar.K0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.K(eVar.K0.getResources().getBoolean(i10));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.f20855e0 == colorStateList) {
            return;
        }
        eVar.f20855e0 = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList colorStateListC;
        e eVar = this.f5570x;
        if (eVar == null || eVar.f20855e0 == (colorStateListC = h3.c.c(eVar.K0, i10))) {
            return;
        }
        eVar.f20855e0 = colorStateListC;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.L(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.L(eVar.K0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f5570x;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.f20860g1 = new WeakReference(null);
            }
            this.f5570x = eVar;
            eVar.f20864i1 = false;
            eVar.f20860g1 = new WeakReference(this);
            b(this.L);
        }
    }

    public void setChipEndPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.J0 == f10) {
            return;
        }
        eVar.J0 = f10;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipEndPaddingResource(int i10) throws Resources.NotFoundException {
        e eVar = this.f5570x;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i10);
            if (eVar.J0 != dimension) {
                eVar.J0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.M(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.M(ic.a.r(eVar.K0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.N(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.N(eVar.K0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.O(h3.c.c(eVar.K0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.P(eVar.K0.getResources().getBoolean(i10));
        }
    }

    public void setChipMinHeight(float f10) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.f20857f0 == f10) {
            return;
        }
        eVar.f20857f0 = f10;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipMinHeightResource(int i10) throws Resources.NotFoundException {
        e eVar = this.f5570x;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i10);
            if (eVar.f20857f0 != dimension) {
                eVar.f20857f0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.C0 == f10) {
            return;
        }
        eVar.C0 = f10;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setChipStartPaddingResource(int i10) throws Resources.NotFoundException {
        e eVar = this.f5570x;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i10);
            if (eVar.C0 != dimension) {
                eVar.C0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.Q(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.Q(h3.c.c(eVar.K0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.R(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.R(eVar.K0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.S(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.f20879v0 == charSequence) {
            return;
        }
        String str = s3.b.f21858b;
        s3.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? s3.b.f21861e : s3.b.f21860d;
        bVar.getClass();
        g gVar = s3.g.f21868a;
        eVar.f20879v0 = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.T(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.T(eVar.K0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.S(ic.a.r(eVar.K0, i10));
        }
        d();
    }

    public void setCloseIconSize(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.U(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.U(eVar.K0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.V(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.V(eVar.K0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.X(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.X(h3.c.c(eVar.K0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.p(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5570x == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.f20862h1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.J = z10;
        b(this.L);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            e0.p("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(fd.d dVar) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.B0 = dVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.B0 = fd.d.b(eVar.K0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.Z(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.Z(eVar.K0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.a0(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.a0(eVar.K0.getResources().getDimension(i10));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f5570x == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.f20866j1 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.E = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.b0(colorStateList);
        }
        this.f5570x.getClass();
        e();
    }

    public void setRippleColorResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.b0(h3.c.c(eVar.K0, i10));
            this.f5570x.getClass();
            e();
        }
    }

    @Override // ee.v
    public void setShapeAppearanceModel(ee.l lVar) {
        this.f5570x.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(fd.d dVar) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.A0 = dVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.A0 = fd.d.b(eVar.K0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f5570x;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.f20864i1 ? null : charSequence, bufferType);
        e eVar2 = this.f5570x;
        if (eVar2 == null || TextUtils.equals(eVar2.f20867k0, charSequence)) {
            return;
        }
        eVar2.f20867k0 = charSequence;
        eVar2.Q0.f25292e = true;
        eVar2.invalidateSelf();
        eVar2.F();
    }

    public void setTextAppearance(be.d dVar) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.Q0.b(dVar, eVar.K0);
        }
        g();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.G0 == f10) {
            return;
        }
        eVar.G0 = f10;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setTextEndPaddingResource(int i10) throws Resources.NotFoundException {
        e eVar = this.f5570x;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i10);
            if (eVar.G0 != dimension) {
                eVar.G0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        e eVar = this.f5570x;
        if (eVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics());
            h hVar = eVar.Q0;
            be.d dVar = hVar.f25294g;
            if (dVar != null) {
                dVar.f2689l = fApplyDimension;
                hVar.f25288a.setTextSize(fApplyDimension);
                eVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f10) {
        e eVar = this.f5570x;
        if (eVar == null || eVar.F0 == f10) {
            return;
        }
        eVar.F0 = f10;
        eVar.invalidateSelf();
        eVar.F();
    }

    public void setTextStartPaddingResource(int i10) throws Resources.NotFoundException {
        e eVar = this.f5570x;
        if (eVar != null) {
            float dimension = eVar.K0.getResources().getDimension(i10);
            if (eVar.F0 != dimension) {
                eVar.F0 = dimension;
                eVar.invalidateSelf();
                eVar.F();
            }
        }
    }

    public void setCloseIconVisible(boolean z10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.Y(z10);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.K(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        e eVar = this.f5570x;
        if (eVar != null) {
            eVar.P(z10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        e eVar = this.f5570x;
        if (eVar != null) {
            Context context2 = eVar.K0;
            eVar.Q0.b(new be.d(context2, i10), context2);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        e eVar = this.f5570x;
        if (eVar != null) {
            Context context = eVar.K0;
            eVar.Q0.b(new be.d(context, i10), context);
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(xd.d dVar) {
    }
}
