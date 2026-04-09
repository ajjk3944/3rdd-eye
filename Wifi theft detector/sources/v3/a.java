package v3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import x3.g;

/* loaded from: classes2.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f24706c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f24707d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f24708e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f24709f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f24710g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f24711h;

    /* renamed from: a, reason: collision with root package name */
    public final String f24712a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24713b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f24706c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f24707d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f24708e = strA3;
        f24709f = Collections.unmodifiableSet(new HashSet(Arrays.asList(u3.b.b("proto"), u3.b.b("json"))));
        f24710g = new a(strA, null);
        f24711h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f24712a = str;
        this.f24713b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // x3.g
    public Set a() {
        return f24709f;
    }

    public byte[] b() {
        String str = this.f24713b;
        if (str == null && this.f24712a == null) {
            return null;
        }
        String str2 = this.f24712a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String d() {
        return this.f24713b;
    }

    public String e() {
        return this.f24712a;
    }

    @Override // x3.f
    public byte[] getExtras() {
        return b();
    }

    @Override // x3.f
    public String getName() {
        return "cct";
    }
}
