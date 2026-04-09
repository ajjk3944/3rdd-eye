package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pa {

    /* renamed from: a, reason: collision with root package name */
    public long f14935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14937c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14938d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14939e;

    /* renamed from: f, reason: collision with root package name */
    public final long f14940f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final List f14941h;

    public pa(String str, String str2, long j, long j8, long j9, long j10, List list) {
        this.f14936b = str;
        this.f14937c = true == "".equals(str2) ? null : str2;
        this.f14938d = j;
        this.f14939e = j8;
        this.f14940f = j9;
        this.g = j10;
        this.f14941h = list;
    }

    public static pa a(qa qaVar) throws IOException {
        if (sa.h(qaVar) != 538247942) {
            throw new IOException();
        }
        String strL = sa.l(qaVar);
        String strL2 = sa.l(qaVar);
        long j = sa.j(qaVar);
        long j8 = sa.j(qaVar);
        long j9 = sa.j(qaVar);
        long j10 = sa.j(qaVar);
        int iH = sa.h(qaVar);
        if (iH < 0) {
            throw new IOException(d.h.q(iH, "readHeaderList size=", new StringBuilder(String.valueOf(iH).length() + 20)));
        }
        List arrayList = iH == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i4 = 0; i4 < iH; i4++) {
            arrayList.add(new ba(sa.l(qaVar).intern(), sa.l(qaVar).intern()));
        }
        return new pa(strL, strL2, j, j8, j9, j10, arrayList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    public pa(String str, x9 x9Var) {
        String str2 = x9Var.f18323b;
        long j = x9Var.f18324c;
        long j8 = x9Var.f18325d;
        long j9 = x9Var.f18326e;
        long j10 = x9Var.f18327f;
        List arrayList = x9Var.f18328h;
        if (arrayList == 0) {
            Map map = x9Var.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new ba((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j8, j9, j10, arrayList);
    }
}
