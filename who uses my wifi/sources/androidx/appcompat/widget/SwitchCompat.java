package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.ae;
import defpackage.e61;
import defpackage.g71;
import defpackage.g82;
import defpackage.gs;
import defpackage.hn0;
import defpackage.n11;
import defpackage.o6;
import defpackage.o7;
import defpackage.ob1;
import defpackage.ou1;
import defpackage.p51;
import defpackage.rr;
import defpackage.sp;
import defpackage.v3;
import defpackage.xb4;
import defpackage.yp;
import java.lang.reflect.InvocationTargetException;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final ae W = new ae(8, Float.class, "thumbPos");
    public static final int[] a0 = {R.attr.state_checked};
    public float A;
    public float B;
    public final VelocityTracker C;
    public final int D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final TextPaint N;
    public final ColorStateList O;
    public StaticLayout P;
    public StaticLayout Q;
    public final v3 R;
    public ObjectAnimator S;
    public o6 T;
    public gs U;
    public final Rect V;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public CharSequence t;
    public CharSequence u;
    public CharSequence v;
    public CharSequence w;
    public boolean x;
    public int y;
    public final int z;

    public SwitchCompat(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int resourceId;
        super(context, attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.switchStyle);
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.C = VelocityTracker.obtain();
        this.M = true;
        this.V = new Rect();
        n11.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.N = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = hn0.w;
        xb4 xb4VarR = xb4.r(context, attributeSet, iArr, com.phuongpn.whousemywifi.networkscanner.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) xb4VarR.h;
        e61.k(this, context, iArr, attributeSet, typedArray, com.phuongpn.whousemywifi.networkscanner.R.attr.switchStyle);
        Drawable drawableM = xb4VarR.m(2);
        this.f = drawableM;
        if (drawableM != null) {
            drawableM.setCallback(this);
        }
        Drawable drawableM2 = xb4VarR.m(11);
        this.k = drawableM2;
        if (drawableM2 != null) {
            drawableM2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.x = typedArray.getBoolean(3, true);
        this.p = typedArray.getDimensionPixelSize(8, 0);
        this.q = typedArray.getDimensionPixelSize(5, 0);
        this.r = typedArray.getDimensionPixelSize(6, 0);
        this.s = typedArray.getBoolean(4, false);
        ColorStateList colorStateListK = xb4VarR.k(9);
        if (colorStateListK != null) {
            this.g = colorStateListK;
            this.i = true;
        }
        PorterDuff.Mode modeC = yp.c(typedArray.getInt(10, -1), null);
        if (this.h != modeC) {
            this.h = modeC;
            this.j = true;
        }
        if (this.i || this.j) {
            a();
        }
        ColorStateList colorStateListK2 = xb4VarR.k(12);
        if (colorStateListK2 != null) {
            this.l = colorStateListK2;
            this.n = true;
        }
        PorterDuff.Mode modeC2 = yp.c(typedArray.getInt(13, -1), null);
        if (this.m != modeC2) {
            this.m = modeC2;
            this.o = true;
        }
        if (this.n || this.o) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, hn0.x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = ob1.d(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.O = colorStateList;
            } else {
                this.O = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i2 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i3 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((2 & i3) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                v3 v3Var = new v3();
                v3Var.f = context2.getResources().getConfiguration().locale;
                this.R = v3Var;
            } else {
                this.R = null;
            }
            setTextOnInternal(this.t);
            setTextOffInternal(this.v);
            typedArrayObtainStyledAttributes.recycle();
        }
        new o7(this).f(attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.switchStyle);
        xb4VarR.z();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.z = viewConfiguration.getScaledTouchSlop();
        this.D = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, com.phuongpn.whousemywifi.networkscanner.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private o6 getEmojiTextViewHelper() {
        if (this.T == null) {
            this.T = new o6(this);
        }
        return this.T;
    }

    private boolean getTargetCheckedState() {
        return this.E > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = g71.a;
        return (int) (((getLayoutDirection() == 1 ? 1.0f - this.E : this.E) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f;
        Rect rectB = drawable2 != null ? yp.b(drawable2) : yp.c;
        return ((((this.F - this.H) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.v = charSequence;
        TransformationMethod transformationMethodT = ((g82) getEmojiTextViewHelper().b.g).t(this.R);
        if (transformationMethodT != null) {
            charSequence = transformationMethodT.getTransformation(charSequence, this);
        }
        this.w = charSequence;
        this.Q = null;
        if (this.x) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.t = charSequence;
        TransformationMethod transformationMethodT = ((g82) getEmojiTextViewHelper().b.g).t(this.R);
        if (transformationMethodT != null) {
            charSequence = transformationMethodT.getTransformation(charSequence, this);
        }
        this.u = charSequence;
        this.P = null;
        if (this.x) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    sp.h(drawableMutate, this.g);
                }
                if (this.j) {
                    sp.i(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable drawableMutate = drawable.mutate();
                this.k = drawableMutate;
                if (this.n) {
                    sp.h(drawableMutate, this.l);
                }
                if (this.o) {
                    sp.i(this.k, this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.t);
        setTextOffInternal(this.v);
        requestLayout();
    }

    public final void d() {
        if (this.U == null && ((g82) this.T.b.g).k() && rr.k != null) {
            rr rrVarA = rr.a();
            int iB = rrVarA.b();
            if (iB == 3 || iB == 0) {
                gs gsVar = new gs(this);
                this.U = gsVar;
                rrVarA.f(gsVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.I;
        int i4 = this.J;
        int i5 = this.K;
        int i6 = this.L;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f;
        Rect rectB = drawable != null ? yp.b(drawable) : yp.c;
        Drawable drawable2 = this.k;
        Rect rect = this.V;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.k.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.H + rect.right;
            this.f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                sp.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f;
        if (drawable != null) {
            sp.e(drawable, f, f2);
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            sp.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.k;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = g71.a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.r : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = g71.a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.F;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.r : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ou1.B(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.x;
    }

    public boolean getSplitTrack() {
        return this.s;
    }

    public int getSwitchMinWidth() {
        return this.q;
    }

    public int getSwitchPadding() {
        return this.r;
    }

    public CharSequence getTextOff() {
        return this.v;
    }

    public CharSequence getTextOn() {
        return this.t;
    }

    public Drawable getThumbDrawable() {
        return this.f;
    }

    public final float getThumbPosition() {
        return this.E;
    }

    public int getThumbTextPadding() {
        return this.p;
    }

    public ColorStateList getThumbTintList() {
        return this.g;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.h;
    }

    public Drawable getTrackDrawable() {
        return this.k;
    }

    public ColorStateList getTrackTintList() {
        return this.l;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.m;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.S;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.S.end();
        this.S = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, a0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.k;
        Rect rect = this.V;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.J;
        int i2 = this.L;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f;
        if (drawable != null) {
            if (!this.s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = yp.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.P : this.Q;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.N;
            ColorStateList colorStateList = this.O;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.t : this.v;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f != null) {
            Drawable drawable = this.k;
            Rect rect = this.V;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = yp.b(this.f);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = g71.a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.F + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.F) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.G;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.G + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.G;
        }
        this.I = paddingLeft;
        this.J = paddingTop;
        this.L = height;
        this.K = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.x) {
            StaticLayout staticLayout = this.P;
            TextPaint textPaint = this.N;
            if (staticLayout == null) {
                CharSequence charSequence = this.u;
                this.P = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.Q == null) {
                CharSequence charSequence2 = this.w;
                this.Q = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f;
        Rect rect = this.V;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.H = Math.max(this.x ? (this.p * 2) + Math.max(this.P.getWidth(), this.Q.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f;
        if (drawable3 != null) {
            Rect rectB = yp.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.M ? Math.max(this.q, (this.H * 2) + iMax + iMax2) : this.q;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.F = iMax3;
        this.G = iMax4;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.t : this.v;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) throws Resources.NotFoundException {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.t;
                if (string == null) {
                    string = getResources().getString(com.phuongpn.whousemywifi.networkscanner.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = e61.a;
                new p51(com.phuongpn.whousemywifi.networkscanner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.v;
            if (string2 == null) {
                string2 = getResources().getString(com.phuongpn.whousemywifi.networkscanner.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = e61.a;
            new p51(com.phuongpn.whousemywifi.networkscanner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.S;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, W, zIsChecked ? 1.0f : 0.0f);
        this.S = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.S.setAutoCancel(true);
        this.S.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ou1.D(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.t);
        setTextOffInternal(this.v);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.M = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.x != z) {
            this.x = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.N;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.v;
        if (string == null) {
            string = getResources().getString(com.phuongpn.whousemywifi.networkscanner.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = e61.a;
        new p51(com.phuongpn.whousemywifi.networkscanner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.t;
        if (string == null) {
            string = getResources().getString(com.phuongpn.whousemywifi.networkscanner.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = e61.a;
        new p51(com.phuongpn.whousemywifi.networkscanner.R.id.tag_state_description, CharSequence.class, 64, 30, 2).f(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.E = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(ob1.h(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(ob1.h(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f || drawable == this.k;
    }
}
