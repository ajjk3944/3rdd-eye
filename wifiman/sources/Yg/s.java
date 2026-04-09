package Yg;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class s implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25015a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25016b;

    public s(Object obj, Object obj2) {
        this.f25015a = obj;
        this.f25016b = obj2;
    }

    public static /* synthetic */ s g(s sVar, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = sVar.f25015a;
        }
        if ((i10 & 2) != 0) {
            obj2 = sVar.f25016b;
        }
        return sVar.d(obj, obj2);
    }

    public final Object a() {
        return this.f25015a;
    }

    public final Object c() {
        return this.f25016b;
    }

    public final s d(Object obj, Object obj2) {
        return new s(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return AbstractC6492s.d(this.f25015a, sVar.f25015a) && AbstractC6492s.d(this.f25016b, sVar.f25016b);
    }

    public final Object h() {
        return this.f25015a;
    }

    public int hashCode() {
        Object obj = this.f25015a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f25016b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final Object j() {
        return this.f25016b;
    }

    public String toString() {
        return '(' + this.f25015a + ", " + this.f25016b + ')';
    }
}
