package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;

/* loaded from: classes.dex */
public final class OL {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f10177a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10178b;

    /* renamed from: c, reason: collision with root package name */
    public int f10179c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f10180d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f10181e;

    /* renamed from: f, reason: collision with root package name */
    public int f10182f;

    /* renamed from: g, reason: collision with root package name */
    public int f10183g;

    /* renamed from: h, reason: collision with root package name */
    public int f10184h;
    public final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    public final C1879sw f10185j;

    public OL() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f10185j = Build.VERSION.SDK_INT >= 24 ? new C1879sw(cryptoInfo) : null;
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f10180d == null) {
            int[] iArr = new int[1];
            this.f10180d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f10180d;
        iArr2[0] = iArr2[0] + i;
    }
}
