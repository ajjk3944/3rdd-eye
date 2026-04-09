package La;

import java.net.InetAddress;
import java.net.URL;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InetAddress f11502a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11503b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f11504c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11505d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11506e;

    /* renamed from: f, reason: collision with root package name */
    private final Double f11507f;

    /* renamed from: g, reason: collision with root package name */
    private final Double f11508g;

    /* renamed from: h, reason: collision with root package name */
    private final TimeZone f11509h;

    public b(InetAddress inetAddress, String str, URL url, String str2, String str3, Double d10, Double d11, TimeZone timeZone) {
        this.f11502a = inetAddress;
        this.f11503b = str;
        this.f11504c = url;
        this.f11505d = str2;
        this.f11506e = str3;
        this.f11507f = d10;
        this.f11508g = d11;
        this.f11509h = timeZone;
    }

    public final String a() {
        return this.f11506e;
    }

    public final URL b() {
        return this.f11504c;
    }

    public final String c() {
        return this.f11503b;
    }

    public final Double d() {
        return this.f11507f;
    }

    public final Double e() {
        return this.f11508g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return AbstractC6492s.d(this.f11502a, bVar.f11502a) && AbstractC6492s.d(this.f11503b, bVar.f11503b) && AbstractC6492s.d(this.f11504c, bVar.f11504c) && AbstractC6492s.d(this.f11505d, bVar.f11505d) && AbstractC6492s.d(this.f11506e, bVar.f11506e) && AbstractC6492s.d(this.f11507f, bVar.f11507f) && AbstractC6492s.d(this.f11508g, bVar.f11508g) && AbstractC6492s.d(this.f11509h, bVar.f11509h);
    }

    public final InetAddress f() {
        return this.f11502a;
    }

    public int hashCode() {
        InetAddress inetAddress = this.f11502a;
        int iHashCode = (inetAddress == null ? 0 : inetAddress.hashCode()) * 31;
        String str = this.f11503b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        URL url = this.f11504c;
        int iHashCode3 = (iHashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        String str2 = this.f11505d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11506e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.f11507f;
        int iHashCode6 = (iHashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f11508g;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        TimeZone timeZone = this.f11509h;
        return iHashCode7 + (timeZone != null ? timeZone.hashCode() : 0);
    }

    public String toString() {
        return "UiPublicIpStats(publicIp=" + this.f11502a + ", ispName=" + this.f11503b + ", ispIconUrl=" + this.f11504c + ", country=" + this.f11505d + ", countryCode=" + this.f11506e + ", latitude=" + this.f11507f + ", longitude=" + this.f11508g + ", timezone=" + this.f11509h + ")";
    }
}
