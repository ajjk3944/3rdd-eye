package e5;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.HashMap;
import lf.k1;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements a5.j, eg.a, dd.a, u9.b, t9.f, qb.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7939a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f7940d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f7941g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7942r;

    public /* synthetic */ w(Object obj, long j, Object obj2, int i10) {
        this.f7939a = i10;
        this.f7941g = obj;
        this.f7940d = j;
        this.f7942r = obj2;
    }

    @Override // a5.j
    public void a(Object obj) {
        switch (this.f7939a) {
            case 0:
                ((c) obj).onRenderedFirstFrame((a) this.f7941g, this.f7942r, this.f7940d);
                break;
            default:
                ((AnalyticsListener) obj).onRenderedFirstFrame((x9.q) this.f7941g, this.f7942r, this.f7940d);
                break;
        }
    }

    @Override // t9.f
    public Object apply(Object obj) throws SQLException {
        String str = (String) this.f7941g;
        p9.c cVar = (p9.c) this.f7942r;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        boolean zBooleanValue = ((Boolean) t9.h.G(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.getNumber())}), new p5.b(13))).booleanValue();
        long j = this.f7940d;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(cVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(cVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // u9.b
    public Object g() {
        al.b bVar = (al.b) this.f7941g;
        m9.i iVar = (m9.i) this.f7942r;
        t9.d dVar = (t9.d) bVar.f812d;
        long jE = ((v9.a) bVar.f816h).e() + this.f7940d;
        t9.h hVar = (t9.h) dVar;
        hVar.getClass();
        hVar.h(new io.sentry.instrumentation.file.c(jE, iVar));
        return null;
    }

    @Override // dd.a
    public Object j(dd.r rVar) {
        return ((pg.h) this.f7941g).b(rVar, this.f7940d, (HashMap) this.f7942r);
    }

    @Override // eg.a
    public void k(eg.b bVar) {
        String str = (String) this.f7941g;
        k1 k1Var = (k1) this.f7942r;
        ef.a aVar = (ef.a) bVar.get();
        aVar.getClass();
        Log.isLoggable("FirebaseCrashlytics", 2);
        aVar.f8184a.a(new w(str, this.f7940d, k1Var, 1));
    }

    public /* synthetic */ w(Object obj, Object obj2, long j, int i10) {
        this.f7939a = i10;
        this.f7941g = obj;
        this.f7942r = obj2;
        this.f7940d = j;
    }
}
