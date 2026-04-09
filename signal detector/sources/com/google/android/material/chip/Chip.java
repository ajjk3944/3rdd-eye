package com.google.android.material.chip;

import D3.e;
import G3.B;
import G3.o;
import G3.z;
import O3.a;
import P.b;
import P.g;
import P.h;
import R.O;
import a4.p;
import a4.t;
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
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import d3.AbstractC2266a;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o.C2731p;
import p3.C2772a;
import p3.C2773b;
import p3.c;
import p3.d;
import x3.AbstractC2993B;
import x3.InterfaceC3000e;
import x3.y;

/* loaded from: classes.dex */
public class Chip extends C2731p implements c, z, Checkable {

    /* renamed from: K, reason: collision with root package name */
    public static final Rect f18237K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    public static final int[] f18238L = {R.attr.state_selected};
    public static final int[] M = {R.attr.state_checkable};

    /* renamed from: C, reason: collision with root package name */
    public int f18239C;

    /* renamed from: D, reason: collision with root package name */
    public int f18240D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f18241E;

    /* renamed from: F, reason: collision with root package name */
    public final C2773b f18242F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f18243G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f18244H;

    /* renamed from: I, reason: collision with root package name */
    public final RectF f18245I;

    /* renamed from: J, reason: collision with root package name */
    public final C2772a f18246J;

    /* renamed from: e, reason: collision with root package name */
    public d f18247e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f18248f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f18249g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f18250h;
    public CompoundButton.OnCheckedChangeListener i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18251j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f18252k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18253l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18254m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18255n;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(a.a(context, attributeSet, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.apm.insight.R.attr.chipStyle);
        this.f18244H = new Rect();
        this.f18245I = new RectF();
        this.f18246J = new C2772a(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
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
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        d dVar = new d(context2, attributeSet);
        Context context3 = dVar.f22820C0;
        int[] iArr = AbstractC2266a.f19754h;
        TypedArray typedArrayI = AbstractC2993B.i(context3, attributeSet, iArr, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        dVar.f22853c1 = typedArrayI.hasValue(37);
        Context context4 = dVar.f22820C0;
        ColorStateList colorStateListN = com.bumptech.glide.c.n(context4, typedArrayI, 24);
        if (dVar.f22839V != colorStateListN) {
            dVar.f22839V = colorStateListN;
            dVar.onStateChange(dVar.getState());
        }
        ColorStateList colorStateListN2 = com.bumptech.glide.c.n(context4, typedArrayI, 11);
        if (dVar.f22841W != colorStateListN2) {
            dVar.f22841W = colorStateListN2;
            dVar.onStateChange(dVar.getState());
        }
        float dimension = typedArrayI.getDimension(19, 0.0f);
        if (dVar.f22843X != dimension) {
            dVar.f22843X = dimension;
            dVar.invalidateSelf();
            dVar.H();
        }
        if (typedArrayI.hasValue(12)) {
            dVar.N(typedArrayI.getDimension(12, 0.0f));
        }
        dVar.S(com.bumptech.glide.c.n(context4, typedArrayI, 22));
        dVar.T(typedArrayI.getDimension(23, 0.0f));
        dVar.d0(com.bumptech.glide.c.n(context4, typedArrayI, 36));
        String text = typedArrayI.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(dVar.f22852c0, text);
        y yVar = dVar.f22826I0;
        if (!zEquals) {
            dVar.f22852c0 = text;
            yVar.f24180e = true;
            dVar.invalidateSelf();
            dVar.H();
        }
        e eVar = (!typedArrayI.hasValue(0) || (resourceId = typedArrayI.getResourceId(0, 0)) == 0) ? null : new e(context4, resourceId);
        eVar.f1277l = typedArrayI.getDimension(1, eVar.f1277l);
        yVar.c(eVar, context4);
        int i = typedArrayI.getInt(3, 0);
        if (i == 1) {
            dVar.f22848Z0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            dVar.f22848Z0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            dVar.f22848Z0 = TextUtils.TruncateAt.END;
        }
        dVar.R(typedArrayI.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            dVar.R(typedArrayI.getBoolean(15, false));
        }
        dVar.O(com.bumptech.glide.c.r(context4, typedArrayI, 14));
        if (typedArrayI.hasValue(17)) {
            dVar.Q(com.bumptech.glide.c.n(context4, typedArrayI, 17));
        }
        dVar.P(typedArrayI.getDimension(16, -1.0f));
        dVar.a0(typedArrayI.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            dVar.a0(typedArrayI.getBoolean(26, false));
        }
        dVar.U(com.bumptech.glide.c.r(context4, typedArrayI, 25));
        dVar.Z(com.bumptech.glide.c.n(context4, typedArrayI, 30));
        dVar.W(typedArrayI.getDimension(28, 0.0f));
        dVar.J(typedArrayI.getBoolean(6, false));
        dVar.M(typedArrayI.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            dVar.M(typedArrayI.getBoolean(8, false));
        }
        dVar.K(com.bumptech.glide.c.r(context4, typedArrayI, 7));
        if (typedArrayI.hasValue(9)) {
            dVar.L(com.bumptech.glide.c.n(context4, typedArrayI, 9));
        }
        dVar.f22869s0 = e3.e.a(context4, typedArrayI, 39);
        dVar.f22870t0 = e3.e.a(context4, typedArrayI, 33);
        float dimension2 = typedArrayI.getDimension(21, 0.0f);
        if (dVar.f22871u0 != dimension2) {
            dVar.f22871u0 = dimension2;
            dVar.invalidateSelf();
            dVar.H();
        }
        dVar.c0(typedArrayI.getDimension(35, 0.0f));
        dVar.b0(typedArrayI.getDimension(34, 0.0f));
        float dimension3 = typedArrayI.getDimension(41, 0.0f);
        if (dVar.f22873x0 != dimension3) {
            dVar.f22873x0 = dimension3;
            dVar.invalidateSelf();
            dVar.H();
        }
        float dimension4 = typedArrayI.getDimension(40, 0.0f);
        if (dVar.f22874y0 != dimension4) {
            dVar.f22874y0 = dimension4;
            dVar.invalidateSelf();
            dVar.H();
        }
        dVar.X(typedArrayI.getDimension(29, 0.0f));
        dVar.V(typedArrayI.getDimension(27, 0.0f));
        float dimension5 = typedArrayI.getDimension(13, 0.0f);
        if (dVar.f22819B0 != dimension5) {
            dVar.f22819B0 = dimension5;
            dVar.invalidateSelf();
            dVar.H();
        }
        dVar.f22851b1 = typedArrayI.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayI.recycle();
        AbstractC2993B.a(context2, attributeSet, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC2993B.b(context2, attributeSet, iArr, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action);
        this.f18255n = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f18240D = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, d5.y.p(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(dVar);
        dVar.p(getElevation());
        AbstractC2993B.a(context2, attributeSet, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC2993B.b(context2, attributeSet, iArr, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.apm.insight.R.attr.chipStyle, com.apm.insight.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f18242F = new C2773b(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new B(2, this));
        }
        setChecked(this.f18251j);
        setText(dVar.f22852c0);
        setEllipsize(dVar.f22848Z0);
        h();
        if (!this.f18247e.f22850a1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f18255n) {
            setMinHeight(this.f18240D);
        }
        this.f18239C = getLayoutDirection();
        super.setOnCheckedChangeListener(new N4.a(3, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f18245I;
        rectF.setEmpty();
        if (d() && this.f18250h != null) {
            d dVar = this.f18247e;
            Rect bounds = dVar.getBounds();
            rectF.setEmpty();
            if (dVar.g0()) {
                float f2 = dVar.f22819B0 + dVar.f22818A0 + dVar.f22863m0 + dVar.f22875z0 + dVar.f22874y0;
                if (dVar.getLayoutDirection() == 0) {
                    float f5 = bounds.right;
                    rectF.right = f5;
                    rectF.left = f5 - f2;
                } else {
                    float f6 = bounds.left;
                    rectF.left = f6;
                    rectF.right = f6 + f2;
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
        int i3 = (int) closeIconTouchBounds.top;
        int i6 = (int) closeIconTouchBounds.right;
        int i7 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f18244H;
        rect.set(i, i3, i6, i7);
        return rect;
    }

    private e getTextAppearance() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22826I0.f24182g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z6) {
        if (this.f18253l != z6) {
            this.f18253l = z6;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z6) {
        if (this.f18252k != z6) {
            this.f18252k = z6;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.f18240D = i;
        if (!this.f18255n) {
            InsetDrawable insetDrawable = this.f18248f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f18248f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.f18247e.f22843X));
        int iMax2 = Math.max(0, i - this.f18247e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f18248f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f18248f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i6 = iMax > 0 ? iMax / 2 : 0;
        if (this.f18248f != null) {
            Rect rect = new Rect();
            this.f18248f.getPadding(rect);
            if (rect.top == i6 && rect.bottom == i6 && rect.left == i3 && rect.right == i3) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f18248f = new InsetDrawable((Drawable) this.f18247e, i3, i6, i3, i6);
        f();
    }

    public final boolean d() {
        d dVar = this.f18247e;
        if (dVar == null) {
            return false;
        }
        Object obj = dVar.f22860j0;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof K.c) {
            obj = null;
        }
        return obj != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f18243G ? super.dispatchHoverEvent(motionEvent) : this.f18242F.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f18243G
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            p3.b r0 = r9.f18242F
            r0.getClass()
            int r1 = r10.getAction()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L84
            int r1 = r10.getKeyCode()
            r5 = 61
            r6 = 0
            if (r1 == r5) goto L6e
            r5 = 66
            if (r1 == r5) goto L57
            switch(r1) {
                case 19: goto L29;
                case 20: goto L29;
                case 21: goto L29;
                case 22: goto L29;
                case 23: goto L57;
                default: goto L28;
            }
        L28:
            goto L84
        L29:
            boolean r7 = r10.hasNoModifiers()
            if (r7 == 0) goto L84
            r7 = 19
            if (r1 == r7) goto L41
            r7 = 21
            if (r1 == r7) goto L3e
            r7 = 22
            if (r1 == r7) goto L43
            r5 = 130(0x82, float:1.82E-43)
            goto L43
        L3e:
            r5 = 17
            goto L43
        L41:
            r5 = 33
        L43:
            int r1 = r10.getRepeatCount()
            int r1 = r1 + r3
            r7 = r4
        L49:
            if (r4 >= r1) goto L55
            boolean r8 = r0.q(r5, r6)
            if (r8 == 0) goto L55
            int r4 = r4 + 1
            r7 = r3
            goto L49
        L55:
            r4 = r7
            goto L84
        L57:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L84
            int r1 = r10.getRepeatCount()
            if (r1 != 0) goto L84
            int r1 = r0.f4116l
            if (r1 == r2) goto L6c
            r4 = 16
            r0.s(r1, r4, r6)
        L6c:
            r4 = r3
            goto L84
        L6e:
            boolean r1 = r10.hasNoModifiers()
            if (r1 == 0) goto L7a
            r1 = 2
            boolean r4 = r0.q(r1, r6)
            goto L84
        L7a:
            boolean r1 = r10.hasModifiers(r3)
            if (r1 == 0) goto L84
            boolean r4 = r0.q(r3, r6)
        L84:
            if (r4 == 0) goto L8b
            int r0 = r0.f4116l
            if (r0 == r2) goto L8b
            return r3
        L8b:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // o.C2731p, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f18247e;
        boolean zY = false;
        int i = 0;
        zY = false;
        if (dVar != null && d.G(dVar.f22860j0)) {
            d dVar2 = this.f18247e;
            ?? IsEnabled = isEnabled();
            int i3 = IsEnabled;
            if (this.f18254m) {
                i3 = IsEnabled + 1;
            }
            int i6 = i3;
            if (this.f18253l) {
                i6 = i3 + 1;
            }
            int i7 = i6;
            if (this.f18252k) {
                i7 = i6 + 1;
            }
            int i8 = i7;
            if (isChecked()) {
                i8 = i7 + 1;
            }
            int[] iArr = new int[i8];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f18254m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f18253l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f18252k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            zY = dVar2.Y(iArr);
        }
        if (zY) {
            invalidate();
        }
    }

    public final void e() {
        d dVar;
        if (!d() || (dVar = this.f18247e) == null || !dVar.f22859i0 || this.f18250h == null) {
            O.m(this, null);
            this.f18243G = false;
        } else {
            O.m(this, this.f18242F);
            this.f18243G = true;
        }
    }

    public final void f() {
        this.f18249g = new RippleDrawable(E3.a.c(this.f18247e.b0), getBackgroundDrawable(), null);
        this.f18247e.getClass();
        setBackground(this.f18249g);
        g();
    }

    public final void g() {
        d dVar;
        if (TextUtils.isEmpty(getText()) || (dVar = this.f18247e) == null) {
            return;
        }
        int iD = (int) (dVar.D() + dVar.f22819B0 + dVar.f22874y0);
        d dVar2 = this.f18247e;
        int iC = (int) (dVar2.C() + dVar2.f22871u0 + dVar2.f22873x0);
        if (this.f18248f != null) {
            Rect rect = new Rect();
            this.f18248f.getPadding(rect);
            iC += rect.left;
            iD += rect.right;
        }
        setPaddingRelative(iC, getPaddingTop(), iD, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f18241E)) {
            return this.f18241E;
        }
        d dVar = this.f18247e;
        if (dVar == null || !dVar.f22865o0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f18248f;
        return insetDrawable == null ? this.f18247e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22867q0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22868r0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22841W;
        }
        return null;
    }

    public float getChipCornerRadius() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return Math.max(0.0f, dVar.E());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f18247e;
    }

    public float getChipEndPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22819B0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        d dVar = this.f18247e;
        if (dVar == null || (drawable = dVar.f22855e0) == 0) {
            return null;
        }
        if (!(drawable instanceof K.c)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22857g0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22856f0;
        }
        return null;
    }

    public float getChipMinHeight() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22843X;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22871u0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22847Z;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22849a0;
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
        d dVar = this.f18247e;
        if (dVar == null || (drawable = dVar.f22860j0) == 0) {
            return null;
        }
        if (!(drawable instanceof K.c)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22864n0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22818A0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22863m0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22875z0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22862l0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22848Z0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f18243G) {
            C2773b c2773b = this.f18242F;
            if (c2773b.f4116l == 1 || c2773b.f4115k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public e3.e getHideMotionSpec() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22870t0;
        }
        return null;
    }

    public float getIconEndPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22872w0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.v0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.b0;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.f18247e.f1597b.f1560a;
    }

    public e3.e getShowMotionSpec() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22869s0;
        }
        return null;
    }

    public float getTextEndPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22874y0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        d dVar = this.f18247e;
        if (dVar != null) {
            return dVar.f22873x0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        d dVar = this.f18247e;
        if (dVar != null) {
            paint.drawableState = dVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f18246J);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.r(this, this.f18247e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f18238L);
        }
        d dVar = this.f18247e;
        if (dVar != null && dVar.f22865o0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i, Rect rect) {
        super.onFocusChanged(z6, i, rect);
        if (this.f18243G) {
            C2773b c2773b = this.f18242F;
            int i3 = c2773b.f4116l;
            if (i3 != Integer.MIN_VALUE) {
                c2773b.j(i3);
            }
            if (z6) {
                c2773b.q(i, rect);
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
        d dVar = this.f18247e;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f22865o0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), BackupConstant.SCENE_BACKUP_RENDER_FAIL) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f18239C != i) {
            this.f18239C = i;
            g();
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
            boolean r0 = r5.f18252k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f18252k
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f18250h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f18243G
            if (r0 == 0) goto L43
            p3.b r0 = r5.f18242F
            r0.x(r2, r2)
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
        this.f18241E = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f18249g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.C2731p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f18249g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // o.C2731p, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z6) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.J(z6);
        }
    }

    public void setCheckableResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.J(dVar.f22820C0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z6) {
        d dVar = this.f18247e;
        if (dVar == null) {
            this.f18251j = z6;
        } else if (dVar.f22865o0) {
            super.setChecked(z6);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.K(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z6) {
        setCheckedIconVisible(z6);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.K(t.i(dVar.f22820C0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.L(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.L(G.c.b(dVar.f22820C0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.M(dVar.f22820C0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22841W == colorStateList) {
            return;
        }
        dVar.f22841W = colorStateList;
        dVar.onStateChange(dVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListB;
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22841W == (colorStateListB = G.c.b(dVar.f22820C0, i))) {
            return;
        }
        dVar.f22841W = colorStateListB;
        dVar.onStateChange(dVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.N(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.N(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(d dVar) {
        d dVar2 = this.f18247e;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                dVar2.f22846Y0 = new WeakReference(null);
            }
            this.f18247e = dVar;
            dVar.f22850a1 = false;
            dVar.f22846Y0 = new WeakReference(this);
            c(this.f18240D);
        }
    }

    public void setChipEndPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22819B0 == f2) {
            return;
        }
        dVar.f22819B0 = f2;
        dVar.invalidateSelf();
        dVar.H();
    }

    public void setChipEndPaddingResource(int i) throws Resources.NotFoundException {
        d dVar = this.f18247e;
        if (dVar != null) {
            float dimension = dVar.f22820C0.getResources().getDimension(i);
            if (dVar.f22819B0 != dimension) {
                dVar.f22819B0 = dimension;
                dVar.invalidateSelf();
                dVar.H();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.O(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z6) {
        setChipIconVisible(z6);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.O(t.i(dVar.f22820C0, i));
        }
    }

    public void setChipIconSize(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.P(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.P(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.Q(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.Q(G.c.b(dVar.f22820C0, i));
        }
    }

    public void setChipIconVisible(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.R(dVar.f22820C0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22843X == f2) {
            return;
        }
        dVar.f22843X = f2;
        dVar.invalidateSelf();
        dVar.H();
    }

    public void setChipMinHeightResource(int i) throws Resources.NotFoundException {
        d dVar = this.f18247e;
        if (dVar != null) {
            float dimension = dVar.f22820C0.getResources().getDimension(i);
            if (dVar.f22843X != dimension) {
                dVar.f22843X = dimension;
                dVar.invalidateSelf();
                dVar.H();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22871u0 == f2) {
            return;
        }
        dVar.f22871u0 = f2;
        dVar.invalidateSelf();
        dVar.H();
    }

    public void setChipStartPaddingResource(int i) throws Resources.NotFoundException {
        d dVar = this.f18247e;
        if (dVar != null) {
            float dimension = dVar.f22820C0.getResources().getDimension(i);
            if (dVar.f22871u0 != dimension) {
                dVar.f22871u0 = dimension;
                dVar.invalidateSelf();
                dVar.H();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.S(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.S(G.c.b(dVar.f22820C0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.T(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.T(dVar.f22820C0.getResources().getDimension(i));
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
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.U(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22864n0 == charSequence) {
            return;
        }
        String str = b.f3106b;
        b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? b.f3109e : b.f3108d;
        bVar.getClass();
        g gVar = h.f3119a;
        dVar.f22864n0 = bVar.c(charSequence);
        dVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z6) {
        setCloseIconVisible(z6);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.V(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.V(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.U(t.i(dVar.f22820C0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.W(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.W(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.X(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.X(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.Z(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.Z(G.c.b(dVar.f22820C0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // o.C2731p, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // o.C2731p, android.widget.TextView
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i3, i6, i7);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i3, int i6, int i7) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i6 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i3, i6, i7);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.p(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f18247e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22848Z0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z6) {
        this.f18255n = z6;
        c(this.f18240D);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(e3.e eVar) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22870t0 = eVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22870t0 = e3.e.b(dVar.f22820C0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.b0(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.b0(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.c0(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.c0(dVar.f22820C0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f18247e == null) {
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
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22851b1 = i;
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
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f18250h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.d0(colorStateList);
        }
        this.f18247e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.d0(G.c.b(dVar.f22820C0, i));
            this.f18247e.getClass();
            f();
        }
    }

    @Override // G3.z
    public void setShapeAppearanceModel(o oVar) {
        this.f18247e.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(e3.e eVar) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22869s0 = eVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22869s0 = e3.e.b(dVar.f22820C0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z6) {
        if (!z6) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z6);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        d dVar = this.f18247e;
        if (dVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(dVar.f22850a1 ? null : charSequence, bufferType);
        d dVar2 = this.f18247e;
        if (dVar2 == null || TextUtils.equals(dVar2.f22852c0, charSequence)) {
            return;
        }
        dVar2.f22852c0 = charSequence;
        dVar2.f22826I0.f24180e = true;
        dVar2.invalidateSelf();
        dVar2.H();
    }

    public void setTextAppearance(e eVar) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.f22826I0.c(eVar, dVar.f22820C0);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22874y0 == f2) {
            return;
        }
        dVar.f22874y0 = f2;
        dVar.invalidateSelf();
        dVar.H();
    }

    public void setTextEndPaddingResource(int i) throws Resources.NotFoundException {
        d dVar = this.f18247e;
        if (dVar != null) {
            float dimension = dVar.f22820C0.getResources().getDimension(i);
            if (dVar.f22874y0 != dimension) {
                dVar.f22874y0 = dimension;
                dVar.invalidateSelf();
                dVar.H();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        d dVar = this.f18247e;
        if (dVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            y yVar = dVar.f22826I0;
            e eVar = yVar.f24182g;
            if (eVar != null) {
                eVar.f1277l = fApplyDimension;
                yVar.f24176a.setTextSize(fApplyDimension);
                dVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f2) {
        d dVar = this.f18247e;
        if (dVar == null || dVar.f22873x0 == f2) {
            return;
        }
        dVar.f22873x0 = f2;
        dVar.invalidateSelf();
        dVar.H();
    }

    public void setTextStartPaddingResource(int i) throws Resources.NotFoundException {
        d dVar = this.f18247e;
        if (dVar != null) {
            float dimension = dVar.f22820C0.getResources().getDimension(i);
            if (dVar.f22873x0 != dimension) {
                dVar.f22873x0 = dimension;
                dVar.invalidateSelf();
                dVar.H();
            }
        }
    }

    public void setCloseIconVisible(boolean z6) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.a0(z6);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z6) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.M(z6);
        }
    }

    public void setChipIconVisible(boolean z6) {
        d dVar = this.f18247e;
        if (dVar != null) {
            dVar.R(z6);
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
        d dVar = this.f18247e;
        if (dVar != null) {
            Context context2 = dVar.f22820C0;
            dVar.f22826I0.c(new e(context2, i), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        d dVar = this.f18247e;
        if (dVar != null) {
            Context context = dVar.f22820C0;
            dVar.f22826I0.c(new e(context, i), context);
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(InterfaceC3000e interfaceC3000e) {
    }
}
