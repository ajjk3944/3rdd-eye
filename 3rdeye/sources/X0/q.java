package X0;

import A9.C0597q;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* loaded from: classes.dex */
public final class q extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f13484l;

    /* renamed from: m, reason: collision with root package name */
    public o f13485m;

    /* renamed from: n, reason: collision with root package name */
    public C0597q f13486n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13487o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13488p;

    /* renamed from: q, reason: collision with root package name */
    public int f13489q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, h9.c cVar) {
        super(cVar);
        this.f13488p = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13487o = obj;
        this.f13489q |= RecyclerView.UNDEFINED_DURATION;
        return o.b(this.f13488p, null, this);
    }
}
