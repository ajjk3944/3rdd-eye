package com.bumptech.glide.load.resource.bitmap;

import C2.f;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class A implements C2.i {

    /* renamed from: d, reason: collision with root package name */
    public static final C2.f f34507d = C2.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final C2.f f34508e = C2.f.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    private static final f f34509f = new f();

    /* renamed from: g, reason: collision with root package name */
    private static final List f34510g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    private final e f34511a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.d f34512b;

    /* renamed from: c, reason: collision with root package name */
    private final f f34513c;

    class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f34514a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // C2.f.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f34514a) {
                this.f34514a.position(0);
                messageDigest.update(this.f34514a.putLong(l10.longValue()).array());
            }
        }
    }

    class b implements f.b {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f34515a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // C2.f.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f34515a) {
                this.f34515a.position(0);
                messageDigest.update(this.f34515a.putInt(num.intValue()).array());
            }
        }
    }

    private static final class c implements e {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.A.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.A.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    static final class d implements e {

        class a extends MediaDataSource {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f34516a;

            a(ByteBuffer byteBuffer) {
                this.f34516a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f34516a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f34516a.limit()) {
                    return -1;
                }
                this.f34516a.position((int) j10);
                int iMin = Math.min(i11, this.f34516a.remaining());
                this.f34516a.get(bArr, i10, iMin);
                return iMin;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.A.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.A.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }
    }

    interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    static final class g implements e {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.A.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.A.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    A(F2.d dVar, e eVar) {
        this(dVar, eVar, f34509f);
    }

    public static C2.i c(F2.d dVar) {
        return new A(dVar, new c(null));
    }

    public static C2.i d(F2.d dVar) {
        return new A(dVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    if (Log.isLoggable("VideoDecoder", 3)) {
                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        return bitmap;
    }

    private Bitmap f(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, k kVar) {
        if (l(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapH = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || kVar == k.f34540f) ? null : h(mediaMetadataRetriever, j10, i10, i11, i12, kVar);
        if (bitmapH == null) {
            bitmapH = g(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapE = e(mediaMetadataRetriever, bitmapH);
        if (bitmapE != null) {
            return bitmapE;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, k kVar) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float fB = kVar.b(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * fB), Math.round(fB * i14));
        } catch (Throwable th2) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th2);
            return null;
        }
    }

    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean k() {
        Iterator it = f34510g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(".+_cheets|cheets_.+")) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f34511a.a(mediaExtractor2, obj);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i10 = 0; i10 < trackCount; i10++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th3) {
            th = th3;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static C2.i m(F2.d dVar) {
        return new A(dVar, new g());
    }

    @Override // C2.i
    public boolean a(Object obj, C2.g gVar) {
        return true;
    }

    @Override // C2.i
    public E2.c b(Object obj, int i10, int i11, C2.g gVar) throws IOException {
        long jLongValue = ((Long) gVar.c(f34507d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) gVar.c(f34508e);
        if (num == null) {
            num = 2;
        }
        k kVar = (k) gVar.c(k.f34542h);
        if (kVar == null) {
            kVar = k.f34541g;
        }
        k kVar2 = kVar;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f34513c.a();
        try {
            this.f34511a.b(mediaMetadataRetrieverA, obj);
            return com.bumptech.glide.load.resource.bitmap.g.f(f(obj, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, kVar2), this.f34512b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetrieverA.release();
            } else {
                mediaMetadataRetrieverA.release();
            }
        }
    }

    A(F2.d dVar, e eVar, f fVar) {
        this.f34512b = dVar;
        this.f34511a = eVar;
        this.f34513c = fVar;
    }
}
