package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.q;
import com.google.ar.core.ImageMetadata;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    public static final C2.f f34544f = C2.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C2.b.DEFAULT);

    /* renamed from: g, reason: collision with root package name */
    public static final C2.f f34545g = C2.f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h, reason: collision with root package name */
    public static final C2.f f34546h = k.f34542h;

    /* renamed from: i, reason: collision with root package name */
    public static final C2.f f34547i;

    /* renamed from: j, reason: collision with root package name */
    public static final C2.f f34548j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set f34549k;

    /* renamed from: l, reason: collision with root package name */
    private static final b f34550l;

    /* renamed from: m, reason: collision with root package name */
    private static final Set f34551m;

    /* renamed from: n, reason: collision with root package name */
    private static final Queue f34552n;

    /* renamed from: a, reason: collision with root package name */
    private final F2.d f34553a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f34554b;

    /* renamed from: c, reason: collision with root package name */
    private final F2.b f34555c;

    /* renamed from: d, reason: collision with root package name */
    private final List f34556d;

    /* renamed from: e, reason: collision with root package name */
    private final p f34557e = p.b();

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public void a(F2.d dVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public void b() {
        }
    }

    public interface b {
        void a(F2.d dVar, Bitmap bitmap);

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f34547i = C2.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f34548j = C2.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f34549k = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f34550l = new a();
        f34551m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f34552n = W2.l.f(0);
    }

    public l(List list, DisplayMetrics displayMetrics, F2.d dVar, F2.b bVar) {
        this.f34556d = list;
        this.f34554b = (DisplayMetrics) W2.k.d(displayMetrics);
        this.f34553a = (F2.d) W2.k.d(dVar);
        this.f34555c = (F2.b) W2.k.d(bVar);
    }

    private static int a(double d10) {
        return x((d10 / (r1 / r0)) * x(l(d10) * d10));
    }

    private void b(q qVar, C2.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean zHasAlpha;
        if (this.f34557e.g(i10, i11, options, z10, z11)) {
            return;
        }
        if (bVar == C2.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            zHasAlpha = qVar.d().hasAlpha();
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
            }
            zHasAlpha = false;
        }
        Bitmap.Config config = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, q qVar, b bVar, F2.d dVar, k kVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int iFloor;
        int iFloor2;
        if (i11 <= 0 || i12 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i13 + "x" + i14 + "]");
                return;
            }
            return;
        }
        if (r(i10)) {
            i16 = i11;
            i15 = i12;
        } else {
            i15 = i11;
            i16 = i12;
        }
        float fB = kVar.b(i15, i16, i13, i14);
        if (fB <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + kVar + ", source: [" + i11 + "x" + i12 + "], target: [" + i13 + "x" + i14 + "]");
        }
        k.g gVarA = kVar.a(i15, i16, i13, i14);
        if (gVarA == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f10 = i15;
        float f11 = i16;
        int iX = i15 / x(fB * f10);
        int iX2 = i16 / x(fB * f11);
        k.g gVar = k.g.MEMORY;
        int iMax = Math.max(1, Integer.highestOneBit(gVarA == gVar ? Math.max(iX, iX2) : Math.min(iX, iX2)));
        if (gVarA == gVar && iMax < 1.0f / fB) {
            iMax <<= 1;
        }
        options.inSampleSize = iMax;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float fMin = Math.min(iMax, 8);
            iFloor = (int) Math.ceil(f10 / fMin);
            iFloor2 = (int) Math.ceil(f11 / fMin);
            int i17 = iMax / 8;
            if (i17 > 0) {
                iFloor /= i17;
                iFloor2 /= i17;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f12 = iMax;
            iFloor = (int) Math.floor(f10 / f12);
            iFloor2 = (int) Math.floor(f11 / f12);
        } else if (imageType.isWebp()) {
            float f13 = iMax;
            iFloor = Math.round(f10 / f13);
            iFloor2 = Math.round(f11 / f13);
        } else if (i15 % iMax == 0 && i16 % iMax == 0) {
            iFloor = i15 / iMax;
            iFloor2 = i16 / iMax;
        } else {
            int[] iArrM = m(qVar, options, bVar, dVar);
            iFloor = iArrM[0];
            iFloor2 = iArrM[1];
        }
        double dB = kVar.b(iFloor, iFloor2, i13, i14);
        options.inTargetDensity = a(dB);
        options.inDensity = l(dB);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + iFloor + "x" + iFloor2 + "], exact scale factor: " + fB + ", power of 2 sample size: " + iMax + ", adjusted scale factor: " + dB + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private E2.c e(q qVar, int i10, int i11, C2.g gVar, b bVar) {
        byte[] bArr = (byte[]) this.f34555c.e(ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, byte[].class);
        BitmapFactory.Options optionsK = k();
        optionsK.inTempStorage = bArr;
        C2.b bVar2 = (C2.b) gVar.c(f34544f);
        C2.h hVar = (C2.h) gVar.c(f34545g);
        k kVar = (k) gVar.c(k.f34542h);
        boolean zBooleanValue = ((Boolean) gVar.c(f34547i)).booleanValue();
        C2.f fVar = f34548j;
        try {
            return g.f(h(qVar, optionsK, kVar, bVar2, hVar, gVar.c(fVar) != null && ((Boolean) gVar.c(fVar)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f34553a);
        } finally {
            v(optionsK);
            this.f34555c.d(bArr);
        }
    }

    private Bitmap h(q qVar, BitmapFactory.Options options, k kVar, C2.b bVar, C2.h hVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        int i12;
        int i13;
        String str;
        int i14;
        ColorSpace colorSpace;
        int iRound;
        int i15;
        int i16;
        long jB = W2.g.b();
        int[] iArrM = m(qVar, options, bVar2, this.f34553a);
        int i17 = iArrM[0];
        int i18 = iArrM[1];
        String str2 = options.outMimeType;
        boolean z12 = (i17 == -1 || i18 == -1) ? false : z10;
        int iA = qVar.a();
        int iD = x.d(iA);
        boolean zG = x.g(iA);
        if (i10 == Integer.MIN_VALUE) {
            i12 = i11;
            i13 = r(iD) ? i18 : i17;
        } else {
            i12 = i11;
            i13 = i10;
        }
        int i19 = i12 == Integer.MIN_VALUE ? r(iD) ? i17 : i18 : i12;
        ImageHeaderParser.ImageType imageTypeD = qVar.d();
        c(imageTypeD, qVar, bVar2, this.f34553a, kVar, iD, i17, i18, i13, i19, options);
        b(qVar, bVar, z12, zG, options, i13, i19);
        int i20 = Build.VERSION.SDK_INT;
        if (z(imageTypeD)) {
            if (i17 < 0 || i18 < 0 || !z11) {
                float f10 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i21 = options.inSampleSize;
                float f11 = i21;
                int iCeil = (int) Math.ceil(i17 / f11);
                int iCeil2 = (int) Math.ceil(i18 / f11);
                int iRound2 = Math.round(iCeil * f10);
                iRound = Math.round(iCeil2 * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(iRound2);
                    sb2.append("x");
                    sb2.append(iRound);
                    i15 = iRound2;
                    sb2.append("] for source [");
                    sb2.append(i17);
                    sb2.append("x");
                    sb2.append(i18);
                    sb2.append("], sampleSize: ");
                    sb2.append(i21);
                    sb2.append(", targetDensity: ");
                    sb2.append(options.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f10);
                    Log.v(str, sb2.toString());
                } else {
                    i15 = iRound2;
                }
                i16 = i15;
            } else {
                str = "Downsampler";
                i16 = i13;
                iRound = i19;
            }
            if (i16 > 0 && iRound > 0) {
                y(options, this.f34553a, i16, iRound);
            }
        } else {
            str = "Downsampler";
        }
        if (hVar != null) {
            if (i20 >= 28) {
                options.inPreferredColorSpace = ColorSpace.get((hVar == C2.h.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap bitmapI = i(qVar, options, bVar2, this.f34553a);
        bVar2.a(this.f34553a, bitmapI);
        if (Log.isLoggable(str, 2)) {
            i14 = iA;
            t(i17, i18, str2, options, bitmapI, i10, i11, jB);
        } else {
            i14 = iA;
        }
        if (bitmapI == null) {
            return null;
        }
        bitmapI.setDensity(this.f34554b.densityDpi);
        Bitmap bitmapH = x.h(this.f34553a, bitmapI, i14);
        if (bitmapI.equals(bitmapH)) {
            return bitmapH;
        }
        this.f34553a.c(bitmapI);
        return bitmapH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.q r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.l.b r7, F2.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.b()
            r5.c()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.x.c()
            r4.lock()
            android.graphics.Bitmap r5 = r5.b(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.x.c()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.c(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.x.c()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.x.c()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.l.i(com.bumptech.glide.load.resource.bitmap.q, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.l$b, F2.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        Queue queue = f34552n;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            w(options);
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(q qVar, BitmapFactory.Options options, b bVar, F2.d dVar) {
        options.inJustDecodeBounds = true;
        i(qVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        return i10 == 90 || i10 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        return i11 > 0 && (i10 = options.inDensity) > 0 && i11 != i10;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + W2.g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f34552n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, F2.d dVar, int i10, int i11) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config == Bitmap.Config.HARDWARE) {
            return;
        }
        Bitmap.Config config2 = options.outConfig;
        if (config2 != null) {
            config = config2;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public E2.c d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C2.g gVar) {
        return e(new q.c(parcelFileDescriptor, this.f34556d, this.f34555c), i10, i11, gVar, f34550l);
    }

    public E2.c f(InputStream inputStream, int i10, int i11, C2.g gVar, b bVar) {
        return e(new q.b(inputStream, this.f34556d, this.f34555c), i10, i11, gVar, bVar);
    }

    public E2.c g(ByteBuffer byteBuffer, int i10, int i11, C2.g gVar) {
        return e(new q.a(byteBuffer, this.f34556d, this.f34555c), i10, i11, gVar, f34550l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
