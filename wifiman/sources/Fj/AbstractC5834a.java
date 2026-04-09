package fj;

import ej.AbstractC5478b;
import ej.C5481e;
import ej.G;
import ej.s;
import ej.y;
import java.io.EOFException;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: fj.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5834a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f47360a = G.a("0123456789abcdef");

    public static final C5481e.a a(C5481e c5481e, C5481e.a unsafeCursor) {
        AbstractC6492s.i(c5481e, "<this>");
        AbstractC6492s.i(unsafeCursor, "unsafeCursor");
        C5481e.a aVarG = AbstractC5478b.g(unsafeCursor);
        if (aVarG.f46461a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarG.f46461a = c5481e;
        aVarG.f46462b = true;
        return aVarG;
    }

    public static final byte[] b() {
        return f47360a;
    }

    public static final boolean c(y segment, int i10, byte[] bytes, int i11, int i12) {
        AbstractC6492s.i(segment, "segment");
        AbstractC6492s.i(bytes, "bytes");
        int i13 = segment.f46528c;
        byte[] bArr = segment.f46526a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f46531f;
                AbstractC6492s.f(segment);
                byte[] bArr2 = segment.f46526a;
                bArr = bArr2;
                i10 = segment.f46527b;
                i13 = segment.f46528c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C5481e c5481e, long j10) throws EOFException {
        AbstractC6492s.i(c5481e, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c5481e.f0(j11) == 13) {
                String strA0 = c5481e.A0(j11);
                c5481e.d(2L);
                return strA0;
            }
        }
        String strA02 = c5481e.A0(j10);
        c5481e.d(1L);
        return strA02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int e(ej.C5481e r17, ej.s r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.AbstractC5834a.e(ej.e, ej.s, boolean):int");
    }

    public static /* synthetic */ int f(C5481e c5481e, s sVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c5481e, sVar, z10);
    }
}
