package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.snmp4j.smi.Counter32;

/* loaded from: classes.dex */
abstract class m {

    private static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f31053a;

        a(ByteBuffer byteBuffer) {
            this.f31053a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.m.c
        public int a() {
            return this.f31053a.getInt();
        }

        @Override // androidx.emoji2.text.m.c
        public void b(int i10) {
            ByteBuffer byteBuffer = this.f31053a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.m.c
        public long c() {
            return m.c(this.f31053a.getInt());
        }

        @Override // androidx.emoji2.text.m.c
        public long getPosition() {
            return this.f31053a.position();
        }

        @Override // androidx.emoji2.text.m.c
        public int readUnsignedShort() {
            return m.d(this.f31053a.getShort());
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final long f31054a;

        /* renamed from: b, reason: collision with root package name */
        private final long f31055b;

        b(long j10, long j11) {
            this.f31054a = j10;
            this.f31055b = j11;
        }

        long a() {
            return this.f31054a;
        }
    }

    private interface c {
        int a();

        void b(int i10);

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jC;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iA = cVar.a();
            cVar.b(4);
            jC = cVar.c();
            cVar.b(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jC != -1) {
            cVar.b((int) (jC - cVar.getPosition()));
            cVar.b(12);
            long jC2 = cVar.c();
            for (int i11 = 0; i11 < jC2; i11++) {
                int iA2 = cVar.a();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static S1.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return S1.b.h(byteBufferDuplicate);
    }

    static long c(int i10) {
        return i10 & Counter32.MAX_COUNTER32_VALUE;
    }

    static int d(short s10) {
        return s10 & 65535;
    }
}
