package androidx.lifecycle;

import androidx.lifecycle.f0;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g0 {
    public static e0 a(f0.b bVar, Class modelClass) {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static e0 b(f0.b bVar, Class modelClass, k1.a extras) {
        kotlin.jvm.internal.p.e(modelClass, "modelClass");
        kotlin.jvm.internal.p.e(extras, "extras");
        return bVar.a(modelClass);
    }
}
