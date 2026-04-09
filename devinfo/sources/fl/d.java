package fl;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public e f24070a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f24072c;

    /* renamed from: d, reason: collision with root package name */
    public int f24073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ek.c cVar) {
        super(cVar);
        this.f24072c = eVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f24071b = obj;
        this.f24073d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f24072c.d(this);
    }
}
