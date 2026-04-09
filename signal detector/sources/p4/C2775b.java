package p4;

import com.google.android.gms.internal.ads.C1268hc;
import j2.C2556l;
import v2.AbstractC2960a;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2775b extends E2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2777d f22876d;

    public C2775b(C2777d c2777d) {
        this.f22876d = c2777d;
    }

    @Override // j2.u
    public final void c(C2556l c2556l) {
        C2777d c2777d = this.f22876d;
        c2777d.f22879a = null;
        c2777d.f22880b = false;
        c2777d.f22881c = 0L;
    }

    @Override // j2.u
    public final void f(Object obj) {
        AbstractC2960a abstractC2960a = (AbstractC2960a) obj;
        q5.i.e(abstractC2960a, "interstitialAd");
        C2777d c2777d = this.f22876d;
        c2777d.f22879a = (C1268hc) abstractC2960a;
        c2777d.f22880b = false;
        c2777d.f22881c = System.currentTimeMillis();
    }
}
