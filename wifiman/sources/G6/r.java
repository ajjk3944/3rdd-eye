package G6;

import G6.InterfaceC2891a;
import android.content.Context;
import android.location.LocationManager;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class r implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f7069a;

    public r(InterfaceC8708a interfaceC8708a) {
        this.f7069a = interfaceC8708a;
    }

    public static r a(InterfaceC8708a interfaceC8708a) {
        return new r(interfaceC8708a);
    }

    public static LocationManager c(Context context) {
        return (LocationManager) y2.e.d(InterfaceC2891a.c.q(context));
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LocationManager get() {
        return c((Context) this.f7069a.get());
    }
}
