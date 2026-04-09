package v5;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public r f35908a;

    /* renamed from: b, reason: collision with root package name */
    public f f35909b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f35910c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f35911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f35912e;

    /* renamed from: f, reason: collision with root package name */
    public int f35913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, ek.c cVar) {
        super(cVar);
        this.f35912e = rVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35911d = obj;
        this.f35913f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35912e.f(false, this);
    }
}
