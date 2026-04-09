package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f26244e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final long f26245a;

    /* renamed from: b, reason: collision with root package name */
    public final LocalDateTime f26246b;

    /* renamed from: c, reason: collision with root package name */
    public final ZoneOffset f26247c;

    /* renamed from: d, reason: collision with root package name */
    public final ZoneOffset f26248d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f26245a, ((b) obj).f26245a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.f26245a = j$.com.android.tools.r8.a.t(localDateTime, zoneOffset);
        this.f26246b = localDateTime;
        this.f26247c = zoneOffset;
        this.f26248d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f26245a = j;
        this.f26246b = LocalDateTime.G(j, 0, zoneOffset);
        this.f26247c = zoneOffset;
        this.f26248d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean i() {
        return this.f26248d.f26051a > this.f26247c.f26051a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f26245a == bVar.f26245a && this.f26247c.equals(bVar.f26247c) && this.f26248d.equals(bVar.f26248d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26246b.hashCode() ^ this.f26247c.f26051a) ^ Integer.rotateLeft(this.f26248d.f26051a, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(i() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f26246b);
        sb2.append(this.f26247c);
        sb2.append(" to ");
        sb2.append(this.f26248d);
        sb2.append(']');
        return sb2.toString();
    }
}
