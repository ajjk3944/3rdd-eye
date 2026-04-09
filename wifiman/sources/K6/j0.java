package K6;

import G6.N;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import gg.AbstractC5912b;
import java.util.concurrent.TimeUnit;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public class j0 implements G6.N {

    /* renamed from: a, reason: collision with root package name */
    private final O6.d f10374a;

    /* renamed from: b, reason: collision with root package name */
    final l0 f10375b;

    /* renamed from: c, reason: collision with root package name */
    final BluetoothGatt f10376c;

    /* renamed from: d, reason: collision with root package name */
    private final M6.k f10377d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f10378e;

    /* renamed from: f, reason: collision with root package name */
    final gg.y f10379f;

    /* renamed from: g, reason: collision with root package name */
    private final n0 f10380g;

    /* renamed from: h, reason: collision with root package name */
    private final g0 f10381h;

    /* renamed from: i, reason: collision with root package name */
    private final P f10382i;

    /* renamed from: j, reason: collision with root package name */
    private final C3149w f10383j;

    /* renamed from: k, reason: collision with root package name */
    private final D f10384k;

    public j0(O6.d dVar, l0 l0Var, BluetoothGatt bluetoothGatt, n0 n0Var, g0 g0Var, P p10, C3149w c3149w, M6.k kVar, InterfaceC8708a interfaceC8708a, gg.y yVar, D d10) {
        this.f10374a = dVar;
        this.f10375b = l0Var;
        this.f10376c = bluetoothGatt;
        this.f10380g = n0Var;
        this.f10381h = g0Var;
        this.f10382i = p10;
        this.f10383j = c3149w;
        this.f10377d = kVar;
        this.f10378e = interfaceC8708a;
        this.f10379f = yVar;
        this.f10384k = d10;
    }

    @Override // G6.N
    public int a() {
        return this.f10382i.a();
    }

    @Override // G6.N
    public gg.z b() {
        return this.f10380g.a(20L, TimeUnit.SECONDS);
    }

    @Override // G6.N
    public N.a c() {
        return (N.a) this.f10378e.get();
    }

    @Override // G6.N
    public AbstractC5912b d(int i10, long j10, TimeUnit timeUnit) {
        if (i10 == 2 || i10 == 0 || i10 == 1) {
            return j10 <= 0 ? AbstractC5912b.D(new IllegalArgumentException("Delay must be bigger than 0")) : this.f10374a.a(this.f10377d.g(i10, j10, timeUnit)).f0();
        }
        return AbstractC5912b.D(new IllegalArgumentException("Connection priority must have valid value from BluetoothGatt (received " + i10 + ")"));
    }

    @Override // G6.N
    public gg.z e(int i10) {
        return this.f10374a.a(this.f10377d.a(i10)).P();
    }

    @Override // G6.N
    public gg.z f(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return this.f10384k.a(bluetoothGattCharacteristic, 76).j(this.f10374a.a(this.f10377d.f(bluetoothGattCharacteristic, bArr))).P();
    }

    @Override // G6.N
    public gg.z g() {
        return this.f10374a.a(this.f10377d.d()).P();
    }

    @Override // G6.N
    public gg.s h(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return i(bluetoothGattCharacteristic, G6.C.DEFAULT);
    }

    public gg.s i(BluetoothGattCharacteristic bluetoothGattCharacteristic, G6.C c10) {
        return this.f10384k.a(bluetoothGattCharacteristic, 16).j(this.f10381h.x(bluetoothGattCharacteristic, c10, false));
    }
}
