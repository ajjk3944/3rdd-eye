package ub;

import android.content.Context;
import j1.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f35285b;

    /* renamed from: a, reason: collision with root package name */
    public q f35286a;

    static {
        b bVar = new b();
        bVar.f35286a = null;
        f35285b = bVar;
    }

    public static q a(Context context) {
        q qVar;
        b bVar = f35285b;
        synchronized (bVar) {
            try {
                if (bVar.f35286a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f35286a = new q(context);
                }
                qVar = bVar.f35286a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }
}
