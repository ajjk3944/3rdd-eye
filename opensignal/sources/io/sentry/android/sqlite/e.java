package io.sentry.android.sqlite;

import br.n;

/* loaded from: classes.dex */
public final class e extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12055d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f f12056g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i10) {
        super(0);
        this.f12055d = i10;
        this.f12056g = fVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f12055d) {
            case 0:
                f fVar = this.f12056g;
                return new d(fVar.f12057a.F(), fVar.f12058d);
            default:
                f fVar2 = this.f12056g;
                return new d(fVar2.f12057a.I(), fVar2.f12058d);
        }
    }
}
