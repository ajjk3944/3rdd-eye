package O4;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: CLSUUID.java */
/* renamed from: O4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1460f {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicLong f10307a = new AtomicLong(0);

    /* renamed from: b, reason: collision with root package name */
    public static String f10308b;

    public C1460f(P p10) throws NoSuchAlgorithmException {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b10 = bArrArray[0];
        byte b11 = bArrArray[1];
        byte b12 = bArrArray[2];
        byte b13 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b14 = bArrA[0];
        byte b15 = bArrA[1];
        byte[] bArrA2 = a(f10307a.incrementAndGet());
        byte b16 = bArrA2[0];
        byte b17 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {b10, b11, b12, b13, b14, b15, b16, b17, bArrA3[0], bArrA3[1]};
        String strH = C1461g.h(((C1457c) p10.c()).f10301a);
        String strE = C1461g.e(bArr);
        Locale locale = Locale.US;
        f10308b = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), strH.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j4);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return f10308b;
    }
}
