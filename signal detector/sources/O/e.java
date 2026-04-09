package O;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3041c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3042d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3043e;

    public e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f3039a = str;
        str2.getClass();
        this.f3040b = str2;
        this.f3041c = str3;
        list.getClass();
        this.f3042d = list;
        this.f3043e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3039a + ", mProviderPackage: " + this.f3040b + ", mQuery: " + this.f3041c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f3042d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
