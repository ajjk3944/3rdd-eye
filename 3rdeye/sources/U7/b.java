package U7;

import J8.S;
import J8.y;

/* compiled from: InterstitialCappingCoordinator.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final S f12503a;

    /* renamed from: b, reason: collision with root package name */
    public final S f12504b;

    public b(S s10, S s11) {
        this.f12503a = s10;
        this.f12504b = s11;
    }

    public final boolean a(y type) {
        kotlin.jvm.internal.l.f(type, "type");
        if (type.equals(y.a.f2908a)) {
            return this.f12503a.a();
        }
        if (type.equals(y.b.f2909a)) {
            return this.f12504b.a();
        }
        throw new b9.j();
    }
}
