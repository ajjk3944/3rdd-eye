package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
/* loaded from: classes.dex */
public final class v extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public o f13515l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13516m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13517n;

    /* renamed from: o, reason: collision with root package name */
    public int f13518o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o oVar, h9.c cVar) {
        super(cVar);
        this.f13517n = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13516m = obj;
        this.f13518o |= RecyclerView.UNDEFINED_DURATION;
        LinkedHashSet linkedHashSet = o.f13452k;
        return this.f13517n.f(this);
    }
}
