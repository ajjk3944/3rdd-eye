package th;

import com.applovin.sdk.AppLovinEventParameters;
import java.util.List;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final k f34637a;

    /* renamed from: b, reason: collision with root package name */
    public final List f34638b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34639c;

    /* renamed from: d, reason: collision with root package name */
    public final List f34640d;

    public m(k kVar, List list, String str, List list2) {
        nk.k.e(kVar, "page");
        nk.k.e(list, "apps");
        nk.k.e(str, AppLovinEventParameters.SEARCH_QUERY);
        this.f34637a = kVar;
        this.f34638b = list;
        this.f34639c = str;
        this.f34640d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f34637a == mVar.f34637a && nk.k.a(this.f34638b, mVar.f34638b) && nk.k.a(this.f34639c, mVar.f34639c) && nk.k.a(this.f34640d, mVar.f34640d);
    }

    public final int hashCode() {
        return this.f34640d.hashCode() + u.m((this.f34638b.hashCode() + (this.f34637a.hashCode() * 31)) * 31, 31, this.f34639c);
    }

    public final String toString() {
        return "TabAppsState(page=" + this.f34637a + ", apps=" + this.f34638b + ", query=" + this.f34639c + ", results=" + this.f34640d + ")";
    }
}
