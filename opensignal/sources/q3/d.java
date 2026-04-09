package q3;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f20686a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20687b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20688c;

    /* renamed from: d, reason: collision with root package name */
    public final List f20689d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20690e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f20686a = str;
        str2.getClass();
        this.f20687b = str2;
        this.f20688c = str3;
        list.getClass();
        this.f20689d = list;
        this.f20690e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f20686a + ", mProviderPackage: " + this.f20687b + ", mQuery: " + this.f20688c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List list = this.f20689d;
            if (i10 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }
}
