package u3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f23207a;

    /* renamed from: b, reason: collision with root package name */
    public List f23208b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23209c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f23210d;

    public r0(androidx.datastore.preferences.protobuf.j jVar) {
        super(jVar.f1300a);
        this.f23210d = new HashMap();
        this.f23207a = jVar;
    }

    public final u0 a(WindowInsetsAnimation windowInsetsAnimation) {
        u0 u0Var = (u0) this.f23210d.get(windowInsetsAnimation);
        if (u0Var == null) {
            u0Var = new u0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                u0Var.f23222a = new s0(windowInsetsAnimation);
            }
            this.f23210d.put(windowInsetsAnimation, u0Var);
        }
        return u0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f23207a.d(a(windowInsetsAnimation));
        this.f23210d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f23207a.e();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f23209c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f23209c = arrayList2;
            this.f23208b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationG = q0.g(list.get(size));
            u0 u0VarA = a(windowInsetsAnimationG);
            u0VarA.f23222a.d(windowInsetsAnimationG.getFraction());
            this.f23209c.add(u0VarA);
        }
        return this.f23207a.f(h1.g(null, windowInsets), this.f23208b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        om.f fVarG = this.f23207a.g(a(windowInsetsAnimation), new om.f(bounds));
        fVarG.getClass();
        hf.z.q();
        return hf.z.k(((k3.d) fVarG.f19554d).d(), ((k3.d) fVarG.f19555g).d());
    }
}
