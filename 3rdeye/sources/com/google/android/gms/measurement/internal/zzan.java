package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzan {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[Catch: SQLiteException -> 0x00a0, TryCatch #2 {SQLiteException -> 0x00a0, blocks: (B:22:0x0045, B:24:0x0066, B:26:0x0076, B:28:0x007e, B:29:0x0081, B:30:0x009f, B:34:0x00a5, B:36:0x00a8, B:38:0x00b0, B:39:0x00b7, B:40:0x00ba, B:42:0x00c0, B:45:0x00d1, B:46:0x00d5, B:23:0x005f), top: B:58:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[Catch: SQLiteException -> 0x00a0, LOOP:1: B:34:0x00a5->B:39:0x00b7, LOOP_START, PHI: r3
  0x00a5: PHI (r3v4 int) = (r3v3 int), (r3v5 int) binds: [B:33:0x00a3, B:39:0x00b7] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {SQLiteException -> 0x00a0, blocks: (B:22:0x0045, B:24:0x0066, B:26:0x0076, B:28:0x007e, B:29:0x0081, B:30:0x009f, B:34:0x00a5, B:36:0x00a8, B:38:0x00b0, B:39:0x00b7, B:40:0x00ba, B:42:0x00c0, B:45:0x00d1, B:46:0x00d5, B:23:0x005f), top: B:58:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0 A[Catch: SQLiteException -> 0x00a0, TryCatch #2 {SQLiteException -> 0x00a0, blocks: (B:22:0x0045, B:24:0x0066, B:26:0x0076, B:28:0x007e, B:29:0x0081, B:30:0x009f, B:34:0x00a5, B:36:0x00a8, B:38:0x00b0, B:39:0x00b7, B:40:0x00ba, B:42:0x00c0, B:45:0x00d1, B:46:0x00d5, B:23:0x005f), top: B:58:0x0045, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void zza(com.google.android.gms.measurement.internal.zzeo r12, android.database.sqlite.SQLiteDatabase r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String[] r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzan.zza(com.google.android.gms.measurement.internal.zzeo, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void zzb(zzeo zzeoVar, SQLiteDatabase sQLiteDatabase) {
        if (zzeoVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzeoVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzeoVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzeoVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzeoVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}
