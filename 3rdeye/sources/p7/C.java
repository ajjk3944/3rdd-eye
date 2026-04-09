package P7;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager", f = "PhConsentManager.kt", l = {167}, m = "waitForConsentForm")
/* loaded from: classes3.dex */
public final class C extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10677l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f10678m;

    /* renamed from: n, reason: collision with root package name */
    public int f10679n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(x xVar, h9.c cVar) {
        super(cVar);
        this.f10678m = xVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10677l = obj;
        this.f10679n |= RecyclerView.UNDEFINED_DURATION;
        return this.f10678m.g(this);
    }
}
