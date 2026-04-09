package s3;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class Z extends O {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC7888c f61204a;

    /* renamed from: b, reason: collision with root package name */
    private final int f61205b;

    public Z(AbstractC7888c abstractC7888c, int i10) {
        this.f61204a = abstractC7888c;
        this.f61205b = i10;
    }

    @Override // s3.InterfaceC7896k
    public final void A(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // s3.InterfaceC7896k
    public final void K(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC7901p.m(this.f61204a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f61204a.L(i10, iBinder, bundle, this.f61205b);
        this.f61204a = null;
    }

    @Override // s3.InterfaceC7896k
    public final void z(int i10, IBinder iBinder, d0 d0Var) {
        AbstractC7888c abstractC7888c = this.f61204a;
        AbstractC7901p.m(abstractC7888c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC7901p.l(d0Var);
        AbstractC7888c.a0(abstractC7888c, d0Var);
        K(i10, iBinder, d0Var.f61258a);
    }
}
