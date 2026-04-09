package pf;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class w extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f31909a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31910b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f31911c;

    /* renamed from: d, reason: collision with root package name */
    public int f31912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, ek.c cVar) {
        super(cVar);
        this.f31911c = tVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f31910b = obj;
        this.f31912d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f31911c.a(null, this);
    }
}
