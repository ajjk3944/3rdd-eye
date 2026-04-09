package b7;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final t5.s f1978a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1979b = new d(0);

    public e(t5.s sVar) {
        this.f1978a = sVar;
    }

    public final List a(String str) {
        nk.k.e(str, FacebookMediationAdapter.KEY_ID);
        return (List) com.bumptech.glide.f.r(this.f1978a, true, false, new c(str, 0));
    }
}
