package z5;

import androidx.recyclerview.widget.m;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import nk.k;
import zj.n;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f37952a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37953b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f37954c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f37955d;

    public j(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        k.e(abstractSet, "foreignKeys");
        this.f37952a = str;
        this.f37953b = map;
        this.f37954c = abstractSet;
        this.f37955d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f37952a.equals(jVar.f37952a) || !this.f37953b.equals(jVar.f37953b) || !k.a(this.f37954c, jVar.f37954c)) {
            return false;
        }
        Set set2 = this.f37955d;
        if (set2 == null || (set = jVar.f37955d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.f37954c.hashCode() + ((this.f37953b.hashCode() + (this.f37952a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f37952a);
        sb2.append("',\n            |    columns = {");
        sb2.append(pd.b.h(n.o0(this.f37953b.values(), new m(24))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(pd.b.h(this.f37954c));
        sb2.append("\n            |    indices = {");
        Set set = this.f37955d;
        sb2.append(pd.b.h(set != null ? n.o0(set, new m(25)) : s.f38317a));
        sb2.append("\n            |}\n        ");
        return vk.j.m0(sb2.toString());
    }
}
