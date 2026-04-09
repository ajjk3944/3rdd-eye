package Z;

import N7.C1094a9;
import Z.j;

/* compiled from: AutoValue_AudioStream_PacketInfo.java */
/* loaded from: classes.dex */
public final class m extends j.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f13954a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13955b;

    public m(int i, long j4) {
        this.f13954a = i;
        this.f13955b = j4;
    }

    @Override // Z.j.b
    public final int a() {
        return this.f13954a;
    }

    @Override // Z.j.b
    public final long b() {
        return this.f13955b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j.b)) {
            return false;
        }
        j.b bVar = (j.b) obj;
        return this.f13954a == bVar.a() && this.f13955b == bVar.b();
    }

    public final int hashCode() {
        int i = (this.f13954a ^ 1000003) * 1000003;
        long j4 = this.f13955b;
        return i ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PacketInfo{sizeInBytes=");
        sb.append(this.f13954a);
        sb.append(", timestampNs=");
        return C1094a9.f(sb, this.f13955b, "}");
    }
}
