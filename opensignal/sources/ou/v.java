package ou;

import com.google.android.gms.internal.measurement.y3;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f19976c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19977d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f19978a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f19979b;

    public v(String str, String[] strArr) {
        this.f19978a = str;
        this.f19979b = strArr;
    }

    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.f19979b;
        int i10 = 0;
        int iV = y3.v(0, strArr.length - 1, 2);
        if (iV < 0) {
            str = null;
            break;
        }
        while (!tt.s.g0(strArr[i10], "charset")) {
            if (i10 == iV) {
                str = null;
                break;
            }
            i10 += 2;
        }
        str = strArr[i10 + 1];
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && br.l.a(((v) obj).f19978a, this.f19978a);
    }

    public final int hashCode() {
        return this.f19978a.hashCode();
    }

    public final String toString() {
        return this.f19978a;
    }
}
