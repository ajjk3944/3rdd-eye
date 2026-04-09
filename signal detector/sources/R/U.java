package R;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class U implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f3279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f3280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f3281c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f3283e;

    public U(a0 a0Var, r0 r0Var, r0 r0Var2, int i, View view) {
        this.f3279a = a0Var;
        this.f3280b = r0Var;
        this.f3281c = r0Var2;
        this.f3282d = i;
        this.f3283e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a0 a0Var = this.f3279a;
        a0Var.f3300a.d(animatedFraction);
        r0 r0Var = this.f3280b;
        o0 o0Var = r0Var.f3359a;
        float fB = a0Var.f3300a.b();
        PathInterpolator pathInterpolator = W.f3286e;
        int i = Build.VERSION.SDK_INT;
        f0 e0Var = i >= 34 ? new e0(r0Var) : i >= 30 ? new d0(r0Var) : i >= 29 ? new c0(r0Var) : new b0(r0Var);
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((this.f3282d & i3) == 0) {
                e0Var.c(i3, o0Var.f(i3));
            } else {
                J.c cVarF = o0Var.f(i3);
                J.c cVarF2 = this.f3281c.f3359a.f(i3);
                float f2 = 1.0f - fB;
                e0Var.c(i3, r0.e(cVarF, (int) (((cVarF.f2007a - cVarF2.f2007a) * f2) + 0.5d), (int) (((cVarF.f2008b - cVarF2.f2008b) * f2) + 0.5d), (int) (((cVarF.f2009c - cVarF2.f2009c) * f2) + 0.5d), (int) (((cVarF.f2010d - cVarF2.f2010d) * f2) + 0.5d)));
            }
        }
        W.g(this.f3283e, e0Var.b(), Collections.singletonList(a0Var));
    }
}
