package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class v00 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34264a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34265b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34266c;

    /* renamed from: d, reason: collision with root package name */
    private final List<jj0> f34267d;

    public v00(String type, String target, String layout, ArrayList arrayList) {
        kotlin.jvm.internal.l.f(type, "type");
        kotlin.jvm.internal.l.f(target, "target");
        kotlin.jvm.internal.l.f(layout, "layout");
        this.f34264a = type;
        this.f34265b = target;
        this.f34266c = layout;
        this.f34267d = arrayList;
    }

    public final List<jj0> a() {
        return this.f34267d;
    }

    public final String b() {
        return this.f34266c;
    }

    public final String c() {
        return this.f34265b;
    }

    public final String d() {
        return this.f34264a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return kotlin.jvm.internal.l.b(this.f34264a, v00Var.f34264a) && kotlin.jvm.internal.l.b(this.f34265b, v00Var.f34265b) && kotlin.jvm.internal.l.b(this.f34266c, v00Var.f34266c) && kotlin.jvm.internal.l.b(this.f34267d, v00Var.f34267d);
    }

    public final int hashCode() {
        int iA = C4121h3.a(this.f34266c, C4121h3.a(this.f34265b, this.f34264a.hashCode() * 31, 31), 31);
        List<jj0> list = this.f34267d;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String str = this.f34264a;
        String str2 = this.f34265b;
        String str3 = this.f34266c;
        List<jj0> list = this.f34267d;
        StringBuilder sbD = j6.l.d("Design(type=", str, ", target=", str2, ", layout=");
        sbD.append(str3);
        sbD.append(", images=");
        sbD.append(list);
        sbD.append(")");
        return sbD.toString();
    }
}
