package K6;

import android.bluetooth.BluetoothGattDescriptor;
import gg.AbstractC5912b;

/* renamed from: K6.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3149w {

    /* renamed from: a, reason: collision with root package name */
    private final O6.d f10457a;

    /* renamed from: b, reason: collision with root package name */
    private final M6.k f10458b;

    C3149w(O6.d dVar, M6.k kVar) {
        this.f10457a = dVar;
        this.f10458b = kVar;
    }

    AbstractC5912b a(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return this.f10457a.a(this.f10458b.b(bluetoothGattDescriptor, bArr)).f0();
    }
}
