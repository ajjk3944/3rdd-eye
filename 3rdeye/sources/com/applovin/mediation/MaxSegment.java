package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f21922a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21923b;

    public MaxSegment(int i, List<Integer> list) {
        this.f21922a = i;
        this.f21923b = list;
        a(i);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i) {
        if (i >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.f21922a;
    }

    public List<Integer> getValues() {
        return this.f21923b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f21922a + ", values=" + this.f21923b + '}';
    }
}
