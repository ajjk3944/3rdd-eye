package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class v {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f11397a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11399c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f11400d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f11401e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f11402f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f11403g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f11404h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f11405i;

    /* renamed from: j, reason: collision with root package name */
    public int f11406j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f11407k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f11408l;

    /* renamed from: m, reason: collision with root package name */
    public final float f11409m;

    /* renamed from: n, reason: collision with root package name */
    public int f11410n;

    /* renamed from: o, reason: collision with root package name */
    public int f11411o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f11412p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11413q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f11414r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f11415s;

    /* renamed from: t, reason: collision with root package name */
    public int f11416t;

    /* renamed from: u, reason: collision with root package name */
    public int f11417u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f11418v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f11419w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11420x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f11421y;

    /* renamed from: z, reason: collision with root package name */
    public int f11422z;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11423a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f11424b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11425c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f11426d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f11423a = i10;
            this.f11424b = textView;
            this.f11425c = i11;
            this.f11426d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v.this.f11410n = this.f11423a;
            v.this.f11408l = null;
            TextView textView = this.f11424b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f11425c == 1 && v.this.f11414r != null) {
                    v.this.f11414r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f11426d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f11426d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f11426d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f11426d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = v.this.f11404h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public v(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f11403g = context;
        this.f11404h = textInputLayout;
        this.f11409m = context.getResources().getDimensionPixelSize(j4.d.design_textinput_caption_translate_y);
        int i10 = j4.b.motionDurationShort4;
        this.f11397a = b5.k.f(context, i10, Sdk$SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f11398b = b5.k.f(context, j4.b.motionDurationMedium4, 167);
        this.f11399c = b5.k.f(context, i10, 167);
        int i11 = j4.b.motionEasingEmphasizedDecelerateInterpolator;
        this.f11400d = b5.k.g(context, i11, k4.a.f21837d);
        TimeInterpolator timeInterpolator = k4.a.f21834a;
        this.f11401e = b5.k.g(context, i11, timeInterpolator);
        this.f11402f = b5.k.g(context, j4.b.motionEasingLinearInterpolator, timeInterpolator);
    }

    public boolean A() {
        return this.f11413q;
    }

    public boolean B() {
        return this.f11420x;
    }

    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f11405i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f11407k) == null) {
            this.f11405i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f11406j - 1;
        this.f11406j = i11;
        O(this.f11405i, i11);
    }

    public final void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f11410n = i11;
    }

    public void E(int i10) {
        this.f11416t = i10;
        TextView textView = this.f11414r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    public void F(CharSequence charSequence) {
        this.f11415s = charSequence;
        TextView textView = this.f11414r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z10) {
        if (this.f11413q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f11403g);
            this.f11414r = appCompatTextView;
            appCompatTextView.setId(j4.f.textinput_error);
            this.f11414r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f11414r.setTypeface(typeface);
            }
            H(this.f11417u);
            I(this.f11418v);
            F(this.f11415s);
            E(this.f11416t);
            this.f11414r.setVisibility(4);
            e(this.f11414r, 0);
        } else {
            w();
            C(this.f11414r, 0);
            this.f11414r = null;
            this.f11404h.q0();
            this.f11404h.C0();
        }
        this.f11413q = z10;
    }

    public void H(int i10) {
        this.f11417u = i10;
        TextView textView = this.f11414r;
        if (textView != null) {
            this.f11404h.c0(textView, i10);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f11418v = colorStateList;
        TextView textView = this.f11414r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i10) {
        this.f11422z = i10;
        TextView textView = this.f11421y;
        if (textView != null) {
            TextViewCompat.m(textView, i10);
        }
    }

    public void K(boolean z10) {
        if (this.f11420x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f11403g);
            this.f11421y = appCompatTextView;
            appCompatTextView.setId(j4.f.textinput_helper_text);
            this.f11421y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f11421y.setTypeface(typeface);
            }
            this.f11421y.setVisibility(4);
            this.f11421y.setAccessibilityLiveRegion(1);
            J(this.f11422z);
            L(this.A);
            e(this.f11421y, 1);
            this.f11421y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f11421y, 1);
            this.f11421y = null;
            this.f11404h.q0();
            this.f11404h.C0();
        }
        this.f11420x = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f11421y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f11414r, typeface);
            M(this.f11421y, typeface);
        }
    }

    public final void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, CharSequence charSequence) {
        if (this.f11404h.isLaidOut() && this.f11404h.isEnabled()) {
            return (this.f11411o == this.f11410n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f11412p = charSequence;
        this.f11414r.setText(charSequence);
        int i10 = this.f11410n;
        if (i10 != 1) {
            this.f11411o = 1;
        }
        S(i10, this.f11411o, P(this.f11414r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f11419w = charSequence;
        this.f11421y.setText(charSequence);
        int i10 = this.f11410n;
        if (i10 != 2) {
            this.f11411o = 2;
        }
        S(i10, this.f11411o, P(this.f11421y, charSequence));
    }

    public final void S(int i10, int i11, boolean z10) {
        v vVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f11408l = animatorSet;
            ArrayList arrayList = new ArrayList();
            vVar = this;
            vVar.i(arrayList, this.f11420x, this.f11421y, 2, i10, i11);
            vVar.i(arrayList, vVar.f11413q, vVar.f11414r, 1, i10, i11);
            k4.b.a(animatorSet, arrayList);
            animatorSet.addListener(vVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            vVar = this;
            D(i10, i11);
        }
        vVar.f11404h.q0();
        vVar.f11404h.w0(z10);
        vVar.f11404h.C0();
    }

    public void e(TextView textView, int i10) {
        if (this.f11405i == null && this.f11407k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f11403g);
            this.f11405i = linearLayout;
            linearLayout.setOrientation(0);
            this.f11404h.addView(this.f11405i, -1, -2);
            this.f11407k = new FrameLayout(this.f11403g);
            this.f11405i.addView(this.f11407k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f11404h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f11407k.setVisibility(0);
            this.f11407k.addView(textView);
        } else {
            this.f11405i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f11405i.setVisibility(0);
        this.f11406j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f11404h.getEditText();
            boolean zH = d5.c.h(this.f11403g);
            LinearLayout linearLayout = this.f11405i;
            int i10 = j4.d.material_helper_text_font_1_3_padding_horizontal;
            linearLayout.setPaddingRelative(v(zH, i10, editText.getPaddingStart()), v(zH, j4.d.material_helper_text_font_1_3_padding_top, this.f11403g.getResources().getDimensionPixelSize(j4.d.material_helper_text_default_padding_top)), v(zH, i10, editText.getPaddingEnd()), 0);
        }
    }

    public final boolean g() {
        return (this.f11405i == null || this.f11404h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f11408l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f11399c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f11399c);
            list.add(objectAnimatorK);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f11398b : this.f11399c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f11401e : this.f11402f);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f11409m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f11397a);
        objectAnimatorOfFloat.setInterpolator(this.f11400d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return y(this.f11411o);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f11414r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f11421y;
    }

    public int n() {
        return this.f11416t;
    }

    public CharSequence o() {
        return this.f11415s;
    }

    public CharSequence p() {
        return this.f11412p;
    }

    public int q() {
        TextView textView = this.f11414r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f11414r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f11419w;
    }

    public View t() {
        return this.f11421y;
    }

    public int u() {
        TextView textView = this.f11421y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z10, int i10, int i11) {
        return z10 ? this.f11403g.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void w() {
        this.f11412p = null;
        h();
        if (this.f11410n == 1) {
            if (!this.f11420x || TextUtils.isEmpty(this.f11419w)) {
                this.f11411o = 0;
            } else {
                this.f11411o = 2;
            }
        }
        S(this.f11410n, this.f11411o, P(this.f11414r, ""));
    }

    public void x() {
        h();
        int i10 = this.f11410n;
        if (i10 == 2) {
            this.f11411o = 0;
        }
        S(i10, this.f11411o, P(this.f11421y, ""));
    }

    public final boolean y(int i10) {
        return (i10 != 1 || this.f11414r == null || TextUtils.isEmpty(this.f11412p)) ? false : true;
    }

    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
