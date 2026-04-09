package R2;

import J2.i;
import android.content.Context;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f3391b;

    /* renamed from: a, reason: collision with root package name */
    public i f3392a;

    static {
        b bVar = new b();
        bVar.f3392a = null;
        f3391b = bVar;
    }

    public static i a(Context context) {
        i iVar;
        b bVar = f3391b;
        synchronized (bVar) {
            try {
                if (bVar.f3392a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f3392a = new i(context, 1, false);
                }
                iVar = bVar.f3392a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }
}
