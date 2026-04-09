package O2;

import B2.a;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0044a {

    /* renamed from: a, reason: collision with root package name */
    private final F2.d f16903a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.b f16904b;

    public b(F2.d dVar, F2.b bVar) {
        this.f16903a = dVar;
        this.f16904b = bVar;
    }

    @Override // B2.a.InterfaceC0044a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f16903a.e(i10, i11, config);
    }

    @Override // B2.a.InterfaceC0044a
    public int[] b(int i10) {
        F2.b bVar = this.f16904b;
        return bVar == null ? new int[i10] : (int[]) bVar.e(i10, int[].class);
    }

    @Override // B2.a.InterfaceC0044a
    public void c(Bitmap bitmap) {
        this.f16903a.c(bitmap);
    }

    @Override // B2.a.InterfaceC0044a
    public void d(byte[] bArr) {
        F2.b bVar = this.f16904b;
        if (bVar == null) {
            return;
        }
        bVar.d(bArr);
    }

    @Override // B2.a.InterfaceC0044a
    public byte[] e(int i10) {
        F2.b bVar = this.f16904b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.e(i10, byte[].class);
    }

    @Override // B2.a.InterfaceC0044a
    public void f(int[] iArr) {
        F2.b bVar = this.f16904b;
        if (bVar == null) {
            return;
        }
        bVar.d(iArr);
    }
}
