package i8;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {616, 618}, m = "initAnalytics")
/* loaded from: classes3.dex */
public final class h extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public com.zipoapps.premiumhelper.e f38591l;

    /* renamed from: m, reason: collision with root package name */
    public C4461a f38592m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f38593n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38594o;

    /* renamed from: p, reason: collision with root package name */
    public int f38595p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.zipoapps.premiumhelper.e eVar, h9.c cVar) {
        super(cVar);
        this.f38594o = eVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f38593n = obj;
        this.f38595p |= RecyclerView.UNDEFINED_DURATION;
        return com.zipoapps.premiumhelper.e.a(this.f38594o, this);
    }
}
