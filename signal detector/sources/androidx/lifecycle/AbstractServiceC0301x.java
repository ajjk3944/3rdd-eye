package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0301x extends Service implements InterfaceC0298u {

    /* renamed from: a, reason: collision with root package name */
    public final V2.e f5265a = new V2.e(this);

    @Override // androidx.lifecycle.InterfaceC0298u
    public final C0300w j() {
        return (C0300w) this.f5265a.f3868b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        q5.i.e(intent, "intent");
        this.f5265a.v(EnumC0291m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f5265a.v(EnumC0291m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0291m enumC0291m = EnumC0291m.ON_STOP;
        V2.e eVar = this.f5265a;
        eVar.v(enumC0291m);
        eVar.v(EnumC0291m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f5265a.v(EnumC0291m.ON_START);
        super.onStart(intent, i);
    }
}
