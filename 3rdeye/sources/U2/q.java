package U2;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public final class q extends f {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12428b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(L2.f.f4027a);

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f12428b);
    }

    @Override // U2.f
    public final Bitmap c(O2.b bVar, Bitmap bitmap, int i, int i10) {
        return z.b(bVar, bitmap, i, i10);
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // L2.f
    public final int hashCode() {
        return 1572326941;
    }
}
