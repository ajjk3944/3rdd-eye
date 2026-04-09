package tn;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final d f22913a;

    /* renamed from: b, reason: collision with root package name */
    public final rn.a f22914b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22915c;

    public f(d dVar, rn.a aVar, List list) {
        br.l.e(dVar, "condition");
        br.l.e(aVar, "fieldOperator");
        br.l.e(list, "fieldIds");
        this.f22913a = dVar;
        this.f22914b = aVar;
        this.f22915c = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(un.d r11) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.f.a(un.d):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f22913a == fVar.f22913a && this.f22914b == fVar.f22914b && br.l.a(this.f22915c, fVar.f22915c);
    }

    public final int hashCode() {
        return this.f22915c.hashCode() + ((this.f22914b.hashCode() + (this.f22913a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayLogicFormGroup(condition=");
        sb2.append(this.f22913a);
        sb2.append(", fieldOperator=");
        sb2.append(this.f22914b);
        sb2.append(", fieldIds=");
        return h0.b.t(sb2, this.f22915c, ')');
    }
}
