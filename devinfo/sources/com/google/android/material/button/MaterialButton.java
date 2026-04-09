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
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import ed.b0;
import ed.d0;
import ed.j;
import ed.n;
import ed.o;
import ed.y;
import java.util.Iterator;
import java.util.LinkedHashSet;
import je.u;
import km.i;
import md.a;
import p.p;
import pc.b;
import pc.c;
import pc.d;
import pc.f;
import v4.e;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MaterialButton extends p implements Checkable, y {
    public static final int[] F = {R.attr.state_checkable};
    public static final int[] G = {R.attr.state_checked};
    public static final b H = new b();
    public d0 A;
    public int B;
    public float C;
    public float D;
    public e E;

    /* renamed from: d, reason: collision with root package name */
    public final f f20381d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f20382e;

    /* renamed from: f, reason: collision with root package name */
    public c f20383f;
    public PorterDuff.Mode g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f20384h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f20385i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f20386k;

    /* renamed from: l, reason: collision with root package name */
    public int f20387l;

    /* renamed from: m, reason: collision with root package name */
    public int f20388m;

    /* renamed from: n, reason: collision with root package name */
    public int f20389n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20390o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20391p;

    /* renamed from: q, reason: collision with root package name */
    public int f20392q;

    /* renamed from: r, reason: collision with root package name */
    public int f20393r;

    /* renamed from: s, reason: collision with root package name */
    public float f20394s;

    /* renamed from: t, reason: collision with root package name */
    public int f20395t;

    /* renamed from: u, reason: collision with root package name */
    public int f20396u;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout.LayoutParams f20397v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f20398w;

    /* renamed from: x, reason: collision with root package name */
    public int f20399x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f20400y;

    /* renamed from: z, reason: collision with root package name */
    public int f20401z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.liuzh.deviceinfo.R.attr.materialButtonStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Button, new int[]{com.liuzh.deviceinfo.R.attr.materialSizeOverlay}), attributeSet, com.liuzh.deviceinfo.R.attr.materialButtonStyle);
        this.f20382e = new LinkedHashSet();
        this.f20390o = false;
        this.f20391p = false;
        this.f20393r = -1;
        this.f20394s = -1.0f;
        this.f20395t = -1;
        this.f20396u = -1;
        this.f20401z = -1;
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.f25955p, com.liuzh.deviceinfo.R.attr.materialButtonStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f20389n = typedArrayG.getDimensionPixelSize(13, 0);
        int i4 = typedArrayG.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = m.h(i4, mode);
        this.f20384h = jm.a.j(getContext(), typedArrayG, 15);
        this.f20385i = jm.a.m(getContext(), typedArrayG, 11);
        this.f20392q = typedArrayG.getInteger(12, 1);
        this.f20386k = typedArrayG.getDimensionPixelSize(14, 0);
        b0 b0VarB = b0.b(context2, typedArrayG, 19);
        o oVarC = b0VarB != null ? b0VarB.c() : o.c(context2, attributeSet, com.liuzh.deviceinfo.R.attr.materialButtonStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Button).a();
        boolean z3 = typedArrayG.getBoolean(17, false);
        f fVar = new f(this, oVarC);
        this.f20381d = fVar;
        fVar.f31696f = typedArrayG.getDimensionPixelOffset(2, 0);
        fVar.g = typedArrayG.getDimensionPixelOffset(3, 0);
        fVar.f31697h = typedArrayG.getDimensionPixelOffset(4, 0);
        fVar.f31698i = typedArrayG.getDimensionPixelOffset(5, 0);
        if (typedArrayG.hasValue(9)) {
            int dimensionPixelSize = typedArrayG.getDimensionPixelSize(9, -1);
            fVar.j = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            n nVarG = fVar.f31692b.g();
            nVarG.f23346e = new ed.a(f10);
            nVarG.f23347f = new ed.a(f10);
            nVarG.g = new ed.a(f10);
            nVarG.f23348h = new ed.a(f10);
            fVar.f31692b = nVarG.a();
            fVar.f31693c = null;
            fVar.d();
            fVar.f31707s = true;
        }
        fVar.f31699k = typedArrayG.getDimensionPixelSize(22, 0);
        fVar.f31700l = m.h(typedArrayG.getInt(8, -1), mode);
        fVar.f31701m = jm.a.j(getContext(), typedArrayG, 7);
        fVar.f31702n = jm.a.j(getContext(), typedArrayG, 21);
        fVar.f31703o = jm.a.j(getContext(), typedArrayG, 18);
        fVar.f31708t = typedArrayG.getBoolean(6, false);
        fVar.f31711w = typedArrayG.getDimensionPixelSize(10, 0);
        fVar.f31709u = typedArrayG.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayG.hasValue(0)) {
            fVar.f31706r = true;
            setSupportBackgroundTintList(fVar.f31701m);
            setSupportBackgroundTintMode(fVar.f31700l);
        } else {
            fVar.c();
        }
        setPaddingRelative(paddingStart + fVar.f31696f, paddingTop + fVar.f31697h, paddingEnd + fVar.g, paddingBottom + fVar.f31698i);
        setCheckedInternal(typedArrayG.getBoolean(1, false));
        if (b0VarB != null) {
            fVar.f31694d = d();
            if (fVar.f31693c != null) {
                fVar.d();
            }
            fVar.f31693c = b0VarB;
            fVar.d();
        }
        setOpticalCenterEnabled(z3);
        typedArrayG.recycle();
        setCompoundDrawablePadding(this.f20389n);
        h(this.f20385i != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f20399x = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j jVarA;
        if (this.f20398w && this.f20400y && (jVarA = this.f20381d.a(false)) != null) {
            return (int) (jVarA.i() * 0.11f);
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
        for (int i4 = 0; i4 < lineCount; i4++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i4));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z3) {
        f fVar = this.f20381d;
        if (fVar == null || !fVar.f31708t || this.f20390o == z3) {
            return;
        }
        this.f20390o = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z10 = this.f20390o;
            if (!materialButtonToggleGroup.f20404l) {
                materialButtonToggleGroup.f(getId(), z10);
            }
        }
        if (this.f20391p) {
            return;
        }
        this.f20391p = true;
        Iterator it = this.f20382e.iterator();
        if (it.hasNext()) {
            throw u.o(it);
        }
        this.f20391p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.C != f10) {
            this.C = f10;
            j();
            invalidate();
            if (getParent() instanceof pc.e) {
                pc.e eVar = (pc.e) getParent();
                int i4 = (int) this.C;
                int iIndexOfChild = eVar.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i10 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i10 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (eVar.c(i10)) {
                            materialButton2 = (MaterialButton) eVar.getChildAt(i10);
                            break;
                        }
                        i10--;
                    }
                }
                int childCount = eVar.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (eVar.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) eVar.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i4);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i4);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i4 / 2);
                materialButton.setDisplayedWidthDecrease((i4 + 1) / 2);
            }
        }
    }

    public final v4.f d() {
        Context context = getContext();
        TypedValue typedValueY = ii.a.y(com.liuzh.deviceinfo.R.attr.motionSpringFastSpatial, context);
        int[] iArr = ic.a.f25964y;
        TypedArray typedArrayObtainStyledAttributes = typedValueY == null ? context.obtainStyledAttributes(null, iArr, 0, com.liuzh.deviceinfo.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueY.resourceId, iArr);
        v4.f fVar = new v4.f();
        try {
            float f10 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f10 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f11 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f11 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            fVar.b(f10);
            fVar.a(f11);
            return fVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        f fVar = this.f20381d;
        return (fVar == null || fVar.f31706r) ? false : true;
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
            ed.d0 r0 = r8.A
            if (r0 != 0) goto L6
            goto L85
        L6:
            v4.e r0 = r8.E
            if (r0 != 0) goto L19
            v4.e r0 = new v4.e
            pc.b r1 = com.google.android.material.button.MaterialButton.H
            r0.<init>(r8, r1)
            r8.E = r0
            v4.f r1 = r8.d()
            r0.f35845m = r1
        L19:
            boolean r0 = r8.f20400y
            if (r0 == 0) goto L85
            int r0 = r8.B
            ed.d0 r1 = r8.A
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f23278c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f23276a
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
            int[][] r3 = r1.f23278c
            r5 = r4
        L42:
            int r6 = r1.f23276a
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
            jf.c r1 = r1.f23277b
            goto L5d
        L59:
            jf.c[] r1 = r1.f23279d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f27642b
            ed.c0 r1 = (ed.c0) r1
            int r2 = r8.getWidth()
            float r3 = r1.f23275b
            int r1 = r1.f23274a
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
            v4.e r1 = r8.E
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            v4.e r9 = r8.E
            r9.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i4 = this.f20392q;
        if (i4 == 1 || i4 == 2) {
            setCompoundDrawablesRelative(this.f20385i, null, null, null);
            return;
        }
        if (i4 == 3 || i4 == 4) {
            setCompoundDrawablesRelative(null, null, this.f20385i, null);
        } else if (i4 == 16 || i4 == 32) {
            setCompoundDrawablesRelative(null, this.f20385i, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        f fVar = this.f20381d;
        return ((fVar == null || !fVar.f31708t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f20401z;
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
            return this.f20381d.j;
        }
        return 0;
    }

    public v4.f getCornerSpringForce() {
        return this.f20381d.f31694d;
    }

    public Drawable getIcon() {
        return this.f20385i;
    }

    public int getIconGravity() {
        return this.f20392q;
    }

    public int getIconPadding() {
        return this.f20389n;
    }

    public int getIconSize() {
        return this.f20386k;
    }

    public ColorStateList getIconTint() {
        return this.f20384h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.f20381d.f31698i;
    }

    public int getInsetTop() {
        return this.f20381d.f31697h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f20381d.f31703o;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        if (e()) {
            return this.f20381d.f31692b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public b0 getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f20381d.f31693c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f20381d.f31702n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f20381d.f31699k;
        }
        return 0;
    }

    @Override // p.p
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f20381d.f31701m : super.getSupportBackgroundTintList();
    }

    @Override // p.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f20381d.f31700l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z3) {
        Drawable drawable = this.f20385i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f20385i = drawableMutate;
            drawableMutate.setTintList(this.f20384h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.f20385i.setTintMode(mode);
            }
            int intrinsicWidth = this.f20386k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f20385i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f20386k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f20385i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f20385i;
            int i4 = this.f20387l;
            int i10 = this.f20388m;
            drawable2.setBounds(i4, i10, intrinsicWidth + i4, intrinsicHeight + i10);
            this.f20385i.setVisible(true, z3);
        }
        if (z3) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f20392q;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f20385i) || (((i11 == 3 || i11 == 4) && drawable5 != this.f20385i) || ((i11 == 16 || i11 == 32) && drawable4 != this.f20385i))) {
            g();
        }
    }

    public final void i(int i4, int i10) {
        if (this.f20385i == null || getLayout() == null) {
            return;
        }
        int i11 = this.f20392q;
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.f20387l = 0;
                if (i11 == 16) {
                    this.f20388m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f20386k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f20385i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f20389n) - getPaddingBottom()) / 2);
                if (this.f20388m != iMax) {
                    this.f20388m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f20388m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f20392q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f20387l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f20386k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f20385i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i4 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f20389n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f20392q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f20387l != textLayoutWidth) {
            this.f20387l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f20390o;
    }

    public final void j() {
        int i4 = (int) (this.C - this.D);
        int i10 = (i4 / 2) + this.f20399x;
        getLayoutParams().width = (int) (this.f20394s + i4);
        setPaddingRelative(this.f20395t + i10, getPaddingTop(), (this.f20396u + i4) - i10, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            ii.a.E(this, this.f20381d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        f fVar = this.f20381d;
        if (fVar != null && fVar.f31708t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (this.f20390o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f20390o);
    }

    @Override // p.p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        f fVar = this.f20381d;
        accessibilityNodeInfo.setCheckable(fVar != null && fVar.f31708t);
        accessibilityNodeInfo.setChecked(this.f20390o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p.p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z3, i4, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i14 = getResources().getConfiguration().orientation;
        if (this.f20393r != i14) {
            this.f20393r = i14;
            this.f20394s = -1.0f;
        }
        if (this.f20394s == -1.0f) {
            this.f20394s = getMeasuredWidth();
            if (this.f20397v == null && (getParent() instanceof pc.e) && ((pc.e) getParent()).getButtonSizeChange() != null) {
                this.f20397v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f20397v);
                layoutParams.width = (int) this.f20394s;
                setLayoutParams(layoutParams);
            }
        }
        boolean z10 = false;
        if (this.f20401z == -1) {
            if (this.f20385i == null) {
                i13 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f20386k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f20385i.getIntrinsicWidth();
                }
                i13 = iconPadding + intrinsicWidth;
            }
            this.f20401z = (getMeasuredWidth() - getTextLayoutWidth()) - i13;
        }
        if (this.f20395t == -1) {
            this.f20395t = getPaddingStart();
        }
        if (this.f20396u == -1) {
            this.f20396u = getPaddingEnd();
        }
        if ((getParent() instanceof pc.e) && ((pc.e) getParent()).getOrientation() == 0) {
            z10 = true;
        }
        this.f20400y = z10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f28876a);
        setChecked(dVar.f31682c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f31682c = this.f20390o;
        return dVar;
    }

    @Override // p.p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i4, int i10, int i11) {
        super.onTextChanged(charSequence, i4, i10, i11);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f20381d.f31709u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f20385i != null) {
            if (this.f20385i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        if (!e()) {
            super.setBackgroundColor(i4);
            return;
        }
        f fVar = this.f20381d;
        if (fVar.a(false) != null) {
            fVar.a(false).setTint(i4);
        }
    }

    @Override // p.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        f fVar = this.f20381d;
        fVar.f31706r = true;
        MaterialButton materialButton = fVar.f31691a;
        materialButton.setSupportBackgroundTintList(fVar.f31701m);
        materialButton.setSupportBackgroundTintMode(fVar.f31700l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p.p, android.view.View
    public void setBackgroundResource(int i4) {
        setBackgroundDrawable(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (e()) {
            this.f20381d.f31708t = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        setCheckedInternal(z3);
    }

    public void setCornerRadius(int i4) {
        if (e()) {
            f fVar = this.f20381d;
            if (fVar.f31707s && fVar.j == i4) {
                return;
            }
            fVar.j = i4;
            fVar.f31707s = true;
            float f10 = i4;
            n nVarG = fVar.f31692b.g();
            nVarG.f23346e = new ed.a(f10);
            nVarG.f23347f = new ed.a(f10);
            nVarG.g = new ed.a(f10);
            nVarG.f23348h = new ed.a(f10);
            fVar.f31692b = nVarG.a();
            fVar.f31693c = null;
            fVar.d();
        }
    }

    public void setCornerRadiusResource(int i4) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i4));
        }
    }

    public void setCornerSpringForce(v4.f fVar) {
        f fVar2 = this.f20381d;
        fVar2.f31694d = fVar;
        if (fVar2.f31693c != null) {
            fVar2.d();
        }
    }

    public void setDisplayedWidthDecrease(int i4) {
        this.D = Math.min(i4, this.f20401z);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (e()) {
            this.f20381d.a(false).n(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f20385i != drawable) {
            this.f20385i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i4) {
        if (this.f20392q != i4) {
            this.f20392q = i4;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i4) {
        if (this.f20389n != i4) {
            this.f20389n = i4;
            setCompoundDrawablePadding(i4);
        }
    }

    public void setIconResource(int i4) {
        setIcon(i4 != 0 ? jm.a.l(i4, getContext()) : null);
    }

    public void setIconSize(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f20386k != i4) {
            this.f20386k = i4;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f20384h != colorStateList) {
            this.f20384h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i4) {
        setIconTint(wd.b.r(i4, getContext()));
    }

    public void setInsetBottom(int i4) {
        f fVar = this.f20381d;
        fVar.b(fVar.f31697h, i4);
    }

    public void setInsetTop(int i4) {
        f fVar = this.f20381d;
        fVar.b(i4, fVar.f31698i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(c cVar) {
        this.f20383f = cVar;
    }

    public void setOpticalCenterEnabled(boolean z3) {
        if (this.f20398w != z3) {
            this.f20398w = z3;
            f fVar = this.f20381d;
            if (z3) {
                lf.e eVar = new lf.e(5, this);
                fVar.f31695e = eVar;
                j jVarA = fVar.a(false);
                if (jVarA != null) {
                    jVarA.E = eVar;
                }
            } else {
                fVar.f31695e = null;
                j jVarA2 = fVar.a(false);
                if (jVarA2 != null) {
                    jVarA2.E = null;
                }
            }
            post(new pc.a(this, 0));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        c cVar = this.f20383f;
        if (cVar != null) {
            ((MaterialButtonToggleGroup) ((i) cVar).f28426b).invalidate();
        }
        super.setPressed(z3);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f20381d;
            MaterialButton materialButton = fVar.f31691a;
            if (fVar.f31703o != colorStateList) {
                fVar.f31703o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(cd.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i4) {
        if (e()) {
            setRippleColor(wd.b.r(i4, getContext()));
        }
    }

    @Override // ed.y
    public void setShapeAppearanceModel(o oVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        f fVar = this.f20381d;
        fVar.f31692b = oVar;
        fVar.f31693c = null;
        fVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (e()) {
            f fVar = this.f20381d;
            fVar.f31705q = z3;
            fVar.e();
        }
    }

    public void setSizeChange(d0 d0Var) {
        if (this.A != d0Var) {
            this.A = d0Var;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        f fVar = this.f20381d;
        if (fVar.f31694d == null && b0Var.d()) {
            fVar.f31694d = d();
            if (fVar.f31693c != null) {
                fVar.d();
            }
        }
        fVar.f31693c = b0Var;
        fVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            f fVar = this.f20381d;
            if (fVar.f31702n != colorStateList) {
                fVar.f31702n = colorStateList;
                fVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i4) {
        if (e()) {
            setStrokeColor(wd.b.r(i4, getContext()));
        }
    }

    public void setStrokeWidth(int i4) {
        if (e()) {
            f fVar = this.f20381d;
            if (fVar.f31699k != i4) {
                fVar.f31699k = i4;
                fVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i4) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i4));
        }
    }

    @Override // p.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        f fVar = this.f20381d;
        if (fVar.f31701m != colorStateList) {
            fVar.f31701m = colorStateList;
            if (fVar.a(false) != null) {
                fVar.a(false).setTintList(fVar.f31701m);
            }
        }
    }

    @Override // p.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        f fVar = this.f20381d;
        if (fVar.f31700l != mode) {
            fVar.f31700l = mode;
            if (fVar.a(false) == null || fVar.f31700l == null) {
                return;
            }
            fVar.a(false).setTintMode(fVar.f31700l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i4) {
        super.setTextAlignment(i4);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f20381d.f31709u = z3;
    }

    @Override // android.widget.TextView
    public void setWidth(int i4) {
        this.f20394s = -1.0f;
        super.setWidth(i4);
    }

    public void setWidthChangeMax(int i4) {
        if (this.B != i4) {
            this.B = i4;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f20390o);
    }
}
