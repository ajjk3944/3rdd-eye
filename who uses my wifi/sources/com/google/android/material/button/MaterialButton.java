package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import defpackage.dk;
import defpackage.dy0;
import defpackage.e2;
import defpackage.ex0;
import defpackage.f2;
import defpackage.fy0;
import defpackage.gn0;
import defpackage.k5;
import defpackage.kf3;
import defpackage.l;
import defpackage.nc0;
import defpackage.no;
import defpackage.nx0;
import defpackage.ob1;
import defpackage.ou1;
import defpackage.ox0;
import defpackage.pu1;
import defpackage.qb1;
import defpackage.rv0;
import defpackage.sb0;
import defpackage.su0;
import defpackage.tb0;
import defpackage.uk2;
import defpackage.um;
import defpackage.vb0;
import defpackage.wb0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MaterialButton extends k5 implements Checkable, rv0 {
    public static final int[] K = {R.attr.state_checkable};
    public static final int[] L = {R.attr.state_checked};
    public static final no M = new no(1);
    public LinearLayout.LayoutParams A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public fy0 F;
    public int G;
    public float H;
    public float I;
    public nx0 J;
    public final wb0 i;
    public final LinkedHashSet j;
    public sb0 k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public Drawable n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(um.A(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.materialButtonStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Button, new int[]{com.phuongpn.whousemywifi.networkscanner.R.attr.materialSizeOverlay}), attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.materialButtonStyle);
        this.j = new LinkedHashSet();
        this.t = false;
        this.u = false;
        this.w = -1;
        this.x = -1.0f;
        this.y = -1;
        this.z = -1;
        this.E = -1;
        Context context2 = getContext();
        TypedArray typedArrayS = uk2.s(context2, attributeSet, gn0.r, com.phuongpn.whousemywifi.networkscanner.R.attr.materialButtonStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.s = typedArrayS.getDimensionPixelSize(13, 0);
        int i = typedArrayS.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.l = qb1.m(i, mode);
        this.m = ob1.e(getContext(), typedArrayS, 15);
        this.n = ob1.i(getContext(), typedArrayS, 11);
        this.v = typedArrayS.getInteger(12, 1);
        this.p = typedArrayS.getDimensionPixelSize(14, 0);
        dy0 dy0VarB = dy0.b(context2, typedArrayS, 19);
        su0 su0VarC = dy0VarB != null ? dy0VarB.c() : su0.b(context2, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.materialButtonStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Button).a();
        boolean z = typedArrayS.getBoolean(17, false);
        wb0 wb0Var = new wb0(this, su0VarC);
        this.i = wb0Var;
        wb0Var.f = typedArrayS.getDimensionPixelOffset(2, 0);
        wb0Var.g = typedArrayS.getDimensionPixelOffset(3, 0);
        wb0Var.h = typedArrayS.getDimensionPixelOffset(4, 0);
        wb0Var.i = typedArrayS.getDimensionPixelOffset(5, 0);
        if (typedArrayS.hasValue(9)) {
            int dimensionPixelSize = typedArrayS.getDimensionPixelSize(9, -1);
            wb0Var.j = dimensionPixelSize;
            float f = dimensionPixelSize;
            f2 f2VarF = wb0Var.b.f();
            f2VarF.e = new l(f);
            f2VarF.f = new l(f);
            f2VarF.g = new l(f);
            f2VarF.h = new l(f);
            wb0Var.b = f2VarF.a();
            wb0Var.c = null;
            wb0Var.d();
            wb0Var.s = true;
        }
        wb0Var.k = typedArrayS.getDimensionPixelSize(22, 0);
        wb0Var.l = qb1.m(typedArrayS.getInt(8, -1), mode);
        wb0Var.m = ob1.e(getContext(), typedArrayS, 7);
        wb0Var.n = ob1.e(getContext(), typedArrayS, 21);
        wb0Var.o = ob1.e(getContext(), typedArrayS, 18);
        wb0Var.t = typedArrayS.getBoolean(6, false);
        wb0Var.w = typedArrayS.getDimensionPixelSize(10, 0);
        wb0Var.u = typedArrayS.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayS.hasValue(0)) {
            wb0Var.r = true;
            setSupportBackgroundTintList(wb0Var.m);
            setSupportBackgroundTintMode(wb0Var.l);
        } else {
            wb0Var.c();
        }
        setPaddingRelative(paddingStart + wb0Var.f, paddingTop + wb0Var.h, paddingEnd + wb0Var.g, paddingBottom + wb0Var.i);
        setCheckedInternal(typedArrayS.getBoolean(1, false));
        if (dy0VarB != null) {
            wb0Var.d = d();
            if (wb0Var.c != null) {
                wb0Var.d();
            }
            wb0Var.c = dy0VarB;
            wb0Var.d();
        }
        setOpticalCenterEnabled(z);
        typedArrayS.recycle();
        setCompoundDrawablePadding(this.s);
        h(this.n != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.C = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.H;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        nc0 nc0VarA;
        if (this.B && this.D && (nc0VarA = this.i.a(false)) != null) {
            return (int) (nc0VarA.h() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        wb0 wb0Var = this.i;
        if (wb0Var == null || !wb0Var.t || this.t == z) {
            return;
        }
        this.t = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.t;
            if (!materialButtonToggleGroup.q) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.u) {
            return;
        }
        this.u = true;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw ex0.e(it);
        }
        this.u = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.H != f) {
            this.H = f;
            j();
            invalidate();
            if (getParent() instanceof vb0) {
                vb0 vb0Var = (vb0) getParent();
                int i = (int) this.H;
                int iIndexOfChild = vb0Var.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (vb0Var.c(i2)) {
                            materialButton2 = (MaterialButton) vb0Var.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = vb0Var.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (vb0Var.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) vb0Var.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final ox0 d() {
        Context context = getContext();
        TypedValue typedValueN = qb1.n(context, com.phuongpn.whousemywifi.networkscanner.R.attr.motionSpringFastSpatial);
        int[] iArr = gn0.B;
        TypedArray typedArrayObtainStyledAttributes = typedValueN == null ? context.obtainStyledAttributes(null, iArr, 0, com.phuongpn.whousemywifi.networkscanner.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueN.resourceId, iArr);
        ox0 ox0Var = new ox0();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            ox0Var.b(f);
            ox0Var.a(f2);
            return ox0Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        wb0 wb0Var = this.i;
        return (wb0Var == null || wb0Var.r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            fy0 r0 = r8.F
            if (r0 != 0) goto L6
            goto L85
        L6:
            nx0 r0 = r8.J
            if (r0 != 0) goto L19
            nx0 r0 = new nx0
            no r1 = com.google.android.material.button.MaterialButton.M
            r0.<init>(r8, r1)
            r8.J = r0
            ox0 r1 = r8.d()
            r0.k = r1
        L19:
            boolean r0 = r8.D
            if (r0 == 0) goto L85
            int r0 = r8.G
            fy0 r1 = r8.F
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.a
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.c
            r5 = r4
        L42:
            int r6 = r1.a
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            f23 r1 = r1.b
            goto L5d
        L59:
            f23[] r1 = r1.d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.g
            ey0 r1 = (defpackage.ey0) r1
            int r2 = r8.getWidth()
            float r3 = r1.b
            int r1 = r1.a
            r5 = 1
            if (r1 != r5) goto L70
            float r1 = (float) r2
            float r3 = r3 * r1
        L6e:
            int r4 = (int) r3
            goto L74
        L70:
            r2 = 2
            if (r1 != r2) goto L74
            goto L6e
        L74:
            int r0 = java.lang.Math.min(r0, r4)
            nx0 r1 = r8.J
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            nx0 r9 = r8.J
            r9.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i = this.v;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.n, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.n, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.n, null, null);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.o)) {
            return this.o;
        }
        wb0 wb0Var = this.i;
        return ((wb0Var == null || !wb0Var.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.E;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.i.j;
        }
        return 0;
    }

    public ox0 getCornerSpringForce() {
        return this.i.d;
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.v;
    }

    public int getIconPadding() {
        return this.s;
    }

    public int getIconSize() {
        return this.p;
    }

    public ColorStateList getIconTint() {
        return this.m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.l;
    }

    public int getInsetBottom() {
        return this.i.i;
    }

    public int getInsetTop() {
        return this.i.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.i.o;
        }
        return null;
    }

    public su0 getShapeAppearanceModel() {
        if (e()) {
            return this.i.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public dy0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.i.c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.i.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.i.k;
        }
        return 0;
    }

    @Override // defpackage.k5
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.i.m : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.k5
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.i.l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.n = drawableMutate;
            drawableMutate.setTintList(this.m);
            PorterDuff.Mode mode = this.l;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int intrinsicWidth = this.p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.n.getIntrinsicWidth();
            }
            int intrinsicHeight = this.p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i = this.q;
            int i2 = this.r;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.n.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.v;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.n) || (((i3 == 3 || i3 == 4) && drawable5 != this.n) || ((i3 == 16 || i3 == 32) && drawable4 != this.n))) {
            g();
        }
    }

    public final void i(int i, int i2) {
        if (this.n == null || getLayout() == null) {
            return;
        }
        int i3 = this.v;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.q = 0;
                if (i3 == 16) {
                    this.r = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.p;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.n.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.s) - getPaddingBottom()) / 2);
                if (this.r != iMax) {
                    this.r = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.r = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.v;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.q = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.p;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.n.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.s) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.v == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.q != textLayoutWidth) {
            this.q = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.t;
    }

    public final void j() {
        int i = (int) (this.H - this.I);
        int i2 = (i / 2) + this.C;
        getLayoutParams().width = (int) (this.x + i);
        setPaddingRelative(this.y + i2, getPaddingTop(), (this.z + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            ou1.w(this, this.i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        wb0 wb0Var = this.i;
        if (wb0Var != null && wb0Var.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, K);
        }
        if (this.t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // defpackage.k5, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.t);
    }

    @Override // defpackage.k5, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        wb0 wb0Var = this.i;
        accessibilityNodeInfo.setCheckable(wb0Var != null && wb0Var.t);
        accessibilityNodeInfo.setChecked(this.t);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.k5, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.w != i6) {
            this.w = i6;
            this.x = -1.0f;
        }
        if (this.x == -1.0f) {
            this.x = getMeasuredWidth();
            if (this.A == null && (getParent() instanceof vb0) && ((vb0) getParent()).getButtonSizeChange() != null) {
                this.A = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A);
                layoutParams.width = (int) this.x;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.E == -1) {
            if (this.n == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.p;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.n.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.E = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.y == -1) {
            this.y = getPaddingStart();
        }
        if (this.z == -1) {
            this.z = getPaddingEnd();
        }
        if ((getParent() instanceof vb0) && ((vb0) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.D = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof tb0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tb0 tb0Var = (tb0) parcelable;
        super.onRestoreInstanceState(tb0Var.f);
        setChecked(tb0Var.h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        tb0 tb0Var = new tb0(super.onSaveInstanceState());
        tb0Var.h = this.t;
        return tb0Var;
    }

    @Override // defpackage.k5, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.i.u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.n != null) {
            if (this.n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!e()) {
            super.setBackgroundColor(i);
            return;
        }
        wb0 wb0Var = this.i;
        if (wb0Var.a(false) != null) {
            wb0Var.a(false).setTint(i);
        }
    }

    @Override // defpackage.k5, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        wb0 wb0Var = this.i;
        wb0Var.r = true;
        MaterialButton materialButton = wb0Var.a;
        materialButton.setSupportBackgroundTintList(wb0Var.m);
        materialButton.setSupportBackgroundTintMode(wb0Var.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.k5, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? ob1.h(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.i.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            wb0 wb0Var = this.i;
            if (wb0Var.s && wb0Var.j == i) {
                return;
            }
            wb0Var.j = i;
            wb0Var.s = true;
            float f = i;
            f2 f2VarF = wb0Var.b.f();
            f2VarF.e = new l(f);
            f2VarF.f = new l(f);
            f2VarF.g = new l(f);
            f2VarF.h = new l(f);
            wb0Var.b = f2VarF.a();
            wb0Var.c = null;
            wb0Var.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(ox0 ox0Var) {
        wb0 wb0Var = this.i;
        wb0Var.d = ox0Var;
        if (wb0Var.c != null) {
            wb0Var.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.I = Math.min(i, this.E);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.i.a(false).p(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.n != drawable) {
            this.n = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.v != i) {
            this.v = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.s != i) {
            this.s = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? ob1.h(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.p != i) {
            this.p = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(ob1.d(getContext(), i));
    }

    public void setInsetBottom(int i) {
        wb0 wb0Var = this.i;
        wb0Var.b(wb0Var.h, i);
    }

    public void setInsetTop(int i) {
        wb0 wb0Var = this.i;
        wb0Var.b(i, wb0Var.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(sb0 sb0Var) {
        this.k = sb0Var;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.B != z) {
            this.B = z;
            wb0 wb0Var = this.i;
            if (z) {
                dk dkVar = new dk(this);
                wb0Var.e = dkVar;
                nc0 nc0VarA = wb0Var.a(false);
                if (nc0VarA != null) {
                    nc0VarA.J = dkVar;
                }
            } else {
                wb0Var.e = null;
                nc0 nc0VarA2 = wb0Var.a(false);
                if (nc0VarA2 != null) {
                    nc0VarA2.J = null;
                }
            }
            post(new e2(12, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        sb0 sb0Var = this.k;
        if (sb0Var != null) {
            ((MaterialButtonToggleGroup) ((kf3) sb0Var).g).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            wb0 wb0Var = this.i;
            MaterialButton materialButton = wb0Var.a;
            if (wb0Var.o != colorStateList) {
                wb0Var.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(pu1.m(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(ob1.d(getContext(), i));
        }
    }

    @Override // defpackage.rv0
    public void setShapeAppearanceModel(su0 su0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        wb0 wb0Var = this.i;
        wb0Var.b = su0Var;
        wb0Var.c = null;
        wb0Var.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            wb0 wb0Var = this.i;
            wb0Var.q = z;
            wb0Var.e();
        }
    }

    public void setSizeChange(fy0 fy0Var) {
        if (this.F != fy0Var) {
            this.F = fy0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(dy0 dy0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        wb0 wb0Var = this.i;
        if (wb0Var.d == null && dy0Var.d()) {
            wb0Var.d = d();
            if (wb0Var.c != null) {
                wb0Var.d();
            }
        }
        wb0Var.c = dy0Var;
        wb0Var.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            wb0 wb0Var = this.i;
            if (wb0Var.n != colorStateList) {
                wb0Var.n = colorStateList;
                wb0Var.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(ob1.d(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            wb0 wb0Var = this.i;
            if (wb0Var.k != i) {
                wb0Var.k = i;
                wb0Var.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.k5
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        wb0 wb0Var = this.i;
        if (wb0Var.m != colorStateList) {
            wb0Var.m = colorStateList;
            if (wb0Var.a(false) != null) {
                wb0Var.a(false).setTintList(wb0Var.m);
            }
        }
    }

    @Override // defpackage.k5
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        wb0 wb0Var = this.i;
        if (wb0Var.l != mode) {
            wb0Var.l = mode;
            if (wb0Var.a(false) == null || wb0Var.l == null) {
                return;
            }
            wb0Var.a(false).setTintMode(wb0Var.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.i.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.x = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.G != i) {
            this.G = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.t);
    }
}
