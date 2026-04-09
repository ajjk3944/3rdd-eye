package fn;

import bh.g;
import bn.d;
import br.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9015a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9017c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f9018d;

    /* renamed from: e, reason: collision with root package name */
    public final g f9019e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f9020f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9021g;

    /* renamed from: h, reason: collision with root package name */
    public final c f9022h;

    /* renamed from: i, reason: collision with root package name */
    public final c f9023i;
    public final d j;

    public a(int i10, int i11, int i12, Integer num, g gVar, Integer num2, int i13, c cVar, c cVar2, d dVar, int i14) {
        num = (i14 & 8) != 0 ? null : num;
        num2 = (i14 & 32) != 0 ? null : num2;
        cVar = (i14 & 128) != 0 ? null : cVar;
        cVar2 = (i14 & 256) != 0 ? c.CLOSE : cVar2;
        l.e(gVar, "iconType");
        l.e(cVar2, "secondaryAction");
        l.e(dVar, "rawResult");
        this.f9015a = i10;
        this.f9016b = i11;
        this.f9017c = i12;
        this.f9018d = num;
        this.f9019e = gVar;
        this.f9020f = num2;
        this.f9021g = i13;
        this.f9022h = cVar;
        this.f9023i = cVar2;
        this.j = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9015a == aVar.f9015a && this.f9016b == aVar.f9016b && this.f9017c == aVar.f9017c && l.a(this.f9018d, aVar.f9018d) && this.f9019e == aVar.f9019e && l.a(this.f9020f, aVar.f9020f) && this.f9021g == aVar.f9021g && this.f9022h == aVar.f9022h && this.f9023i == aVar.f9023i && l.a(this.j, aVar.j);
    }

    public final int hashCode() {
        int iC = c7.a.C(this.f9017c, c7.a.C(this.f9016b, Integer.hashCode(this.f9015a) * 31, 31), 31);
        Integer num = this.f9018d;
        int iHashCode = (this.f9019e.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        Integer num2 = this.f9020f;
        int iC2 = c7.a.C(this.f9021g, (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        c cVar = this.f9022h;
        return this.j.hashCode() + ((this.f9023i.hashCode() + ((iC2 + (cVar != null ? cVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "AssistantDialogState(title=" + this.f9015a + ", status=" + this.f9016b + ", description=" + this.f9017c + ", resultCode=" + this.f9018d + ", iconType=" + this.f9019e + ", primaryButtonText=" + this.f9020f + ", secondaryButtonText=" + this.f9021g + ", primaryAction=" + this.f9022h + ", secondaryAction=" + this.f9023i + ", rawResult=" + this.j + ')';
    }
}
