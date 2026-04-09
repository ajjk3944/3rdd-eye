package v5;

import androidx.recyclerview.widget.LinearLayoutManager;
import t5.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public r f35902a;

    /* renamed from: b, reason: collision with root package name */
    public v f35903b;

    /* renamed from: c, reason: collision with root package name */
    public f f35904c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f35905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f35906e;

    /* renamed from: f, reason: collision with root package name */
    public int f35907f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, ek.c cVar) {
        super(cVar);
        this.f35906e = rVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f35905d = obj;
        this.f35907f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f35906e.e(null, this);
    }
}
