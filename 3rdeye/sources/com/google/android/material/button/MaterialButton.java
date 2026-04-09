package com.google.android.material.button;

import D0.a;
import E.u;
import L0.I;
import L0.S;
import android.R;
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
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import d4.j;
import d4.n;
import h4.C4415c;
import i4.C4456a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l4.C5282a;
import l4.C5290i;
import l4.m;
import r4.C5522a;
import z0.C5848a;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, m {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f22603s = {R.attr.state_checkable};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f22604t = {R.attr.state_checked};

    /* renamed from: e, reason: collision with root package name */
    public final Q3.a f22605e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet<a> f22606f;

    /* renamed from: g, reason: collision with root package name */
    public b f22607g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f22608h;
    public ColorStateList i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f22609j;

    /* renamed from: k, reason: collision with root package name */
    public String f22610k;

    /* renamed from: l, reason: collision with root package name */
    public int f22611l;

    /* renamed from: m, reason: collision with root package name */
    public int f22612m;

    /* renamed from: n, reason: collision with root package name */
    public int f22613n;

    /* renamed from: o, reason: collision with root package name */
    public int f22614o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22615p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f22616q;

    /* renamed from: r, reason: collision with root package name */
    public int f22617r;

    public interface a {
        void a();
    }

    public interface b {
    }

    public static class c extends U0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f22618d;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f22618d = parcel.readInt() == 1;
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f22618d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(C5522a.a(context, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.materialButtonStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Button), attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.materialButtonStyle);
        this.f22606f = new LinkedHashSet<>();
        this.f22615p = false;
        this.f22616q = false;
        Context context2 = getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, K3.a.f3124l, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.materialButtonStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f22614o = typedArrayD.getDimensionPixelSize(12, 0);
        int i = typedArrayD.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f22608h = n.b(i, mode);
        this.i = C4415c.a(getContext(), typedArrayD, 14);
        this.f22609j = C4415c.c(getContext(), typedArrayD, 10);
        this.f22617r = typedArrayD.getInteger(11, 1);
        this.f22611l = typedArrayD.getDimensionPixelSize(13, 0);
        Q3.a aVar = new Q3.a(this, C5290i.b(context2, attributeSet, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.attr.materialButtonStyle, com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R.style.Widget_MaterialComponents_Button).a());
        this.f22605e = aVar;
        aVar.f10932c = typedArrayD.getDimensionPixelOffset(1, 0);
        aVar.f10933d = typedArrayD.getDimensionPixelOffset(2, 0);
        aVar.f10934e = typedArrayD.getDimensionPixelOffset(3, 0);
        aVar.f10935f = typedArrayD.getDimensionPixelOffset(4, 0);
        if (typedArrayD.hasValue(8)) {
            int dimensionPixelSize = typedArrayD.getDimensionPixelSize(8, -1);
            aVar.f10936g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            C5290i.a aVarE = aVar.f10931b.e();
            aVarE.f43815e = new C5282a(f10);
            aVarE.f43816f = new C5282a(f10);
            aVarE.f43817g = new C5282a(f10);
            aVarE.f43818h = new C5282a(f10);
            aVar.c(aVarE.a());
            aVar.f10944p = true;
        }
        aVar.f10937h = typedArrayD.getDimensionPixelSize(20, 0);
        aVar.i = n.b(typedArrayD.getInt(7, -1), mode);
        aVar.f10938j = C4415c.a(getContext(), typedArrayD, 6);
        aVar.f10939k = C4415c.a(getContext(), typedArrayD, 19);
        aVar.f10940l = C4415c.a(getContext(), typedArrayD, 16);
        aVar.f10945q = typedArrayD.getBoolean(5, false);
        aVar.f10948t = typedArrayD.getDimensionPixelSize(9, 0);
        aVar.f10946r = typedArrayD.getBoolean(21, true);
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayD.hasValue(0)) {
            aVar.f10943o = true;
            setSupportBackgroundTintList(aVar.f10938j);
            setSupportBackgroundTintMode(aVar.i);
        } else {
            aVar.e();
        }
        setPaddingRelative(paddingStart + aVar.f10932c, paddingTop + aVar.f10934e, paddingEnd + aVar.f10933d, paddingBottom + aVar.f10935f);
        typedArrayD.recycle();
        setCompoundDrawablePadding(this.f22614o);
        c(this.f22609j != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
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

    public final boolean a() {
        Q3.a aVar = this.f22605e;
        return (aVar == null || aVar.f10943o) ? false : true;
    }

    public final void b() {
        int i = this.f22617r;
        boolean z10 = true;
        if (i != 1 && i != 2) {
            z10 = false;
        }
        if (z10) {
            setCompoundDrawablesRelative(this.f22609j, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f22609j, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f22609j, null, null);
        }
    }

    public final void c(boolean z10) {
        Drawable drawable = this.f22609j;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f22609j = drawableMutate;
            a.C0009a.h(drawableMutate, this.i);
            PorterDuff.Mode mode = this.f22608h;
            if (mode != null) {
                a.C0009a.i(this.f22609j, mode);
            }
            int intrinsicWidth = this.f22611l;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f22609j.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f22611l;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f22609j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f22609j;
            int i = this.f22612m;
            int i10 = this.f22613n;
            drawable2.setBounds(i, i10, intrinsicWidth + i, intrinsicHeight + i10);
            this.f22609j.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f22617r;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f22609j) || (((i11 == 3 || i11 == 4) && drawable5 != this.f22609j) || ((i11 == 16 || i11 == 32) && drawable4 != this.f22609j))) {
            b();
        }
    }

    public final void d(int i, int i10) {
        if (this.f22609j == null || getLayout() == null) {
            return;
        }
        int i11 = this.f22617r;
        if (!(i11 == 1 || i11 == 2) && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.f22612m = 0;
                if (i11 == 16) {
                    this.f22613n = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f22611l;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f22609j.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f22614o) - getPaddingBottom()) / 2);
                if (this.f22613n != iMax) {
                    this.f22613n = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f22613n = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f22617r;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f22612m = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f22611l;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f22609j.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f22614o) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f22617r == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f22612m != paddingEnd) {
            this.f22612m = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f22610k)) {
            return this.f22610k;
        }
        Q3.a aVar = this.f22605e;
        return ((aVar == null || !aVar.f10945q) ? Button.class : CompoundButton.class).getName();
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
        if (a()) {
            return this.f22605e.f10936g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f22609j;
    }

    public int getIconGravity() {
        return this.f22617r;
    }

    public int getIconPadding() {
        return this.f22614o;
    }

    public int getIconSize() {
        return this.f22611l;
    }

    public ColorStateList getIconTint() {
        return this.i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f22608h;
    }

    public int getInsetBottom() {
        return this.f22605e.f10935f;
    }

    public int getInsetTop() {
        return this.f22605e.f10934e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f22605e.f10940l;
        }
        return null;
    }

    public C5290i getShapeAppearanceModel() {
        if (a()) {
            return this.f22605e.f10931b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f22605e.f10939k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f22605e.f10937h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f22605e.f10938j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f22605e.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f22615p;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            u.N(this, this.f22605e.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        Q3.a aVar = this.f22605e;
        if (aVar != null && aVar.f10945q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22603s);
        }
        if (this.f22615p) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f22604t);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f22615p);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        Q3.a aVar = this.f22605e;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.f10945q);
        accessibilityNodeInfo.setChecked(this.f22615p);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f12348b);
        setChecked(cVar.f22618d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f22618d = this.f22615p;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f22605e.f10946r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f22609j != null) {
            if (this.f22609j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f22610k = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        Q3.a aVar = this.f22605e;
        if (aVar.b(false) != null) {
            aVar.b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        Q3.a aVar = this.f22605e;
        aVar.f10943o = true;
        ColorStateList colorStateList = aVar.f10938j;
        MaterialButton materialButton = aVar.f10930a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(aVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? A9.I.w(getContext(), i) : null);
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
        if (a()) {
            this.f22605e.f10945q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        Q3.a aVar = this.f22605e;
        if (aVar == null || !aVar.f10945q || !isEnabled() || this.f22615p == z10) {
            return;
        }
        this.f22615p = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z11 = this.f22615p;
            if (!materialButtonToggleGroup.f22625g) {
                materialButtonToggleGroup.b(getId(), z11);
            }
        }
        if (this.f22616q) {
            return;
        }
        this.f22616q = true;
        Iterator<a> it = this.f22606f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f22616q = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            Q3.a aVar = this.f22605e;
            if (aVar.f10944p && aVar.f10936g == i) {
                return;
            }
            aVar.f10936g = i;
            aVar.f10944p = true;
            float f10 = i;
            C5290i.a aVarE = aVar.f10931b.e();
            aVarE.f43815e = new C5282a(f10);
            aVarE.f43816f = new C5282a(f10);
            aVarE.f43817g = new C5282a(f10);
            aVarE.f43818h = new C5282a(f10);
            aVar.c(aVarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f22605e.b(false).j(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f22609j != drawable) {
            this.f22609j = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f22617r != i) {
            this.f22617r = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f22614o != i) {
            this.f22614o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? A9.I.w(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f22611l != i) {
            this.f22611l = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f22608h != mode) {
            this.f22608h = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C5848a.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        Q3.a aVar = this.f22605e;
        aVar.d(aVar.f10934e, i);
    }

    public void setInsetTop(int i) {
        Q3.a aVar = this.f22605e;
        aVar.d(i, aVar.f10935f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f22607g = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f22607g;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            Q3.a aVar = this.f22605e;
            if (aVar.f10940l != colorStateList) {
                aVar.f10940l = colorStateList;
                MaterialButton materialButton = aVar.f10930a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C4456a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(C5848a.getColorStateList(getContext(), i));
        }
    }

    @Override // l4.m
    public void setShapeAppearanceModel(C5290i c5290i) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f22605e.c(c5290i);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            Q3.a aVar = this.f22605e;
            aVar.f10942n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            Q3.a aVar = this.f22605e;
            if (aVar.f10939k != colorStateList) {
                aVar.f10939k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(C5848a.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            Q3.a aVar = this.f22605e;
            if (aVar.f10937h != i) {
                aVar.f10937h = i;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        Q3.a aVar = this.f22605e;
        if (aVar.f10938j != colorStateList) {
            aVar.f10938j = colorStateList;
            if (aVar.b(false) != null) {
                a.C0009a.h(aVar.b(false), aVar.f10938j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        Q3.a aVar = this.f22605e;
        if (aVar.i != mode) {
            aVar.i = mode;
            if (aVar.b(false) == null || aVar.i == null) {
                return;
            }
            a.C0009a.i(aVar.b(false), aVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f22605e.f10946r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f22615p);
    }
}
