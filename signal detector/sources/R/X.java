package R;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import com.google.android.gms.internal.ads.C2195yo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class X extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final C2195yo f3290a;

    /* renamed from: b, reason: collision with root package name */
    public List f3291b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3292c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3293d;

    public X(C2195yo c2195yo) {
        super(0);
        this.f3293d = new HashMap();
        this.f3290a = c2195yo;
    }

    public final a0 a(WindowInsetsAnimation windowInsetsAnimation) {
        a0 a0Var = (a0) this.f3293d.get(windowInsetsAnimation);
        if (a0Var == null) {
            a0Var = new a0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                a0Var.f3300a = new Y(windowInsetsAnimation);
            }
            this.f3293d.put(windowInsetsAnimation, a0Var);
        }
        return a0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        ((View) this.f3290a.f17765d).setTranslationY(0.0f);
        this.f3293d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        C2195yo c2195yo = this.f3290a;
        View view = (View) c2195yo.f17765d;
        int[] iArr = (int[]) c2195yo.f17766e;
        view.getLocationOnScreen(iArr);
        c2195yo.f17762a = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f3292c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f3292c = arrayList2;
            this.f3291b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = N4.g.j(list.get(size));
            a0 a0VarA = a(windowInsetsAnimationJ);
            a0VarA.f3300a.d(windowInsetsAnimationJ.getFraction());
            this.f3292c.add(a0VarA);
        }
        r0 r0VarG = r0.g(null, windowInsets);
        this.f3290a.a(r0VarG, this.f3291b);
        return r0VarG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        J.c cVarC = J.c.c(bounds.getLowerBound());
        J.c cVarC2 = J.c.c(bounds.getUpperBound());
        C2195yo c2195yo = this.f3290a;
        View view = (View) c2195yo.f17765d;
        int[] iArr = (int[]) c2195yo.f17766e;
        view.getLocationOnScreen(iArr);
        int i = c2195yo.f17762a - iArr[1];
        c2195yo.f17763b = i;
        view.setTranslationY(i);
        N4.g.m();
        return N4.g.h(cVarC.d(), cVarC2.d());
    }
}
