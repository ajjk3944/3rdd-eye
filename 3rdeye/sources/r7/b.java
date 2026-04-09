package R7;

import A9.E;
import I9.g;
import b9.C1992A;
import b9.n;
import f9.InterfaceC4347e;
import h9.i;
import p9.p;

/* compiled from: BannerManager.kt */
@h9.e(c = "com.zipoapps.ads.banner.BannerManager$loadBanner$3", f = "BannerManager.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<E, InterfaceC4347e<? super a>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f11758l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.banner.a f11759m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f11760n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.ads.banner.b f11761o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.zipoapps.ads.banner.a aVar, boolean z10, com.zipoapps.ads.banner.b bVar, InterfaceC4347e<? super b> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f11759m = aVar;
        this.f11760n = z10;
        this.f11761o = bVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new b(this.f11759m, this.f11760n, this.f11761o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super a> interfaceC4347e) {
        return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f11758l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return obj;
        }
        n.b(obj);
        com.zipoapps.ads.banner.a aVar2 = this.f11759m;
        aVar2.getClass();
        c cVar = new c(aVar2, this.f11760n);
        g gVar = aVar2.f36968g;
        com.zipoapps.ads.banner.b bVar = this.f11761o;
        String strK = bVar.f36974a == e.MEDIUM_RECTANGLE ? aVar2.f36969h.k() : aVar2.f36969h.i();
        this.f11758l = 1;
        Object objX = gVar.X(strK, bVar, cVar, this);
        return objX == aVar ? aVar : objX;
    }
}
