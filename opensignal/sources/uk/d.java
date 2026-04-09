package uk;

import android.database.Cursor;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.staircase3.opensignal.utils.u;
import java.util.ArrayList;
import lq.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ou.c0;
import ou.x;
import sm.k;
import sm.l;
import sm.m;
import tm.h;

/* loaded from: classes.dex */
public final class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final q3.a f23584a;

    /* renamed from: b, reason: collision with root package name */
    public final h f23585b;

    /* renamed from: c, reason: collision with root package name */
    public k f23586c;

    public d(h hVar, q3.a aVar) {
        this.f23585b = hVar;
        this.f23584a = aVar;
    }

    public static k a(h hVar) {
        if (hVar == null) {
            return new k();
        }
        k kVar = new k();
        m.t();
        Cursor cursorRawQuery = m.f22145g.rawQuery("select * from tower_cache where " + l.KEY_CID + "==" + hVar.f22904b + " AND " + l.KEY_LAC + "==" + hVar.f22905c + " AND " + l.KEY_NETWORK_ID + "==" + hVar.f22903a, null);
        if (cursorRawQuery == null) {
            return kVar;
        }
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return kVar;
        }
        k kVar2 = new k(cursorRawQuery);
        cursorRawQuery.close();
        return kVar2;
    }

    public static String b(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("SingleTowerQueryParams null! Please construct SingleTowerQueryParams object with cid, lac, and networkId");
        }
        String str = hVar.f22903a;
        int i10 = hVar.f22905c;
        int i11 = hVar.f22904b;
        if (i11 == -1 || i10 == -1 || TextUtils.isEmpty(str) || str.equals("-1")) {
            return "";
        }
        String strP = c7.a.p("https://opensignal-api.opensignal.com/towers/map_id/gsm/", i11 + "," + i10 + "," + str);
        cj.a aVar = new cj.a();
        aVar.y("Content-Type", "text/json; charset=UTF-8");
        aVar.y("Connection", "Keep-Alive");
        aVar.y("X-CLIENT-ID", "decunaezoo9iebaicooTheecie7UgeeP");
        aVar.y("X-CLIENT-SECRET", "hef4Eitoh4thoo3pheecheekae7wahco");
        aVar.y("Accept", "application/json; version=1.0");
        aVar.N(strP);
        try {
            c0 c0VarE = ((x) u.f6195a.getValue()).a(aVar.r()).e();
            String strI = c0VarE.B.i();
            c0VarE.close();
            return strI;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        boolean z10;
        JSONObject jSONObject;
        q3.a aVar = this.f23584a;
        boolean z11 = true;
        boolean z12 = aVar != null;
        h hVar = this.f23585b;
        if (z12) {
            try {
                this.f23586c = a(hVar);
                publishProgress(new Void[0]);
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
        String strB = b(hVar);
        q qVar = u.f6195a;
        try {
            try {
                new JSONObject(strB);
            } catch (JSONException unused2) {
                z10 = false;
            }
        } catch (JSONException unused3) {
            new JSONArray(strB);
        }
        z10 = true;
        if (z10) {
            try {
                jSONObject = new JSONObject(strB);
            } catch (NullPointerException | JSONException unused4) {
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("meta").getInt("status_code") / 100 == 2 ? jSONObject.getJSONObject("content") : new JSONObject();
            m.h(jSONObject2);
        }
        if (aVar == null) {
            z11 = false;
        }
        if (!z11 || this.f23586c == null) {
            return Boolean.FALSE;
        }
        this.f23586c = a(hVar);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        q3.a aVar = this.f23584a;
        if (aVar == null || !bool.booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f23586c);
        aVar.r(1, arrayList);
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Object[] objArr) {
        q3.a aVar = this.f23584a;
        if (aVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f23586c);
            aVar.r(0, arrayList);
        }
    }
}
