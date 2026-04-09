package km;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z0 implements GenericArrayType {

    /* renamed from: a, reason: collision with root package name */
    public final Type f28526a;

    public z0(Type type) {
        this.f28526a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && c1.e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f28526a;
    }

    public final int hashCode() {
        return this.f28526a.hashCode();
    }

    public final String toString() {
        return c1.r(this.f28526a) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
