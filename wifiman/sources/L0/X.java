package L0;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    private final String f11112a;

    public X(String str) {
        this.f11112a = str;
    }

    public final String a() {
        return this.f11112a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X) && AbstractC6492s.d(this.f11112a, ((X) obj).f11112a);
    }

    public int hashCode() {
        return this.f11112a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.f11112a + ')';
    }
}
