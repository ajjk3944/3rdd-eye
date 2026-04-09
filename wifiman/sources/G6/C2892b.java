package G6;

import G6.InterfaceC2891a;
import android.bluetooth.BluetoothAdapter;

/* renamed from: G6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2892b implements y2.c {

    /* renamed from: G6.b$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final C2892b f7048a = new C2892b();
    }

    public static C2892b a() {
        return a.f7048a;
    }

    public static BluetoothAdapter c() {
        return InterfaceC2891a.c.a();
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BluetoothAdapter get() {
        return c();
    }
}
