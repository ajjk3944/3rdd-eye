package y1;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.w;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {114, 118, 541, 147}, m = "useConnection")
/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5793d<R> extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f47927l;

    /* renamed from: m, reason: collision with root package name */
    public Object f47928m;

    /* renamed from: n, reason: collision with root package name */
    public j f47929n;

    /* renamed from: o, reason: collision with root package name */
    public w f47930o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC4350h f47931p;

    /* renamed from: q, reason: collision with root package name */
    public w f47932q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f47933r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f47934s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C5796g f47935t;

    /* renamed from: u, reason: collision with root package name */
    public int f47936u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5793d(C5796g c5796g, h9.c cVar) {
        super(cVar);
        this.f47935t = c5796g;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f47934s = obj;
        this.f47936u |= RecyclerView.UNDEFINED_DURATION;
        return this.f47935t.Z(false, null, this);
    }
}
