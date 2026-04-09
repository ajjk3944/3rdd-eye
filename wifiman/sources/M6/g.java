package M6;

import G6.N;
import K6.C3128a;
import K6.InterfaceC3140m;
import K6.l0;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleException;
import gg.B;
import gg.y;
import gg.z;
import hg.InterfaceC6043c;

/* loaded from: classes3.dex */
public class g extends I6.j {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f12689a;

    /* renamed from: b, reason: collision with root package name */
    private final C3128a f12690b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12691c;

    /* renamed from: d, reason: collision with root package name */
    private final BluetoothManager f12692d;

    /* renamed from: e, reason: collision with root package name */
    private final y f12693e;

    /* renamed from: f, reason: collision with root package name */
    private final x f12694f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3140m f12695g;

    class a implements B {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gg.t f12696a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O6.i f12697b;

        a(gg.t tVar, O6.i iVar) {
            this.f12696a = tVar;
            this.f12697b = iVar;
        }

        @Override // gg.B
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(BluetoothGatt bluetoothGatt) {
            bluetoothGatt.close();
            g.this.d(this.f12696a, this.f12697b);
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            I6.q.r(th2, "Disconnect operation has been executed but finished with an error - considering disconnected.", new Object[0]);
            g.this.d(this.f12696a, this.f12697b);
        }
    }

    private static class b extends z {

        /* renamed from: a, reason: collision with root package name */
        final BluetoothGatt f12699a;

        /* renamed from: b, reason: collision with root package name */
        private final l0 f12700b;

        /* renamed from: c, reason: collision with root package name */
        private final y f12701c;

        class a implements kg.n {
            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BluetoothGatt apply(N.b bVar) {
                return b.this.f12699a;
            }
        }

        /* renamed from: M6.g$b$b, reason: collision with other inner class name */
        class C0500b implements kg.p {
            C0500b() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(N.b bVar) {
                return bVar == N.b.DISCONNECTED;
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f12699a.disconnect();
            }
        }

        b(BluetoothGatt bluetoothGatt, l0 l0Var, y yVar) {
            this.f12699a = bluetoothGatt;
            this.f12700b = l0Var;
            this.f12701c = yVar;
        }

        @Override // gg.z
        protected void N(B b10) {
            this.f12700b.d().N(new C0500b()).P().A(new a()).a(b10);
            this.f12701c.c().b(new c());
        }
    }

    g(l0 l0Var, C3128a c3128a, String str, BluetoothManager bluetoothManager, y yVar, x xVar, InterfaceC3140m interfaceC3140m) {
        this.f12689a = l0Var;
        this.f12690b = c3128a;
        this.f12691c = str;
        this.f12692d = bluetoothManager;
        this.f12693e = yVar;
        this.f12694f = xVar;
        this.f12695g = interfaceC3140m;
    }

    private z g(BluetoothGatt bluetoothGatt) {
        b bVar = new b(bluetoothGatt, this.f12689a, this.f12693e);
        x xVar = this.f12694f;
        return bVar.R(xVar.f12751a, xVar.f12752b, xVar.f12753c, z.z(bluetoothGatt));
    }

    private z h(BluetoothGatt bluetoothGatt) {
        return j(bluetoothGatt) ? z.z(bluetoothGatt) : g(bluetoothGatt);
    }

    private boolean j(BluetoothGatt bluetoothGatt) {
        return this.f12692d.getConnectionState(bluetoothGatt.getDevice(), 7) == 0;
    }

    @Override // I6.j
    protected void b(gg.t tVar, O6.i iVar) {
        this.f12695g.a(N.b.DISCONNECTING);
        BluetoothGatt bluetoothGattA = this.f12690b.a();
        if (bluetoothGattA != null) {
            h(bluetoothGattA).E(this.f12693e).a(new a(tVar, iVar));
        } else {
            I6.q.q("Disconnect operation has been executed but GATT instance was null - considering disconnected.", new Object[0]);
            d(tVar, iVar);
        }
    }

    @Override // I6.j
    protected BleException c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f12691c, -1);
    }

    void d(gg.h hVar, O6.i iVar) {
        this.f12695g.a(N.b.DISCONNECTED);
        iVar.release();
        hVar.a();
    }

    public String toString() {
        return "DisconnectOperation{" + L6.b.d(this.f12691c) + '}';
    }
}
