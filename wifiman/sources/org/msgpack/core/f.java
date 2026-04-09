package org.msgpack.core;

import java.io.Closeable;
import java.math.BigInteger;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.d;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.MPv3;
import yj.o;
import yj.u;
import yj.v;
import yj.w;

/* loaded from: classes.dex */
public class f implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private static final MessageBuffer f57015m = MessageBuffer.wrap(new byte[0]);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f57016a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f57017b;

    /* renamed from: c, reason: collision with root package name */
    private final CodingErrorAction f57018c;

    /* renamed from: d, reason: collision with root package name */
    private final CodingErrorAction f57019d;

    /* renamed from: e, reason: collision with root package name */
    private final int f57020e;

    /* renamed from: f, reason: collision with root package name */
    private final int f57021f;

    /* renamed from: g, reason: collision with root package name */
    private org.msgpack.core.buffer.d f57022g;

    /* renamed from: i, reason: collision with root package name */
    private int f57024i;

    /* renamed from: j, reason: collision with root package name */
    private long f57025j;

    /* renamed from: l, reason: collision with root package name */
    private int f57027l;

    /* renamed from: h, reason: collision with root package name */
    private MessageBuffer f57023h = f57015m;

    /* renamed from: k, reason: collision with root package name */
    private final MessageBuffer f57026k = MessageBuffer.allocate(8);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57028a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f57029b;

        static {
            int[] iArr = new int[w.values().length];
            f57029b = iArr;
            try {
                iArr[w.NIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57029b[w.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57029b[w.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57029b[w.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57029b[w.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57029b[w.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57029b[w.ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57029b[w.MAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57029b[w.EXTENSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[c.values().length];
            f57028a = iArr2;
            try {
                iArr2[c.POSFIXINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57028a[c.NEGFIXINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57028a[c.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57028a[c.NIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57028a[c.FIXMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57028a[c.FIXARRAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57028a[c.FIXSTR.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57028a[c.INT8.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57028a[c.UINT8.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f57028a[c.INT16.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f57028a[c.UINT16.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f57028a[c.INT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f57028a[c.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f57028a[c.FLOAT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f57028a[c.INT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f57028a[c.UINT64.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f57028a[c.FLOAT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f57028a[c.BIN8.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f57028a[c.STR8.ordinal()] = 19;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f57028a[c.BIN16.ordinal()] = 20;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f57028a[c.STR16.ordinal()] = 21;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f57028a[c.BIN32.ordinal()] = 22;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f57028a[c.STR32.ordinal()] = 23;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f57028a[c.FIXEXT1.ordinal()] = 24;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f57028a[c.FIXEXT2.ordinal()] = 25;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f57028a[c.FIXEXT4.ordinal()] = 26;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f57028a[c.FIXEXT8.ordinal()] = 27;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f57028a[c.FIXEXT16.ordinal()] = 28;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f57028a[c.EXT8.ordinal()] = 29;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f57028a[c.EXT16.ordinal()] = 30;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f57028a[c.EXT32.ordinal()] = 31;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f57028a[c.ARRAY16.ordinal()] = 32;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f57028a[c.ARRAY32.ordinal()] = 33;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f57028a[c.MAP16.ordinal()] = 34;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f57028a[c.MAP32.ordinal()] = 35;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f57028a[c.NEVER_USED.ordinal()] = 36;
            } catch (NoSuchFieldError unused45) {
            }
        }
    }

    protected f(org.msgpack.core.buffer.d dVar, d.c cVar) {
        this.f57022g = (org.msgpack.core.buffer.d) g.d(dVar, "MessageBufferInput is null");
        this.f57016a = cVar.f();
        this.f57017b = cVar.e();
        this.f57018c = cVar.c();
        this.f57019d = cVar.d();
        this.f57020e = cVar.i();
        this.f57021f = cVar.h();
    }

    private float C() {
        return v(4).getFloat(this.f57027l);
    }

    private int J() {
        return readShort() & 65535;
    }

    private int P() {
        int i10 = readInt();
        if (i10 >= 0) {
            return i10;
        }
        throw p(i10);
    }

    private int S() {
        return readByte() & 255;
    }

    private boolean a() {
        while (this.f57023h.size() <= this.f57024i) {
            MessageBuffer next = this.f57022g.next();
            if (next == null) {
                return false;
            }
            this.f57025j += this.f57023h.size();
            this.f57023h = next;
            this.f57024i = 0;
        }
        return true;
    }

    private int d0(byte b10) {
        switch (b10) {
            case -60:
                return S();
            case -59:
                return J();
            case -58:
                return P();
            default:
                return -1;
        }
    }

    private int f0(byte b10) {
        switch (b10) {
            case -39:
                return S();
            case -38:
                return J();
            case -37:
                return P();
            default:
                return -1;
        }
    }

    private MessageBuffer g() {
        MessageBuffer next = this.f57022g.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.f57025j += this.f57023h.size();
        return next;
    }

    private void j() {
        this.f57023h = g();
        this.f57024i = 0;
    }

    private static MessagePackException m0(String str, byte b10) {
        c cVarValueOf = c.valueOf(b10);
        if (cVarValueOf == c.NEVER_USED) {
            return new MessageNeverUsedFormatException(String.format("Expected %s, but encountered 0xC1 \"NEVER_USED\" byte", str));
        }
        String strName = cVarValueOf.getValueType().name();
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strName.substring(0, 1) + strName.substring(1).toLowerCase(), Byte.valueOf(b10)));
    }

    private static MessageSizeException p(int i10) {
        return new MessageSizeException((i10 & MPv3.MAX_MESSAGE_ID) + 2147483648L);
    }

    private byte readByte() {
        int size = this.f57023h.size();
        int i10 = this.f57024i;
        if (size > i10) {
            byte b10 = this.f57023h.getByte(i10);
            this.f57024i++;
            return b10;
        }
        j();
        if (this.f57023h.size() <= 0) {
            return readByte();
        }
        byte b11 = this.f57023h.getByte(0);
        this.f57024i = 1;
        return b11;
    }

    private int readInt() {
        return v(4).getInt(this.f57027l);
    }

    private long readLong() {
        return v(8).getLong(this.f57027l);
    }

    private short readShort() {
        return v(2).getShort(this.f57027l);
    }

    private static MessageIntegerOverflowException s(long j10) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j10 - Long.MIN_VALUE).setBit(63));
    }

    private MessageBuffer v(int i10) {
        int size = this.f57023h.size();
        int i11 = this.f57024i;
        int i12 = size - i11;
        if (i12 >= i10) {
            this.f57027l = i11;
            this.f57024i = i11 + i10;
            return this.f57023h;
        }
        if (i12 > 0) {
            this.f57026k.putMessageBuffer(0, this.f57023h, i11, i12);
            i10 -= i12;
        } else {
            i12 = 0;
        }
        while (true) {
            j();
            int size2 = this.f57023h.size();
            if (size2 >= i10) {
                this.f57026k.putMessageBuffer(i12, this.f57023h, 0, i10);
                this.f57024i = i10;
                this.f57027l = 0;
                return this.f57026k;
            }
            this.f57026k.putMessageBuffer(i12, this.f57023h, 0, size2);
            i10 -= size2;
            i12 += size2;
        }
    }

    private double y() {
        return v(8).getDouble(this.f57027l);
    }

    public void T(byte[] bArr) {
        Y(bArr, 0, bArr.length);
    }

    public void Y(byte[] bArr, int i10, int i11) {
        while (true) {
            int size = this.f57023h.size();
            int i12 = this.f57024i;
            int i13 = size - i12;
            if (i13 >= i11) {
                this.f57023h.getBytes(i12, bArr, i10, i11);
                this.f57024i += i11;
                return;
            } else {
                this.f57023h.getBytes(i12, bArr, i10, i13);
                i10 += i13;
                i11 -= i13;
                this.f57024i += i13;
                j();
            }
        }
    }

    public byte[] b0(int i10) {
        byte[] bArr = new byte[i10];
        T(bArr);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57023h = f57015m;
        this.f57024i = 0;
        this.f57022g.close();
    }

    public c h() {
        if (a()) {
            return c.valueOf(this.f57023h.getByte(this.f57024i));
        }
        throw new MessageInsufficientBufferException();
    }

    public int n0() {
        byte b10 = readByte();
        if (d.a.c(b10)) {
            return b10 & 15;
        }
        if (b10 == -36) {
            return J();
        }
        if (b10 == -35) {
            return P();
        }
        throw m0("Array", b10);
    }

    public BigInteger o0() {
        byte b10 = readByte();
        if (d.a.a(b10)) {
            return BigInteger.valueOf(b10);
        }
        switch (b10) {
            case -52:
                return BigInteger.valueOf(readByte() & 255);
            case -51:
                return BigInteger.valueOf(readShort() & 65535);
            case -50:
                int i10 = readInt();
                return i10 < 0 ? BigInteger.valueOf((i10 & MPv3.MAX_MESSAGE_ID) + 2147483648L) : BigInteger.valueOf(i10);
            case -49:
                long j10 = readLong();
                return j10 < 0 ? BigInteger.valueOf(j10 - Long.MIN_VALUE).setBit(63) : BigInteger.valueOf(j10);
            case -48:
                return BigInteger.valueOf(readByte());
            case -47:
                return BigInteger.valueOf(readShort());
            case -46:
                return BigInteger.valueOf(readInt());
            case -45:
                return BigInteger.valueOf(readLong());
            default:
                throw m0("Integer", b10);
        }
    }

    public int p0() {
        int iF0;
        byte b10 = readByte();
        if (d.a.e(b10)) {
            return b10 & BER.ASN_EXTENSION_ID;
        }
        int iD0 = d0(b10);
        if (iD0 >= 0) {
            return iD0;
        }
        if (!this.f57016a || (iF0 = f0(b10)) < 0) {
            throw m0("Binary", b10);
        }
        return iF0;
    }

    public boolean q0() {
        byte b10 = readByte();
        if (b10 == -62) {
            return false;
        }
        if (b10 == -61) {
            return true;
        }
        throw m0("boolean", b10);
    }

    public double r0() {
        byte b10 = readByte();
        if (b10 == -54) {
            return C();
        }
        if (b10 == -53) {
            return y();
        }
        throw m0("Float", b10);
    }

    public org.msgpack.core.a s0() {
        byte b10 = readByte();
        switch (b10) {
            case -57:
                MessageBuffer messageBufferV = v(2);
                return new org.msgpack.core.a(messageBufferV.getByte(this.f57027l + 1), messageBufferV.getByte(this.f57027l) & 255);
            case -56:
                MessageBuffer messageBufferV2 = v(3);
                return new org.msgpack.core.a(messageBufferV2.getByte(this.f57027l + 2), messageBufferV2.getShort(this.f57027l) & 65535);
            case -55:
                MessageBuffer messageBufferV3 = v(5);
                int i10 = messageBufferV3.getInt(this.f57027l);
                if (i10 >= 0) {
                    return new org.msgpack.core.a(messageBufferV3.getByte(this.f57027l + 4), i10);
                }
                throw p(i10);
            default:
                switch (b10) {
                    case -44:
                        return new org.msgpack.core.a(readByte(), 1);
                    case -43:
                        return new org.msgpack.core.a(readByte(), 2);
                    case -42:
                        return new org.msgpack.core.a(readByte(), 4);
                    case -41:
                        return new org.msgpack.core.a(readByte(), 8);
                    case -40:
                        return new org.msgpack.core.a(readByte(), 16);
                    default:
                        throw m0("Ext", b10);
                }
        }
    }

    public long t0() {
        byte b10 = readByte();
        if (d.a.a(b10)) {
            return b10;
        }
        switch (b10) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i10 = readInt();
                return i10 < 0 ? (i10 & MPv3.MAX_MESSAGE_ID) + 2147483648L : i10;
            case -49:
                long j10 = readLong();
                if (j10 >= 0) {
                    return j10;
                }
                throw s(j10);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw m0("Integer", b10);
        }
    }

    public int u0() {
        byte b10 = readByte();
        if (d.a.d(b10)) {
            return b10 & 15;
        }
        if (b10 == -34) {
            return J();
        }
        if (b10 == -33) {
            return P();
        }
        throw m0("Map", b10);
    }

    public int v0() {
        int iD0;
        byte b10 = readByte();
        if (d.a.e(b10)) {
            return b10 & BER.ASN_EXTENSION_ID;
        }
        int iF0 = f0(b10);
        if (iF0 >= 0) {
            return iF0;
        }
        if (!this.f57017b || (iD0 = d0(b10)) < 0) {
            throw m0("String", b10);
        }
        return iD0;
    }

    public o w0() {
        c cVarH = h();
        int i10 = 0;
        switch (a.f57029b[cVarH.getValueType().ordinal()]) {
            case 1:
                readByte();
                return v.i();
            case 2:
                return v.c(q0());
            case 3:
                return cVarH == c.UINT64 ? v.g(o0()) : v.f(t0());
            case 4:
                return v.e(r0());
            case 5:
                return v.j(b0(v0()), true);
            case 6:
                return v.b(b0(p0()), true);
            case 7:
                int iN0 = n0();
                u[] uVarArr = new u[iN0];
                while (i10 < iN0) {
                    uVarArr[i10] = w0();
                    i10++;
                }
                return v.a(uVarArr, true);
            case 8:
                int iU0 = u0() * 2;
                u[] uVarArr2 = new u[iU0];
                while (i10 < iU0) {
                    uVarArr2[i10] = w0();
                    uVarArr2[i10 + 1] = w0();
                    i10 += 2;
                }
                return v.h(uVarArr2, true);
            case 9:
                org.msgpack.core.a aVarS0 = s0();
                return v.d(aVarS0.b(), b0(aVarS0.a()));
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }
}
