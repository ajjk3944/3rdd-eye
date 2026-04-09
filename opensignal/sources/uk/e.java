package uk;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.staircase3.opensignal.utils.s;
import com.staircase3.opensignal.utils.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ou.a0;
import ou.x;
import sm.k;
import sm.l;
import sm.m;
import tm.i;

/* loaded from: classes.dex */
public final class e extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final el.b f23587a;

    /* renamed from: b, reason: collision with root package name */
    public final pm.c f23588b;

    /* renamed from: c, reason: collision with root package name */
    public final i f23589c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f23590d;

    public e(el.b bVar, i iVar, io.sentry.android.replay.capture.e eVar) {
        this.f23587a = bVar;
        this.f23589c = iVar;
        this.f23588b = eVar;
    }

    public static ArrayList a(i iVar) {
        if (iVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        tm.a aVar = iVar.f22906a;
        m.t();
        SQLiteDatabase sQLiteDatabase = m.f22145g;
        StringBuilder sb2 = new StringBuilder("select * from tower_cache where ");
        l lVar = l.KEY_EST_LAT;
        sb2.append(lVar);
        sb2.append("<");
        sb2.append(aVar.f22882a);
        sb2.append(" AND ");
        sb2.append(lVar);
        sb2.append(">");
        sb2.append(aVar.f22884c);
        sb2.append(" AND ");
        l lVar2 = l.KEY_EST_LNG;
        sb2.append(lVar2);
        sb2.append("<");
        sb2.append(aVar.f22883b);
        sb2.append(" AND ");
        sb2.append(lVar2);
        sb2.append(">");
        sb2.append(aVar.f22885d);
        sb2.append(" order by ");
        sb2.append(l.KEY_EST_ACC.name());
        sb2.append("  desc  limit 500");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
        if (cursorRawQuery == null) {
            return arrayList;
        }
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return arrayList;
        }
        do {
            arrayList.add(new k(cursorRawQuery));
        } while (cursorRawQuery.moveToNext());
        cursorRawQuery.close();
        return arrayList;
    }

    public static void c(String str) throws JSONException {
        JSONArray jSONArray;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str);
        } catch (NullPointerException | JSONException unused) {
        }
        if (jSONObject.getJSONObject("meta").getInt("status_code") / 100 == 2) {
            jSONArray = jSONObject.getJSONObject("content").getJSONArray("towers");
        } else {
            try {
                jSONArray = new JSONArray();
            } catch (JSONException unused2) {
                return;
            }
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            m.h(jSONArray.getJSONObject(i10));
        }
    }

    public final void b(i iVar) {
        if (iVar == null) {
            throw new NullPointerException("TowersQueryParams null! Please construct TowersQueryParams object with network name and id");
        }
        tm.a aVar = iVar.f22906a;
        int i10 = aVar.f22886e;
        el.b bVar = this.f23587a;
        if (i10 < bVar.j || i10 > bVar.k) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("?");
        sb2.append("zoom=" + i10);
        Locale locale = Locale.ENGLISH;
        sb2.append("&minLat=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22884c))));
        sb2.append("&maxLat=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22882a))));
        sb2.append("&minLng=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22885d))));
        sb2.append("&maxLng=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22883b))));
        sb2.append("&limit=500");
        Iterator it = iVar.f22907b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb2.append("&networkType=");
            sb2.append(str);
        }
        String strP = h0.b.p("https://opensignal-api.opensignal.com/towers/geo/", sb2);
        cj.a aVar2 = new cj.a();
        aVar2.y("Content-Type", "text/json; charset=UTF-8");
        aVar2.y("Connection", "Keep-Alive");
        aVar2.y("X-CLIENT-ID", "decunaezoo9iebaicooTheecie7UgeeP");
        aVar2.y("X-CLIENT-SECRET", "hef4Eitoh4thoo3pheecheekae7wahco");
        aVar2.y("Accept", "application/json; version=1.0");
        aVar2.N(strP);
        a0 a0VarR = aVar2.r();
        try {
            c(((x) u.f6195a.getValue()).a(a0VarR).e().B.i());
            Thread.currentThread();
        } catch (Exception unused) {
        } finally {
            i = s.f6193a;
            Thread.currentThread();
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        boolean z10 = true;
        pm.c cVar = this.f23588b;
        boolean z11 = cVar != null;
        i iVar = this.f23589c;
        if (z11) {
            try {
                this.f23590d = a(iVar);
                publishProgress(new Void[0]);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
        b(iVar);
        if (cVar == null) {
            z10 = false;
        }
        if (!z10 || this.f23590d.size() >= 50) {
            return Boolean.FALSE;
        }
        this.f23590d = a(iVar);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        pm.c cVar = this.f23588b;
        if (cVar == null || !bool.booleanValue()) {
            return;
        }
        cVar.r(1, this.f23590d);
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        pm.c cVar = this.f23588b;
        if (cVar != null) {
            cVar.r(0, this.f23590d);
        }
    }
}
