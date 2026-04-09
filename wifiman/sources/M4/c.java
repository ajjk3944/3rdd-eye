package M4;

import Zg.U;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f12499a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12500b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f12501c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        AbstractC6492s.i(sessionId, "sessionId");
    }

    public final Map a() {
        return this.f12501c;
    }

    public final String b() {
        return this.f12499a;
    }

    public final long c() {
        return this.f12500b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC6492s.d(this.f12499a, cVar.f12499a) && this.f12500b == cVar.f12500b && AbstractC6492s.d(this.f12501c, cVar.f12501c);
    }

    public int hashCode() {
        return (((this.f12499a.hashCode() * 31) + Long.hashCode(this.f12500b)) * 31) + this.f12501c.hashCode();
    }

    public String toString() {
        return "EventMetadata(sessionId=" + this.f12499a + ", timestamp=" + this.f12500b + ", additionalCustomKeys=" + this.f12501c + ')';
    }

    public c(String sessionId, long j10, Map additionalCustomKeys) {
        AbstractC6492s.i(sessionId, "sessionId");
        AbstractC6492s.i(additionalCustomKeys, "additionalCustomKeys");
        this.f12499a = sessionId;
        this.f12500b = j10;
        this.f12501c = additionalCustomKeys;
    }

    public /* synthetic */ c(String str, long j10, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, (i10 & 4) != 0 ? U.h() : map);
    }
}
