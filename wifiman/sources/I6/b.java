package I6;

import G6.N;
import K6.InterfaceC3140m;
import M6.x;
import P6.G;
import android.bluetooth.BluetoothDevice;
import gg.y;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class b {

    class a implements InterfaceC3140m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ J5.b f8640a;

        a(J5.b bVar) {
            this.f8640a = bVar;
        }

        @Override // K6.InterfaceC3140m
        public void a(N.b bVar) {
            this.f8640a.accept(bVar);
        }
    }

    static BluetoothDevice a(String str, G g10) {
        return g10.a(str);
    }

    static InterfaceC3140m b(J5.b bVar) {
        return new a(bVar);
    }

    static J5.b c() {
        return J5.b.m1(N.b.DISCONNECTED);
    }

    static x d(y yVar) {
        return new x(35L, TimeUnit.SECONDS, yVar);
    }

    static x e(y yVar) {
        return new x(10L, TimeUnit.SECONDS, yVar);
    }
}
