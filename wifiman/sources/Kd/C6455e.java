package kd;

import java.net.URL;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: kd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6455e {

    /* renamed from: a, reason: collision with root package name */
    private final inet.ipaddr.g f51397a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51398b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f51399c;

    /* renamed from: d, reason: collision with root package name */
    private final String f51400d;

    /* renamed from: e, reason: collision with root package name */
    private final W7.c f51401e;

    public C6455e(inet.ipaddr.g gVar, String str, URL url, String str2, W7.c cVar) {
        this.f51397a = gVar;
        this.f51398b = str;
        this.f51399c = url;
        this.f51400d = str2;
        this.f51401e = cVar;
    }

    public final URL a() {
        return this.f51399c;
    }

    public final String b() {
        return this.f51398b;
    }

    public final inet.ipaddr.g c() {
        return this.f51397a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6455e)) {
            return false;
        }
        C6455e c6455e = (C6455e) obj;
        return AbstractC6492s.d(this.f51397a, c6455e.f51397a) && AbstractC6492s.d(this.f51398b, c6455e.f51398b) && AbstractC6492s.d(this.f51399c, c6455e.f51399c) && AbstractC6492s.d(this.f51400d, c6455e.f51400d) && AbstractC6492s.d(this.f51401e, c6455e.f51401e);
    }

    public int hashCode() {
        inet.ipaddr.g gVar = this.f51397a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        String str = this.f51398b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        URL url = this.f51399c;
        int iHashCode3 = (iHashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        String str2 = this.f51400d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        W7.c cVar = this.f51401e;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "Status(publicIP=" + this.f51397a + ", ispName=" + this.f51398b + ", ispIconUrl=" + this.f51399c + ", countryCode=" + this.f51400d + ", location=" + this.f51401e + ")";
    }
}
