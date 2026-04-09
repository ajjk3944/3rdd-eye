package g8;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 implements x7.j {

    /* renamed from: d, reason: collision with root package name */
    public static final x7.g f24566d = new x7.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new o7.c(21));

    /* renamed from: e, reason: collision with root package name */
    public static final x7.g f24567e = new x7.g("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new o7.d(22));

    /* renamed from: f, reason: collision with root package name */
    public static final ec.z f24568f = new ec.z(26);
    public static final List g = DesugarCollections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a, reason: collision with root package name */
    public final e0 f24569a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.b f24570b;

    /* renamed from: c, reason: collision with root package name */
    public final ec.z f24571c = f24568f;

    public f0(a8.b bVar, e0 e0Var) {
        this.f24570b = bVar;
        this.f24569a = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x7.j
    public final z7.y a(Object obj, int i4, int i10, x7.h hVar) throws Exception {
        long jLongValue = ((Long) hVar.c(f24566d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(a0.g.j(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        Integer num = (Integer) hVar.c(f24567e);
        if (num == null) {
            num = 2;
        }
        m mVar = (m) hVar.c(m.g);
        if (mVar == null) {
            mVar = m.f24582f;
        }
        m mVar2 = mVar;
        this.f24571c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f24569a.d(mediaMetadataRetriever, obj);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Bitmap bitmapC = c(obj, mediaMetadataRetriever, jLongValue, num.intValue(), i4, i10, mVar2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                a3.a.k((ExecutorService) mediaMetadataRetriever);
            } else {
                mediaMetadataRetriever.release();
            }
            return c.c(this.f24570b, bitmapC);
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
                throw th4;
            }
            if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
                throw th4;
            }
            if (mediaMetadataRetriever instanceof ExecutorService) {
                a3.a.k((ExecutorService) mediaMetadataRetriever);
                throw th4;
            }
            mediaMetadataRetriever.release();
            throw th4;
        }
    }

    @Override // x7.j
    public final boolean b(Object obj, x7.h hVar) {
        return true;
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
    public final android.graphics.Bitmap c(java.lang.Object r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, g8.m r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.f0.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, g8.m):android.graphics.Bitmap");
    }
}
