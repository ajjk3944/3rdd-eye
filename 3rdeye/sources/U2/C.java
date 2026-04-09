package U2;

import L2.g;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import io.appmetrica.analytics.impl.Oo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class C<T> implements L2.j<T, Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public static final L2.g<Long> f12379d = new L2.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e, reason: collision with root package name */
    public static final L2.g<Integer> f12380e = new L2.g<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: f, reason: collision with root package name */
    public static final f f12381f = new f();

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f12382g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final e<T> f12383a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.b f12384b;

    /* renamed from: c, reason: collision with root package name */
    public final f f12385c = f12381f;

    /* compiled from: VideoDecoder.java */
    public class a implements g.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12386a = ByteBuffer.allocate(8);

        @Override // L2.g.b
        public final void a(byte[] bArr, Long l5, MessageDigest messageDigest) {
            Long l10 = l5;
            messageDigest.update(bArr);
            synchronized (this.f12386a) {
                this.f12386a.position(0);
                messageDigest.update(this.f12386a.putLong(l10.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    public class b implements g.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f12387a = ByteBuffer.allocate(4);

        @Override // L2.g.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f12387a) {
                this.f12387a.position(0);
                messageDigest.update(this.f12387a.putInt(num2.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class c implements e<AssetFileDescriptor> {
        @Override // U2.C.e
        public final void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // U2.C.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class d implements e<ByteBuffer> {
        @Override // U2.C.e
        public final void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new D(byteBuffer));
        }

        @Override // U2.C.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(new D(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    public interface e<T> {
        void a(MediaExtractor mediaExtractor, T t10) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* compiled from: VideoDecoder.java */
    public static class f {
    }

    /* compiled from: VideoDecoder.java */
    public static final class g implements e<ParcelFileDescriptor> {
        @Override // U2.C.e
        public final void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // U2.C.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    public static final class h extends RuntimeException {
    }

    public C(O2.b bVar, e<T> eVar) {
        this.f12384b = bVar;
        this.f12383a = eVar;
    }

    @Override // L2.j
    public final boolean a(T t10, L2.h hVar) {
        return true;
    }

    @Override // L2.j
    public final N2.u<Bitmap> b(T t10, int i, int i10, L2.h hVar) throws Throwable {
        long jLongValue = ((Long) hVar.c(f12379d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(Oo.d(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) hVar.c(f12380e);
        if (num == null) {
            num = 2;
        }
        l lVar = (l) hVar.c(l.f12412f);
        if (lVar == null) {
            lVar = l.f12411e;
        }
        l lVar2 = lVar;
        this.f12385c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f12383a.b(mediaMetadataRetriever, t10);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Bitmap bitmapC = c(t10, mediaMetadataRetriever, jLongValue, num.intValue(), i, i10, lVar2);
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
            } else {
                mediaMetadataRetriever.release();
            }
            return U2.e.b(this.f12384b, bitmapC);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.release();
                throw th3;
            }
            mediaMetadataRetriever.release();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(T r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, U2.l r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.C.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, U2.l):android.graphics.Bitmap");
    }
}
