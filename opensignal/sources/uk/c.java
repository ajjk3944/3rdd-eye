package uk;

import android.os.AsyncTask;
import com.staircase3.opensignal.utils.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import ou.x;
import tm.g;

/* loaded from: classes.dex */
public final class c extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final el.b f23580a;

    /* renamed from: b, reason: collision with root package name */
    public final pm.a f23581b;

    /* renamed from: c, reason: collision with root package name */
    public final g f23582c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23583d;

    public c(el.b bVar, g gVar, boolean z10, pm.a aVar) {
        this.f23580a = bVar;
        this.f23582c = gVar;
        this.f23583d = z10;
        this.f23581b = aVar;
    }

    public final String a(g gVar, boolean z10) {
        if (gVar == null) {
            throw new NullPointerException("NetworkRankQueryParams null! Please construct NetworkRankQueryParam object with network name and id");
        }
        ArrayList arrayList = gVar.f22902c;
        tm.a aVar = gVar.f22900a;
        int i10 = aVar.f22886e;
        el.b bVar = this.f23580a;
        if (z10) {
            if (i10 < bVar.f8208f || i10 > bVar.f8209g) {
                return "";
            }
        } else {
            if (i10 < bVar.f8206d || i10 > bVar.f8209g) {
                return "";
            }
        }
        StringBuilder sb2 = new StringBuilder("?");
        sb2.append("zoom=" + i10);
        Locale locale = Locale.ENGLISH;
        sb2.append("&minLat=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22884c))));
        sb2.append("&maxLat=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22882a))));
        sb2.append("&minLng=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22885d))));
        sb2.append("&maxLng=".concat(String.format(locale, "%.6f", Double.valueOf(aVar.f22883b))));
        Iterator it = gVar.f22901b.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb2.append("&networkType=");
            sb2.append(str);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                if (iIntValue != 0) {
                    sb2.append("&networkId=");
                    sb2.append(iIntValue);
                }
            }
        }
        String str2 = "https://opensignal-api.opensignal.com/" + (z10 ? "networks/rank/" : "networks/") + ((Object) sb2);
        cj.a aVar2 = new cj.a();
        aVar2.y("Content-Type", "text/json; charset=UTF-8");
        aVar2.y("Connection", "Keep-Alive");
        aVar2.y("X-CLIENT-ID", "decunaezoo9iebaicooTheecie7UgeeP");
        aVar2.y("X-CLIENT-SECRET", "hef4Eitoh4thoo3pheecheekae7wahco");
        aVar2.y("Accept", "application/json; version=1.0");
        aVar2.N(str2);
        return ((x) u.f6195a.getValue()).a(aVar2.r()).e().B.i();
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return a(this.f23582c, this.f23583d);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        pm.a aVar = this.f23581b;
        if (aVar != null) {
            aVar.b(str);
        }
    }
}
