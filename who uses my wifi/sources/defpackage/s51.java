package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class s51 implements View.OnApplyWindowInsetsListener {
    public o91 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ti0 c;

    public s51(View view, ti0 ti0Var) {
        this.b = view;
        this.c = ti0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o91 o91VarG = o91.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        ti0 ti0Var = this.c;
        if (i < 30) {
            t51.a(windowInsets, this.b);
            if (o91VarG.equals(this.a)) {
                return ti0Var.B(view, o91VarG).f();
            }
        }
        this.a = o91VarG;
        o91 o91VarB = ti0Var.B(view, o91VarG);
        if (i >= 30) {
            return o91VarB.f();
        }
        WeakHashMap weakHashMap = e61.a;
        r51.c(view);
        return o91VarB.f();
    }
}
