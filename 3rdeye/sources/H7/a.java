package H7;

import H7.b;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: AndroidDatabaseOpenHelper.kt */
/* loaded from: classes.dex */
public final class a extends SQLiteOpenHelper {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F7.j f2273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F7.k f2275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, F7.j jVar, b bVar, F7.k kVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
        this.f2273b = jVar;
        this.f2274c = bVar;
        this.f2275d = kVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.l.f(db, "db");
        db.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) throws SQLException {
        kotlin.jvm.internal.l.f(sqLiteDatabase, "sqLiteDatabase");
        b.a aVarA = this.f2274c.a(sqLiteDatabase);
        this.f2273b.f1695a.getClass();
        F7.g.c(aVarA);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i10) {
        kotlin.jvm.internal.l.f(sqLiteDatabase, "sqLiteDatabase");
        b.a aVarA = this.f2274c.a(sqLiteDatabase);
        F7.g gVar = this.f2275d.f1696a;
        gVar.getClass();
        if (i == 3) {
            return;
        }
        f fVar = gVar.f1683d.get(new b9.l(Integer.valueOf(i), Integer.valueOf(i10)));
        F7.f fVar2 = gVar.f1684e;
        if (fVar == null) {
            fVar = fVar2;
        }
        try {
            fVar.a(aVarA);
        } catch (SQLException unused) {
            fVar2.a(aVarA);
        }
    }
}
