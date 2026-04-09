package P6;

import android.content.ContentResolver;
import android.location.LocationManager;
import z2.InterfaceC8708a;

/* loaded from: classes3.dex */
public final class n implements y2.c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8708a f18089a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8708a f18090b;

    public n(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        this.f18089a = interfaceC8708a;
        this.f18090b = interfaceC8708a2;
    }

    public static n a(InterfaceC8708a interfaceC8708a, InterfaceC8708a interfaceC8708a2) {
        return new n(interfaceC8708a, interfaceC8708a2);
    }

    public static m c(ContentResolver contentResolver, LocationManager locationManager) {
        return new m(contentResolver, locationManager);
    }

    @Override // z2.InterfaceC8708a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((ContentResolver) this.f18089a.get(), (LocationManager) this.f18090b.get());
    }
}
