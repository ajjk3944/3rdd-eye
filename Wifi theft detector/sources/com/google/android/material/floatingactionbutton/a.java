package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import g5.k;
import java.util.ArrayList;
import k4.h;
import r0.i;

/* loaded from: classes2.dex */
public class a {
    public static final TimeInterpolator C = k4.a.f21836c;
    public static final int D = j4.b.motionDurationLong2;
    public static final int E = j4.b.motionEasingEmphasizedInterpolator;
    public static final int F = j4.b.motionDurationMedium1;
    public static final int G = j4.b.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] H = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] J = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] K = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] L = {R.attr.state_enabled};
    public static final int[] M = new int[0];
    public ViewTreeObserver.OnPreDrawListener B;

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.material.shape.a f10557a;

    /* renamed from: b, reason: collision with root package name */
    public MaterialShapeDrawable f10558b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f10559c;

    /* renamed from: d, reason: collision with root package name */
    public z4.c f10560d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f10561e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10562f;

    /* renamed from: h, reason: collision with root package name */
    public float f10564h;

    /* renamed from: i, reason: collision with root package name */
    public float f10565i;

    /* renamed from: j, reason: collision with root package name */
    public float f10566j;

    /* renamed from: k, reason: collision with root package name */
    public int f10567k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f10568l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f10569m;

    /* renamed from: n, reason: collision with root package name */
    public h f10570n;

    /* renamed from: o, reason: collision with root package name */
    public h f10571o;

    /* renamed from: q, reason: collision with root package name */
    public int f10573q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f10575s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f10576t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f10577u;

    /* renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f10578v;

    /* renamed from: w, reason: collision with root package name */
    public final f5.b f10579w;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10563g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f10572p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f10574r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f10580x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public final RectF f10581y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f10582z = new RectF();
    public final Matrix A = new Matrix();

    /* renamed from: com.google.android.material.floatingactionbutton.a$a, reason: collision with other inner class name */
    public class C0208a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10583a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10584b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f10585c;

        public C0208a(boolean z10, g gVar) {
            this.f10584b = z10;
            this.f10585c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10583a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f10574r = 0;
            a.this.f10569m = null;
            if (this.f10583a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f10578v;
            boolean z10 = this.f10584b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            g gVar = this.f10585c;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f10578v.b(0, this.f10584b);
            a.this.f10574r = 1;
            a.this.f10569m = animator;
            this.f10583a = false;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10587a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f10588b;

        public b(boolean z10, g gVar) {
            this.f10587a = z10;
            this.f10588b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f10574r = 0;
            a.this.f10569m = null;
            g gVar = this.f10588b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f10578v.b(0, this.f10587a);
            a.this.f10574r = 2;
            a.this.f10569m = animator;
        }
    }

    public class c extends k4.g {
        public c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            a.this.f10572p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    public class d implements TypeEvaluator {

        /* renamed from: a, reason: collision with root package name */
        public final FloatEvaluator f10591a = new FloatEvaluator();

        public d() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f10591a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public static class e extends MaterialShapeDrawable {
        public e(com.google.android.material.shape.a aVar) {
            super(aVar);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
        void a();

        void b();
    }

    public a(FloatingActionButton floatingActionButton, f5.b bVar) {
        this.f10578v = floatingActionButton;
        this.f10579w = bVar;
    }

    public static /* synthetic */ void a(a aVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix, ValueAnimator valueAnimator) {
        aVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        aVar.f10578v.setAlpha(k4.a.b(f10, f11, 0.0f, 0.2f, fFloatValue));
        aVar.f10578v.setScaleX(k4.a.a(f12, f13, fFloatValue));
        aVar.f10578v.setScaleY(k4.a.a(f14, f13, fFloatValue));
        aVar.f10572p = k4.a.a(f15, f16, fFloatValue);
        aVar.h(k4.a.a(f15, f16, fFloatValue), matrix);
        aVar.f10578v.setImageMatrix(matrix);
    }

    public void A(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        MaterialShapeDrawable materialShapeDrawableN = n();
        this.f10558b = materialShapeDrawableN;
        materialShapeDrawableN.setTintList(colorStateList);
        if (mode != null) {
            this.f10558b.setTintMode(mode);
        }
        this.f10558b.W(this.f10578v.getContext());
        if (i10 > 0) {
            this.f10560d = j(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) i.g(this.f10560d), (Drawable) i.g(this.f10558b)});
        } else {
            this.f10560d = null;
            layerDrawable = this.f10558b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(e5.a.d(colorStateList2), layerDrawable, null);
        this.f10559c = rippleDrawable;
        this.f10561e = rippleDrawable;
    }

    public boolean B() {
        return this.f10578v.getVisibility() == 0 ? this.f10574r == 1 : this.f10574r != 2;
    }

    public boolean C() {
        return this.f10578v.getVisibility() != 0 ? this.f10574r == 2 : this.f10574r != 1;
    }

    public void D() {
        MaterialShapeDrawable materialShapeDrawable = this.f10558b;
        if (materialShapeDrawable != null) {
            g5.h.f(this.f10578v, materialShapeDrawable);
        }
    }

    public void E() {
        c0();
    }

    public void F() {
        ViewTreeObserver viewTreeObserver = this.f10578v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    public void G(float f10, float f11, float f12) {
        if (this.f10578v.getStateListAnimator() == this.f10568l) {
            StateListAnimator stateListAnimatorL = l(f10, f11, f12);
            this.f10568l = stateListAnimatorL;
            this.f10578v.setStateListAnimator(stateListAnimatorL);
        }
        if (Y()) {
            c0();
        }
    }

    public void H(Rect rect) {
        i.h(this.f10561e, "Didn't initialize content background");
        if (!Y()) {
            this.f10579w.b(this.f10561e);
        } else {
            this.f10579w.b(new InsetDrawable(this.f10561e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    public void I() {
        ArrayList arrayList = this.f10577u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f) obj).b();
            }
        }
    }

    public void J() {
        ArrayList arrayList = this.f10577u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((f) obj).a();
            }
        }
    }

    public void K(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f10558b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        z4.c cVar = this.f10560d;
        if (cVar != null) {
            cVar.c(colorStateList);
        }
    }

    public void L(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f10558b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    public final void M(float f10) {
        if (this.f10564h != f10) {
            this.f10564h = f10;
            G(f10, this.f10565i, this.f10566j);
        }
    }

    public void N(boolean z10) {
        this.f10562f = z10;
    }

    public final void O(h hVar) {
        this.f10571o = hVar;
    }

    public final void P(float f10) {
        if (this.f10565i != f10) {
            this.f10565i = f10;
            G(this.f10564h, f10, this.f10566j);
        }
    }

    public final void Q(float f10) {
        this.f10572p = f10;
        Matrix matrix = this.A;
        h(f10, matrix);
        this.f10578v.setImageMatrix(matrix);
    }

    public final void R(int i10) {
        if (this.f10573q != i10) {
            this.f10573q = i10;
            b0();
        }
    }

    public void S(int i10) {
        this.f10567k = i10;
    }

    public final void T(float f10) {
        if (this.f10566j != f10) {
            this.f10566j = f10;
            G(this.f10564h, this.f10565i, f10);
        }
    }

    public void U(ColorStateList colorStateList) {
        Drawable drawable = this.f10559c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(e5.a.d(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(e5.a.d(colorStateList));
        }
    }

    public void V(boolean z10) {
        this.f10563g = z10;
        c0();
    }

    public final void W(com.google.android.material.shape.a aVar) {
        this.f10557a = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.f10558b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        Object obj = this.f10559c;
        if (obj instanceof k) {
            ((k) obj).setShapeAppearanceModel(aVar);
        }
        z4.c cVar = this.f10560d;
        if (cVar != null) {
            cVar.f(aVar);
        }
    }

    public final void X(h hVar) {
        this.f10570n = hVar;
    }

    public boolean Y() {
        return this.f10579w.c() || z();
    }

    public final boolean Z() {
        return this.f10578v.isLaidOut() && !this.f10578v.isInEditMode();
    }

    public void a0(g gVar, boolean z10) {
        a aVar;
        AnimatorSet animatorSetK;
        if (C()) {
            return;
        }
        Animator animator = this.f10569m;
        if (animator != null) {
            animator.cancel();
        }
        int i10 = 0;
        boolean z11 = this.f10570n == null;
        if (!Z()) {
            this.f10578v.b(0, z10);
            this.f10578v.setAlpha(1.0f);
            this.f10578v.setScaleY(1.0f);
            this.f10578v.setScaleX(1.0f);
            Q(1.0f);
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        if (this.f10578v.getVisibility() != 0) {
            this.f10578v.setAlpha(0.0f);
            this.f10578v.setScaleY(z11 ? 0.4f : 0.0f);
            this.f10578v.setScaleX(z11 ? 0.4f : 0.0f);
            Q(z11 ? 0.4f : 0.0f);
        }
        h hVar = this.f10570n;
        if (hVar != null) {
            animatorSetK = i(hVar, 1.0f, 1.0f, 1.0f);
            aVar = this;
        } else {
            aVar = this;
            animatorSetK = aVar.k(1.0f, 1.0f, 1.0f, D, E);
        }
        animatorSetK.addListener(new b(z10, gVar));
        ArrayList arrayList = aVar.f10575s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                animatorSetK.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetK.start();
    }

    public final void b0() {
        Q(this.f10572p);
    }

    public final void c0() {
        Rect rect = this.f10580x;
        t(rect);
        H(rect);
        this.f10579w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void d0(float f10) {
        MaterialShapeDrawable materialShapeDrawable = this.f10558b;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.h0(f10);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f10576t == null) {
            this.f10576t = new ArrayList();
        }
        this.f10576t.add(animatorListener);
    }

    public final void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    public void f(Animator.AnimatorListener animatorListener) {
        if (this.f10575s == null) {
            this.f10575s = new ArrayList();
        }
        this.f10575s.add(animatorListener);
    }

    public void g(f fVar) {
        if (this.f10577u == null) {
            this.f10577u = new ArrayList();
        }
        this.f10577u.add(fVar);
    }

    public final void h(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f10578v.getDrawable() == null || this.f10573q == 0) {
            return;
        }
        RectF rectF = this.f10581y;
        RectF rectF2 = this.f10582z;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f10573q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f10573q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    public final AnimatorSet i(h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10578v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        hVar.h("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f10578v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        hVar.h("scale").a(objectAnimatorOfFloat2);
        e0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f10578v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        hVar.h("scale").a(objectAnimatorOfFloat3);
        e0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        h(f12, this.A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f10578v, new k4.f(), new c(), new Matrix(this.A));
        hVar.h("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        k4.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    public z4.c j(int i10, ColorStateList colorStateList) {
        Context context = this.f10578v.getContext();
        z4.c cVar = new z4.c((com.google.android.material.shape.a) i.g(this.f10557a));
        cVar.e(ContextCompat.getColor(context, j4.c.design_fab_stroke_top_outer_color), ContextCompat.getColor(context, j4.c.design_fab_stroke_top_inner_color), ContextCompat.getColor(context, j4.c.design_fab_stroke_end_inner_color), ContextCompat.getColor(context, j4.c.design_fab_stroke_end_outer_color));
        cVar.d(i10);
        cVar.c(colorStateList);
        return cVar;
    }

    public final AnimatorSet k(final float f10, final float f11, final float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f10578v.getAlpha();
        final float scaleX = this.f10578v.getScaleX();
        final float scaleY = this.f10578v.getScaleY();
        final float f13 = this.f10572p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z4.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.material.floatingactionbutton.a.a(this.f25352a, alpha, f10, scaleX, f11, scaleY, f13, f12, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        k4.b.a(animatorSet, arrayList);
        animatorSet.setDuration(b5.k.f(this.f10578v.getContext(), i10, this.f10578v.getContext().getResources().getInteger(j4.g.material_motion_duration_long_1)));
        animatorSet.setInterpolator(b5.k.g(this.f10578v.getContext(), i11, k4.a.f21835b));
        return animatorSet;
    }

    public final StateListAnimator l(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(H, m(f10, f12));
        stateListAnimator.addState(I, m(f10, f11));
        stateListAnimator.addState(J, m(f10, f11));
        stateListAnimator.addState(K, m(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f10578v, "elevation", f10).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f10578v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f10578v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C);
        stateListAnimator.addState(L, animatorSet);
        stateListAnimator.addState(M, m(0.0f, 0.0f));
        return stateListAnimator;
    }

    public final Animator m(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f10578v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f10578v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C);
        return animatorSet;
    }

    public MaterialShapeDrawable n() {
        return new e((com.google.android.material.shape.a) i.g(this.f10557a));
    }

    public final Drawable o() {
        return this.f10561e;
    }

    public float p() {
        return this.f10578v.getElevation();
    }

    public boolean q() {
        return this.f10562f;
    }

    public final h r() {
        return this.f10571o;
    }

    public float s() {
        return this.f10565i;
    }

    public void t(Rect rect) {
        if (this.f10579w.c()) {
            int iX = x();
            int iMax = Math.max(iX, (int) Math.ceil(this.f10563g ? p() + this.f10566j : 0.0f));
            int iMax2 = Math.max(iX, (int) Math.ceil(r1 * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!z()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f10567k - this.f10578v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    public float u() {
        return this.f10566j;
    }

    public final com.google.android.material.shape.a v() {
        return this.f10557a;
    }

    public final h w() {
        return this.f10570n;
    }

    public int x() {
        if (this.f10562f) {
            return Math.max((this.f10567k - this.f10578v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    public void y(g gVar, boolean z10) {
        a aVar;
        AnimatorSet animatorSetK;
        if (B()) {
            return;
        }
        Animator animator = this.f10569m;
        if (animator != null) {
            animator.cancel();
        }
        if (!Z()) {
            this.f10578v.b(z10 ? 8 : 4, z10);
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        h hVar = this.f10571o;
        if (hVar != null) {
            animatorSetK = i(hVar, 0.0f, 0.0f, 0.0f);
            aVar = this;
        } else {
            aVar = this;
            animatorSetK = aVar.k(0.0f, 0.4f, 0.4f, F, G);
        }
        animatorSetK.addListener(new C0208a(z10, gVar));
        ArrayList arrayList = aVar.f10576t;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                animatorSetK.addListener((Animator.AnimatorListener) obj);
            }
        }
        animatorSetK.start();
    }

    public final boolean z() {
        return this.f10562f && this.f10578v.getSizeDimension() < this.f10567k;
    }
}
