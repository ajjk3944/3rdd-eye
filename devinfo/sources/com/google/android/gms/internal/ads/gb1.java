package com.google.android.gms.internal.ads;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gb1 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11478f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11479a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11480b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11481c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11482d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11483e;

    static {
        y5.a("media3.datasource");
    }

    public gb1(Uri uri, long j, long j8) {
        this(uri, Collections.EMPTY_MAP, j, j8, 0);
    }

    public final String toString() {
        String string = this.f11479a.toString();
        int length = string.length();
        long j = this.f11481c;
        int length2 = String.valueOf(j).length();
        long j8 = this.f11482d;
        int length3 = String.valueOf(j8).length();
        int i4 = this.f11483e;
        StringBuilder sb2 = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i4).length() + 1);
        sb2.append("DataSpec[GET ");
        sb2.append(string);
        sb2.append(", ");
        sb2.append(j);
        a0.g.A(sb2, ", ", j8, ", null, ");
        return r5.c.j(i4, "]", sb2);
    }

    public gb1(Uri uri, Map map, long j, long j8, int i4) {
        boolean z3 = false;
        boolean z10 = j >= 0;
        mq0.m(z10);
        mq0.m(z10);
        if (j8 > 0) {
            z3 = true;
        } else if (j8 == -1) {
            j8 = -1;
            z3 = true;
        }
        mq0.m(z3);
        uri.getClass();
        this.f11479a = uri;
        this.f11480b = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f11481c = j;
        this.f11482d = j8;
        this.f11483e = i4;
    }
}
