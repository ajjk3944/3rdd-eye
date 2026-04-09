package b5;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p6.i f1909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ci.b f1911c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f.b f1912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f1913e;

    public w(z zVar, p6.i iVar, AtomicReference atomicReference, ci.b bVar, f.b bVar2) {
        this.f1913e = zVar;
        this.f1909a = iVar;
        this.f1910b = atomicReference;
        this.f1911c = bVar;
        this.f1912d = bVar2;
    }

    @Override // b5.y
    public final void a() {
        StringBuilder sb2 = new StringBuilder("fragment_");
        z zVar = this.f1913e;
        sb2.append(zVar.f1934f);
        sb2.append("_rq#");
        sb2.append(zVar.V.getAndIncrement());
        this.f1910b.set(((d.i) this.f1909a.apply(null)).c(sb2.toString(), zVar, this.f1911c, this.f1912d));
    }
}
