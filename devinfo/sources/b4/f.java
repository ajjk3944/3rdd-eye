package b4;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f1675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1677c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1678d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1679e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1680f;
    public final String g;

    public f(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f1675a = str;
        str2.getClass();
        this.f1676b = str2;
        this.f1677c = str3;
        list.getClass();
        this.f1678d = list;
        this.f1679e = str4;
        this.f1680f = str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("-");
        sb2.append(str2);
        sb2.append("-");
        sb2.append(str3);
        this.g = a0.g.p(sb2, "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f1675a + ", mProviderPackage: " + this.f1676b + ", mQuery: " + this.f1677c + ", mSystemFont: " + this.f1679e + ", mVariationSettings: " + this.f1680f + ", mCertificates:");
        int i4 = 0;
        while (true) {
            List list = this.f1678d;
            if (i4 >= list.size()) {
                sb2.append("}mCertificatesArray: 0");
                return sb2.toString();
            }
            sb2.append(" [");
            List list2 = (List) list.get(i4);
            for (int i10 = 0; i10 < list2.size(); i10++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list2.get(i10), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i4++;
        }
    }
}
