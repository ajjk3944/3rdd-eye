package com.google.android.material.button;

import A.f;
import B3.n;
import G3.G;
import G3.I;
import G3.j;
import G3.o;
import G3.z;
import O3.a;
import a4.p;
import a4.t;
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
import androidx.appcompat.widget.AppCompatButton;
import com.bumptech.glide.c;
import d3.AbstractC2266a;
import d5.y;
import e0.C2297e;
import h0.C2352b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l3.AbstractC2645d;
import l3.C2643b;
import l3.C2646e;
import l3.InterfaceC2642a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, z {

    /* renamed from: T, reason: collision with root package name */
    public static final int[] f18170T = {R.attr.state_checkable};

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f18171U = {R.attr.state_checked};

    /* renamed from: V, reason: collision with root package name */
    public static final n f18172V = new n(1);

    /* renamed from: C, reason: collision with root package name */
    public boolean f18173C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f18174D;

    /* renamed from: E, reason: collision with root package name */
    public int f18175E;

    /* renamed from: F, reason: collision with root package name */
    public int f18176F;

    /* renamed from: G, reason: collision with root package name */
    public float f18177G;

    /* renamed from: H, reason: collision with root package name */
    public int f18178H;

    /* renamed from: I, reason: collision with root package name */
    public int f18179I;

    /* renamed from: J, reason: collision with root package name */
    public LinearLayout.LayoutParams f18180J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f18181K;

    /* renamed from: L, reason: collision with root package name */
    public int f18182L;
    public boolean M;

    /* renamed from: N, reason: collision with root package name */
    public int f18183N;

    /* renamed from: O, reason: collision with root package name */
    public I f18184O;

    /* renamed from: P, reason: collision with root package name */
    public int f18185P;

    /* renamed from: Q, reason: collision with root package name */
    public float f18186Q;

    /* renamed from: R, reason: collision with root package name */
    public float f18187R;

    /* renamed from: S, reason: collision with root package name */
    public C2297e f18188S;

    /* renamed from: d, reason: collision with root package name */
    public final C2646e f18189d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f18190e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2642a f18191f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f18192g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f18193h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f18194j;

    /* renamed from: k, reason: collision with root package name */
    public int f18195k;

    /* renamed from: l, reason: collision with root package name */
    public int f18196l;

    /* renamed from: m, reason: collision with root package name */
    public int f18197m;

    /* renamed from: n, reason: collision with root package name */
    public int f18198n;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.b(context, attributeSet, com.apm.insight.R.attr.materialButtonStyle, com.apm.insight.R.style.Widget_MaterialComponents_Button, new int[]{com.apm.insight.R.attr.materialSizeOverlay}), attributeSet, com.apm.insight.R.attr.materialButtonStyle);
        this.f18190e = new LinkedHashSet();
        this.f18173C = false;
        this.f18174D = false;
        this.f18176F = -1;
        this.f18177G = -1.0f;
        this.f18178H = -1;
        this.f18179I = -1;
        this.f18183N = -1;
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19765t, com.apm.insight.R.attr.materialButtonStyle, com.apm.insight.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f18198n = typedArrayI.getDimensionPixelSize(13, 0);
        int i = typedArrayI.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f18192g = AbstractC2993B.k(i, mode);
        this.f18193h = c.n(getContext(), typedArrayI, 15);
        this.i = c.r(getContext(), typedArrayI, 11);
        this.f18175E = typedArrayI.getInteger(12, 1);
        this.f18195k = typedArrayI.getDimensionPixelSize(14, 0);
        G gB = G.b(context2, typedArrayI, 19);
        o oVarC = gB != null ? gB.c() : o.c(context2, attributeSet, com.apm.insight.R.attr.materialButtonStyle, com.apm.insight.R.style.Widget_MaterialComponents_Button).a();
        boolean z6 = typedArrayI.getBoolean(17, false);
        C2646e c2646e = new C2646e(this, oVarC);
        this.f18189d = c2646e;
        c2646e.f21842f = typedArrayI.getDimensionPixelOffset(2, 0);
        c2646e.f21843g = typedArrayI.getDimensionPixelOffset(3, 0);
        c2646e.f21844h = typedArrayI.getDimensionPixelOffset(4, 0);
        c2646e.i = typedArrayI.getDimensionPixelOffset(5, 0);
        if (typedArrayI.hasValue(9)) {
            int dimensionPixelSize = typedArrayI.getDimensionPixelSize(9, -1);
            c2646e.f21845j = dimensionPixelSize;
            G3.n nVarG = c2646e.f21838b.g();
            nVarG.c(dimensionPixelSize);
            c2646e.f21838b = nVarG.a();
            c2646e.f21839c = null;
            c2646e.d();
            c2646e.f21854s = true;
        }
        c2646e.f21846k = typedArrayI.getDimensionPixelSize(22, 0);
        c2646e.f21847l = AbstractC2993B.k(typedArrayI.getInt(8, -1), mode);
        c2646e.f21848m = c.n(getContext(), typedArrayI, 7);
        c2646e.f21849n = c.n(getContext(), typedArrayI, 21);
        c2646e.f21850o = c.n(getContext(), typedArrayI, 18);
        c2646e.f21855t = typedArrayI.getBoolean(6, false);
        c2646e.f21858w = typedArrayI.getDimensionPixelSize(10, 0);
        c2646e.f21856u = typedArrayI.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayI.hasValue(0)) {
            c2646e.f21853r = true;
            setSupportBackgroundTintList(c2646e.f21848m);
            setSupportBackgroundTintMode(c2646e.f21847l);
        } else {
            c2646e.c();
        }
        setPaddingRelative(paddingStart + c2646e.f21842f, paddingTop + c2646e.f21844h, paddingEnd + c2646e.f21843g, paddingBottom + c2646e.i);
        setCheckedInternal(typedArrayI.getBoolean(1, false));
        if (gB != null) {
            c2646e.f21840d = d();
            if (c2646e.f21839c != null) {
                c2646e.d();
            }
            c2646e.f21839c = gB;
            c2646e.d();
        }
        setOpticalCenterEnabled(z6);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f18198n);
        h(this.i != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f18182L = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.f18186Q;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        j jVarA;
        if (this.f18181K && this.M && (jVarA = this.f18189d.a(false)) != null) {
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
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z6) {
        C2646e c2646e = this.f18189d;
        if (c2646e == null || !c2646e.f21855t || this.f18173C == z6) {
            return;
        }
        this.f18173C = z6;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z7 = this.f18173C;
            if (!materialButtonToggleGroup.f18203l) {
                materialButtonToggleGroup.f(getId(), z7);
            }
        }
        if (this.f18174D) {
            return;
        }
        this.f18174D = true;
        Iterator it = this.f18190e.iterator();
        if (it.hasNext()) {
            throw f.f(it);
        }
        this.f18174D = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f2) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.f18186Q != f2) {
            this.f18186Q = f2;
            j();
            invalidate();
            if (getParent() instanceof AbstractC2645d) {
                AbstractC2645d abstractC2645d = (AbstractC2645d) getParent();
                int i = (int) this.f18186Q;
                int iIndexOfChild = abstractC2645d.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i3 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i3 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (abstractC2645d.c(i3)) {
                            materialButton2 = (MaterialButton) abstractC2645d.getChildAt(i3);
                            break;
                        }
                        i3--;
                    }
                }
                int childCount = abstractC2645d.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (abstractC2645d.c(iIndexOfChild)) {
                        materialButton = (MaterialButton) abstractC2645d.getChildAt(iIndexOfChild);
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

    public final e0.f d() {
        Context context = getContext();
        TypedValue typedValueN = y.n(context, com.apm.insight.R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC2266a.f19726D;
        TypedArray typedArrayObtainStyledAttributes = typedValueN == null ? context.obtainStyledAttributes(null, iArr, 0, com.apm.insight.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueN.resourceId, iArr);
        e0.f fVar = new e0.f();
        try {
            float f2 = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f5 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f5 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            fVar.b(f2);
            fVar.a(f5);
            return fVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        C2646e c2646e = this.f18189d;
        return (c2646e == null || c2646e.f21853r) ? false : true;
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
            G3.I r0 = r8.f18184O
            if (r0 != 0) goto L6
            goto L85
        L6:
            e0.e r0 = r8.f18188S
            if (r0 != 0) goto L19
            e0.e r0 = new e0.e
            B3.n r1 = com.google.android.material.button.MaterialButton.f18172V
            r0.<init>(r8, r1)
            r8.f18188S = r0
            e0.f r1 = r8.d()
            r0.f19884k = r1
        L19:
            boolean r0 = r8.M
            if (r0 == 0) goto L85
            int r0 = r8.f18185P
            G3.I r1 = r8.f18184O
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.f1552c
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.f1550a
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
            int[][] r3 = r1.f1552c
            r5 = r4
        L42:
            int r6 = r1.f1550a
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
            A2.e r1 = r1.f1551b
            goto L5d
        L59:
            A2.e[] r1 = r1.f1553d
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.f245b
            G3.H r1 = (G3.H) r1
            int r2 = r8.getWidth()
            float r3 = r1.f1549b
            int r1 = r1.f1548a
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
            e0.e r1 = r8.f18188S
            float r0 = (float) r0
            r1.a(r0)
            if (r9 == 0) goto L85
            e0.e r9 = r8.f18188S
            r9.d()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.f(boolean):void");
    }

    public final void g() {
        int i = this.f18175E;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f18194j)) {
            return this.f18194j;
        }
        C2646e c2646e = this.f18189d;
        return ((c2646e == null || !c2646e.f21855t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f18183N;
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
            return this.f18189d.f21845j;
        }
        return 0;
    }

    public e0.f getCornerSpringForce() {
        return this.f18189d.f21840d;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f18175E;
    }

    public int getIconPadding() {
        return this.f18198n;
    }

    public int getIconSize() {
        return this.f18195k;
    }

    public ColorStateList getIconTint() {
        return this.f18193h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f18192g;
    }

    public int getInsetBottom() {
        return this.f18189d.i;
    }

    public int getInsetTop() {
        return this.f18189d.f21844h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f18189d.f21850o;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        if (e()) {
            return this.f18189d.f21838b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public G getStateListShapeAppearanceModel() {
        if (e()) {
            return this.f18189d.f21839c;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f18189d.f21849n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f18189d.f21846k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f18189d.f21848m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f18189d.f21847l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z6) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.i = drawableMutate;
            drawableMutate.setTintList(this.f18193h);
            PorterDuff.Mode mode = this.f18192g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int intrinsicWidth = this.f18195k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f18195k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i = this.f18196l;
            int i3 = this.f18197m;
            drawable2.setBounds(i, i3, intrinsicWidth + i, intrinsicHeight + i3);
            this.i.setVisible(true, z6);
        }
        if (z6) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i6 = this.f18175E;
        if (((i6 == 1 || i6 == 2) && drawable3 != this.i) || (((i6 == 3 || i6 == 4) && drawable5 != this.i) || ((i6 == 16 || i6 == 32) && drawable4 != this.i))) {
            g();
        }
    }

    public final void i(int i, int i3) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i6 = this.f18175E;
        if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
            if (i6 == 16 || i6 == 32) {
                this.f18196l = 0;
                if (i6 == 16) {
                    this.f18197m = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f18195k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f18198n) - getPaddingBottom()) / 2);
                if (this.f18197m != iMax) {
                    this.f18197m = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f18197m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i7 = this.f18175E;
        if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f18196l = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f18195k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f18198n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f18175E == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f18196l != textLayoutWidth) {
            this.f18196l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f18173C;
    }

    public final void j() {
        int i = (int) (this.f18186Q - this.f18187R);
        int i3 = (i / 2) + this.f18182L;
        getLayoutParams().width = (int) (this.f18177G + i);
        setPaddingRelative(this.f18178H + i3, getPaddingTop(), (this.f18179I + i) - i3, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            p.r(this, this.f18189d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C2646e c2646e = this.f18189d;
        if (c2646e != null && c2646e.f21855t) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18170T);
        }
        if (this.f18173C) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18171U);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f18173C);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C2646e c2646e = this.f18189d;
        accessibilityNodeInfo.setCheckable(c2646e != null && c2646e.f21855t);
        accessibilityNodeInfo.setChecked(this.f18173C);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        int i8;
        super.onLayout(z6, i, i3, i6, i7);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i9 = getResources().getConfiguration().orientation;
        if (this.f18176F != i9) {
            this.f18176F = i9;
            this.f18177G = -1.0f;
        }
        if (this.f18177G == -1.0f) {
            this.f18177G = getMeasuredWidth();
            if (this.f18180J == null && (getParent() instanceof AbstractC2645d) && ((AbstractC2645d) getParent()).getButtonSizeChange() != null) {
                this.f18180J = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f18180J);
                layoutParams.width = (int) this.f18177G;
                setLayoutParams(layoutParams);
            }
        }
        boolean z7 = false;
        if (this.f18183N == -1) {
            if (this.i == null) {
                i8 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f18195k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.i.getIntrinsicWidth();
                }
                i8 = iconPadding + intrinsicWidth;
            }
            this.f18183N = (getMeasuredWidth() - getTextLayoutWidth()) - i8;
        }
        if (this.f18178H == -1) {
            this.f18178H = getPaddingStart();
        }
        if (this.f18179I == -1) {
            this.f18179I = getPaddingEnd();
        }
        if ((getParent() instanceof AbstractC2645d) && ((AbstractC2645d) getParent()).getOrientation() == 0) {
            z7 = true;
        }
        this.M = z7;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2643b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2643b c2643b = (C2643b) parcelable;
        super.onRestoreInstanceState(c2643b.f3954a);
        setChecked(c2643b.f21826c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C2643b c2643b = new C2643b(super.onSaveInstanceState());
        c2643b.f21826c = this.f18173C;
        return c2643b;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i3, int i6) {
        super.onTextChanged(charSequence, i, i3, i6);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.f18189d.f21856u) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f18194j = str;
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
        C2646e c2646e = this.f18189d;
        if (c2646e.a(false) != null) {
            c2646e.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
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
        C2646e c2646e = this.f18189d;
        c2646e.f21853r = true;
        MaterialButton materialButton = c2646e.f21837a;
        materialButton.setSupportBackgroundTintList(c2646e.f21848m);
        materialButton.setSupportBackgroundTintMode(c2646e.f21847l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? t.i(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (e()) {
            this.f18189d.f21855t = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        setCheckedInternal(z6);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            C2646e c2646e = this.f18189d;
            if (c2646e.f21854s && c2646e.f21845j == i) {
                return;
            }
            c2646e.f21845j = i;
            c2646e.f21854s = true;
            G3.n nVarG = c2646e.f21838b.g();
            nVarG.c(i);
            c2646e.f21838b = nVarG.a();
            c2646e.f21839c = null;
            c2646e.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(e0.f fVar) {
        C2646e c2646e = this.f18189d;
        c2646e.f21840d = fVar;
        if (c2646e.f21839c != null) {
            c2646e.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f18187R = Math.min(i, this.f18183N);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            this.f18189d.a(false).p(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f18175E != i) {
            this.f18175E = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f18198n != i) {
            this.f18198n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? t.i(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f18195k != i) {
            this.f18195k = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f18193h != colorStateList) {
            this.f18193h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f18192g != mode) {
            this.f18192g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(G.c.b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C2646e c2646e = this.f18189d;
        c2646e.b(c2646e.f21844h, i);
    }

    public void setInsetTop(int i) {
        C2646e c2646e = this.f18189d;
        c2646e.b(i, c2646e.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC2642a interfaceC2642a) {
        this.f18191f = interfaceC2642a;
    }

    public void setOpticalCenterEnabled(boolean z6) {
        if (this.f18181K != z6) {
            this.f18181K = z6;
            C2646e c2646e = this.f18189d;
            if (z6) {
                F4.c cVar = new F4.c(20, this);
                c2646e.f21841e = cVar;
                j jVarA = c2646e.a(false);
                if (jVarA != null) {
                    jVarA.f1595S = cVar;
                }
            } else {
                c2646e.f21841e = null;
                j jVarA2 = c2646e.a(false);
                if (jVarA2 != null) {
                    jVarA2.f1595S = null;
                }
            }
            post(new A3.z(16, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        InterfaceC2642a interfaceC2642a = this.f18191f;
        if (interfaceC2642a != null) {
            ((MaterialButtonToggleGroup) ((C2352b) interfaceC2642a).f20444b).invalidate();
        }
        super.setPressed(z6);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            C2646e c2646e = this.f18189d;
            MaterialButton materialButton = c2646e.f21837a;
            if (c2646e.f21850o != colorStateList) {
                c2646e.f21850o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(E3.a.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(G.c.b(getContext(), i));
        }
    }

    @Override // G3.z
    public void setShapeAppearanceModel(o oVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C2646e c2646e = this.f18189d;
        c2646e.f21838b = oVar;
        c2646e.f21839c = null;
        c2646e.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (e()) {
            C2646e c2646e = this.f18189d;
            c2646e.f21852q = z6;
            c2646e.e();
        }
    }

    public void setSizeChange(I i) {
        if (this.f18184O != i) {
            this.f18184O = i;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(G g2) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        C2646e c2646e = this.f18189d;
        if (c2646e.f21840d == null && g2.d()) {
            c2646e.f21840d = d();
            if (c2646e.f21839c != null) {
                c2646e.d();
            }
        }
        c2646e.f21839c = g2;
        c2646e.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            C2646e c2646e = this.f18189d;
            if (c2646e.f21849n != colorStateList) {
                c2646e.f21849n = colorStateList;
                c2646e.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(G.c.b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            C2646e c2646e = this.f18189d;
            if (c2646e.f21846k != i) {
                c2646e.f21846k = i;
                c2646e.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C2646e c2646e = this.f18189d;
        if (c2646e.f21848m != colorStateList) {
            c2646e.f21848m = colorStateList;
            if (c2646e.a(false) != null) {
                c2646e.a(false).setTintList(c2646e.f21848m);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C2646e c2646e = this.f18189d;
        if (c2646e.f21847l != mode) {
            c2646e.f21847l = mode;
            if (c2646e.a(false) == null || c2646e.f21847l == null) {
                return;
            }
            c2646e.a(false).setTintMode(c2646e.f21847l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f18189d.f21856u = z6;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f18177G = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.f18185P != i) {
            this.f18185P = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f18173C);
    }
}
