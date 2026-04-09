package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class go {

    /* renamed from: b, reason: collision with root package name */
    public static final go f11565b;

    /* renamed from: a, reason: collision with root package name */
    public final x41 f11566a;

    static {
        v41 v41Var = x41.f18307b;
        f11565b = new go(u51.f17096e);
        String str = bq0.f9768a;
        Integer.toString(0, 36);
    }

    public go(u51 u51Var) {
        this.f11566a = x41.q(u51Var);
    }

    public final boolean a(int i4) {
        int i10 = 0;
        while (true) {
            x41 x41Var = this.f11566a;
            if (i10 >= x41Var.size()) {
                return false;
            }
            qn qnVar = (qn) x41Var.get(i10);
            boolean[] zArr = qnVar.f15381e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (!zArr[i11]) {
                    i11++;
                } else if (qnVar.f15378b.f12339c == i4) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || go.class != obj.getClass()) {
            return false;
        }
        return this.f11566a.equals(((go) obj).f11566a);
    }

    public final int hashCode() {
        return this.f11566a.hashCode();
    }
}
