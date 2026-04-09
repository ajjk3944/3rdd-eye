package P7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PhConsentManager.kt */
@h9.e(c = "com.zipoapps.ads.PhConsentManager", f = "PhConsentManager.kt", l = {242}, m = "askForConsentIfRequired")
/* loaded from: classes3.dex */
public final class y extends h9.c {

    /* renamed from: l, reason: collision with root package name */
    public x f10841l;

    /* renamed from: m, reason: collision with root package name */
    public AppCompatActivity f10842m;

    /* renamed from: n, reason: collision with root package name */
    public p9.l f10843n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10844o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10845p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ x f10846q;

    /* renamed from: r, reason: collision with root package name */
    public int f10847r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x xVar, h9.c cVar) {
        super(cVar);
        this.f10846q = xVar;
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        this.f10845p = obj;
        this.f10847r |= RecyclerView.UNDEFINED_DURATION;
        return this.f10846q.a(null, false, null, this);
    }
}
