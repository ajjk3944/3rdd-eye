package la;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.liuzh.deviceinfo.splash.SplashLoadingActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f28636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28637b;

    public /* synthetic */ e(long j, ea.i iVar) {
        this.f28636a = j;
        this.f28637b = iVar;
    }

    public void a(boolean z3) {
        SplashLoadingActivity splashLoadingActivity = (SplashLoadingActivity) this.f28637b;
        int i4 = SplashLoadingActivity.C;
        if (z3) {
            splashLoadingActivity.finish();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f28636a;
        if (jCurrentTimeMillis < 3000) {
            splashLoadingActivity.B.postDelayed(new rh.f(splashLoadingActivity, 1), 3000 - jCurrentTimeMillis);
        } else {
            splashLoadingActivity.finish();
        }
    }

    @Override // la.f
    public Object apply(Object obj) {
        ea.i iVar = (ea.i) this.f28637b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f28636a));
        String str = iVar.f22494a;
        ba.c cVar = iVar.f22496c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(oa.a.a(cVar))}) < 1) {
            contentValues.put("backend_name", iVar.f22494a);
            contentValues.put("priority", Integer.valueOf(oa.a.a(cVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public /* synthetic */ e(SplashLoadingActivity splashLoadingActivity, long j) {
        this.f28637b = splashLoadingActivity;
        this.f28636a = j;
    }
}
