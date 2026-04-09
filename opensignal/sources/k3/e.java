package k3;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14018a = 0;

    static {
        new ThreadLocal();
    }

    public static void a(a9.l lVar, a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            a2.c.k(lVar, aVar != null ? a2.c.i(aVar) : null);
        } else if (aVar == null) {
            lVar.setXfermode(null);
        } else {
            PorterDuff.Mode modeX = a.a.x(aVar);
            lVar.setXfermode(modeX != null ? new PorterDuffXfermode(modeX) : null);
        }
    }
}
