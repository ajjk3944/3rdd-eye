package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.e;
import androidx.core.view.ViewCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.l;
import d5.g;
import g5.k;
import j4.j;
import java.util.List;
import k4.h;
import s0.x;

/* loaded from: classes2.dex */
public class Chip extends e implements a.InterfaceC0205a, k, l {

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.material.chip.a f10219e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f10220f;

    /* renamed from: g, reason: collision with root package name */
    public RippleDrawable f10221g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnClickListener f10222h;

    /* renamed from: i, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f10223i;

    /* renamed from: j, reason: collision with root package name */
    public l.a f10224j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10225k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10226l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10227m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10228n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10229o;

    /* renamed from: p, reason: collision with root package name */
    public int f10230p;

    /* renamed from: q, reason: collision with root package name */
    public int f10231q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f10232r;

    /* renamed from: s, reason: collision with root package name */
    public final c f10233s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10234t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f10235u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f10236v;

    /* renamed from: w, reason: collision with root package name */
    public final g f10237w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f10216x = j4.k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: y, reason: collision with root package name */
    public static final Rect f10217y = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f10218z = {R.attr.state_selected};
    public static final int[] A = {R.attr.state_checkable};

    public class a extends g {
        public a() {
        }

        @Override // d5.g
        public void a(int i10) {
        }

        @Override // d5.g
        public void b(Typeface typeface, boolean z10) {
            Chip chip = Chip.this;
            chip.setText(chip.f10219e.f3() ? Chip.this.f10219e.z1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f10219e != null) {
                Chip.this.f10219e.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends y0.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // y0.a
        public int B(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // y0.a
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f10222h != null) {
                list.add(1);
            }
        }

        @Override // y0.a
        public boolean J(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // y0.a
        public void M(x xVar) {
            xVar.k0(Chip.this.r());
            xVar.n0(Chip.this.isClickable());
            xVar.m0(Chip.this.getAccessibilityClassName());
            xVar.N0(Chip.this.getText());
        }

        @Override // y0.a
        public void N(int i10, x xVar) {
            if (i10 != 1) {
                xVar.q0("");
                xVar.i0(Chip.f10217y);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                xVar.q0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                xVar.q0(Chip.this.getContext().getString(j.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            xVar.i0(Chip.this.getCloseIconTouchBoundsInt());
            xVar.b(x.a.f24200i);
            xVar.s0(Chip.this.isEnabled());
            xVar.m0(Button.class.getName());
        }

        @Override // y0.a
        public void O(int i10, boolean z10) {
            if (i10 == 1) {
                Chip.this.f10228n = z10;
            }
            if (Chip.this.f10219e.P1(Chip.this.f10228n)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
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

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z10) {
        l.a aVar = chip.f10224j;
        if (aVar != null) {
            aVar.a(chip, z10);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f10223i;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f10236v.setEmpty();
        if (n() && this.f10222h != null) {
            this.f10219e.q1(this.f10236v);
        }
        return this.f10236v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f10235u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f10235u;
    }

    @Nullable
    private d5.e getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.A1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f10227m != z10) {
            this.f10227m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f10226l != z10) {
            this.f10226l = z10;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f10219e) == null) {
            return;
        }
        int iB1 = (int) (aVar.b1() + this.f10219e.B1() + this.f10219e.I0());
        int iG1 = (int) (this.f10219e.g1() + this.f10219e.C1() + this.f10219e.E0());
        if (this.f10220f != null) {
            Rect rect = new Rect();
            this.f10220f.getPadding(rect);
            iG1 += rect.left;
            iB1 += rect.right;
        }
        setPaddingRelative(iG1, getPaddingTop(), iB1, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d5.e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.p(getContext(), paint, this.f10237w);
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0205a
    public void a() {
        m(this.f10231q);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f10234t ? super.dispatchHoverEvent(motionEvent) : this.f10233s.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f10234t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f10233s.w(keyEvent) || this.f10233s.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f10219e;
        if ((aVar == null || !aVar.H1()) ? false : this.f10219e.E2(l())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f10232r)) {
            return this.f10232r;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof s4.c) && ((s4.c) parent).i()) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10220f;
        return insetDrawable == null ? this.f10219e : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.a1());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10219e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.b1();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.i1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Nullable
    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.j1();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.l1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.m1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.n1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.p1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.t1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f10234t && (this.f10233s.A() == 1 || this.f10233s.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Nullable
    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.u1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.v1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.w1();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.x1();
        }
        return null;
    }

    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        return this.f10219e.K();
    }

    @Nullable
    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.y1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.B1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            return aVar.C1();
        }
        return 0.0f;
    }

    public final void k(com.google.android.material.chip.a aVar) {
        aVar.I2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] l() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f10228n) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f10227m) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f10226l) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f10228n) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f10227m) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f10226l) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    public boolean m(int i10) {
        this.f10231q = i10;
        if (!v()) {
            if (this.f10220f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f10219e.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f10219e.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f10220f != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f10220f != null) {
            Rect rect = new Rect();
            this.f10220f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f10219e;
        return (aVar == null || aVar.j1() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = a0.i(context, attributeSet, j4.l.Chip, i10, f10216x, new int[0]);
        this.f10229o = typedArrayI.getBoolean(j4.l.Chip_ensureMinTouchTargetSize, false);
        this.f10231q = (int) Math.ceil(typedArrayI.getDimension(j4.l.Chip_chipMinTouchTargetSize, d5.b.e(context)));
        typedArrayI.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5.h.f(this, this.f10219e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10218z);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f10234t) {
            this.f10233s.I(z10, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof s4.c) {
            s4.c cVar = (s4.c) getParent();
            x.R0(accessibilityNodeInfo).p0(x.f.a(cVar.b(this), 1, cVar.c() ? cVar.g(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f10230p != i10) {
            this.f10230p = i10;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f10226l
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f10226l
            if (r0 == 0) goto L35
            r5.t()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i10, int i11, int i12, int i13) {
        this.f10220f = new InsetDrawable((Drawable) this.f10219e, i10, i11, i12, i13);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f10219e;
        return aVar != null && aVar.G1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f10219e;
        return aVar != null && aVar.I1();
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.f10232r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10221g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10221g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Q1(z10);
        }
    }

    public void setCheckableResource(@BoolRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.R1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar == null) {
            this.f10225k = z10;
        } else if (aVar.G1()) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.S1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(@DrawableRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.T1(i10);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.U1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.V1(i10);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Y1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Z1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.a2(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f10219e;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f10219e = aVar;
            aVar.T2(false);
            k(this.f10219e);
            m(this.f10231q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.c2(f10);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.d2(i10);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.e2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(@DrawableRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.f2(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.g2(f10);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.h2(i10);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.i2(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setChipIconVisible(@BoolRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.k2(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.m2(f10);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.n2(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.o2(f10);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.p2(i10);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.q2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.r2(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.s2(f10);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.v2(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.w2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.x2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    public void setCloseIconResource(@DrawableRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.z2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.A2(f10);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.B2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.C2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.D2(i10);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.F2(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    public void setCloseIconVisible(@BoolRes int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.e, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.e, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
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
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.h0(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10219e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.J2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f10229o = z10;
        m(this.f10231q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(@Nullable h hVar) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.K2(hVar);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.L2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.M2(f10);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.N2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.O2(f10);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.P2(i10);
        }
    }

    @Override // com.google.android.material.internal.l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInternalOnCheckedChangeListener(@Nullable l.a aVar) {
        this.f10224j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f10219e == null) {
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
    public void setMaxWidth(@Px int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Q2(i10);
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
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10223i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10222h = onClickListener;
        x();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.R2(colorStateList);
        }
        if (this.f10219e.E1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(@ColorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.S2(i10);
            if (this.f10219e.E1()) {
                return;
            }
            z();
        }
    }

    @Override // g5.k
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        this.f10219e.setShapeAppearanceModel(aVar);
    }

    public void setShowMotionSpec(@Nullable h hVar) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.U2(hVar);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.V2(i10);
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
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.f3() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f10219e;
        if (aVar2 != null) {
            aVar2.W2(charSequence);
        }
    }

    public void setTextAppearance(@Nullable d5.e eVar) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.X2(eVar);
        }
        B();
    }

    public void setTextAppearanceResource(@StyleRes int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Z2(f10);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.a3(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.b3(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.c3(f10);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.d3(i10);
        }
    }

    public boolean t() {
        boolean z10 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f10222h;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z10 = true;
        }
        if (this.f10234t) {
            this.f10233s.U(1, 1);
        }
        return z10;
    }

    public final void u() {
        if (this.f10220f != null) {
            this.f10220f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.f10229o;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.I2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.f10222h != null) {
            ViewCompat.j0(this, this.f10233s);
            this.f10234t = true;
        } else {
            ViewCompat.j0(this, null);
            this.f10234t = false;
        }
    }

    public final void y() {
        z();
    }

    public final void z() {
        this.f10221g = new RippleDrawable(e5.a.d(this.f10219e.x1()), getBackgroundDrawable(), null);
        this.f10219e.e3(false);
        setBackground(this.f10221g);
        A();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.chipStyle);
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.H2(z10);
        }
        x();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10216x;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10235u = new Rect();
        this.f10236v = new RectF();
        this.f10237w = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarN0 = com.google.android.material.chip.a.N0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarN0);
        aVarN0.h0(getElevation());
        TypedArray typedArrayI = a0.i(context2, attributeSet, j4.l.Chip, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(j4.l.Chip_shapeAppearance);
        typedArrayI.recycle();
        this.f10233s = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f10225k);
        setText(aVarN0.z1());
        setEllipsize(aVarN0.t1());
        B();
        if (!this.f10219e.f3()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f10231q);
        }
        this.f10230p = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                Chip.b(this.f24286a, compoundButton, z10);
            }
        });
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.X1(z10);
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.l2(z10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
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
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Y2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f10219e;
        if (aVar != null) {
            aVar.Y2(i10);
        }
        B();
    }
}
