package K6;

import P6.C3421i;
import android.bluetooth.BluetoothGatt;
import z2.InterfaceC8708a;

/* renamed from: K6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3131d {
    static int a() {
        return 3;
    }

    static int b(int i10) {
        return i10 >= 33 ? 512 : 600;
    }

    static int c() {
        return 23;
    }

    static BluetoothGatt d(C3128a c3128a) {
        return c3128a.a();
    }

    static C3421i e() {
        return new C3421i(1, 2, 4, 8, 16, 32, 64);
    }

    static F f(boolean z10, InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return z10 ? (F) interfaceC8708a.get() : (F) interfaceC8708a2.get();
    }

    static M6.x g(gg.y yVar, G6.S s10) {
        return new M6.x(s10.f7044b, s10.f7043a, yVar);
    }
}
