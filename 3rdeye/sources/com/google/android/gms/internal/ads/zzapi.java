package com.google.android.gms.internal.ads;

import android.util.Pair;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzapi {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    public static Pair zzc(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZzf = zzf(randomAccessFile, 0);
        return pairZzf != null ? pairZzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j4) {
        zzg(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j4 < 0 || j4 > 4294967295L) {
            throw new IllegalArgumentException(Oo.d(j4, "uint32 value of out range: "));
        }
        byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j4);
    }

    private static long zze(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i) & 4294967295L;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int i) throws IOException {
        int i10;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - byteBufferAllocate.capacity();
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzg(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity < 22) {
            i10 = -1;
        } else {
            int i11 = iCapacity - 22;
            int iMin = Math.min(i11, 65535);
            for (int i12 = 0; i12 < iMin; i12++) {
                i10 = i11 - i12;
                if (byteBufferAllocate.getInt(i10) == 101010256 && ((char) byteBufferAllocate.getShort(i10 + 20)) == i12) {
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 == -1) {
            return null;
        }
        byteBufferAllocate.position(i10);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + i10));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
