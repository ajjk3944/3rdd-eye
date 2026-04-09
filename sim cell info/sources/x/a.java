package x;

import android.util.Base64;
import java.util.List;
import z.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3359a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3360b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3361c;

    /* renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f3362d;

    /* renamed from: e, reason: collision with root package name */
    private final int f3363e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3364f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        String str4 = (String) g.b(str);
        this.f3359a = str4;
        String str5 = (String) g.b(str2);
        this.f3360b = str5;
        String str6 = (String) g.b(str3);
        this.f3361c = str6;
        this.f3362d = (List) g.b(list);
        this.f3363e = 0;
        this.f3364f = str4 + "-" + str5 + "-" + str6;
    }

    public List<List<byte[]>> a() {
        return this.f3362d;
    }

    public int b() {
        return this.f3363e;
    }

    public String c() {
        return this.f3364f;
    }

    public String d() {
        return this.f3359a;
    }

    public String e() {
        return this.f3360b;
    }

    public String f() {
        return this.f3361c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f3359a + ", mProviderPackage: " + this.f3360b + ", mQuery: " + this.f3361c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f3362d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f3362d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f3363e);
        return sb.toString();
    }
}
