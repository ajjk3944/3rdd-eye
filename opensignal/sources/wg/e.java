package wg;

import android.net.Uri;
import java.net.URL;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final tg.b f24501a;

    /* renamed from: b, reason: collision with root package name */
    public final pq.h f24502b;

    public e(tg.b bVar, pq.h hVar) {
        br.l.e(bVar, "appInfo");
        br.l.e(hVar, "blockingDispatcher");
        this.f24501a = bVar;
        this.f24502b = hVar;
    }

    public static final URL a(e eVar) {
        eVar.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        tg.b bVar = eVar.f24501a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(bVar.f22734a).appendPath("settings");
        tg.a aVar = bVar.f22736c;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", aVar.f22716c).appendQueryParameter("display_version", aVar.f22715b).build().toString());
    }
}
