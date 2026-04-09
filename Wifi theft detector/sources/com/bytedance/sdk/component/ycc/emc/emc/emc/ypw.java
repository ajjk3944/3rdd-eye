package com.bytedance.sdk.component.ycc.emc.emc.emc;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.ycc.emc.msw;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ypw {
    private C0126ypw emc;
    private Context ypw;

    public class emc extends AbstractCursor {
        private emc() {
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

    public ypw(Context context) {
        try {
            this.ypw = context.getApplicationContext();
            if (this.emc == null) {
                this.emc = new C0126ypw();
            }
        } catch (Throwable unused) {
        }
    }

    public C0126ypw emc() {
        return this.emc;
    }

    /* renamed from: com.bytedance.sdk.component.ycc.emc.emc.emc.ypw$ypw, reason: collision with other inner class name */
    public class C0126ypw {
        private volatile SQLiteDatabase ypw = null;

        public C0126ypw() {
        }

        private void emc() {
            boolean zYpw;
            try {
                if (this.ypw != null && this.ypw.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.ypw == null || !this.ypw.isOpen()) {
                            this.ypw = msw.uym().dg().emc(msw.uym().ycc());
                            this.ypw.setLockingEnabled(false);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } finally {
                if (!zYpw) {
                }
            }
        }

        private boolean ypw() {
            SQLiteDatabase sQLiteDatabase = this.ypw;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public void emc(String str) throws SQLException {
            try {
                emc();
                this.ypw.execSQL(str);
            } catch (Throwable th) {
                if (ypw()) {
                    throw th;
                }
            }
        }

        public Cursor emc(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                emc();
                return this.ypw.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                emc emcVar = new emc();
                if (ypw()) {
                    throw th;
                }
                return emcVar;
            }
        }

        public int emc(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                emc();
                return this.ypw.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (ypw()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long emc(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                emc();
                return this.ypw.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (ypw()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void emc(String str, String str2, List<com.bytedance.sdk.component.ycc.emc.dg.emc> list) {
            JSONObject jSONObjectUym;
            try {
                try {
                    emc();
                    this.ypw.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.ycc.emc.dg.emc emcVar = list.get(i10);
                        if (emcVar != null && (jSONObjectUym = emcVar.uym()) != null) {
                            contentValues.put("id", emcVar.xq());
                            String strYpw = msw.uym().vk().ypw(jSONObjectUym.toString());
                            if (!TextUtils.isEmpty(strYpw)) {
                                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, strYpw);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.ycc.emc.xq.emc.dg() && emcVar.ru() > 0 && (emcVar.dg() == 0 || emcVar.dg() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(emcVar.ru()));
                                }
                                this.ypw.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.ypw.setTransactionSuccessful();
                    list.size();
                    if (this.ypw != null) {
                        this.ypw.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!ypw()) {
                        if (this.ypw != null) {
                            this.ypw.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th) {
                if (this.ypw != null) {
                    this.ypw.endTransaction();
                }
                throw th;
            }
        }

        public int emc(String str, String str2, String[] strArr) throws Exception {
            try {
                emc();
                return this.ypw.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (ypw()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
