package rl;

import java.util.Comparator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        nk.k.e(str, "a");
        nk.k.e(str2, "b");
        int iMin = Math.min(str.length(), str2.length());
        for (int i4 = 4; i4 < iMin; i4++) {
            char cCharAt = str.charAt(i4);
            char cCharAt2 = str2.charAt(i4);
            if (cCharAt != cCharAt2) {
                return nk.k.f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
