package I6;

import G6.O;
import G6.z;
import K6.InterfaceC3142o;
import P6.C3422j;
import android.bluetooth.BluetoothDevice;
import com.polidea.rxandroidble3.exceptions.BleAlreadyConnectedException;
import gg.v;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.InterfaceC6464a;

/* loaded from: classes3.dex */
class m implements O {

    /* renamed from: a, reason: collision with root package name */
    final BluetoothDevice f8657a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC3142o f8658b;

    /* renamed from: c, reason: collision with root package name */
    private final J5.b f8659c;

    /* renamed from: d, reason: collision with root package name */
    private final C3422j f8660d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f8661e = new AtomicBoolean(false);

    m(BluetoothDevice bluetoothDevice, InterfaceC3142o interfaceC3142o, J5.b bVar, C3422j c3422j) {
        this.f8657a = bluetoothDevice;
        this.f8658b = interfaceC3142o;
        this.f8659c = bVar;
        this.f8660d = c3422j;
    }

    private String f(boolean z10) {
        return (!z10 || this.f8660d.a()) ? this.f8657a.getName() : "[NO BLUETOOTH_CONNECT PERMISSION]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f8661e.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ v h(z zVar) {
        return this.f8661e.compareAndSet(false, true) ? this.f8658b.a(zVar).y(new InterfaceC6464a() { // from class: I6.l
            @Override // kg.InterfaceC6464a
            public final void run() {
                this.f8656a.g();
            }
        }) : gg.s.L(new BleAlreadyConnectedException(this.f8657a.getAddress()));
    }

    @Override // G6.O
    public gg.s a(boolean z10) {
        return e(new z.a().b(z10).c(true).a());
    }

    @Override // G6.O
    public String b() {
        return this.f8657a.getAddress();
    }

    public gg.s e(final z zVar) {
        return gg.s.r(new kg.q() { // from class: I6.k
            @Override // kg.q
            public final Object get() {
                return this.f8654a.h(zVar);
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f8657a.equals(((m) obj).f8657a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8657a.hashCode();
    }

    public String toString() {
        return "RxBleDeviceImpl{" + L6.b.d(this.f8657a.getAddress()) + ", name=" + f(true) + '}';
    }
}
