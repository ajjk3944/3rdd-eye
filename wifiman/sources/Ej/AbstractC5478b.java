package ej;

import ej.C5481e;
import fj.AbstractC5835b;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: ej.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5478b {

    /* renamed from: a, reason: collision with root package name */
    private static final C5481e.a f46444a = new C5481e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f46445b = -1234567890;

    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        AbstractC6492s.i(a10, "a");
        AbstractC6492s.i(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c() {
        return f46445b;
    }

    public static final C5481e.a d() {
        return f46444a;
    }

    public static final int e(h hVar, int i10) {
        AbstractC6492s.i(hVar, "<this>");
        return i10 == f46445b ? hVar.b0() : i10;
    }

    public static final int f(byte[] bArr, int i10) {
        AbstractC6492s.i(bArr, "<this>");
        return i10 == f46445b ? bArr.length : i10;
    }

    public static final C5481e.a g(C5481e.a unsafeCursor) {
        AbstractC6492s.i(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f46444a ? new C5481e.a() : unsafeCursor;
    }

    public static final int h(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final short i(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String j(byte b10) {
        return kotlin.text.t.v(new char[]{AbstractC5835b.f()[(b10 >> 4) & 15], AbstractC5835b.f()[b10 & 15]});
    }

    public static final String k(int i10) {
        int i11 = 0;
        if (i10 == 0) {
            return "0";
        }
        char[] cArr = {AbstractC5835b.f()[(i10 >> 28) & 15], AbstractC5835b.f()[(i10 >> 24) & 15], AbstractC5835b.f()[(i10 >> 20) & 15], AbstractC5835b.f()[(i10 >> 16) & 15], AbstractC5835b.f()[(i10 >> 12) & 15], AbstractC5835b.f()[(i10 >> 8) & 15], AbstractC5835b.f()[(i10 >> 4) & 15], AbstractC5835b.f()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return kotlin.text.t.w(cArr, i11, 8);
    }
}
