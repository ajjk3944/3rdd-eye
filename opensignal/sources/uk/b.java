package uk;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.squareup.picasso.f0;
import com.squareup.picasso.l0;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.s;
import com.staircase3.opensignal.utils.u;
import i.j;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import ou.a0;
import ou.x;
import rk.o;
import tm.f;

/* loaded from: classes.dex */
public final class b extends AsyncTask {

    /* renamed from: e, reason: collision with root package name */
    public static Bitmap f23575e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f23576a;

    /* renamed from: b, reason: collision with root package name */
    public int f23577b;

    /* renamed from: c, reason: collision with root package name */
    public final o f23578c;

    /* renamed from: d, reason: collision with root package name */
    public final f f23579d;

    public b(j jVar, f fVar, o oVar) {
        this.f23576a = jVar.getApplicationContext();
        this.f23579d = fVar;
        this.f23578c = oVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        String string;
        Context context = this.f23576a;
        f fVar = this.f23579d;
        cj.a aVarG = sm.f.G(fVar.f22899a);
        if (aVarG != null) {
            string = (String) aVarG.f3976r;
            if (string != null) {
                return string;
            }
        } else {
            string = null;
        }
        int i10 = fVar.f22899a;
        if (i10 == -1) {
            return null;
        }
        cj.a aVar = new cj.a();
        aVar.y("Accept", "application/json; version=1.0");
        aVar.y("X-CLIENT-ID", "decunaezoo9iebaicooTheecie7UgeeP");
        aVar.y("X-CLIENT-SECRET", "hef4Eitoh4thoo3pheecheekae7wahco");
        aVar.N("https://opensignal-api.opensignal.com/networks/detail/map_name" + ("?net_id=" + i10 + "&net_id_sim=" + ((Object) "") + "&name=&name_sim="));
        a0 a0VarR = aVar.r();
        try {
            JSONObject jSONObject = new JSONObject(((x) u.f6195a.getValue()).a(a0VarR).e().B.i()).getJSONObject("content");
            string = jSONObject.getString("logoUrlLarge");
            sm.f.E(jSONObject);
            q.h(context, jSONObject.getString("networkId"));
            q.g(context, jSONObject.getString("name"));
            Thread.currentThread();
            return string;
        } catch (IOException | NullPointerException | JSONException unused) {
            return string;
        } finally {
            i = s.f6193a;
            Thread.currentThread();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        if (str == null || str.isEmpty()) {
            return;
        }
        a aVar = new a(this, str);
        l0 l0VarD = f0.f(this.f23576a).d(str);
        l0VarD.e(com.squareup.picasso.x.OFFLINE, new com.squareup.picasso.x[0]);
        l0VarD.d(aVar);
        this.f23577b = 0;
    }
}
