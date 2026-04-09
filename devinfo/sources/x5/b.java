package x5;

import nk.k;
import yj.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f36975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36976b;

    public b(int i4, int i10) {
        this.f36975a = i4;
        this.f36976b = i10;
    }

    public void a(d6.a aVar) {
        k.e(aVar, "connection");
        if (!(aVar instanceof w5.a)) {
            throw new h("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((w5.a) aVar).f36470a);
    }

    public void b(e6.a aVar) {
        k.e(aVar, "db");
        throw new h("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
