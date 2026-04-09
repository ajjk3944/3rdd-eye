package V2;

import N2.u;
import t4.C5606d;

/* compiled from: BytesResource.java */
/* loaded from: classes.dex */
public final class b implements u<byte[]> {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f12912b;

    public b(byte[] bArr) {
        C5606d.l(bArr, "Argument must not be null");
        this.f12912b = bArr;
    }

    @Override // N2.u
    public final Class<byte[]> c() {
        return byte[].class;
    }

    @Override // N2.u
    public final byte[] get() {
        return this.f12912b;
    }

    @Override // N2.u
    public final int getSize() {
        return this.f12912b.length;
    }

    @Override // N2.u
    public final void a() {
    }
}
