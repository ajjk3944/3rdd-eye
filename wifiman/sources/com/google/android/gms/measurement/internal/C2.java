package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class C2 extends I2 {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f35801e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    private final B2 f35802c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f35803d;

    C2(C4976v3 c4976v3) {
        super(c4976v3);
        this.f35802c = new B2(this, zza(), "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2.A(int, byte[]):boolean");
    }

    private final SQLiteDatabase J() {
        if (this.f35803d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f35802c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f35803d = true;
        return null;
    }

    private final boolean K() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    private static long y(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j10 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j10;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    public final boolean B(C4877j c4877j) {
        g();
        byte[] bArrM0 = x7.m0(c4877j);
        if (bArrM0.length <= 131072) {
            return A(2, bArrM0);
        }
        zzj().E().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean C(K k10) {
        g();
        byte[] bArrM0 = x7.m0(k10);
        if (bArrM0 == null) {
            zzj().E().a("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrM0.length <= 131072) {
            return A(4, bArrM0);
        }
        zzj().E().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    public final boolean D(L l10) {
        Parcel parcelObtain = Parcel.obtain();
        l10.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return A(0, bArrMarshall);
        }
        zzj().E().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean E(r7 r7Var) {
        Parcel parcelObtain = Parcel.obtain();
        r7Var.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return A(1, bArrMarshall);
        }
        zzj().E().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final void F() {
        int iDelete;
        j();
        try {
            SQLiteDatabase sQLiteDatabaseJ = J();
            if (sQLiteDatabaseJ == null || (iDelete = sQLiteDatabaseJ.delete("messages", null, null)) <= 0) {
                return;
            }
            zzj().G().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            zzj().C().b("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean G() {
        return A(3, new byte[0]);
    }

    public final boolean H() {
        j();
        if (this.f35803d || !K()) {
            return false;
        }
        int i10 = 5;
        for (int i11 = 0; i11 < 5; i11++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabaseJ = J();
                    if (sQLiteDatabaseJ == null) {
                        this.f35803d = true;
                        if (sQLiteDatabaseJ != null) {
                            sQLiteDatabaseJ.close();
                        }
                        return false;
                    }
                    sQLiteDatabaseJ.beginTransaction();
                    sQLiteDatabaseJ.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    sQLiteDatabaseJ.setTransactionSuccessful();
                    sQLiteDatabaseJ.endTransaction();
                    sQLiteDatabaseJ.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e10) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    zzj().C().b("Error deleting app launch break from local database", e10);
                    this.f35803d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (SQLiteFullException e11) {
                zzj().C().b("Error deleting app launch break from local database", e11);
                this.f35803d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        zzj().H().a("Error deleting app launch break from local database in reasonable time");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1, com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ B k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5007z2 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C2 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4945r4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4939q5 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4994x5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4845f1
    public final /* bridge */ /* synthetic */ C4987w6 r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.I2
    protected final boolean t() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List z(int r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2.z(int):java.util.List");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
