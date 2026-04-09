package com.google.android.material.floatingactionbutton;

import A2.l;
import D0.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import c4.C2062a;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f4.C4334b;
import h1.C4406a;
import i4.C4456a;
import java.util.ArrayList;
import java.util.Iterator;
import l4.C5287f;
import l4.C5290i;
import l4.m;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: C, reason: collision with root package name */
    public static final C4406a f22920C = L3.a.f4036c;

    /* renamed from: D, reason: collision with root package name */
    public static final int f22921D = R.attr.motionDurationLong2;

    /* renamed from: E, reason: collision with root package name */
    public static final int f22922E = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: F, reason: collision with root package name */
    public static final int f22923F = R.attr.motionDurationMedium1;

    /* renamed from: G, reason: collision with root package name */
    public static final int f22924G = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: H, reason: collision with root package name */
    public static final int[] f22925H = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f22926I = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: J, reason: collision with root package name */
    public static final int[] f22927J = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f22928K = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: L, reason: collision with root package name */
    public static final int[] f22929L = {android.R.attr.state_enabled};

    /* renamed from: M, reason: collision with root package name */
    public static final int[] f22930M = new int[0];

    /* renamed from: B, reason: collision with root package name */
    public c4.e f22932B;

    /* renamed from: a, reason: collision with root package name */
    public C5290i f22933a;

    /* renamed from: b, reason: collision with root package name */
    public C5287f f22934b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f22935c;

    /* renamed from: d, reason: collision with root package name */
    public C2062a f22936d;

    /* renamed from: e, reason: collision with root package name */
    public LayerDrawable f22937e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22938f;

    /* renamed from: h, reason: collision with root package name */
    public float f22940h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f22941j;

    /* renamed from: k, reason: collision with root package name */
    public int f22942k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f22943l;

    /* renamed from: m, reason: collision with root package name */
    public L3.g f22944m;

    /* renamed from: n, reason: collision with root package name */
    public L3.g f22945n;

    /* renamed from: o, reason: collision with root package name */
    public float f22946o;

    /* renamed from: q, reason: collision with root package name */
    public int f22948q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f22950s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f22951t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList<f> f22952u;

    /* renamed from: v, reason: collision with root package name */
    public final FloatingActionButton f22953v;

    /* renamed from: w, reason: collision with root package name */
    public final FloatingActionButton.b f22954w;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22939g = true;

    /* renamed from: p, reason: collision with root package name */
    public float f22947p = 1.0f;

    /* renamed from: r, reason: collision with root package name */
    public int f22949r = 0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f22955x = new Rect();

    /* renamed from: y, reason: collision with root package name */
    public final RectF f22956y = new RectF();

    /* renamed from: z, reason: collision with root package name */
    public final RectF f22957z = new RectF();

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f22931A = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    public class a extends L3.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            b.this.f22947p = f10;
            float[] fArr = this.f4043a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f4044b;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f11 = fArr2[i];
                float f12 = fArr[i];
                fArr2[i] = com.google.android.gms.measurement.internal.a.e(f11, f12, f10, f12);
            }
            Matrix matrix3 = this.f4045c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    public class C0343b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f22959a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f22960b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f22961c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f22962d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f22963e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f22964f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f22965g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Matrix f22966h;

        public C0343b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f22959a = f10;
            this.f22960b = f11;
            this.f22961c = f12;
            this.f22962d = f13;
            this.f22963e = f14;
            this.f22964f = f15;
            this.f22965g = f16;
            this.f22966h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b bVar = b.this;
            bVar.f22953v.setAlpha(L3.a.b(this.f22959a, this.f22960b, 0.0f, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = bVar.f22953v;
            float f10 = this.f22961c;
            float f11 = this.f22962d;
            floatingActionButton.setScaleX(L3.a.a(f10, f11, fFloatValue));
            bVar.f22953v.setScaleY(L3.a.a(this.f22963e, f11, fFloatValue));
            float f12 = this.f22964f;
            float f13 = this.f22965g;
            bVar.f22947p = L3.a.a(f12, f13, fFloatValue);
            float fA = L3.a.a(f12, f13, fFloatValue);
            Matrix matrix = this.f22966h;
            bVar.a(fA, matrix);
            bVar.f22953v.setImageMatrix(matrix);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class c extends h {
        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class d extends h {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c4.f f22967e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c4.f fVar) {
            super(fVar);
            this.f22967e = fVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            c4.f fVar = this.f22967e;
            return fVar.f22940h + fVar.i;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class e extends h {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c4.f f22968e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c4.f fVar) {
            super(fVar);
            this.f22968e = fVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            c4.f fVar = this.f22968e;
            return fVar.f22940h + fVar.f22941j;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public interface f {
        void a();

        void b();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public class g extends h {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c4.f f22969e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c4.f fVar) {
            super(fVar);
            this.f22969e = fVar;
        }

        @Override // com.google.android.material.floatingactionbutton.b.h
        public final float a() {
            return this.f22969e.f22940h;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22970a;

        /* renamed from: b, reason: collision with root package name */
        public float f22971b;

        /* renamed from: c, reason: collision with root package name */
        public float f22972c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c4.f f22973d;

        public h(c4.f fVar) {
            this.f22973d = fVar;
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f10 = (int) this.f22972c;
            C5287f c5287f = this.f22973d.f22934b;
            if (c5287f != null) {
                c5287f.j(f10);
            }
            this.f22970a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z10 = this.f22970a;
            c4.f fVar = this.f22973d;
            if (!z10) {
                C5287f c5287f = fVar.f22934b;
                this.f22971b = c5287f == null ? 0.0f : c5287f.f43759b.f43793m;
                this.f22972c = a();
                this.f22970a = true;
            }
            float f10 = this.f22971b;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f22972c - f10)) + f10);
            C5287f c5287f2 = fVar.f22934b;
            if (c5287f2 != null) {
                c5287f2.j(animatedFraction);
            }
        }
    }

    public b(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        this.f22953v = floatingActionButton;
        this.f22954w = bVar;
        d4.f fVar = new d4.f();
        c4.f fVar2 = (c4.f) this;
        fVar.a(f22925H, d(new e(fVar2)));
        fVar.a(f22926I, d(new d(fVar2)));
        fVar.a(f22927J, d(new d(fVar2)));
        fVar.a(f22928K, d(new d(fVar2)));
        fVar.a(f22929L, d(new g(fVar2)));
        fVar.a(f22930M, d(new c(fVar2)));
        this.f22946o = floatingActionButton.getRotation();
    }

    public static ValueAnimator d(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f22920C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f22953v.getDrawable() == null || this.f22948q == 0) {
            return;
        }
        RectF rectF = this.f22956y;
        RectF rectF2 = this.f22957z;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f11 = this.f22948q;
        rectF2.set(0.0f, 0.0f, f11, f11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f12 = this.f22948q / 2.0f;
        matrix.postScale(f10, f10, f12, f12);
    }

    public final AnimatorSet b(L3.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f10};
        FloatingActionButton floatingActionButton = this.f22953v;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        gVar.d("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        gVar.d("scale").a(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            c4.d dVar = new c4.d();
            dVar.f18483a = new FloatEvaluator();
            objectAnimatorOfFloat2.setEvaluator(dVar);
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        gVar.d("scale").a(objectAnimatorOfFloat3);
        if (i == 26) {
            c4.d dVar2 = new c4.d();
            dVar2.f18483a = new FloatEvaluator();
            objectAnimatorOfFloat3.setEvaluator(dVar2);
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f22931A;
        a(f12, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new L3.e(), new a(), new Matrix(matrix));
        gVar.d("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        l.C(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12, int i, int i10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f22953v;
        valueAnimatorOfFloat.addUpdateListener(new C0343b(floatingActionButton.getAlpha(), f10, floatingActionButton.getScaleX(), f11, floatingActionButton.getScaleY(), this.f22947p, f12, new Matrix(this.f22931A)));
        arrayList.add(valueAnimatorOfFloat);
        l.C(animatorSet, arrayList);
        animatorSet.setDuration(C4334b.c(floatingActionButton.getContext(), i, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C4334b.d(floatingActionButton.getContext(), i10, L3.a.f4035b));
        return animatorSet;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int iMax = this.f22938f ? Math.max((this.f22942k - this.f22953v.getSizeDimension()) / 2, 0) : 0;
        int iMax2 = Math.max(iMax, (int) Math.ceil(this.f22939g ? e() + this.f22941j : 0.0f));
        int iMax3 = Math.max(iMax, (int) Math.ceil(r0 * 1.5f));
        rect.set(iMax2, iMax3, iMax2, iMax3);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    public void h() {
        throw null;
    }

    public void i() {
        throw null;
    }

    public void j(int[] iArr) {
        throw null;
    }

    public void k(float f10, float f11, float f12) {
        throw null;
    }

    public final void l() {
        ArrayList<f> arrayList = this.f22952u;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            if (it.hasNext()) {
                it.next().a();
                throw null;
            }
        }
    }

    public void m(ColorStateList colorStateList) {
        Drawable drawable = this.f22935c;
        if (drawable != null) {
            a.C0009a.h(drawable, C4456a.a(colorStateList));
        }
    }

    public final void n(C5290i c5290i) {
        this.f22933a = c5290i;
        C5287f c5287f = this.f22934b;
        if (c5287f != null) {
            c5287f.setShapeAppearanceModel(c5290i);
        }
        Object obj = this.f22935c;
        if (obj instanceof m) {
            ((m) obj).setShapeAppearanceModel(c5290i);
        }
        C2062a c2062a = this.f22936d;
        if (c2062a != null) {
            c2062a.f18473o = c5290i;
            c2062a.invalidateSelf();
        }
    }

    public boolean o() {
        throw null;
    }

    public void p() {
        throw null;
    }

    public final void q() {
        Rect rect = this.f22955x;
        f(rect);
        l.p(this.f22937e, "Didn't initialize content background");
        boolean zO = o();
        FloatingActionButton.b bVar = this.f22954w;
        if (zO) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f22937e, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f22937e;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                bVar.getClass();
            }
        }
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f22910m.set(i, i10, i11, i12);
        int i13 = floatingActionButton.f22907j;
        floatingActionButton.setPadding(i + i13, i10 + i13, i11 + i13, i12 + i13);
    }
}
