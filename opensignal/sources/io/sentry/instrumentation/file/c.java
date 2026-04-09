package io.sentry.instrumentation.file;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import m9.i;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements a, t9.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f12336a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12337d;

    public /* synthetic */ c(long j, i iVar) {
        this.f12336a = j;
        this.f12337d = iVar;
    }

    @Override // t9.f
    public Object apply(Object obj) {
        i iVar = (i) this.f12337d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f12336a));
        String str = iVar.f16360a;
        j9.d dVar = iVar.f16362c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(w9.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f16360a);
            contentValues.put("priority", Integer.valueOf(w9.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        e eVar = (e) this.f12337d;
        return Long.valueOf(eVar.f12343a.skip(this.f12336a));
    }

    public /* synthetic */ c(e eVar, long j) {
        this.f12337d = eVar;
        this.f12336a = j;
    }
}
