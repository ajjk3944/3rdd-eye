package Q4;

import android.bluetooth.BluetoothSocket;
import c5.C0409f;
import c5.C0412i;
import h5.InterfaceC2370d;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class q extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BluetoothSocket f3224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BluetoothSocket bluetoothSocket, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f3224e = bluetoothSocket;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((q) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new q(this.f3224e, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        Object objD;
        R2.a.H(obj);
        BluetoothSocket bluetoothSocket = this.f3224e;
        if (bluetoothSocket != null) {
            try {
                bluetoothSocket.close();
                objD = C0412i.f5929a;
            } catch (Throwable th) {
                objD = R2.a.d(th);
            }
        } else {
            objD = null;
        }
        return new C0409f(objD);
    }
}
