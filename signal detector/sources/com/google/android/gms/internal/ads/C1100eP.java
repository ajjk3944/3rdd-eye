package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import b4.C0354s;

/* renamed from: com.google.android.gms.internal.ads.eP, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100eP {

    /* renamed from: a, reason: collision with root package name */
    public final C0354s f13892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13893b;

    /* renamed from: c, reason: collision with root package name */
    public final C2255zu f13894c;

    /* renamed from: d, reason: collision with root package name */
    public int f13895d;

    /* renamed from: e, reason: collision with root package name */
    public long f13896e;

    /* renamed from: f, reason: collision with root package name */
    public long f13897f;

    /* renamed from: g, reason: collision with root package name */
    public long f13898g;

    /* renamed from: h, reason: collision with root package name */
    public long f13899h;
    public long i;

    public C1100eP(AudioTrack audioTrack, C2255zu c2255zu) {
        this.f13892a = new C0354s(audioTrack);
        this.f13893b = audioTrack.getSampleRate();
        this.f13894c = c2255zu;
        a(0);
    }

    public final void a(int i) {
        this.f13895d = i;
        long j6 = 10000;
        if (i == 0) {
            this.f13898g = 0L;
            this.f13899h = -1L;
            this.i = -9223372036854775807L;
            this.f13896e = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.f13897f = 10000L;
                return;
            }
            j6 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.f13897f = j6;
    }
}
