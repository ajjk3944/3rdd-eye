package w5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public d f36472a;

    /* renamed from: b, reason: collision with root package name */
    public e6.a f36473b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f36474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f36475d;

    /* renamed from: e, reason: collision with root package name */
    public int f36476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ek.c cVar) {
        super(cVar);
        this.f36475d = dVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f36474c = obj;
        this.f36476e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f36475d.e(null, null, this);
    }
}
