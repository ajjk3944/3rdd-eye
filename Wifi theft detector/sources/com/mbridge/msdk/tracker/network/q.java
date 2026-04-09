package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f18341a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f18342b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f18343c;

    /* renamed from: d, reason: collision with root package name */
    public final List<g> f18344d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18345e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18346f;

    public q(int i10, byte[] bArr, boolean z10, long j10, List<g> list) {
        this(i10, bArr, a(list), list, z10, j10);
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

    private q(int i10, byte[] bArr, Map<String, String> map, List<g> list, boolean z10, long j10) {
        this.f18341a = i10;
        this.f18342b = bArr;
        this.f18343c = map;
        if (list == null) {
            this.f18344d = null;
        } else {
            this.f18344d = Collections.unmodifiableList(list);
        }
        this.f18345e = z10;
        this.f18346f = j10;
    }
}
