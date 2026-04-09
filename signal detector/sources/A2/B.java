package A2;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.H9;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;
import t2.HandlerC2908D;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f147c;

    public /* synthetic */ B(Object obj, int i, Object obj2) {
        this.f145a = i;
        this.f146b = obj;
        this.f147c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedPreferences sharedPreferences;
        int i = this.f145a;
        boolean z6 = false;
        Object obj = this.f146b;
        Object obj2 = this.f147c;
        switch (i) {
            case 0:
                return ((C0113a) obj).getClickSignals((String) obj2);
            case 1:
                Cursor cursorL = ((com.lefan.signal.tracroute.e) obj2).f18864a.l((C0.t) obj);
                try {
                    int iP = I5.b.p(cursorL, "id");
                    int iP2 = I5.b.p(cursorL, "trace_link");
                    int iP3 = I5.b.p(cursorL, "trace_time");
                    ArrayList arrayList = new ArrayList(cursorL.getCount());
                    while (cursorL.moveToNext()) {
                        com.lefan.signal.tracroute.d dVar = new com.lefan.signal.tracroute.d();
                        dVar.f18861a = cursorL.getInt(iP);
                        dVar.f18862b = cursorL.isNull(iP2) ? null : cursorL.getString(iP2);
                        dVar.f18863c = cursorL.getLong(iP3);
                        arrayList.add(dVar);
                    }
                    return arrayList;
                } finally {
                    cursorL.close();
                }
            case 2:
                return ((p2.e) obj).k((Context) obj2);
            case 3:
                Context context = (Context) obj;
                Context context2 = (Context) obj2;
                if (context != null) {
                    AbstractC2907C.m("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    AbstractC2907C.m("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    z6 = true;
                }
                String string = sharedPreferences.getString("user_agent", "");
                if (TextUtils.isEmpty(string)) {
                    AbstractC2907C.m("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (z6) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        AbstractC2907C.m("Persisting user agent.");
                    }
                }
                return string;
            default:
                HandlerC2908D handlerC2908D = C2911G.f23576l;
                WebSettings webSettings = (WebSettings) obj;
                webSettings.setDatabasePath(((Context) obj2).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.i1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
        }
    }

    public void finalize() throws Throwable {
        switch (this.f145a) {
            case 1:
                ((C0.t) this.f146b).b();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public B(com.lefan.signal.tracroute.e eVar, C0.t tVar) {
        this.f145a = 1;
        this.f147c = eVar;
        this.f146b = tVar;
    }
}
