package M6;

import G6.N;
import K6.C3128a;
import K6.InterfaceC3140m;
import K6.l0;
import P6.C3414b;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import com.polidea.rxandroidble3.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.polidea.rxandroidble3.exceptions.BleGattCallbackTimeoutException;
import gg.C;
import gg.E;
import gg.InterfaceC5910A;
import gg.z;
import java.util.concurrent.Callable;
import kg.InterfaceC6464a;

/* loaded from: classes3.dex */
public class c extends I6.j {

    /* renamed from: a, reason: collision with root package name */
    final BluetoothDevice f12670a;

    /* renamed from: b, reason: collision with root package name */
    final C3414b f12671b;

    /* renamed from: c, reason: collision with root package name */
    final l0 f12672c;

    /* renamed from: d, reason: collision with root package name */
    final C3128a f12673d;

    /* renamed from: e, reason: collision with root package name */
    final x f12674e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f12675f;

    /* renamed from: g, reason: collision with root package name */
    final InterfaceC3140m f12676g;

    class a implements InterfaceC6464a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O6.i f12677a;

        a(O6.i iVar) {
            this.f12677a = iVar;
        }

        @Override // kg.InterfaceC6464a
        public void run() {
            this.f12677a.release();
        }
    }

    class b implements E {
        b() {
        }

        @Override // gg.E
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(z zVar) {
            c cVar = c.this;
            if (cVar.f12675f) {
                return zVar;
            }
            x xVar = cVar.f12674e;
            return zVar.R(xVar.f12751a, xVar.f12752b, xVar.f12753c, cVar.h());
        }
    }

    /* renamed from: M6.c$c, reason: collision with other inner class name */
    class CallableC0499c implements Callable {
        CallableC0499c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BluetoothGatt call() {
            throw new BleGattCallbackTimeoutException(c.this.f12673d.a(), H6.a.f7631b);
        }
    }

    class d implements C {

        class a implements kg.p {
            a() {
            }

            @Override // kg.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean test(N.b bVar) {
                return bVar == N.b.CONNECTED;
            }
        }

        d() {
        }

        @Override // gg.C
        public void a(InterfaceC5910A interfaceC5910A) {
            interfaceC5910A.g((Cg.b) c.this.d().k(c.this.f12672c.d().N(new a())).D(c.this.f12672c.k().P()).o0().P(P6.u.c(interfaceC5910A)));
            c.this.f12676g.a(N.b.CONNECTING);
            c cVar = c.this;
            c.this.f12673d.b(cVar.f12671b.a(cVar.f12670a, cVar.f12675f, cVar.f12672c.a()));
        }
    }

    class e implements Callable {
        e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BluetoothGatt call() {
            c.this.f12676g.a(N.b.CONNECTED);
            return c.this.f12673d.a();
        }
    }

    c(BluetoothDevice bluetoothDevice, C3414b c3414b, l0 l0Var, C3128a c3128a, x xVar, boolean z10, InterfaceC3140m interfaceC3140m) {
        this.f12670a = bluetoothDevice;
        this.f12671b = c3414b;
        this.f12672c = l0Var;
        this.f12673d = c3128a;
        this.f12674e = xVar;
        this.f12675f = z10;
        this.f12676g = interfaceC3140m;
    }

    private z g() {
        return z.i(new d());
    }

    private E j() {
        return new b();
    }

    @Override // I6.j
    protected void b(gg.t tVar, O6.i iVar) {
        tVar.g((Cg.b) g().h(j()).l(new a(iVar)).P(P6.u.b(tVar)));
        if (this.f12675f) {
            iVar.release();
        }
    }

    @Override // I6.j
    protected BleException c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f12670a.getAddress(), -1);
    }

    z d() {
        return z.x(new e());
    }

    z h() {
        return z.x(new CallableC0499c());
    }

    public String toString() {
        return "ConnectOperation{" + L6.b.d(this.f12670a.getAddress()) + ", autoConnect=" + this.f12675f + '}';
    }
}
