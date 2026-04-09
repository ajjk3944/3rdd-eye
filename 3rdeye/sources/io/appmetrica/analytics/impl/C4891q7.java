package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4891q7 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f41466a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f41467b;

    /* renamed from: c, reason: collision with root package name */
    public final C4596en f41468c;

    public C4891q7(Context context, String str, C4596en c4596en, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, P5.f39957b);
        this.f41468c = c4596en;
        this.f41466a = str;
        this.f41467b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f41467b.error(th, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f41466a);
            Zj zj = AbstractC5105yj.f42147a;
            zj.getClass();
            zj.a(new C5130zj("db_read_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f41467b.error(th, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f41466a);
            Zj zj = AbstractC5105yj.f42147a;
            zj.getClass();
            zj.a(new C5130zj("db_write_error", th));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f41468c.f40826a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        C4596en c4596en = this.f41468c;
        if (i <= i10) {
            c4596en.getClass();
            return;
        }
        try {
            c4596en.f40827b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c4596en.f40826a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C4596en c4596en = this.f41468c;
        c4596en.getClass();
        try {
            C4622fn c4622fn = c4596en.f40829d;
            if (c4622fn == null || c4622fn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c4596en.f40827b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c4596en.f40826a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i10) {
        boolean z10;
        C4596en c4596en = this.f41468c;
        c4596en.getClass();
        if (i10 > i) {
            for (int i11 = i + 1; i11 <= i10; i11++) {
                try {
                    Collection collection = (Collection) c4596en.f40828c.f39621a.get(Integer.valueOf(i11));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 || (!c4596en.f40829d.a(sQLiteDatabase))) {
            try {
                c4596en.f40827b.runScript(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                c4596en.f40826a.runScript(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
