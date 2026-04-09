package V6;

import N7.EnumC1195h5;
import N7.H7;
import N7.H9;

/* compiled from: TextData.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f13017a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13019c;

    /* renamed from: d, reason: collision with root package name */
    public final H9 f13020d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13021e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC1195h5 f13022f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f13023g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f13024h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13025j;

    public m(String text, int i, int i10, H9 h92, String str, EnumC1195h5 enumC1195h5, Integer num, Integer num2, int i11) {
        kotlin.jvm.internal.l.f(text, "text");
        this.f13017a = text;
        this.f13018b = i;
        this.f13019c = i10;
        this.f13020d = h92;
        this.f13021e = str;
        this.f13022f = enumC1195h5;
        this.f13023g = num;
        this.f13024h = num2;
        this.i = i11;
        this.f13025j = text.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.b(this.f13017a, mVar.f13017a) && this.f13018b == mVar.f13018b && this.f13019c == mVar.f13019c && this.f13020d == mVar.f13020d && kotlin.jvm.internal.l.b(this.f13021e, mVar.f13021e) && this.f13022f == mVar.f13022f && kotlin.jvm.internal.l.b(this.f13023g, mVar.f13023g) && kotlin.jvm.internal.l.b(this.f13024h, mVar.f13024h) && this.i == mVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f13020d.hashCode() + (((((this.f13017a.hashCode() * 31) + this.f13018b) * 31) + this.f13019c) * 31)) * 31;
        String str = this.f13021e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC1195h5 enumC1195h5 = this.f13022f;
        int iHashCode3 = (iHashCode2 + (enumC1195h5 == null ? 0 : enumC1195h5.hashCode())) * 31;
        Integer num = this.f13023g;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f13024h;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextData(text=");
        sb.append(this.f13017a);
        sb.append(", fontSize=");
        sb.append(this.f13018b);
        sb.append(", fontSizeValue=");
        sb.append(this.f13019c);
        sb.append(", fontSizeUnit=");
        sb.append(this.f13020d);
        sb.append(", fontFamily=");
        sb.append(this.f13021e);
        sb.append(", fontWeight=");
        sb.append(this.f13022f);
        sb.append(", fontWeightValue=");
        sb.append(this.f13023g);
        sb.append(", lineHeight=");
        sb.append(this.f13024h);
        sb.append(", textColor=");
        return H7.p(sb, this.i, ')');
    }
}
