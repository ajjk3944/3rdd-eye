package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class A4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6926a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6927b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f6928c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6929d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6930e;

    public A4(int i, byte[] bArr, Map map, List list, boolean z6) {
        this.f6926a = i;
        this.f6927b = bArr;
        this.f6928c = map;
        this.f6929d = list == null ? null : Collections.unmodifiableList(list);
        this.f6930e = z6;
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
            arrayList.add(new C2050w4((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public A4(int i, byte[] bArr, boolean z6, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2050w4 c2050w4 = (C2050w4) it.next();
                treeMap.put(c2050w4.f17404a, c2050w4.f17405b);
            }
        }
        this(i, bArr, treeMap, list, z6);
    }
}
