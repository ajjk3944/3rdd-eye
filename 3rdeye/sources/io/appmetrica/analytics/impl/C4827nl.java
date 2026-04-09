package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: io.appmetrica.analytics.impl.nl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4827nl implements Q6 {

    /* renamed from: a, reason: collision with root package name */
    public final C4891q7 f41315a;

    public C4827nl(C4891q7 c4891q7) {
        this.f41315a = c4891q7;
    }

    @Override // io.appmetrica.analytics.impl.Q6
    public final void a(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // io.appmetrica.analytics.impl.Q6
    public final SQLiteDatabase a() {
        try {
            return this.f41315a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
