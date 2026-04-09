package P7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager", f = "AdManager.kt", l = {184, 193}, m = "initializeAdSDK$premium_helper_5_0_3_regularRelease")
/* loaded from: classes3.dex */
public final class j extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public C1484a f10751l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f10752m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1484a f10753n;

    /* renamed from: o, reason: collision with root package name */
    public int f10754o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C1484a c1484a, h9.c cVar) {
        super(cVar);
        this.f10753n = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10752m = obj;
        this.f10754o |= RecyclerView.UNDEFINED_DURATION;
        return this.f10753n.f(this);
    }
}
