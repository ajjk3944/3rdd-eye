package cb;

import qb.v;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3554c;

    public e(String str, String str2, String str3) {
        this.f3552a = str;
        this.f3553b = str2;
        this.f3554c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (v.a(this.f3552a, eVar.f3552a) && v.a(this.f3553b, eVar.f3553b) && v.a(this.f3554c, eVar.f3554c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f3552a.hashCode() * 31;
        String str = this.f3553b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3554c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
