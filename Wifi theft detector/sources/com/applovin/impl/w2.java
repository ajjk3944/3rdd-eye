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
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    private final m4 f8344a = new m4();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f8345b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f8346c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f8347d;

    /* renamed from: e, reason: collision with root package name */
    private int f8348e;

    public w2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f8344a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f8344a.isEmpty()) {
            this.f8344a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f8344a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f8344a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f8344a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f8345b);
    }

    public int c() {
        int i10 = this.f8347d;
        if (i10 != -1 && this.f8348e != -1) {
            while (i10 <= this.f8348e) {
                if (g(i10) && !h(i10)) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    public int d(int i10) {
        if (g(i10)) {
            return -1;
        }
        return i10 - a(i10, true);
    }

    public Collection e(int i10) {
        return new TreeSet((SortedSet) this.f8345b.tailSet(Integer.valueOf(i10), false));
    }

    public void f(int i10) {
        int iB = this.f8344a.b(Integer.valueOf(i10));
        for (int size = this.f8344a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f8344a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f8344a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i10) {
        return this.f8344a.contains(Integer.valueOf(i10));
    }

    public boolean h(int i10) {
        return this.f8345b.contains(Integer.valueOf(i10));
    }

    public void i(int i10) {
        int iB = this.f8344a.b(Integer.valueOf(i10));
        if (g(i10)) {
            this.f8346c.remove(Integer.valueOf(i10));
            this.f8345b.remove(Integer.valueOf(i10));
            this.f8344a.b(iB);
        }
        while (iB < this.f8344a.size()) {
            Integer num = (Integer) this.f8344a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f8344a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 + a(i10 - 1, false);
    }

    public void b(int i10, int i11) {
        i(i10);
        f(i11);
    }

    public void c(int i10, int i11) {
        this.f8347d = i10;
        this.f8348e = i11;
    }

    public int c(int i10) {
        return i10 + a(i10, false);
    }

    public MaxAd a(int i10) {
        return (MaxAd) this.f8346c.get(Integer.valueOf(i10));
    }

    public void a(MaxAd maxAd, int i10) {
        this.f8346c.put(Integer.valueOf(i10), maxAd);
        this.f8345b.add(Integer.valueOf(i10));
    }

    public void a() {
        this.f8346c.clear();
        this.f8345b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f8346c.remove(num);
            this.f8345b.remove(num);
        }
    }

    private void a(int i10, int i11) {
        if (this.f8346c.containsKey(Integer.valueOf(i10))) {
            this.f8346c.put(Integer.valueOf(i11), (MaxAd) this.f8346c.get(Integer.valueOf(i10)));
            this.f8345b.add(Integer.valueOf(i11));
            this.f8346c.remove(Integer.valueOf(i10));
            this.f8345b.remove(Integer.valueOf(i10));
        }
    }

    private int a(int i10, boolean z10) {
        int iC = this.f8344a.c(Integer.valueOf(i10));
        if (!z10) {
            int i11 = i10 + iC;
            while (iC < this.f8344a.size() && i11 >= ((Integer) this.f8344a.a(iC)).intValue()) {
                i11++;
                iC++;
            }
        }
        return iC;
    }
}
