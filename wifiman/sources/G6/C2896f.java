package G6;

import G6.InterfaceC2891a;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import z2.InterfaceC8708a;

/* renamed from: G6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2896f implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7052a;

    public C2896f(InterfaceC8708a interfaceC8708a) {
        this.f7052a = interfaceC8708a;
    }

    public static C2896f a(InterfaceC8708a interfaceC8708a) {
        return new C2896f(interfaceC8708a);
    }

    public static BluetoothManager c(Context context) {
        return (BluetoothManager) y2.e.d(InterfaceC2891a.c.e(context));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothManager get() {
        return c((Context) this.f7052a.get());
    }
}
