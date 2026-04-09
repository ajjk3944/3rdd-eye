package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.liuzh.deviceinfo.R;
import i7.b;
import java.util.ArrayList;
import jc.a;
import jc.d;
import jc.e;
import km.o;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Deprecated
/* loaded from: classes3.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f20681c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f20682d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f20683e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f20684f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f20685h;

    public FabTransformationBehavior() {
        this.f20681c = new Rect();
        this.f20682d = new RectF();
        this.f20683e = new RectF();
        this.f20684f = new int[2];
    }

    public static float B(o oVar, e eVar, float f10) {
        long j = eVar.f27491a;
        long j8 = eVar.f27492b;
        e eVarD = ((d) oVar.f28445a).d("expansion");
        return a.a(f10, 0.0f, eVar.b().getInterpolation((((eVarD.f27491a + eVarD.f27492b) + 17) - j) / j8));
    }

    public static Pair y(float f10, float f11, boolean z3, o oVar) {
        e eVarD;
        e eVarD2;
        if (f10 == 0.0f || f11 == 0.0f) {
            eVarD = ((d) oVar.f28445a).d("translationXLinear");
            eVarD2 = ((d) oVar.f28445a).d("translationYLinear");
        } else if ((!z3 || f11 >= 0.0f) && (z3 || f11 <= 0.0f)) {
            eVarD = ((d) oVar.f28445a).d("translationXCurveDownwards");
            eVarD2 = ((d) oVar.f28445a).d("translationYCurveDownwards");
        } else {
            eVarD = ((d) oVar.f28445a).d("translationXCurveUpwards");
            eVarD2 = ((d) oVar.f28445a).d("translationYCurveUpwards");
        }
        return new Pair(eVarD, eVarD2);
    }

    public final float A(View view, View view2, b bVar) {
        RectF rectF = this.f20682d;
        C(view, rectF);
        rectF.offset(this.g, this.f20685h);
        RectF rectF2 = this.f20683e;
        C(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f20684f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract o D(Context context, boolean z3);

    @Override // com.google.android.material.transformation.ExpandableBehavior, p3.b
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // p3.b
    public final void g(p3.e eVar) {
        if (eVar.f31153h == 0) {
            eVar.f31153h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z3, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat;
        int i4;
        float f10;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        o oVarD = D(view2.getContext(), z3);
        if (z3) {
            this.g = view.getTranslationX();
            this.f20685h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z3) {
            if (!z10) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((d) oVarD.f28445a).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, (b) oVarD.f28446b);
        float fA = A(view, view2, (b) oVarD.f28446b);
        Pair pairY = y(fZ, fA, z3, oVarD);
        e eVar = (e) pairY.first;
        e eVar2 = (e) pairY.second;
        RectF rectF = this.f20682d;
        if (z3) {
            if (!z10) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            i4 = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f10 = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(oVarD, eVar, -fZ);
            float fB2 = B(oVarD, eVar2, -fA);
            Rect rect = this.f20681c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f20683e;
            C(view2, rectF2);
            rectF2.offset(fB, fB2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i4 = 0;
            f10 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        eVar.a(objectAnimatorOfFloat2);
        eVar2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fZ2 = z(view, view2, (b) oVarD.f28446b);
        float fA2 = A(view, view2, (b) oVarD.f28446b);
        Pair pairY2 = y(fZ2, fA2, z3, oVarD);
        e eVar3 = (e) pairY2.first;
        e eVar4 = (e) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z3) {
            fZ2 = this.g;
        }
        float[] fArr = new float[1];
        fArr[i4] = fZ2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z3) {
            fA2 = this.f20685h;
        }
        float[] fArr2 = new float[1];
        fArr2[i4] = fA2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        eVar3.a(objectAnimatorOfFloat5);
        eVar4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z3) {
                    if (!z10) {
                        jc.b.f27487a.set(viewGroup, Float.valueOf(f10));
                    }
                    jc.b bVar = jc.b.f27487a;
                    float[] fArr3 = new float[1];
                    fArr3[i4] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar, fArr3);
                } else {
                    jc.b bVar2 = jc.b.f27487a;
                    float[] fArr4 = new float[1];
                    fArr4[i4] = f10;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar2, fArr4);
                }
                ((d) oVarD.f28445a).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        wd.b.N(animatorSet, arrayList);
        animatorSet.addListener(new od.b(z3, view2, view));
        int size = arrayList2.size();
        for (int i10 = i4; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, b bVar) {
        RectF rectF = this.f20682d;
        C(view, rectF);
        rectF.offset(this.g, this.f20685h);
        RectF rectF2 = this.f20683e;
        C(view2, rectF2);
        bVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20681c = new Rect();
        this.f20682d = new RectF();
        this.f20683e = new RectF();
        this.f20684f = new int[2];
    }
}
