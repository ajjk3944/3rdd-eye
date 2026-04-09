package j4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13244d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f13245a;

    /* renamed from: b, reason: collision with root package name */
    public final kg.r f13246b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f13247c = 0;

    public u(kg.r rVar, int i10) {
        this.f13246b = rVar;
        this.f13245a = i10;
    }

    public final int a(int i10) {
        k4.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f14040r;
        int i11 = iA + aVarB.f14037a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final k4.a b() {
        ThreadLocal threadLocal = f13244d;
        k4.a aVar = (k4.a) threadLocal.get();
        if (aVar == null) {
            aVar = new k4.a();
            threadLocal.set(aVar);
        }
        k4.b bVar = (k4.b) this.f13246b.f14395a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f14037a;
            int i11 = (this.f13245a * 4) + ((ByteBuffer) bVar.f14040r).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f14040r).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f14040r;
            aVar.f14040r = byteBuffer;
            if (byteBuffer != null) {
                aVar.f14037a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f14038d = i13;
                aVar.f14039g = ((ByteBuffer) aVar.f14040r).getShort(i13);
                return aVar;
            }
            aVar.f14037a = 0;
            aVar.f14038d = 0;
            aVar.f14039g = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        k4.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f14040r).getInt(iA + aVarB.f14037a) : 0));
        sb2.append(", codepoints:");
        k4.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f14037a;
            i10 = ((ByteBuffer) aVarB2.f14040r).getInt(((ByteBuffer) aVarB2.f14040r).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
