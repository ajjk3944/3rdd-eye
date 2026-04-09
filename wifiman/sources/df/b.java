package Df;

import Af.q;
import Af.r;
import Zg.AbstractC3689v;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import m8.AbstractC6780c;
import s9.d;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List f3303a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f3304b;

    /* renamed from: c, reason: collision with root package name */
    private final r f3305c;

    public b(List channels, s9.d security) {
        AbstractC6492s.i(channels, "channels");
        AbstractC6492s.i(security, "security");
        this.f3303a = channels;
        this.f3304b = security;
        Pe.a aVar = Pe.a.f18599a;
        this.f3305c = new r(AbstractC3689v.o(new q(aVar.b(), new d.b(AbstractC6780c.f53400S4), new d.c(AbstractC3689v.z0(channels, ", ", null, null, 0, null, null, 62, null))), new q(aVar.t(), new d.b(AbstractC6780c.f53407T4), security)));
    }

    public final r a() {
        return this.f3305c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f3303a, bVar.f3303a) && AbstractC6492s.d(this.f3304b, bVar.f3304b);
    }

    public int hashCode() {
        return (this.f3303a.hashCode() * 31) + this.f3304b.hashCode();
    }

    public String toString() {
        return "Model(channels=" + this.f3303a + ", security=" + this.f3304b + ")";
    }
}
