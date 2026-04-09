package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class l {

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f3056a;

        public a(ByteBuffer byteBuffer) {
            this.f3056a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public int a() {
            return this.f3056a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long b() {
            return l.c(this.f3056a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f3056a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f3056a.getShort());
        }

        @Override // androidx.emoji2.text.l.c
        public void skip(int i10) {
            ByteBuffer byteBuffer = this.f3056a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f3057a;

        /* renamed from: b, reason: collision with root package name */
        public final long f3058b;

        public b(long j10, long j11) {
            this.f3057a = j10;
            this.f3058b = j11;
        }

        public long a() {
            return this.f3057a;
        }
    }

    public interface c {
        int a();

        long b();

        long getPosition();

        int readUnsignedShort();

        void skip(int i10);
    }

    public static b a(c cVar) throws IOException {
        long jB;
        cVar.skip(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.skip(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jB = -1;
                break;
            }
            int iA = cVar.a();
            cVar.skip(4);
            jB = cVar.b();
            cVar.skip(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jB != -1) {
            cVar.skip((int) (jB - cVar.getPosition()));
            cVar.skip(12);
            long jB2 = cVar.b();
            for (int i11 = 0; i11 < jB2; i11++) {
                int iA2 = cVar.a();
                long jB3 = cVar.b();
                long jB4 = cVar.b();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jB3 + jB, jB4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static e1.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return e1.b.h(byteBufferDuplicate);
    }

    public static long c(int i10) {
        return i10 & 4294967295L;
    }

    public static int d(short s10) {
        return s10 & 65535;
    }
}
