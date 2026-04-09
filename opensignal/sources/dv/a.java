package dv;

import br.l;
import cv.a0;
import java.io.EOFException;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f7590a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(tt.a.f22975a);
        l.d(bytes, "getBytes(...)");
        f7590a = bytes;
    }

    public static final boolean a(a0 a0Var, int i10, byte[] bArr, int i11) {
        int i12 = a0Var.f6680c;
        byte[] bArr2 = a0Var.f6678a;
        for (int i13 = 1; i13 < i11; i13++) {
            if (i10 == i12) {
                a0Var = a0Var.f6683f;
                l.b(a0Var);
                bArr2 = a0Var.f6678a;
                i10 = a0Var.f6679b;
                i12 = a0Var.f6680c;
            }
            if (bArr2[i10] != bArr[i13]) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final String b(cv.g gVar, long j) throws EOFException {
        if (j > 0) {
            long j7 = j - 1;
            if (gVar.q(j7) == 13) {
                String strV = gVar.V(j7, tt.a.f22975a);
                gVar.skip(2L);
                return strV;
            }
        }
        String strV2 = gVar.V(j, tt.a.f22975a);
        gVar.skip(1L);
        return strV2;
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
    public static final int c(cv.g r16, cv.v r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.a.c(cv.g, cv.v, boolean):int");
    }
}
