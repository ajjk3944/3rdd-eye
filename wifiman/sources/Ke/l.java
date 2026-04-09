package Ke;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f10725a;

    /* renamed from: b, reason: collision with root package name */
    private final s9.d f10726b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10727c;

    public l(Integer num, s9.d description, String str) {
        AbstractC6492s.i(description, "description");
        this.f10725a = num;
        this.f10726b = description;
        this.f10727c = str;
    }

    public final s9.d a() {
        return this.f10726b;
    }

    public final String b() {
        return this.f10727c;
    }

    public final Integer c() {
        return this.f10725a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return AbstractC6492s.d(this.f10725a, lVar.f10725a) && AbstractC6492s.d(this.f10726b, lVar.f10726b) && AbstractC6492s.d(this.f10727c, lVar.f10727c);
    }

    public int hashCode() {
        Integer num = this.f10725a;
        int iHashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.f10726b.hashCode()) * 31;
        String str = this.f10727c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Item(port=" + this.f10725a + ", description=" + this.f10726b + ", hostAddress=" + this.f10727c + ")";
    }
}
