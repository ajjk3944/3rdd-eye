package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.1.1 */
/* loaded from: classes2.dex */
public final class zzeh extends zzf {
    private final zzeg zza;
    private boolean zzb;

    public zzeh(zzfy zzfyVar) {
        super(zzfyVar);
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        this.zza = new zzeg(this, contextZzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0124 A[PHI: r8 r16
  0x0124: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:77:0x0122, B:93:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0124: PHI (r16v5 boolean) = (r16v4 boolean), (r16v6 boolean) binds: [B:77:0x0122, B:93:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzq(int r18, byte[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01f9 A[PHI: r9 r11
  0x01f9: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:112:0x01e7, B:127:0x0214, B:120:0x01f7] A[DONT_GENERATE, DONT_INLINE]
  0x01f9: PHI (r11v7 android.database.sqlite.SQLiteDatabase) = 
  (r11v5 android.database.sqlite.SQLiteDatabase)
  (r11v6 android.database.sqlite.SQLiteDatabase)
  (r11v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:112:0x01e7, B:127:0x0214, B:120:0x01f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzi(int r23) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.zzi(int):java.util.List");
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzs.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e4) {
            this.zzs.zzay().zzd().zzb("Error resetting local analytics data. error", e4);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        return contextZzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[PHI: r4
  0x0069: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:35:0x007c, B:32:0x0067, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzm() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.zzg()
            boolean r1 = r10.zzb
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r10.zzl()
            if (r1 == 0) goto L8f
            r1 = 5
            r4 = r1
            r3 = r2
        L14:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.zzh()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            if (r5 != 0) goto L27
            r10.zzb = r6     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            return r2
        L21:
            r0 = move-exception
            goto L82
        L23:
            r7 = move-exception
            goto L44
        L25:
            r7 = move-exception
            goto L6d
        L27:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r7 = 3
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.endTransaction()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.close()
            return r6
        L44:
            if (r5 == 0) goto L4f
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L4f
            r5.endTransaction()     // Catch: java.lang.Throwable -> L21
        L4f:
            com.google.android.gms.measurement.internal.zzfy r8 = r10.zzs     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzd()     // Catch: java.lang.Throwable -> L21
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L21
            r10.zzb = r6     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L7f
            goto L69
        L61:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L21
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L69:
            r5.close()
            goto L7f
        L6d:
            com.google.android.gms.measurement.internal.zzfy r8 = r10.zzs     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.measurement.internal.zzeo r8 = r8.zzay()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzd()     // Catch: java.lang.Throwable -> L21
            r8.zzb(r0, r7)     // Catch: java.lang.Throwable -> L21
            r10.zzb = r6     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L7f
            goto L69
        L7f:
            int r3 = r3 + 1
            goto L14
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            com.google.android.gms.measurement.internal.zzfy r0 = r10.zzs
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            androidx.work.s.m(r0, r1)
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeh.zzm():boolean");
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrZzan = this.zzs.zzv().zzan(zzacVar);
        if (bArrZzan.length <= 131072) {
            return zzq(2, bArrZzan);
        }
        this.zzs.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzax.zza(zzawVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(0, bArrMarshall);
        }
        this.zzs.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlc zzlcVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzld.zza(zzlcVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(1, bArrMarshall);
        }
        this.zzs.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
