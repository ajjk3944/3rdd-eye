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
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.af0;
import defpackage.fr;
import defpackage.l92;
import defpackage.r4;
import defpackage.ve;
import defpackage.yj;
import defpackage.yt;
import defpackage.ze0;
import defpackage.zt0;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static float B(l92 l92Var, af0 af0Var, float f) {
        long j = af0Var.a;
        long j2 = af0Var.b;
        af0 af0VarD = ((ze0) l92Var.f).d("expansion");
        return r4.a(f, 0.0f, af0Var.b().getInterpolation((((af0VarD.a + af0VarD.b) + 17) - j) / j2));
    }

    public static Pair y(float f, float f2, boolean z, l92 l92Var) {
        af0 af0VarD;
        af0 af0VarD2;
        if (f == 0.0f || f2 == 0.0f) {
            af0VarD = ((ze0) l92Var.f).d("translationXLinear");
            af0VarD2 = ((ze0) l92Var.f).d("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            af0VarD = ((ze0) l92Var.f).d("translationXCurveDownwards");
            af0VarD2 = ((ze0) l92Var.f).d("translationYCurveDownwards");
        } else {
            af0VarD = ((ze0) l92Var.f).d("translationXCurveUpwards");
            af0VarD2 = ((ze0) l92Var.f).d("translationYCurveUpwards");
        }
        return new Pair(af0VarD, af0VarD2);
    }

    public final float A(View view, View view2, fr frVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        frVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void C(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract l92 D(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.vj
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

    @Override // defpackage.vj
    public final void g(yj yjVar) {
        if (yjVar.h == 0) {
            yjVar.h = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public final AnimatorSet x(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        int i;
        float f;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ObjectAnimator objectAnimatorOfFloat4;
        l92 l92VarD = D(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        ((ze0) l92VarD.f).d("elevation").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        float fZ = z(view, view2, (fr) l92VarD.g);
        float fA = A(view, view2, (fr) l92VarD.g);
        Pair pairY = y(fZ, fA, z, l92VarD);
        af0 af0Var = (af0) pairY.first;
        af0 af0Var2 = (af0) pairY.second;
        RectF rectF = this.d;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fZ);
                view2.setTranslationY(-fA);
            }
            i = 0;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            f = 0.0f;
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fB = B(l92VarD, af0Var, -fZ);
            float fB2 = B(l92VarD, af0Var2, -fA);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            RectF rectF2 = this.e;
            C(view2, rectF2);
            rectF2.offset(fB, fB2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
        } else {
            i = 0;
            f = 0.0f;
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fZ);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fA);
        }
        af0Var.a(objectAnimatorOfFloat2);
        af0Var2.a(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat3);
        rectF.width();
        rectF.height();
        float fZ2 = z(view, view2, (fr) l92VarD.g);
        float fA2 = A(view, view2, (fr) l92VarD.g);
        Pair pairY2 = y(fZ2, fA2, z, l92VarD);
        af0 af0Var3 = (af0) pairY2.first;
        af0 af0Var4 = (af0) pairY2.second;
        Property property = View.TRANSLATION_X;
        if (!z) {
            fZ2 = this.g;
        }
        float[] fArr = new float[1];
        fArr[i] = fZ2;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        if (!z) {
            fA2 = this.h;
        }
        float[] fArr2 = new float[1];
        fArr2[i] = fA2;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        af0Var3.a(objectAnimatorOfFloat5);
        af0Var4.a(objectAnimatorOfFloat6);
        arrayList.add(objectAnimatorOfFloat5);
        arrayList.add(objectAnimatorOfFloat6);
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup viewGroup = viewFindViewById != null ? viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null : (ViewGroup) view2;
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        ve.a.set(viewGroup, Float.valueOf(f));
                    }
                    ve veVar = ve.a;
                    float[] fArr3 = new float[1];
                    fArr3[i] = 1.0f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, veVar, fArr3);
                } else {
                    ve veVar2 = ve.a;
                    float[] fArr4 = new float[1];
                    fArr4[i] = f;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, veVar2, fArr4);
                }
                ((ze0) l92VarD.f).d("contentFade").a(objectAnimatorOfFloat4);
                arrayList.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        zt0.q(animatorSet, arrayList);
        animatorSet.addListener(new yt(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = i; i2 < size; i2++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final float z(View view, View view2, fr frVar) {
        RectF rectF = this.d;
        C(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        C(view2, rectF2);
        frVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
