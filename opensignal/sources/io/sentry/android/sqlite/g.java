package io.sentry.android.sqlite;

import br.n;

/* loaded from: classes.dex */
public final class g extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12061d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f12062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        super(0);
        this.f12061d = i10;
        this.f12062g = hVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f12061d) {
            case 0:
                return Long.valueOf(this.f12062g.f12063a.j0());
            default:
                return Integer.valueOf(this.f12062g.f12063a.n());
        }
    }
}
