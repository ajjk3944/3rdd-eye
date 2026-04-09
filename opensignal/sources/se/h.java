package se;

import android.content.Context;
import android.text.TextUtils;
import cc.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f22021a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22023c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22024d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22025e;

    /* renamed from: f, reason: collision with root package name */
    public final String f22026f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22027g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = gc.c.f9489a;
        s.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f22022b = str;
        this.f22021a = str2;
        this.f22023c = str3;
        this.f22024d = str4;
        this.f22025e = str5;
        this.f22026f = str6;
        this.f22027g = str7;
    }

    public static h a(Context context) {
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(context, 9);
        String strP = cVar.p("google_app_id");
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return new h(strP, cVar.p("google_api_key"), cVar.p("firebase_database_url"), cVar.p("ga_trackingId"), cVar.p("gcm_defaultSenderId"), cVar.p("google_storage_bucket"), cVar.p("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.k(this.f22022b, hVar.f22022b) && s.k(this.f22021a, hVar.f22021a) && s.k(this.f22023c, hVar.f22023c) && s.k(this.f22024d, hVar.f22024d) && s.k(this.f22025e, hVar.f22025e) && s.k(this.f22026f, hVar.f22026f) && s.k(this.f22027g, hVar.f22027g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22022b, this.f22021a, this.f22023c, this.f22024d, this.f22025e, this.f22026f, this.f22027g});
    }

    public final String toString() {
        bm.e eVar = new bm.e(9, this);
        eVar.d(this.f22022b, "applicationId");
        eVar.d(this.f22021a, "apiKey");
        eVar.d(this.f22023c, "databaseUrl");
        eVar.d(this.f22025e, "gcmSenderId");
        eVar.d(this.f22026f, "storageBucket");
        eVar.d(this.f22027g, "projectId");
        return eVar.toString();
    }
}
