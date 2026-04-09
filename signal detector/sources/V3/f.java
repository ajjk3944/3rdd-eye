package v3;

import G3.o;
import G3.z;
import M0.g;
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
import com.apm.insight.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d4.h;
import e3.AbstractC2303a;
import java.util.ArrayList;
import m0.C2650a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public o f23869a;

    /* renamed from: b, reason: collision with root package name */
    public e f23870b;

    /* renamed from: c, reason: collision with root package name */
    public RippleDrawable f23871c;

    /* renamed from: d, reason: collision with root package name */
    public C2961a f23872d;

    /* renamed from: e, reason: collision with root package name */
    public RippleDrawable f23873e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23874f;

    /* renamed from: h, reason: collision with root package name */
    public float f23876h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f23877j;

    /* renamed from: k, reason: collision with root package name */
    public int f23878k;

    /* renamed from: l, reason: collision with root package name */
    public StateListAnimator f23879l;

    /* renamed from: m, reason: collision with root package name */
    public Animator f23880m;

    /* renamed from: n, reason: collision with root package name */
    public e3.e f23881n;

    /* renamed from: o, reason: collision with root package name */
    public e3.e f23882o;

    /* renamed from: q, reason: collision with root package name */
    public int f23884q;

    /* renamed from: s, reason: collision with root package name */
    public final FloatingActionButton f23886s;

    /* renamed from: t, reason: collision with root package name */
    public final h f23887t;

    /* renamed from: y, reason: collision with root package name */
    public static final C2650a f23867y = AbstractC2303a.f19929c;

    /* renamed from: z, reason: collision with root package name */
    public static final int f23868z = R.attr.motionDurationLong2;

    /* renamed from: A, reason: collision with root package name */
    public static final int f23858A = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: B, reason: collision with root package name */
    public static final int f23859B = R.attr.motionDurationMedium1;

    /* renamed from: C, reason: collision with root package name */
    public static final int f23860C = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f23861D = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f23862E = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f23863F = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f23864G = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f23865H = {android.R.attr.state_enabled};

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f23866I = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f23875g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f23883p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f23885r = 0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f23888u = new Rect();

    /* renamed from: v, reason: collision with root package name */
    public final RectF f23889v = new RectF();

    /* renamed from: w, reason: collision with root package name */
    public final RectF f23890w = new RectF();

    /* renamed from: x, reason: collision with root package name */
    public final Matrix f23891x = new Matrix();

    public f(FloatingActionButton floatingActionButton, h hVar) {
        this.f23886s = floatingActionButton;
        this.f23887t = hVar;
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f23886s.getDrawable();
        if (drawable == null || this.f23884q == 0) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        RectF rectF = this.f23889v;
        rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        float f5 = this.f23884q;
        RectF rectF2 = this.f23890w;
        rectF2.set(0.0f, 0.0f, f5, f5);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f6 = this.f23884q / 2.0f;
        matrix.postScale(f2, f2, f6, f6);
    }

    public final AnimatorSet b(e3.e eVar, float f2, float f5, float f6) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.f23886s;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        eVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f5);
        eVar.d("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new g(1));
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f5);
        eVar.d("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new g(1));
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f23891x;
        a(f6, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new e3.d(), new d(this), new Matrix(matrix));
        eVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.bumptech.glide.e.v(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f2, final float f5, final float f6, int i, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f23886s;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f7 = this.f23883p;
        final Matrix matrix = new Matrix(this.f23891x);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: v3.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f fVar = this.f23846a;
                fVar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FloatingActionButton floatingActionButton2 = fVar.f23886s;
                floatingActionButton2.setAlpha(AbstractC2303a.b(alpha, f2, 0.0f, 0.2f, fFloatValue));
                float f8 = scaleX;
                float f9 = f5;
                floatingActionButton2.setScaleX(AbstractC2303a.a(f8, f9, fFloatValue));
                floatingActionButton2.setScaleY(AbstractC2303a.a(scaleY, f9, fFloatValue));
                float f10 = f7;
                float f11 = f6;
                fVar.f23883p = AbstractC2303a.a(f10, f11, fFloatValue);
                float fA = AbstractC2303a.a(f10, f11, fFloatValue);
                Matrix matrix2 = matrix;
                fVar.a(fA, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        com.bumptech.glide.e.v(animatorSet, arrayList);
        animatorSet.setDuration(com.bumptech.glide.d.O(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(com.bumptech.glide.d.P(floatingActionButton.getContext(), i3, AbstractC2303a.f19928b));
        return animatorSet;
    }

    public final AnimatorSet d(float f2, float f5) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.f23886s;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f5).setDuration(100L));
        animatorSet.setInterpolator(f23867y);
        return animatorSet;
    }

    public final void e(float f2, float f5, float f6) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f23886s;
        if (floatingActionButton.getStateListAnimator() == this.f23879l) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f23861D, d(f2, f6));
            stateListAnimator.addState(f23862E, d(f2, f5));
            stateListAnimator.addState(f23863F, d(f2, f5));
            stateListAnimator.addState(f23864G, d(f2, f5));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f23867y);
            stateListAnimator.addState(f23865H, animatorSet);
            stateListAnimator.addState(f23866I, d(0.0f, 0.0f));
            this.f23879l = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (((FloatingActionButton) this.f23887t.f19807b).f18358k || (this.f23874f && floatingActionButton.getSizeDimension() < this.f23878k)) {
            h();
        }
    }

    public final void g(o oVar) {
        this.f23869a = oVar;
        e eVar = this.f23870b;
        if (eVar != null) {
            eVar.setShapeAppearanceModel(oVar);
        }
        Drawable.Callback callback = this.f23871c;
        if (callback instanceof z) {
            ((z) callback).setShapeAppearanceModel(oVar);
        }
        C2961a c2961a = this.f23872d;
        if (c2961a != null) {
            c2961a.f23844o = oVar;
            c2961a.invalidateSelf();
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
            d4.h r0 = r10.f23887t
            java.lang.Object r1 = r0.f19807b
            com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
            java.lang.Object r2 = r0.f19807b
            com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
            boolean r1 = r1.f18358k
            android.graphics.Rect r3 = r10.f23888u
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = r10.f23886s
            r5 = 0
            if (r1 == 0) goto L4c
            boolean r1 = r10.f23874f
            if (r1 == 0) goto L24
            int r1 = r10.f23878k
            int r6 = r4.getSizeDimension()
            int r1 = r1 - r6
            int r1 = r1 / 2
            int r5 = java.lang.Math.max(r1, r5)
        L24:
            boolean r1 = r10.f23875g
            if (r1 == 0) goto L30
            float r1 = r4.getElevation()
            float r6 = r10.f23877j
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
            boolean r1 = r10.f23874f
            if (r1 == 0) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r10.f23878k
            if (r1 >= r6) goto L63
            int r1 = r4.getSizeDimension()
            int r6 = r6 - r1
            int r6 = r6 / 2
            r3.set(r6, r6, r6, r6)
            goto L66
        L63:
            r3.set(r5, r5, r5, r5)
        L66:
            android.graphics.drawable.RippleDrawable r1 = r10.f23873e
            java.lang.String r5 = "Didn't initialize content background"
            a4.t.e(r1, r5)
            java.lang.Object r0 = r0.f19807b
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            boolean r0 = r0.f18358k
            if (r0 != 0) goto L8a
            boolean r0 = r10.f23874f
            if (r0 == 0) goto L82
            int r0 = r4.getSizeDimension()
            int r1 = r10.f23878k
            if (r0 >= r1) goto L82
            goto L8a
        L82:
            android.graphics.drawable.RippleDrawable r0 = r10.f23873e
            if (r0 == 0) goto L9c
            com.google.android.material.floatingactionbutton.FloatingActionButton.b(r2, r0)
            goto L9c
        L8a:
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.RippleDrawable r5 = r10.f23873e
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
            android.graphics.Rect r5 = r2.f18359l
            r5.set(r0, r1, r4, r3)
            int r5 = r2.i
            int r0 = r0 + r5
            int r1 = r1 + r5
            int r4 = r4 + r5
            int r3 = r3 + r5
            r2.setPadding(r0, r1, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.f.h():void");
    }

    public final void f() {
    }
}
