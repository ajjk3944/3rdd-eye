package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class u81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a91 a;
    public final /* synthetic */ o91 b;
    public final /* synthetic */ o91 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public u81(a91 a91Var, o91 o91Var, o91 o91Var2, int i, View view) {
        this.a = a91Var;
        this.b = o91Var;
        this.c = o91Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        a91 a91Var = this.a;
        z81 z81Var = a91Var.a;
        z81Var.d(animatedFraction);
        o91 o91Var = this.b;
        l91 l91Var = o91Var.a;
        float fB = z81Var.b();
        PathInterpolator pathInterpolator = w81.e;
        int i = Build.VERSION.SDK_INT;
        f91 e91Var = i >= 30 ? new e91(o91Var) : i >= 29 ? new d91(o91Var) : new c91(o91Var);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.d & i2) == 0) {
                e91Var.c(i2, l91Var.f(i2));
            } else {
                y20 y20VarF = l91Var.f(i2);
                y20 y20VarF2 = this.c.a.f(i2);
                float f = 1.0f - fB;
                e91Var.c(i2, o91.e(y20VarF, (int) (((y20VarF.a - y20VarF2.a) * f) + 0.5d), (int) (((y20VarF.b - y20VarF2.b) * f) + 0.5d), (int) (((y20VarF.c - y20VarF2.c) * f) + 0.5d), (int) (((y20VarF.d - y20VarF2.d) * f) + 0.5d)));
            }
        }
        w81.g(this.e, e91Var.b(), Collections.singletonList(a91Var));
    }
}
