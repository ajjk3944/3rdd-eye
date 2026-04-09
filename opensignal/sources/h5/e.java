package h5;

import a5.d0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9925a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9926b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9927c;

    public e(String str, String str2, String str3) {
        this.f9925a = str;
        this.f9926b = str2;
        this.f9927c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (d0.a(this.f9925a, eVar.f9925a) && d0.a(this.f9926b, eVar.f9926b) && d0.a(this.f9927c, eVar.f9927c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f9925a.hashCode() * 31;
        String str = this.f9926b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9927c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
