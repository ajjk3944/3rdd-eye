package xf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25307a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f25308b;

    public c(String str, Map map) {
        this.f25307a = str;
        this.f25308b = map;
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
        return this.f25307a.equals(cVar.f25307a) && this.f25308b.equals(cVar.f25308b);
    }

    public final int hashCode() {
        return this.f25308b.hashCode() + (this.f25307a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f25307a + ", properties=" + this.f25308b.values() + "}";
    }
}
