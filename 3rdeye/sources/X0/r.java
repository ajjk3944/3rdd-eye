package X0;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: SingleProcessDataStore.kt */
@h9.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
/* loaded from: classes.dex */
public final class r extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public o f13490l;

    /* renamed from: m, reason: collision with root package name */
    public Object f13491m;

    /* renamed from: n, reason: collision with root package name */
    public Serializable f13492n;

    /* renamed from: o, reason: collision with root package name */
    public Object f13493o;

    /* renamed from: p, reason: collision with root package name */
    public t f13494p;

    /* renamed from: q, reason: collision with root package name */
    public Iterator f13495q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13496r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o<Object> f13497s;

    /* renamed from: t, reason: collision with root package name */
    public int f13498t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(o oVar, h9.c cVar) {
        super(cVar);
        this.f13497s = oVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f13496r = obj;
        this.f13498t |= RecyclerView.UNDEFINED_DURATION;
        LinkedHashSet linkedHashSet = o.f13452k;
        return this.f13497s.d(this);
    }
}
