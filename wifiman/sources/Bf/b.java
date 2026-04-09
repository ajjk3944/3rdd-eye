package Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final S8.c f1719a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1720b;

    public b(S8.c band, List signals) {
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(signals, "signals");
        this.f1719a = band;
        this.f1720b = signals;
    }

    public static /* synthetic */ b b(b bVar, S8.c cVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = bVar.f1719a;
        }
        if ((i10 & 2) != 0) {
            list = bVar.f1720b;
        }
        return bVar.a(cVar, list);
    }

    public final b a(S8.c band, List signals) {
        AbstractC6492s.i(band, "band");
        AbstractC6492s.i(signals, "signals");
        return new b(band, signals);
    }

    public final S8.c c() {
        return this.f1719a;
    }

    public final List d() {
        return this.f1720b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1719a == bVar.f1719a && AbstractC6492s.d(this.f1720b, bVar.f1720b);
    }

    public int hashCode() {
        return (this.f1719a.hashCode() * 31) + this.f1720b.hashCode();
    }

    public String toString() {
        return "Model(band=" + this.f1719a + ", signals=" + this.f1720b + ")";
    }
}
