package og;

import android.content.Context;
import android.os.Build;
import io.sentry.t;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pg.k;
import pg.m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19428a;

    /* renamed from: b, reason: collision with root package name */
    public final te.c f19429b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f19430c;

    /* renamed from: d, reason: collision with root package name */
    public final pg.c f19431d;

    /* renamed from: e, reason: collision with root package name */
    public final pg.c f19432e;

    /* renamed from: f, reason: collision with root package name */
    public final pg.c f19433f;

    /* renamed from: g, reason: collision with root package name */
    public final pg.h f19434g;

    /* renamed from: h, reason: collision with root package name */
    public final pg.i f19435h;

    /* renamed from: i, reason: collision with root package name */
    public final m f19436i;
    public final t j;
    public final js.e k;

    public b(Context context, te.c cVar, Executor executor, pg.c cVar2, pg.c cVar3, pg.c cVar4, pg.h hVar, pg.i iVar, m mVar, t tVar, js.e eVar) {
        this.f19428a = context;
        this.f19429b = cVar;
        this.f19430c = executor;
        this.f19431d = cVar2;
        this.f19432e = cVar3;
        this.f19433f = cVar4;
        this.f19434g = hVar;
        this.f19435h = iVar;
        this.f19436i = mVar;
        this.j = tVar;
        this.k = eVar;
    }

    public static ArrayList f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final boolean a(String str) {
        Pattern pattern = pg.i.f20523f;
        Pattern pattern2 = pg.i.f20522e;
        pg.i iVar = this.f19435h;
        pg.c cVar = iVar.f20526c;
        String strB = pg.i.b(cVar, str);
        if (strB != null) {
            if (pattern2.matcher(strB).matches()) {
                iVar.a(str, cVar.c());
                return true;
            }
            if (pattern.matcher(strB).matches()) {
                iVar.a(str, cVar.c());
                return false;
            }
        }
        String strB2 = pg.i.b(iVar.f20527d, str);
        if (strB2 != null) {
            if (pattern2.matcher(strB2).matches()) {
                return true;
            }
            if (pattern.matcher(strB2).matches()) {
                return false;
            }
        }
        pg.i.c(str, "Boolean");
        return false;
    }

    public final double b(String str) {
        Double dValueOf;
        pg.i iVar = this.f19435h;
        pg.c cVar = iVar.f20526c;
        pg.d dVarC = cVar.c();
        Double dValueOf2 = null;
        if (dVarC == null) {
            dValueOf = null;
        } else {
            try {
                dValueOf = Double.valueOf(dVarC.f20499b.getDouble(str));
            } catch (JSONException unused) {
            }
        }
        if (dValueOf != null) {
            iVar.a(str, cVar.c());
            return dValueOf.doubleValue();
        }
        pg.d dVarC2 = iVar.f20527d.c();
        if (dVarC2 != null) {
            try {
                dValueOf2 = Double.valueOf(dVarC2.f20499b.getDouble(str));
            } catch (JSONException unused2) {
            }
        }
        if (dValueOf2 != null) {
            return dValueOf2.doubleValue();
        }
        pg.i.c(str, "Double");
        return 0.0d;
    }

    public final long c(String str) {
        Long lValueOf;
        pg.i iVar = this.f19435h;
        pg.c cVar = iVar.f20526c;
        pg.d dVarC = cVar.c();
        Long lValueOf2 = null;
        if (dVarC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(dVarC.f20499b.getLong(str));
            } catch (JSONException unused) {
            }
        }
        if (lValueOf != null) {
            iVar.a(str, cVar.c());
            return lValueOf.longValue();
        }
        pg.d dVarC2 = iVar.f20527d.c();
        if (dVarC2 != null) {
            try {
                lValueOf2 = Long.valueOf(dVarC2.f20499b.getLong(str));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        pg.i.c(str, "Long");
        return 0L;
    }

    public final String d(String str) {
        pg.i iVar = this.f19435h;
        pg.c cVar = iVar.f20526c;
        String strB = pg.i.b(cVar, str);
        if (strB != null) {
            iVar.a(str, cVar.c());
            return strB;
        }
        String strB2 = pg.i.b(iVar.f20527d, str);
        if (strB2 != null) {
            return strB2;
        }
        pg.i.c(str, "String");
        return "";
    }

    public final void e(boolean z10) {
        HttpURLConnection httpURLConnection;
        t tVar = this.j;
        synchronized (tVar) {
            k kVar = (k) tVar.f12737d;
            synchronized (kVar.f20545q) {
                try {
                    kVar.f20535e = z10;
                    if (Build.VERSION.SDK_INT >= 26 && z10 && (httpURLConnection = kVar.f20536f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                synchronized (tVar) {
                    if (!((LinkedHashSet) tVar.f12736a).isEmpty()) {
                        ((k) tVar.f12737d).e(0L);
                    }
                }
            }
        }
    }
}
