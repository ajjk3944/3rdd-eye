package gd;

import gg.z;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: gd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5896a {

    /* renamed from: a, reason: collision with root package name */
    private final int f47832a;

    /* renamed from: b, reason: collision with root package name */
    private final String f47833b;

    /* renamed from: c, reason: collision with root package name */
    private final String f47834c;

    /* renamed from: d, reason: collision with root package name */
    private final String f47835d;

    /* renamed from: gd.a$a, reason: collision with other inner class name */
    public interface InterfaceC1778a {
        C5896a a(int i10);
    }

    /* renamed from: gd.a$b */
    public interface b {
        z a();
    }

    public C5896a(int i10, String str, String str2, String str3) {
        this.f47832a = i10;
        this.f47833b = str;
        this.f47834c = str2;
        this.f47835d = str3;
    }

    public final String a() {
        return this.f47835d;
    }

    public final int b() {
        return this.f47832a;
    }

    public final String c() {
        return this.f47834c;
    }

    public final String d() {
        return this.f47833b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5896a)) {
            return false;
        }
        C5896a c5896a = (C5896a) obj;
        return this.f47832a == c5896a.f47832a && AbstractC6492s.d(this.f47833b, c5896a.f47833b) && AbstractC6492s.d(this.f47834c, c5896a.f47834c) && AbstractC6492s.d(this.f47835d, c5896a.f47835d);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f47832a) * 31;
        String str = this.f47833b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47834c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f47835d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CommonService(port=" + this.f47832a + ", serviceName=" + this.f47833b + ", protocol=" + this.f47834c + ", description=" + this.f47835d + ")";
    }
}
