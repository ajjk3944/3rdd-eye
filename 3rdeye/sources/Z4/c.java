package Z4;

import java.util.Collections;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f14014a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f14015b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f14014a = str;
        this.f14015b = map;
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
        return this.f14014a.equals(cVar.f14014a) && this.f14015b.equals(cVar.f14015b);
    }

    public final int hashCode() {
        return this.f14015b.hashCode() + (this.f14014a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f14014a + ", properties=" + this.f14015b.values() + "}";
    }
}
