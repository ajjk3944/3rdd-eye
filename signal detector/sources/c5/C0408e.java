package c5;

import java.io.Serializable;

/* renamed from: c5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f5923a;

    public C0408e(Throwable th) {
        q5.i.e(th, "exception");
        this.f5923a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0408e) {
            return q5.i.a(this.f5923a, ((C0408e) obj).f5923a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5923a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f5923a + ')';
    }
}
