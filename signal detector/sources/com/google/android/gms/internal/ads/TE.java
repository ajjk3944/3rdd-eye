package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class TE {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11360f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f11361a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11362b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11363c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11364d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11365e;

    static {
        AbstractC2102x2.a("media3.datasource");
    }

    public TE(Uri uri, long j6, long j7) {
        this(uri, Collections.EMPTY_MAP, j6, j7, 0);
    }

    public final String toString() {
        String string = this.f11361a.toString();
        int length = string.length();
        long j6 = this.f11363c;
        int length2 = String.valueOf(j6).length();
        long j7 = this.f11364d;
        int length3 = String.valueOf(j7).length();
        int i = this.f11365e;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i).length() + 1);
        sb.append("DataSpec[GET ");
        sb.append(string);
        sb.append(", ");
        sb.append(j6);
        A.f.v(sb, ", ", j7, ", null, ");
        return AbstractC2763b.d(i, "]", sb);
    }

    public TE(Uri uri, Map map, long j6, long j7, int i) {
        boolean z6 = false;
        boolean z7 = j6 >= 0;
        AbstractC0582Jp.m(z7);
        AbstractC0582Jp.m(z7);
        if (j7 > 0) {
            z6 = true;
        } else if (j7 == -1) {
            j7 = -1;
            z6 = true;
        }
        AbstractC0582Jp.m(z6);
        uri.getClass();
        this.f11361a = uri;
        this.f11362b = Collections.unmodifiableMap(new HashMap(map));
        this.f11363c = j6;
        this.f11364d = j7;
        this.f11365e = i;
    }
}
