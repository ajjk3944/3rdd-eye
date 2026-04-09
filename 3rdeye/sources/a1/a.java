package A1;

import F1.b;
import b9.k;
import kotlin.jvm.internal.l;

/* compiled from: Migration.android.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f5a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6b;

    public a(int i, int i10) {
        this.f5a = i;
        this.f6b = i10;
    }

    public void a(b db) {
        l.f(db, "db");
        throw new k("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
