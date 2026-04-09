package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: assets/audience_network/classes2.dex */
public final class Cq {
    public static final AtomicLong A07 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final C02565i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public Cq(long j, C02565i c02565i, long j8) {
        Uri uri;
        if (c02565i != null) {
            uri = c02565i.A06;
        } else {
            uri = null;
        }
        this(j, c02565i, uri, Collections.emptyMap(), j8, 0L, 0L);
    }

    public Cq(long j, C02565i c02565i, Uri uri, Map<String, List<String>> responseHeaders, long j8, long j9, long j10) {
        this.A03 = j;
        this.A05 = c02565i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j8;
        this.A02 = j9;
        this.A00 = j10;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
