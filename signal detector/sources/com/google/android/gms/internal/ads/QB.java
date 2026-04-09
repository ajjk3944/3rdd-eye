package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class QB extends GB {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f10585d;

    /* renamed from: e, reason: collision with root package name */
    public int f10586e;

    @Override // com.google.android.gms.internal.ads.GB
    public final /* bridge */ /* synthetic */ GB c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f10585d != null) {
            int i = RB.i(this.f8332b);
            Object[] objArr = this.f10585d;
            if (i <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = AbstractC1984ut.a(iHashCode);
                while (true) {
                    int i3 = iA & length;
                    Object[] objArr2 = this.f10585d;
                    Object obj2 = objArr2[i3];
                    if (obj2 == null) {
                        objArr2[i3] = obj;
                        this.f10586e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iA = i3 + 1;
                    }
                }
            }
        }
        this.f10585d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f10585d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final RB h() {
        RB rbN;
        int i = this.f8332b;
        if (i == 0) {
            return C1519mC.f15594j;
        }
        if (i == 1) {
            Object obj = this.f8331a[0];
            Objects.requireNonNull(obj);
            return new SB(obj);
        }
        if (this.f10585d == null || RB.i(i) != this.f10585d.length) {
            rbN = RB.n(this.f8332b, this.f8331a);
            this.f8332b = rbN.size();
        } else {
            int i3 = this.f8332b;
            Object[] objArrCopyOf = this.f8331a;
            int length = objArrCopyOf.length;
            if (i3 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            rbN = new C1519mC(this.f10586e, r8.length - 1, this.f8332b, objArrCopyOf, this.f10585d);
        }
        this.f8333c = true;
        this.f10585d = null;
        return rbN;
    }
}
