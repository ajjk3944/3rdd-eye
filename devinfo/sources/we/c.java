package we;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f36633a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f36634b;

    public c(String str, Map map) {
        this.f36633a = str;
        this.f36634b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f36633a.equals(cVar.f36633a) && this.f36634b.equals(cVar.f36634b);
    }

    public final int hashCode() {
        return this.f36634b.hashCode() + (this.f36633a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f36633a + ", properties=" + this.f36634b.values() + "}";
    }
}
