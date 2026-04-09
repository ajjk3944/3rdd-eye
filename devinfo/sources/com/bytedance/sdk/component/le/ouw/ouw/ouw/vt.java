package com.bytedance.sdk.component.le.ouw.ouw.ouw;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.le.ouw.pno;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt {
    private C0055vt ouw;
    private Context vt;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw extends AbstractCursor {
        private ouw() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final double getDouble(int i4) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final float getFloat(int i4) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final int getInt(int i4) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final long getLong(int i4) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final short getShort(int i4) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final String getString(int i4) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public final boolean isNull(int i4) {
            return true;
        }

        public /* synthetic */ ouw(vt vtVar, byte b10) {
            this();
        }
    }

    public vt(Context context) {
        try {
            this.vt = context.getApplicationContext();
            if (this.ouw == null) {
                this.ouw = new C0055vt();
            }
        } catch (Throwable unused) {
        }
    }

    public C0055vt ouw() {
        return this.ouw;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.le.ouw.ouw.ouw.vt$vt, reason: collision with other inner class name */
    public class C0055vt {
        volatile SQLiteDatabase ouw = null;

        public C0055vt() {
        }

        public final void ouw() {
            boolean zVt;
            try {
                if (this.ouw != null && this.ouw.isOpen()) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.ouw == null || !this.ouw.isOpen()) {
                            this.ouw = pno.vt().ra.ouw(pno.vt().ouw);
                            this.ouw.setLockingEnabled(false);
                            com.bytedance.sdk.component.le.ouw.lh.vt.ouw();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } finally {
                if (!zVt) {
                }
            }
        }

        public final boolean vt() {
            SQLiteDatabase sQLiteDatabase = this.ouw;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public final Cursor ouw(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                ouw();
                return this.ouw.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                th2.printStackTrace();
                ouw ouwVar = new ouw(vt.this, (byte) 0);
                if (vt()) {
                    throw th2;
                }
                return ouwVar;
            }
        }

        public final int ouw(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                ouw();
                return this.ouw.update(str, contentValues, str2, strArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (vt()) {
                    throw e2;
                }
                return 0;
            }
        }

        public final long ouw(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                ouw();
                return this.ouw.insert(str, str2, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (vt()) {
                    throw e2;
                }
                return -1L;
            }
        }

        public final synchronized void ouw(String str, String str2, List<com.bytedance.sdk.component.le.ouw.yu.ouw> list) {
            JSONObject jSONObjectRa;
            try {
                try {
                    ouw();
                    this.ouw.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        com.bytedance.sdk.component.le.ouw.yu.ouw ouwVar = list.get(i4);
                        if (ouwVar != null && (jSONObjectRa = ouwVar.ra()) != null) {
                            contentValues.put(FacebookMediationAdapter.KEY_ID, ouwVar.lh());
                            String strVt = pno.vt().bly.vt(jSONObjectRa.toString());
                            if (!TextUtils.isEmpty(strVt)) {
                                contentValues.put("value", strVt);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.le.ouw.lh.ouw.fkw() && ouwVar.pno() > 0 && (ouwVar.yu() == 0 || ouwVar.yu() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(ouwVar.pno()));
                                }
                                this.ouw.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.ouw.setTransactionSuccessful();
                    list.size();
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                    if (this.ouw != null) {
                        this.ouw.endTransaction();
                    }
                } catch (Exception e2) {
                    list.size();
                    com.bytedance.sdk.component.le.ouw.lh.vt.fkw();
                    e2.printStackTrace();
                    if (!vt()) {
                        if (this.ouw != null) {
                            this.ouw.endTransaction();
                        }
                    } else {
                        throw e2;
                    }
                }
            } catch (Throwable th2) {
                if (this.ouw != null) {
                    this.ouw.endTransaction();
                }
                throw th2;
            }
        }

        public final int ouw(String str, String str2, String[] strArr) throws Exception {
            try {
                ouw();
                return this.ouw.delete(str, str2, strArr);
            } catch (Exception e2) {
                e2.printStackTrace();
                if (vt()) {
                    throw e2;
                }
                return 0;
            }
        }
    }
}
