package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rz implements v70 {

    /* renamed from: b, reason: collision with root package name */
    private final lv f32811b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32812c;

    /* renamed from: d, reason: collision with root package name */
    private long f32813d;

    /* renamed from: f, reason: collision with root package name */
    private int f32815f;

    /* renamed from: g, reason: collision with root package name */
    private int f32816g;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f32814e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f32810a = new byte[4096];

    static {
        p60.a("goog.exo.extractor");
    }

    public rz(ov ovVar, long j4, long j10) {
        this.f32811b = ovVar;
        this.f32813d = j4;
        this.f32812c = j10;
    }

    public final boolean a(boolean z10, int i) throws IOException {
        int i10 = this.f32815f + i;
        byte[] bArr = this.f32814e;
        if (i10 > bArr.length) {
            int i11 = s82.f32899a;
            this.f32814e = Arrays.copyOf(this.f32814e, Math.max(65536 + i10, Math.min(bArr.length * 2, i10 + 524288)));
        }
        int iA = this.f32816g - this.f32815f;
        while (iA < i) {
            boolean z11 = z10;
            int i12 = i;
            iA = a(this.f32814e, this.f32815f, i12, iA, z11);
            if (iA == -1) {
                return false;
            }
            this.f32816g = this.f32815f + iA;
            i = i12;
            z10 = z11;
        }
        this.f32815f += i;
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final void b(int i) throws IOException {
        a(false, i);
    }

    public final int c(byte[] bArr, int i, int i10) throws IOException {
        rz rzVar;
        int iMin;
        int i11 = this.f32815f + i10;
        byte[] bArr2 = this.f32814e;
        if (i11 > bArr2.length) {
            int i12 = s82.f32899a;
            this.f32814e = Arrays.copyOf(this.f32814e, Math.max(65536 + i11, Math.min(bArr2.length * 2, i11 + 524288)));
        }
        int i13 = this.f32816g;
        int i14 = this.f32815f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            rzVar = this;
            iMin = rzVar.a(this.f32814e, i14, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            rzVar.f32816g += iMin;
        } else {
            rzVar = this;
            iMin = Math.min(i10, i15);
        }
        System.arraycopy(rzVar.f32814e, rzVar.f32815f, bArr, i, iMin);
        rzVar.f32815f += iMin;
        return iMin;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final long d() {
        return this.f32813d + this.f32815f;
    }

    @Override // com.yandex.mobile.ads.impl.lv
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        rz rzVar;
        int i11 = this.f32816g;
        int iA = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f32814e, 0, bArr, i, iMin);
            d(iMin);
            iA = iMin;
        }
        if (iA == 0) {
            rzVar = this;
            iA = rzVar.a(bArr, i, i10, 0, true);
        } else {
            rzVar = this;
        }
        if (iA != -1) {
            rzVar.f32813d += iA;
        }
        return iA;
    }

    private void d(int i) {
        int i10 = this.f32816g - i;
        this.f32816g = i10;
        this.f32815f = 0;
        byte[] bArr = this.f32814e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i10);
        this.f32814e = bArr2;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final long b() {
        return this.f32812c;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final boolean b(byte[] bArr, int i, int i10, boolean z10) throws IOException {
        if (!a(z10, i10)) {
            return false;
        }
        System.arraycopy(this.f32814e, this.f32815f - i10, bArr, i, i10);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final void b(byte[] bArr, int i, int i10) throws IOException {
        a(bArr, i, i10, false);
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final long a() {
        return this.f32813d;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final void a(byte[] bArr, int i, int i10) throws IOException {
        b(bArr, i, i10, false);
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final boolean a(byte[] bArr, int i, int i10, boolean z10) throws IOException {
        int iA;
        int i11 = this.f32816g;
        if (i11 == 0) {
            iA = 0;
        } else {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f32814e, 0, bArr, i, iMin);
            d(iMin);
            iA = iMin;
        }
        while (iA < i10 && iA != -1) {
            iA = a(bArr, i, i10, iA, z10);
        }
        if (iA != -1) {
            this.f32813d += iA;
        }
        return iA != -1;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final void c() {
        this.f32815f = 0;
    }

    public final int c(int i) throws IOException {
        rz rzVar;
        int iMin = Math.min(this.f32816g, i);
        d(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f32810a;
            rzVar = this;
            iMin = rzVar.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            rzVar = this;
        }
        if (iMin != -1) {
            rzVar.f32813d += iMin;
        }
        return iMin;
    }

    @Override // com.yandex.mobile.ads.impl.v70
    public final void a(int i) throws IOException {
        int iMin = Math.min(this.f32816g, i);
        d(iMin);
        int iA = iMin;
        while (iA < i && iA != -1) {
            iA = a(this.f32810a, -iA, Math.min(i, this.f32810a.length + iA), iA, false);
        }
        if (iA != -1) {
            this.f32813d += iA;
        }
    }

    private int a(byte[] bArr, int i, int i10, int i11, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int i12 = this.f32811b.read(bArr, i + i11, i10 - i11);
            if (i12 != -1) {
                return i11 + i12;
            }
            if (i11 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }
}
