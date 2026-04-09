package b9;

/* compiled from: UByte.kt */
/* loaded from: classes3.dex */
public final class r implements Comparable<r> {

    /* renamed from: b, reason: collision with root package name */
    public final byte f18096b;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(r rVar) {
        return kotlin.jvm.internal.l.h(this.f18096b & 255, rVar.f18096b & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f18096b == ((r) obj).f18096b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18096b;
    }

    public final String toString() {
        return String.valueOf(this.f18096b & 255);
    }
}
