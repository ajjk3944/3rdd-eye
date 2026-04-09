package jj;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f50905a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f50906b;

    public d(int i10, Object obj) {
        this.f50905a = i10;
        this.f50906b = obj;
    }

    public final int a() {
        return this.f50905a;
    }

    public final Object b() {
        return this.f50906b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f50905a == dVar.f50905a && AbstractC6492s.d(this.f50906b, dVar.f50906b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f50905a) * 31;
        Object obj = this.f50906b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ItemPosition(index=" + this.f50905a + ", key=" + this.f50906b + ')';
    }
}
