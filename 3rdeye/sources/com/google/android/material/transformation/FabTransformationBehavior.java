package com.google.android.material.transformation;

import L3.g;
import L3.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import t4.C5606d;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f23204c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f23205d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f23206e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f23207f;

    /* renamed from: g, reason: collision with root package name */
    public float f23208g;

    /* renamed from: h, reason: collision with root package name */
    public float f23209h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f23210a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f23211b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f23212c;

        public a(boolean z10, View view, View view2) {
            this.f23210a = z10;
            this.f23211b = view;
            this.f23212c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f23210a) {
                return;
            }
            this.f23211b.setVisibility(4);
            View view = this.f23212c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f23210a) {
                this.f23211b.setVisibility(0);
                View view = this.f23212c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public g f23213a;

        /* renamed from: b, reason: collision with root package name */
        public C5606d f23214b;
    }

    public FabTransformationBehavior() {
        this.f23204c = new Rect();
        this.f23205d = new RectF();
        this.f23206e = new RectF();
        this.f23207f = new int[2];
    }

    public static Pair u(float f10, float f11, boolean z10, b bVar) {
        h hVarD;
        h hVarD2;
        if (f10 == 0.0f || f11 == 0.0f) {
            hVarD = bVar.f23213a.d("translationXLinear");
            hVarD2 = bVar.f23213a.d("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            hVarD = bVar.f23213a.d("translationXCurveDownwards");
            hVarD2 = bVar.f23213a.d("translationYCurveDownwards");
        } else {
            hVarD = bVar.f23213a.d("translationXCurveUpwards");
            hVarD2 = bVar.f23213a.d("translationYCurveUpwards");
        }
        return new Pair(hVarD, hVarD2);
    }

    public static float x(b bVar, h hVar, float f10) {
        long j4 = hVar.f4048a;
        h hVarD = bVar.f23213a.d("expansion");
        return L3.a.a(f10, 0.0f, hVar.b().getInterpolation((((hVarD.f4048a + hVarD.f4049b) + 17) - j4) / hVar.f4049b));
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f15475h == 0) {
            fVar.f15475h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet t(android.view.View r25, android.view.View r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, C5606d c5606d) {
        RectF rectF = this.f23205d;
        RectF rectF2 = this.f23206e;
        y(view, rectF);
        rectF.offset(this.f23208g, this.f23209h);
        y(view2, rectF2);
        c5606d.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, C5606d c5606d) {
        RectF rectF = this.f23205d;
        RectF rectF2 = this.f23206e;
        y(view, rectF);
        rectF.offset(this.f23208g, this.f23209h);
        y(view2, rectF2);
        c5606d.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f23207f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23204c = new Rect();
        this.f23205d = new RectF();
        this.f23206e = new RectF();
        this.f23207f = new int[2];
    }
}
