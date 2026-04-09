package dd;

import b8.AbstractC4075b;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f46009a;

    /* renamed from: b, reason: collision with root package name */
    private final inet.ipaddr.g f46010b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f46011c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4075b f46012d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC4075b f46013e;

    /* renamed from: f, reason: collision with root package name */
    private final b8.d f46014f;

    /* renamed from: g, reason: collision with root package name */
    private final List f46015g;

    public i(String host, inet.ipaddr.g gVar, Boolean bool, AbstractC4075b abstractC4075b, AbstractC4075b abstractC4075b2, b8.d dVar, List results) {
        AbstractC6492s.i(host, "host");
        AbstractC6492s.i(results, "results");
        this.f46009a = host;
        this.f46010b = gVar;
        this.f46011c = bool;
        this.f46012d = abstractC4075b;
        this.f46013e = abstractC4075b2;
        this.f46014f = dVar;
        this.f46015g = results;
    }

    public static /* synthetic */ i b(i iVar, String str, inet.ipaddr.g gVar, Boolean bool, AbstractC4075b abstractC4075b, AbstractC4075b abstractC4075b2, b8.d dVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = iVar.f46009a;
        }
        if ((i10 & 2) != 0) {
            gVar = iVar.f46010b;
        }
        inet.ipaddr.g gVar2 = gVar;
        if ((i10 & 4) != 0) {
            bool = iVar.f46011c;
        }
        Boolean bool2 = bool;
        if ((i10 & 8) != 0) {
            abstractC4075b = iVar.f46012d;
        }
        AbstractC4075b abstractC4075b3 = abstractC4075b;
        if ((i10 & 16) != 0) {
            abstractC4075b2 = iVar.f46013e;
        }
        AbstractC4075b abstractC4075b4 = abstractC4075b2;
        if ((i10 & 32) != 0) {
            dVar = iVar.f46014f;
        }
        b8.d dVar2 = dVar;
        if ((i10 & 64) != 0) {
            list = iVar.f46015g;
        }
        return iVar.a(str, gVar2, bool2, abstractC4075b3, abstractC4075b4, dVar2, list);
    }

    public final i a(String host, inet.ipaddr.g gVar, Boolean bool, AbstractC4075b abstractC4075b, AbstractC4075b abstractC4075b2, b8.d dVar, List results) {
        AbstractC6492s.i(host, "host");
        AbstractC6492s.i(results, "results");
        return new i(host, gVar, bool, abstractC4075b, abstractC4075b2, dVar, results);
    }

    public final String c() {
        return this.f46009a;
    }

    public final AbstractC4075b d() {
        return this.f46012d;
    }

    public final b8.d e() {
        return this.f46014f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return AbstractC6492s.d(this.f46009a, iVar.f46009a) && AbstractC6492s.d(this.f46010b, iVar.f46010b) && AbstractC6492s.d(this.f46011c, iVar.f46011c) && AbstractC6492s.d(this.f46012d, iVar.f46012d) && AbstractC6492s.d(this.f46013e, iVar.f46013e) && AbstractC6492s.d(this.f46014f, iVar.f46014f) && AbstractC6492s.d(this.f46015g, iVar.f46015g);
    }

    public final Boolean f() {
        return this.f46011c;
    }

    public final inet.ipaddr.g g() {
        return this.f46010b;
    }

    public final List h() {
        return this.f46015g;
    }

    public int hashCode() {
        int iHashCode = this.f46009a.hashCode() * 31;
        inet.ipaddr.g gVar = this.f46010b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f46011c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        AbstractC4075b abstractC4075b = this.f46012d;
        int iHashCode4 = (iHashCode3 + (abstractC4075b == null ? 0 : abstractC4075b.hashCode())) * 31;
        AbstractC4075b abstractC4075b2 = this.f46013e;
        int iHashCode5 = (iHashCode4 + (abstractC4075b2 == null ? 0 : abstractC4075b2.hashCode())) * 31;
        b8.d dVar = this.f46014f;
        return ((iHashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.f46015g.hashCode();
    }

    public String toString() {
        return "HostLatencyStats(host=" + this.f46009a + ", resolvedIp=" + this.f46010b + ", reachable=" + this.f46011c + ", latency=" + this.f46012d + ", latencyLatest=" + this.f46013e + ", packetLoss=" + this.f46014f + ", results=" + this.f46015g + ")";
    }
}
