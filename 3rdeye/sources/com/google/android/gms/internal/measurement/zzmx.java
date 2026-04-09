package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.1.1 */
/* loaded from: classes2.dex */
final class zzmx {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzmw zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    static {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmx.<clinit>():void");
    }

    private zzmx() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzip.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        zzmw zzmwVar = zzf;
        int iZzj = zzmwVar.zzj(obj, j10);
        int i = ((~((int) j4)) & 3) << 3;
        zzmwVar.zzn(obj, j10, ((255 & b10) << i) | (iZzj & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        zzmw zzmwVar = zzf;
        int i = (((int) j4) & 3) << 3;
        zzmwVar.zzn(obj, j10, ((255 & b10) << i) | (zzmwVar.zzj(obj, j10) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i))));
    }

    public static double zza(Object obj, long j4) {
        return zzf.zza(obj, j4);
    }

    public static float zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    public static int zzc(Object obj, long j4) {
        return zzf.zzj(obj, j4);
    }

    public static long zzd(Object obj, long j4) {
        return zzf.zzk(obj, j4);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static Object zzf(Object obj, long j4) {
        return zzf.zzm(obj, j4);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmt());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzmx.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j4, boolean z10) {
        zzf.zzc(obj, j4, z10);
    }

    public static void zzn(byte[] bArr, long j4, byte b10) {
        zzf.zzd(bArr, zza + j4, b10);
    }

    public static void zzo(Object obj, long j4, double d10) {
        zzf.zze(obj, j4, d10);
    }

    public static void zzp(Object obj, long j4, float f10) {
        zzf.zzf(obj, j4, f10);
    }

    public static void zzq(Object obj, long j4, int i) {
        zzf.zzn(obj, j4, i);
    }

    public static void zzr(Object obj, long j4, long j10) {
        zzf.zzo(obj, j4, j10);
    }

    public static void zzs(Object obj, long j4, Object obj2) {
        zzf.zzp(obj, j4, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j4) {
        return ((byte) ((zzf.zzj(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j4) {
        return ((byte) ((zzf.zzj(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i = zzip.zza;
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

    public static boolean zzw(Object obj, long j4) {
        return zzf.zzg(obj, j4);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }
}
