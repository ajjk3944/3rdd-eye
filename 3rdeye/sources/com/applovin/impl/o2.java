package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class o2 {

    /* renamed from: a, reason: collision with root package name */
    private final z3 f20619a = new z3();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f20620b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f20621c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f20622d;

    /* renamed from: e, reason: collision with root package name */
    private int f20623e;

    public o2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f20619a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f20619a.isEmpty()) {
            this.f20619a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f20619a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f20619a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f20619a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f20620b);
    }

    public int c() {
        int i = this.f20622d;
        if (i != -1 && this.f20623e != -1) {
            while (i <= this.f20623e) {
                if (g(i) && !h(i)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public int d(int i) {
        if (g(i)) {
            return -1;
        }
        return i - a(i, true);
    }

    public Collection e(int i) {
        return new TreeSet((SortedSet) this.f20620b.tailSet(Integer.valueOf(i), false));
    }

    public void f(int i) {
        int iB = this.f20619a.b(Integer.valueOf(i));
        for (int size = this.f20619a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f20619a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f20619a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i) {
        return this.f20619a.contains(Integer.valueOf(i));
    }

    public boolean h(int i) {
        return this.f20620b.contains(Integer.valueOf(i));
    }

    public void i(int i) {
        int iB = this.f20619a.b(Integer.valueOf(i));
        if (g(i)) {
            this.f20621c.remove(Integer.valueOf(i));
            this.f20620b.remove(Integer.valueOf(i));
            this.f20619a.b(iB);
        }
        while (iB < this.f20619a.size()) {
            Integer num = (Integer) this.f20619a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f20619a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i) {
        if (i == 0) {
            return 0;
        }
        return i + a(i - 1, false);
    }

    public void b(int i, int i10) {
        i(i);
        f(i10);
    }

    public void c(int i, int i10) {
        this.f20622d = i;
        this.f20623e = i10;
    }

    public int c(int i) {
        return i + a(i, false);
    }

    public MaxAd a(int i) {
        return (MaxAd) this.f20621c.get(Integer.valueOf(i));
    }

    public void a(MaxAd maxAd, int i) {
        this.f20621c.put(Integer.valueOf(i), maxAd);
        this.f20620b.add(Integer.valueOf(i));
    }

    public void a() {
        this.f20621c.clear();
        this.f20620b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f20621c.remove(num);
            this.f20620b.remove(num);
        }
    }

    private void a(int i, int i10) {
        if (this.f20621c.containsKey(Integer.valueOf(i))) {
            this.f20621c.put(Integer.valueOf(i10), (MaxAd) this.f20621c.get(Integer.valueOf(i)));
            this.f20620b.add(Integer.valueOf(i10));
            this.f20621c.remove(Integer.valueOf(i));
            this.f20620b.remove(Integer.valueOf(i));
        }
    }

    private int a(int i, boolean z10) {
        int iC = this.f20619a.c(Integer.valueOf(i));
        if (!z10) {
            int i10 = i + iC;
            while (iC < this.f20619a.size() && i10 >= ((Integer) this.f20619a.a(iC)).intValue()) {
                i10++;
                iC++;
            }
        }
        return iC;
    }
}
