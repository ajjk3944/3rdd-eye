package x0;

import lq.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements ar.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24712a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ar.k f24713d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ar.k f24714g;

    public /* synthetic */ k(ar.k kVar, ar.k kVar2, int i10) {
        this.f24712a = i10;
        this.f24713d = kVar;
        this.f24714g = kVar2;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f24712a) {
            case 0:
                this.f24713d.a(obj);
                this.f24714g.a(obj);
                break;
            default:
                this.f24713d.a(obj);
                this.f24714g.a(obj);
                break;
        }
        return b0.f15562a;
    }
}
