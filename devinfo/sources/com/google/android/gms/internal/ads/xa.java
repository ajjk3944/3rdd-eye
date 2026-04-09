package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class xa implements ya {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f18332b = Logger.getLogger(xa.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final wa f18333a = new wa(0);

    /* JADX WARN: Multi-variable type inference failed */
    public final ab a(iy iyVar, xr1 xr1Var) throws EOFException {
        int iC;
        long jLimit;
        ab dbVar;
        ab abVar;
        long jE = iyVar.e();
        ByteBuffer byteBuffer = iyVar.f12537a;
        wa waVar = this.f18333a;
        ((ByteBuffer) waVar.get()).rewind().limit(8);
        do {
            iC = iyVar.c((ByteBuffer) waVar.get());
            if (iC == 8) {
                ((ByteBuffer) waVar.get()).rewind();
                long jC = jz.c((ByteBuffer) waVar.get());
                if (jC < 8 && jC > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Plausibility check failed: size < 8 (size = ");
                    sb2.append(jC);
                    sb2.append("). Stop parsing!");
                    f18332b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb2.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) waVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jC == 1) {
                        ((ByteBuffer) waVar.get()).limit(16);
                        iyVar.c((ByteBuffer) waVar.get());
                        ((ByteBuffer) waVar.get()).position(8);
                        jLimit = jz.p((ByteBuffer) waVar.get()) - 16;
                    } else {
                        jLimit = jC == 0 ? byteBuffer.limit() - iyVar.e() : jC - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) waVar.get()).limit(((ByteBuffer) waVar.get()).limit() + 16);
                        iyVar.c((ByteBuffer) waVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) waVar.get()).position() - 16; iPosition < ((ByteBuffer) waVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) waVar.get()).position() - 16)] = ((ByteBuffer) waVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j = jLimit;
                    if (xr1Var instanceof ab) {
                    }
                    if ("moov".equals(str)) {
                        dbVar = new bb();
                    } else {
                        if ("mvhd".equals(str)) {
                            cb cbVar = new cb("mvhd");
                            cbVar.f10065n = 1.0d;
                            cbVar.f10066o = 1.0f;
                            cbVar.f10067p = bs1.j;
                            abVar = cbVar;
                            ((ByteBuffer) waVar.get()).rewind();
                            abVar.c(iyVar, (ByteBuffer) waVar.get(), j, this);
                            return abVar;
                        }
                        dbVar = new db(str, 0);
                    }
                    abVar = dbVar;
                    ((ByteBuffer) waVar.get()).rewind();
                    abVar.c(iyVar, (ByteBuffer) waVar.get(), j, this);
                    return abVar;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (iC >= 0);
        byteBuffer.position((int) jE);
        throw new EOFException();
    }
}
