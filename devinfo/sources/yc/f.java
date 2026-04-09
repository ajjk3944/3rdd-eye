package yc;

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
import com.liuzh.deviceinfo.R;
import ed.o;
import ed.y;
import java.util.ArrayList;
import km.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public o f37546a;

    /* renamed from: b, reason: collision with root package name */
    public e f37547b;

    /* renamed from: c, reason: collision with root package name */
    public RippleDrawable f37548c;

    /* renamed from: d, reason: collision with root package name */
    public a f37549d;

    /* renamed from: e, reason: collision with root package name */
    public RippleDrawable f37550e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37551f;

    /* renamed from: h, reason: collision with root package name */
    public float f37552h;

    /* renamed from: i, reason: collision with root package name */
    public float f37553i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f37554k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f37555l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f37556m;

    /* renamed from: n, reason: collision with root package name */
    public jc.d f37557n;

    /* renamed from: o, reason: collision with root package name */
    public jc.d f37558o;

    /* renamed from: q, reason: collision with root package name */
    public int f37560q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f37562s;

    /* renamed from: t, reason: collision with root package name */
    public final i f37563t;

    /* renamed from: y, reason: collision with root package name */
    public static final d5.a f37544y = jc.a.f27484c;

    /* renamed from: z, reason: collision with root package name */
    public static final int f37545z = R.attr.motionDurationLong2;
    public static final int A = R.attr.motionEasingEmphasizedInterpolator;
    public static final int B = R.attr.motionDurationMedium1;
    public static final int C = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    public static final int[] D = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] F = {android.R.attr.state_focused, android.R.attr.state_enabled};
    public static final int[] G = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    public static final int[] H = {android.R.attr.state_enabled};
    public static final int[] I = new int[0];
    public boolean g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f37559p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f37561r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f37564u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f37565v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f37566w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f37567x = new Matrix();

    public f(FloatingActionButton floatingActionButton, i iVar) {
        this.f37562s = floatingActionButton;
        this.f37563t = iVar;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f37562s.getDrawable();
        if (drawable == null || this.f37560q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f37565v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f11 = this.f37560q;
        RectF rectF2 = this.f37566w;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f37560q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(jc.d dVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f37562s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        dVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        dVar.d("scale").a(objectAnimatorOfFloat2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 26) {
            objectAnimatorOfFloat2.setEvaluator(new k6.f(1));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        dVar.d("scale").a(objectAnimatorOfFloat3);
        if (i4 == 26) {
            objectAnimatorOfFloat3.setEvaluator(new k6.f(1));
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f37567x;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new jc.c(), new d(this), new Matrix(matrix));
        dVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        wd.b.N(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f10, final float f11, final float f12, int i4, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f37562s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f13 = this.f37559p;
        final Matrix matrix = new Matrix(this.f37567x);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yc.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f fVar = this.f37532a;
                fVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = fVar.f37562s;
                floatingActionButton2.setAlpha(jc.a.b(alpha, f10, 0.0f, 0.2f, fFloatValue));
                float f14 = scaleX;
                float f15 = f11;
                floatingActionButton2.setScaleX(jc.a.a(f14, f15, fFloatValue));
                floatingActionButton2.setScaleY(jc.a.a(scaleY, f15, fFloatValue));
                float f16 = f13;
                float f17 = f12;
                fVar.f37559p = jc.a.a(f16, f17, fFloatValue);
                float fA = jc.a.a(f16, f17, fFloatValue);
                Matrix matrix2 = matrix;
                fVar.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        wd.b.N(animatorSet, arrayList);
        animatorSet.setDuration(nh.a.v(floatingActionButton.getContext(), i4, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(nh.a.w(floatingActionButton.getContext(), i10, jc.a.f27483b));
        return animatorSet;
    }

    public final AnimatorSet d(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f37562s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(f37544y);
        return animatorSet;
    }

    public final void e(float f10, float f11, float f12) {
        int i4 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f37562s;
        if (floatingActionButton.getStateListAnimator() == this.f37555l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(D, d(f10, f12));
            stateListAnimator.addState(E, d(f10, f11));
            stateListAnimator.addState(F, d(f10, f11));
            stateListAnimator.addState(G, d(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i4 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f37544y);
            stateListAnimator.addState(H, animatorSet);
            stateListAnimator.addState(I, d(0.0f, 0.0f));
            this.f37555l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.f37563t.f28426b).f20523k || (this.f37551f && floatingActionButton.getSizeDimension() < this.f37554k)) {
            h();
        }
    }

    public final void g(o oVar) {
        this.f37546a = oVar;
        e eVar = this.f37547b;
        if (eVar != null) {
            eVar.setShapeAppearanceModel(oVar);
        }
        Drawable.Callback callback = this.f37548c;
        if (callback instanceof y) {
            ((y) callback).setShapeAppearanceModel(oVar);
        }
        a aVar = this.f37549d;
        if (aVar != null) {
            aVar.f37530o = oVar;
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
            km.i r0 = r10.f37563t
            java.lang.Object r1 = r0.f28426b
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.f28426b
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.f20523k
            android.graphics.Rect r3 = r10.f37564u
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r10.f37562s
            r5 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r10.f37551f
            if (r1 == 0) goto L24
            int r1 = r10.f37554k
            int r6 = r4.getSizeDimension()
            int r1 = r1 - r6
            int r1 = r1 / 2
            int r5 = java.lang.Math.max(r1, r5)
        L24:
            boolean r1 = r10.g
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
            boolean r1 = r10.f37551f
            if (r1 == 0) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r10.f37554k
            if (r1 >= r6) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r6 - r1
            int r6 = r6 / 2
            r3.set(r6, r6, r6, r6)
            goto L66
        L63:
            r3.set(r5, r5, r5, r5)
        L66:
            android.graphics.drawable.RippleDrawable r1 = r10.f37550e
            java.lang.String r5 = "Didn't initialize content background"
            pk.a.e(r1, r5)
            java.lang.Object r0 = r0.f28426b
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.f20523k
            if (r0 != 0) goto L8a
            boolean r0 = r10.f37551f
            if (r0 == 0) goto L82
            int r0 = r4.getSizeDimension()
            int r1 = r10.f37554k
            if (r0 >= r1) goto L82
            goto L8a
        L82:
            android.graphics.drawable.RippleDrawable r0 = r10.f37550e
            if (r0 == 0) goto L9c
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r0)
            goto L9c
        L8a:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r5 = r10.f37550e
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
            android.graphics.Rect r5 = r2.f20524l
            r5.set(r0, r1, r4, r3)
            int r5 = r2.f20522i
            int r0 = r0 + r5
            int r1 = r1 + r5
            int r4 = r4 + r5
            int r3 = r3 + r5
            r2.setPadding(r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.f.h():void");
    }

    public final void f() {
    }
}
