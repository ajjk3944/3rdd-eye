package p4;

import L0.I;
import L0.S;
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
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.textfield.TextInputLayout;
import f4.C4334b;
import h4.C4415c;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: IndicatorViewController.java */
/* renamed from: p4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5460j {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f45152A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f45153B;

    /* renamed from: a, reason: collision with root package name */
    public final int f45154a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45155b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45156c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f45157d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f45158e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f45159f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f45160g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f45161h;
    public LinearLayout i;

    /* renamed from: j, reason: collision with root package name */
    public int f45162j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f45163k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f45164l;

    /* renamed from: m, reason: collision with root package name */
    public final float f45165m;

    /* renamed from: n, reason: collision with root package name */
    public int f45166n;

    /* renamed from: o, reason: collision with root package name */
    public int f45167o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f45168p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f45169q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f45170r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f45171s;

    /* renamed from: t, reason: collision with root package name */
    public int f45172t;

    /* renamed from: u, reason: collision with root package name */
    public int f45173u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f45174v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f45175w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f45176x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f45177y;

    /* renamed from: z, reason: collision with root package name */
    public int f45178z;

    /* compiled from: IndicatorViewController.java */
    /* renamed from: p4.j$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f45179a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f45180b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45181c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f45182d;

        public a(int i, TextView textView, int i10, TextView textView2) {
            this.f45179a = i;
            this.f45180b = textView;
            this.f45181c = i10;
            this.f45182d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            int i = this.f45179a;
            C5460j c5460j = C5460j.this;
            c5460j.f45166n = i;
            c5460j.f45164l = null;
            TextView textView = this.f45180b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f45181c == 1 && (appCompatTextView = c5460j.f45170r) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f45182d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                textView2.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f45182d;
            if (textView != null) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
            }
        }
    }

    public C5460j(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f45160g = context;
        this.f45161h = textInputLayout;
        this.f45165m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f45154a = C4334b.c(context, R.attr.motionDurationShort4, 217);
        this.f45155b = C4334b.c(context, R.attr.motionDurationMedium4, 167);
        this.f45156c = C4334b.c(context, R.attr.motionDurationShort4, 167);
        this.f45157d = C4334b.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, L3.a.f4037d);
        LinearInterpolator linearInterpolator = L3.a.f4034a;
        this.f45158e = C4334b.d(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f45159f = C4334b.d(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i) {
        if (this.i == null && this.f45163k == null) {
            Context context = this.f45160g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f45161h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f45163k = new FrameLayout(context);
            this.i.addView(this.f45163k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f45163k.setVisibility(0);
            this.f45163k.addView(appCompatTextView);
        } else {
            this.i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f45162j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f45161h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f45160g;
                boolean zD = C4415c.d(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                int paddingStart = editText.getPaddingStart();
                if (zD) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zD) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zD) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f45164l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, AppCompatTextView appCompatTextView, int i, int i10, int i11) {
        if (appCompatTextView == null || !z10) {
            return;
        }
        if (i == i11 || i == i10) {
            boolean z11 = i11 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i12 = this.f45156c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f45155b : i12);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f45158e : this.f45159f);
            if (i == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f45165m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f45154a);
            objectAnimatorOfFloat2.setInterpolator(this.f45157d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f45170r;
        }
        if (i != 2) {
            return null;
        }
        return this.f45177y;
    }

    public final void f() {
        this.f45168p = null;
        c();
        if (this.f45166n == 1) {
            if (!this.f45176x || TextUtils.isEmpty(this.f45175w)) {
                this.f45167o = 0;
            } else {
                this.f45167o = 2;
            }
        }
        i(this.f45166n, this.f45167o, h(this.f45170r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f45163k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i10 = this.f45162j - 1;
        this.f45162j = i10;
        LinearLayout linearLayout2 = this.i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        TextInputLayout textInputLayout = this.f45161h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f45167o == this.f45166n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i10, boolean z10) {
        TextView textViewE;
        TextView textViewE2;
        if (i == i10) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f45164l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f45176x, this.f45177y, 2, i, i10);
            d(arrayList, this.f45169q, this.f45170r, 1, i, i10);
            A2.l.C(animatorSet, arrayList);
            animatorSet.addListener(new a(i10, e(i), i, e(i10)));
            animatorSet.start();
        } else if (i != i10) {
            if (i10 != 0 && (textViewE2 = e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f45166n = i10;
        }
        TextInputLayout textInputLayout = this.f45161h;
        textInputLayout.r();
        textInputLayout.u(z10, false);
        textInputLayout.x();
    }
}
