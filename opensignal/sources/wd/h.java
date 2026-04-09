package wd;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ee.l;
import ee.v;
import ir.f0;
import java.util.ArrayList;
import p.l2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public l f24449a;

    /* renamed from: b, reason: collision with root package name */
    public g f24450b;

    /* renamed from: c, reason: collision with root package name */
    public RippleDrawable f24451c;

    /* renamed from: d, reason: collision with root package name */
    public a f24452d;

    /* renamed from: e, reason: collision with root package name */
    public RippleDrawable f24453e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24454f;

    /* renamed from: h, reason: collision with root package name */
    public float f24456h;

    /* renamed from: i, reason: collision with root package name */
    public float f24457i;
    public float j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f24458l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f24459m;

    /* renamed from: n, reason: collision with root package name */
    public fd.d f24460n;

    /* renamed from: o, reason: collision with root package name */
    public fd.d f24461o;

    /* renamed from: q, reason: collision with root package name */
    public int f24463q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f24465s;

    /* renamed from: t, reason: collision with root package name */
    public final l2 f24466t;

    /* renamed from: y, reason: collision with root package name */
    public static final q4.a f24447y = fd.a.f8824c;

    /* renamed from: z, reason: collision with root package name */
    public static final int f24448z = ed.b.motionDurationLong2;
    public static final int A = ed.b.motionEasingEmphasizedInterpolator;
    public static final int B = ed.b.motionDurationMedium1;
    public static final int C = ed.b.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] E = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    public static final int[] F = {R.attr.state_focused, R.attr.state_enabled};
    public static final int[] G = {R.attr.state_hovered, R.attr.state_enabled};
    public static final int[] H = {R.attr.state_enabled};
    public static final int[] I = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f24455g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f24462p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f24464r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f24467u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f24468v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f24469w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f24470x = new Matrix();

    public h(FloatingActionButton floatingActionButton, l2 l2Var) {
        this.f24465s = floatingActionButton;
        this.f24466t = l2Var;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f24465s.getDrawable();
        if (drawable == null || this.f24463q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f24468v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f11 = this.f24463q;
        RectF rectF2 = this.f24469w;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f24463q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(fd.d dVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f24465s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        dVar.d("scale").a(objectAnimatorOfFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            objectAnimatorOfFloat2.setEvaluator(new f());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        dVar.d("scale").a(objectAnimatorOfFloat3);
        if (i10 == 26) {
            objectAnimatorOfFloat3.setEvaluator(new f());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f24470x;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new fd.c(), new e(this), new Matrix(matrix));
        dVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        vc.e.E(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f10, final float f11, final float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f24465s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f13 = this.f24462p;
        final Matrix matrix = new Matrix(this.f24470x);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wd.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                h hVar = this.f24430a;
                hVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = hVar.f24465s;
                floatingActionButton2.setAlpha(fd.a.b(alpha, f10, 0.0f, 0.2f, fFloatValue));
                float f14 = scaleX;
                float f15 = f11;
                floatingActionButton2.setScaleX(fd.a.a(f14, f15, fFloatValue));
                floatingActionButton2.setScaleY(fd.a.a(scaleY, f15, fFloatValue));
                float f16 = f13;
                float f17 = f12;
                hVar.f24462p = fd.a.a(f16, f17, fFloatValue);
                float fA = fd.a.a(f16, f17, fFloatValue);
                Matrix matrix2 = matrix;
                hVar.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        vc.e.E(animatorSet, arrayList);
        animatorSet.setDuration(f0.U(floatingActionButton.getContext(), i10, floatingActionButton.getContext().getResources().getInteger(ed.g.material_motion_duration_long_1)));
        animatorSet.setInterpolator(f0.V(floatingActionButton.getContext(), i11, fd.a.f8823b));
        return animatorSet;
    }

    public final AnimatorSet d(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f24465s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(f24447y);
        return animatorSet;
    }

    public final void e(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f24465s;
        if (floatingActionButton.getStateListAnimator() == this.f24458l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f10, f12));
            stateListAnimator.addState(E, d(f10, f11));
            stateListAnimator.addState(F, d(f10, f11));
            stateListAnimator.addState(G, d(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f24447y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(0.0f, 0.0f));
            this.f24458l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.f24466t.f20100d).G || (this.f24454f && floatingActionButton.getSizeDimension() < this.k)) {
            h();
        }
    }

    public final void g(l lVar) {
        this.f24449a = lVar;
        g gVar = this.f24450b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(lVar);
        }
        Drawable.Callback callback = this.f24451c;
        if (callback instanceof v) {
            ((v) callback).setShapeAppearanceModel(lVar);
        }
        a aVar = this.f24452d;
        if (aVar != null) {
            aVar.f24428o = lVar;
            aVar.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r10 = this;
            p.l2 r0 = r10.f24466t
            java.lang.Object r1 = r0.f20100d
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.f20100d
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.G
            android.graphics.Rect r3 = r10.f24467u
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r10.f24465s
            r5 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r10.f24454f
            if (r1 == 0) goto L24
            int r1 = r10.k
            int r6 = r4.getSizeDimension()
            int r1 = r1 - r6
            int r1 = r1 / 2
            int r5 = java.lang.Math.max(r1, r5)
        L24:
            boolean r1 = r10.f24455g
            if (r1 == 0) goto L30
            float r1 = r4.getElevation()
            float r6 = r10.j
            float r1 = r1 + r6
            goto L31
        L30:
            r1 = 0
        L31:
            double r6 = (double) r1
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r6 = java.lang.Math.max(r5, r6)
            r7 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r7
            double r7 = (double) r1
            double r7 = java.lang.Math.ceil(r7)
            int r1 = (int) r7
            int r1 = java.lang.Math.max(r5, r1)
            r3.set(r6, r1, r6, r1)
            goto L66
        L4c:
            boolean r1 = r10.f24454f
            if (r1 == 0) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r10.k
            if (r1 >= r6) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r6 - r1
            int r6 = r6 / 2
            r3.set(r6, r6, r6, r6)
            goto L66
        L63:
            r3.set(r5, r5, r5, r5)
        L66:
            android.graphics.drawable.RippleDrawable r1 = r10.f24453e
            java.lang.String r5 = "Didn't initialize content background"
            se.b.m(r1, r5)
            java.lang.Object r0 = r0.f20100d
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.G
            if (r0 != 0) goto L8a
            boolean r0 = r10.f24454f
            if (r0 == 0) goto L82
            int r0 = r4.getSizeDimension()
            int r1 = r10.k
            if (r0 >= r1) goto L82
            goto L8a
        L82:
            android.graphics.drawable.RippleDrawable r0 = r10.f24453e
            if (r0 == 0) goto L9c
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r0)
            goto L9c
        L8a:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r5 = r10.f24453e
            int r6 = r3.left
            int r7 = r3.top
            int r8 = r3.right
            int r9 = r3.bottom
            r4.<init>(r5, r6, r7, r8, r9)
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r4)
        L9c:
            int r0 = r3.left
            int r1 = r3.top
            int r4 = r3.right
            int r3 = r3.bottom
            android.graphics.Rect r5 = r2.H
            r5.set(r0, r1, r4, r3)
            int r5 = r2.E
            int r0 = r0 + r5
            int r1 = r1 + r5
            int r4 = r4 + r5
            int r3 = r3 + r5
            r2.setPadding(r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.h.h():void");
    }

    public final void f() {
    }
}
