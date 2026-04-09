package uv;

import br.l;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final sv.a f23725d = new sv.a("-Root-");

    /* renamed from: a, reason: collision with root package name */
    public final sv.a f23726a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23727b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f23728c;

    public c(sv.a aVar, boolean z10) {
        l.e(aVar, "qualifier");
        this.f23726a = aVar;
        this.f23727b = z10;
        this.f23728c = new HashSet();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f23726a, cVar.f23726a) && this.f23727b == cVar.f23727b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.f23726a.f22363a.hashCode() * 31;
        boolean z10 = this.f23727b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScopeDefinition(qualifier=");
        sb2.append(this.f23726a);
        sb2.append(", isRoot=");
        return c7.a.r(sb2, this.f23727b, ')');
    }
}
