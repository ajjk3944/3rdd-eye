package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.n0;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.List;

/* loaded from: classes2.dex */
public class w extends androidx.appcompat.widget.c {

    /* renamed from: e, reason: collision with root package name */
    public final n0 f11429e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f11430f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f11431g;

    /* renamed from: h, reason: collision with root package name */
    public final int f11432h;

    /* renamed from: i, reason: collision with root package name */
    public final float f11433i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f11434j;

    /* renamed from: k, reason: collision with root package name */
    public int f11435k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f11436l;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            w wVar = w.this;
            Object objU = i10 < 0 ? wVar.f11429e.u() : wVar.getAdapter().getItem(i10);
            w wVar2 = w.this;
            wVar2.setText(wVar2.convertSelectionToString(objU), false);
            AdapterView.OnItemClickListener onItemClickListener = w.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = w.this.f11429e.x();
                    i10 = w.this.f11429e.w();
                    j10 = w.this.f11429e.v();
                }
                onItemClickListener.onItemClick(w.this.f11429e.o(), view, i10, j10);
            }
            w.this.f11429e.dismiss();
        }
    }

    public class b extends ArrayAdapter {

        /* renamed from: a, reason: collision with root package name */
        public ColorStateList f11438a;

        /* renamed from: b, reason: collision with root package name */
        public ColorStateList f11439b;

        public b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        public final ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{u4.a.i(w.this.f11435k, w.this.f11436l.getColorForState(iArr2, 0)), u4.a.i(w.this.f11435k, w.this.f11436l.getColorForState(iArr, 0)), w.this.f11435k});
        }

        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(w.this.f11435k);
            if (this.f11439b == null) {
                return colorDrawable;
            }
            colorDrawable.setTintList(this.f11438a);
            return new RippleDrawable(this.f11439b, colorDrawable, null);
        }

        public final boolean c() {
            return w.this.f11435k != 0;
        }

        public final boolean d() {
            return w.this.f11436l != null;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{w.this.f11436l.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.f11439b = e();
            this.f11438a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setBackground(w.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public w(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f11429e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean g() {
        return i() || h();
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f11434j;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.T()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f11433i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f11435k;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f11436l;
    }

    public final boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f11430f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f11430f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i() {
        AccessibilityManager accessibilityManager = this.f11430f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public final int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f11429e.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.f11429e.g();
        if (drawableG != null) {
            drawableG.getPadding(this.f11431g);
            Rect rect = this.f11431g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    public final void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.s0();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.T() && super.getHint() == null && com.google.android.material.internal.k.d()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11429e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t10) {
        super.setAdapter(t10);
        this.f11429e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        n0 n0Var = this.f11429e;
        if (n0Var != null) {
            n0Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f11434j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).i0(this.f11434j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f11429e.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f11435k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.f11436l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(@ArrayRes int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f11429e.show();
        } else {
            super.showDropDown();
        }
    }

    public w(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f11432h, strArr));
    }

    public w(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(l5.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        this.f11431g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.a0.i(context2, attributeSet, j4.l.MaterialAutoCompleteTextView, i10, c.i.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i11 = j4.l.MaterialAutoCompleteTextView_android_inputType;
        if (typedArrayI.hasValue(i11) && typedArrayI.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f11432h = typedArrayI.getResourceId(j4.l.MaterialAutoCompleteTextView_simpleItemLayout, j4.h.mtrl_auto_complete_simple_item);
        this.f11433i = typedArrayI.getDimensionPixelOffset(j4.l.MaterialAutoCompleteTextView_android_popupElevation, j4.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int i12 = j4.l.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if (typedArrayI.hasValue(i12)) {
            this.f11434j = ColorStateList.valueOf(typedArrayI.getColor(i12, 0));
        }
        this.f11435k = typedArrayI.getColor(j4.l.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f11436l = d5.c.a(context2, typedArrayI, j4.l.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f11430f = (AccessibilityManager) context2.getSystemService("accessibility");
        n0 n0Var = new n0(context2);
        this.f11429e = n0Var;
        n0Var.I(true);
        n0Var.C(this);
        n0Var.H(2);
        n0Var.m(getAdapter());
        n0Var.K(new a());
        int i13 = j4.l.MaterialAutoCompleteTextView_simpleItems;
        if (typedArrayI.hasValue(i13)) {
            setSimpleItems(typedArrayI.getResourceId(i13, 0));
        }
        typedArrayI.recycle();
    }
}
