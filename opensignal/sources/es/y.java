package es;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final ht.x f8341a;

    /* renamed from: b, reason: collision with root package name */
    public final List f8342b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8343c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8344d;

    public y(ht.x xVar, List list, ArrayList arrayList, List list2) {
        this.f8341a = xVar;
        this.f8342b = list;
        this.f8343c = arrayList;
        this.f8344d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f8341a.equals(yVar.f8341a) && this.f8342b.equals(yVar.f8342b) && this.f8343c.equals(yVar.f8343c) && this.f8344d.equals(yVar.f8344d);
    }

    public final int hashCode() {
        return this.f8344d.hashCode() + ((this.f8343c.hashCode() + h0.b.c(this.f8341a.hashCode() * 961, 31, this.f8342b)) * 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MethodSignatureData(returnType=");
        sb2.append(this.f8341a);
        sb2.append(", receiverType=null, valueParameters=");
        sb2.append(this.f8342b);
        sb2.append(", typeParameters=");
        sb2.append(this.f8343c);
        sb2.append(", hasStableParameterNames=false, errors=");
        return h0.b.t(sb2, this.f8344d, ')');
    }
}
