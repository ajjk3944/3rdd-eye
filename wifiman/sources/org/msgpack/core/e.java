package org.msgpack.core;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.d;
import org.snmp4j.asn1.BER;
import yj.u;

/* loaded from: classes.dex */
public abstract class e implements Closeable, Flushable {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f57007h;

    /* renamed from: a, reason: collision with root package name */
    private final int f57008a;

    /* renamed from: b, reason: collision with root package name */
    private final int f57009b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f57010c;

    /* renamed from: d, reason: collision with root package name */
    protected org.msgpack.core.buffer.e f57011d;

    /* renamed from: e, reason: collision with root package name */
    private MessageBuffer f57012e;

    /* renamed from: f, reason: collision with root package name */
    private int f57013f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f57014g = 0;

    static {
        boolean z10 = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i10 = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i10 >= 14 && i10 < 21) {
                z10 = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        } catch (NoSuchFieldException e12) {
            e12.printStackTrace();
        } catch (NoSuchMethodException e13) {
            e13.printStackTrace();
        } catch (InvocationTargetException e14) {
            e14.printStackTrace();
        }
        f57007h = z10;
    }

    protected e(org.msgpack.core.buffer.e eVar, d.b bVar) {
        this.f57011d = (org.msgpack.core.buffer.e) g.d(eVar, "MessageBufferOutput is null");
        this.f57008a = bVar.d();
        this.f57009b = bVar.c();
        this.f57010c = bVar.e();
    }

    private void Y(byte b10) {
        a(1);
        MessageBuffer messageBuffer = this.f57012e;
        int i10 = this.f57013f;
        this.f57013f = i10 + 1;
        messageBuffer.putByte(i10, b10);
    }

    private void a(int i10) {
        MessageBuffer messageBuffer = this.f57012e;
        if (messageBuffer == null) {
            this.f57012e = this.f57011d.L(i10);
        } else if (this.f57013f + i10 >= messageBuffer.size()) {
            g();
            this.f57012e = this.f57011d.L(i10);
        }
    }

    private void b0(byte b10, byte b11) {
        a(2);
        MessageBuffer messageBuffer = this.f57012e;
        int i10 = this.f57013f;
        this.f57013f = i10 + 1;
        messageBuffer.putByte(i10, b10);
        MessageBuffer messageBuffer2 = this.f57012e;
        int i11 = this.f57013f;
        this.f57013f = i11 + 1;
        messageBuffer2.putByte(i11, b11);
    }

    private void d0(byte b10, double d10) {
        a(9);
        MessageBuffer messageBuffer = this.f57012e;
        int i10 = this.f57013f;
        this.f57013f = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.f57012e.putDouble(this.f57013f, d10);
        this.f57013f += 8;
    }

    private void f0(byte b10, int i10) {
        a(5);
        MessageBuffer messageBuffer = this.f57012e;
        int i11 = this.f57013f;
        this.f57013f = i11 + 1;
        messageBuffer.putByte(i11, b10);
        this.f57012e.putInt(this.f57013f, i10);
        this.f57013f += 4;
    }

    private void g() {
        this.f57011d.B(this.f57013f);
        this.f57012e = null;
        this.f57014g += this.f57013f;
        this.f57013f = 0;
    }

    private void m0(byte b10, long j10) {
        a(9);
        MessageBuffer messageBuffer = this.f57012e;
        int i10 = this.f57013f;
        this.f57013f = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.f57012e.putLong(this.f57013f, j10);
        this.f57013f += 8;
    }

    private void n0(byte b10, short s10) {
        a(3);
        MessageBuffer messageBuffer = this.f57012e;
        int i10 = this.f57013f;
        this.f57013f = i10 + 1;
        messageBuffer.putByte(i10, b10);
        this.f57012e.putShort(this.f57013f, s10);
        this.f57013f += 2;
    }

    public e C(long j10) {
        if (j10 < -32) {
            if (j10 < -32768) {
                if (j10 < -2147483648L) {
                    m0((byte) -45, j10);
                } else {
                    f0((byte) -46, (int) j10);
                }
            } else if (j10 < -128) {
                n0((byte) -47, (short) j10);
            } else {
                b0((byte) -48, (byte) j10);
            }
        } else if (j10 < 128) {
            Y((byte) j10);
        } else if (j10 < 65536) {
            if (j10 < 256) {
                b0((byte) -52, (byte) j10);
            } else {
                n0((byte) -51, (short) j10);
            }
        } else if (j10 < 4294967296L) {
            f0((byte) -50, (int) j10);
        } else {
            m0((byte) -49, j10);
        }
        return this;
    }

    public e J(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (i10 < 16) {
            Y((byte) (i10 | (-128)));
        } else if (i10 < 65536) {
            n0((byte) -34, (short) i10);
        } else {
            f0((byte) -33, i10);
        }
        return this;
    }

    public e P() {
        Y(BER.ASN_PRIVATE);
        return this;
    }

    public e S(int i10) {
        if (i10 < 32) {
            Y((byte) (i10 | (-96)));
        } else if (this.f57010c && i10 < 256) {
            b0((byte) -39, (byte) i10);
        } else if (i10 < 65536) {
            n0((byte) -38, (short) i10);
        } else {
            f0((byte) -37, i10);
        }
        return this;
    }

    public e T(u uVar) {
        uVar.f(this);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
        } finally {
            this.f57011d.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f57013f > 0) {
            g();
        }
        this.f57011d.flush();
    }

    public e h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (i10 < 16) {
            Y((byte) (i10 | (-112)));
        } else if (i10 < 65536) {
            n0((byte) -36, (short) i10);
        } else {
            f0((byte) -35, i10);
        }
        return this;
    }

    public e j(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            C(bigInteger.longValue());
        } else {
            if (bigInteger.bitLength() != 64 || bigInteger.signum() != 1) {
                throw new IllegalArgumentException("MessagePack cannot serialize BigInteger larger than 2^64-1");
            }
            m0((byte) -49, bigInteger.longValue());
        }
        return this;
    }

    public e o0(byte[] bArr) {
        return p0(bArr, 0, bArr.length);
    }

    public e p(int i10) {
        if (i10 < 256) {
            b0((byte) -60, (byte) i10);
        } else if (i10 < 65536) {
            n0((byte) -59, (short) i10);
        } else {
            f0((byte) -58, i10);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.msgpack.core.e p0(byte[] r3, int r4, int r5) {
        /*
            r2 = this;
            org.msgpack.core.buffer.MessageBuffer r0 = r2.f57012e
            if (r0 == 0) goto L1d
            int r0 = r0.size()
            int r1 = r2.f57013f
            int r0 = r0 - r1
            if (r0 < r5) goto L1d
            int r0 = r2.f57009b
            if (r5 <= r0) goto L12
            goto L1d
        L12:
            org.msgpack.core.buffer.MessageBuffer r0 = r2.f57012e
            r0.putBytes(r1, r3, r4, r5)
            int r3 = r2.f57013f
            int r3 = r3 + r5
            r2.f57013f = r3
            goto L2b
        L1d:
            r2.flush()
            org.msgpack.core.buffer.e r0 = r2.f57011d
            r0.write(r3, r4, r5)
            long r3 = r2.f57014g
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.f57014g = r3
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.e.p0(byte[], int, int):org.msgpack.core.e");
    }

    public e s(boolean z10) {
        Y(z10 ? (byte) -61 : (byte) -62);
        return this;
    }

    public e v(double d10) {
        d0((byte) -53, d10);
        return this;
    }

    public e y(byte b10, int i10) {
        if (i10 < 256) {
            if (i10 <= 0 || ((i10 - 1) & i10) != 0) {
                b0((byte) -57, (byte) i10);
                Y(b10);
            } else if (i10 == 1) {
                b0((byte) -44, b10);
            } else if (i10 == 2) {
                b0((byte) -43, b10);
            } else if (i10 == 4) {
                b0((byte) -42, b10);
            } else if (i10 == 8) {
                b0((byte) -41, b10);
            } else if (i10 == 16) {
                b0((byte) -40, b10);
            } else {
                b0((byte) -57, (byte) i10);
                Y(b10);
            }
        } else if (i10 < 65536) {
            n0((byte) -56, (short) i10);
            Y(b10);
        } else {
            f0((byte) -55, i10);
            Y(b10);
        }
        return this;
    }
}
