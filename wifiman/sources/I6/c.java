package I6;

import P6.G;
import android.bluetooth.BluetoothDevice;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class c implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f8641a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f8642b;

    public c(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f8641a = interfaceC8708a;
        this.f8642b = interfaceC8708a2;
    }

    public static c a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new c(interfaceC8708a, interfaceC8708a2);
    }

    public static BluetoothDevice c(String str, G g10) {
        return (BluetoothDevice) y2.e.d(b.a(str, g10));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothDevice get() {
        return c((String) this.f8641a.get(), (G) this.f8642b.get());
    }
}
