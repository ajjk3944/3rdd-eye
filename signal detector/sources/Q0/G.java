package q0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class G extends J {

    /* renamed from: m, reason: collision with root package name */
    public final Class f22924m;

    public G(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.f22924m = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // q0.J
    public final Object a(String str, Bundle bundle) {
        q5.i.e(str, "key");
        return bundle.get(str);
    }

    @Override // q0.J
    public final String b() {
        return this.f22924m.getName();
    }

    @Override // q0.J
    public final Object c(String str) {
        q5.i.e(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // q0.J
    public final void e(Bundle bundle, String str, Object obj) {
        q5.i.e(str, "key");
        this.f22924m.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !G.class.equals(obj.getClass())) {
            return false;
        }
        return q5.i.a(this.f22924m, ((G) obj).f22924m);
    }

    public final int hashCode() {
        return this.f22924m.hashCode();
    }
}
