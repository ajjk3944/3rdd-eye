package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class x81 extends WindowInsetsAnimation$Callback {
    public final z20 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public x81(z20 z20Var) {
        super(0);
        this.d = new HashMap();
        this.a = z20Var;
    }

    public final a91 a(WindowInsetsAnimation windowInsetsAnimation) {
        a91 a91Var = (a91) this.d.get(windowInsetsAnimation);
        if (a91Var == null) {
            a91Var = new a91(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                a91Var.a = new y81(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, a91Var);
        }
        return a91Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.a.d).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        z20 z20Var = this.a;
        View view = (View) z20Var.d;
        int[] iArr = (int[]) z20Var.e;
        view.getLocationOnScreen(iArr);
        z20Var.a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM = u0.m(list.get(size));
            a91 a91VarA = a(windowInsetsAnimationM);
            a91VarA.a.d(windowInsetsAnimationM.getFraction());
            this.c.add(a91VarA);
        }
        o91 o91VarG = o91.g(null, windowInsets);
        this.a.a(o91VarG, this.b);
        return o91VarG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        y20 y20VarC = y20.c(bounds.getLowerBound());
        y20 y20VarC2 = y20.c(bounds.getUpperBound());
        z20 z20Var = this.a;
        View view = (View) z20Var.d;
        int[] iArr = (int[]) z20Var.e;
        view.getLocationOnScreen(iArr);
        int i = z20Var.a - iArr[1];
        z20Var.b = i;
        view.setTranslationY(i);
        u0.p();
        return u0.k(y20VarC.d(), y20VarC2.d());
    }
}
