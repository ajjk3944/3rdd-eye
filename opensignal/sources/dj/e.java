package dj;

import br.l;
import cj.n;
import p.l2;

/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7396a;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7397d;

    public e(ch.d dVar, boolean z10) {
        l.e(dVar, "serviceLocator");
        this.f7396a = dVar;
        this.f7397d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f7396a, eVar.f7396a) && this.f7397d == eVar.f7397d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7397d) + (this.f7396a.hashCode() * 31);
    }

    @Override // cj.n
    public final void run() throws Throwable {
        StringBuilder sb2 = new StringBuilder("Set collection consent to ");
        boolean z10 = this.f7397d;
        sb2.append(z10);
        ch.n.b("SetCollectionConsentCommand", sb2.toString());
        ch.d dVar = this.f7396a;
        l2 l2VarS0 = dVar.s0();
        if (l2VarS0.D() == z10) {
            ch.n.c("SetCollectionConsentCommand", "Data Consent is already updated. Do nothing.");
            return;
        }
        om.f fVar = (om.f) l2VarS0.f20100d;
        synchronized (((qj.a) fVar.f19554d)) {
            fVar.u("gdpr_consent_given", String.valueOf(z10));
        }
        if (z10) {
            ch.n.b("SetCollectionConsentCommand", "Consent given. Start monitoring");
            new g(dVar).run();
        } else {
            ch.n.b("SetCollectionConsentCommand", "Consent withdrawn. Stop monitoring");
            new h(dVar, 0).run();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetCollectionConsentCommand(serviceLocator=");
        sb2.append(this.f7396a);
        sb2.append(", consentGiven=");
        return c7.a.r(sb2, this.f7397d, ')');
    }
}
