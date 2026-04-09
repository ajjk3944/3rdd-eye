package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f15146a;

    /* renamed from: b, reason: collision with root package name */
    public final List<g> f15147b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f15148c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15149d;

    public a(int i10, byte[] bArr, List<g> list) {
        this(i10, bArr, a(list), list);
    }

    private static Map<String, String> a(List<g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }

    private a(int i10, byte[] bArr, Map<String, String> map, List<g> list) {
        this.f15149d = i10;
        this.f15146a = bArr;
        this.f15148c = map;
        if (list == null) {
            this.f15147b = null;
        } else {
            this.f15147b = Collections.unmodifiableList(list);
        }
    }
}
