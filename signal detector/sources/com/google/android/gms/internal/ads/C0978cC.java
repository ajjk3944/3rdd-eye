package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* renamed from: com.google.android.gms.internal.ads.cC, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978cC extends AbstractC1895tB implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient Map f13540d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f13541e;

    /* renamed from: f, reason: collision with root package name */
    public final transient C1086eB f13542f;

    public C0978cC(Map map, C1086eB c1086eB) {
        AbstractC0582Jp.m(map.isEmpty());
        this.f13540d = map;
        this.f13542f = c1086eB;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1895tB
    public final Collection a() {
        return new C1841sB(0, this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1895tB
    public final Map b() {
        Map map = this.f13540d;
        return map instanceof NavigableMap ? new C1464lB(this, (NavigableMap) map) : map instanceof SortedMap ? new C1626oB(this, (SortedMap) map) : new C1356jB(this, map);
    }

    public final void e() {
        Map map = this.f13540d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f13541e = 0;
    }
}
