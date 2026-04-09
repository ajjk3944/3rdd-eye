package ge;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import ea.i;
import java.util.HashMap;
import la.h;
import lf.g;
import me.k1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements cf.a, ma.b, la.f, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f24689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24691c;

    public /* synthetic */ a(Object obj, long j, Object obj2) {
        this.f24690b = obj;
        this.f24689a = j;
        this.f24691c = obj2;
    }

    @Override // la.f
    public Object apply(Object obj) throws SQLException {
        String str = (String) this.f24690b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i4 = ((ha.c) this.f24691c).f25029a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i4)});
        try {
            boolean z3 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.f24689a;
            if (z3) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i4)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i4));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // cf.a
    public void d(cf.b bVar) {
        ((b) bVar.get()).d((String) this.f24690b, this.f24689a, (k1) this.f24691c);
    }

    @Override // ma.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f24690b;
        i iVar = (i) this.f24691c;
        la.d dVar2 = (la.d) dVar.f19297c;
        long jI = ((na.a) dVar.g).i() + this.f24689a;
        h hVar = (h) dVar2;
        hVar.getClass();
        hVar.g(new la.e(jI, iVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((g) this.f24690b).b(task, this.f24689a, (HashMap) this.f24691c);
    }

    public /* synthetic */ a(Object obj, Object obj2, long j) {
        this.f24690b = obj;
        this.f24691c = obj2;
        this.f24689a = j;
    }
}
