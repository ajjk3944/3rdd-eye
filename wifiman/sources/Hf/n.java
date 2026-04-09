package hf;

import b8.AbstractC4075b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final W7.a f48688a;

    /* renamed from: b, reason: collision with root package name */
    private final W7.a f48689b;

    /* renamed from: c, reason: collision with root package name */
    private final W7.a f48690c;

    /* renamed from: d, reason: collision with root package name */
    private final s9.b f48691d;

    /* renamed from: e, reason: collision with root package name */
    private final s9.d f48692e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4075b f48693f;

    public n(W7.a aVar, W7.a aVar2, W7.a throughputMax, s9.b endpointIcon, s9.d endpoint, AbstractC4075b abstractC4075b) {
        AbstractC6492s.i(throughputMax, "throughputMax");
        AbstractC6492s.i(endpointIcon, "endpointIcon");
        AbstractC6492s.i(endpoint, "endpoint");
        this.f48688a = aVar;
        this.f48689b = aVar2;
        this.f48690c = throughputMax;
        this.f48691d = endpointIcon;
        this.f48692e = endpoint;
        this.f48693f = abstractC4075b;
    }

    public final W7.a a() {
        return this.f48688a;
    }

    public final s9.d b() {
        return this.f48692e;
    }

    public final s9.b c() {
        return this.f48691d;
    }

    public final AbstractC4075b d() {
        return this.f48693f;
    }

    public final W7.a e() {
        return this.f48690c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC6492s.d(this.f48688a, nVar.f48688a) && AbstractC6492s.d(this.f48689b, nVar.f48689b) && AbstractC6492s.d(this.f48690c, nVar.f48690c) && AbstractC6492s.d(this.f48691d, nVar.f48691d) && AbstractC6492s.d(this.f48692e, nVar.f48692e) && AbstractC6492s.d(this.f48693f, nVar.f48693f);
    }

    public final W7.a f() {
        return this.f48689b;
    }

    public int hashCode() {
        W7.a aVar = this.f48688a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        W7.a aVar2 = this.f48689b;
        int iHashCode2 = (((((((iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31) + this.f48690c.hashCode()) * 31) + this.f48691d.hashCode()) * 31) + this.f48692e.hashCode()) * 31;
        AbstractC4075b abstractC4075b = this.f48693f;
        return iHashCode2 + (abstractC4075b != null ? abstractC4075b.hashCode() : 0);
    }

    public String toString() {
        return "MeasurementModel(down=" + this.f48688a + ", up=" + this.f48689b + ", throughputMax=" + this.f48690c + ", endpointIcon=" + this.f48691d + ", endpoint=" + this.f48692e + ", latency=" + this.f48693f + ")";
    }
}
