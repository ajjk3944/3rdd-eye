package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.StateListSizeChange;
import d1.i;
import d1.l;
import g5.h;
import g5.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public class MaterialButton extends AppCompatButton implements Checkable, k {
    public static final int[] F = {R.attr.state_checkable};
    public static final int[] G = {R.attr.state_checked};
    public static final int H = j4.k.Widget_MaterialComponents_Button;
    public static final int I = j4.b.materialSizeOverlay;
    public static final i J = new a("widthIncrease");
    public StateListSizeChange A;
    public int B;
    public float C;
    public float D;
    public d1.k E;

    /* renamed from: d, reason: collision with root package name */
    public final e f10054d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f10055e;

    /* renamed from: f, reason: collision with root package name */
    public b f10056f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f10057g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f10058h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f10059i;

    /* renamed from: j, reason: collision with root package name */
    public String f10060j;

    /* renamed from: k, reason: collision with root package name */
    public int f10061k;

    /* renamed from: l, reason: collision with root package name */
    public int f10062l;

    /* renamed from: m, reason: collision with root package name */
    public int f10063m;

    /* renamed from: n, reason: collision with root package name */
    public int f10064n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10065o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10066p;

    /* renamed from: q, reason: collision with root package name */
    public int f10067q;

    /* renamed from: r, reason: collision with root package name */
    public int f10068r;

    /* renamed from: s, reason: collision with root package name */
    public float f10069s;

    /* renamed from: t, reason: collision with root package name */
    public int f10070t;

    /* renamed from: u, reason: collision with root package name */
    public int f10071u;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout.LayoutParams f10072v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10073w;

    /* renamed from: x, reason: collision with root package name */
    public int f10074x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10075y;

    /* renamed from: z, reason: collision with root package name */
    public int f10076z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconGravity {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f10077c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void e(Parcel parcel) {
            this.f10077c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10077c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            e(parcel);
        }
    }

    public class a extends i {
        public a(String str) {
            super(str);
        }

        @Override // d1.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // d1.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.f10074x = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.f10074x != i10) {
            materialButton.f10074x = i10;
            materialButton.s();
            materialButton.invalidate();
        }
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
        MaterialShapeDrawable materialShapeDrawableG;
        if (this.f10073w && this.f10075y && (materialShapeDrawableG = this.f10054d.g()) != null) {
            return (int) (materialShapeDrawableG.B() * 0.11f);
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
        if (!g() || this.f10065o == z10) {
            return;
        }
        this.f10065o = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).w(this, this.f10065o);
        }
        if (this.f10066p) {
            return;
        }
        this.f10066p = true;
        Iterator it = this.f10055e.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
        this.f10066p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.C != f10) {
            this.C = f10;
            s();
            invalidate();
            if (getParent() instanceof d) {
                ((d) getParent()).k(this, (int) this.C);
            }
        }
    }

    public final l e() {
        return b5.k.h(getContext(), j4.b.motionSpringFastSpatial, j4.k.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    public final void f() {
        d1.k kVar = new d1.k(this, J);
        this.E = kVar;
        kVar.p(e());
    }

    public boolean g() {
        e eVar = this.f10054d;
        return eVar != null && eVar.r();
    }

    @NonNull
    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f10060j)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f10060j;
    }

    @Px
    public int getAllowedWidthDecrease() {
        return this.f10076z;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (m()) {
            return this.f10054d.b();
        }
        return 0;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public l getCornerSpringForce() {
        return this.f10054d.c();
    }

    public Drawable getIcon() {
        return this.f10059i;
    }

    public int getIconGravity() {
        return this.f10067q;
    }

    @Px
    public int getIconPadding() {
        return this.f10064n;
    }

    @Px
    public int getIconSize() {
        return this.f10061k;
    }

    public ColorStateList getIconTint() {
        return this.f10058h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10057g;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f10054d.d();
    }

    @Dimension
    public int getInsetTop() {
        return this.f10054d.e();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (m()) {
            return this.f10054d.i();
        }
        return null;
    }

    @NonNull
    public com.google.android.material.shape.a getShapeAppearanceModel() {
        if (m()) {
            return this.f10054d.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.material.shape.e getStateListShapeAppearanceModel() {
        if (m()) {
            return this.f10054d.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.f10054d.l();
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (m()) {
            return this.f10054d.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.f10054d.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.f10054d.o() : super.getSupportBackgroundTintMode();
    }

    public final boolean h() {
        int i10 = this.f10067q;
        return i10 == 3 || i10 == 4;
    }

    public final boolean i() {
        int i10 = this.f10067q;
        return i10 == 1 || i10 == 2;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10065o;
    }

    public final boolean j() {
        int i10 = this.f10067q;
        return i10 == 16 || i10 == 32;
    }

    public final boolean k() {
        return (getParent() instanceof d) && ((d) getParent()).getOrientation() == 0;
    }

    public final boolean l() {
        return getLayoutDirection() == 1;
    }

    public final boolean m() {
        e eVar = this.f10054d;
        return (eVar == null || eVar.q()) ? false : true;
    }

    public final void n(boolean z10) {
        if (this.A == null) {
            return;
        }
        if (this.E == null) {
            f();
        }
        if (this.f10075y) {
            this.E.l(Math.min(this.B, this.A.e(getDrawableState()).f10979a.a(getWidth())));
            if (z10) {
                this.E.q();
            }
        }
    }

    public void o() {
        LinearLayout.LayoutParams layoutParams = this.f10072v;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.f10072v = null;
            this.f10069s = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            h.f(this, this.f10054d.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, F);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        r(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f10068r != i15) {
            this.f10068r = i15;
            this.f10069s = -1.0f;
        }
        if (this.f10069s == -1.0f) {
            this.f10069s = getMeasuredWidth();
            if (this.f10072v == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.f10072v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f10072v);
                layoutParams.width = (int) this.f10069s;
                setLayoutParams(layoutParams);
            }
        }
        if (this.f10076z == -1) {
            if (this.f10059i == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f10061k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f10059i.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.f10076z = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f10070t == -1) {
            this.f10070t = getPaddingStart();
        }
        if (this.f10071u == -1) {
            this.f10071u = getPaddingEnd();
        }
        this.f10075y = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        setChecked(savedState.f10077c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10077c = this.f10065o;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.f10059i, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f10059i, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.f10059i, null, null);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f10054d.s()) {
            toggle();
        }
        return super.performClick();
    }

    public final void q(boolean z10) {
        Drawable drawable = this.f10059i;
        if (drawable != null) {
            Drawable drawableMutate = k0.a.r(drawable).mutate();
            this.f10059i = drawableMutate;
            drawableMutate.setTintList(this.f10058h);
            PorterDuff.Mode mode = this.f10057g;
            if (mode != null) {
                this.f10059i.setTintMode(mode);
            }
            int intrinsicWidth = this.f10061k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f10059i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f10061k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f10059i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10059i;
            int i10 = this.f10062l;
            int i11 = this.f10063m;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f10059i.setVisible(true, z10);
        }
        if (z10) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.f10059i) && ((!h() || drawable5 == this.f10059i) && (!j() || drawable4 == this.f10059i))) {
            return;
        }
        p();
    }

    public final void r(int i10, int i11) {
        if (this.f10059i == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.f10062l = 0;
                if (this.f10067q == 16) {
                    this.f10063m = 0;
                    q(false);
                    return;
                }
                int intrinsicHeight = this.f10061k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f10059i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f10064n) - getPaddingBottom()) / 2);
                if (this.f10063m != iMax) {
                    this.f10063m = iMax;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f10063m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f10067q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f10062l = 0;
            q(false);
            return;
        }
        int intrinsicWidth = this.f10061k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f10059i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f10064n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.f10067q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f10062l != textLayoutWidth) {
            this.f10062l = textLayoutWidth;
            q(false);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f10059i != null) {
            if (this.f10059i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s() {
        int i10 = (int) (this.C - this.D);
        int i11 = (i10 / 2) + this.f10074x;
        getLayoutParams().width = (int) (this.f10069s + i10);
        setPaddingRelative(this.f10070t + i11, getPaddingTop(), (this.f10071u + i10) - i11, getPaddingBottom());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setA11yClassName(@Nullable String str) {
        this.f10060j = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        if (m()) {
            this.f10054d.u(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f10054d.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        setBackgroundDrawable(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m()) {
            this.f10054d.w(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(@Px int i10) {
        if (m()) {
            this.f10054d.x(i10);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i10) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCornerSpringForce(@NonNull l lVar) {
        this.f10054d.z(lVar);
    }

    public void setDisplayedWidthDecrease(int i10) {
        this.D = Math.min(i10, this.f10076z);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m()) {
            this.f10054d.g().h0(f10);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f10059i != drawable) {
            this.f10059i = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f10067q != i10) {
            this.f10067q = i10;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i10) {
        if (this.f10064n != i10) {
            this.f10064n = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(@DrawableRes int i10) {
        setIcon(i10 != 0 ? d.a.b(getContext(), i10) : null);
    }

    public void setIconSize(@Px int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f10061k != i10) {
            this.f10061k = i10;
            q(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f10058h != colorStateList) {
            this.f10058h = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10057g != mode) {
            this.f10057g = mode;
            q(false);
        }
    }

    public void setIconTintResource(@ColorRes int i10) {
        setIconTint(d.a.a(getContext(), i10));
    }

    public void setInsetBottom(@Dimension int i10) {
        this.f10054d.A(i10);
    }

    public void setInsetTop(@Dimension int i10) {
        this.f10054d.B(i10);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable b bVar) {
        this.f10056f = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.f10073w != z10) {
            this.f10073w = z10;
            if (z10) {
                this.f10054d.y(new MaterialShapeDrawable.d() { // from class: com.google.android.material.button.a
                    @Override // com.google.android.material.shape.MaterialShapeDrawable.d
                    public final void a(float f10) {
                        MaterialButton.b(this.f10086a, f10);
                    }
                });
            } else {
                this.f10054d.y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(this.f10087a);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f10056f;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
        n(false);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (m()) {
            this.f10054d.C(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i10) {
        if (m()) {
            setRippleColor(d.a.a(getContext(), i10));
        }
    }

    @Override // g5.k
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.a aVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f10054d.D(aVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m()) {
            this.f10054d.E(z10);
        }
    }

    public void setSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.A != stateListSizeChange) {
            this.A = stateListSizeChange;
            n(true);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearanceModel(@NonNull com.google.android.material.shape.e eVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f10054d.c() == null && eVar.f()) {
            this.f10054d.z(e());
        }
        this.f10054d.F(eVar);
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (m()) {
            this.f10054d.G(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i10) {
        if (m()) {
            setStrokeColor(d.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(@Px int i10) {
        if (m()) {
            this.f10054d.H(i10);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i10) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (m()) {
            this.f10054d.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (m()) {
            this.f10054d.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f10054d.K(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(@Px int i10) {
        this.f10069s = -1.0f;
        super.setWidth(i10);
    }

    public void setWidthChangeMax(@Px int i10) {
        if (this.B != i10) {
            this.B = i10;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10065o);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        com.google.android.material.shape.a aVarM;
        int i11 = H;
        super(l5.a.e(context, attributeSet, i10, i11, new int[]{I}), attributeSet, i10);
        this.f10055e = new LinkedHashSet();
        this.f10065o = false;
        this.f10066p = false;
        this.f10068r = -1;
        this.f10069s = -1.0f;
        this.f10070t = -1;
        this.f10071u = -1;
        this.f10076z = -1;
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, j4.l.MaterialButton, i10, i11, new int[0]);
        this.f10064n = typedArrayI.getDimensionPixelSize(j4.l.MaterialButton_iconPadding, 0);
        this.f10057g = d0.m(typedArrayI.getInt(j4.l.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f10058h = d5.c.a(getContext(), typedArrayI, j4.l.MaterialButton_iconTint);
        this.f10059i = d5.c.d(getContext(), typedArrayI, j4.l.MaterialButton_icon);
        this.f10067q = typedArrayI.getInteger(j4.l.MaterialButton_iconGravity, 1);
        this.f10061k = typedArrayI.getDimensionPixelSize(j4.l.MaterialButton_iconSize, 0);
        com.google.android.material.shape.e eVarB = com.google.android.material.shape.e.b(context2, typedArrayI, j4.l.MaterialButton_shapeAppearance);
        if (eVarB != null) {
            aVarM = eVarB.c(true);
        } else {
            aVarM = com.google.android.material.shape.a.e(context2, attributeSet, i10, i11).m();
        }
        boolean z10 = typedArrayI.getBoolean(j4.l.MaterialButton_opticalCenterEnabled, false);
        e eVar = new e(this, aVarM);
        this.f10054d = eVar;
        eVar.t(typedArrayI);
        setCheckedInternal(typedArrayI.getBoolean(j4.l.MaterialButton_android_checked, false));
        if (eVarB != null) {
            eVar.z(e());
            eVar.F(eVarB);
        }
        setOpticalCenterEnabled(z10);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f10064n);
        q(this.f10059i != null);
    }
}
