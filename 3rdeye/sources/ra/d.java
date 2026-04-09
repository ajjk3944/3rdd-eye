package ra;

import java.io.Serializable;
import ma.q;

/* compiled from: ZoneOffsetTransition.java */
/* loaded from: classes3.dex */
public final class d implements Comparable<d>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final ma.f f45848b;

    /* renamed from: c, reason: collision with root package name */
    public final q f45849c;

    /* renamed from: d, reason: collision with root package name */
    public final q f45850d;

    public d(ma.f fVar, q qVar, q qVar2) {
        this.f45848b = fVar;
        this.f45849c = qVar;
        this.f45850d = qVar2;
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        d dVar2 = dVar;
        q qVar = this.f45849c;
        return ma.d.m0(this.f45848b.m0(qVar), r1.o0().f44113e).compareTo(ma.d.m0(dVar2.f45848b.m0(dVar2.f45849c), r1.o0().f44113e));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f45848b.equals(dVar.f45848b) && this.f45849c.equals(dVar.f45849c) && this.f45850d.equals(dVar.f45850d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f45848b.hashCode() ^ this.f45849c.f44150c) ^ Integer.rotateLeft(this.f45850d.f44150c, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        q qVar = this.f45850d;
        int i = qVar.f44150c;
        q qVar2 = this.f45849c;
        sb.append(i > qVar2.f44150c ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f45848b);
        sb.append(qVar2);
        sb.append(" to ");
        sb.append(qVar);
        sb.append(']');
        return sb.toString();
    }

    public d(long j4, q qVar, q qVar2) {
        this.f45848b = ma.f.v0(j4, 0, qVar);
        this.f45849c = qVar;
        this.f45850d = qVar2;
    }
}
