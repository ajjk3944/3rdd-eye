package z8;

import kotlin.jvm.internal.l;

/* compiled from: RateDialogConfiguration.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f48488a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f48489b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f48490c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f48491d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f48492e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f48493f;

    public e(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.f48488a = i;
        this.f48489b = num;
        this.f48490c = num2;
        this.f48491d = num3;
        this.f48492e = num4;
        this.f48493f = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f48488a == eVar.f48488a && l.b(this.f48489b, eVar.f48489b) && l.b(this.f48490c, eVar.f48490c) && l.b(this.f48491d, eVar.f48491d) && l.b(this.f48492e, eVar.f48492e) && l.b(this.f48493f, eVar.f48493f);
    }

    public final int hashCode() {
        int i = this.f48488a * 31;
        Integer num = this.f48489b;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f48490c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f48491d;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f48492e;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f48493f;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "RateBarDialogStyle(buttonColor=" + this.f48488a + ", disabledButtonColor=" + this.f48489b + ", pressedButtonColor=" + this.f48490c + ", backgroundColor=" + this.f48491d + ", textColor=" + this.f48492e + ", buttonTextColor=" + this.f48493f + ")";
    }
}
