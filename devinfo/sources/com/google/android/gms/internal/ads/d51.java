package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d51 extends s41 {

    /* renamed from: d, reason: collision with root package name */
    public Object[] f10335d;

    /* renamed from: e, reason: collision with root package name */
    public int f10336e;

    @Override // com.google.android.gms.internal.ads.s41
    public final /* bridge */ /* synthetic */ s41 c(Object obj) {
        f(obj);
        return this;
    }

    public final void f(Object obj) {
        obj.getClass();
        if (this.f10335d != null) {
            int iL = e51.l(this.f15866b);
            Object[] objArr = this.f10335d;
            if (iL <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iA = yo0.a(iHashCode);
                while (true) {
                    int i4 = iA & length;
                    Object[] objArr2 = this.f10335d;
                    Object obj2 = objArr2[i4];
                    if (obj2 == null) {
                        objArr2[i4] = obj;
                        this.f10336e += iHashCode;
                        a(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iA = i4 + 1;
                    }
                }
            }
        }
        this.f10335d = null;
        a(obj);
    }

    public final void g(Iterable iterable) {
        iterable.getClass();
        if (this.f10335d == null) {
            b(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f(it.next());
        }
    }

    public final e51 h() {
        e51 e51VarR;
        int i4 = this.f15866b;
        if (i4 == 0) {
            return a61.j;
        }
        if (i4 == 1) {
            Object obj = this.f15865a[0];
            Objects.requireNonNull(obj);
            return new f51(obj);
        }
        if (this.f10335d == null || e51.l(i4) != this.f10335d.length) {
            e51VarR = e51.r(this.f15865a, this.f15866b);
            this.f15866b = e51VarR.size();
        } else {
            int i10 = this.f15866b;
            Object[] objArrCopyOf = this.f15865a;
            int length = objArrCopyOf.length;
            if (i10 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i10);
            }
            e51VarR = new a61(this.f10336e, r8.length - 1, this.f15866b, objArrCopyOf, this.f10335d);
        }
        this.f15867c = true;
        this.f10335d = null;
        return e51VarR;
    }
}
