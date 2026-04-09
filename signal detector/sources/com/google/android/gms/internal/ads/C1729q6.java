package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729q6 implements InterfaceC1989uy {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f16321a;

    public C1729q6(byte[] bArr, int i) {
        switch (i) {
            case 1:
                this.f16321a = bArr;
                break;
            default:
                this.f16321a = new byte[256];
                for (int i3 = 0; i3 < 256; i3++) {
                    this.f16321a[i3] = (byte) i3;
                }
                int i6 = 0;
                for (int i7 = 0; i7 < 256; i7++) {
                    byte[] bArr2 = this.f16321a;
                    byte b5 = bArr2[i7];
                    i6 = (i6 + b5 + bArr[i7 % bArr.length]) & 255;
                    bArr2[i7] = bArr2[i6];
                    bArr2[i6] = b5;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989uy
    public /* synthetic */ void d(Object obj, FileOutputStream fileOutputStream) throws IOException {
        fileOutputStream.write((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989uy
    public /* synthetic */ Object f() {
        return this.f16321a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1989uy
    public Object g(FileInputStream fileInputStream) {
        try {
            return BC.a(fileInputStream);
        } catch (IOException e6) {
            throw new C1881sy("Cannot read bytes.", e6);
        }
    }
}
