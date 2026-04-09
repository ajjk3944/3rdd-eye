package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    private final m4 f5926a = new m4();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f5927b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f5928c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f5929d;

    /* renamed from: e, reason: collision with root package name */
    private int f5930e;

    public w2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f5926a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f5926a.isEmpty()) {
            this.f5926a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f5926a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f5926a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f5926a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f5927b);
    }

    public int c() {
        int i4 = this.f5929d;
        if (i4 != -1 && this.f5930e != -1) {
            while (i4 <= this.f5930e) {
                if (g(i4) && !h(i4)) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public int d(int i4) {
        if (g(i4)) {
            return -1;
        }
        return i4 - a(i4, true);
    }

    public Collection e(int i4) {
        return new TreeSet((SortedSet) this.f5927b.tailSet(Integer.valueOf(i4), false));
    }

    public void f(int i4) {
        int iB = this.f5926a.b(Integer.valueOf(i4));
        for (int size = this.f5926a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f5926a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f5926a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i4) {
        return this.f5926a.contains(Integer.valueOf(i4));
    }

    public boolean h(int i4) {
        return this.f5927b.contains(Integer.valueOf(i4));
    }

    public void i(int i4) {
        int iB = this.f5926a.b(Integer.valueOf(i4));
        if (g(i4)) {
            this.f5928c.remove(Integer.valueOf(i4));
            this.f5927b.remove(Integer.valueOf(i4));
            this.f5926a.b(iB);
        }
        while (iB < this.f5926a.size()) {
            Integer num = (Integer) this.f5926a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f5926a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i4) {
        if (i4 == 0) {
            return 0;
        }
        return i4 + a(i4 - 1, false);
    }

    public void b(int i4, int i10) {
        i(i4);
        f(i10);
    }

    public void c(int i4, int i10) {
        this.f5929d = i4;
        this.f5930e = i10;
    }

    public int c(int i4) {
        return i4 + a(i4, false);
    }

    public MaxAd a(int i4) {
        return (MaxAd) this.f5928c.get(Integer.valueOf(i4));
    }

    public void a(MaxAd maxAd, int i4) {
        this.f5928c.put(Integer.valueOf(i4), maxAd);
        this.f5927b.add(Integer.valueOf(i4));
    }

    public void a() {
        this.f5928c.clear();
        this.f5927b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f5928c.remove(num);
            this.f5927b.remove(num);
        }
    }

    private void a(int i4, int i10) {
        if (this.f5928c.containsKey(Integer.valueOf(i4))) {
            this.f5928c.put(Integer.valueOf(i10), (MaxAd) this.f5928c.get(Integer.valueOf(i4)));
            this.f5927b.add(Integer.valueOf(i10));
            this.f5928c.remove(Integer.valueOf(i4));
            this.f5927b.remove(Integer.valueOf(i4));
        }
    }

    private int a(int i4, boolean z3) {
        int iC = this.f5926a.c(Integer.valueOf(i4));
        if (!z3) {
            int i10 = i4 + iC;
            while (iC < this.f5926a.size() && i10 >= ((Integer) this.f5926a.a(iC)).intValue()) {
                i10++;
                iC++;
            }
        }
        return iC;
    }
}
