package P6;

import android.bluetooth.BluetoothAdapter;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class H implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18062a;

    public H(InterfaceC8708a interfaceC8708a) {
        this.f18062a = interfaceC8708a;
    }

    public static H a(InterfaceC8708a interfaceC8708a) {
        return new H(interfaceC8708a);
    }

    public static G c(BluetoothAdapter bluetoothAdapter) {
        return new G(bluetoothAdapter);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public G get() {
        return c((BluetoothAdapter) this.f18062a.get());
    }
}
