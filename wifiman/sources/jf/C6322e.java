package jf;

/* renamed from: jf.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6322e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f50824a;

    public C6322e(boolean z10) {
        this.f50824a = z10;
    }

    public final boolean a() {
        return this.f50824a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6322e) && this.f50824a == ((C6322e) obj).f50824a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f50824a);
    }

    public String toString() {
        return "ISPCard(share=" + this.f50824a + ")";
    }
}
