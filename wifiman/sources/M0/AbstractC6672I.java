package m0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: m0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6672I {
    public static final ColorFilter a(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C6709j0.f52919a.a(j10, i10) : new PorterDuffColorFilter(AbstractC6737x0.j(j10), AbstractC6666F.c(i10));
    }

    public static final ColorFilter b(AbstractC6735w0 abstractC6735w0) {
        return abstractC6735w0.a();
    }
}
