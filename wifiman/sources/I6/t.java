package I6;

import K6.l0;
import M6.x;
import P6.F;
import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.polidea.rxandroidble3.exceptions.BleGattCallbackTimeoutException;
import com.polidea.rxandroidble3.exceptions.BleGattCannotStartException;
import gg.y;
import gg.z;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class t extends j {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothGatt f8681a;

    /* renamed from: b, reason: collision with root package name */
    private final l0 f8682b;

    /* renamed from: c, reason: collision with root package name */
    private final H6.a f8683c;

    /* renamed from: d, reason: collision with root package name */
    private final x f8684d;

    public t(BluetoothGatt bluetoothGatt, l0 l0Var, H6.a aVar, x xVar) {
        this.f8681a = bluetoothGatt;
        this.f8682b = l0Var;
        this.f8683c = aVar;
        this.f8684d = xVar;
    }

    @Override // I6.j
    protected final void b(gg.t tVar, O6.i iVar) {
        F f10 = new F(tVar, iVar);
        z zVarD = d(this.f8682b);
        x xVar = this.f8684d;
        long j10 = xVar.f12751a;
        TimeUnit timeUnit = xVar.f12752b;
        y yVar = xVar.f12753c;
        zVarD.R(j10, timeUnit, yVar, h(this.f8681a, this.f8682b, yVar)).Y().d(f10);
        if (g(this.f8681a)) {
            return;
        }
        f10.cancel();
        f10.onError(new BleGattCannotStartException(this.f8681a, this.f8683c));
    }

    @Override // I6.j
    protected BleException c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f8681a.getDevice().getAddress(), -1);
    }

    protected abstract z d(l0 l0Var);

    protected abstract boolean g(BluetoothGatt bluetoothGatt);

    protected z h(BluetoothGatt bluetoothGatt, l0 l0Var, y yVar) {
        return z.p(new BleGattCallbackTimeoutException(this.f8681a, this.f8683c));
    }

    public String toString() {
        return L6.b.c(this.f8681a);
    }
}
