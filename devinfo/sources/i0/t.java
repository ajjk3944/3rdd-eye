package i0;

import androidx.recyclerview.widget.LinearLayoutManager;
import c0.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public v0 f25502a;

    /* renamed from: b, reason: collision with root package name */
    public ek.j f25503b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f25505d;

    /* renamed from: e, reason: collision with root package name */
    public int f25506e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, ek.c cVar) {
        super(cVar);
        this.f25505d = uVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f25504c = obj;
        this.f25506e |= LinearLayoutManager.INVALID_OFFSET;
        return this.f25505d.f(null, null, this);
    }
}
