package k1;

import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class b implements f0.b {

    /* renamed from: a, reason: collision with root package name */
    public final f[] f21801a;

    public b(f... initializers) {
        p.e(initializers, "initializers");
        this.f21801a = initializers;
    }

    @Override // androidx.lifecycle.f0.b
    public /* synthetic */ e0 a(Class cls) {
        return g0.a(this, cls);
    }

    @Override // androidx.lifecycle.f0.b
    public e0 b(Class modelClass, a extras) {
        p.e(modelClass, "modelClass");
        p.e(extras, "extras");
        e0 e0Var = null;
        for (f fVar : this.f21801a) {
            if (p.a(fVar.a(), modelClass)) {
                Object objInvoke = fVar.b().invoke(extras);
                e0Var = objInvoke instanceof e0 ? (e0) objInvoke : null;
            }
        }
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
