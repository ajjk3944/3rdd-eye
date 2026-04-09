package M8;

import Cc.InterfaceC2557a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: M8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3284a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12848a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2557a.b f12849b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12850c;

    public C3284a(Map signals, InterfaceC2557a.b bVar, Map statistics) {
        AbstractC6492s.i(signals, "signals");
        AbstractC6492s.i(statistics, "statistics");
        this.f12848a = signals;
        this.f12849b = bVar;
        this.f12850c = statistics;
    }

    public final InterfaceC2557a.b a() {
        return this.f12849b;
    }

    public final Map b() {
        return this.f12848a;
    }

    public final Map c() {
        return this.f12850c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3284a)) {
            return false;
        }
        C3284a c3284a = (C3284a) obj;
        return AbstractC6492s.d(this.f12848a, c3284a.f12848a) && AbstractC6492s.d(this.f12849b, c3284a.f12849b) && AbstractC6492s.d(this.f12850c, c3284a.f12850c);
    }

    public int hashCode() {
        int iHashCode = this.f12848a.hashCode() * 31;
        InterfaceC2557a.b bVar = this.f12849b;
        return ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f12850c.hashCode();
    }

    public String toString() {
        return "DeviceInfoWrapper(signals=" + this.f12848a + ", identifiedDevice=" + this.f12849b + ", statistics=" + this.f12850c + ")";
    }
}
