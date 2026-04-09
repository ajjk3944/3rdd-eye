package com.google.android.material.transformation;

import Q3.b;
import V2.h;
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
import b4.C0344i;
import com.apm.insight.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e3.AbstractC2303a;
import e3.c;
import e3.e;
import e3.f;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f18610c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f18611d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f18612e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f18613f;

    /* renamed from: g, reason: collision with root package name */
    public float f18614g;

    /* renamed from: h, reason: collision with root package name */
    public float f18615h;

    public FabTransformationBehavior() {
        this.f18610c = new Rect();
        this.f18611d = new RectF();
        this.f18612e = new RectF();
        this.f18613f = new int[2];
    }

    public static float B(h hVar, f fVar, float f2) {
        long j6 = fVar.f19936a;
        long j7 = fVar.f19937b;
        f fVarD = ((e) hVar.f3875b).d("expansion");
        return AbstractC2303a.a(f2, 0.0f, fVar.b().getInterpolation((((fVarD.f19936a + fVarD.f19937b) + 17) - j6) / j7));
    }

    public static Pair y(float f2, float f5, boolean z6, h hVar) {
        f fVarD;
        f fVarD2;
        if (f2 == 0.0f || f5 == 0.0f) {
            fVarD = ((e) hVar.f3875b).d("translationXLinear");
            fVarD2 = ((e) hVar.f3875b).d("translationYLinear");
        } else if ((!z6 || f5 >= 0.0f) && (z6 || f5 <= 0.0f)) {
            fVarD = ((e) hVar.f3875b).d("translationXCurveDownwards");
            fVarD2 = ((e) hVar.f3875b).d("translationYCurveDownwards");
        } else {
            fVarD = ((e) hVar.f3875b).d("translationXCurveUpwards");
            fVarD2 = ((e) hVar.f3875b).d("translationYCurveUpwards");
        }
        return new Pair(fVarD, fVarD2);
    }

    public final float A(View view, View view2, C0344i c0344i) {
        RectF rectF = this.f18611d;
        C(view, rectF);
        rectF.offset(this.f18614g, this.f18615h);
        RectF rectF2 = this.f18612e;
        C(view2, rectF2);
        c0344i.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f18613f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract h D(Context context, boolean z6);

    @Override // com.google.android.material.transformation.ExpandableBehavior, E.b
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

    @Override // E.b
    public final void g(E.e eVar) {
        if (eVar.f1318h == 0) {
            eVar.f1318h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z6, boolean z7) {
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        float f2;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        h hVarD = D(view2.getContext(), z6);
        if (z6) {
            this.f18614g = view.getTranslationX();
            this.f18615h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z6) {
            if (!z7) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((e) hVarD.f3875b).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, (C0344i) hVarD.f3876c);
        float fA = A(view, view2, (C0344i) hVarD.f3876c);
        Pair pairY = y(fZ, fA, z6, hVarD);
        f fVar = (f) pairY.first;
        f fVar2 = (f) pairY.second;
        RectF rectF = this.f18611d;
        if (z6) {
            if (!z7) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            i = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f2 = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(hVarD, fVar, -fZ);
            float fB2 = B(hVarD, fVar2, -fA);
            Rect rect = this.f18610c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f18612e;
            C(view2, rectF2);
            rectF2.offset(fB, fB2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f2 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        fVar.a(objectAnimatorOfFloat2);
        fVar2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fZ2 = z(view, view2, (C0344i) hVarD.f3876c);
        float fA2 = A(view, view2, (C0344i) hVarD.f3876c);
        Pair pairY2 = y(fZ2, fA2, z6, hVarD);
        f fVar3 = (f) pairY2.first;
        f fVar4 = (f) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z6) {
            fZ2 = this.f18614g;
        }
        float[] fArr = new float[1];
        fArr[i] = fZ2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z6) {
            fA2 = this.f18615h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = fA2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        fVar3.a(objectAnimatorOfFloat5);
        fVar4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z6) {
                    if (!z7) {
                        c.f19932a.set(viewGroup, Float.valueOf(f2));
                    }
                    c cVar = c.f19932a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar, fArr3);
                } else {
                    c cVar2 = c.f19932a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f2;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, cVar2, fArr4);
                }
                ((e) hVarD.f3875b).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.bumptech.glide.e.v(animatorSet, arrayList);
        animatorSet.addListener(new b(z6, view2, view));
        int size = arrayList2.size();
        for (int i3 = i; i3 < size; i3++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i3));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, C0344i c0344i) {
        RectF rectF = this.f18611d;
        C(view, rectF);
        rectF.offset(this.f18614g, this.f18615h);
        RectF rectF2 = this.f18612e;
        C(view2, rectF2);
        c0344i.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18610c = new Rect();
        this.f18611d = new RectF();
        this.f18612e = new RectF();
        this.f18613f = new int[2];
    }
}
