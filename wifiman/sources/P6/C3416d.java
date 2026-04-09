package P6;

import android.bluetooth.BluetoothManager;
import z2.InterfaceC8708a;

/* renamed from: P6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3416d implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18069a;

    public C3416d(InterfaceC8708a interfaceC8708a) {
        this.f18069a = interfaceC8708a;
    }

    public static C3416d a(InterfaceC8708a interfaceC8708a) {
        return new C3416d(interfaceC8708a);
    }

    public static C3415c c(BluetoothManager bluetoothManager) {
        return new C3415c(bluetoothManager);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3415c get() {
        return c((BluetoothManager) this.f18069a.get());
    }
}
