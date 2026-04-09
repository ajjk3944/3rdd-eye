package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import g0.C4356c;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Lb implements InterfaceC4481ab, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f39763a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f39764b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f39765c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final Kb f39766d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f39767e;

    /* renamed from: f, reason: collision with root package name */
    public final Q6 f39768f;

    public Lb(Q6 q62) {
        this.f39768f = q62;
        Locale locale = Locale.US;
        Kb kb = new Kb(this, C4356c.h(Md.a(), "IAA-DW-"));
        this.f39766d = kb;
        kb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(io.appmetrica.analytics.impl.Lb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.Q6 r4 = r13.f39768f     // Catch: java.lang.Throwable -> L84
            android.database.sqlite.SQLiteDatabase r5 = r4.a()     // Catch: java.lang.Throwable -> L84
            if (r5 == 0) goto L85
            java.lang.String r6 = r13.f39765c     // Catch: java.lang.Throwable -> L85
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L85
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
        L21:
            boolean r6 = r4.moveToNext()     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L82
            int r6 = r4.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L82
            int r7 = r4.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = r4.getString(r7)     // Catch: java.lang.Throwable -> L82
            int r8 = r4.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L82
            int r8 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L82
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L82
            if (r9 != 0) goto L21
            r9 = 1
            if (r8 == r9) goto L65
            r9 = 2
            if (r8 == r9) goto L60
            r9 = 3
            if (r8 == r9) goto L5b
            r9 = 4
            if (r8 == r9) goto L7a
            r9 = 5
            if (r8 == r9) goto L56
        L54:
            r7 = r3
            goto L7a
        L56:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L5b:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L60:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L82
            goto L7a
        L65:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L82
            if (r8 == 0) goto L70
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L82
            goto L7a
        L70:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L54
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L82
        L7a:
            if (r7 == 0) goto L21
            java.util.HashMap r8 = r13.f39763a     // Catch: java.lang.Throwable -> L82
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L82
            goto L21
        L82:
            r3 = r4
            goto L85
        L84:
            r5 = r3
        L85:
            io.appmetrica.analytics.impl.AbstractC4623fo.a(r3)
            io.appmetrica.analytics.impl.Q6 r13 = r13.f39768f
            r13.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Lb.a(io.appmetrica.analytics.impl.Lb):void");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final void b() {
        synchronized (this.f39766d) {
            this.f39766d.notifyAll();
        }
    }

    public final void c() throws InterruptedException {
        if (this.f39767e) {
            return;
        }
        try {
            this.f39763a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f39766d.isRunning()) {
            this.f39766d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final int getInt(String str, int i) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final long getLong(String str, long j4) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final InterfaceC4481ab remove(String str) {
        synchronized (this.f39763a) {
            c();
            this.f39763a.remove(str);
        }
        synchronized (this.f39766d) {
            this.f39764b.put(str, this);
            this.f39766d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f39763a) {
            c();
            obj = this.f39763a.get(str);
        }
        return obj;
    }

    public static void a(Lb lb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        lb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == lb) {
                contentValues.putNull(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            } else if (value instanceof String) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = lb.f39768f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i10 = 0; i10 < size; i10++) {
                        ContentValues contentValues2 = contentValuesArr[i10];
                        if (contentValues2.getAsString(AppMeasurementSdk.ConditionalUserProperty.VALUE) == null) {
                            sQLiteDatabaseA.delete(lb.f39765c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(lb.f39765c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                    lb.f39768f.a(sQLiteDatabaseA);
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        lb.f39768f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final synchronized InterfaceC4481ab a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final InterfaceC4481ab a(String str, long j4) {
        a(str, Long.valueOf(j4));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final synchronized InterfaceC4481ab a(int i, String str) {
        a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final InterfaceC4481ab a(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final InterfaceC4481ab a(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f39763a) {
            c();
            zContainsKey = this.f39763a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4481ab
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f39763a) {
            hashSet = new HashSet(this.f39763a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f39763a) {
            c();
            this.f39763a.put(str, obj);
        }
        synchronized (this.f39766d) {
            this.f39764b.put(str, obj);
            this.f39766d.notifyAll();
        }
    }
}
