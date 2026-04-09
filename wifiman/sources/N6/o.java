package N6;

import android.bluetooth.BluetoothDevice;

/* loaded from: classes3.dex */
public class o implements I6.s {

    /* renamed from: a, reason: collision with root package name */
    private final BluetoothDevice f15364a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15365b;

    /* renamed from: c, reason: collision with root package name */
    private final long f15366c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.e f15367d;

    /* renamed from: e, reason: collision with root package name */
    private final Q6.c f15368e;

    /* renamed from: f, reason: collision with root package name */
    private final Q6.b f15369f;

    public o(BluetoothDevice bluetoothDevice, int i10, long j10, Q6.e eVar, Q6.c cVar, Q6.b bVar) {
        this.f15364a = bluetoothDevice;
        this.f15365b = i10;
        this.f15366c = j10;
        this.f15367d = eVar;
        this.f15368e = cVar;
        this.f15369f = bVar;
    }

    @Override // I6.s
    public String a() {
        BluetoothDevice bluetoothDeviceC = c();
        if (bluetoothDeviceC == null) {
            return null;
        }
        return bluetoothDeviceC.getName();
    }

    @Override // I6.s
    public Q6.e b() {
        return this.f15367d;
    }

    public BluetoothDevice c() {
        return this.f15364a;
    }

    public int d() {
        return this.f15365b;
    }

    public Q6.c e() {
        return this.f15368e;
    }

    public long f() {
        return this.f15366c;
    }

    public Q6.b g() {
        return this.f15369f;
    }

    @Override // I6.s
    public String getAddress() {
        return this.f15364a.getAddress();
    }
}
