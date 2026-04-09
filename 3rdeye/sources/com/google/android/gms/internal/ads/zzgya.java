package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgya extends zzgxe {
    private static final Logger zza = Logger.getLogger(zzgya.class.getName());
    private static final boolean zzb = zzhbs.zzA();
    public static final /* synthetic */ int zzf = 0;
    zzgyb zze;

    private zzgya() {
        throw null;
    }

    public static int zzA(zzhag zzhagVar, zzhaz zzhazVar) {
        int iZzaM = ((zzgww) zzhagVar).zzaM(zzhazVar);
        return zzD(iZzaM) + iZzaM;
    }

    public static int zzB(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int zzC(String str) {
        int length;
        try {
            length = zzhbx.zze(str);
        } catch (zzhbw unused) {
            length = str.getBytes(zzgzi.zza).length;
        }
        return zzD(length) + length;
    }

    public static int zzD(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzE(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    @Deprecated
    public static int zzy(int i, zzhag zzhagVar, zzhaz zzhazVar) {
        int iZzD = zzD(i << 3);
        return ((zzgww) zzhagVar).zzaM(zzhazVar) + iZzD + iZzD;
    }

    public static int zzz(zzhag zzhagVar) {
        int iZzaY = zzhagVar.zzaY();
        return zzD(iZzaY) + iZzaY;
    }

    public final void zzF() {
        if (zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzG(String str, zzhbw zzhbwVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzhbwVar);
        byte[] bytes = str.getBytes(zzgzi.zza);
        try {
            int length = bytes.length;
            zzu(length);
            zza(bytes, 0, length);
        } catch (IndexOutOfBoundsException e4) {
            throw new zzgxx(e4);
        }
    }

    public abstract void zzK() throws IOException;

    public abstract void zzL(byte b10) throws IOException;

    public abstract void zzM(int i, boolean z10) throws IOException;

    public abstract void zzN(int i, zzgxn zzgxnVar) throws IOException;

    @Override // com.google.android.gms.internal.ads.zzgxe
    public abstract void zza(byte[] bArr, int i, int i10) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int i, int i10) throws IOException;

    public abstract void zzi(int i) throws IOException;

    public abstract void zzj(int i, long j4) throws IOException;

    public abstract void zzk(long j4) throws IOException;

    public abstract void zzl(int i, int i10) throws IOException;

    public abstract void zzm(int i) throws IOException;

    public abstract void zzn(int i, zzhag zzhagVar, zzhaz zzhazVar) throws IOException;

    public abstract void zzo(int i, zzhag zzhagVar) throws IOException;

    public abstract void zzp(int i, zzgxn zzgxnVar) throws IOException;

    public abstract void zzq(int i, String str) throws IOException;

    public abstract void zzs(int i, int i10) throws IOException;

    public abstract void zzt(int i, int i10) throws IOException;

    public abstract void zzu(int i) throws IOException;

    public abstract void zzv(int i, long j4) throws IOException;

    public abstract void zzw(long j4) throws IOException;

    public /* synthetic */ zzgya(zzgxz zzgxzVar) {
    }
}
