package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f8831a;

    /* renamed from: b, reason: collision with root package name */
    private final List f8832b;

    public MaxSegment(int i10, List<Integer> list) {
        this.f8831a = i10;
        this.f8832b = list;
        a(i10);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i10) {
        if (i10 >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i10);
    }

    public int getKey() {
        return this.f8831a;
    }

    public List<Integer> getValues() {
        return this.f8832b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f8831a + ", values=" + this.f8832b + '}';
    }
}
