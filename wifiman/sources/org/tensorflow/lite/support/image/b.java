package org.tensorflow.lite.support.image;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class b {
    private static final /* synthetic */ b[] $VALUES;
    private static final int BATCH_DIM = 0;
    private static final int BATCH_VALUE = 1;
    private static final int CHANNEL_DIM = 3;
    public static final b GRAYSCALE;
    private static final int HEIGHT_DIM = 1;
    public static final b NV12;
    public static final b NV21;
    public static final b RGB;
    private static final int WIDTH_DIM = 2;
    public static final b YUV_420_888;
    public static final b YV12;
    public static final b YV21;
    private final int value;

    enum a extends b {
        private static final int CHANNEL_VALUE = 3;

        a(String str, int i10, int i11) {
            super(str, i10, i11, null);
        }

        @Override // org.tensorflow.lite.support.image.b
        Bitmap convertTensorBufferToBitmap(Jj.a aVar) {
            return org.tensorflow.lite.support.image.d.c(aVar);
        }

        @Override // org.tensorflow.lite.support.image.b
        int getChannelValue() {
            return 3;
        }

        @Override // org.tensorflow.lite.support.image.b
        int[] getNormalizedShape(int[] iArr) {
            int length = iArr.length;
            if (length == 3) {
                return b.insertValue(iArr, 0, 1);
            }
            if (length == 4) {
                return iArr;
            }
            throw new IllegalArgumentException(getShapeInfoMessage() + "The provided image shape is " + Arrays.toString(iArr));
        }

        @Override // org.tensorflow.lite.support.image.b
        int getNumElements(int i10, int i11) {
            return i10 * i11 * 3;
        }

        @Override // org.tensorflow.lite.support.image.b
        String getShapeInfoMessage() {
            return "The shape of a RGB image should be (h, w, c) or (1, h, w, c), and channels representing R, G, B in order. ";
        }

        @Override // org.tensorflow.lite.support.image.b
        Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ARGB_8888;
        }
    }

    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57153a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f57153a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57153a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        a aVar = new a("RGB", 0, 0);
        RGB = aVar;
        int i10 = 1;
        b bVar = new b("GRAYSCALE", i10, i10) { // from class: org.tensorflow.lite.support.image.b.b
            private static final int CHANNEL_VALUE = 1;

            {
                a aVar2 = null;
            }

            @Override // org.tensorflow.lite.support.image.b
            Bitmap convertTensorBufferToBitmap(Jj.a aVar2) {
                return org.tensorflow.lite.support.image.d.b(aVar2);
            }

            @Override // org.tensorflow.lite.support.image.b
            int getChannelValue() {
                return 1;
            }

            @Override // org.tensorflow.lite.support.image.b
            int[] getNormalizedShape(int[] iArr) {
                int length = iArr.length;
                if (length == 2) {
                    return b.insertValue(b.insertValue(iArr, 0, 1), 3, 1);
                }
                if (length == 4) {
                    return iArr;
                }
                throw new IllegalArgumentException(getShapeInfoMessage() + "The provided image shape is " + Arrays.toString(iArr));
            }

            @Override // org.tensorflow.lite.support.image.b
            int getNumElements(int i11, int i12) {
                return i11 * i12;
            }

            @Override // org.tensorflow.lite.support.image.b
            String getShapeInfoMessage() {
                return "The shape of a grayscale image should be (h, w) or (1, h, w, 1). ";
            }

            @Override // org.tensorflow.lite.support.image.b
            Bitmap.Config toBitmapConfig() {
                return Bitmap.Config.ALPHA_8;
            }
        };
        GRAYSCALE = bVar;
        int i11 = 2;
        b bVar2 = new b("NV12", i11, i11) { // from class: org.tensorflow.lite.support.image.b.c
            {
                a aVar2 = null;
            }

            @Override // org.tensorflow.lite.support.image.b
            int getNumElements(int i12, int i13) {
                return b.getYuv420NumElements(i12, i13);
            }
        };
        NV12 = bVar2;
        int i12 = 3;
        b bVar3 = new b("NV21", i12, i12) { // from class: org.tensorflow.lite.support.image.b.d
            {
                a aVar2 = null;
            }

            @Override // org.tensorflow.lite.support.image.b
            int getNumElements(int i13, int i14) {
                return b.getYuv420NumElements(i13, i14);
            }
        };
        NV21 = bVar3;
        int i13 = 4;
        b bVar4 = new b("YV12", i13, i13) { // from class: org.tensorflow.lite.support.image.b.e
            {
                a aVar2 = null;
            }

            @Override // org.tensorflow.lite.support.image.b
            int getNumElements(int i14, int i15) {
                return b.getYuv420NumElements(i14, i15);
            }
        };
        YV12 = bVar4;
        int i14 = 5;
        b bVar5 = new b("YV21", i14, i14) { // from class: org.tensorflow.lite.support.image.b.f
            {
                a aVar2 = null;
            }

            @Override // org.tensorflow.lite.support.image.b
            int getNumElements(int i15, int i16) {
                return b.getYuv420NumElements(i15, i16);
            }
        };
        YV21 = bVar5;
        int i15 = 6;
        b bVar6 = new b("YUV_420_888", i15, i15) { // from class: org.tensorflow.lite.support.image.b.g
            {
                a aVar2 = null;
            }

            @Override // org.tensorflow.lite.support.image.b
            int getNumElements(int i16, int i17) {
                return b.getYuv420NumElements(i16, i17);
            }
        };
        YUV_420_888 = bVar6;
        $VALUES = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    /* synthetic */ b(String str, int i10, int i11, a aVar) {
        this(str, i10, i11);
    }

    private void assertRgbOrGrayScale(String str) {
        if (this == RGB || this == GRAYSCALE) {
            return;
        }
        throw new UnsupportedOperationException(str + " only supports RGB and GRAYSCALE formats, but not " + name());
    }

    static b fromBitmapConfig(Bitmap.Config config) {
        int i10 = h.f57153a[config.ordinal()];
        if (i10 == 1) {
            return RGB;
        }
        if (i10 == 2) {
            return GRAYSCALE;
        }
        throw new IllegalArgumentException("Bitmap configuration: " + config + ", is not supported yet.");
    }

    static b fromImageFormat(int i10) {
        if (i10 == 17) {
            return NV21;
        }
        if (i10 == 35) {
            return YUV_420_888;
        }
        if (i10 == 842094169) {
            return YV12;
        }
        throw new IllegalArgumentException("ImageFormat: " + i10 + ", is not supported yet.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getYuv420NumElements(int i10, int i11) {
        return (i10 * i11) + (((i10 + 1) / 2) * ((i11 + 1) / 2) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] insertValue(int[] iArr, int i10, int i11) {
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        for (int i12 = 0; i12 < i10; i12++) {
            iArr2[i12] = iArr[i12];
        }
        iArr2[i10] = i11;
        while (true) {
            i10++;
            if (i10 >= length) {
                return iArr2;
            }
            iArr2[i10] = iArr[i10 - 1];
        }
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    void assertNumElements(int i10, int i11, int i12) {
        Ij.a.b(i10 >= getNumElements(i11, i12), String.format("The given number of elements (%d) does not match the image (%s) in %d x %d. The expected number of elements should be at least %d.", Integer.valueOf(i10), name(), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(getNumElements(i11, i12))));
    }

    void assertShape(int[] iArr) {
        assertRgbOrGrayScale("assertShape()");
        Ij.a.b(isValidNormalizedShape(getNormalizedShape(iArr)), getShapeInfoMessage() + "The provided image shape is " + Arrays.toString(iArr));
    }

    Bitmap convertTensorBufferToBitmap(Jj.a aVar) {
        throw new UnsupportedOperationException("convertTensorBufferToBitmap() is unsupported for the color space type " + name());
    }

    int getChannelValue() {
        throw new UnsupportedOperationException("getChannelValue() is unsupported for the color space type " + name());
    }

    int getHeight(int[] iArr) {
        assertRgbOrGrayScale("getHeight()");
        assertShape(iArr);
        return getNormalizedShape(iArr)[1];
    }

    int[] getNormalizedShape(int[] iArr) {
        throw new UnsupportedOperationException("getNormalizedShape() is unsupported for the color space type " + name());
    }

    abstract int getNumElements(int i10, int i11);

    String getShapeInfoMessage() {
        throw new UnsupportedOperationException("getShapeInfoMessage() is unsupported for the color space type " + name());
    }

    public int getValue() {
        return this.value;
    }

    int getWidth(int[] iArr) {
        assertRgbOrGrayScale("getWidth()");
        assertShape(iArr);
        return getNormalizedShape(iArr)[2];
    }

    protected boolean isValidNormalizedShape(int[] iArr) {
        return iArr[0] == 1 && iArr[1] > 0 && iArr[2] > 0 && iArr[3] == getChannelValue();
    }

    Bitmap.Config toBitmapConfig() {
        throw new UnsupportedOperationException("toBitmapConfig() is unsupported for the color space type " + name());
    }

    private b(String str, int i10, int i11) {
        this.value = i11;
    }
}
