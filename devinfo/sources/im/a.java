package im;

import java.io.EOFException;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26016a;

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f26017b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(vk.a.f36267a);
        k.d(bytes, "getBytes(...)");
        f26016a = bytes;
        f26017b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final String a(hm.e eVar, long j) throws EOFException {
        if (j > 0) {
            long j8 = j - 1;
            if (eVar.p(j8) == 13) {
                String string = eVar.readString(j8, vk.a.f36267a);
                eVar.skip(2L);
                return string;
            }
        }
        String string2 = eVar.readString(j, vk.a.f36267a);
        eVar.skip(1L);
        return string2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(hm.e r16, hm.n r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: im.a.b(hm.e, hm.n, boolean):int");
    }
}
