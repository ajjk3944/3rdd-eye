package z5;

import java.util.List;
import je.u;
import nk.k;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f37943a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37944b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37945c;

    /* renamed from: d, reason: collision with root package name */
    public final List f37946d;

    /* renamed from: e, reason: collision with root package name */
    public final List f37947e;

    public h(String str, String str2, String str3, List list, List list2) {
        k.e(str, "referenceTable");
        k.e(str2, "onDelete");
        k.e(str3, "onUpdate");
        this.f37943a = str;
        this.f37944b = str2;
        this.f37945c = str3;
        this.f37946d = list;
        this.f37947e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (k.a(this.f37943a, hVar.f37943a) && k.a(this.f37944b, hVar.f37944b) && k.a(this.f37945c, hVar.f37945c) && k.a(this.f37946d, hVar.f37946d)) {
            return k.a(this.f37947e, hVar.f37947e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37947e.hashCode() + ((this.f37946d.hashCode() + u.m(u.m(this.f37943a.hashCode() * 31, 31, this.f37944b), 31, this.f37945c)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(this.f37943a);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(this.f37944b);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(this.f37945c);
        sb2.append("',\n            |   columnNames = {");
        vk.j.k0(n.g0(n.n0(this.f37946d), ",", null, null, null, 62));
        vk.j.k0("},");
        yj.u uVar = yj.u.f37649a;
        sb2.append(uVar);
        sb2.append("\n            |   referenceColumnNames = {");
        vk.j.k0(n.g0(n.n0(this.f37947e), ",", null, null, null, 62));
        vk.j.k0(" }");
        sb2.append(uVar);
        sb2.append("\n            |}\n        ");
        return vk.j.k0(vk.j.m0(sb2.toString()));
    }
}
