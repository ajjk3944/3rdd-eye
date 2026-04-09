package com.google.android.material.textfield;

import F1.W;
import a4.AbstractC3764d;
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
import androidx.appcompat.widget.D;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class u {

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f37842A;

    /* renamed from: B, reason: collision with root package name */
    private Typeface f37843B;

    /* renamed from: a, reason: collision with root package name */
    private final int f37844a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37845b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37846c;

    /* renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f37847d;

    /* renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f37848e;

    /* renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f37849f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f37850g;

    /* renamed from: h, reason: collision with root package name */
    private final TextInputLayout f37851h;

    /* renamed from: i, reason: collision with root package name */
    private LinearLayout f37852i;

    /* renamed from: j, reason: collision with root package name */
    private int f37853j;

    /* renamed from: k, reason: collision with root package name */
    private FrameLayout f37854k;

    /* renamed from: l, reason: collision with root package name */
    private Animator f37855l;

    /* renamed from: m, reason: collision with root package name */
    private final float f37856m;

    /* renamed from: n, reason: collision with root package name */
    private int f37857n;

    /* renamed from: o, reason: collision with root package name */
    private int f37858o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f37859p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f37860q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f37861r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f37862s;

    /* renamed from: t, reason: collision with root package name */
    private int f37863t;

    /* renamed from: u, reason: collision with root package name */
    private int f37864u;

    /* renamed from: v, reason: collision with root package name */
    private ColorStateList f37865v;

    /* renamed from: w, reason: collision with root package name */
    private CharSequence f37866w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f37867x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f37868y;

    /* renamed from: z, reason: collision with root package name */
    private int f37869z;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f37870a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f37871b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f37872c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f37873d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f37870a = i10;
            this.f37871b = textView;
            this.f37872c = i11;
            this.f37873d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f37857n = this.f37870a;
            u.this.f37855l = null;
            TextView textView = this.f37871b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f37872c == 1 && u.this.f37861r != null) {
                    u.this.f37861r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f37873d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f37873d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f37873d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f37873d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f37851h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f37850g = context;
        this.f37851h = textInputLayout;
        this.f37856m = context.getResources().getDimensionPixelSize(O3.c.f17023e);
        int i10 = O3.a.f16948B;
        this.f37844a = AbstractC3764d.f(context, i10, 217);
        this.f37845b = AbstractC3764d.f(context, O3.a.f16986y, 167);
        this.f37846c = AbstractC3764d.f(context, i10, 167);
        int i11 = O3.a.f16949C;
        this.f37847d = AbstractC3764d.g(context, i11, P3.a.f18024d);
        TimeInterpolator timeInterpolator = P3.a.f18021a;
        this.f37848e = AbstractC3764d.g(context, i11, timeInterpolator);
        this.f37849f = AbstractC3764d.g(context, O3.a.f16951E, timeInterpolator);
    }

    private void D(int i10, int i11) {
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
        this.f37857n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return W.Q(this.f37851h) && this.f37851h.isEnabled() && !(this.f37858o == this.f37857n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f37855l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f37867x, this.f37868y, 2, i10, i11);
            i(arrayList, this.f37860q, this.f37861r, 1, i10, i11);
            P3.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            D(i10, i11);
        }
        this.f37851h.p0();
        this.f37851h.u0(z10);
        this.f37851h.A0();
    }

    private boolean g() {
        return (this.f37852i == null || this.f37851h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f37846c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f37846c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f37845b : this.f37846c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f37848e : this.f37849f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f37856m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f37844a);
        objectAnimatorOfFloat.setInterpolator(this.f37847d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f37861r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f37868y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f37850g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f37861r == null || TextUtils.isEmpty(this.f37859p)) ? false : true;
    }

    boolean A() {
        return this.f37860q;
    }

    boolean B() {
        return this.f37867x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f37852i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f37854k) == null) {
            this.f37852i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f37853j - 1;
        this.f37853j = i11;
        O(this.f37852i, i11);
    }

    void E(int i10) {
        this.f37863t = i10;
        TextView textView = this.f37861r;
        if (textView != null) {
            W.o0(textView, i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f37862s = charSequence;
        TextView textView = this.f37861r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f37860q == z10) {
            return;
        }
        h();
        if (z10) {
            D d10 = new D(this.f37850g);
            this.f37861r = d10;
            d10.setId(O3.e.f17065K);
            this.f37861r.setTextAlignment(5);
            Typeface typeface = this.f37843B;
            if (typeface != null) {
                this.f37861r.setTypeface(typeface);
            }
            H(this.f37864u);
            I(this.f37865v);
            F(this.f37862s);
            E(this.f37863t);
            this.f37861r.setVisibility(4);
            e(this.f37861r, 0);
        } else {
            w();
            C(this.f37861r, 0);
            this.f37861r = null;
            this.f37851h.p0();
            this.f37851h.A0();
        }
        this.f37860q = z10;
    }

    void H(int i10) {
        this.f37864u = i10;
        TextView textView = this.f37861r;
        if (textView != null) {
            this.f37851h.c0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f37865v = colorStateList;
        TextView textView = this.f37861r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f37869z = i10;
        TextView textView = this.f37868y;
        if (textView != null) {
            androidx.core.widget.h.o(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f37867x == z10) {
            return;
        }
        h();
        if (z10) {
            D d10 = new D(this.f37850g);
            this.f37868y = d10;
            d10.setId(O3.e.f17066L);
            this.f37868y.setTextAlignment(5);
            Typeface typeface = this.f37843B;
            if (typeface != null) {
                this.f37868y.setTypeface(typeface);
            }
            this.f37868y.setVisibility(4);
            W.o0(this.f37868y, 1);
            J(this.f37869z);
            L(this.f37842A);
            e(this.f37868y, 1);
            this.f37868y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f37868y, 1);
            this.f37868y = null;
            this.f37851h.p0();
            this.f37851h.A0();
        }
        this.f37867x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.f37842A = colorStateList;
        TextView textView = this.f37868y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.f37843B) {
            this.f37843B = typeface;
            M(this.f37861r, typeface);
            M(this.f37868y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f37859p = charSequence;
        this.f37861r.setText(charSequence);
        int i10 = this.f37857n;
        if (i10 != 1) {
            this.f37858o = 1;
        }
        S(i10, this.f37858o, P(this.f37861r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f37866w = charSequence;
        this.f37868y.setText(charSequence);
        int i10 = this.f37857n;
        if (i10 != 2) {
            this.f37858o = 2;
        }
        S(i10, this.f37858o, P(this.f37868y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f37852i == null && this.f37854k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f37850g);
            this.f37852i = linearLayout;
            linearLayout.setOrientation(0);
            this.f37851h.addView(this.f37852i, -1, -2);
            this.f37854k = new FrameLayout(this.f37850g);
            this.f37852i.addView(this.f37854k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f37851h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f37854k.setVisibility(0);
            this.f37854k.addView(textView);
        } else {
            this.f37852i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f37852i.setVisibility(0);
        this.f37853j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f37851h.getEditText();
            boolean zG = c4.c.g(this.f37850g);
            LinearLayout linearLayout = this.f37852i;
            int i10 = O3.c.f16994A;
            W.z0(linearLayout, v(zG, i10, W.E(editText)), v(zG, O3.c.f16995B, this.f37850g.getResources().getDimensionPixelSize(O3.c.f17044z)), v(zG, i10, W.D(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f37855l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f37858o);
    }

    int n() {
        return this.f37863t;
    }

    CharSequence o() {
        return this.f37862s;
    }

    CharSequence p() {
        return this.f37859p;
    }

    int q() {
        TextView textView = this.f37861r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f37861r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f37866w;
    }

    View t() {
        return this.f37868y;
    }

    int u() {
        TextView textView = this.f37868y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f37859p = null;
        h();
        if (this.f37857n == 1) {
            if (!this.f37867x || TextUtils.isEmpty(this.f37866w)) {
                this.f37858o = 0;
            } else {
                this.f37858o = 2;
            }
        }
        S(this.f37857n, this.f37858o, P(this.f37861r, ""));
    }

    void x() {
        h();
        int i10 = this.f37857n;
        if (i10 == 2) {
            this.f37858o = 0;
        }
        S(i10, this.f37858o, P(this.f37868y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
