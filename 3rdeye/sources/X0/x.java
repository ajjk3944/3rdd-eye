package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
/* loaded from: classes.dex */
public final class x extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public Object f13524l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13525m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f13526n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13527o;

    /* renamed from: p, reason: collision with root package name */
    public int f13528p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(o oVar, h9.c cVar) {
        super(cVar);
        this.f13527o = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13526n = obj;
        this.f13528p |= RecyclerView.UNDEFINED_DURATION;
        LinkedHashSet linkedHashSet = o.f13452k;
        return this.f13527o.h(this);
    }
}
