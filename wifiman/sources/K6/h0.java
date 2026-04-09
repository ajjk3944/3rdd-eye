package K6;

import android.bluetooth.BluetoothGatt;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class h0 implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f10364a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f10365b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC8708a f10366c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8708a f10367d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC8708a f10368e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8708a f10369f;

    public h0(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6) {
        this.f10364a = interfaceC8708a;
        this.f10365b = interfaceC8708a2;
        this.f10366c = interfaceC8708a3;
        this.f10367d = interfaceC8708a4;
        this.f10368e = interfaceC8708a5;
        this.f10369f = interfaceC8708a6;
    }

    public static h0 a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2, InterfaceC8708a interfaceC8708a3, InterfaceC8708a interfaceC8708a4, InterfaceC8708a interfaceC8708a5, InterfaceC8708a interfaceC8708a6) {
        return new h0(interfaceC8708a, interfaceC8708a2, interfaceC8708a3, interfaceC8708a4, interfaceC8708a5, interfaceC8708a6);
    }

    public static g0 c(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, l0 l0Var, Object obj) {
        return new g0(bArr, bArr2, bArr3, bluetoothGatt, l0Var, (C3149w) obj);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return c((byte[]) this.f10364a.get(), (byte[]) this.f10365b.get(), (byte[]) this.f10366c.get(), (BluetoothGatt) this.f10367d.get(), (l0) this.f10368e.get(), this.f10369f.get());
    }
}
