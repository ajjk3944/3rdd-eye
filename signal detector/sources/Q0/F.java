package q0;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F extends J {

    /* renamed from: m, reason: collision with root package name */
    public final Class f22923m;

    public F(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.f22923m = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // q0.J
    public final Object a(String str, Bundle bundle) {
        q5.i.e(str, "key");
        return (Parcelable[]) bundle.get(str);
    }

    @Override // q0.J
    public final String b() {
        return this.f22923m.getName();
    }

    @Override // q0.J
    public final Object c(String str) {
        q5.i.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // q0.J
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        q5.i.e(str, "key");
        this.f22923m.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !F.class.equals(obj.getClass())) {
            return false;
        }
        return q5.i.a(this.f22923m, ((F) obj).f22923m);
    }

    public final int hashCode() {
        return this.f22923m.hashCode();
    }
}
