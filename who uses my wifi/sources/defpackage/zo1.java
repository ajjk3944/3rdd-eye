package defpackage;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zo1 implements ap1 {
    public static final Logger b = Logger.getLogger(zo1.class.getName());
    public final du a = new du(5);

    /* JADX WARN: Multi-variable type inference failed */
    public final cp1 a(lx lxVar, u94 u94Var) throws EOFException {
        int iR;
        long jLimit;
        cp1 fp1Var;
        cp1 cp1Var;
        long jS = lxVar.s();
        ByteBuffer byteBuffer = (ByteBuffer) lxVar.g;
        du duVar = this.a;
        ((ByteBuffer) duVar.get()).rewind().limit(8);
        do {
            iR = lxVar.r((ByteBuffer) duVar.get());
            if (iR == 8) {
                ((ByteBuffer) duVar.get()).rewind();
                long jD = m54.D((ByteBuffer) duVar.get());
                if (jD < 8 && jD > 1) {
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jD);
                    sb.append("). Stop parsing!");
                    b.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) duVar.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jD == 1) {
                        ((ByteBuffer) duVar.get()).limit(16);
                        lxVar.r((ByteBuffer) duVar.get());
                        ((ByteBuffer) duVar.get()).position(8);
                        jLimit = m54.R((ByteBuffer) duVar.get()) - 16;
                    } else {
                        jLimit = jD == 0 ? byteBuffer.limit() - lxVar.s() : jD - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) duVar.get()).limit(((ByteBuffer) duVar.get()).limit() + 16);
                        lxVar.r((ByteBuffer) duVar.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) duVar.get()).position() - 16; iPosition < ((ByteBuffer) duVar.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) duVar.get()).position() - 16)] = ((ByteBuffer) duVar.get()).get(iPosition);
                        }
                        jLimit -= 16;
                    }
                    long j = jLimit;
                    if (u94Var instanceof cp1) {
                    }
                    if ("moov".equals(str)) {
                        fp1Var = new dp1();
                    } else {
                        if ("mvhd".equals(str)) {
                            ep1 ep1Var = new ep1("mvhd");
                            ep1Var.s = 1.0d;
                            ep1Var.t = 1.0f;
                            ep1Var.u = y94.j;
                            cp1Var = ep1Var;
                            ((ByteBuffer) duVar.get()).rewind();
                            cp1Var.a(lxVar, (ByteBuffer) duVar.get(), j, this);
                            return cp1Var;
                        }
                        fp1Var = new fp1(str, 0);
                    }
                    cp1Var = fp1Var;
                    ((ByteBuffer) duVar.get()).rewind();
                    cp1Var.a(lxVar, (ByteBuffer) duVar.get(), j, this);
                    return cp1Var;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iR >= 0);
        byteBuffer.position((int) jS);
        throw new EOFException();
    }
}
