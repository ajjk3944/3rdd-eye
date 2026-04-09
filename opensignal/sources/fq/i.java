package fq;

import br.l;
import cq.k;

/* loaded from: classes.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9045a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f9046b;

    /* renamed from: c, reason: collision with root package name */
    public final k f9047c;

    /* renamed from: d, reason: collision with root package name */
    public final no.b f9048d;

    public i(String str, Double d6, k kVar, no.b bVar) {
        l.e(str, "surveyId");
        l.e(bVar, "logger");
        this.f9045a = str;
        this.f9046b = d6;
        this.f9047c = kVar;
        this.f9048d = bVar;
    }

    @Override // yn.a
    public final boolean a() {
        k kVar = k.FAILURE;
        k kVar2 = this.f9047c;
        if (kVar2 == kVar) {
            ((sm.f) this.f9048d).M("Survey " + this.f9045a + " had " + this.f9046b + "% chance to be shown and it failed.");
        }
        return kVar2 == k.SUCCESS;
    }
}
