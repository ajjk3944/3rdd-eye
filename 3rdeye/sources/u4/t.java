package u4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public final class t implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46584b;

    public /* synthetic */ t(Object obj, int i) {
        this.f46583a = i;
        this.f46584b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj = this.f46584b;
        switch (this.f46583a) {
            case 0:
                u uVar = (u) obj;
                uVar.f46587b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                uVar.a().post(new r(this, iBinder));
                break;
            default:
                y4.n nVar = (y4.n) obj;
                nVar.f48119b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                nVar.a().post(new y4.l(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj = this.f46584b;
        switch (this.f46583a) {
            case 0:
                u uVar = (u) obj;
                uVar.f46587b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                uVar.a().post(new s(this));
                break;
            default:
                y4.n nVar = (y4.n) obj;
                nVar.f48119b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                nVar.a().post(new y4.m(this));
                break;
        }
    }
}
