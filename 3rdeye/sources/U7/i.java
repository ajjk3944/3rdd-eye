package U7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: InterstitialProvider.kt */
@h9.e(c = "com.zipoapps.ads.interstitial.InterstitialProvider", f = "InterstitialProvider.kt", l = {64}, m = "loadInterstitial")
/* loaded from: classes3.dex */
public final class i extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public m f12530l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f12531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m<Object> f12532n;

    /* renamed from: o, reason: collision with root package name */
    public int f12533o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, h9.c cVar) {
        super(cVar);
        this.f12532n = mVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f12531m = obj;
        this.f12533o |= RecyclerView.UNDEFINED_DURATION;
        return this.f12532n.b(null, null, null, this);
    }
}
