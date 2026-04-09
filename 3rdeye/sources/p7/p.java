package P7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {313}, m = "waitForPremiumStatus")
/* loaded from: classes3.dex */
public final class p extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10785l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1484a f10786m;

    /* renamed from: n, reason: collision with root package name */
    public int f10787n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C1484a c1484a, h9.c cVar) {
        super(cVar);
        this.f10786m = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10785l = obj;
        this.f10787n |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = C1484a.f10712m;
        return this.f10786m.h(this);
    }
}
