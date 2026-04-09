package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import j4.f;
import java.util.ArrayList;
import java.util.List;
import k4.h;
import k4.i;
import k4.j;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f11500c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f11501d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f11502e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f11503f;

    /* renamed from: g, reason: collision with root package name */
    public float f11504g;

    /* renamed from: h, reason: collision with root package name */
    public float f11505h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f11506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f11507b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f11508c;

        public a(boolean z10, View view, View view2) {
            this.f11506a = z10;
            this.f11507b = view;
            this.f11508c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f11506a) {
                return;
            }
            this.f11507b.setVisibility(4);
            this.f11508c.setAlpha(1.0f);
            this.f11508c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f11506a) {
                this.f11507b.setVisibility(0);
                this.f11508c.setAlpha(0.0f);
                this.f11508c.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f11510a;

        public b(View view) {
            this.f11510a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11510a.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f11512a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Drawable f11513b;

        public c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f11512a = cVar;
            this.f11513b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11512a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f11512a.setCircularRevealOverlayDrawable(this.f11513b);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.circularreveal.c f11515a;

        public d(com.google.android.material.circularreveal.c cVar) {
            this.f11515a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f11515a.getRevealInfo();
            revealInfo.f10283c = Float.MAX_VALUE;
            this.f11515a.setRevealInfo(revealInfo);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public h f11517a;

        /* renamed from: b, reason: collision with root package name */
        public j f11518b;
    }

    public FabTransformationBehavior() {
        this.f11500c = new Rect();
        this.f11501d = new RectF();
        this.f11502e = new RectF();
        this.f11503f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        e eVarI0 = i0(view2.getContext(), z10);
        if (z10) {
            this.f11504g = view.getTranslationX();
            this.f11505h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        RectF rectF = this.f11501d;
        g0(view, view2, z10, z11, eVarI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z10, eVarI0, arrayList);
        d0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        c0(view, view2, z10, z11, eVarI0, fWidth, fHeight, arrayList, arrayList2);
        Z(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        Y(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        k4.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    public final ViewGroup O(View view) {
        View viewFindViewById = view.findViewById(f.mtrl_child_content_container);
        return viewFindViewById != null ? j0(viewFindViewById) : ((view instanceof m5.b) || (view instanceof m5.a)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    public final void P(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fW = W(eVar, iVar, f10, f12);
        float fW2 = W(eVar, iVar2, f11, f13);
        Rect rect = this.f11500c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f11501d;
        rectF2.set(rect);
        RectF rectF3 = this.f11502e;
        X(view, rectF3);
        rectF3.offset(fW, fW2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void Q(View view, RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f11504g, this.f11505h);
    }

    public final Pair R(float f10, float f11, boolean z10, e eVar) {
        i iVarH;
        i iVarH2;
        if (f10 == 0.0f || f11 == 0.0f) {
            iVarH = eVar.f11517a.h("translationXLinear");
            iVarH2 = eVar.f11517a.h("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            iVarH = eVar.f11517a.h("translationXCurveDownwards");
            iVarH2 = eVar.f11517a.h("translationYCurveDownwards");
        } else {
            iVarH = eVar.f11517a.h("translationXCurveUpwards");
            iVarH2 = eVar.f11517a.h("translationYCurveUpwards");
        }
        return new Pair(iVarH, iVarH2);
    }

    public final float S(View view, View view2, j jVar) {
        RectF rectF = this.f11501d;
        RectF rectF2 = this.f11502e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float T(View view, View view2, j jVar) {
        RectF rectF = this.f11501d;
        RectF rectF2 = this.f11502e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    public final float U(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f11501d;
        RectF rectF2 = this.f11502e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f21853a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + jVar.f21854b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + jVar.f21854b;
    }

    public final float V(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f11501d;
        RectF rectF2 = this.f11502e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = jVar.f21853a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + jVar.f21855c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + jVar.f21855c;
    }

    public final float W(e eVar, i iVar, float f10, float f11) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarH = eVar.f11517a.h("expansion");
        return k4.a.a(f10, f11, iVar.e().getInterpolation((((iVarH.c() + iVarH.d()) + 17) - jC) / jD));
    }

    public final void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f11503f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void Y(View view, View view2, boolean z10, boolean z11, e eVar, List list, List list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupO = O(view2)) != null) {
            if (z10) {
                if (!z11) {
                    k4.d.f21840a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, (Property<ViewGroup, Float>) k4.d.f21840a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, (Property<ViewGroup, Float>) k4.d.f21840a, 0.0f);
            }
            eVar.f11517a.h("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(View view, View view2, boolean z10, boolean z11, e eVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int iH0 = h0(view);
            int i10 = 16777215 & iH0;
            if (z10) {
                if (!z11) {
                    cVar.setCircularRevealScrimColor(iH0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, (Property<com.google.android.material.circularreveal.c, Integer>) c.d.f10280a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, (Property<com.google.android.material.circularreveal.c, Integer>) c.d.f10280a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(k4.c.b());
            eVar.f11517a.h(TtmlNode.ATTR_TTS_COLOR).a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    public final void a0(View view, View view2, boolean z10, e eVar, List list) {
        float fU = U(view, view2, eVar.f11518b);
        float fV = V(view, view2, eVar.f11518b);
        Pair pairR = R(fU, fV, z10, eVar);
        i iVar = (i) pairR.first;
        i iVar2 = (i) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fU = this.f11504g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fU);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fV = this.f11505h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final void b0(View view, View view2, boolean z10, boolean z11, e eVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        eVar.f11517a.h("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List list, List list2) {
        Animator animatorA;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float fS = S(view, view2, eVar.f11518b);
            float fT = T(view, view2, eVar.f11518b);
            ((FloatingActionButton) view).h(this.f11500c);
            float fWidth = this.f11500c.width() / 2.0f;
            i iVarH = eVar.f11517a.h("expansion");
            if (z10) {
                if (!z11) {
                    cVar.setRevealInfo(new c.e(fS, fT, fWidth));
                }
                if (z11) {
                    fWidth = cVar.getRevealInfo().f10283c;
                }
                animatorA = com.google.android.material.circularreveal.a.a(cVar, fS, fT, a5.a.c(fS, fT, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(cVar));
                f0(view2, iVarH.c(), (int) fS, (int) fT, fWidth, list);
            } else {
                float f12 = cVar.getRevealInfo().f10283c;
                Animator animatorA2 = com.google.android.material.circularreveal.a.a(cVar, fS, fT, fWidth);
                int i10 = (int) fS;
                int i11 = (int) fT;
                f0(view2, iVarH.c(), i10, i11, f12, list);
                e0(view2, iVarH.c(), iVarH.d(), eVar.f11517a.i(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            iVarH.a(animatorA);
            list.add(animatorA);
            list2.add(com.google.android.material.circularreveal.a.b(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(View view, View view2, boolean z10, boolean z11, e eVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, (Property<Drawable, Integer>) k4.e.f21841a, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, (Property<Drawable, Integer>) k4.e.f21841a, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f11517a.h("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(cVar, drawable));
        }
    }

    public final void e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void f0(View view, long j10, int i10, int i11, float f10, List list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    public final void g0(View view, View view2, boolean z10, boolean z11, e eVar, List list, List list2, RectF rectF) {
        i iVar;
        i iVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fU = U(view, view2, eVar.f11518b);
        float fV = V(view, view2, eVar.f11518b);
        Pair pairR = R(fU, fV, z10, eVar);
        i iVar3 = (i) pairR.first;
        i iVar4 = (i) pairR.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            iVar = iVar4;
            iVar2 = iVar3;
            P(view2, eVar, iVar2, iVar, -fU, -fV, 0.0f, 0.0f, rectF);
        } else {
            iVar = iVar4;
            iVar2 = iVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        iVar2.a(objectAnimatorOfFloat);
        iVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final int h0(View view) {
        ColorStateList backgroundTintList = view.getBackgroundTintList();
        if (backgroundTintList != null) {
            return backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public abstract e i0(Context context, boolean z10);

    public final ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.e eVar) {
        if (eVar.f2339h == 0) {
            eVar.f2339h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11500c = new Rect();
        this.f11501d = new RectF();
        this.f11502e = new RectF();
        this.f11503f = new int[2];
    }
}
