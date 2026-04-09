package P7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {331}, m = "waitForConfiguration")
/* loaded from: classes3.dex */
public final class n extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1484a f10777m;

    /* renamed from: n, reason: collision with root package name */
    public int f10778n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C1484a c1484a, h9.c cVar) {
        super(cVar);
        this.f10777m = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10776l = obj;
        this.f10778n |= RecyclerView.UNDEFINED_DURATION;
        w9.i<Object>[] iVarArr = C1484a.f10712m;
        return this.f10777m.g(this);
    }
}
