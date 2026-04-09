package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes3.dex */
public final class zu {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f36738a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f36739b;

    /* renamed from: c, reason: collision with root package name */
    public int f36740c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f36741d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f36742e;

    /* renamed from: f, reason: collision with root package name */
    public int f36743f;

    /* renamed from: g, reason: collision with root package name */
    public int f36744g;

    /* renamed from: h, reason: collision with root package name */
    public int f36745h;
    private final MediaCodec.CryptoInfo i;

    /* renamed from: j, reason: collision with root package name */
    private final a f36746j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f36747a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f36748b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, int i) {
            this(cryptoInfo);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f36747a = cryptoInfo;
            this.f36748b = G0.p.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i10) {
            this.f36748b.set(i, i10);
            this.f36747a.setPattern(this.f36748b);
        }
    }

    public zu() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.f36746j = s82.f32899a >= 24 ? new a(cryptoInfo, 0) : null;
    }

    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public final void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.f36741d == null) {
            int[] iArr = new int[1];
            this.f36741d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f36741d;
        iArr2[0] = iArr2[0] + i;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        this.f36743f = i;
        this.f36741d = iArr;
        this.f36742e = iArr2;
        this.f36739b = bArr;
        this.f36738a = bArr2;
        this.f36740c = i10;
        this.f36744g = i11;
        this.f36745h = i12;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i10;
        if (s82.f32899a >= 24) {
            a aVar = this.f36746j;
            aVar.getClass();
            aVar.a(i11, i12);
        }
    }
}
