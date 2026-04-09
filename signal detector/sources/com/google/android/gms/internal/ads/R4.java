package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class R4 implements S4 {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f10842b = Logger.getLogger(R4.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final T2.i f10843a = new T2.i(1);

    /* JADX WARN: Multi-variable type inference failed */
    public final U4 a(C1756qg c1756qg, AbstractC1422kN abstractC1422kN) throws EOFException {
        int iA;
        long jLimit;
        U4 x42;
        U4 u42;
        long jB = c1756qg.b();
        ByteBuffer byteBuffer = c1756qg.f16390a;
        T2.i iVar = this.f10843a;
        ((ByteBuffer) iVar.get()).rewind().limit(8);
        do {
            iA = c1756qg.a((ByteBuffer) iVar.get());
            if (iA == 8) {
                ((ByteBuffer) iVar.get()).rewind();
                long jA = AbstractC0709Rg.a((ByteBuffer) iVar.get());
                if (jA < 8 && jA > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jA);
                    sb.append("). Stop parsing!");
                    f10842b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) iVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jA == 1) {
                        ((ByteBuffer) iVar.get()).limit(16);
                        c1756qg.a((ByteBuffer) iVar.get());
                        ((ByteBuffer) iVar.get()).position(8);
                        jLimit = AbstractC0709Rg.p((ByteBuffer) iVar.get()) - 16;
                    } else {
                        jLimit = jA == 0 ? byteBuffer.limit() - c1756qg.b() : jA - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) iVar.get()).limit(((ByteBuffer) iVar.get()).limit() + 16);
                        c1756qg.a((ByteBuffer) iVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) iVar.get()).position() - 16; iPosition < ((ByteBuffer) iVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) iVar.get()).position() - 16)] = ((ByteBuffer) iVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j6 = jLimit;
                    if (abstractC1422kN instanceof U4) {
                    }
                    if ("moov".equals(str)) {
                        x42 = new V4();
                    } else {
                        if ("mvhd".equals(str)) {
                            W4 w42 = new W4("mvhd");
                            w42.f12162n = 1.0d;
                            w42.f12155C = 1.0f;
                            w42.f12156D = C1638oN.f15935j;
                            u42 = w42;
                            ((ByteBuffer) iVar.get()).rewind();
                            u42.a(c1756qg, (ByteBuffer) iVar.get(), j6, this);
                            return u42;
                        }
                        x42 = new X4(str, 0);
                    }
                    u42 = x42;
                    ((ByteBuffer) iVar.get()).rewind();
                    u42.a(c1756qg, (ByteBuffer) iVar.get(), j6, this);
                    return u42;
                } catch (UnsupportedEncodingException e6) {
                    throw new RuntimeException(e6);
                }
            }
        } while (iA >= 0);
        byteBuffer.position((int) jB);
        throw new EOFException();
    }
}
