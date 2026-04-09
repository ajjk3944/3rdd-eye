package q0;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes.dex */
public class I extends J {

    /* renamed from: m, reason: collision with root package name */
    public final Class f22926m;

    public I(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (!cls.isEnum()) {
            this.f22926m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // q0.J
    public final Object a(String str, Bundle bundle) {
        q5.i.e(str, "key");
        return (Serializable) bundle.get(str);
    }

    @Override // q0.J
    public String b() {
        return this.f22926m.getName();
    }

    @Override // q0.J
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        q5.i.e(str, "key");
        q5.i.e(serializable, "value");
        this.f22926m.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        return q5.i.a(this.f22926m, ((I) obj).f22926m);
    }

    @Override // q0.J
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Serializable c(String str) {
        q5.i.e(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f22926m.hashCode();
    }

    public I(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f22926m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
