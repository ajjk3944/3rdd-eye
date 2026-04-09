package al;

import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public bl.w f465a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f467c;

    /* renamed from: d, reason: collision with root package name */
    public int f468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var, ck.c cVar) {
        super(cVar);
        this.f467c = f0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f466b = obj;
        this.f468d |= LinearLayoutManager.INVALID_OFFSET;
        return this.f467c.a(null, this);
    }
}
