package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
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
import androidx.customview.view.AbsSavedState;
import ed.k;
import ed.l;
import ee.b0;
import ee.i;
import ee.v;
import ee.y;
import h7.r1;
import i4.f;
import io.sentry.android.core.e0;
import io.sentry.android.replay.capture.e;
import j4.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import md.c;
import p.n;
import w.g;
import xu.d;

/* loaded from: classes.dex */
public class MaterialButton extends n implements Checkable, v {

    /* renamed from: e0, reason: collision with root package name */
    public static final int[] f5543e0 = {R.attr.state_checkable};

    /* renamed from: f0, reason: collision with root package name */
    public static final int[] f5544f0 = {R.attr.state_checked};

    /* renamed from: g0, reason: collision with root package name */
    public static final int f5545g0 = k.Widget_MaterialComponents_Button;

    /* renamed from: h0, reason: collision with root package name */
    public static final int f5546h0 = ed.b.materialSizeOverlay;

    /* renamed from: i0, reason: collision with root package name */
    public static final md.a f5547i0 = new md.a();
    public PorterDuff.Mode B;
    public ColorStateList D;
    public Drawable E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public int P;
    public int Q;
    public LinearLayout.LayoutParams R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public b0 W;

    /* renamed from: a0, reason: collision with root package name */
    public int f5548a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f5549b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f5550c0;

    /* renamed from: d0, reason: collision with root package name */
    public f f5551d0;

    /* renamed from: r, reason: collision with root package name */
    public final c f5552r;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f5553x;

    /* renamed from: y, reason: collision with root package name */
    public md.b f5554y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public boolean f5555g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f5555g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5555g ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet) {
        int i10 = ed.b.materialButtonStyle;
        int[] iArr = {f5546h0};
        int i11 = f5545g0;
        super(le.a.b(context, attributeSet, i10, i11, iArr), attributeSet, i10);
        this.f5553x = new LinkedHashSet();
        this.K = false;
        this.L = false;
        this.N = -1;
        this.O = -1.0f;
        this.P = -1;
        this.Q = -1;
        this.V = -1;
        Context context2 = getContext();
        TypedArray typedArrayD = xd.k.d(context2, attributeSet, l.MaterialButton, i10, i11, new int[0]);
        this.J = typedArrayD.getDimensionPixelSize(l.MaterialButton_iconPadding, 0);
        int i12 = typedArrayD.getInt(l.MaterialButton_iconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.B = xd.l.d(i12, mode);
        this.D = xu.l.q(getContext(), typedArrayD, l.MaterialButton_iconTint);
        this.E = xu.l.t(getContext(), typedArrayD, l.MaterialButton_icon);
        this.M = typedArrayD.getInteger(l.MaterialButton_iconGravity, 1);
        this.G = typedArrayD.getDimensionPixelSize(l.MaterialButton_iconSize, 0);
        y yVarB = y.b(context2, typedArrayD, l.MaterialButton_shapeAppearance);
        ee.l lVarC = yVarB != null ? yVarB.c() : ee.l.c(context2, attributeSet, i10, i11).b();
        boolean z10 = typedArrayD.getBoolean(l.MaterialButton_opticalCenterEnabled, false);
        c cVar = new c(this, lVarC);
        this.f5552r = cVar;
        cVar.f16682f = typedArrayD.getDimensionPixelOffset(l.MaterialButton_android_insetLeft, 0);
        cVar.f16683g = typedArrayD.getDimensionPixelOffset(l.MaterialButton_android_insetRight, 0);
        cVar.f16684h = typedArrayD.getDimensionPixelOffset(l.MaterialButton_android_insetTop, 0);
        cVar.f16685i = typedArrayD.getDimensionPixelOffset(l.MaterialButton_android_insetBottom, 0);
        if (typedArrayD.hasValue(l.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(l.MaterialButton_cornerRadius, -1);
            cVar.j = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            bk.f fVarG = cVar.f16678b.g();
            fVarG.f2807e = new ee.a(f10);
            fVarG.f2808f = new ee.a(f10);
            fVarG.f2809g = new ee.a(f10);
            fVarG.f2810h = new ee.a(f10);
            cVar.f16678b = fVarG.b();
            cVar.f16679c = null;
            cVar.d();
            cVar.f16693s = true;
        }
        cVar.k = typedArrayD.getDimensionPixelSize(l.MaterialButton_strokeWidth, 0);
        cVar.f16686l = xd.l.d(typedArrayD.getInt(l.MaterialButton_backgroundTintMode, -1), mode);
        cVar.f16687m = xu.l.q(getContext(), typedArrayD, l.MaterialButton_backgroundTint);
        cVar.f16688n = xu.l.q(getContext(), typedArrayD, l.MaterialButton_strokeColor);
        cVar.f16689o = xu.l.q(getContext(), typedArrayD, l.MaterialButton_rippleColor);
        cVar.f16694t = typedArrayD.getBoolean(l.MaterialButton_android_checkable, false);
        cVar.f16697w = typedArrayD.getDimensionPixelSize(l.MaterialButton_elevation, 0);
        cVar.f16695u = typedArrayD.getBoolean(l.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(l.MaterialButton_android_background)) {
            cVar.f16692r = true;
            setSupportBackgroundTintList(cVar.f16687m);
            setSupportBackgroundTintMode(cVar.f16686l);
        } else {
            cVar.c();
        }
        setPaddingRelative(paddingStart + cVar.f16682f, paddingTop + cVar.f16684h, paddingEnd + cVar.f16683g, paddingBottom + cVar.f16685i);
        setCheckedInternal(typedArrayD.getBoolean(l.MaterialButton_android_checked, false));
        if (yVarB != null) {
            cVar.f16680d = d();
            if (cVar.f16679c != null) {
                cVar.d();
            }
            cVar.f16679c = yVarB;
            cVar.d();
        }
        setOpticalCenterEnabled(z10);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.J);
        h(this.E != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.T = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f5549b0;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        i iVarA;
        if (this.S && this.U && (iVarA = this.f5552r.a(false)) != null) {
            return (int) (iVarA.i() * 0.11f);
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
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z10) {
        c cVar = this.f5552r;
        if (cVar == null || !cVar.f16694t || this.K == z10) {
            return;
        }
        this.K = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z11 = this.K;
            if (!materialButtonToggleGroup.I) {
                materialButtonToggleGroup.f(getId(), z11);
            }
        }
        if (this.L) {
            return;
        }
        this.L = true;
        Iterator it = this.f5553x.iterator();
        if (it.hasNext()) {
            throw g.d(it);
        }
        this.L = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f5549b0 != f10) {
            this.f5549b0 = f10;
            j();
            invalidate();
            if (getParent() instanceof b) {
                b bVar = (b) getParent();
                int i10 = (int) this.f5549b0;
                int iIndexOfChild = bVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i11 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i11 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (bVar.c(i11)) {
                            materialButton2 = (MaterialButton) bVar.getChildAt(i11);
                            break;
                        }
                        i11--;
                    }
                }
                int childCount = bVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (bVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) bVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i10);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i10);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i10 / 2);
                materialButton.setDisplayedWidthDecrease((i10 + 1) / 2);
            }
        }
    }

    public final i4.g d() {
        Context context = getContext();
        int i10 = ed.b.motionSpringFastSpatial;
        int i11 = k.Motion_Material3_Spring_Standard_Fast_Spatial;
        TypedValue typedValueC0 = d.c0(context, i10);
        TypedArray typedArrayObtainStyledAttributes = typedValueC0 == null ? context.obtainStyledAttributes(null, l.MaterialSpring, 0, i11) : context.obtainStyledAttributes(typedValueC0.resourceId, l.MaterialSpring);
        i4.g gVar = new i4.g();
        try {
            float f10 = typedArrayObtainStyledAttributes.getFloat(l.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(l.MaterialSpring_damping, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            gVar.b(f10);
            gVar.a(f11);
            return gVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        c cVar = this.f5552r;
        return (cVar == null || cVar.f16692r) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r9) {
        /*
            r8 = this;
            ee.b0 r0 = r8.W
            if (r0 != 0) goto L6
            goto L89
        L6:
            i4.f r0 = r8.f5551d0
            if (r0 != 0) goto L19
            i4.f r0 = new i4.f
            md.a r1 = com.google.android.material.button.MaterialButton.f5547i0
            r0.<init>(r8, r1)
            r8.f5551d0 = r0
            i4.g r1 = r8.d()
            r0.f11226m = r1
        L19:
            boolean r0 = r8.U
            if (r0 == 0) goto L89
            int r0 = r8.f5548a0
            ee.b0 r1 = r8.W
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f8091c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f8089a
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
            int[][] r3 = r1.f8091c
            r5 = r4
        L42:
            int r6 = r1.f8089a
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
            b9.e r1 = r1.f8090b
            goto L5d
        L59:
            b9.e[] r1 = r1.f8092d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f2481d
            ee.z r1 = (ee.z) r1
            int r2 = r8.getWidth()
            float r3 = r1.f8181a
            java.lang.Object r1 = r1.f8182d
            ee.a0 r1 = (ee.a0) r1
            ee.a0 r5 = ee.a0.PERCENT
            if (r1 != r5) goto L73
            float r1 = (float) r2
            float r3 = r3 * r1
        L71:
            int r4 = (int) r3
            goto L78
        L73:
            ee.a0 r2 = ee.a0.PIXELS
            if (r1 != r2) goto L78
            goto L71
        L78:
            int r0 = java.lang.Math.min(r0, r4)
            i4.f r1 = r8.f5551d0
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L89
            i4.f r9 = r8.f5551d0
            r9.d()
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i10 = this.M;
        if (i10 == 1 || i10 == 2) {
            setCompoundDrawablesRelative(this.E, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            setCompoundDrawablesRelative(null, null, this.E, null);
        } else if (i10 == 16 || i10 == 32) {
            setCompoundDrawablesRelative(null, this.E, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.F)) {
            return this.F;
        }
        c cVar = this.f5552r;
        return ((cVar == null || !cVar.f16694t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.V;
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
            return this.f5552r.j;
        }
        return 0;
    }

    public i4.g getCornerSpringForce() {
        return this.f5552r.f16680d;
    }

    public Drawable getIcon() {
        return this.E;
    }

    public int getIconGravity() {
        return this.M;
    }

    public int getIconPadding() {
        return this.J;
    }

    public int getIconSize() {
        return this.G;
    }

    public ColorStateList getIconTint() {
        return this.D;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.B;
    }

    public int getInsetBottom() {
        return this.f5552r.f16685i;
    }

    public int getInsetTop() {
        return this.f5552r.f16684h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f5552r.f16689o;
        }
        return null;
    }

    public ee.l getShapeAppearanceModel() {
        if (e()) {
            return this.f5552r.f16678b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public y getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f5552r.f16679c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f5552r.f16688n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f5552r.k;
        }
        return 0;
    }

    @Override // p.n
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f5552r.f16687m : super.getSupportBackgroundTintList();
    }

    @Override // p.n
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f5552r.f16686l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z10) {
        Drawable drawable = this.E;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.E = drawableMutate;
            drawableMutate.setTintList(this.D);
            PorterDuff.Mode mode = this.B;
            if (mode != null) {
                this.E.setTintMode(mode);
            }
            int intrinsicWidth = this.G;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.E.getIntrinsicWidth();
            }
            int intrinsicHeight = this.G;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.E.getIntrinsicHeight();
            }
            Drawable drawable2 = this.E;
            int i10 = this.H;
            int i11 = this.I;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.E.setVisible(true, z10);
        }
        if (z10) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i12 = this.M;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.E) || (((i12 == 3 || i12 == 4) && drawable5 != this.E) || ((i12 == 16 || i12 == 32) && drawable4 != this.E))) {
            g();
        }
    }

    public final void i(int i10, int i11) {
        if (this.E == null || getLayout() == null) {
            return;
        }
        int i12 = this.M;
        if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.H = 0;
                if (i12 == 16) {
                    this.I = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.G;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.E.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.J) - getPaddingBottom()) / 2);
                if (this.I != iMax) {
                    this.I = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.I = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.M;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.H = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.G;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.E.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.J) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.M == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.H != textLayoutWidth) {
            this.H = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.K;
    }

    public final void j() {
        int i10 = (int) (this.f5549b0 - this.f5550c0);
        int i11 = (i10 / 2) + this.T;
        getLayoutParams().width = (int) (this.O + i10);
        setPaddingRelative(this.P + i11, getPaddingTop(), (this.Q + i10) - i11, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            se.b.U(this, this.f5552r.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        c cVar = this.f5552r;
        if (cVar != null && cVar.f16694t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5543e0);
        }
        if (this.K) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5544f0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.n, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.K);
    }

    @Override // p.n, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f5552r;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f16694t);
        accessibilityNodeInfo.setChecked(this.K);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p.n, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.N != i15) {
            this.N = i15;
            this.O = -1.0f;
        }
        if (this.O == -1.0f) {
            this.O = getMeasuredWidth();
            if (this.R == null && (getParent() instanceof b) && ((b) getParent()).getButtonSizeChange() != null) {
                this.R = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.R);
                layoutParams.width = (int) this.O;
                setLayoutParams(layoutParams);
            }
        }
        boolean z11 = false;
        if (this.V == -1) {
            if (this.E == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.G;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.E.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.V = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.P == -1) {
            this.P = getPaddingStart();
        }
        if (this.Q == -1) {
            this.Q = getPaddingEnd();
        }
        if ((getParent() instanceof b) && ((b) getParent()).getOrientation() == 0) {
            z11 = true;
        }
        this.U = z11;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1243a);
        setChecked(savedState.f5555g);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5555g = this.K;
        return savedState;
    }

    @Override // p.n, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f5552r.f16695u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.E != null) {
            if (this.E.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.F = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!e()) {
            super.setBackgroundColor(i10);
            return;
        }
        c cVar = this.f5552r;
        if (cVar.a(false) != null) {
            cVar.a(false).setTint(i10);
        }
    }

    @Override // p.n, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        e0.p("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f5552r;
        cVar.f16692r = true;
        MaterialButton materialButton = cVar.f16677a;
        materialButton.setSupportBackgroundTintList(cVar.f16687m);
        materialButton.setSupportBackgroundTintMode(cVar.f16686l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.n, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? ic.a.r(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (e()) {
            this.f5552r.f16694t = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (e()) {
            c cVar = this.f5552r;
            if (cVar.f16693s && cVar.j == i10) {
                return;
            }
            cVar.j = i10;
            cVar.f16693s = true;
            float f10 = i10;
            bk.f fVarG = cVar.f16678b.g();
            fVarG.f2807e = new ee.a(f10);
            fVarG.f2808f = new ee.a(f10);
            fVarG.f2809g = new ee.a(f10);
            fVarG.f2810h = new ee.a(f10);
            cVar.f16678b = fVarG.b();
            cVar.f16679c = null;
            cVar.d();
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(i4.g gVar) {
        c cVar = this.f5552r;
        cVar.f16680d = gVar;
        if (cVar.f16679c != null) {
            cVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.f5550c0 = Math.min(i10, this.V);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            this.f5552r.a(false).p(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.E != drawable) {
            this.E = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.M != i10) {
            this.M = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.J != i10) {
            this.J = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? ic.a.r(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.G != i10) {
            this.G = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.B != mode) {
            this.B = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(h3.c.c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        c cVar = this.f5552r;
        cVar.b(cVar.f16684h, i10);
    }

    public void setInsetTop(int i10) {
        c cVar = this.f5552r;
        cVar.b(i10, cVar.f16685i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(md.b bVar) {
        this.f5554y = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.S != z10) {
            this.S = z10;
            c cVar = this.f5552r;
            if (z10) {
                e eVar = new e(16, this);
                cVar.f16681e = eVar;
                i iVarA = cVar.a(false);
                if (iVarA != null) {
                    iVarA.f8116a0 = eVar;
                }
            } else {
                cVar.f16681e = null;
                i iVarA2 = cVar.a(false);
                if (iVarA2 != null) {
                    iVarA2.f8116a0 = null;
                }
            }
            post(new o(9, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        md.b bVar = this.f5554y;
        if (bVar != null) {
            ((MaterialButtonToggleGroup) ((r1) bVar).f10199d).invalidate();
        }
        super.setPressed(z10);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            c cVar = this.f5552r;
            MaterialButton materialButton = cVar.f16677a;
            if (cVar.f16689o != colorStateList) {
                cVar.f16689o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(ce.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (e()) {
            setRippleColor(h3.c.c(getContext(), i10));
        }
    }

    @Override // ee.v
    public void setShapeAppearanceModel(ee.l lVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        c cVar = this.f5552r;
        cVar.f16678b = lVar;
        cVar.f16679c = null;
        cVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (e()) {
            c cVar = this.f5552r;
            cVar.f16691q = z10;
            cVar.e();
        }
    }

    public void setSizeChange(b0 b0Var) {
        if (this.W != b0Var) {
            this.W = b0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(y yVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        c cVar = this.f5552r;
        if (cVar.f16680d == null && yVar.d()) {
            cVar.f16680d = d();
            if (cVar.f16679c != null) {
                cVar.d();
            }
        }
        cVar.f16679c = yVar;
        cVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            c cVar = this.f5552r;
            if (cVar.f16688n != colorStateList) {
                cVar.f16688n = colorStateList;
                cVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (e()) {
            setStrokeColor(h3.c.c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (e()) {
            c cVar = this.f5552r;
            if (cVar.k != i10) {
                cVar.k = i10;
                cVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // p.n
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f5552r;
        if (cVar.f16687m != colorStateList) {
            cVar.f16687m = colorStateList;
            if (cVar.a(false) != null) {
                cVar.a(false).setTintList(cVar.f16687m);
            }
        }
    }

    @Override // p.n
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f5552r;
        if (cVar.f16686l != mode) {
            cVar.f16686l = mode;
            if (cVar.a(false) == null || cVar.f16686l == null) {
                return;
            }
            cVar.a(false).setTintMode(cVar.f16686l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f5552r.f16695u = z10;
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.O = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(int i10) {
        if (this.f5548a0 != i10) {
            this.f5548a0 = i10;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.K);
    }
}
