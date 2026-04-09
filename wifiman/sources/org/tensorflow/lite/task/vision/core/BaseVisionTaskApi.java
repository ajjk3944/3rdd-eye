package org.tensorflow.lite.task.vision.core;

import android.media.Image;
import java.nio.ByteBuffer;
import org.tensorflow.lite.support.image.e;

/* loaded from: classes2.dex */
public abstract class BaseVisionTaskApi extends Kj.a {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57170a;

        static {
            int[] iArr = new int[org.tensorflow.lite.support.image.b.values().length];
            f57170a = iArr;
            try {
                iArr[org.tensorflow.lite.support.image.b.RGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57170a[org.tensorflow.lite.support.image.b.NV12.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57170a[org.tensorflow.lite.support.image.b.NV21.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57170a[org.tensorflow.lite.support.image.b.YV12.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57170a[org.tensorflow.lite.support.image.b.YV21.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57170a[org.tensorflow.lite.support.image.b.YUV_420_888.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static abstract class b {
        b() {
        }

        public static b a(long j10, long j11, byte[] bArr) {
            return new org.tensorflow.lite.task.vision.core.a(j10, j11, bArr);
        }

        abstract byte[] b();

        abstract long c();

        abstract long d();
    }

    public interface c {
        Object a(long j10, int i10, int i11, Lj.b bVar);
    }

    protected BaseVisionTaskApi(long j10) {
        super(j10);
    }

    private static native long createFrameBufferFromByteBuffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13);

    private static native long createFrameBufferFromBytes(byte[] bArr, int i10, int i11, int i12, int i13, long[] jArr);

    private static native long createFrameBufferFromPlanes(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, int i15);

    private static native void deleteFrameBuffer(long j10, long j11, byte[] bArr);

    private static b j(e eVar, int i10) {
        org.tensorflow.lite.support.image.b bVarD = eVar.d();
        switch (a.f57170a[bVarD.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return p(eVar, i10);
            case 6:
                return s(eVar, i10);
            default:
                throw new IllegalArgumentException("Color space type, " + bVarD.name() + ", is unsupported.");
        }
    }

    private static b p(e eVar, int i10) {
        org.tensorflow.lite.a aVarE = eVar.e();
        org.tensorflow.lite.a aVar = org.tensorflow.lite.a.UINT8;
        e eVarA = aVarE == aVar ? eVar : e.a(eVar, aVar);
        ByteBuffer byteBufferC = eVarA.c();
        byteBufferC.rewind();
        org.tensorflow.lite.support.image.b bVarD = eVar.d();
        if (byteBufferC.isDirect()) {
            return b.a(createFrameBufferFromByteBuffer(byteBufferC, eVarA.i(), eVarA.f(), i10, bVarD.getValue()), 0L, new byte[0]);
        }
        long[] jArr = new long[1];
        byte[] bArrV = v(byteBufferC);
        return b.a(createFrameBufferFromBytes(bArrV, eVarA.i(), eVarA.f(), i10, bVarD.getValue(), jArr), jArr[0], bArrV);
    }

    private static b s(e eVar, int i10) {
        Image imageG = eVar.g();
        Ij.a.b(imageG.getFormat() == 35, "Only supports loading YUV_420_888 Image.");
        Image.Plane[] planes = imageG.getPlanes();
        Ij.a.b(planes.length == 3, String.format("The input image should have 3 planes, but got %d plane(s).", Integer.valueOf(planes.length)));
        for (Image.Plane plane : planes) {
            ByteBuffer buffer = plane.getBuffer();
            Ij.a.c(buffer, "The image buffer is corrupted and the plane is null.");
            Ij.a.b(buffer.isDirect(), "The image plane buffer is not a direct ByteBuffer, and is not supported.");
            buffer.rewind();
        }
        return b.a(createFrameBufferFromPlanes(planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), imageG.getWidth(), imageG.getHeight(), planes[0].getRowStride(), planes[1].getRowStride(), planes[1].getPixelStride(), i10), 0L, new byte[0]);
    }

    private static byte[] v(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit();
        byte[] bArr = new byte[iLimit];
        byteBuffer.get(bArr, 0, iLimit);
        return bArr;
    }

    protected Object y(c cVar, e eVar, Lj.b bVar) {
        b bVarJ = j(eVar, bVar.b().getValue());
        Object objA = cVar.a(bVarJ.d(), eVar.i(), eVar.f(), bVar);
        deleteFrameBuffer(bVarJ.d(), bVarJ.c(), bVarJ.b());
        return objA;
    }
}
