package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzark implements zzarl {
    private static final Logger zzb = Logger.getLogger(zzark.class.getName());
    final ThreadLocal zza = new zzarj(this);

    public abstract zzaro zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzarl
    public final zzaro zzb(zzhfk zzhfkVar, zzarp zzarpVar) throws IOException {
        int iZza;
        long jZzc;
        long jZzb = zzhfkVar.zzb();
        ThreadLocal threadLocal = this.zza;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iZza = zzhfkVar.zza((ByteBuffer) threadLocal.get());
            if (iZza == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jZze = zzarn.zze((ByteBuffer) threadLocal.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ThreadLocal threadLocal2 = this.zza;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        zzhfkVar.zza((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        jZzc = zzarn.zzf((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? zzhfkVar.zzc() - zzhfkVar.zzb() : jZze - 8;
                    }
                    if (CommonUrlParts.UUID.equals(str)) {
                        ThreadLocal threadLocal3 = this.zza;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        zzhfkVar.zza((ByteBuffer) threadLocal3.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal3.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal3.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j4 = jZzc;
                    zzaro zzaroVarZza = zza(str, bArr, zzarpVar instanceof zzaro ? ((zzaro) zzarpVar).zza() : "");
                    ThreadLocal threadLocal4 = this.zza;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    zzaroVarZza.zzb(zzhfkVar, (ByteBuffer) threadLocal4.get(), j4, this);
                    return zzaroVarZza;
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException(e4);
                }
            }
        } while (iZza >= 0);
        zzhfkVar.zze(jZzb);
        throw new EOFException();
    }
}
