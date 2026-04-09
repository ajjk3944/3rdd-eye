package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.d f13483a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f13484b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13485c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f13486d;

    /* renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    public class RunnableC0244a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f13487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13488b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13489c;

        public RunnableC0244a(c.a aVar, String str, String str2) {
            this.f13487a = aVar;
            this.f13488b = str;
            this.f13489c = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v12, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r0v14 */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursorRawQuery;
            c.a aVar;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                a aVar2 = a.this;
                aVar2.f13486d = aVar2.f13483a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = null;
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                ?? IsOpen = a.this.f13486d.isOpen();
                try {
                    if (IsOpen != 0) {
                        try {
                            cursorRawQuery = a.this.f13486d.rawQuery("SELECT * FROM " + a.this.f13485c + " WHERE URL = ? AND filePath = ?", new String[]{this.f13488b, this.f13489c});
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(cursorRawQuery);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (MBridgeConstans.DEBUG) {
                                        e.printStackTrace();
                                    }
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    aVar = this.f13487a;
                                    if (aVar == null) {
                                        return;
                                    }
                                    aVar.a(bVarA);
                                    return;
                                }
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            aVar = this.f13487a;
                            if (aVar == null) {
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            IsOpen = 0;
                            if (IsOpen != 0) {
                                IsOpen.close();
                            }
                            c.a aVar3 = this.f13487a;
                            if (aVar3 != null) {
                                aVar3.a(null);
                            }
                            throw th;
                        }
                        aVar.a(bVarA);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f13487a)) {
                this.f13487a.a(null);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f13491a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f13491a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                a aVar = a.this;
                aVar.f13486d = aVar.f13483a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d) || !a.this.f13486d.isOpen()) {
                return;
            }
            try {
                try {
                    a.this.f13486d.beginTransaction();
                    a.this.f13486d.insert(a.this.f13485c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13491a));
                    a.this.f13486d.setTransactionSuccessful();
                } finally {
                    try {
                        if (a.this.f13486d.inTransaction()) {
                            a.this.f13486d.endTransaction();
                        }
                    } catch (Throwable th) {
                        q0.b(IDatabaseHelper.TAG, th.getMessage());
                    }
                }
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
                try {
                    if (a.this.f13486d.inTransaction()) {
                        a.this.f13486d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f13493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13494b;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
            this.f13493a = bVar;
            this.f13494b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                a aVar = a.this;
                aVar.f13486d = aVar.f13483a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d) || !a.this.f13486d.isOpen()) {
                return;
            }
            try {
                a.this.f13486d.update(a.this.f13485c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13493a), "URL = ? AND filePath = ?", new String[]{this.f13493a.c(), this.f13494b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f13496a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13497b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13498c;

        public d(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str, String str2) {
            this.f13496a = bVar;
            this.f13497b = str;
            this.f13498c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                a aVar = a.this;
                aVar.f13486d = aVar.f13483a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d) || !a.this.f13486d.isOpen()) {
                return;
            }
            try {
                a.this.f13486d.update(a.this.f13485c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f13496a), "URL = ? AND filePath = ?", new String[]{this.f13497b, this.f13498c});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13500a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f13501b;

        public e(String str, String str2) {
            this.f13500a = str;
            this.f13501b = str2;
        }

        @Override // java.lang.Runnable
        public void run() throws SQLException {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                a aVar = a.this;
                aVar.f13486d = aVar.f13483a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d) || !a.this.f13486d.isOpen()) {
                return;
            }
            try {
                a.this.f13486d.execSQL("DELETE FROM " + a.this.f13485c + " WHERE URL = ? AND filePath = ?", new Object[]{this.f13500a, this.f13501b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13503a;

        public f(String str) {
            this.f13503a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws SQLException {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d)) {
                a aVar = a.this;
                aVar.f13486d = aVar.f13483a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f13486d) || !a.this.f13486d.isOpen()) {
                return;
            }
            try {
                a.this.f13486d.execSQL("DELETE FROM " + a.this.f13485c + " WHERE URL = ?", new Object[]{this.f13503a});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, com.mbridge.msdk.config.component.load.downloader.database.d dVar) {
        this.f13484b = handler;
        this.f13483a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str, String str2) {
        this.f13484b.post(new e(str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str) {
        this.f13484b.post(new f(str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, c.a aVar) {
        this.f13484b.post(new RunnableC0244a(aVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f13484b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f13484b.post(new c(bVar, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f13484b.post(new d(bVar, str, str2));
    }
}
