package M3;

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
import com.apm.insight.R;
import com.google.android.material.textfield.TextInputLayout;
import e3.AbstractC2303a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2905A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f2906B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2909c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2910d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2911e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f2912f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2913g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f2914h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f2915j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f2916k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2917l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2918m;

    /* renamed from: n, reason: collision with root package name */
    public int f2919n;

    /* renamed from: o, reason: collision with root package name */
    public int f2920o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2921p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2922q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f2923r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2924s;

    /* renamed from: t, reason: collision with root package name */
    public int f2925t;

    /* renamed from: u, reason: collision with root package name */
    public int f2926u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2927v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f2928w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2929x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f2930y;

    /* renamed from: z, reason: collision with root package name */
    public int f2931z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2913g = context;
        this.f2914h = textInputLayout;
        this.f2918m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2907a = com.bumptech.glide.d.O(context, R.attr.motionDurationShort4, 217);
        this.f2908b = com.bumptech.glide.d.O(context, R.attr.motionDurationMedium4, 167);
        this.f2909c = com.bumptech.glide.d.O(context, R.attr.motionDurationShort4, 167);
        this.f2910d = com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC2303a.f19930d);
        LinearInterpolator linearInterpolator = AbstractC2303a.f19927a;
        this.f2911e = com.bumptech.glide.d.P(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f2912f = com.bumptech.glide.d.P(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i) {
        if (this.i == null && this.f2916k == null) {
            Context context = this.f2913g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f2914h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2916k = new FrameLayout(context);
            this.i.addView(this.f2916k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f2916k.setVisibility(0);
            this.f2916k.addView(appCompatTextView);
        } else {
            this.i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f2915j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f2914h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2913g;
                boolean zE = com.bumptech.glide.c.E(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (zE) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zE) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zE) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2917l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z6, AppCompatTextView appCompatTextView, int i, int i3, int i6) {
        if (appCompatTextView == null || !z6) {
            return;
        }
        if (i == i6 || i == i3) {
            boolean z7 = i6 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z7 ? 1.0f : 0.0f);
            int i7 = this.f2909c;
            objectAnimatorOfFloat.setDuration(z7 ? this.f2908b : i7);
            objectAnimatorOfFloat.setInterpolator(z7 ? this.f2911e : this.f2912f);
            if (i == i6 && i3 != 0) {
                objectAnimatorOfFloat.setStartDelay(i7);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i6 != i || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f2918m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f2907a);
            objectAnimatorOfFloat2.setInterpolator(this.f2910d);
            objectAnimatorOfFloat2.setStartDelay(i7);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f2923r;
        }
        if (i != 2) {
            return null;
        }
        return this.f2930y;
    }

    public final void f() {
        this.f2921p = null;
        c();
        if (this.f2919n == 1) {
            if (!this.f2929x || TextUtils.isEmpty(this.f2928w)) {
                this.f2920o = 0;
            } else {
                this.f2920o = 2;
            }
        }
        i(this.f2919n, this.f2920o, h(this.f2923r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f2916k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i3 = this.f2915j - 1;
        this.f2915j = i3;
        LinearLayout linearLayout2 = this.i;
        if (i3 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f2914h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f2920o == this.f2919n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i3, boolean z6) {
        TextView textViewE;
        TextView textViewE2;
        if (i == i3) {
            return;
        }
        if (z6) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2917l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f2929x, this.f2930y, 2, i, i3);
            d(arrayList, this.f2922q, this.f2923r, 1, i, i3);
            com.bumptech.glide.e.v(animatorSet, arrayList);
            animatorSet.addListener(new r(this, i3, e(i), i, e(i3)));
            animatorSet.start();
        } else if (i != i3) {
            if (i3 != 0 && (textViewE2 = e(i3)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f2919n = i3;
        }
        TextInputLayout textInputLayout = this.f2914h;
        textInputLayout.t();
        textInputLayout.w(z6, false);
        textInputLayout.z();
    }
}
