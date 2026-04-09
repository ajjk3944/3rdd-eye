package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class os1 {

    /* renamed from: a, reason: collision with root package name */
    public int f14778a;

    /* renamed from: b, reason: collision with root package name */
    public int f14779b;

    /* renamed from: c, reason: collision with root package name */
    public int f14780c;

    /* renamed from: d, reason: collision with root package name */
    public int f14781d;

    /* renamed from: e, reason: collision with root package name */
    public int f14782e;

    /* renamed from: f, reason: collision with root package name */
    public int f14783f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f14784h;

    /* renamed from: i, reason: collision with root package name */
    public int f14785i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f14786k;

    /* renamed from: l, reason: collision with root package name */
    public int f14787l;

    public final synchronized void a() {
    }

    public final String toString() {
        int i4 = this.f14778a;
        int i10 = this.f14779b;
        int i11 = this.f14780c;
        int i12 = this.f14781d;
        int i13 = this.f14782e;
        int i14 = this.f14783f;
        int i15 = this.g;
        int i16 = this.f14784h;
        int i17 = this.f14785i;
        int i18 = this.j;
        long j = this.f14786k;
        int i19 = this.f14787l;
        String str = bq0.f9768a;
        Locale locale = Locale.US;
        StringBuilder sbN = r5.c.n(i4, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        je.u.x(i11, i12, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbN);
        je.u.x(i13, i14, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbN);
        je.u.x(i15, i16, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbN);
        je.u.x(i17, i18, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbN);
        sbN.append(j);
        sbN.append("\n videoFrameProcessingOffsetCount=");
        sbN.append(i19);
        sbN.append("\n}");
        return sbN.toString();
    }
}
