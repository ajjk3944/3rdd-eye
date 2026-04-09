package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v81 implements View.OnApplyWindowInsetsListener {
    public final z20 a;
    public o91 b;

    public v81(View view, z20 z20Var) {
        o91 o91VarB;
        this.a = z20Var;
        WeakHashMap weakHashMap = e61.a;
        o91 o91VarA = u51.a(view);
        if (o91VarA != null) {
            int i = Build.VERSION.SDK_INT;
            o91VarB = (i >= 30 ? new e91(o91VarA) : i >= 29 ? new d91(o91VarA) : new c91(o91VarA)).b();
        } else {
            o91VarB = null;
        }
        this.b = o91VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.b = o91.g(view, windowInsets);
            return w81.i(view, windowInsets);
        }
        o91 o91VarG = o91.g(view, windowInsets);
        l91 l91Var = o91VarG.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = e61.a;
            this.b = u51.a(view);
        }
        if (this.b == null) {
            this.b = o91VarG;
            return w81.i(view, windowInsets);
        }
        z20 z20VarJ = w81.j(view);
        if (z20VarJ != null && Objects.equals((WindowInsets) z20VarJ.c, windowInsets)) {
            return w81.i(view, windowInsets);
        }
        o91 o91Var = this.b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!l91Var.f(i2).equals(o91Var.a.f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return w81.i(view, windowInsets);
        }
        o91 o91Var2 = this.b;
        a91 a91Var = new a91(i, (i & 8) != 0 ? l91Var.f(8).d > o91Var2.a.f(8).d ? w81.e : w81.f : w81.g, 160L);
        a91Var.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(a91Var.a.a());
        y20 y20VarF = l91Var.f(i);
        y20 y20VarF2 = o91Var2.a.f(i);
        int iMin = Math.min(y20VarF.a, y20VarF2.a);
        int i3 = y20VarF.b;
        int i4 = y20VarF2.b;
        int iMin2 = Math.min(i3, i4);
        int i5 = y20VarF.c;
        int i6 = y20VarF2.c;
        int iMin3 = Math.min(i5, i6);
        int i7 = y20VarF.d;
        int i8 = i;
        int i9 = y20VarF2.d;
        vq2 vq2Var = new vq2(y20.b(iMin, iMin2, iMin3, Math.min(i7, i9)), y20.b(Math.max(y20VarF.a, y20VarF2.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)), 15);
        w81.f(view, windowInsets, false);
        duration.addUpdateListener(new u81(a91Var, o91VarG, o91Var2, i8, view));
        duration.addListener(new s21(a91Var, view, 2));
        lj0.a(view, new gi(view, a91Var, vq2Var, duration));
        this.b = o91VarG;
        return w81.i(view, windowInsets);
    }
}
