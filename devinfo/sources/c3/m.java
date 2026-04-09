package c3;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f2726a;

    public static String a(int i4) {
        return i4 == 1 ? "Ltr" : i4 == 2 ? "Rtl" : i4 == 3 ? "Content" : i4 == 4 ? "ContentOrLtr" : i4 == 5 ? "ContentOrRtl" : i4 == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f2726a == ((m) obj).f2726a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2726a;
    }

    public final String toString() {
        return a(this.f2726a);
    }
}
