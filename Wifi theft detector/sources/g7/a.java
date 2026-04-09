package g7;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public c7.a f21205a;

    public a(c7.a aVar) {
        this.f21205a = aVar;
    }

    public AdRequest a() {
        return c().build();
    }

    public AdRequest b(String str) {
        return str.isEmpty() ? a() : c().setAdString(str).build();
    }

    public AdRequest.Builder c() {
        return new AdRequest.Builder().setRequestAgent(this.f21205a.b()).addNetworkExtrasBundle(AdMobAdapter.class, this.f21205a.a());
    }
}
