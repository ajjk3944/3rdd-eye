package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.a f1021a;

    static {
        f1021a = (k1.f1008e && k1.f1007d && !c.a()) ? new l1(1) : new l1(0);
    }

    public static int a(String str) {
        int length = str.length();
        int i4 = 0;
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
                i10++;
            } else {
                int length2 = str.length();
                while (i10 < length2) {
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 2048) {
                        i4 += (127 - cCharAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i10) < 65536) {
                                throw new m1(i10, length2);
                            }
                            i10++;
                        }
                    }
                    i10++;
                }
                i11 += i4;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i11 + 4294967296L));
    }
}
