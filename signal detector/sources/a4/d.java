package a4;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4681c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4682d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4683e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4684f;

    /* renamed from: g, reason: collision with root package name */
    public final List f4685g;

    /* renamed from: h, reason: collision with root package name */
    public final PendingIntent f4686h;
    public final List i;

    public d(int i, int i3, int i6, long j6, long j7, List list, List list2, PendingIntent pendingIntent, List list3) {
        this.f4679a = i;
        this.f4680b = i3;
        this.f4681c = i6;
        this.f4682d = j6;
        this.f4683e = j7;
        this.f4684f = list;
        this.f4685g = list2;
        this.f4686h = pendingIntent;
        this.i = list3;
    }

    public static d a(int i, int i3, int i6, long j6, long j7, List list, List list2) {
        if (i3 != 8) {
            return new d(i, i3, i6, j6, j7, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static d b(Bundle bundle) {
        return new d(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        PendingIntent pendingIntent;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            int i = dVar.f4679a;
            List list4 = dVar.i;
            PendingIntent pendingIntent2 = dVar.f4686h;
            List list5 = dVar.f4685g;
            List list6 = dVar.f4684f;
            if (this.f4679a == i && this.f4680b == dVar.f4680b && this.f4681c == dVar.f4681c && this.f4682d == dVar.f4682d && this.f4683e == dVar.f4683e && ((list = this.f4684f) != null ? list.equals(list6) : list6 == null) && ((list2 = this.f4685g) != null ? list2.equals(list5) : list5 == null) && ((pendingIntent = this.f4686h) != null ? pendingIntent.equals(pendingIntent2) : pendingIntent2 == null) && ((list3 = this.i) != null ? list3.equals(list4) : list4 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f4679a ^ 1000003) * 1000003) ^ this.f4680b) * 1000003) ^ this.f4681c;
        long j6 = this.f4682d;
        long j7 = j6 ^ (j6 >>> 32);
        long j8 = this.f4683e;
        long j9 = j8 ^ (j8 >>> 32);
        List list = this.f4684f;
        int iHashCode = ((((((i * 1000003) ^ ((int) j7)) * 1000003) ^ ((int) j9)) * 1000003) ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f4685g;
        int iHashCode2 = (iHashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f4686h;
        int iHashCode3 = (iHashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List list3 = this.i;
        return iHashCode3 ^ (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4684f);
        String strValueOf2 = String.valueOf(this.f4685g);
        String strValueOf3 = String.valueOf(this.f4686h);
        String strValueOf4 = String.valueOf(this.i);
        StringBuilder sb = new StringBuilder("SplitInstallSessionState{sessionId=");
        sb.append(this.f4679a);
        sb.append(", status=");
        sb.append(this.f4680b);
        sb.append(", errorCode=");
        sb.append(this.f4681c);
        sb.append(", bytesDownloaded=");
        sb.append(this.f4682d);
        A.f.v(sb, ", totalBytesToDownload=", this.f4683e, ", moduleNamesNullable=");
        A.f.w(sb, strValueOf, ", languagesNullable=", strValueOf2, ", resolutionIntent=");
        return AbstractC1135f5.o(sb, strValueOf3, ", splitFileIntents=", strValueOf4, "}");
    }
}
