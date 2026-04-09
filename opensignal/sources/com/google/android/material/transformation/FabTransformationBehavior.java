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
import ed.f;
import fd.a;
import fd.d;
import fd.e;
import i4.b;
import java.util.ArrayList;
import sm.m;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f5799c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f5800d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f5801e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f5802f;

    /* renamed from: g, reason: collision with root package name */
    public float f5803g;

    /* renamed from: h, reason: collision with root package name */
    public float f5804h;

    public FabTransformationBehavior() {
        this.f5799c = new Rect();
        this.f5800d = new RectF();
        this.f5801e = new RectF();
        this.f5802f = new int[2];
    }

    public static Pair u(float f10, float f11, boolean z10, b bVar) {
        e eVarD;
        e eVarD2;
        if (f10 == 0.0f || f11 == 0.0f) {
            eVarD = ((d) bVar.f11196a).d("translationXLinear");
            eVarD2 = ((d) bVar.f11196a).d("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            eVarD = ((d) bVar.f11196a).d("translationXCurveDownwards");
            eVarD2 = ((d) bVar.f11196a).d("translationYCurveDownwards");
        } else {
            eVarD = ((d) bVar.f11196a).d("translationXCurveUpwards");
            eVarD2 = ((d) bVar.f11196a).d("translationYCurveUpwards");
        }
        return new Pair(eVarD, eVarD2);
    }

    public static float x(b bVar, e eVar, float f10) {
        long j = eVar.f8831a;
        long j7 = eVar.f8832b;
        e eVarD = ((d) bVar.f11196a).d("expansion");
        return a.a(f10, 0.0f, eVar.b().getInterpolation((((eVarD.f8831a + eVarD.f8832b) + 17) - j) / j7));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, e3.b
    public final boolean b(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // e3.b
    public final void c(e3.e eVar) {
        if (eVar.f7778h == 0) {
            eVar.f7778h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        int i10;
        float f10;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        b bVarZ = z(view2.getContext(), z10);
        if (z10) {
            this.f5803g = view.getTranslationX();
            this.f5804h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((d) bVarZ.f11196a).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fV = v(view, view2, (m) bVarZ.f11197d);
        float fW = w(view, view2, (m) bVarZ.f11197d);
        Pair pairU = u(fV, fW, z10, bVarZ);
        e eVar = (e) pairU.first;
        e eVar2 = (e) pairU.second;
        RectF rectF = this.f5800d;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fV);
                view2.setTranslationY(-fW);
            }
            i10 = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f10 = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fX = x(bVarZ, eVar, -fV);
            float fX2 = x(bVarZ, eVar2, -fW);
            Rect rect = this.f5799c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.f5801e;
            y(view2, rectF2);
            rectF2.offset(fX, fX2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i10 = 0;
            f10 = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fV);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fW);
        }
        eVar.a(objectAnimatorOfFloat2);
        eVar2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fV2 = v(view, view2, (m) bVarZ.f11197d);
        float fW2 = w(view, view2, (m) bVarZ.f11197d);
        Pair pairU2 = u(fV2, fW2, z10, bVarZ);
        e eVar3 = (e) pairU2.first;
        e eVar4 = (e) pairU2.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fV2 = this.f5803g;
        }
        float[] fArr = new float[1];
        fArr[i10] = fV2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fW2 = this.f5804h;
        }
        float[] fArr2 = new float[1];
        fArr2[i10] = fW2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        eVar3.a(objectAnimatorOfFloat5);
        eVar4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(f.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z10) {
                    if (!z11) {
                        fd.b.f8827a.set(viewGroup, Float.valueOf(f10));
                    }
                    fd.b bVar = fd.b.f8827a;
                    float[] fArr3 = new float[1];
                    fArr3[i10] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar, fArr3);
                } else {
                    fd.b bVar2 = fd.b.f8827a;
                    float[] fArr4 = new float[1];
                    fArr4[i10] = f10;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, bVar2, fArr4);
                }
                ((d) bVarZ.f11196a).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        vc.e.E(animatorSet, arrayList);
        animatorSet.addListener(new com.staircase3.opensignal.utils.b(z10, view2, view, 1));
        int size = arrayList2.size();
        for (int i11 = i10; i11 < size; i11++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i11));
        }
        return animatorSet;
    }

    public final float v(View view, View view2, m mVar) {
        RectF rectF = this.f5800d;
        y(view, rectF);
        rectF.offset(this.f5803g, this.f5804h);
        RectF rectF2 = this.f5801e;
        y(view2, rectF2);
        mVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, m mVar) {
        RectF rectF = this.f5800d;
        y(view, rectF);
        rectF.offset(this.f5803g, this.f5804h);
        RectF rectF2 = this.f5801e;
        y(view2, rectF2);
        mVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f5802f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5799c = new Rect();
        this.f5800d = new RectF();
        this.f5801e = new RectF();
        this.f5802f = new int[2];
    }
}
