package Yg;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class y implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25028a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25029b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f25030c;

    public y(Object obj, Object obj2, Object obj3) {
        this.f25028a = obj;
        this.f25029b = obj2;
        this.f25030c = obj3;
    }

    public static /* synthetic */ y h(y yVar, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = yVar.f25028a;
        }
        if ((i10 & 2) != 0) {
            obj2 = yVar.f25029b;
        }
        if ((i10 & 4) != 0) {
            obj3 = yVar.f25030c;
        }
        return yVar.g(obj, obj2, obj3);
    }

    public final Object a() {
        return this.f25028a;
    }

    public final Object c() {
        return this.f25029b;
    }

    public final Object d() {
        return this.f25030c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return AbstractC6492s.d(this.f25028a, yVar.f25028a) && AbstractC6492s.d(this.f25029b, yVar.f25029b) && AbstractC6492s.d(this.f25030c, yVar.f25030c);
    }

    public final y g(Object obj, Object obj2, Object obj3) {
        return new y(obj, obj2, obj3);
    }

    public int hashCode() {
        Object obj = this.f25028a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f25029b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f25030c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final Object j() {
        return this.f25028a;
    }

    public final Object l() {
        return this.f25029b;
    }

    public final Object m() {
        return this.f25030c;
    }

    public String toString() {
        return '(' + this.f25028a + ", " + this.f25029b + ", " + this.f25030c + ')';
    }
}
