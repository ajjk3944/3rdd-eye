package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uv1 {

    /* renamed from: a, reason: collision with root package name */
    public final t9 f17356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17357b;

    /* renamed from: c, reason: collision with root package name */
    public final kh0 f17358c;

    /* renamed from: d, reason: collision with root package name */
    public int f17359d;

    /* renamed from: e, reason: collision with root package name */
    public long f17360e;

    /* renamed from: f, reason: collision with root package name */
    public long f17361f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public long f17362h;

    /* renamed from: i, reason: collision with root package name */
    public long f17363i;

    public uv1(AudioTrack audioTrack, kh0 kh0Var) {
        this.f17356a = new t9(audioTrack);
        this.f17357b = audioTrack.getSampleRate();
        this.f17358c = kh0Var;
        a(0);
    }

    public final void a(int i4) {
        this.f17359d = i4;
        long j = 10000;
        if (i4 == 0) {
            this.g = 0L;
            this.f17362h = -1L;
            this.f17363i = -9223372036854775807L;
            this.f17360e = System.nanoTime() / 1000;
        } else {
            if (i4 == 1) {
                this.f17361f = 10000L;
                return;
            }
            j = (i4 == 2 || i4 == 3) ? 10000000L : 500000L;
        }
        this.f17361f = j;
    }
}
