package o0;

import android.util.Base64;
import java.util.List;
import r0.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f23557a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23558b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23559c;

    /* renamed from: d, reason: collision with root package name */
    public final List f23560d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23561e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f23562f;

    public g(String str, String str2, String str3, List list) {
        this.f23557a = (String) i.g(str);
        this.f23558b = (String) i.g(str2);
        this.f23559c = (String) i.g(str3);
        this.f23560d = (List) i.g(list);
        this.f23562f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f23560d;
    }

    public int c() {
        return this.f23561e;
    }

    public String d() {
        return this.f23562f;
    }

    public String e() {
        return this.f23557a;
    }

    public String f() {
        return this.f23558b;
    }

    public String g() {
        return this.f23559c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f23557a + ", mProviderPackage: " + this.f23558b + ", mQuery: " + this.f23559c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f23560d.size(); i10++) {
            sb.append(" [");
            List list = (List) this.f23560d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f23561e);
        return sb.toString();
    }
}
