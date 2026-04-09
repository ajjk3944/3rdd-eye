package c5;

import java.io.Serializable;

/* renamed from: c5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0407d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5921a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5922b;

    public C0407d(Object obj, Object obj2) {
        this.f5921a = obj;
        this.f5922b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0407d)) {
            return false;
        }
        C0407d c0407d = (C0407d) obj;
        return q5.i.a(this.f5921a, c0407d.f5921a) && q5.i.a(this.f5922b, c0407d.f5922b);
    }

    public final int hashCode() {
        Object obj = this.f5921a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5922b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5921a + ", " + this.f5922b + ')';
    }
}
