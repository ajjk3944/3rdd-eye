package com.google.android.material.textfield;

import F1.AbstractC2777v;
import F1.W;
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
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.b0;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes3.dex */
class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f37892a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f37893b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f37894c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f37895d;

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f37896e;

    /* renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f37897f;

    /* renamed from: g, reason: collision with root package name */
    private int f37898g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f37899h;

    /* renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f37900i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f37901j;

    z(TextInputLayout textInputLayout, b0 b0Var) {
        super(textInputLayout.getContext());
        this.f37892a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(O3.g.f17100c, (ViewGroup) this, false);
        this.f37895d = checkableImageButton;
        t.e(checkableImageButton);
        D d10 = new D(getContext());
        this.f37893b = d10;
        j(b0Var);
        i(b0Var);
        addView(checkableImageButton);
        addView(d10);
    }

    private void C() {
        int i10 = (this.f37894c == null || this.f37901j) ? 8 : 0;
        setVisibility((this.f37895d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f37893b.setVisibility(i10);
        this.f37892a.o0();
    }

    private void i(b0 b0Var) {
        this.f37893b.setVisibility(8);
        this.f37893b.setId(O3.e.f17068N);
        this.f37893b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        W.o0(this.f37893b, 1);
        o(b0Var.n(O3.j.f17531v6, 0));
        int i10 = O3.j.f17539w6;
        if (b0Var.s(i10)) {
            p(b0Var.c(i10));
        }
        n(b0Var.p(O3.j.f17523u6));
    }

    private void j(b0 b0Var) {
        if (c4.c.g(getContext())) {
            AbstractC2777v.c((ViewGroup.MarginLayoutParams) this.f37895d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i10 = O3.j.f17177C6;
        if (b0Var.s(i10)) {
            this.f37896e = c4.c.b(getContext(), b0Var, i10);
        }
        int i11 = O3.j.f17185D6;
        if (b0Var.s(i11)) {
            this.f37897f = com.google.android.material.internal.n.i(b0Var.k(i11, -1), null);
        }
        int i12 = O3.j.f17563z6;
        if (b0Var.s(i12)) {
            s(b0Var.g(i12));
            int i13 = O3.j.f17555y6;
            if (b0Var.s(i13)) {
                r(b0Var.p(i13));
            }
            q(b0Var.a(O3.j.f17547x6, true));
        }
        t(b0Var.f(O3.j.f17161A6, getResources().getDimensionPixelSize(O3.c.f17012S)));
        int i14 = O3.j.f17169B6;
        if (b0Var.s(i14)) {
            w(t.b(b0Var.k(i14, -1)));
        }
    }

    void A(G1.t tVar) {
        if (this.f37893b.getVisibility() != 0) {
            tVar.O0(this.f37895d);
        } else {
            tVar.u0(this.f37893b);
            tVar.O0(this.f37893b);
        }
    }

    void B() {
        EditText editText = this.f37892a.f37715d;
        if (editText == null) {
            return;
        }
        W.z0(this.f37893b, k() ? 0 : W.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(O3.c.f16996C), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.f37894c;
    }

    ColorStateList b() {
        return this.f37893b.getTextColors();
    }

    int c() {
        return W.E(this) + W.E(this.f37893b) + (k() ? this.f37895d.getMeasuredWidth() + AbstractC2777v.a((ViewGroup.MarginLayoutParams) this.f37895d.getLayoutParams()) : 0);
    }

    TextView d() {
        return this.f37893b;
    }

    CharSequence e() {
        return this.f37895d.getContentDescription();
    }

    Drawable f() {
        return this.f37895d.getDrawable();
    }

    int g() {
        return this.f37898g;
    }

    ImageView.ScaleType h() {
        return this.f37899h;
    }

    boolean k() {
        return this.f37895d.getVisibility() == 0;
    }

    void l(boolean z10) {
        this.f37901j = z10;
        C();
    }

    void m() {
        t.d(this.f37892a, this.f37895d, this.f37896e);
    }

    void n(CharSequence charSequence) {
        this.f37894c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f37893b.setText(charSequence);
        C();
    }

    void o(int i10) {
        androidx.core.widget.h.o(this.f37893b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.f37893b.setTextColor(colorStateList);
    }

    void q(boolean z10) {
        this.f37895d.setCheckable(z10);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f37895d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.f37895d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f37892a, this.f37895d, this.f37896e, this.f37897f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f37898g) {
            this.f37898g = i10;
            t.g(this.f37895d, i10);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.f37895d, onClickListener, this.f37900i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.f37900i = onLongClickListener;
        t.i(this.f37895d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.f37899h = scaleType;
        t.j(this.f37895d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.f37896e != colorStateList) {
            this.f37896e = colorStateList;
            t.a(this.f37892a, this.f37895d, colorStateList, this.f37897f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f37897f != mode) {
            this.f37897f = mode;
            t.a(this.f37892a, this.f37895d, this.f37896e, mode);
        }
    }

    void z(boolean z10) {
        if (k() != z10) {
            this.f37895d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
