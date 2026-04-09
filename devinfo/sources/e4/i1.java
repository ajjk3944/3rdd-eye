package e4;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f22357a;

    /* renamed from: b, reason: collision with root package name */
    public List f22358b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f22359c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f22360d;

    public i1(androidx.datastore.preferences.protobuf.j jVar) {
        super(jVar.f995a);
        this.f22360d = new HashMap();
        this.f22357a = jVar;
    }

    public final l1 a(WindowInsetsAnimation windowInsetsAnimation) {
        l1 l1Var = (l1) this.f22360d.get(windowInsetsAnimation);
        if (l1Var == null) {
            l1Var = new l1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                l1Var.f22371a = new j1(windowInsetsAnimation);
            }
            this.f22360d.put(windowInsetsAnimation, l1Var);
        }
        return l1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f22357a.d(a(windowInsetsAnimation));
        this.f22360d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f22357a.e(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f22359c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f22359c = arrayList2;
            this.f22358b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            l1 l1VarA = a(windowInsetsAnimation);
            l1VarA.f22371a.e(windowInsetsAnimation.getFraction());
            this.f22359c.add(l1VarA);
        }
        return this.f22357a.f(c2.h(null, windowInsets), this.f22358b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        yb.i iVarG = this.f22357a.g(a(windowInsetsAnimation), new yb.i(bounds));
        iVarG.getClass();
        h1.c();
        return h1.a(((v3.b) iVarG.f37516b).e(), ((v3.b) iVarG.f37517c).e());
    }
}
