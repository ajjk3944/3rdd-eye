package U7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InterstitialProvider.kt */
@h9.e(c = "com.zipoapps.ads.interstitial.InterstitialProvider", f = "InterstitialProvider.kt", l = {31}, m = "waitForInterstitial")
/* loaded from: classes3.dex */
public final class k extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f12541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m<Object> f12542m;

    /* renamed from: n, reason: collision with root package name */
    public int f12543n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, h9.c cVar) {
        super(cVar);
        this.f12542m = mVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f12541l = obj;
        this.f12543n |= RecyclerView.UNDEFINED_DURATION;
        return this.f12542m.f(0L, this);
    }
}
