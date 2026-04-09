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
    public final C06345i A05;
    public final Map<String, List<String>> A06;

    /* JADX WARN: Illegal instructions before constructor call */
    public Cq(long j10, C06345i c06345i, long j11) {
        Uri uri;
        if (c06345i != null) {
            uri = c06345i.A06;
        } else {
            uri = null;
        }
        this(j10, c06345i, uri, Collections.emptyMap(), j11, 0L, 0L);
    }

    public Cq(long j10, C06345i c06345i, Uri uri, Map<String, List<String>> responseHeaders, long j11, long j12, long j13) {
        this.A03 = j10;
        this.A05 = c06345i;
        this.A04 = uri;
        this.A06 = responseHeaders;
        this.A01 = j11;
        this.A02 = j12;
        this.A00 = j13;
    }

    public static long A00() {
        return A07.getAndIncrement();
    }
}
