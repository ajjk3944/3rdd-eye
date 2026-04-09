package hf;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10646b = f.h(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f10647c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f10648a;

    public d() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b2 = bArrArray[0];
        byte b10 = bArrArray[1];
        byte b11 = bArrArray[2];
        byte b12 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b13 = bArrA[0];
        byte b14 = bArrA[1];
        byte[] bArrA2 = a(f10647c.incrementAndGet());
        byte b15 = bArrA2[0];
        byte b16 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String strE = f.e(new byte[]{b2, b10, b11, b12, b13, b14, b15, b16, bArrA3[0], bArrA3[1]});
        Locale locale = Locale.US;
        this.f10648a = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), f10646b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f10648a;
    }
}
