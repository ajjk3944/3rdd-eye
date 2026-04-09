package O;

import N.s;
import O.j;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_DualSurfaceProcessorNode_In.java */
/* loaded from: classes.dex */
public final class b extends j.b {

    /* renamed from: a, reason: collision with root package name */
    public final s f10133a;

    /* renamed from: b, reason: collision with root package name */
    public final s f10134b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f10135c;

    public b(s sVar, s sVar2, ArrayList arrayList) {
        if (sVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f10133a = sVar;
        if (sVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f10134b = sVar2;
        this.f10135c = arrayList;
    }

    @Override // O.j.b
    public final List<d> a() {
        return this.f10135c;
    }

    @Override // O.j.b
    public final s b() {
        return this.f10133a;
    }

    @Override // O.j.b
    public final s c() {
        return this.f10134b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j.b)) {
            return false;
        }
        j.b bVar = (j.b) obj;
        return this.f10133a.equals(bVar.b()) && this.f10134b.equals(bVar.c()) && this.f10135c.equals(bVar.a());
    }

    public final int hashCode() {
        return ((((this.f10133a.hashCode() ^ 1000003) * 1000003) ^ this.f10134b.hashCode()) * 1000003) ^ this.f10135c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f10133a + ", secondarySurfaceEdge=" + this.f10134b + ", outConfigs=" + this.f10135c + "}";
    }
}
