package X0;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
/* loaded from: classes.dex */
public final class s extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f13499l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13500m;

    /* renamed from: n, reason: collision with root package name */
    public Object f13501n;

    /* renamed from: o, reason: collision with root package name */
    public kotlin.jvm.internal.w f13502o;

    /* renamed from: p, reason: collision with root package name */
    public o f13503p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f13504q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f13505r;

    /* renamed from: s, reason: collision with root package name */
    public int f13506s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h9.c cVar) {
        super(cVar);
        this.f13505r = tVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13504q = obj;
        this.f13506s |= RecyclerView.UNDEFINED_DURATION;
        return this.f13505r.a(null, this);
    }
}
