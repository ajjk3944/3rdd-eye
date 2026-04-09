package com.google.android.gms.internal.ads;

import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class T8 extends AbstractC1096eL {
    private static final T8 zzL;
    private static volatile CL zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private C1248h9 zzA;
    private W8 zzB;
    private int zzC;
    private int zzD;
    private Q8 zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private C1139f9 zzv;
    private C1302i9 zzw;
    private C1354j9 zzx;
    private C1408k9 zzy;
    private U8 zzz;

    static {
        T8 t8 = new T8();
        zzL = t8;
        AbstractC1096eL.u(T8.class, t8);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1096eL
    public final Object w(int i, AbstractC1096eL abstractC1096eL) {
        CL c1042dL;
        int iC = AbstractC2984e.c(i);
        if (iC == 0) {
            return (byte) 1;
        }
        if (iC == 2) {
            return new GL(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        if (iC == 3) {
            return new T8();
        }
        if (iC == 4) {
            return new L5(zzL);
        }
        if (iC == 5) {
            return zzL;
        }
        if (iC != 6) {
            throw null;
        }
        CL cl = zzM;
        if (cl != null) {
            return cl;
        }
        synchronized (T8.class) {
            try {
                c1042dL = zzM;
                if (c1042dL == null) {
                    c1042dL = new C1042dL(zzL);
                    zzM = c1042dL;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1042dL;
    }
}
