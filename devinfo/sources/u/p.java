package u;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34720a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final b.d f34721b;

    /* renamed from: c, reason: collision with root package name */
    public final g f34722c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f34723d;

    public p(b.d dVar, g gVar, ComponentName componentName) {
        this.f34721b = dVar;
        this.f34722c = gVar;
        this.f34723d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f34720a) {
            try {
                try {
                    ((b.b) this.f34721b).T(this.f34722c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
