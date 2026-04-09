package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class e60 extends Service implements b60 {
    public final xb4 f = new xb4(this);

    @Override // defpackage.b60
    public final d60 e() {
        return (d60) this.f.g;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i30.m(intent, "intent");
        xb4 xb4Var = this.f;
        xb4Var.getClass();
        xb4Var.x(t50.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        xb4 xb4Var = this.f;
        xb4Var.getClass();
        xb4Var.x(t50.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        xb4 xb4Var = this.f;
        xb4Var.getClass();
        xb4Var.x(t50.ON_STOP);
        xb4Var.x(t50.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        xb4 xb4Var = this.f;
        xb4Var.getClass();
        xb4Var.x(t50.ON_START);
        super.onStart(intent, i);
    }
}
