package p4;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f31323a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31324b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f31325c;

    /* renamed from: d, reason: collision with root package name */
    public nk.u f31326d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31327e;

    /* renamed from: f, reason: collision with root package name */
    public int f31328f;
    public /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f31329h;

    /* renamed from: i, reason: collision with root package name */
    public int f31330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, ek.c cVar) {
        super(cVar);
        this.f31329h = zVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.f31330i |= LinearLayoutManager.INVALID_OFFSET;
        return z.f(this.f31329h, false, this);
    }
}
