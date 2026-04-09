package z5;

import java.util.ArrayList;
import java.util.List;
import nk.k;
import vk.p;
import yj.u;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f37948a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37949b;

    /* renamed from: c, reason: collision with root package name */
    public final List f37950c;

    /* renamed from: d, reason: collision with root package name */
    public final List f37951d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public i(String str, boolean z3, List list, List list2) {
        k.e(str, "name");
        this.f37948a = str;
        this.f37949b = z3;
        this.f37950c = list;
        this.f37951d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                list2.add("ASC");
            }
        }
        this.f37951d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            String str = iVar.f37948a;
            if (this.f37949b == iVar.f37949b && this.f37950c.equals(iVar.f37950c) && k.a(this.f37951d, iVar.f37951d)) {
                String str2 = this.f37948a;
                return p.w0(str2, "index_", false) ? p.w0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f37948a;
        return this.f37951d.hashCode() + ((this.f37950c.hashCode() + ((((p.w0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f37949b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Index {\n            |   name = '");
        sb2.append(this.f37948a);
        sb2.append("',\n            |   unique = '");
        sb2.append(this.f37949b);
        sb2.append("',\n            |   columns = {");
        vk.j.k0(n.g0(this.f37950c, ",", null, null, null, 62));
        vk.j.k0("},");
        u uVar = u.f37649a;
        sb2.append(uVar);
        sb2.append("\n            |   orders = {");
        vk.j.k0(n.g0(this.f37951d, ",", null, null, null, 62));
        vk.j.k0(" }");
        sb2.append(uVar);
        sb2.append("\n            |}\n        ");
        return vk.j.k0(vk.j.m0(sb2.toString()));
    }
}
