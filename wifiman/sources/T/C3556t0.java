package T;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: T.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3556t0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f21253a;

    public C3556t0(String str) {
        this.f21253a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3556t0) && AbstractC6492s.d(this.f21253a, ((C3556t0) obj).f21253a);
    }

    public int hashCode() {
        return this.f21253a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f21253a + ')';
    }
}
