package io.sentry.android.sqlite;

import br.n;

/* loaded from: classes.dex */
public final class b extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f12046d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12047g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12048r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, int i10, int i11) {
        super(0);
        this.f12046d = cVar;
        this.f12047g = i10;
        this.f12048r = i11;
    }

    @Override // ar.a
    public final Object c() {
        return Boolean.valueOf(this.f12046d.f12049a.onMove(this.f12047g, this.f12048r));
    }
}
