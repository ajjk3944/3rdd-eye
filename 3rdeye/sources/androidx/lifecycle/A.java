package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.AbstractC1781n;

/* compiled from: LifecycleService.kt */
/* loaded from: classes.dex */
public class A extends Service implements InterfaceC1790x {

    /* renamed from: b, reason: collision with root package name */
    public final Z f16019b = new Z(this);

    @Override // androidx.lifecycle.InterfaceC1790x
    public final AbstractC1781n getLifecycle() {
        return this.f16019b.f16117a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.l.f(intent, "intent");
        Z z10 = this.f16019b;
        z10.getClass();
        z10.a(AbstractC1781n.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        Z z10 = this.f16019b;
        z10.getClass();
        z10.a(AbstractC1781n.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Z z10 = this.f16019b;
        z10.getClass();
        z10.a(AbstractC1781n.a.ON_STOP);
        z10.a(AbstractC1781n.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        Z z10 = this.f16019b;
        z10.getClass();
        z10.a(AbstractC1781n.a.ON_START);
        super.onStart(intent, i);
    }
}
