package h5;

import a5.d0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f9936a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9938c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9939d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9940e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f9936a = str;
        this.f9937b = str2;
        this.f9938c = str3;
        this.f9939d = str4;
        this.f9940e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return d0.a(this.f9936a, hVar.f9936a) && d0.a(this.f9937b, hVar.f9937b) && d0.a(this.f9938c, hVar.f9938c) && d0.a(this.f9939d, hVar.f9939d) && d0.a(this.f9940e, hVar.f9940e);
    }

    public final int hashCode() {
        String str = this.f9936a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9937b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9938c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9939d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f9940e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
