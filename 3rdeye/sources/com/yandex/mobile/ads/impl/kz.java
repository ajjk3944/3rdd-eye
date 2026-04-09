package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.yandex.mobile.ads.impl.v30;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class kz implements nk2 {

    /* renamed from: e, reason: collision with root package name */
    private static final String f29824e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f29825f;

    /* renamed from: b, reason: collision with root package name */
    private final uv f29827b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29829d;

    /* renamed from: a, reason: collision with root package name */
    private final String f29826a = "ExoPlayerDownloads";

    /* renamed from: c, reason: collision with root package name */
    private final Object f29828c = new Object();

    public static final class a implements s30 {

        /* renamed from: a, reason: collision with root package name */
        private final Cursor f29830a;

        public /* synthetic */ a(Cursor cursor, int i) {
            this(cursor);
        }

        public final r30 a() {
            return kz.a(this.f29830a);
        }

        public final int b() {
            return this.f29830a.getPosition();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f29830a.close();
        }

        private a(Cursor cursor) {
            this.f29830a = cursor;
        }

        public final boolean a(int i) {
            return this.f29830a.moveToPosition(i);
        }
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        f29824e = sb.toString();
        f29825f = new String[]{FacebookMediationAdapter.KEY_ID, "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public kz(y12 y12Var, int i) {
        this.f29827b = y12Var;
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i = s82.f32899a;
            for (String str2 : str.split(StringUtils.COMMA, -1)) {
                String[] strArrSplit = str2.split("\\.", -1);
                if (strArrSplit.length != 3) {
                    throw new IllegalStateException();
                }
                arrayList.add(new k22(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public final r30 b(String str) throws tv {
        a();
        try {
            Cursor cursorA = a("id = ?", new String[]{str});
            try {
                if (cursorA.getCount() == 0) {
                    cursorA.close();
                    return null;
                }
                cursorA.moveToNext();
                r30 r30VarA = a(cursorA);
                cursorA.close();
                return r30VarA;
            } finally {
            }
        } catch (SQLiteException e4) {
            throw new tv(e4);
        }
    }

    public final void c(String str) throws tv {
        a();
        try {
            this.f29827b.getWritableDatabase().delete(this.f29826a, "id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    public final void c() throws tv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f29827b.getWritableDatabase().update(this.f29826a, contentValues, null, null);
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    private static r30 b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        v30.b bVar = new v30.b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else if ("ss".equals(string3)) {
            str = "application/vnd.ms-sstr+xml";
        } else {
            str = "video/x-unknown";
        }
        v30 v30VarA = bVar.b(str).a(a(cursor.getString(3))).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        u30 u30Var = new u30();
        u30Var.f33897a = cursor.getLong(13);
        u30Var.f33898b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new r30(v30VarA, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, u30Var);
    }

    private void a() throws tv {
        ArrayList arrayList;
        synchronized (this.f29828c) {
            if (this.f29829d) {
                return;
            }
            try {
                int iA = wa2.a(this.f29827b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f29827b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        wa2.a(writableDatabase, 0, "", 3);
                        if (iA == 2) {
                            arrayList = a(writableDatabase);
                        } else {
                            arrayList = new ArrayList();
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f29826a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f29826a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            a((r30) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f29829d = true;
            } catch (Throwable th2) {
                throw new tv(th2);
            }
        }
    }

    private Cursor a(String str, String[] strArr) throws tv {
        try {
            return this.f29827b.getReadableDatabase().query(this.f29826a, f29825f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    public final void b() throws tv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f29827b.getWritableDatabase().update(this.f29826a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r30 a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        v30.b bVarA = new v30.b(Uri.parse(string2), string).b(cursor.getString(1)).a(a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        v30 v30VarA = bVarA.b(blob).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        u30 u30Var = new u30();
        u30Var.f33897a = cursor.getLong(13);
        u30Var.f33898b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new r30(v30VarA, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, u30Var);
    }

    public final s30 a(int... iArr) throws tv {
        String string;
        a();
        int i = 0;
        if (iArr.length == 0) {
            string = "1";
        } else {
            StringBuilder sb = new StringBuilder("state IN (");
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (i10 > 0) {
                    sb.append(',');
                }
                sb.append(iArr[i10]);
            }
            sb.append(')');
            string = sb.toString();
        }
        return new a(a(string, (String[]) null), i);
    }

    private ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!s82.a(sQLiteDatabase, this.f29826a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f29826a, new String[]{FacebookMediationAdapter.KEY_ID, AppIntroBaseFragmentKt.ARG_TITLE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(b(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void a(r30 r30Var) throws tv {
        a();
        try {
            a(r30Var, this.f29827b.getWritableDatabase());
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    private void a(r30 r30Var, SQLiteDatabase sQLiteDatabase) throws SQLException {
        byte[] bArr = r30Var.f32442a.f34317f;
        if (bArr == null) {
            bArr = s82.f32904f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, r30Var.f32442a.f34313b);
        contentValues.put("mime_type", r30Var.f32442a.f34315d);
        contentValues.put("uri", r30Var.f32442a.f34314c.toString());
        List<k22> list = r30Var.f32442a.f34316e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            k22 k22Var = list.get(i);
            sb.append(k22Var.f29482b);
            sb.append('.');
            sb.append(k22Var.f29483c);
            sb.append('.');
            sb.append(k22Var.f29484d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", r30Var.f32442a.f34318g);
        contentValues.put("data", r30Var.f32442a.f34319h);
        contentValues.put("state", Integer.valueOf(r30Var.f32443b));
        contentValues.put("start_time_ms", Long.valueOf(r30Var.f32444c));
        contentValues.put("update_time_ms", Long.valueOf(r30Var.f32445d));
        contentValues.put("content_length", Long.valueOf(r30Var.f32446e));
        contentValues.put("stop_reason", Integer.valueOf(r30Var.f32447f));
        contentValues.put("failure_reason", Integer.valueOf(r30Var.f32448g));
        contentValues.put("percent_downloaded", Float.valueOf(r30Var.f32449h.f33898b));
        contentValues.put("bytes_downloaded", Long.valueOf(r30Var.f32449h.f33897a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f29826a, null, contentValues);
    }

    public final void a(int i) throws tv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f29827b.getWritableDatabase().update(this.f29826a, contentValues, f29824e, null);
        } catch (Throwable th) {
            throw new tv(th);
        }
    }

    public final void a(int i, String str) throws tv {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f29827b.getWritableDatabase().update(this.f29826a, contentValues, f29824e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new tv(th);
        }
    }
}
