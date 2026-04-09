package fq;

import br.l;

/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9034a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.f f9035b;

    public f(boolean z10, g1.f fVar) {
        l.e(fVar, "presentationStateProvider");
        this.f9034a = z10;
        this.f9035b = fVar;
    }

    @Override // yn.a
    public final boolean a() {
        return (this.f9034a && this.f9035b.f9208a) ? false : true;
    }
}
