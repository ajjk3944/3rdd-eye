package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzhbs {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzhbr zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbs.<clinit>():void");
    }

    private zzhbs() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i = zzgxa.zza;
        Field fieldZzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (fieldZzF != null) {
            return fieldZzF;
        }
        Field fieldZzF2 = zzF(Buffer.class, "address");
        if (fieldZzF2 == null || fieldZzF2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzF2;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j4, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j10 = (-4) & j4;
        int i = unsafe.getInt(obj, j10);
        int i10 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i10) | (i & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j4, byte b10) {
        Unsafe unsafe = zzf.zza;
        long j10 = (-4) & j4;
        int i = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i) | (unsafe.getInt(obj, j10) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static byte zza(long j4) {
        return zzf.zza(j4);
    }

    public static double zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    public static float zzc(Object obj, long j4) {
        return zzf.zzc(obj, j4);
    }

    public static int zzd(Object obj, long j4) {
        return zzf.zza.getInt(obj, j4);
    }

    public static long zze(ByteBuffer byteBuffer) {
        zzhbr zzhbrVar = zzf;
        return zzhbrVar.zza.getLong(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j4) {
        return zzf.zza.getLong(obj, j4);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object zzh(Object obj, long j4) {
        return zzf.zza.getObject(obj, j4);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhbo());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzhbs.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzo(long j4, byte[] bArr, long j10, long j11) {
        zzf.zzd(j4, bArr, j10, j11);
    }

    public static void zzp(Object obj, long j4, boolean z10) {
        zzf.zze(obj, j4, z10);
    }

    public static void zzq(byte[] bArr, long j4, byte b10) {
        zzf.zzf(bArr, zza + j4, b10);
    }

    public static void zzr(Object obj, long j4, double d10) {
        zzf.zzg(obj, j4, d10);
    }

    public static void zzs(Object obj, long j4, float f10) {
        zzf.zzh(obj, j4, f10);
    }

    public static void zzt(Object obj, long j4, int i) {
        zzf.zza.putInt(obj, j4, i);
    }

    public static void zzu(Object obj, long j4, long j10) {
        zzf.zza.putLong(obj, j4, j10);
    }

    public static void zzv(Object obj, long j4, Object obj2) {
        zzf.zza.putObject(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j4) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j4) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzy(Class cls) {
        int i = zzgxa.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzz(Object obj, long j4) {
        return zzf.zzi(obj, j4);
    }
}
