package n1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f29514a;

    public static String a(int i4) {
        return i4 == 1 ? "Next" : i4 == 2 ? "Previous" : i4 == 3 ? "Left" : i4 == 4 ? "Right" : i4 == 5 ? "Up" : i4 == 6 ? "Down" : i4 == 7 ? "Enter" : i4 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f29514a == ((c) obj).f29514a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29514a;
    }

    public final String toString() {
        return a(this.f29514a);
    }
}
