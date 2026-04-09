package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class K4 {

    /* renamed from: a, reason: collision with root package name */
    public long f9440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9441b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9442c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9443d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9444e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9445f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9446g;

    /* renamed from: h, reason: collision with root package name */
    public final List f9447h;

    public K4(String str, String str2, long j6, long j7, long j8, long j9, List list) {
        this.f9441b = str;
        this.f9442c = true == "".equals(str2) ? null : str2;
        this.f9443d = j6;
        this.f9444e = j7;
        this.f9445f = j8;
        this.f9446g = j9;
        this.f9447h = list;
    }

    public static K4 a(L4 l42) throws IOException {
        if (N4.h(l42) != 538247942) {
            throw new IOException();
        }
        String strL = N4.l(l42);
        String strL2 = N4.l(l42);
        long j6 = N4.j(l42);
        long j7 = N4.j(l42);
        long j8 = N4.j(l42);
        long j9 = N4.j(l42);
        int iH = N4.h(l42);
        if (iH < 0) {
            throw new IOException(A.f.i(iH, "readHeaderList size=", new StringBuilder(String.valueOf(iH).length() + 20)));
        }
        List arrayList = iH == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iH; i++) {
            arrayList.add(new C2050w4(N4.l(l42).intern(), N4.l(l42).intern()));
        }
        return new K4(strL, strL2, j6, j7, j8, j9, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public K4(String str, C1834s4 c1834s4) {
        String str2 = c1834s4.f16672b;
        long j6 = c1834s4.f16673c;
        long j7 = c1834s4.f16674d;
        long j8 = c1834s4.f16675e;
        long j9 = c1834s4.f16676f;
        List arrayList = c1834s4.f16678h;
        if (arrayList == 0) {
            Map map = c1834s4.f16677g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new C2050w4((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j6, j7, j8, j9, arrayList);
    }
}
