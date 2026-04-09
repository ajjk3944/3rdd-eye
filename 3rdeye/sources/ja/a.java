package ja;

import ia.C4468d;
import java.io.EOFException;
import kotlin.jvm.internal.l;
import y9.C5819a;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f43143a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(C5819a.f48359b);
        l.e(bytes, "getBytes(...)");
        f43143a = bytes;
    }

    public static final String a(C4468d c4468d, long j4) throws EOFException {
        l.f(c4468d, "<this>");
        if (j4 > 0) {
            long j10 = j4 - 1;
            if (c4468d.l(j10) == 13) {
                String strM0 = c4468d.m0(j10, C5819a.f48359b);
                c4468d.skip(2L);
                return strM0;
            }
        }
        String strM02 = c4468d.m0(j4, C5819a.f48359b);
        c4468d.skip(1L);
        return strM02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r19 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(ia.C4468d r17, ia.s r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.a.b(ia.d, ia.s, boolean):int");
    }
}
