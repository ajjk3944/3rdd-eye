package nf;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final s9.d f54654a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f54655b;

    public f(s9.d dVar, s9.d dVar2) {
        this.f54654a = dVar;
        this.f54655b = dVar2;
    }

    public final s9.d a() {
        return this.f54655b;
    }

    public final s9.d b() {
        return this.f54654a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return AbstractC6492s.d(this.f54654a, fVar.f54654a) && AbstractC6492s.d(this.f54655b, fVar.f54655b);
    }

    public int hashCode() {
        s9.d dVar = this.f54654a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        s9.d dVar2 = this.f54655b;
        return iHashCode + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public String toString() {
        return "ServerInfo(title=" + this.f54654a + ", subtitle=" + this.f54655b + ")";
    }

    public /* synthetic */ f(s9.d dVar, s9.d dVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : dVar, (i10 & 2) != 0 ? null : dVar2);
    }
}
