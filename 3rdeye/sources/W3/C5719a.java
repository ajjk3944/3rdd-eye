package w3;

import T1.B;
import com.singular.sdk.internal.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import v3.C5677c;

/* compiled from: CCTDestination.java */
/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5719a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f47323c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set<C5677c> f47324d;

    /* renamed from: e, reason: collision with root package name */
    public static final C5719a f47325e;

    /* renamed from: f, reason: collision with root package name */
    public static final C5719a f47326f;

    /* renamed from: a, reason: collision with root package name */
    public final String f47327a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47328b;

    static {
        String strR = B.r("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f47323c = strR;
        String strR2 = B.r("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strR3 = B.r("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f47324d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C5677c("proto"), new C5677c("json"))));
        f47325e = new C5719a(strR, null);
        f47326f = new C5719a(strR2, strR3);
    }

    public C5719a(String str, String str2) {
        this.f47327a = str;
        this.f47328b = str2;
    }

    public static C5719a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
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
        return new C5719a(str2, str3);
    }
}
