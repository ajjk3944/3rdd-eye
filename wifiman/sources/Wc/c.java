package Wc;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f23865a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23866b;

    public c(long j10, Object obj) {
        this.f23865a = j10;
        this.f23866b = obj;
    }

    public final long a() {
        return this.f23865a;
    }

    public final Object b() {
        return this.f23866b;
    }

    public final long c() {
        return this.f23865a;
    }

    public final Object d() {
        return this.f23866b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23865a == cVar.f23865a && AbstractC6492s.d(this.f23866b, cVar.f23866b);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f23865a) * 31;
        Object obj = this.f23866b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "TimelineItem(timestamp=" + this.f23865a + ", value=" + this.f23866b + ")";
    }

    public /* synthetic */ c(long j10, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? System.currentTimeMillis() : j10, obj);
    }
}
