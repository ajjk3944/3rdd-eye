package K6;

import G6.N;
import P6.C3417e;
import P6.C3419g;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleGattCharacteristicException;
import com.polidea.rxandroidble3.exceptions.BleGattDescriptorException;
import com.polidea.rxandroidble3.exceptions.BleGattException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final gg.y f10401a;

    /* renamed from: b, reason: collision with root package name */
    final C3128a f10402b;

    /* renamed from: c, reason: collision with root package name */
    final A f10403c;

    /* renamed from: d, reason: collision with root package name */
    final T f10404d;

    /* renamed from: e, reason: collision with root package name */
    final J5.c f10405e = J5.c.l1();

    /* renamed from: f, reason: collision with root package name */
    final c f10406f = new c();

    /* renamed from: g, reason: collision with root package name */
    final c f10407g = new c();

    /* renamed from: h, reason: collision with root package name */
    final c f10408h = new c();

    /* renamed from: i, reason: collision with root package name */
    final J5.d f10409i = J5.c.l1().j1();

    /* renamed from: j, reason: collision with root package name */
    final c f10410j = new c();

    /* renamed from: k, reason: collision with root package name */
    final c f10411k = new c();

    /* renamed from: l, reason: collision with root package name */
    final c f10412l = new c();

    /* renamed from: m, reason: collision with root package name */
    final c f10413m = new c();

    /* renamed from: n, reason: collision with root package name */
    final c f10414n = new c();

    /* renamed from: o, reason: collision with root package name */
    final c f10415o = new c();

    /* renamed from: p, reason: collision with root package name */
    final c f10416p = new c();

    /* renamed from: q, reason: collision with root package name */
    private final kg.n f10417q = new a();

    /* renamed from: r, reason: collision with root package name */
    private final BluetoothGattCallback f10418r = new b();

    class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s apply(BleGattException bleGattException) {
            return gg.s.L(bleGattException);
        }
    }

    class b extends BluetoothGattCallback {
        b() {
        }

        private boolean a(int i10) {
            return i10 == 0 || i10 == 3;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            L6.b.m("onCharacteristicChanged", bluetoothGatt, bluetoothGattCharacteristic, true);
            l0.this.f10404d.a(bluetoothGatt, bluetoothGattCharacteristic);
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (l0.this.f10409i.i1()) {
                l0.this.f10409i.accept(new C3419g(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            L6.b.k("onCharacteristicRead", bluetoothGatt, i10, bluetoothGattCharacteristic, true);
            l0.this.f10404d.i(bluetoothGatt, bluetoothGattCharacteristic, i10);
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (!l0.this.f10407g.a() || l0.m(l0.this.f10407g, bluetoothGatt, bluetoothGattCharacteristic, i10, H6.a.f7633d)) {
                return;
            }
            l0.this.f10407g.f10421a.accept(new C3417e(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            L6.b.k("onCharacteristicWrite", bluetoothGatt, i10, bluetoothGattCharacteristic, false);
            l0.this.f10404d.m(bluetoothGatt, bluetoothGattCharacteristic, i10);
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
            if (!l0.this.f10408h.a() || l0.m(l0.this.f10408h, bluetoothGatt, bluetoothGattCharacteristic, i10, H6.a.f7634e)) {
                return;
            }
            l0.this.f10408h.f10421a.accept(new C3417e(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            L6.b.i("onConnectionStateChange", bluetoothGatt, i10, i11);
            l0.this.f10404d.b(bluetoothGatt, i10, i11);
            super.onConnectionStateChange(bluetoothGatt, i10, i11);
            l0.this.f10402b.b(bluetoothGatt);
            if (a(i11)) {
                l0.this.f10403c.d(new BleDisconnectedException(bluetoothGatt.getDevice().getAddress(), i10));
            } else if (i10 != 0) {
                l0.this.f10403c.e(new BleGattException(bluetoothGatt, i10, H6.a.f7631b));
            }
            l0.this.f10405e.accept(l0.j(i11));
        }

        public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i10, int i11, int i12, int i13) {
            L6.b.n("onConnectionUpdated", bluetoothGatt, i13, i10, i11, i12);
            l0.this.f10404d.f(bluetoothGatt, i10, i11, i12, i13);
            if (!l0.this.f10416p.a() || l0.l(l0.this.f10416p, bluetoothGatt, i13, H6.a.f7644o)) {
                return;
            }
            l0.this.f10416p.f10421a.accept(new C3139l(i10, i11, i12));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            L6.b.l("onDescriptorRead", bluetoothGatt, i10, bluetoothGattDescriptor, true);
            l0.this.f10404d.c(bluetoothGatt, bluetoothGattDescriptor, i10);
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i10);
            if (!l0.this.f10410j.a() || l0.n(l0.this.f10410j, bluetoothGatt, bluetoothGattDescriptor, i10, H6.a.f7637h)) {
                return;
            }
            l0.this.f10410j.f10421a.accept(new C3417e(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            L6.b.l("onDescriptorWrite", bluetoothGatt, i10, bluetoothGattDescriptor, false);
            l0.this.f10404d.d(bluetoothGatt, bluetoothGattDescriptor, i10);
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
            if (!l0.this.f10411k.a() || l0.n(l0.this.f10411k, bluetoothGatt, bluetoothGattDescriptor, i10, H6.a.f7638i)) {
                return;
            }
            l0.this.f10411k.f10421a.accept(new C3417e(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            L6.b.i("onMtuChanged", bluetoothGatt, i11, i10);
            l0.this.f10404d.e(bluetoothGatt, i10, i11);
            super.onMtuChanged(bluetoothGatt, i10, i11);
            if (!l0.this.f10413m.a() || l0.l(l0.this.f10413m, bluetoothGatt, i11, H6.a.f7641l)) {
                return;
            }
            l0.this.f10413m.f10421a.accept(Integer.valueOf(i10));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            L6.b.j("onPhyRead", bluetoothGatt, i12, i10, i11);
            l0.this.f10404d.g(bluetoothGatt, i10, i11, i12);
            super.onPhyRead(bluetoothGatt, i10, i11, i12);
            if (!l0.this.f10414n.a() || l0.l(l0.this.f10414n, bluetoothGatt, i12, H6.a.f7642m)) {
                return;
            }
            l0.this.f10414n.f10421a.accept(I6.r.c(i10, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            L6.b.j("onPhyUpdate", bluetoothGatt, i12, i10, i11);
            l0.this.f10404d.h(bluetoothGatt, i10, i11, i12);
            super.onPhyUpdate(bluetoothGatt, i10, i11, i12);
            if (!l0.this.f10415o.a() || l0.l(l0.this.f10415o, bluetoothGatt, i12, H6.a.f7643n)) {
                return;
            }
            l0.this.f10415o.f10421a.accept(I6.r.c(i10, i11));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i10, int i11) {
            L6.b.i("onReadRemoteRssi", bluetoothGatt, i11, i10);
            l0.this.f10404d.j(bluetoothGatt, i10, i11);
            super.onReadRemoteRssi(bluetoothGatt, i10, i11);
            if (!l0.this.f10412l.a() || l0.l(l0.this.f10412l, bluetoothGatt, i11, H6.a.f7640k)) {
                return;
            }
            l0.this.f10412l.f10421a.accept(Integer.valueOf(i10));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i10) {
            L6.b.h("onReliableWriteCompleted", bluetoothGatt, i10);
            l0.this.f10404d.k(bluetoothGatt, i10);
            super.onReliableWriteCompleted(bluetoothGatt, i10);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            L6.b.h("onServicesDiscovered", bluetoothGatt, i10);
            l0.this.f10404d.l(bluetoothGatt, i10);
            super.onServicesDiscovered(bluetoothGatt, i10);
            if (!l0.this.f10406f.a() || l0.l(l0.this.f10406f, bluetoothGatt, i10, H6.a.f7632c)) {
                return;
            }
            l0.this.f10406f.f10421a.accept(new G6.P(bluetoothGatt.getServices()));
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final J5.c f10421a = J5.c.l1();

        /* renamed from: b, reason: collision with root package name */
        final J5.c f10422b = J5.c.l1();

        c() {
        }

        boolean a() {
            return this.f10421a.i1() || this.f10422b.i1();
        }
    }

    public l0(gg.y yVar, C3128a c3128a, A a10, T t10) {
        this.f10401a = yVar;
        this.f10402b = c3128a;
        this.f10403c = a10;
        this.f10404d = t10;
    }

    private static boolean i(int i10) {
        return i10 != 0;
    }

    static N.b j(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? N.b.DISCONNECTED : N.b.DISCONNECTING : N.b.CONNECTED : N.b.CONNECTING;
    }

    static boolean l(c cVar, BluetoothGatt bluetoothGatt, int i10, H6.a aVar) {
        return i(i10) && o(cVar, new BleGattException(bluetoothGatt, i10, aVar));
    }

    static boolean m(c cVar, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, H6.a aVar) {
        return i(i10) && o(cVar, new BleGattCharacteristicException(bluetoothGatt, bluetoothGattCharacteristic, i10, aVar));
    }

    static boolean n(c cVar, BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10, H6.a aVar) {
        return i(i10) && o(cVar, new BleGattDescriptorException(bluetoothGatt, bluetoothGattDescriptor, i10, aVar));
    }

    private static boolean o(c cVar, BleGattException bleGattException) {
        cVar.f10422b.accept(bleGattException);
        return true;
    }

    private gg.s p(c cVar) {
        return gg.s.k0(this.f10403c.b(), cVar.f10421a, cVar.f10422b.Q(this.f10417q));
    }

    public BluetoothGattCallback a() {
        return this.f10418r;
    }

    public gg.s b() {
        return gg.s.j0(this.f10403c.b(), this.f10409i).s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s c() {
        return p(this.f10408h).s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s d() {
        return this.f10405e.s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s e() {
        return p(this.f10411k).s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s f() {
        return p(this.f10413m).s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s g() {
        return p(this.f10412l).s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s h() {
        return p(this.f10406f).s(0L, TimeUnit.SECONDS, this.f10401a);
    }

    public gg.s k() {
        return this.f10403c.b();
    }
}
