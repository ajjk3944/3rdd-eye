package S3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import b4.C0337b;
import b4.C0338c;
import b4.C0339d;

/* loaded from: classes.dex */
public final class o implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3497b;

    public /* synthetic */ o(int i, Object obj) {
        this.f3496a = i;
        this.f3497b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.f3496a;
        Object obj = this.f3497b;
        switch (i) {
            case 0:
                p pVar = (p) obj;
                pVar.f3500b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                pVar.a().post(new n(this, iBinder));
                break;
            case 1:
                X3.h hVar = (X3.h) obj;
                hVar.f4180b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                hVar.a().post(new W3.d(this, iBinder));
                break;
            default:
                C0339d c0339d = (C0339d) obj;
                c0339d.f5738b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                c0339d.a().post(new C0337b(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.f3496a;
        Object obj = this.f3497b;
        int i3 = 0;
        int i6 = 1;
        switch (i) {
            case 0:
                p pVar = (p) obj;
                pVar.f3500b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                pVar.a().post(new m(i6, this));
                break;
            case 1:
                X3.h hVar = (X3.h) obj;
                hVar.f4180b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                hVar.a().post(new X3.g(i6, this));
                break;
            default:
                C0339d c0339d = (C0339d) obj;
                c0339d.f5738b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                c0339d.a().post(new C0338c(i3, this));
                break;
        }
    }
}
