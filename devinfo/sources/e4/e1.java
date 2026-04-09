package e4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l1 f22323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f22324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f22325c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f22327e;

    public e1(l1 l1Var, c2 c2Var, c2 c2Var2, int i4, View view) {
        this.f22323a = l1Var;
        this.f22324b = c2Var;
        this.f22325c = c2Var2;
        this.f22326d = i4;
        this.f22327e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        l1 l1Var = this.f22323a;
        k1 k1Var = l1Var.f22371a;
        k1Var.e(animatedFraction);
        c2 c2Var = this.f22324b;
        z1 z1Var = c2Var.f22315a;
        float fC = k1Var.c();
        PathInterpolator pathInterpolator = g1.f22345e;
        int i4 = Build.VERSION.SDK_INT;
        r1 q1Var = i4 >= 34 ? new q1(c2Var) : i4 >= 31 ? new p1(c2Var) : i4 >= 30 ? new o1(c2Var) : i4 >= 29 ? new n1(c2Var) : new m1(c2Var);
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f22326d & i10) == 0) {
                q1Var.c(i10, z1Var.g(i10));
            } else {
                v3.b bVarG = z1Var.g(i10);
                v3.b bVarG2 = this.f22325c.f22315a.g(i10);
                float f10 = 1.0f - fC;
                q1Var.c(i10, c2.e(bVarG, (int) (((bVarG.f35793a - bVarG2.f35793a) * f10) + 0.5d), (int) (((bVarG.f35794b - bVarG2.f35794b) * f10) + 0.5d), (int) (((bVarG.f35795c - bVarG2.f35795c) * f10) + 0.5d), (int) (((bVarG.f35796d - bVarG2.f35796d) * f10) + 0.5d)));
            }
        }
        g1.h(this.f22327e, q1Var.b(), Collections.singletonList(l1Var));
    }
}
