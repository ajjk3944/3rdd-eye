package f0;

import g0.C2328a;
import g0.C2329b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f20022d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f20023a;

    /* renamed from: b, reason: collision with root package name */
    public final c1.g f20024b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f20025c = 0;

    public v(c1.g gVar, int i) {
        this.f20024b = gVar;
        this.f20023a = i;
    }

    public final int a(int i) {
        C2328a c2328aB = b();
        int iA = c2328aB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2328aB.f3262d;
        int i3 = iA + c2328aB.f3259a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public final C2328a b() {
        ThreadLocal threadLocal = f20022d;
        C2328a c2328a = (C2328a) threadLocal.get();
        if (c2328a == null) {
            c2328a = new C2328a();
            threadLocal.set(c2328a);
        }
        C2329b c2329b = (C2329b) this.f20024b.f5896b;
        int iA = c2329b.a(6);
        if (iA != 0) {
            int i = iA + c2329b.f3259a;
            int i3 = (this.f20023a * 4) + ((ByteBuffer) c2329b.f3262d).getInt(i) + i + 4;
            int i6 = ((ByteBuffer) c2329b.f3262d).getInt(i3) + i3;
            ByteBuffer byteBuffer = (ByteBuffer) c2329b.f3262d;
            c2328a.f3262d = byteBuffer;
            if (byteBuffer != null) {
                c2328a.f3259a = i6;
                int i7 = i6 - byteBuffer.getInt(i6);
                c2328a.f3260b = i7;
                c2328a.f3261c = ((ByteBuffer) c2328a.f3262d).getShort(i7);
                return c2328a;
            }
            c2328a.f3259a = 0;
            c2328a.f3260b = 0;
            c2328a.f3261c = 0;
        }
        return c2328a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2328a c2328aB = b();
        int iA = c2328aB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) c2328aB.f3262d).getInt(iA + c2328aB.f3259a) : 0));
        sb.append(", codepoints:");
        C2328a c2328aB2 = b();
        int iA2 = c2328aB2.a(16);
        if (iA2 != 0) {
            int i3 = iA2 + c2328aB2.f3259a;
            i = ((ByteBuffer) c2328aB2.f3262d).getInt(((ByteBuffer) c2328aB2.f3262d).getInt(i3) + i3);
        } else {
            i = 0;
        }
        for (int i6 = 0; i6 < i; i6++) {
            sb.append(Integer.toHexString(a(i6)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
