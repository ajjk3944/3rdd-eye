package u1;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import l1.InterfaceC2639e;
import o1.InterfaceC2753a;

/* loaded from: classes.dex */
public final class u extends AbstractC2950e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f23768b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC2639e.f21817a);

    @Override // l1.InterfaceC2639e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f23768b);
    }

    @Override // u1.AbstractC2950e
    public final Bitmap c(InterfaceC2753a interfaceC2753a, Bitmap bitmap, int i, int i3) {
        return AbstractC2943A.b(interfaceC2753a, bitmap, i, i3);
    }

    @Override // l1.InterfaceC2639e
    public final boolean equals(Object obj) {
        return obj instanceof u;
    }

    @Override // l1.InterfaceC2639e
    public final int hashCode() {
        return 1572326941;
    }
}
