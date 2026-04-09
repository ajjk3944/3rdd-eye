package N;

import N.v;
import N7.C1094a9;
import java.util.List;

/* compiled from: AutoValue_SurfaceProcessorNode_In.java */
/* loaded from: classes.dex */
public final class c extends v.b {

    /* renamed from: a, reason: collision with root package name */
    public final s f4374a;

    /* renamed from: b, reason: collision with root package name */
    public final List<P.f> f4375b;

    public c(s sVar, List<P.f> list) {
        if (sVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f4374a = sVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f4375b = list;
    }

    @Override // N.v.b
    public final List<P.f> a() {
        return this.f4375b;
    }

    @Override // N.v.b
    public final s b() {
        return this.f4374a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.b)) {
            return false;
        }
        v.b bVar = (v.b) obj;
        return this.f4374a.equals(bVar.b()) && this.f4375b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f4374a.hashCode() ^ 1000003) * 1000003) ^ this.f4375b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{surfaceEdge=");
        sb.append(this.f4374a);
        sb.append(", outConfigs=");
        return C1094a9.h(sb, this.f4375b, "}");
    }
}
