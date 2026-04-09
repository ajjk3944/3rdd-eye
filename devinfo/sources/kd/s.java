package kd;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f28205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28206b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28207c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f28208d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f28209e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f28210f;
    public final Context g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f28211h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f28212i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f28213k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f28214l;

    /* renamed from: m, reason: collision with root package name */
    public final float f28215m;

    /* renamed from: n, reason: collision with root package name */
    public int f28216n;

    /* renamed from: o, reason: collision with root package name */
    public int f28217o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f28218p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28219q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f28220r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f28221s;

    /* renamed from: t, reason: collision with root package name */
    public int f28222t;

    /* renamed from: u, reason: collision with root package name */
    public int f28223u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f28224v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f28225w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f28226x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f28227y;

    /* renamed from: z, reason: collision with root package name */
    public int f28228z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.f28211h = textInputLayout;
        this.f28215m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f28205a = nh.a.v(context, R.attr.motionDurationShort4, 217);
        this.f28206b = nh.a.v(context, R.attr.motionDurationMedium4, 167);
        this.f28207c = nh.a.v(context, R.attr.motionDurationShort4, 167);
        this.f28208d = nh.a.w(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, jc.a.f27485d);
        LinearInterpolator linearInterpolator = jc.a.f27482a;
        this.f28209e = nh.a.w(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f28210f = nh.a.w(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i4) {
        if (this.f28212i == null && this.f28213k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f28212i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f28212i;
            TextInputLayout textInputLayout = this.f28211h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f28213k = new FrameLayout(context);
            this.f28212i.addView(this.f28213k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i4 == 0 || i4 == 1) {
            this.f28213k.setVisibility(0);
            this.f28213k.addView(appCompatTextView);
        } else {
            this.f28212i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f28212i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f28212i != null) {
            TextInputLayout textInputLayout = this.f28211h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean zQ = jm.a.q(context);
                LinearLayout linearLayout = this.f28212i;
                int paddingStart = editText.getPaddingStart();
                if (zQ) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zQ) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zQ) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f28214l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, AppCompatTextView appCompatTextView, int i4, int i10, int i11) {
        if (appCompatTextView == null || !z3) {
            return;
        }
        if (i4 == i11 || i4 == i10) {
            boolean z10 = i11 == i4;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i12 = this.f28207c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f28206b : i12);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.f28209e : this.f28210f);
            if (i4 == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i4 || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f28215m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f28205a);
            objectAnimatorOfFloat2.setInterpolator(this.f28208d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i4) {
        if (i4 == 1) {
            return this.f28220r;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f28227y;
    }

    public final void f() {
        this.f28218p = null;
        c();
        if (this.f28216n == 1) {
            if (!this.f28226x || TextUtils.isEmpty(this.f28225w)) {
                this.f28217o = 0;
            } else {
                this.f28217o = 2;
            }
        }
        i(this.f28216n, this.f28217o, h(this.f28220r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i4) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f28212i;
        if (linearLayout == null) {
            return;
        }
        if ((i4 == 0 || i4 == 1) && (frameLayout = this.f28213k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i10 = this.j - 1;
        this.j = i10;
        LinearLayout linearLayout2 = this.f28212i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f28211h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f28217o == this.f28216n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i4, int i10, boolean z3) {
        TextView textViewE;
        TextView textViewE2;
        if (i4 == i10) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f28214l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f28226x, this.f28227y, 2, i4, i10);
            d(arrayList, this.f28219q, this.f28220r, 1, i4, i10);
            wd.b.N(animatorSet, arrayList);
            animatorSet.addListener(new q(this, i10, e(i4), i4, e(i10)));
            animatorSet.start();
        } else if (i4 != i10) {
            if (i10 != 0 && (textViewE2 = e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i4 != 0 && (textViewE = e(i4)) != null) {
                textViewE.setVisibility(4);
                if (i4 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f28216n = i10;
        }
        TextInputLayout textInputLayout = this.f28211h;
        textInputLayout.t();
        textInputLayout.w(z3, false);
        textInputLayout.z();
    }
}
