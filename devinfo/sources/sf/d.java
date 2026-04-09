package sf;

import android.net.Uri;
import java.net.URL;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final pf.b f33573a;

    /* renamed from: b, reason: collision with root package name */
    public final ck.h f33574b;

    public d(pf.b bVar, ck.h hVar) {
        nk.k.e(bVar, "appInfo");
        nk.k.e(hVar, "blockingDispatcher");
        this.f33573a = bVar;
        this.f33574b = hVar;
    }

    public static final URL a(d dVar) {
        dVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        pf.b bVar = dVar.f33573a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f31764a).appendPath("settings");
        pf.a aVar = bVar.f31765b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f31758c).appendQueryParameter("display_version", aVar.f31757b).build().toString());
    }
}
