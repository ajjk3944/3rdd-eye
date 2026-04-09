package M6;

import G6.N;
import K6.i0;
import K6.l0;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import gg.y;
import java.util.concurrent.TimeUnit;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f12713a;

    /* renamed from: b, reason: collision with root package name */
    private final BluetoothGatt f12714b;

    /* renamed from: c, reason: collision with root package name */
    private final L6.c f12715c;

    /* renamed from: d, reason: collision with root package name */
    private final x f12716d;

    /* renamed from: e, reason: collision with root package name */
    private final y f12717e;

    /* renamed from: f, reason: collision with root package name */
    private final y f12718f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8708a f12719g;

    l(l0 l0Var, BluetoothGatt bluetoothGatt, L6.c cVar, x xVar, y yVar, y yVar2, InterfaceC8708a interfaceC8708a) {
        this.f12713a = l0Var;
        this.f12714b = bluetoothGatt;
        this.f12715c = cVar;
        this.f12716d = xVar;
        this.f12717e = yVar;
        this.f12718f = yVar2;
        this.f12719g = interfaceC8708a;
    }

    @Override // M6.k
    public i a(int i10) {
        return new i(this.f12713a, this.f12714b, this.f12716d, i10);
    }

    @Override // M6.k
    public f b(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return new f(this.f12713a, this.f12714b, this.f12716d, 2, bluetoothGattDescriptor, bArr);
    }

    @Override // M6.k
    public a c(BluetoothGattCharacteristic bluetoothGattCharacteristic, N.c cVar, N.d dVar, i0 i0Var, byte[] bArr) {
        return new a(this.f12714b, this.f12713a, this.f12717e, this.f12716d, bluetoothGattCharacteristic, i0Var, cVar, dVar, bArr);
    }

    @Override // M6.k
    public n d() {
        return (n) this.f12719g.get();
    }

    @Override // M6.k
    public w e(long j10, TimeUnit timeUnit) {
        return new w(this.f12713a, this.f12714b, this.f12715c, new x(j10, timeUnit, this.f12718f));
    }

    @Override // M6.k
    public b f(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new b(this.f12713a, this.f12714b, this.f12716d, bluetoothGattCharacteristic, bArr);
    }

    @Override // M6.k
    public e g(int i10, long j10, TimeUnit timeUnit) {
        return new e(this.f12713a, this.f12714b, this.f12716d, i10, new x(j10, timeUnit, this.f12718f));
    }
}
