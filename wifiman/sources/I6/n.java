package I6;

import K6.InterfaceC3142o;
import P6.C3422j;
import android.bluetooth.BluetoothDevice;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class n implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f8662a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f8663b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f8664c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f8665d;

    public n(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        this.f8662a = interfaceC8708a;
        this.f8663b = interfaceC8708a2;
        this.f8664c = interfaceC8708a3;
        this.f8665d = interfaceC8708a4;
    }

    public static n a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4) {
        return new n(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4);
    }

    public static m c(BluetoothDevice bluetoothDevice, InterfaceC3142o interfaceC3142o, J5.b bVar, C3422j c3422j) {
        return new m(bluetoothDevice, interfaceC3142o, bVar, c3422j);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((BluetoothDevice) this.f8662a.get(), (InterfaceC3142o) this.f8663b.get(), (J5.b) this.f8664c.get(), (C3422j) this.f8665d.get());
    }
}
