package je;

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
import com.google.android.material.textfield.TextInputLayout;
import ir.f0;
import java.util.ArrayList;
import p.q0;

/* loaded from: classes.dex */
public final class q {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f13658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13660c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f13661d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f13662e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f13663f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f13664g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f13665h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f13666i;
    public int j;
    public FrameLayout k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f13667l;

    /* renamed from: m, reason: collision with root package name */
    public final float f13668m;

    /* renamed from: n, reason: collision with root package name */
    public int f13669n;

    /* renamed from: o, reason: collision with root package name */
    public int f13670o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f13671p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13672q;

    /* renamed from: r, reason: collision with root package name */
    public q0 f13673r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f13674s;

    /* renamed from: t, reason: collision with root package name */
    public int f13675t;

    /* renamed from: u, reason: collision with root package name */
    public int f13676u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f13677v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f13678w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13679x;

    /* renamed from: y, reason: collision with root package name */
    public q0 f13680y;

    /* renamed from: z, reason: collision with root package name */
    public int f13681z;

    public q(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f13664g = context;
        this.f13665h = textInputLayout;
        this.f13668m = context.getResources().getDimensionPixelSize(ed.d.design_textinput_caption_translate_y);
        this.f13658a = f0.U(context, ed.b.motionDurationShort4, 217);
        this.f13659b = f0.U(context, ed.b.motionDurationMedium4, 167);
        this.f13660c = f0.U(context, ed.b.motionDurationShort4, 167);
        this.f13661d = f0.V(context, ed.b.motionEasingEmphasizedDecelerateInterpolator, fd.a.f8825d);
        int i10 = ed.b.motionEasingEmphasizedDecelerateInterpolator;
        LinearInterpolator linearInterpolator = fd.a.f8822a;
        this.f13662e = f0.V(context, i10, linearInterpolator);
        this.f13663f = f0.V(context, ed.b.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(q0 q0Var, int i10) {
        if (this.f13666i == null && this.k == null) {
            Context context = this.f13664g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f13666i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f13666i;
            TextInputLayout textInputLayout = this.f13665h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.f13666i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 == 0 || i10 == 1) {
            this.k.setVisibility(0);
            this.k.addView(q0Var);
        } else {
            this.f13666i.addView(q0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f13666i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f13666i != null) {
            TextInputLayout textInputLayout = this.f13665h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f13664g;
                boolean zF = xu.l.F(context);
                LinearLayout linearLayout = this.f13666i;
                int i10 = ed.d.material_helper_text_font_1_3_padding_horizontal;
                int paddingStart = editText.getPaddingStart();
                if (zF) {
                    paddingStart = context.getResources().getDimensionPixelSize(i10);
                }
                int i11 = ed.d.material_helper_text_font_1_3_padding_top;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(ed.d.material_helper_text_default_padding_top);
                if (zF) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(i11);
                }
                int i12 = ed.d.material_helper_text_font_1_3_padding_horizontal;
                int paddingEnd = editText.getPaddingEnd();
                if (zF) {
                    paddingEnd = context.getResources().getDimensionPixelSize(i12);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f13667l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z10, q0 q0Var, int i10, int i11, int i12) {
        if (q0Var == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            boolean z11 = i12 == i10;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(q0Var, (Property<q0, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
            int i13 = this.f13660c;
            objectAnimatorOfFloat.setDuration(z11 ? this.f13659b : i13);
            objectAnimatorOfFloat.setInterpolator(z11 ? this.f13662e : this.f13663f);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorOfFloat.setStartDelay(i13);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(q0Var, (Property<q0, Float>) View.TRANSLATION_Y, -this.f13668m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f13658a);
            objectAnimatorOfFloat2.setInterpolator(this.f13661d);
            objectAnimatorOfFloat2.setStartDelay(i13);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i10) {
        if (i10 == 1) {
            return this.f13673r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f13680y;
    }

    public final void f() {
        this.f13671p = null;
        c();
        if (this.f13669n == 1) {
            if (!this.f13679x || TextUtils.isEmpty(this.f13678w)) {
                this.f13670o = 0;
            } else {
                this.f13670o = 2;
            }
        }
        i(this.f13669n, h(this.f13673r, ""), this.f13670o);
    }

    public final void g(q0 q0Var, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f13666i;
        if (linearLayout == null) {
            return;
        }
        if ((i10 == 0 || i10 == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(q0Var);
        } else {
            linearLayout.removeView(q0Var);
        }
        int i11 = this.j - 1;
        this.j = i11;
        LinearLayout linearLayout2 = this.f13666i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(q0 q0Var, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f13665h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.f13670o == this.f13669n && q0Var != null && TextUtils.equals(q0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i10, boolean z10, int i11) {
        TextView textViewE;
        TextView textViewE2;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f13667l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f13679x, this.f13680y, 2, i10, i11);
            d(arrayList, this.f13672q, this.f13673r, 1, i10, i11);
            vc.e.E(animatorSet, arrayList);
            animatorSet.addListener(new o(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (textViewE2 = e(i11)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i10 != 0 && (textViewE = e(i10)) != null) {
                textViewE.setVisibility(4);
                if (i10 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f13669n = i11;
        }
        TextInputLayout textInputLayout = this.f13665h;
        textInputLayout.t();
        textInputLayout.w(z10, false);
        textInputLayout.z();
    }
}
