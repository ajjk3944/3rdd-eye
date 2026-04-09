package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.z0;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
public class a0 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f11313a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f11314b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f11315c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f11316d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f11317e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f11318f;

    /* renamed from: g, reason: collision with root package name */
    public int f11319g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f11320h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f11321i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11322j;

    public a0(TextInputLayout textInputLayout, z0 z0Var) {
        super(textInputLayout.getContext());
        this.f11313a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(j4.h.design_text_input_start_icon, (ViewGroup) this, false);
        this.f11316d = checkableImageButton;
        u.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f11314b = appCompatTextView;
        j(z0Var);
        i(z0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void A(s0.x xVar) {
        if (this.f11314b.getVisibility() != 0) {
            xVar.O0(this.f11316d);
        } else {
            xVar.z0(this.f11314b);
            xVar.O0(this.f11314b);
        }
    }

    public void B() {
        EditText editText = this.f11313a.f11259e;
        if (editText == null) {
            return;
        }
        this.f11314b.setPaddingRelative(k() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(j4.d.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i10 = (this.f11315c == null || this.f11322j) ? 8 : 0;
        setVisibility((this.f11316d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f11314b.setVisibility(i10);
        this.f11313a.p0();
    }

    public CharSequence a() {
        return this.f11315c;
    }

    public ColorStateList b() {
        return this.f11314b.getTextColors();
    }

    public int c() {
        return getPaddingStart() + this.f11314b.getPaddingStart() + (k() ? this.f11316d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f11316d.getLayoutParams()).getMarginEnd() : 0);
    }

    public TextView d() {
        return this.f11314b;
    }

    public CharSequence e() {
        return this.f11316d.getContentDescription();
    }

    public Drawable f() {
        return this.f11316d.getDrawable();
    }

    public int g() {
        return this.f11319g;
    }

    public ImageView.ScaleType h() {
        return this.f11320h;
    }

    public final void i(z0 z0Var) {
        this.f11314b.setVisibility(8);
        this.f11314b.setId(j4.f.textinput_prefix_text);
        this.f11314b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f11314b.setAccessibilityLiveRegion(1);
        o(z0Var.n(j4.l.TextInputLayout_prefixTextAppearance, 0));
        int i10 = j4.l.TextInputLayout_prefixTextColor;
        if (z0Var.s(i10)) {
            p(z0Var.c(i10));
        }
        n(z0Var.p(j4.l.TextInputLayout_prefixText));
    }

    public final void j(z0 z0Var) {
        if (d5.c.h(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f11316d.getLayoutParams()).setMarginEnd(0);
        }
        u(null);
        v(null);
        int i10 = j4.l.TextInputLayout_startIconTint;
        if (z0Var.s(i10)) {
            this.f11317e = d5.c.b(getContext(), z0Var, i10);
        }
        int i11 = j4.l.TextInputLayout_startIconTintMode;
        if (z0Var.s(i11)) {
            this.f11318f = com.google.android.material.internal.d0.m(z0Var.k(i11, -1), null);
        }
        int i12 = j4.l.TextInputLayout_startIconDrawable;
        if (z0Var.s(i12)) {
            s(z0Var.g(i12));
            int i13 = j4.l.TextInputLayout_startIconContentDescription;
            if (z0Var.s(i13)) {
                r(z0Var.p(i13));
            }
            q(z0Var.a(j4.l.TextInputLayout_startIconCheckable, true));
        }
        t(z0Var.f(j4.l.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(j4.d.mtrl_min_touch_target_size)));
        int i14 = j4.l.TextInputLayout_startIconScaleType;
        if (z0Var.s(i14)) {
            w(u.b(z0Var.k(i14, -1)));
        }
    }

    public boolean k() {
        return this.f11316d.getVisibility() == 0;
    }

    public void l(boolean z10) {
        this.f11322j = z10;
        C();
    }

    public void m() {
        u.d(this.f11313a, this.f11316d, this.f11317e);
    }

    public void n(CharSequence charSequence) {
        this.f11315c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f11314b.setText(charSequence);
        C();
    }

    public void o(int i10) {
        TextViewCompat.m(this.f11314b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    public void p(ColorStateList colorStateList) {
        this.f11314b.setTextColor(colorStateList);
    }

    public void q(boolean z10) {
        this.f11316d.setCheckable(z10);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f11316d.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.f11316d.setImageDrawable(drawable);
        if (drawable != null) {
            u.a(this.f11313a, this.f11316d, this.f11317e, this.f11318f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    public void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f11319g) {
            this.f11319g = i10;
            u.g(this.f11316d, i10);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        u.h(this.f11316d, onClickListener, this.f11321i);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.f11321i = onLongClickListener;
        u.i(this.f11316d, onLongClickListener);
    }

    public void w(ImageView.ScaleType scaleType) {
        this.f11320h = scaleType;
        u.j(this.f11316d, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f11317e != colorStateList) {
            this.f11317e = colorStateList;
            u.a(this.f11313a, this.f11316d, colorStateList, this.f11318f);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f11318f != mode) {
            this.f11318f = mode;
            u.a(this.f11313a, this.f11316d, this.f11317e, mode);
        }
    }

    public void z(boolean z10) {
        if (k() != z10) {
            this.f11316d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
