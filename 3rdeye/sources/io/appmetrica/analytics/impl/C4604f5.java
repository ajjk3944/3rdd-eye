package io.appmetrica.analytics.impl;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4604f5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final C4578e5 f40836a = new C4578e5();

    /* renamed from: b, reason: collision with root package name */
    public final C4553d5 f40837b = new C4553d5();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(SQLiteDatabase sQLiteDatabase) throws SQLException {
        this.f40836a.runScript(sQLiteDatabase);
        this.f40837b.runScript(sQLiteDatabase);
    }
}
