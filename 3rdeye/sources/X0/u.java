package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
/* loaded from: classes.dex */
public final class u extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public o f13511l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13513n;

    /* renamed from: o, reason: collision with root package name */
    public int f13514o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, h9.c cVar) {
        super(cVar);
        this.f13513n = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13512m = obj;
        this.f13514o |= RecyclerView.UNDEFINED_DURATION;
        LinkedHashSet linkedHashSet = o.f13452k;
        return this.f13513n.e(this);
    }
}
