package F3;

import B3.c;
import F3.m;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.nr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements m.a, nr0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1612c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1613d;

    public /* synthetic */ j(Object obj, long j4, Object obj2) {
        this.f1612c = obj;
        this.f1613d = obj2;
        this.f1611b = j4;
    }

    @Override // F3.m.a
    public Object apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c.a aVar = (c.a) this.f1613d;
        String string = Integer.toString(aVar.getNumber());
        String str = (String) this.f1612c;
        boolean zBooleanValue = ((Boolean) m.D(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string}), new h(1))).booleanValue();
        long j4 = this.f1611b;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j4 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(aVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(aVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j4));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        Object obj2 = this.f1613d;
        long j4 = this.f1611b;
        ((ed) obj).getClass();
    }
}
