package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.sc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4947sc implements Q6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41637b;

    /* renamed from: c, reason: collision with root package name */
    public final C4596en f41638c;

    /* renamed from: d, reason: collision with root package name */
    public final C4919ra f41639d;

    /* renamed from: e, reason: collision with root package name */
    public C4891q7 f41640e;

    public C4947sc(Context context, String str, C4596en c4596en) {
        this(context, str, new C4919ra(str), c4596en);
    }

    @Override // io.appmetrica.analytics.impl.Q6
    public final synchronized SQLiteDatabase a() {
        C4891q7 c4891q7;
        try {
            this.f41639d.a();
            c4891q7 = new C4891q7(this.f41636a, this.f41637b, this.f41638c, PublicLogger.getAnonymousInstance());
            this.f41640e = c4891q7;
        } catch (Throwable unused) {
            return null;
        }
        return c4891q7.getWritableDatabase();
    }

    public C4947sc(Context context, String str, C4919ra c4919ra, C4596en c4596en) {
        this.f41636a = context;
        this.f41637b = str;
        this.f41639d = c4919ra;
        this.f41638c = c4596en;
    }

    @Override // io.appmetrica.analytics.impl.Q6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC4623fo.a((Closeable) this.f41640e);
        this.f41639d.b();
        this.f41640e = null;
    }
}
