package jf;

import hf.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: jf.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6324g {

    /* renamed from: a, reason: collision with root package name */
    private final s9.b f50827a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f50828b;

    /* renamed from: c, reason: collision with root package name */
    private final s9.d f50829c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.d f50830d;

    /* renamed from: e, reason: collision with root package name */
    private final t.a f50831e;

    /* renamed from: f, reason: collision with root package name */
    private final s9.d f50832f;

    /* renamed from: g, reason: collision with root package name */
    private final List f50833g;

    public C6324g(s9.b connectionIcon, s9.d connectionType, s9.d targetInfo, s9.d timestamp, t.a topology, s9.d dVar, List resultDetails) {
        AbstractC6492s.i(connectionIcon, "connectionIcon");
        AbstractC6492s.i(connectionType, "connectionType");
        AbstractC6492s.i(targetInfo, "targetInfo");
        AbstractC6492s.i(timestamp, "timestamp");
        AbstractC6492s.i(topology, "topology");
        AbstractC6492s.i(resultDetails, "resultDetails");
        this.f50827a = connectionIcon;
        this.f50828b = connectionType;
        this.f50829c = targetInfo;
        this.f50830d = timestamp;
        this.f50831e = topology;
        this.f50832f = dVar;
        this.f50833g = resultDetails;
    }

    public final s9.b a() {
        return this.f50827a;
    }

    public final s9.d b() {
        return this.f50828b;
    }

    public final s9.d c() {
        return this.f50832f;
    }

    public final List d() {
        return this.f50833g;
    }

    public final s9.d e() {
        return this.f50829c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6324g)) {
            return false;
        }
        C6324g c6324g = (C6324g) obj;
        return AbstractC6492s.d(this.f50827a, c6324g.f50827a) && AbstractC6492s.d(this.f50828b, c6324g.f50828b) && AbstractC6492s.d(this.f50829c, c6324g.f50829c) && AbstractC6492s.d(this.f50830d, c6324g.f50830d) && AbstractC6492s.d(this.f50831e, c6324g.f50831e) && AbstractC6492s.d(this.f50832f, c6324g.f50832f) && AbstractC6492s.d(this.f50833g, c6324g.f50833g);
    }

    public final s9.d f() {
        return this.f50830d;
    }

    public final t.a g() {
        return this.f50831e;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f50827a.hashCode() * 31) + this.f50828b.hashCode()) * 31) + this.f50829c.hashCode()) * 31) + this.f50830d.hashCode()) * 31) + this.f50831e.hashCode()) * 31;
        s9.d dVar = this.f50832f;
        return ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.f50833g.hashCode();
    }

    public String toString() {
        return "ResultCard(connectionIcon=" + this.f50827a + ", connectionType=" + this.f50828b + ", targetInfo=" + this.f50829c + ", timestamp=" + this.f50830d + ", topology=" + this.f50831e + ", note=" + this.f50832f + ", resultDetails=" + this.f50833g + ")";
    }
}
