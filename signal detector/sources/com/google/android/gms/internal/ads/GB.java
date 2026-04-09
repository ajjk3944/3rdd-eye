package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class GB {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f8331a;

    /* renamed from: b, reason: collision with root package name */
    public int f8332b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8333c;

    public GB(int i) {
        C1476lN.v(i, "initialCapacity");
        this.f8331a = new Object[i];
        this.f8332b = 0;
    }

    public static int d(int i, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i3 <= i) {
            return i;
        }
        int i6 = i + (i >> 1) + 1;
        if (i6 < i3) {
            int iHighestOneBit = Integer.highestOneBit(i3 - 1);
            i6 = iHighestOneBit + iHighestOneBit;
        }
        if (i6 < 0) {
            return Integer.MAX_VALUE;
        }
        return i6;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f8331a;
        int i = this.f8332b;
        this.f8332b = i + 1;
        objArr[i] = obj;
    }

    public final void b(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            e(collection.size());
            if (collection instanceof HB) {
                this.f8332b = ((HB) collection).g(this.f8331a, this.f8332b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public abstract GB c(Object obj);

    public final void e(int i) {
        int length = this.f8331a.length;
        int iD = d(length, this.f8332b + i);
        if (iD > length || this.f8333c) {
            this.f8331a = Arrays.copyOf(this.f8331a, iD);
            this.f8333c = false;
        }
    }
}
