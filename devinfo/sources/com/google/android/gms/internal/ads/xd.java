package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xd implements jy0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f18374a;

    public xd(byte[] bArr, int i4) {
        switch (i4) {
            case 1:
                this.f18374a = bArr;
                break;
            case 2:
                this.f18374a = new byte[256];
                for (int i10 = 0; i10 < 256; i10++) {
                    this.f18374a[i10] = (byte) i10;
                }
                int i11 = 0;
                for (int i12 = 0; i12 < 256; i12++) {
                    byte[] bArr2 = this.f18374a;
                    byte b10 = bArr2[i12];
                    i11 = (i11 + b10 + bArr[i12 % bArr.length]) & 255;
                    bArr2[i12] = bArr2[i11];
                    bArr2[i11] = b10;
                }
                break;
            default:
                this.f18374a = new byte[256];
                for (int i13 = 0; i13 < 256; i13++) {
                    this.f18374a[i13] = (byte) i13;
                }
                int i14 = 0;
                for (int i15 = 0; i15 < 256; i15++) {
                    byte[] bArr3 = this.f18374a;
                    byte b11 = bArr3[i15];
                    i14 = (i14 + b11 + bArr[i15 % bArr.length]) & 255;
                    bArr3[i15] = bArr3[i14];
                    bArr3[i14] = b11;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jy0
    public /* synthetic */ void e(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.jy0
    public Object f(FileInputStream fileInputStream) {
        try {
            return p61.a(fileInputStream);
        } catch (IOException e2) {
            throw new hy0("Cannot read bytes.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.jy0
    public /* synthetic */ Object zzc() {
        return this.f18374a;
    }
}
