package v5;

import al.c0;
import androidx.recyclerview.widget.LinearLayoutManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35878a;

    /* renamed from: b, reason: collision with root package name */
    public int f35879b;

    /* renamed from: c, reason: collision with root package name */
    public al.i f35880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f35881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c0 c0Var, ck.c cVar) {
        super(cVar);
        this.f35881d = c0Var;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35878a = obj;
        this.f35879b |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35881d.c(null, this);
    }
}
