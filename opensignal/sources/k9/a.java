package k9;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import m9.j;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final String f14211c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f14212d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f14213e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f14214f;

    /* renamed from: a, reason: collision with root package name */
    public final String f14215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14216b;

    static {
        String strD0 = io.sentry.config.a.d0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f14211c = strD0;
        String strD02 = io.sentry.config.a.d0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strD03 = io.sentry.config.a.d0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f14212d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new j9.c("proto"), new j9.c("json"))));
        f14213e = new a(strD0, null);
        f14214f = new a(strD02, strD03);
    }

    public a(String str, String str2) {
        this.f14215a = str;
        this.f14216b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
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
}
