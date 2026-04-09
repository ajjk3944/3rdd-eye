package c4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i4.C4456a;
import java.util.ArrayList;
import l4.C5287f;
import l4.C5290i;
import z0.C5848a;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
public final class f extends com.google.android.material.floatingactionbutton.b {

    /* renamed from: N, reason: collision with root package name */
    public StateListAnimator f18485N;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    public static class a extends C5287f {
        @Override // l4.C5287f, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final float e() {
        return this.f22953v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void f(Rect rect) {
        if (FloatingActionButton.this.f22909l) {
            super.f(rect);
            return;
        }
        if (this.f22938f) {
            FloatingActionButton floatingActionButton = this.f22953v;
            int sizeDimension = floatingActionButton.getSizeDimension();
            int i = this.f22942k;
            if (sizeDimension < i) {
                int sizeDimension2 = (i - floatingActionButton.getSizeDimension()) / 2;
                rect.set(sizeDimension2, sizeDimension2, sizeDimension2, sizeDimension2);
                return;
            }
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        C5290i c5290i = this.f22933a;
        c5290i.getClass();
        a aVar = new a(c5290i);
        this.f22934b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.f22934b.setTintMode(mode);
        }
        C5287f c5287f = this.f22934b;
        FloatingActionButton floatingActionButton = this.f22953v;
        c5287f.i(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            C5290i c5290i2 = this.f22933a;
            c5290i2.getClass();
            C2062a c2062a = new C2062a(c5290i2);
            int color = C5848a.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = C5848a.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = C5848a.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = C5848a.getColor(context, R.color.design_fab_stroke_end_outer_color);
            c2062a.i = color;
            c2062a.f18468j = color2;
            c2062a.f18469k = color3;
            c2062a.f18470l = color4;
            float f10 = i;
            if (c2062a.f18467h != f10) {
                c2062a.f18467h = f10;
                c2062a.f18461b.setStrokeWidth(f10 * 1.3333f);
                c2062a.f18472n = true;
                c2062a.invalidateSelf();
            }
            if (colorStateList != null) {
                c2062a.f18471m = colorStateList.getColorForState(c2062a.getState(), c2062a.f18471m);
            }
            c2062a.f18474p = colorStateList;
            c2062a.f18472n = true;
            c2062a.invalidateSelf();
            this.f22936d = c2062a;
            C2062a c2062a2 = this.f22936d;
            c2062a2.getClass();
            C5287f c5287f2 = this.f22934b;
            c5287f2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{c2062a2, c5287f2});
        } else {
            this.f22936d = null;
            layerDrawable = this.f22934b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C4456a.a(colorStateList2), layerDrawable, null);
        this.f22935c = rippleDrawable;
        this.f22937e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void i() {
        q();
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void k(float f10, float f11, float f12) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f22953v;
        if (floatingActionButton.getStateListAnimator() == this.f18485N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f22925H, r(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f22926I, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f22927J, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f22928K, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.b.f22920C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f22929L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.b.f22930M, r(0.0f, 0.0f));
            this.f18485N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.f22935c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C4456a.a(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final boolean o() {
        if (FloatingActionButton.this.f22909l) {
            return true;
        }
        return this.f22938f && this.f22953v.getSizeDimension() < this.f22942k;
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f22953v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.b.f22920C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.b
    public final void j(int[] iArr) {
    }
}
