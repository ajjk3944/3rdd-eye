package pi;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import br.l;
import ch.n;
import io.sentry.android.core.e0;
import sm.m;

/* loaded from: classes.dex */
public final class a extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, int i11) {
        super(context, str, cursorFactory, i10);
        this.f20582a = i11;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        switch (this.f20582a) {
            case 0:
                l.e(sQLiteDatabase, "database");
                n.b("LegacyDatabaseHelper", "LegacyDatabaseHelper Database onCreate");
                break;
            case 1:
                e0.d("DBAdapterCellsAPI", "trying to create");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CellsAPI");
                sQLiteDatabase.execSQL("create table CellsAPI (_id integer primary key autoincrement, cid text, lac text, psc text, lat real, lng real, network_type text );");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS towerindex ON CellsAPI (cid,lac,psc);");
                break;
            case 2:
                sQLiteDatabase.execSQL("create table logo_cache (KEY_NETWORK_ID INTEGER,KEY_NETWORK_NAME TEXT,KEY_LOGO_URL_SMALL TEXT,KEY_LOGO_URL_LARGE TEXT,KEY_LOGO_HEX_COLOR TEXT,KEY_TWITTER_HANDLE TEXT, PRIMARY KEY (KEY_NETWORK_ID) )");
                break;
            default:
                sQLiteDatabase.execSQL(m.d());
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_lat ON tower_cache (" + sm.l.KEY_EST_LAT.name() + ")");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_lng ON tower_cache (" + sm.l.KEY_EST_LNG.name() + ")");
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        switch (this.f20582a) {
            case 1:
                onUpgrade(sQLiteDatabase, i10, i11);
                break;
            case 2:
                onUpgrade(sQLiteDatabase, i10, i11);
                break;
            case 3:
                onUpgrade(sQLiteDatabase, i10, i11);
                break;
            default:
                super.onDowngrade(sQLiteDatabase, i10, i11);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        switch (this.f20582a) {
            case 0:
                l.e(sQLiteDatabase, "database");
                n.b("LegacyDatabaseHelper", "Database onUpgrade");
                break;
            case 1:
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CellsAPI");
                onCreate(sQLiteDatabase);
                break;
            case 2:
                sQLiteDatabase.execSQL("drop table if exists logo_cache");
                sQLiteDatabase.execSQL("create table logo_cache (KEY_NETWORK_ID INTEGER,KEY_NETWORK_NAME TEXT,KEY_LOGO_URL_SMALL TEXT,KEY_LOGO_URL_LARGE TEXT,KEY_LOGO_HEX_COLOR TEXT,KEY_TWITTER_HANDLE TEXT, PRIMARY KEY (KEY_NETWORK_ID) )");
                break;
            default:
                sQLiteDatabase.execSQL("drop table if exists tower_cache");
                sQLiteDatabase.execSQL(m.d());
                break;
        }
    }
}
