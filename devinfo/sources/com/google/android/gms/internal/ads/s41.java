package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class s41 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f15865a;

    /* renamed from: b, reason: collision with root package name */
    public int f15866b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15867c;

    public s41(int i4) {
        yr1.u(i4, "initialCapacity");
        this.f15865a = new Object[i4];
        this.f15866b = 0;
    }

    public static int d(int i4, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i10 <= i4) {
            return i4;
        }
        int i11 = i4 + (i4 >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f15865a;
        int i4 = this.f15866b;
        this.f15866b = i4 + 1;
        objArr[i4] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof t41) {
                this.f15866b = ((t41) collection).j(this.f15865a, this.f15866b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract s41 c(Object obj);

    public final void e(int i4) {
        int length = this.f15865a.length;
        int iD = d(length, this.f15866b + i4);
        if (iD > length || this.f15867c) {
            this.f15865a = Arrays.copyOf(this.f15865a, iD);
            this.f15867c = false;
        }
    }
}
