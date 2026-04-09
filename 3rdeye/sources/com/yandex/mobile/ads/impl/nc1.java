package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class nc1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f30835a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f30836b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f30837c;

    /* renamed from: d, reason: collision with root package name */
    public final List<ef0> f30838d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f30839e;

    @Deprecated
    public nc1() {
        throw null;
    }

    private static List<ef0> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new ef0(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private nc1(int i, byte[] bArr, Map map, List list, boolean z10) {
        this.f30835a = i;
        this.f30836b = bArr;
        this.f30837c = map;
        if (list == null) {
            this.f30838d = null;
        } else {
            this.f30838d = Collections.unmodifiableList(list);
        }
        this.f30839e = z10;
    }

    private static Map<String, String> a(List<ef0> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (ef0 ef0Var : list) {
            treeMap.put(ef0Var.a(), ef0Var.b());
        }
        return treeMap;
    }

    @Deprecated
    public nc1(int i, byte[] bArr, Map map, boolean z10) {
        this(i, bArr, map, a((Map<String, String>) map), z10);
    }

    public nc1(int i, byte[] bArr, boolean z10, long j4, List<ef0> list) {
        this(i, bArr, a(list), list, z10);
    }
}
