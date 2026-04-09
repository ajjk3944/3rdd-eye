package u3;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class n0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f23193a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f23194b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h1 f23195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f23197e;

    public n0(u0 u0Var, h1 h1Var, h1 h1Var2, int i10, View view) {
        this.f23193a = u0Var;
        this.f23194b = h1Var;
        this.f23195c = h1Var2;
        this.f23196d = i10;
        this.f23197e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        u0 u0Var = this.f23193a;
        t0 t0Var = u0Var.f23222a;
        t0Var.d(animatedFraction);
        h1 h1Var = this.f23194b;
        f1 f1Var = h1Var.f23176a;
        float fB = t0Var.b();
        PathInterpolator pathInterpolator = p0.f23203e;
        int i10 = Build.VERSION.SDK_INT;
        y0 x0Var = i10 >= 30 ? new x0(h1Var) : i10 >= 29 ? new w0(h1Var) : new v0(h1Var);
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((this.f23196d & i11) == 0) {
                x0Var.c(i11, f1Var.f(i11));
            } else {
                k3.d dVarF = f1Var.f(i11);
                k3.d dVarF2 = this.f23195c.f23176a.f(i11);
                float f10 = 1.0f - fB;
                x0Var.c(i11, h1.e(dVarF, (int) (((dVarF.f14014a - dVarF2.f14014a) * f10) + 0.5d), (int) (((dVarF.f14015b - dVarF2.f14015b) * f10) + 0.5d), (int) (((dVarF.f14016c - dVarF2.f14016c) * f10) + 0.5d), (int) (((dVarF.f14017d - dVarF2.f14017d) * f10) + 0.5d)));
            }
        }
        p0.g(this.f23197e, x0Var.b(), Collections.singletonList(u0Var));
    }
}
