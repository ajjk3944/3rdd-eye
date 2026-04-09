package L2;

import E2.c;
import W2.k;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f11213a;

    public b(byte[] bArr) {
        this.f11213a = (byte[]) k.d(bArr);
    }

    @Override // E2.c
    public int a() {
        return this.f11213a.length;
    }

    @Override // E2.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f11213a;
    }

    @Override // E2.c
    public void c() {
    }

    @Override // E2.c
    public Class d() {
        return byte[].class;
    }
}
