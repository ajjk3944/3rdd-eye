package v5;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f35914a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f35915b;

    /* renamed from: c, reason: collision with root package name */
    public int f35916c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f35917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f35918e;

    /* renamed from: f, reason: collision with root package name */
    public int f35919f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, ek.c cVar) {
        super(cVar);
        this.f35918e = rVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35917d = obj;
        this.f35919f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35918e.g(null, null, this);
    }
}
