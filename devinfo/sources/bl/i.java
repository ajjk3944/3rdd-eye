package bl;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public j f2297a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2298b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f2300d;

    /* renamed from: e, reason: collision with root package name */
    public int f2301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, ck.c cVar) {
        super(cVar);
        this.f2300d = jVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f2299c = obj;
        this.f2301e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f2300d.c(null, this);
    }
}
