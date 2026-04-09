package s;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.RemoteException;
import b.InterfaceC1809b;

/* compiled from: CustomTabsSession.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f45894a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1809b f45895b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC5541e f45896c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f45897d;

    public i(InterfaceC1809b interfaceC1809b, BinderC5541e binderC5541e, ComponentName componentName) {
        this.f45895b = interfaceC1809b;
        this.f45896c = binderC5541e;
        this.f45897d = componentName;
    }

    public final void a(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f45894a) {
            try {
                try {
                    this.f45895b.f(this.f45896c, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
