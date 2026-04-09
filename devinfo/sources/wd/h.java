package wd;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.liuzh.deviceinfo.R;
import java.util.Arrays;
import km.n;
import km.o;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f36627a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36629c;

    /* renamed from: d, reason: collision with root package name */
    public final String f36630d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36631e;

    /* renamed from: f, reason: collision with root package name */
    public final String f36632f;
    public final String g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i4 = tb.d.f34539a;
        y.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f36628b = str;
        this.f36627a = str2;
        this.f36629c = str3;
        this.f36630d = str4;
        this.f36631e = str5;
        this.f36632f = str6;
        this.g = str7;
    }

    public static h a(Context context) {
        o oVar = new o();
        y.h(context);
        Resources resources = context.getResources();
        oVar.f28445a = resources;
        oVar.f28446b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        String strI = oVar.i("google_app_id");
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        return new h(strI, oVar.i("google_api_key"), oVar.i("firebase_database_url"), oVar.i("ga_trackingId"), oVar.i("gcm_defaultSenderId"), oVar.i("google_storage_bucket"), oVar.i("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return y.l(this.f36628b, hVar.f36628b) && y.l(this.f36627a, hVar.f36627a) && y.l(this.f36629c, hVar.f36629c) && y.l(this.f36630d, hVar.f36630d) && y.l(this.f36631e, hVar.f36631e) && y.l(this.f36632f, hVar.f36632f) && y.l(this.g, hVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36628b, this.f36627a, this.f36629c, this.f36630d, this.f36631e, this.f36632f, this.g});
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.f(this.f36628b, "applicationId");
        nVar.f(this.f36627a, "apiKey");
        nVar.f(this.f36629c, "databaseUrl");
        nVar.f(this.f36631e, "gcmSenderId");
        nVar.f(this.f36632f, "storageBucket");
        nVar.f(this.g, "projectId");
        return nVar.toString();
    }
}
