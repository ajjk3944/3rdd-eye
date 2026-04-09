package Q4;

import N7.C1094a9;
import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* loaded from: classes2.dex */
public final class M extends f0.e.d.a.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0140d> f11072a;

    /* renamed from: b, reason: collision with root package name */
    public final O f11073b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.a f11074c;

    /* renamed from: d, reason: collision with root package name */
    public final P f11075d;

    /* renamed from: e, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0138a> f11076e;

    public M() {
        throw null;
    }

    public M(List list, O o10, f0.a aVar, P p10, List list2) {
        this.f11072a = list;
        this.f11073b = o10;
        this.f11074c = aVar;
        this.f11075d = p10;
        this.f11076e = list2;
    }

    @Override // Q4.f0.e.d.a.b
    public final f0.a a() {
        return this.f11074c;
    }

    @Override // Q4.f0.e.d.a.b
    public final List<f0.e.d.a.b.AbstractC0138a> b() {
        return this.f11076e;
    }

    @Override // Q4.f0.e.d.a.b
    public final f0.e.d.a.b.AbstractC0139b c() {
        return this.f11073b;
    }

    @Override // Q4.f0.e.d.a.b
    public final f0.e.d.a.b.c d() {
        return this.f11075d;
    }

    @Override // Q4.f0.e.d.a.b
    public final List<f0.e.d.a.b.AbstractC0140d> e() {
        return this.f11072a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b)) {
            return false;
        }
        f0.e.d.a.b bVar = (f0.e.d.a.b) obj;
        List<f0.e.d.a.b.AbstractC0140d> list = this.f11072a;
        if (list == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!list.equals(bVar.e())) {
            return false;
        }
        O o10 = this.f11073b;
        if (o10 == null) {
            if (bVar.c() != null) {
                return false;
            }
        } else if (!o10.equals(bVar.c())) {
            return false;
        }
        f0.a aVar = this.f11074c;
        if (aVar == null) {
            if (bVar.a() != null) {
                return false;
            }
        } else if (!aVar.equals(bVar.a())) {
            return false;
        }
        return this.f11075d.equals(bVar.d()) && this.f11076e.equals(bVar.b());
    }

    public final int hashCode() {
        List<f0.e.d.a.b.AbstractC0140d> list = this.f11072a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        O o10 = this.f11073b;
        int iHashCode2 = (iHashCode ^ (o10 == null ? 0 : o10.hashCode())) * 1000003;
        f0.a aVar = this.f11074c;
        return (((((aVar != null ? aVar.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f11075d.hashCode()) * 1000003) ^ this.f11076e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.f11072a);
        sb.append(", exception=");
        sb.append(this.f11073b);
        sb.append(", appExitInfo=");
        sb.append(this.f11074c);
        sb.append(", signal=");
        sb.append(this.f11075d);
        sb.append(", binaries=");
        return C1094a9.h(sb, this.f11076e, "}");
    }
}
