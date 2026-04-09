package si;

import com.applovin.sdk.AppLovinMediationProvider;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f33801a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33802b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33803c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33804d;

    /* renamed from: e, reason: collision with root package name */
    public final int f33805e;

    /* renamed from: f, reason: collision with root package name */
    public String f33806f;
    public String g;

    /* renamed from: h, reason: collision with root package name */
    public int f33807h;

    /* renamed from: i, reason: collision with root package name */
    public int f33808i;
    public int j;

    public d(String str, int i4, String str2, String str3, String str4) {
        this.f33801a = str;
        this.f33802b = str2;
        this.f33803c = str3;
        this.f33804d = str4;
        this.f33805e = i4;
    }

    public final String toString() {
        String str = this.f33806f;
        String str2 = this.g;
        int i4 = this.f33807h;
        int i10 = this.f33808i;
        int i11 = this.j;
        String str3 = i11 != 0 ? i11 != 1 ? i11 != 2 ? AppLovinMediationProvider.UNKNOWN : "year" : "month" : "day";
        StringBuilder sbO = r5.c.o("IapSku{name='", this.f33802b, "', id='", this.f33801a, "', description='");
        u.B(sbO, this.f33803c, "', price='", this.f33804d, "', oriPrice='");
        u.B(sbO, str, "', priceCurrencyCode='", str2, "', type=");
        u.x(this.f33805e, i4, ", freeTryDays=", ", renewalPeriod=", sbO);
        u.x(i10, i11, ", renewalPeriodUnit=", "(", sbO);
        return d.h.w(sbO, str3, ")}");
    }
}
