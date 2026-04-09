package cq;

import com.survicate.surveys.entities.models.ActiveEventHistory;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6606a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f6607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6608c;

    /* renamed from: d, reason: collision with root package name */
    public final ActiveEventHistory f6609d;

    public a(String str, Map map, long j, ActiveEventHistory activeEventHistory) {
        this.f6606a = str;
        this.f6607b = map;
        this.f6608c = j;
        this.f6609d = activeEventHistory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f6606a, aVar.f6606a) && br.l.a(this.f6607b, aVar.f6607b) && this.f6608c == aVar.f6608c && br.l.a(this.f6609d, aVar.f6609d);
    }

    public final int hashCode() {
        int iB = h0.b.b((this.f6607b.hashCode() + (this.f6606a.hashCode() * 31)) * 31, 31, this.f6608c);
        ActiveEventHistory activeEventHistory = this.f6609d;
        return iB + (activeEventHistory == null ? 0 : activeEventHistory.hashCode());
    }

    public final String toString() {
        return "ActiveEvent(name=" + this.f6606a + ", properties=" + this.f6607b + ", invokeTimeMs=" + this.f6608c + ", history=" + this.f6609d + ')';
    }
}
