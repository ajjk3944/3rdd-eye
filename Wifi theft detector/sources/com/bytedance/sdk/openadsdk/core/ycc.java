package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ycc {
    private static final Object xq = new Object();
    private xq emc;
    private Context ypw;

    public class ypw extends AbstractCursor {
        private ypw() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public ycc(Context context) {
        try {
            this.ypw = context == null ? aa.emc() : context.getApplicationContext();
            if (this.emc == null) {
                this.emc = new xq();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context xq() {
        Context context = this.ypw;
        return context == null ? aa.emc() : context;
    }

    public class xq {
        private SQLiteDatabase ypw = null;

        public xq() {
        }

        private synchronized void bw() {
            try {
                synchronized (ycc.xq) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.ypw;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            ycc yccVar = ycc.this;
                            SQLiteDatabase writableDatabase = yccVar.new emc(yccVar.xq()).getWritableDatabase();
                            this.ypw = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("DBHelper", th.getMessage());
                if (ycc()) {
                    throw th;
                }
            }
        }

        private synchronized boolean ycc() {
            SQLiteDatabase sQLiteDatabase = this.ypw;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.inTransaction()) {
                    return true;
                }
            }
            return false;
        }

        public synchronized void dg() {
            bw();
            SQLiteDatabase sQLiteDatabase = this.ypw;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public SQLiteDatabase emc() {
            bw();
            return this.ypw;
        }

        public synchronized void xq() {
            bw();
            SQLiteDatabase sQLiteDatabase = this.ypw;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void ypw() {
            bw();
            SQLiteDatabase sQLiteDatabase = this.ypw;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void emc(String str) throws SQLException {
            try {
                bw();
                this.ypw.execSQL(str);
            } catch (Throwable th) {
                if (ycc()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor emc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                bw();
                cursorQuery = this.ypw.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("DBHelper", th.getMessage());
                ypw ypwVar = new ypw();
                if (ycc()) {
                    throw th;
                }
                cursorQuery = ypwVar;
            }
            return cursorQuery;
        }

        public synchronized int emc(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                bw();
                iUpdate = this.ypw.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ul.xq("DBHelper", e10.getMessage());
                if (ycc()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long emc(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                bw();
                jReplace = this.ypw.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ul.xq("DBHelper", e10.getMessage());
                if (ycc()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int emc(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                bw();
                iDelete = this.ypw.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.ul.xq("DBHelper", e10.getMessage());
                if (ycc()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public xq emc() {
        return this.emc;
    }

    public class emc extends SQLiteOpenHelper {
        final Context emc;

        public emc(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.emc = context;
        }

        private ArrayList<String> dg(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            return arrayList;
        }

        private void emc(SQLiteDatabase sQLiteDatabase, Context context) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.dg.emc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.gbl.xq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.vk.emc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.cf.emc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.ee.ypw.emc());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.sba.xq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.emc.ypw.ypw.xq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.gbl.emc.xq.xq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.aa.emc());
        }

        private void xq(SQLiteDatabase sQLiteDatabase) throws SQLException {
            ArrayList<String> arrayListDg = dg(sQLiteDatabase);
            if (arrayListDg == null || arrayListDg.size() <= 0) {
                return;
            }
            int size = arrayListDg.size();
            int i10 = 0;
            while (i10 < size) {
                String str = arrayListDg.get(i10);
                i10++;
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", str));
            }
        }

        private void ypw(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.gbl.emc.xq.dg());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                emc(sQLiteDatabase, this.emc);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ul.xq("DBHelper", th.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    xq(sQLiteDatabase);
                    emc(sQLiteDatabase, ycc.this.ypw);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.ul.xq(th.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            /*
                r0 = this;
                if (r2 <= r3) goto L5
                r0.xq(r1)     // Catch: java.lang.Throwable -> L43
            L5:
                com.bytedance.sdk.openadsdk.core.ycc r3 = com.bytedance.sdk.openadsdk.core.ycc.this     // Catch: java.lang.Throwable -> L43
                android.content.Context r3 = com.bytedance.sdk.openadsdk.core.ycc.ypw(r3)     // Catch: java.lang.Throwable -> L43
                r0.emc(r1, r3)     // Catch: java.lang.Throwable -> L43
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L37;
                    case 3: goto L2c;
                    case 4: goto L21;
                    case 5: goto L16;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L43
            L11:
                goto L43
            L12:
                r0.emc(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L16:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.dg.cf.emc()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.emc(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L21:
                java.lang.String r3 = com.bytedance.sdk.component.adexpress.emc.ypw.ypw.xq()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.emc(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L2c:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.dg.vk.emc()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.emc(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L37:
                java.lang.String r3 = "DROP TABLE IF EXISTS 'ad_video_info';"
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.emc(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L40:
                r0.emc(r1)     // Catch: java.lang.Throwable -> L43
            L43:
                r3 = 11
                if (r2 >= r3) goto L58
                r0.ypw(r1)     // Catch: java.lang.Throwable -> L4e
                com.bytedance.sdk.openadsdk.ee.ypw.emc(r1)     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r1 = move-exception
                java.lang.String r2 = "DBHelper"
                java.lang.String r1 = r1.getMessage()
                com.bytedance.sdk.component.utils.ul.xq(r2, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ycc.emc.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        private void emc(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.dg.ypw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.gbl.dg());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.vk.ypw());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.dg.cf.ypw());
        }
    }
}
