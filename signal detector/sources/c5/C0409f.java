package c5;

import java.io.Serializable;

/* renamed from: c5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5924a;

    public static final Throwable a(Object obj) {
        if (obj instanceof C0408e) {
            return ((C0408e) obj).f5923a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0409f) {
            return q5.i.a(this.f5924a, ((C0409f) obj).f5924a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5924a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f5924a;
        if (obj instanceof C0408e) {
            return ((C0408e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
