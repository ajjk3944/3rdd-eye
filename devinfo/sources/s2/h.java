package s2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f33389a;

    public static String a(int i4) {
        if (i4 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i4 == 1) {
            return "EmojiSupportMatch.None";
        }
        if (i4 == 2) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f33389a == ((h) obj).f33389a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33389a;
    }

    public final String toString() {
        return a(this.f33389a);
    }
}
