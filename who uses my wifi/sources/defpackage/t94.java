package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class t94 implements cp1 {
    public static final zt0 m = zt0.I(t94.class);
    public final String f;
    public ByteBuffer i;
    public long j;
    public lx l;
    public long k = -1;
    public boolean h = true;
    public boolean g = true;

    public t94(String str) {
        this.f = str;
    }

    @Override // defpackage.cp1
    public final void a(lx lxVar, ByteBuffer byteBuffer, long j, zo1 zo1Var) {
        this.j = lxVar.s();
        byteBuffer.remaining();
        this.k = j;
        this.l = lxVar;
        ((ByteBuffer) lxVar.g).position((int) (lxVar.s() + j));
        this.h = false;
        this.g = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.h) {
                return;
            }
            try {
                zt0 zt0Var = m;
                String str = this.f;
                zt0Var.C(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                lx lxVar = this.l;
                long j = this.j;
                long j2 = this.k;
                ByteBuffer byteBuffer = (ByteBuffer) lxVar.g;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j2);
                byteBuffer.position(iPosition);
                this.i = byteBufferSlice;
                this.h = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            zt0 zt0Var = m;
            String str = this.f;
            zt0Var.C(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.i;
            if (byteBuffer != null) {
                this.g = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.i = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
