package o2;

import androidx.recyclerview.widget.LinearLayoutManager;
import d3.j;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends ek.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f30378a;

    /* renamed from: b, reason: collision with root package name */
    public j f30379b;

    /* renamed from: c, reason: collision with root package name */
    public int f30380c;

    /* renamed from: d, reason: collision with root package name */
    public int f30381d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f30382e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f30383f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, ek.c cVar2) {
        super(cVar2);
        this.f30383f = cVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        this.f30382e = obj;
        this.g |= LinearLayoutManager.INVALID_OFFSET;
        return c.a(this.f30383f, null, null, this);
    }
}
