package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bp1 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9756a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9757b;

    /* renamed from: c, reason: collision with root package name */
    public int f9758c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f9759d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f9760e;

    /* renamed from: f, reason: collision with root package name */
    public int f9761f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f9762h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f9763i;
    public final jo1 j;

    public bp1() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f9763i = cryptoInfo;
        this.j = Build.VERSION.SDK_INT >= 24 ? new jo1(cryptoInfo) : null;
    }

    public final void a(int i4) {
        if (i4 == 0) {
            return;
        }
        if (this.f9759d == null) {
            int[] iArr = new int[1];
            this.f9759d = iArr;
            this.f9763i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f9759d;
        iArr2[0] = iArr2[0] + i4;
    }
}
