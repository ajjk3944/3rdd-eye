package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d0 extends Service implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final yb.e f1120a = new yb.e(this);

    @Override // androidx.lifecycle.a0
    public final c0 j() {
        return (c0) this.f1120a.f37509b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        nk.k.e(intent, "intent");
        yb.e eVar = this.f1120a;
        eVar.getClass();
        eVar.r(r.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        yb.e eVar = this.f1120a;
        eVar.getClass();
        eVar.r(r.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        yb.e eVar = this.f1120a;
        eVar.getClass();
        eVar.r(r.ON_STOP);
        eVar.r(r.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i4) {
        yb.e eVar = this.f1120a;
        eVar.getClass();
        eVar.r(r.ON_START);
        super.onStart(intent, i4);
    }
}
