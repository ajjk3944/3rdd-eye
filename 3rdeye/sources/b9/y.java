package b9;

/* compiled from: UShort.kt */
/* loaded from: classes3.dex */
public final class y implements Comparable<y> {

    /* renamed from: b, reason: collision with root package name */
    public final short f18109b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(y yVar) {
        return kotlin.jvm.internal.l.h(this.f18109b & 65535, yVar.f18109b & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f18109b == ((y) obj).f18109b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18109b;
    }

    public final String toString() {
        return String.valueOf(65535 & this.f18109b);
    }
}
