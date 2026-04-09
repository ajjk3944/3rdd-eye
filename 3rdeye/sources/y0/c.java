package y0;

import android.app.Application;
import y0.d;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Application f47856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.a f47857c;

    public c(Application application, d.a aVar) {
        this.f47856b = application;
        this.f47857c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47856b.unregisterActivityLifecycleCallbacks(this.f47857c);
    }
}
