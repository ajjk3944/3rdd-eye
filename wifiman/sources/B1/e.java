package B1;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f1053a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1054b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1055c;

    /* renamed from: d, reason: collision with root package name */
    private final List f1056d;

    /* renamed from: e, reason: collision with root package name */
    private final int f1057e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f1058f;

    public e(String str, String str2, String str3, List list) {
        this.f1053a = (String) E1.h.g(str);
        this.f1054b = (String) E1.h.g(str2);
        this.f1055c = (String) E1.h.g(str3);
        this.f1056d = (List) E1.h.g(list);
        this.f1058f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f1056d;
    }

    public int c() {
        return this.f1057e;
    }

    String d() {
        return this.f1058f;
    }

    public String e() {
        return this.f1053a;
    }

    public String f() {
        return this.f1054b;
    }

    public String g() {
        return this.f1055c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f1053a + ", mProviderPackage: " + this.f1054b + ", mQuery: " + this.f1055c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f1056d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f1056d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f1057e);
        return sb2.toString();
    }
}
