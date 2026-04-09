package v5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public r f35920a;

    /* renamed from: b, reason: collision with root package name */
    public String f35921b;

    /* renamed from: c, reason: collision with root package name */
    public mk.c f35922c;

    /* renamed from: d, reason: collision with root package name */
    public f f35923d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f35924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f35925f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, ek.c cVar) {
        super(cVar);
        this.f35925f = rVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35924e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35925f.a(null, null, this);
    }
}
