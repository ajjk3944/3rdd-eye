package ca;

import ea.k;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import wb.e;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f2820c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f2821d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2822e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f2823f;

    /* renamed from: a, reason: collision with root package name */
    public final String f2824a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2825b;

    static {
        String strH = e.H("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f2820c = strH;
        String strH2 = e.H("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strH3 = e.H("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f2821d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new ba.b("proto"), new ba.b("json"))));
        f2822e = new a(strH, null);
        f2823f = new a(strH2, strH3);
    }

    public a(String str, String str2) {
        this.f2824a = str;
        this.f2825b = str2;
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
