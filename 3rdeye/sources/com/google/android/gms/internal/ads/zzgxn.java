package com.google.android.gms.internal.ads;

import B4.f;
import N7.H7;
import g0.C4356c;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzgxn implements Iterable<Byte>, Serializable {
    public static final zzgxn zzb = new zzgxk(zzgzi.zzb);
    private int zza = 0;

    static {
        int i = zzgxa.zza;
    }

    private static zzgxn zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C4356c.i(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (zzgxn) it.next();
        }
        int i10 = i >>> 1;
        zzgxn zzgxnVarZzc = zzc(it, i10);
        zzgxn zzgxnVarZzc2 = zzc(it, i - i10);
        if (Integer.MAX_VALUE - zzgxnVarZzc.zzd() >= zzgxnVarZzc2.zzd()) {
            return zzhay.zzC(zzgxnVarZzc, zzgxnVarZzc2);
        }
        throw new IllegalArgumentException(H7.n(zzgxnVarZzc.zzd(), zzgxnVarZzc2.zzd(), "ByteString would be too long: ", "+"));
    }

    public static int zzq(int i, int i10, int i11) {
        int i12 = i10 - i;
        if ((i | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C4356c.i(i, "Beginning index: ", " < 0"));
        }
        if (i10 < i) {
            throw new IndexOutOfBoundsException(H7.n(i, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(H7.n(i10, i11, "End index: ", " >= "));
    }

    public static zzgxl zzt() {
        return new zzgxl(128);
    }

    public static zzgxn zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgxn zzv(byte[] bArr, int i, int i10) {
        zzq(i, i + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i, bArr2, 0, i10);
        return new zzgxk(bArr2);
    }

    public static zzgxn zzw(String str) {
        return new zzgxk(str.getBytes(zzgzi.zza));
    }

    public static void zzy(int i, int i10) {
        if (((i10 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(H7.n(i, i10, "Index > length: ", ", "));
            }
            throw new ArrayIndexOutOfBoundsException(C4356c.h(i, "Index < 0: "));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strZza = zzd() <= 50 ? zzhbj.zza(this) : zzhbj.zza(zzk(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZzd);
        sb.append(" contents=\"");
        return f.c(sb, strZza, "\">");
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgzi.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i10, int i11);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i10, int i11);

    public abstract int zzj(int i, int i10, int i11);

    public abstract zzgxn zzk(int i, int i10);

    public abstract zzgxt zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgxe zzgxeVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgxi iterator() {
        return new zzgxf(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzgzi.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i10, int i11) {
        zzq(0, i11, zzd());
        zzq(i10, i10 + i11, bArr.length);
        if (i11 > 0) {
            zze(bArr, 0, i10, i11);
        }
    }
}
