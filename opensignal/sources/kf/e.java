package kf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class e implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final cg.e f14307g = new cg.e();

    /* renamed from: a, reason: collision with root package name */
    public final Object f14308a;

    /* renamed from: d, reason: collision with root package name */
    public Object f14309d;

    public e(of.b bVar) {
        this.f14308a = bVar;
        this.f14309d = f14307g;
    }

    @Override // kf.j
    public void d(i iVar, int i10) throws IOException {
        int[] iArr = (int[]) this.f14309d;
        try {
            iVar.read((byte[]) this.f14308a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f14308a = bArr;
        this.f14309d = iArr;
    }
}
