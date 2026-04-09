package uv;

import br.n;
import ir.d;

/* loaded from: classes.dex */
public final class a extends n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f23716d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sv.a f23717g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f23718r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ar.a f23719x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, sv.a aVar, d dVar, ar.a aVar2) {
        super(0);
        this.f23716d = bVar;
        this.f23717g = aVar;
        this.f23718r = dVar;
        this.f23719x = aVar2;
    }

    @Override // ar.a
    public final Object c() {
        d dVar = this.f23718r;
        return this.f23716d.b(this.f23719x, dVar, this.f23717g);
    }
}
