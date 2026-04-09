package q0;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class H extends J {

    /* renamed from: m, reason: collision with root package name */
    public final Class f22925m;

    public H(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.f22925m = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // q0.J
    public final Object a(String str, Bundle bundle) {
        q5.i.e(str, "key");
        return (Serializable[]) bundle.get(str);
    }

    @Override // q0.J
    public final String b() {
        return this.f22925m.getName();
    }

    @Override // q0.J
    public final Object c(String str) {
        q5.i.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // q0.J
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r42 = (Serializable[]) obj;
        q5.i.e(str, "key");
        this.f22925m.cast(r42);
        bundle.putSerializable(str, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !H.class.equals(obj.getClass())) {
            return false;
        }
        return q5.i.a(this.f22925m, ((H) obj).f22925m);
    }

    public final int hashCode() {
        return this.f22925m.hashCode();
    }
}
