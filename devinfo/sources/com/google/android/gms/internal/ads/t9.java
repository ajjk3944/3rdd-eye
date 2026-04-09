package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public long f16752a;

    /* renamed from: b, reason: collision with root package name */
    public long f16753b;

    /* renamed from: c, reason: collision with root package name */
    public long f16754c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16755d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16756e;

    public /* synthetic */ t9(ByteBuffer byteBuffer, long j, long j8, long j9, ByteBuffer byteBuffer2) {
        this.f16755d = byteBuffer;
        this.f16752a = j;
        this.f16753b = j8;
        this.f16754c = j9;
        this.f16756e = byteBuffer2;
    }

    public t9(AudioTrack audioTrack) {
        this.f16755d = audioTrack;
        this.f16756e = new AudioTimestamp();
    }
}
