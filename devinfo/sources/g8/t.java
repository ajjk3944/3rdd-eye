package g8;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f24598b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(x7.e.f36998a);

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f24598b);
    }

    @Override // g8.d
    public final Bitmap c(a8.b bVar, Bitmap bitmap, int i4, int i10) {
        return a0.b(bVar, bitmap, i4, i10);
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // x7.e
    public final int hashCode() {
        return 1572326941;
    }
}
