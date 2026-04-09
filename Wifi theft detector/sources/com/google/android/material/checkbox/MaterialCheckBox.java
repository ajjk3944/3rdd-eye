package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.app.z;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.z0;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import j4.f;
import j4.j;
import j4.k;
import j4.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w4.d;

/* loaded from: classes2.dex */
public class MaterialCheckBox extends e {
    public static final int[] A;
    public static final int[][] B;
    public static final int C;

    /* renamed from: y, reason: collision with root package name */
    public static final int f10192y = k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f10193z = {j4.b.state_indeterminate};

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f10194e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f10195f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f10196g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10197h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10198i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10199j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f10200k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f10201l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f10202m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10203n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f10204o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f10205p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f10206q;

    /* renamed from: r, reason: collision with root package name */
    public int f10207r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f10208s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10209t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f10210u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f10211v;

    /* renamed from: w, reason: collision with root package name */
    public final z1.c f10212w;

    /* renamed from: x, reason: collision with root package name */
    public final z1.b f10213x;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface CheckedState {
    }

    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f10214a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public final String c() {
            int i10 = this.f10214a;
            return i10 != 1 ? i10 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + c() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f10214a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f10214a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class a extends z1.b {
        public a() {
        }

        @Override // z1.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f10204o;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // z1.b
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f10204o;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(materialCheckBox.f10208s, MaterialCheckBox.this.f10204o.getDefaultColor()));
            }
        }
    }

    static {
        int i10 = j4.b.state_error;
        A = new int[]{i10};
        B = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        C = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i10 = this.f10207r;
        return i10 == 1 ? getResources().getString(j.mtrl_checkbox_state_description_checked) : i10 == 0 ? getResources().getString(j.mtrl_checkbox_state_description_unchecked) : getResources().getString(j.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10196g == null) {
            int[][] iArr = B;
            int[] iArr2 = new int[iArr.length];
            int iD = u4.a.d(this, c.a.colorControlActivated);
            int iD2 = u4.a.d(this, c.a.colorError);
            int iD3 = u4.a.d(this, j4.b.colorSurface);
            int iD4 = u4.a.d(this, j4.b.colorOnSurface);
            iArr2[0] = u4.a.j(iD3, iD2, 1.0f);
            iArr2[1] = u4.a.j(iD3, iD, 1.0f);
            iArr2[2] = u4.a.j(iD3, iD4, 0.54f);
            iArr2[3] = u4.a.j(iD3, iD4, 0.38f);
            iArr2[4] = u4.a.j(iD3, iD4, 0.38f);
            this.f10196g = new ColorStateList(iArr, iArr2);
        }
        return this.f10196g;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f10204o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final boolean c(z0 z0Var) {
        return z0Var.n(l.MaterialCheckBox_android_button, 0) == C && z0Var.n(l.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    public boolean d() {
        return this.f10199j;
    }

    public final void e() {
        this.f10201l = d.c(this.f10201l, this.f10204o, androidx.core.widget.c.c(this));
        this.f10202m = d.c(this.f10202m, this.f10205p, this.f10206q);
        g();
        h();
        super.setButtonDrawable(d.a(this.f10201l, this.f10202m));
        refreshDrawableState();
    }

    public final void f() {
        if (Build.VERSION.SDK_INT < 30 || this.f10210u != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    public final void g() {
        z1.c cVar;
        if (this.f10203n) {
            z1.c cVar2 = this.f10212w;
            if (cVar2 != null) {
                cVar2.g(this.f10213x);
                this.f10212w.c(this.f10213x);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.f10201l;
                if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f10212w) == null) {
                    return;
                }
                int i10 = f.checked;
                int i11 = f.unchecked;
                ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
                ((AnimatedStateListDrawable) this.f10201l).addTransition(f.indeterminate, i11, this.f10212w, false);
            }
        }
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f10201l;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f10202m;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f10205p;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f10206q;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f10204o;
    }

    public int getCheckedState() {
        return this.f10207r;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f10200k;
    }

    public final void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f10201l;
        if (drawable != null && (colorStateList2 = this.f10204o) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.f10202m;
        if (drawable2 == null || (colorStateList = this.f10205p) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f10207r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10197h && this.f10204o == null && this.f10205p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10193z);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        this.f10208s = d.e(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f10198i || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (d0.l(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f10200k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f10214a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10214a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i10) {
        setButtonDrawable(d.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f10202m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i10) {
        setButtonIconDrawable(d.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f10205p == colorStateList) {
            return;
        }
        this.f10205p = colorStateList;
        e();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f10206q == mode) {
            return;
        }
        this.f10206q = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f10204o == colorStateList) {
            return;
        }
        this.f10204o = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f10198i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        AutofillManager autofillManagerA;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f10207r != i10) {
            this.f10207r = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            f();
            if (this.f10209t) {
                return;
            }
            this.f10209t = true;
            LinkedHashSet linkedHashSet = this.f10195f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    z.a(it.next());
                    throw null;
                }
            }
            if (this.f10207r != 2 && (onCheckedChangeListener = this.f10211v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerA = b.a(getContext().getSystemService(com.google.android.material.checkbox.a.a()))) != null) {
                autofillManagerA.notifyValueChanged(this);
            }
            this.f10209t = false;
        }
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f10200k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f10199j == z10) {
            return;
        }
        this.f10199j = z10;
        refreshDrawableState();
        Iterator it = this.f10194e.iterator();
        if (it.hasNext()) {
            z.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10211v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f10210u = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f10197h = z10;
        if (z10) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.e, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f10201l = drawable;
        this.f10203n = false;
        e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f10192y;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10194e = new LinkedHashSet();
        this.f10195f = new LinkedHashSet();
        this.f10212w = z1.c.a(getContext(), j4.e.mtrl_checkbox_button_checked_unchecked);
        this.f10213x = new a();
        Context context2 = getContext();
        this.f10201l = androidx.core.widget.c.a(this);
        this.f10204o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        z0 z0VarJ = a0.j(context2, attributeSet, l.MaterialCheckBox, i10, i11, new int[0]);
        this.f10202m = z0VarJ.g(l.MaterialCheckBox_buttonIcon);
        if (this.f10201l != null && a0.g(context2) && c(z0VarJ)) {
            super.setButtonDrawable((Drawable) null);
            this.f10201l = d.a.b(context2, j4.e.mtrl_checkbox_button);
            this.f10203n = true;
            if (this.f10202m == null) {
                this.f10202m = d.a.b(context2, j4.e.mtrl_checkbox_button_icon);
            }
        }
        this.f10205p = d5.c.b(context2, z0VarJ, l.MaterialCheckBox_buttonIconTint);
        this.f10206q = d0.m(z0VarJ.k(l.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f10197h = z0VarJ.a(l.MaterialCheckBox_useMaterialThemeColors, false);
        this.f10198i = z0VarJ.a(l.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f10199j = z0VarJ.a(l.MaterialCheckBox_errorShown, false);
        this.f10200k = z0VarJ.p(l.MaterialCheckBox_errorAccessibilityLabel);
        int i12 = l.MaterialCheckBox_checkedState;
        if (z0VarJ.s(i12)) {
            setCheckedState(z0VarJ.k(i12, 0));
        }
        z0VarJ.x();
        e();
    }
}
