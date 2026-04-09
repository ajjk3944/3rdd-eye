package le;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final ja.c f28714c = new ja.c();

    /* renamed from: a, reason: collision with root package name */
    public final Object f28715a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28716b;

    public f(pe.c cVar) {
        this.f28715a = cVar;
        this.f28716b = f28714c;
    }

    @Override // le.k
    public void b(j jVar, int i4) throws IOException {
        int[] iArr = (int[]) this.f28716b;
        try {
            jVar.read((byte[]) this.f28715a, iArr[0], i4);
            iArr[0] = iArr[0] + i4;
        } finally {
            jVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f28715a = bArr;
        this.f28716b = iArr;
    }
}
