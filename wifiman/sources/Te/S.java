package Te;

import b8.AbstractC4075b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    private final b8.d f21755a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4075b f21756b;

    public S(b8.d dVar, AbstractC4075b abstractC4075b) {
        this.f21755a = dVar;
        this.f21756b = abstractC4075b;
    }

    public final AbstractC4075b a() {
        return this.f21756b;
    }

    public final b8.d b() {
        return this.f21755a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        return AbstractC6492s.d(this.f21755a, s10.f21755a) && AbstractC6492s.d(this.f21756b, s10.f21756b);
    }

    public int hashCode() {
        b8.d dVar = this.f21755a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        AbstractC4075b abstractC4075b = this.f21756b;
        return iHashCode + (abstractC4075b != null ? abstractC4075b.hashCode() : 0);
    }

    public String toString() {
        return "Model(packetLoss=" + this.f21755a + ", dnsLatency=" + this.f21756b + ")";
    }
}
