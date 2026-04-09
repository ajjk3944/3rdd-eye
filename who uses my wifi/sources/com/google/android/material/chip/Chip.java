package com.google.android.material.chip;

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
import defpackage.af;
import defpackage.al0;
import defpackage.bf;
import defpackage.e61;
import defpackage.gn0;
import defpackage.ic0;
import defpackage.nb;
import defpackage.ob1;
import defpackage.ou1;
import defpackage.pu1;
import defpackage.qb1;
import defpackage.rv0;
import defpackage.su0;
import defpackage.tp;
import defpackage.u01;
import defpackage.uk2;
import defpackage.um;
import defpackage.w01;
import defpackage.wa;
import defpackage.xa1;
import defpackage.xe;
import defpackage.ye;
import defpackage.ze;
import defpackage.ze0;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements af, rv0, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final xe A;
    public bf j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View.OnClickListener m;
    public CompoundButton.OnCheckedChangeListener n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public CharSequence v;
    public final ze w;
    public boolean x;
    public final Rect y;
    public final RectF z;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(um.z(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle);
        this.y = new Rect();
        this.z = new RectF();
        this.A = new xe(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
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
            attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
        }
        bf bfVar = new bf(context2, attributeSet);
        Context context3 = bfVar.t0;
        int[] iArr = gn0.g;
        TypedArray typedArrayS = uk2.s(context3, attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        bfVar.T0 = typedArrayS.hasValue(37);
        Context context4 = bfVar.t0;
        ColorStateList colorStateListE = ob1.e(context4, typedArrayS, 24);
        if (bfVar.M != colorStateListE) {
            bfVar.M = colorStateListE;
            bfVar.onStateChange(bfVar.getState());
        }
        ColorStateList colorStateListE2 = ob1.e(context4, typedArrayS, 11);
        if (bfVar.N != colorStateListE2) {
            bfVar.N = colorStateListE2;
            bfVar.onStateChange(bfVar.getState());
        }
        float dimension = typedArrayS.getDimension(19, 0.0f);
        if (bfVar.O != dimension) {
            bfVar.O = dimension;
            bfVar.invalidateSelf();
            bfVar.H();
        }
        if (typedArrayS.hasValue(12)) {
            bfVar.N(typedArrayS.getDimension(12, 0.0f));
        }
        bfVar.S(ob1.e(context4, typedArrayS, 22));
        bfVar.T(typedArrayS.getDimension(23, 0.0f));
        bfVar.d0(ob1.e(context4, typedArrayS, 36));
        String text = typedArrayS.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(bfVar.T, text)) {
            bfVar.T = text;
            bfVar.z0.c = true;
            bfVar.invalidateSelf();
            bfVar.H();
        }
        u01 u01Var = (!typedArrayS.hasValue(0) || (resourceId = typedArrayS.getResourceId(0, 0)) == 0) ? null : new u01(context4, resourceId);
        u01Var.l = typedArrayS.getDimension(1, u01Var.l);
        bfVar.e0(u01Var);
        int i = typedArrayS.getInt(3, 0);
        if (i == 1) {
            bfVar.Q0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            bfVar.Q0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            bfVar.Q0 = TextUtils.TruncateAt.END;
        }
        bfVar.R(typedArrayS.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            bfVar.R(typedArrayS.getBoolean(15, false));
        }
        bfVar.O(ob1.i(context4, typedArrayS, 14));
        if (typedArrayS.hasValue(17)) {
            bfVar.Q(ob1.e(context4, typedArrayS, 17));
        }
        bfVar.P(typedArrayS.getDimension(16, -1.0f));
        bfVar.a0(typedArrayS.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            bfVar.a0(typedArrayS.getBoolean(26, false));
        }
        bfVar.U(ob1.i(context4, typedArrayS, 25));
        bfVar.Z(ob1.e(context4, typedArrayS, 30));
        bfVar.W(typedArrayS.getDimension(28, 0.0f));
        bfVar.J(typedArrayS.getBoolean(6, false));
        bfVar.M(typedArrayS.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            bfVar.M(typedArrayS.getBoolean(8, false));
        }
        bfVar.K(ob1.i(context4, typedArrayS, 7));
        if (typedArrayS.hasValue(9)) {
            bfVar.L(ob1.e(context4, typedArrayS, 9));
        }
        bfVar.j0 = ze0.a(context4, typedArrayS, 39);
        bfVar.k0 = ze0.a(context4, typedArrayS, 33);
        float dimension2 = typedArrayS.getDimension(21, 0.0f);
        if (bfVar.l0 != dimension2) {
            bfVar.l0 = dimension2;
            bfVar.invalidateSelf();
            bfVar.H();
        }
        bfVar.c0(typedArrayS.getDimension(35, 0.0f));
        bfVar.b0(typedArrayS.getDimension(34, 0.0f));
        float dimension3 = typedArrayS.getDimension(41, 0.0f);
        if (bfVar.o0 != dimension3) {
            bfVar.o0 = dimension3;
            bfVar.invalidateSelf();
            bfVar.H();
        }
        float dimension4 = typedArrayS.getDimension(40, 0.0f);
        if (bfVar.p0 != dimension4) {
            bfVar.p0 = dimension4;
            bfVar.invalidateSelf();
            bfVar.H();
        }
        bfVar.X(typedArrayS.getDimension(29, 0.0f));
        bfVar.V(typedArrayS.getDimension(27, 0.0f));
        float dimension5 = typedArrayS.getDimension(13, 0.0f);
        if (bfVar.s0 != dimension5) {
            bfVar.s0 = dimension5;
            bfVar.invalidateSelf();
            bfVar.H();
        }
        bfVar.S0 = typedArrayS.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayS.recycle();
        uk2.h(context2, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action);
        uk2.i(context2, attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action);
        this.s = typedArrayObtainStyledAttributes.getBoolean(32, false);
        TypedValue typedValueN = qb1.n(context2, com.phuongpn.whousemywifi.networkscanner.R.attr.minTouchTargetSize);
        this.u = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (int) ((typedValueN == null || typedValueN.type != 5) ? context2.getResources().getDimension(com.phuongpn.whousemywifi.networkscanner.R.dimen.mtrl_min_touch_target_size) : typedValueN.getDimension(context2.getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(bfVar);
        bfVar.p(getElevation());
        uk2.h(context2, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action);
        uk2.i(context2, attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.chipStyle, com.phuongpn.whousemywifi.networkscanner.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.w = new ze(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new ye(this));
        }
        setChecked(this.o);
        setText(bfVar.T);
        setEllipsize(bfVar.Q0);
        g();
        if (!this.j.R0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.s) {
            setMinHeight(this.u);
        }
        this.t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: we
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.a.n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.z;
        rectF.setEmpty();
        if (c() && this.m != null) {
            bf bfVar = this.j;
            Rect bounds = bfVar.getBounds();
            rectF.setEmpty();
            if (bfVar.h0()) {
                float f = bfVar.s0 + bfVar.r0 + bfVar.d0 + bfVar.q0 + bfVar.p0;
                if (tp.a(bfVar) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
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
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.y;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private u01 getTextAppearance() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return (u01) bfVar.z0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.u = i;
        if (!this.s) {
            InsetDrawable insetDrawable = this.k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.j.O));
        int iMax2 = Math.max(0, i - this.j.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.k = new InsetDrawable((Drawable) this.j, i2, i3, i2, i3);
        e();
    }

    public final boolean c() {
        bf bfVar = this.j;
        if (bfVar == null) {
            return false;
        }
        Object obj = bfVar.a0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof xa1) {
            obj = null;
        }
        return obj != null;
    }

    public final void d() {
        bf bfVar;
        if (!c() || (bfVar = this.j) == null || !bfVar.Z || this.m == null) {
            e61.l(this, null);
            this.x = false;
        } else {
            e61.l(this, this.w);
            this.x = true;
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
            boolean r0 = r8.x
            if (r0 != 0) goto L9
            boolean r9 = super.dispatchHoverEvent(r9)
            return r9
        L9:
            ze r0 = r8.w
            android.view.accessibility.AccessibilityManager r1 = r0.h
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
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L6b
            if (r1 != r2) goto L39
            goto L71
        L39:
            r0.m = r2
            r0.q(r2, r6)
            r0.q(r1, r5)
            return r4
        L42:
            float r1 = r9.getX()
            float r9 = r9.getY()
            com.google.android.material.chip.Chip r2 = r0.n
            boolean r7 = r2.c()
            if (r7 == 0) goto L5d
            android.graphics.RectF r2 = r2.getCloseIconTouchBounds()
            boolean r9 = r2.contains(r1, r9)
            if (r9 == 0) goto L5d
            r3 = r4
        L5d:
            int r9 = r0.m
            if (r9 != r3) goto L62
            goto L71
        L62:
            r0.m = r3
            r0.q(r3, r6)
            r0.q(r9, r5)
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
            boolean r0 = r9.x
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            ze r0 = r9.w
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
            int r1 = r0.l
            if (r1 == r3) goto L85
            com.google.android.material.chip.Chip r5 = r0.n
            if (r1 != 0) goto L70
            r5.performClick()
            goto L85
        L70:
            if (r1 != r4) goto L85
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r1 = r5.m
            if (r1 == 0) goto L7c
            r1.onClick(r5)
        L7c:
            boolean r1 = r5.x
            if (r1 == 0) goto L85
            ze r1 = r5.w
            r1.q(r4, r4)
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
            int r0 = r0.l
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
        bf bfVar = this.j;
        boolean zY = false;
        int i = 0;
        zY = false;
        if (bfVar != null && bf.G(bfVar.a0)) {
            bf bfVar2 = this.j;
            ?? IsEnabled = isEnabled();
            int i2 = IsEnabled;
            if (this.r) {
                i2 = IsEnabled + 1;
            }
            int i3 = i2;
            if (this.q) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.p) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zY = bfVar2.Y(iArr);
        }
        if (zY) {
            invalidate();
        }
    }

    public final void e() {
        this.l = new RippleDrawable(pu1.m(this.j.S), getBackgroundDrawable(), null);
        this.j.getClass();
        setBackground(this.l);
        f();
    }

    public final void f() {
        bf bfVar;
        if (TextUtils.isEmpty(getText()) || (bfVar = this.j) == null) {
            return;
        }
        int iD = (int) (bfVar.D() + bfVar.s0 + bfVar.p0);
        bf bfVar2 = this.j;
        int iC = (int) (bfVar2.C() + bfVar2.l0 + bfVar2.o0);
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            iC += rect.left;
            iD += rect.right;
        }
        setPaddingRelative(iC, getPaddingTop(), iD, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        bf bfVar = this.j;
        if (bfVar != null) {
            paint.drawableState = bfVar.getState();
        }
        u01 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.v)) {
            return this.v;
        }
        bf bfVar = this.j;
        if (bfVar == null || !bfVar.f0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.k;
        return insetDrawable == null ? this.j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.h0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.i0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.N;
        }
        return null;
    }

    public float getChipCornerRadius() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return Math.max(0.0f, bfVar.E());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.s0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        bf bfVar = this.j;
        if (bfVar == null || (drawable = bfVar.V) == 0) {
            return null;
        }
        if (!(drawable instanceof xa1)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.X;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.W;
        }
        return null;
    }

    public float getChipMinHeight() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.O;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.l0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.Q;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.R;
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
        bf bfVar = this.j;
        if (bfVar == null || (drawable = bfVar.a0) == 0) {
            return null;
        }
        if (!(drawable instanceof xa1)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.e0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.r0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.d0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.q0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.c0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.x) {
            ze zeVar = this.w;
            if (zeVar.l == 1 || zeVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public ze0 getHideMotionSpec() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.k0;
        }
        return null;
    }

    public float getIconEndPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.n0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.m0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.S;
        }
        return null;
    }

    public su0 getShapeAppearanceModel() {
        return this.j.g.a;
    }

    public ze0 getShowMotionSpec() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.j0;
        }
        return null;
    }

    public float getTextEndPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.p0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        bf bfVar = this.j;
        if (bfVar != null) {
            return bfVar.o0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ou1.w(this, this.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        bf bfVar = this.j;
        if (bfVar != null && bfVar.f0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.x) {
            ze zeVar = this.w;
            int i2 = zeVar.l;
            if (i2 != Integer.MIN_VALUE) {
                zeVar.j(i2);
            }
            if (z) {
                zeVar.m(i, rect);
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
        bf bfVar = this.j;
        accessibilityNodeInfo.setCheckable(bfVar != null && bfVar.f0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.t != i) {
            this.t = i;
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
            boolean r0 = r5.p
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.p
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.m
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.x
            if (r0 == 0) goto L43
            ze r0 = r5.w
            r0.q(r2, r2)
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
        this.v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCheckable(boolean z) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.J(z);
        }
    }

    public void setCheckableResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.J(bfVar.t0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        bf bfVar = this.j;
        if (bfVar == null) {
            this.o = z;
        } else if (bfVar.f0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.K(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.K(ob1.h(bfVar.t0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.L(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.L(ob1.d(bfVar.t0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.M(bfVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.N == colorStateList) {
            return;
        }
        bfVar.N = colorStateList;
        bfVar.onStateChange(bfVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListD;
        bf bfVar = this.j;
        if (bfVar == null || bfVar.N == (colorStateListD = ob1.d(bfVar.t0, i))) {
            return;
        }
        bfVar.N = colorStateListD;
        bfVar.onStateChange(bfVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.N(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.N(bfVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(bf bfVar) {
        bf bfVar2 = this.j;
        if (bfVar2 != bfVar) {
            if (bfVar2 != null) {
                bfVar2.P0 = new WeakReference(null);
            }
            this.j = bfVar;
            bfVar.R0 = false;
            bfVar.P0 = new WeakReference(this);
            b(this.u);
        }
    }

    public void setChipEndPadding(float f) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.s0 == f) {
            return;
        }
        bfVar.s0 = f;
        bfVar.invalidateSelf();
        bfVar.H();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        bf bfVar = this.j;
        if (bfVar != null) {
            float dimension = bfVar.t0.getResources().getDimension(i);
            if (bfVar.s0 != dimension) {
                bfVar.s0 = dimension;
                bfVar.invalidateSelf();
                bfVar.H();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.O(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.O(ob1.h(bfVar.t0, i));
        }
    }

    public void setChipIconSize(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.P(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.P(bfVar.t0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.Q(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.Q(ob1.d(bfVar.t0, i));
        }
    }

    public void setChipIconVisible(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.R(bfVar.t0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.O == f) {
            return;
        }
        bfVar.O = f;
        bfVar.invalidateSelf();
        bfVar.H();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        bf bfVar = this.j;
        if (bfVar != null) {
            float dimension = bfVar.t0.getResources().getDimension(i);
            if (bfVar.O != dimension) {
                bfVar.O = dimension;
                bfVar.invalidateSelf();
                bfVar.H();
            }
        }
    }

    public void setChipStartPadding(float f) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.l0 == f) {
            return;
        }
        bfVar.l0 = f;
        bfVar.invalidateSelf();
        bfVar.H();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        bf bfVar = this.j;
        if (bfVar != null) {
            float dimension = bfVar.t0.getResources().getDimension(i);
            if (bfVar.l0 != dimension) {
                bfVar.l0 = dimension;
                bfVar.invalidateSelf();
                bfVar.H();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.S(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.S(ob1.d(bfVar.t0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.T(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.T(bfVar.t0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.U(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.e0 == charSequence) {
            return;
        }
        String str = wa.b;
        wa waVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? wa.e : wa.d;
        waVar.getClass();
        nb nbVar = w01.a;
        bfVar.e0 = waVar.c(charSequence);
        bfVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.V(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.V(bfVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.U(ob1.h(bfVar.t0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.W(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.W(bfVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.X(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.X(bfVar.t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.Z(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.Z(ob1.d(bfVar.t0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.p(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.Q0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.s = z;
        b(this.u);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            return;
        }
        super.setGravity(i);
    }

    public void setHideMotionSpec(ze0 ze0Var) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.k0 = ze0Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.k0 = ze0.b(bfVar.t0, i);
        }
    }

    public void setIconEndPadding(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.b0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.b0(bfVar.t0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.c0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.c0(bfVar.t0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.j == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.S0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.d0(colorStateList);
        }
        this.j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.d0(ob1.d(bfVar.t0, i));
            this.j.getClass();
            e();
        }
    }

    @Override // defpackage.rv0
    public void setShapeAppearanceModel(su0 su0Var) {
        this.j.setShapeAppearanceModel(su0Var);
    }

    public void setShowMotionSpec(ze0 ze0Var) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.j0 = ze0Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.j0 = ze0.b(bfVar.t0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        bf bfVar = this.j;
        if (bfVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bfVar.R0 ? null : charSequence, bufferType);
        bf bfVar2 = this.j;
        if (bfVar2 == null || TextUtils.equals(bfVar2.T, charSequence)) {
            return;
        }
        bfVar2.T = charSequence;
        bfVar2.z0.c = true;
        bfVar2.invalidateSelf();
        bfVar2.H();
    }

    public void setTextAppearance(u01 u01Var) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.e0(u01Var);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.p0 == f) {
            return;
        }
        bfVar.p0 = f;
        bfVar.invalidateSelf();
        bfVar.H();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        bf bfVar = this.j;
        if (bfVar != null) {
            float dimension = bfVar.t0.getResources().getDimension(i);
            if (bfVar.p0 != dimension) {
                bfVar.p0 = dimension;
                bfVar.invalidateSelf();
                bfVar.H();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        bf bfVar = this.j;
        if (bfVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            al0 al0Var = bfVar.z0;
            u01 u01Var = (u01) al0Var.g;
            if (u01Var != null) {
                u01Var.l = fApplyDimension;
                ((TextPaint) al0Var.d).setTextSize(fApplyDimension);
                bfVar.H();
                bfVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        bf bfVar = this.j;
        if (bfVar == null || bfVar.o0 == f) {
            return;
        }
        bfVar.o0 = f;
        bfVar.invalidateSelf();
        bfVar.H();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        bf bfVar = this.j;
        if (bfVar != null) {
            float dimension = bfVar.t0.getResources().getDimension(i);
            if (bfVar.o0 != dimension) {
                bfVar.o0 = dimension;
                bfVar.invalidateSelf();
                bfVar.H();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.a0(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.M(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.R(z);
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.e0(new u01(bfVar.t0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        bf bfVar = this.j;
        if (bfVar != null) {
            bfVar.e0(new u01(bfVar.t0, i));
        }
        g();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setInternalOnCheckedChangeListener(ic0 ic0Var) {
    }
}
