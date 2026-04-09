package B4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f504b;

    /* renamed from: c, reason: collision with root package name */
    public final String f505c;

    /* renamed from: d, reason: collision with root package name */
    public final String f506d;

    /* renamed from: e, reason: collision with root package name */
    public final String f507e;

    /* renamed from: f, reason: collision with root package name */
    public final String f508f;

    /* renamed from: g, reason: collision with root package name */
    public final String f509g;

    public k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f504b = str;
        this.f503a = str2;
        this.f505c = str3;
        this.f506d = str4;
        this.f507e = str5;
        this.f508f = str6;
        this.f509g = str7;
    }

    public static k a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new k(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equal(this.f504b, kVar.f504b) && Objects.equal(this.f503a, kVar.f503a) && Objects.equal(this.f505c, kVar.f505c) && Objects.equal(this.f506d, kVar.f506d) && Objects.equal(this.f507e, kVar.f507e) && Objects.equal(this.f508f, kVar.f508f) && Objects.equal(this.f509g, kVar.f509g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f504b, this.f503a, this.f505c, this.f506d, this.f507e, this.f508f, this.f509g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f504b).add("apiKey", this.f503a).add("databaseUrl", this.f505c).add("gcmSenderId", this.f507e).add("storageBucket", this.f508f).add("projectId", this.f509g).toString();
    }
}
