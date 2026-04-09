package l8;

import androidx.recyclerview.widget.RecyclerView;
import h9.e;

/* compiled from: Configuration.kt */
@e(c = "com.zipoapps.premiumhelper.configuration.Configuration", f = "Configuration.kt", l = {160, 162}, m = "allValuesToString$premium_helper_5_0_3_regularRelease")
/* loaded from: classes3.dex */
public final class c extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public b f43917l;

    /* renamed from: m, reason: collision with root package name */
    public StringBuilder f43918m;

    /* renamed from: n, reason: collision with root package name */
    public StringBuilder f43919n;

    /* renamed from: o, reason: collision with root package name */
    public StringBuilder f43920o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f43921p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f43922q;

    /* renamed from: r, reason: collision with root package name */
    public int f43923r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, h9.c cVar) {
        super(cVar);
        this.f43922q = bVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f43921p = obj;
        this.f43923r |= RecyclerView.UNDEFINED_DURATION;
        return this.f43922q.f(this);
    }
}
