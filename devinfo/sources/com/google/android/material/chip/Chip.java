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
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.ads.AdError;
import e4.v0;
import ed.o;
import ed.y;
import java.lang.ref.WeakReference;
import java.util.Locale;
import sc.a;
import sc.b;
import sc.c;
import sc.d;
import sc.e;
import zc.f;
import zc.g;
import zc.k;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class Chip extends AppCompatCheckBox implements d, y, g {

    /* renamed from: x, reason: collision with root package name */
    public static final Rect f20412x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f20413y = {R.attr.state_selected};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f20414z = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public e f20415e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f20416f;
    public RippleDrawable g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f20417h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f20418i;
    public f j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20419k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20420l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20421m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20422n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f20423o;

    /* renamed from: p, reason: collision with root package name */
    public int f20424p;

    /* renamed from: q, reason: collision with root package name */
    public int f20425q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f20426r;

    /* renamed from: s, reason: collision with root package name */
    public final c f20427s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f20428t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f20429u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f20430v;

    /* renamed from: w, reason: collision with root package name */
    public final a f20431w;

    public Chip(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(md.a.a(context, attributeSet, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.liuzh.deviceinfo.R.attr.chipStyle);
        this.f20429u = new Rect();
        this.f20430v = new RectF();
        this.f20431w = new a(0, this);
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
        e eVar = new e(context2, attributeSet);
        Context context3 = eVar.f33542o0;
        int[] iArr = ic.a.f25947f;
        TypedArray typedArrayG = m.g(context3, attributeSet, iArr, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        eVar.O0 = typedArrayG.hasValue(37);
        Context context4 = eVar.f33542o0;
        ColorStateList colorStateListJ = jm.a.j(context4, typedArrayG, 24);
        if (eVar.H != colorStateListJ) {
            eVar.H = colorStateListJ;
            eVar.onStateChange(eVar.getState());
        }
        ColorStateList colorStateListJ2 = jm.a.j(context4, typedArrayG, 11);
        if (eVar.I != colorStateListJ2) {
            eVar.I = colorStateListJ2;
            eVar.onStateChange(eVar.getState());
        }
        float dimension = typedArrayG.getDimension(19, 0.0f);
        if (eVar.J != dimension) {
            eVar.J = dimension;
            eVar.invalidateSelf();
            eVar.D();
        }
        if (typedArrayG.hasValue(12)) {
            eVar.J(typedArrayG.getDimension(12, 0.0f));
        }
        eVar.O(jm.a.j(context4, typedArrayG, 22));
        eVar.P(typedArrayG.getDimension(23, 0.0f));
        eVar.Z(jm.a.j(context4, typedArrayG, 36));
        String text = typedArrayG.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(eVar.O, text);
        k kVar = eVar.f33548u0;
        if (!zEquals) {
            eVar.O = text;
            kVar.f38232e = true;
            eVar.invalidateSelf();
            eVar.D();
        }
        bd.d dVar = (!typedArrayG.hasValue(0) || (resourceId = typedArrayG.getResourceId(0, 0)) == 0) ? null : new bd.d(context4, resourceId);
        dVar.f2135l = typedArrayG.getDimension(1, dVar.f2135l);
        kVar.c(dVar, context4);
        int i4 = typedArrayG.getInt(3, 0);
        if (i4 == 1) {
            eVar.L0 = TextUtils.TruncateAt.START;
        } else if (i4 == 2) {
            eVar.L0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i4 == 3) {
            eVar.L0 = TextUtils.TruncateAt.END;
        }
        eVar.N(typedArrayG.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            eVar.N(typedArrayG.getBoolean(15, false));
        }
        eVar.K(jm.a.m(context4, typedArrayG, 14));
        if (typedArrayG.hasValue(17)) {
            eVar.M(jm.a.j(context4, typedArrayG, 17));
        }
        eVar.L(typedArrayG.getDimension(16, -1.0f));
        eVar.W(typedArrayG.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            eVar.W(typedArrayG.getBoolean(26, false));
        }
        eVar.Q(jm.a.m(context4, typedArrayG, 25));
        eVar.V(jm.a.j(context4, typedArrayG, 30));
        eVar.S(typedArrayG.getDimension(28, 0.0f));
        eVar.F(typedArrayG.getBoolean(6, false));
        eVar.I(typedArrayG.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            eVar.I(typedArrayG.getBoolean(8, false));
        }
        eVar.G(jm.a.m(context4, typedArrayG, 7));
        if (typedArrayG.hasValue(9)) {
            eVar.H(jm.a.j(context4, typedArrayG, 9));
        }
        eVar.f33532e0 = jc.d.a(context4, typedArrayG, 39);
        eVar.f33533f0 = jc.d.a(context4, typedArrayG, 33);
        float dimension2 = typedArrayG.getDimension(21, 0.0f);
        if (eVar.f33534g0 != dimension2) {
            eVar.f33534g0 = dimension2;
            eVar.invalidateSelf();
            eVar.D();
        }
        eVar.Y(typedArrayG.getDimension(35, 0.0f));
        eVar.X(typedArrayG.getDimension(34, 0.0f));
        float dimension3 = typedArrayG.getDimension(41, 0.0f);
        if (eVar.f33537j0 != dimension3) {
            eVar.f33537j0 = dimension3;
            eVar.invalidateSelf();
            eVar.D();
        }
        float dimension4 = typedArrayG.getDimension(40, 0.0f);
        if (eVar.f33538k0 != dimension4) {
            eVar.f33538k0 = dimension4;
            eVar.invalidateSelf();
            eVar.D();
        }
        eVar.T(typedArrayG.getDimension(29, 0.0f));
        eVar.R(typedArrayG.getDimension(27, 0.0f));
        float dimension5 = typedArrayG.getDimension(13, 0.0f);
        if (eVar.f33541n0 != dimension5) {
            eVar.f33541n0 = dimension5;
            eVar.invalidateSelf();
            eVar.D();
        }
        eVar.N0 = typedArrayG.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayG.recycle();
        m.a(context2, attributeSet, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action);
        this.f20423o = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.f20425q = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, ii.a.A(context2)));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(eVar);
        eVar.n(getElevation());
        m.a(context2, attributeSet, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action);
        m.b(context2, attributeSet, iArr, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.liuzh.deviceinfo.R.attr.chipStyle, com.liuzh.deviceinfo.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.f20427s = new c(this, this);
        e();
        if (!zHasValue) {
            setOutlineProvider(new b(this));
        }
        setChecked(this.f20419k);
        setText(eVar.O);
        setEllipsize(eVar.L0);
        h();
        if (!this.f20415e.M0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.f20423o) {
            setMinHeight(this.f20425q);
        }
        this.f20424p = getLayoutDirection();
        super.setOnCheckedChangeListener(new dh.a(2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.f20430v;
        rectF.setEmpty();
        if (d() && this.f20417h != null) {
            e eVar = this.f20415e;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.c0()) {
                float f10 = eVar.f33541n0 + eVar.f33540m0 + eVar.Y + eVar.f33539l0 + eVar.f33538k0;
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
        int i4 = (int) closeIconTouchBounds.left;
        int i10 = (int) closeIconTouchBounds.top;
        int i11 = (int) closeIconTouchBounds.right;
        int i12 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f20429u;
        rect.set(i4, i10, i11, i12);
        return rect;
    }

    private bd.d getTextAppearance() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33548u0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f20421m != z3) {
            this.f20421m = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f20420l != z3) {
            this.f20420l = z3;
            refreshDrawableState();
        }
    }

    public final void c(int i4) {
        this.f20425q = i4;
        if (!this.f20423o) {
            InsetDrawable insetDrawable = this.f20416f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f20416f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i4 - ((int) this.f20415e.J));
        int iMax2 = Math.max(0, i4 - this.f20415e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.f20416f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f20416f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i10 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i11 = iMax > 0 ? iMax / 2 : 0;
        if (this.f20416f != null) {
            Rect rect = new Rect();
            this.f20416f.getPadding(rect);
            if (rect.top == i11 && rect.bottom == i11 && rect.left == i10 && rect.right == i10) {
                f();
                return;
            }
        }
        if (getMinHeight() != i4) {
            setMinHeight(i4);
        }
        if (getMinWidth() != i4) {
            setMinWidth(i4);
        }
        this.f20416f = new InsetDrawable((Drawable) this.f20415e, i10, i11, i10, i11);
        f();
    }

    public final boolean d() {
        e eVar = this.f20415e;
        if (eVar == null) {
            return false;
        }
        Object obj = eVar.V;
        if (obj == null) {
            obj = null;
        } else if (obj instanceof w3.a) {
            obj = null;
        }
        return obj != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f20428t ? super.dispatchHoverEvent(motionEvent) : this.f20427s.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
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
            boolean r0 = r9.f20428t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        L9:
            sc.c r0 = r9.f20427s
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
            int r1 = r0.f29739l
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
            int r0 = r0.f29739l
            if (r0 == r2) goto L8b
            return r3
        L8b:
            boolean r10 = super.dispatchKeyEvent(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f20415e;
        boolean zU = false;
        int i4 = 0;
        zU = false;
        if (eVar != null && e.C(eVar.V)) {
            e eVar2 = this.f20415e;
            ?? IsEnabled = isEnabled();
            int i10 = IsEnabled;
            if (this.f20422n) {
                i10 = IsEnabled + 1;
            }
            int i11 = i10;
            if (this.f20421m) {
                i11 = i10 + 1;
            }
            int i12 = i11;
            if (this.f20420l) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (isChecked()) {
                i13 = i12 + 1;
            }
            int[] iArr = new int[i13];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i4 = 1;
            }
            if (this.f20422n) {
                iArr[i4] = 16842908;
                i4++;
            }
            if (this.f20421m) {
                iArr[i4] = 16843623;
                i4++;
            }
            if (this.f20420l) {
                iArr[i4] = 16842919;
                i4++;
            }
            if (isChecked()) {
                iArr[i4] = 16842913;
            }
            zU = eVar2.U(iArr);
        }
        if (zU) {
            invalidate();
        }
    }

    public final void e() {
        e eVar;
        if (!d() || (eVar = this.f20415e) == null || !eVar.U || this.f20417h == null) {
            v0.o(this, null);
            this.f20428t = false;
        } else {
            v0.o(this, this.f20427s);
            this.f20428t = true;
        }
    }

    public final void f() {
        this.g = new RippleDrawable(cd.a.b(this.f20415e.N), getBackgroundDrawable(), null);
        this.f20415e.getClass();
        setBackground(this.g);
        g();
    }

    public final void g() {
        e eVar;
        if (TextUtils.isEmpty(getText()) || (eVar = this.f20415e) == null) {
            return;
        }
        int iZ = (int) (eVar.z() + eVar.f33541n0 + eVar.f33538k0);
        e eVar2 = this.f20415e;
        int iY = (int) (eVar2.y() + eVar2.f33534g0 + eVar2.f33537j0);
        if (this.f20416f != null) {
            Rect rect = new Rect();
            this.f20416f.getPadding(rect);
            iY += rect.left;
            iZ += rect.right;
        }
        setPaddingRelative(iY, getPaddingTop(), iZ, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f20426r)) {
            return this.f20426r;
        }
        e eVar = this.f20415e;
        if (eVar == null || !eVar.f33528a0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f20434h.f17302b) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f20416f;
        return insetDrawable == null ? this.f20415e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33530c0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33531d0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.I;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return Math.max(0.0f, eVar.A());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f20415e;
    }

    public float getChipEndPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33541n0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        e eVar = this.f20415e;
        if (eVar == null || (drawable = eVar.Q) == 0) {
            return null;
        }
        if (!(drawable instanceof w3.a)) {
            return drawable;
        }
        return null;
    }

    public float getChipIconSize() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.S;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.R;
        }
        return null;
    }

    public float getChipMinHeight() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.J;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33534g0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.M;
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
        e eVar = this.f20415e;
        if (eVar == null || (drawable = eVar.V) == 0) {
            return null;
        }
        if (!(drawable instanceof w3.a)) {
            return drawable;
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.Z;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33540m0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.Y;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33539l0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.X;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.L0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f20428t) {
            c cVar = this.f20427s;
            if (cVar.f29739l == 1 || cVar.f29738k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public jc.d getHideMotionSpec() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33533f0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33536i0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33535h0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.N;
        }
        return null;
    }

    public o getShapeAppearanceModel() {
        return this.f20415e.f23316b.f23298a;
    }

    public jc.d getShowMotionSpec() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33532e0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33538k0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e eVar = this.f20415e;
        if (eVar != null) {
            return eVar.f33537j0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        e eVar = this.f20415e;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        bd.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.f20431w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ii.a.E(this, this.f20415e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20413y);
        }
        e eVar = this.f20415e;
        if (eVar != null && eVar.f33528a0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f20414z);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        super.onFocusChanged(z3, i4, rect);
        if (this.f20428t) {
            c cVar = this.f20427s;
            int i10 = cVar.f29739l;
            if (i10 != Integer.MIN_VALUE) {
                cVar.j(i10);
            }
            if (z3) {
                cVar.q(i4, rect);
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
        int i4;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        e eVar = this.f20415e;
        accessibilityNodeInfo.setCheckable(eVar != null && eVar.f33528a0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f38209c) {
                i4 = 0;
                for (int i10 = 0; i10 < chipGroup.getChildCount(); i10++) {
                    View childAt = chipGroup.getChildAt(i10);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i10).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                i4 = -1;
            } else {
                i4 = -1;
            }
            Object tag = getTag(com.liuzh.deviceinfo.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) f4.e.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i4, 1, isChecked()).f23649a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i4) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE) : super.onResolvePointerIcon(motionEvent, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        if (this.f20424p != i4) {
            this.f20424p = i4;
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
            boolean r0 = r5.f20420l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L51
        L2c:
            boolean r0 = r5.f20420l
            if (r0 == 0) goto L45
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.f20417h
            if (r0 == 0) goto L3a
            r0.onClick(r5)
        L3a:
            boolean r0 = r5.f20428t
            if (r0 == 0) goto L43
            sc.c r0 = r5.f20427s
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
        this.f20426r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i4) {
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

    public void setCheckable(boolean z3) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.F(z3);
        }
    }

    public void setCheckableResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.F(eVar.f33542o0.getResources().getBoolean(i4));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        e eVar = this.f20415e;
        if (eVar == null) {
            this.f20419k = z3;
        } else if (eVar.f33528a0) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i4) {
        setCheckedIconVisible(i4);
    }

    public void setCheckedIconResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.G(jm.a.l(i4, eVar.f33542o0));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.H(wd.b.r(i4, eVar.f33542o0));
        }
    }

    public void setCheckedIconVisible(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.I(eVar.f33542o0.getResources().getBoolean(i4));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.I == colorStateList) {
            return;
        }
        eVar.I = colorStateList;
        eVar.onStateChange(eVar.getState());
    }

    public void setChipBackgroundColorResource(int i4) {
        ColorStateList colorStateListR;
        e eVar = this.f20415e;
        if (eVar == null || eVar.I == (colorStateListR = wd.b.r(i4, eVar.f33542o0))) {
            return;
        }
        eVar.I = colorStateListR;
        eVar.onStateChange(eVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.J(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.J(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    public void setChipDrawable(e eVar) {
        e eVar2 = this.f20415e;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.K0 = new WeakReference(null);
            }
            this.f20415e = eVar;
            eVar.M0 = false;
            eVar.K0 = new WeakReference(this);
            c(this.f20425q);
        }
    }

    public void setChipEndPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.f33541n0 == f10) {
            return;
        }
        eVar.f33541n0 = f10;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setChipEndPaddingResource(int i4) throws Resources.NotFoundException {
        e eVar = this.f20415e;
        if (eVar != null) {
            float dimension = eVar.f33542o0.getResources().getDimension(i4);
            if (eVar.f33541n0 != dimension) {
                eVar.f33541n0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i4) {
        setChipIconVisible(i4);
    }

    public void setChipIconResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.K(jm.a.l(i4, eVar.f33542o0));
        }
    }

    public void setChipIconSize(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.L(f10);
        }
    }

    public void setChipIconSizeResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.L(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.M(wd.b.r(i4, eVar.f33542o0));
        }
    }

    public void setChipIconVisible(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.N(eVar.f33542o0.getResources().getBoolean(i4));
        }
    }

    public void setChipMinHeight(float f10) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.J == f10) {
            return;
        }
        eVar.J = f10;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setChipMinHeightResource(int i4) throws Resources.NotFoundException {
        e eVar = this.f20415e;
        if (eVar != null) {
            float dimension = eVar.f33542o0.getResources().getDimension(i4);
            if (eVar.J != dimension) {
                eVar.J = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.f33534g0 == f10) {
            return;
        }
        eVar.f33534g0 = f10;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setChipStartPaddingResource(int i4) throws Resources.NotFoundException {
        e eVar = this.f20415e;
        if (eVar != null) {
            float dimension = eVar.f33542o0.getResources().getDimension(i4);
            if (eVar.f33534g0 != dimension) {
                eVar.f33534g0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.O(wd.b.r(i4, eVar.f33542o0));
        }
    }

    public void setChipStrokeWidth(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.P(f10);
        }
    }

    public void setChipStrokeWidthResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.P(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i4) {
        setText(getResources().getString(i4));
    }

    public void setCloseIcon(Drawable drawable) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.Q(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.Z == charSequence) {
            return;
        }
        String str = c4.b.f2744b;
        c4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? c4.b.f2747e : c4.b.f2746d;
        bVar.getClass();
        a4.d dVar = c4.f.f2754a;
        eVar.Z = bVar.c(charSequence);
        eVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i4) {
        setCloseIconVisible(i4);
    }

    public void setCloseIconEndPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.R(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.R(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.Q(jm.a.l(i4, eVar.f33542o0));
        }
        e();
    }

    public void setCloseIconSize(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.S(f10);
        }
    }

    public void setCloseIconSizeResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.S(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.T(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.T(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.V(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.V(wd.b.r(i4, eVar.f33542o0));
        }
    }

    public void setCloseIconVisible(int i4) {
        setCloseIconVisible(getResources().getBoolean(i4));
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i10, int i11, int i12) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i4, i10, i11, i12);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i4, int i10, int i11, int i12) {
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i4, i10, i11, i12);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.n(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f20415e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.L0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f20423o = z3;
        c(this.f20425q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i4) {
        if (i4 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i4);
        }
    }

    public void setHideMotionSpec(jc.d dVar) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.f33533f0 = dVar;
        }
    }

    public void setHideMotionSpecResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.f33533f0 = jc.d.b(i4, eVar.f33542o0);
        }
    }

    public void setIconEndPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.X(f10);
        }
    }

    public void setIconEndPaddingResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.X(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    public void setIconStartPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.Y(f10);
        }
    }

    public void setIconStartPaddingResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.Y(eVar.f33542o0.getResources().getDimension(i4));
        }
    }

    @Override // zc.g
    public void setInternalOnCheckedChangeListener(f fVar) {
        this.j = fVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i4) {
        if (this.f20415e == null) {
            return;
        }
        super.setLayoutDirection(i4);
    }

    @Override // android.widget.TextView
    public void setLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i4);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i4) {
        super.setMaxWidth(i4);
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.N0 = i4;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i4) {
        if (i4 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i4);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f20418i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f20417h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.Z(colorStateList);
        }
        this.f20415e.getClass();
        f();
    }

    public void setRippleColorResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.Z(wd.b.r(i4, eVar.f33542o0));
            this.f20415e.getClass();
            f();
        }
    }

    @Override // ed.y
    public void setShapeAppearanceModel(o oVar) {
        this.f20415e.setShapeAppearanceModel(oVar);
    }

    public void setShowMotionSpec(jc.d dVar) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.f33532e0 = dVar;
        }
    }

    public void setShowMotionSpecResource(int i4) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.f33532e0 = jc.d.b(i4, eVar.f33542o0);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e eVar = this.f20415e;
        if (eVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(eVar.M0 ? null : charSequence, bufferType);
        e eVar2 = this.f20415e;
        if (eVar2 == null || TextUtils.equals(eVar2.O, charSequence)) {
            return;
        }
        eVar2.O = charSequence;
        eVar2.f33548u0.f38232e = true;
        eVar2.invalidateSelf();
        eVar2.D();
    }

    public void setTextAppearance(bd.d dVar) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.f33548u0.c(dVar, eVar.f33542o0);
        }
        h();
    }

    public void setTextAppearanceResource(int i4) {
        setTextAppearance(getContext(), i4);
    }

    public void setTextEndPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.f33538k0 == f10) {
            return;
        }
        eVar.f33538k0 = f10;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setTextEndPaddingResource(int i4) throws Resources.NotFoundException {
        e eVar = this.f20415e;
        if (eVar != null) {
            float dimension = eVar.f33542o0.getResources().getDimension(i4);
            if (eVar.f33538k0 != dimension) {
                eVar.f33538k0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i4, float f10) {
        super.setTextSize(i4, f10);
        e eVar = this.f20415e;
        if (eVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i4, f10, getResources().getDisplayMetrics());
            k kVar = eVar.f33548u0;
            bd.d dVar = kVar.g;
            if (dVar != null) {
                dVar.f2135l = fApplyDimension;
                kVar.f38228a.setTextSize(fApplyDimension);
                eVar.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f10) {
        e eVar = this.f20415e;
        if (eVar == null || eVar.f33537j0 == f10) {
            return;
        }
        eVar.f33537j0 = f10;
        eVar.invalidateSelf();
        eVar.D();
    }

    public void setTextStartPaddingResource(int i4) throws Resources.NotFoundException {
        e eVar = this.f20415e;
        if (eVar != null) {
            float dimension = eVar.f33542o0.getResources().getDimension(i4);
            if (eVar.f33537j0 != dimension) {
                eVar.f33537j0 = dimension;
                eVar.invalidateSelf();
                eVar.D();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.W(z3);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z3) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.I(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        e eVar = this.f20415e;
        if (eVar != null) {
            eVar.N(z3);
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
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        e eVar = this.f20415e;
        if (eVar != null) {
            Context context2 = eVar.f33542o0;
            eVar.f33548u0.c(new bd.d(context2, i4), context2);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i4) {
        super.setTextAppearance(i4);
        e eVar = this.f20415e;
        if (eVar != null) {
            Context context = eVar.f33542o0;
            eVar.f33548u0.c(new bd.d(context, i4), context);
        }
        h();
    }
}
