package com.yandex.mobile.ads.impl;

import N7.C1094a9;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ky {

    /* renamed from: a, reason: collision with root package name */
    public int f29809a;

    /* renamed from: b, reason: collision with root package name */
    public int f29810b;

    /* renamed from: c, reason: collision with root package name */
    public int f29811c;

    /* renamed from: d, reason: collision with root package name */
    public int f29812d;

    /* renamed from: e, reason: collision with root package name */
    public int f29813e;

    /* renamed from: f, reason: collision with root package name */
    public int f29814f;

    /* renamed from: g, reason: collision with root package name */
    public int f29815g;

    /* renamed from: h, reason: collision with root package name */
    public int f29816h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f29817j;

    /* renamed from: k, reason: collision with root package name */
    public long f29818k;

    /* renamed from: l, reason: collision with root package name */
    public int f29819l;

    public final String toString() {
        int i = this.f29809a;
        int i10 = this.f29810b;
        int i11 = this.f29811c;
        int i12 = this.f29812d;
        int i13 = this.f29813e;
        int i14 = this.f29814f;
        int i15 = this.f29815g;
        int i16 = this.f29816h;
        int i17 = this.i;
        int i18 = this.f29817j;
        long j4 = this.f29818k;
        int i19 = this.f29819l;
        int i20 = s82.f32899a;
        Locale locale = Locale.US;
        StringBuilder sbI = androidx.work.s.i("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        C1094a9.k(sbI, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        C1094a9.k(sbI, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        C1094a9.k(sbI, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        C1094a9.k(sbI, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        sbI.append(j4);
        sbI.append("\n videoFrameProcessingOffsetCount=");
        sbI.append(i19);
        sbI.append("\n}");
        return sbI.toString();
    }
}
