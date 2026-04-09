package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f6356a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6357b;

    public MaxSegment(int i4, List<Integer> list) {
        this.f6356a = i4;
        this.f6357b = list;
        a(i4);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i4) {
        if (i4 >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i4);
    }

    public int getKey() {
        return this.f6356a;
    }

    public List<Integer> getValues() {
        return this.f6357b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f6356a + ", values=" + this.f6357b + '}';
    }
}
