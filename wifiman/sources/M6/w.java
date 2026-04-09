package M6;

import G6.P;
import K6.l0;
import android.bluetooth.BluetoothGatt;
import com.polidea.rxandroidble3.exceptions.BleGattCallbackTimeoutException;
import gg.D;
import gg.y;
import gg.z;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kg.InterfaceC6469f;

/* loaded from: classes3.dex */
public class w extends I6.t {

    /* renamed from: e, reason: collision with root package name */
    final BluetoothGatt f12749e;

    /* renamed from: f, reason: collision with root package name */
    final L6.c f12750f;

    w(l0 l0Var, BluetoothGatt bluetoothGatt, L6.c cVar, x xVar) {
        super(bluetoothGatt, l0Var, H6.a.f7632c, xVar);
        this.f12749e = bluetoothGatt;
        this.f12750f = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(P p10) {
        this.f12750f.m(p10, this.f12749e.getDevice());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ P s(BluetoothGatt bluetoothGatt) {
        return new P(bluetoothGatt.getServices());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z t(final BluetoothGatt bluetoothGatt, Long l10) {
        return z.x(new Callable() { // from class: M6.v
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return w.s(bluetoothGatt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ D v(final BluetoothGatt bluetoothGatt, y yVar) {
        return bluetoothGatt.getServices().size() == 0 ? z.p(new BleGattCallbackTimeoutException(bluetoothGatt, H6.a.f7632c)) : z.V(5L, TimeUnit.SECONDS, yVar).s(new kg.n() { // from class: M6.u
            @Override // kg.n
            public final Object apply(Object obj) {
                return w.t(bluetoothGatt, (Long) obj);
            }
        });
    }

    @Override // I6.t
    protected z d(l0 l0Var) {
        return l0Var.h().P().o(new InterfaceC6469f() { // from class: M6.s
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                this.f12744a.r((P) obj);
            }
        });
    }

    @Override // I6.t
    protected boolean g(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.discoverServices();
    }

    @Override // I6.t
    protected z h(final BluetoothGatt bluetoothGatt, l0 l0Var, final y yVar) {
        return z.j(new kg.q() { // from class: M6.t
            @Override // kg.q
            public final Object get() {
                return w.v(bluetoothGatt, yVar);
            }
        });
    }

    @Override // I6.t
    public String toString() {
        return "ServiceDiscoveryOperation{" + super.toString() + '}';
    }
}
