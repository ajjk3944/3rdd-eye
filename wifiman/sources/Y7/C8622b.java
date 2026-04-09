package y7;

import java.net.Inet4Address;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: y7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8622b extends AbstractC8624d {

    /* renamed from: b, reason: collision with root package name */
    private final Inet4Address f66377b;

    public C8622b(Inet4Address address) {
        AbstractC6492s.i(address, "address");
        this.f66377b = address;
    }

    @Override // y7.AbstractC8624d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Inet4Address b() {
        return this.f66377b;
    }
}
