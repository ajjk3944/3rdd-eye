package j3;

/* compiled from: IntegerParser.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f42707a;

    /* renamed from: b, reason: collision with root package name */
    public final long f42708b;

    public c(long j4, int i) {
        this.f42708b = j4;
        this.f42707a = i;
    }

    public static c a(int i, int i10, String str) {
        if (i >= i10) {
            return null;
        }
        long j4 = 0;
        int i11 = i;
        while (i11 < i10) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j4 = (j4 * 10) + (cCharAt - '0');
            if (j4 > 2147483647L) {
                return null;
            }
            i11++;
        }
        if (i11 == i) {
            return null;
        }
        return new c(j4, i11);
    }
}
