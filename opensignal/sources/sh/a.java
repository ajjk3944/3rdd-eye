package sh;

import br.l;
import ch.n;
import dt.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sm.m;
import xu.d;

/* loaded from: classes.dex */
public final class a extends w {

    /* renamed from: e, reason: collision with root package name */
    public final m f22047e;

    /* renamed from: f, reason: collision with root package name */
    public final c f22048f;

    /* renamed from: g, reason: collision with root package name */
    public final String f22049g;

    /* renamed from: h, reason: collision with root package name */
    public final th.a f22050h;

    /* renamed from: i, reason: collision with root package name */
    public final ak.b f22051i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q3.a aVar, qm.c cVar, m mVar, c cVar2, String str, th.a aVar2, ak.b bVar, wh.a aVar3) {
        super(aVar, cVar, aVar3, 2);
        l.e(cVar, "networkResource");
        l.e(mVar, "remoteUrlResponseMapper");
        l.e(str, "remoteUrlEndpoint");
        this.f22047e = mVar;
        this.f22048f = cVar2;
        this.f22049g = str;
        this.f22050h = aVar2;
        this.f22051i = bVar;
    }

    @Override // dt.w
    public final nh.l d(String str) throws JSONException {
        int iA;
        th.a aVar;
        String str2;
        String platformName = this.f22048f.f22056a.getPlatformName();
        this.f22047e.getClass();
        l.e(platformName, "platform");
        ArrayList arrayList = new ArrayList();
        if (str != null && !tt.l.D0(str)) {
            try {
                Object obj = new JSONObject(str).get("streams");
                l.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
                Locale locale = Locale.US;
                l.d(locale, "US");
                String lowerCase = platformName.toLowerCase(locale);
                l.d(lowerCase, "toLowerCase(...)");
                JSONArray jSONArray = ((JSONObject) obj).getJSONArray(lowerCase);
                l.d(jSONArray, "getJSONArray(...)");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = jSONArray.get(i10);
                    l.c(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj2;
                    arrayList.add(new b(d.K("id", jSONObject), d.K("stream_url", jSONObject), d.K("resolved_at", jSONObject), d.K("error", jSONObject)));
                }
            } catch (JSONException e4) {
                n.b("RemoteUrlResponseMapper", e4);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            String str3 = bVar.f22053b;
            if (str3 != null && !tt.l.D0(str3) && (iA = ((wh.a) this.f7549d).a(str3)) >= 200 && iA < 299 && (aVar = this.f22050h) != null && aVar.z(str3) && (str2 = bVar.f22055d) != null && tt.l.D0(str2)) {
                return new nh.l(str3);
            }
        }
        return new nh.c();
    }

    @Override // dt.w
    public final String e(String str, String str2) {
        qm.c cVar = (qm.c) this.f7548c;
        c cVar2 = this.f22048f;
        kk.b bVar = cVar2.f22056a;
        ak.b bVar2 = this.f22051i;
        if (bVar2 != null) {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; Android 10) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36");
            map.put("X-CLIENT-ID", bVar2.f428b);
            map.put("X-CLIENT-SECRET", bVar2.f429c);
            map.put("Accept", "application/json; version=1.0");
            map.put("platform", bVar.getPlatformName());
            map.put("quality", cVar2.f22057b);
            map.put("video-id", cVar2.f22058c);
            String lowerCase = bVar.getPlatformName().toLowerCase(Locale.ROOT);
            l.d(lowerCase, "toLowerCase(...)");
            String str3 = String.format("%s/v1/stream/%s/", Arrays.copyOf(new Object[]{this.f22049g, lowerCase}, 2));
            cVar.K();
            String strW = cVar.w(str3, map);
            if (strW != null) {
                return strW;
            }
        }
        return "";
    }
}
