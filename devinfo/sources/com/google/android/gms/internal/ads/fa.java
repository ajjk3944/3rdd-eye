package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public final int f11074a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11075b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f11076c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11077d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11078e;

    public fa(int i4, byte[] bArr, Map map, List list, boolean z3) {
        this.f11074a = i4;
        this.f11075b = bArr;
        this.f11076c = map;
        this.f11077d = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.f11078e = z3;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new ba((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public fa(int i4, byte[] bArr, boolean z3, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ba baVar = (ba) it.next();
                treeMap.put(baVar.f9636a, baVar.f9637b);
            }
        }
        this(i4, bArr, treeMap, list, z3);
    }
}
