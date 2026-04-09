package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* loaded from: classes.dex */
public final class y extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public o f13529l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13530m;

    /* renamed from: n, reason: collision with root package name */
    public Object f13531n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f13532o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13533p;

    /* renamed from: q, reason: collision with root package name */
    public int f13534q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o oVar, h9.c cVar) {
        super(cVar);
        this.f13533p = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13532o = obj;
        this.f13534q |= RecyclerView.UNDEFINED_DURATION;
        LinkedHashSet linkedHashSet = o.f13452k;
        return this.f13533p.i(null, null, this);
    }
}
