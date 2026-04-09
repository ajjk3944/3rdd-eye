package K6;

import G6.N;
import android.bluetooth.BluetoothGattCharacteristic;

/* loaded from: classes3.dex */
public final class L implements N.a {

    /* renamed from: a, reason: collision with root package name */
    final O6.d f10297a;

    /* renamed from: b, reason: collision with root package name */
    private final G6.N f10298b;

    /* renamed from: c, reason: collision with root package name */
    final M6.k f10299c;

    /* renamed from: d, reason: collision with root package name */
    private gg.z f10300d;

    /* renamed from: e, reason: collision with root package name */
    i0 f10301e;

    /* renamed from: f, reason: collision with root package name */
    N.c f10302f = new I();

    /* renamed from: g, reason: collision with root package name */
    N.d f10303g = new V();

    /* renamed from: h, reason: collision with root package name */
    byte[] f10304h;

    class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gg.s apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            L l10 = L.this;
            return l10.f10297a.a(l10.f10299c.c(bluetoothGattCharacteristic, l10.f10302f, l10.f10303g, l10.f10301e, l10.f10304h));
        }
    }

    L(O6.d dVar, N n10, G6.N n11, M6.k kVar) {
        this.f10297a = dVar;
        this.f10301e = n10;
        this.f10298b = n11;
        this.f10299c = kVar;
    }

    @Override // G6.N.a
    public gg.s a() {
        gg.z zVar = this.f10300d;
        if (zVar == null) {
            throw new IllegalArgumentException("setCharacteristicUuid() or setCharacteristic() needs to be called before build()");
        }
        if (this.f10304h != null) {
            return zVar.v(new a());
        }
        throw new IllegalArgumentException("setBytes() needs to be called before build()");
    }

    @Override // G6.N.a
    public N.a b(int i10) {
        this.f10301e = new C3148v(i10);
        return this;
    }

    @Override // G6.N.a
    public N.a c(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f10300d = gg.z.z(bluetoothGattCharacteristic);
        return this;
    }

    @Override // G6.N.a
    public N.a d(byte[] bArr) {
        this.f10304h = bArr;
        return this;
    }
}
