package ic;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f11324b;

    /* renamed from: a, reason: collision with root package name */
    public b f11325a;

    static {
        c cVar = new c();
        cVar.f11325a = null;
        f11324b = cVar;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f11324b;
        synchronized (cVar) {
            try {
                if (cVar.f11325a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f11325a = new b(context, false);
                }
                bVar = cVar.f11325a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
