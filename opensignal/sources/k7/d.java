package k7;

import br.l;
import i7.f;
import java.util.ArrayList;
import java.util.List;
import tt.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f14184a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14185b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14186c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14187d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public d(String str, boolean z10, List list, List list2) {
        this.f14184a = str;
        this.f14185b = z10;
        this.f14186c = list;
        this.f14187d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(f.ASC.name());
            }
        }
        this.f14187d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f14184a;
            if (this.f14185b == dVar.f14185b && this.f14186c.equals(dVar.f14186c) && l.a(this.f14187d, dVar.f14187d)) {
                String str2 = this.f14184a;
                return s.n0(str2, "index_", false) ? s.n0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14184a;
        return this.f14187d.hashCode() + h0.b.c((((s.n0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f14185b ? 1 : 0)) * 31, 31, this.f14186c);
    }

    public final String toString() {
        return "Index{name='" + this.f14184a + "', unique=" + this.f14185b + ", columns=" + this.f14186c + ", orders=" + this.f14187d + "'}";
    }
}
