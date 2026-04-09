package w4;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f36459d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f36460a;

    /* renamed from: b, reason: collision with root package name */
    public final se.b f36461b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f36462c = 0;

    public s(se.b bVar, int i4) {
        this.f36461b = bVar;
        this.f36460a = i4;
    }

    public final int a(int i4) {
        x4.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f446d;
        int i10 = iA + aVarB.f443a;
        return byteBuffer.getInt((i4 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final x4.a b() {
        ThreadLocal threadLocal = f36459d;
        x4.a aVar = (x4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new x4.a();
            threadLocal.set(aVar);
        }
        x4.b bVar = (x4.b) this.f36461b.f33556a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i4 = iA + bVar.f443a;
            int i10 = (this.f36460a * 4) + ((ByteBuffer) bVar.f446d).getInt(i4) + i4 + 4;
            int i11 = ((ByteBuffer) bVar.f446d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f446d;
            aVar.f446d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f443a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f444b = i12;
                aVar.f445c = ((ByteBuffer) aVar.f446d).getShort(i12);
                return aVar;
            }
            aVar.f443a = 0;
            aVar.f444b = 0;
            aVar.f445c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        x4.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f446d).getInt(iA + aVarB.f443a) : 0));
        sb2.append(", codepoints:");
        x4.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + aVarB2.f443a;
            i4 = ((ByteBuffer) aVarB2.f446d).getInt(((ByteBuffer) aVarB2.f446d).getInt(i10) + i10);
        } else {
            i4 = 0;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
