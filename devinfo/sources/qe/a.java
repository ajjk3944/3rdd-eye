package qe;

import pf.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final ne.a f32268b = new ne.a();

    /* renamed from: c, reason: collision with root package name */
    public static final String f32269c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f32270d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final u f32271e = new u(11);

    /* renamed from: a, reason: collision with root package name */
    public final c f32272a;

    public a(c cVar) {
        this.f32272a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb2.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb2.append(str2.charAt(i4));
            }
        }
        return sb2.toString();
    }
}
