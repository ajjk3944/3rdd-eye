package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nx extends SQLiteOpenHelper {
    public final lx[] f;
    public final l92 g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(Context context, String str, lx[] lxVarArr, l92 l92Var) {
        super(context, str, null, 12, new mx(l92Var, lxVarArr));
        l92Var.getClass();
        this.g = l92Var;
        this.f = lxVarArr;
    }

    public static lx a(lx[] lxVarArr, SQLiteDatabase sQLiteDatabase) {
        lx lxVar = lxVarArr[0];
        if (lxVar == null || ((SQLiteDatabase) lxVar.g) != sQLiteDatabase) {
            lxVarArr[0] = new lx(0, sQLiteDatabase);
        }
        return lxVarArr[0];
    }

    public final synchronized lx c() {
        this.h = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.h) {
            return a(this.f, writableDatabase);
        }
        close();
        return c();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f[0] = null;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f, sQLiteDatabase);
        this.g.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.database.sqlite.SQLiteDatabase r6) throws android.database.SQLException {
        /*
            r5 = this;
            lx[] r0 = r5.f
            lx r6 = a(r0, r6)
            l92 r0 = r5.g
            java.lang.Object r1 = r0.g
            vg0 r1 = (defpackage.vg0) r1
            java.lang.String r2 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r2 = r6.p(r2)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r4)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = 1
            goto L24
        L21:
            r6 = move-exception
            goto L6d
        L23:
            r3 = r4
        L24:
            r2.close()
            defpackage.vg0.h(r6)
            if (r3 != 0) goto L4b
            qq0 r2 = defpackage.vg0.k(r6)
            boolean r3 = r2.b
            if (r3 == 0) goto L35
            goto L4b
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L4b:
            r0.J(r6)
            java.lang.Object r6 = r1.g
            androidx.work.impl.WorkDatabase_Impl r6 = (androidx.work.impl.WorkDatabase_Impl) r6
            int r0 = androidx.work.impl.WorkDatabase_Impl.s
            java.util.List r0 = r6.g
            if (r0 == 0) goto L6c
            int r0 = r0.size()
        L5c:
            if (r4 >= r0) goto L6c
            java.util.List r1 = r6.g
            java.lang.Object r1 = r1.get(r4)
            y91 r1 = (defpackage.y91) r1
            r1.getClass()
            int r4 = r4 + 1
            goto L5c
        L6c:
            return
        L6d:
            r2.close()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        this.h = true;
        this.g.G(a(this.f, sQLiteDatabase), i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOpen(android.database.sqlite.SQLiteDatabase r11) throws android.database.SQLException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        this.h = true;
        this.g.G(a(this.f, sQLiteDatabase), i, i2);
    }
}
