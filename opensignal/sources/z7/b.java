package z7;

import ak.v;
import ak.w;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import ch.n;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.staircase3.opensignal.activities.MainActivity;
import com.staircase3.opensignal.viewcontrollers.TabCoverage;
import com.staircase3.opensignal.viewcontrollers.Tab_Overview;
import com.staircase3.opensignal.viewcontrollers.Tab_Stats;
import com.staircase3.opensignal.viewcontrollers.TestsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o4.j0;
import oh.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zc.k0;
import zc.p3;

/* loaded from: classes.dex */
public final class b implements k0, o.k {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26690a;

    public /* synthetic */ b(Object obj) {
        this.f26690a = obj;
    }

    public JSONObject a(v vVar) throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = vVar.f734a.iterator();
            while (it.hasNext()) {
                jSONArray.put(((yi.g) this.f26690a).h((w) it.next()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tests", jSONArray);
            return jSONObject;
        } catch (JSONException e4) {
            return h0.b.x("HttpHeadLatencyConfigMapper", e4, e4);
        }
    }

    public v b(JSONObject jSONObject, v vVar) throws JSONException {
        br.l.e(vVar, "fallbackConfig");
        if (jSONObject == null) {
            return vVar;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("tests");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                w wVarJ = ((yi.g) this.f26690a).j(jSONArray.getJSONObject(i10));
                if (wVarJ != null) {
                    arrayList.add(wVarJ);
                }
            }
            return new v(arrayList);
        } catch (JSONException e4) {
            String str = "Can't mapTo() to HttpHeadLatencyConfig for input: " + jSONObject;
            n.d("HttpHeadLatencyConfigMapper", str, e4);
            cj.a.E(e4, str);
            return vVar;
        }
    }

    @Override // zc.k0
    public /* synthetic */ void m(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        ((p3) this.f26690a).v(str, i10, th2, bArr, map);
    }

    @Override // o.k
    public boolean n(o.m mVar, MenuItem menuItem) {
        androidx.fragment.app.b tab_Overview;
        String str;
        zd.l lVar = ((BottomNavigationView) this.f26690a).f5679x;
        if (lVar != null) {
            MainActivity mainActivity = (MainActivity) ((p) lVar).f19481d;
            int itemId = menuItem.getItemId();
            if (itemId == qk.h.bottomTabSpeedtest) {
                tab_Overview = new TestsFragment();
                mainActivity.X.setText(qk.l.opensignal_test);
                mainActivity.X.setVisibility(8);
                str = "TestsFragment";
            } else if (itemId == qk.h.bottomTabStats) {
                tab_Overview = new Tab_Stats();
                mainActivity.X.setText(qk.l.my_stats);
                mainActivity.X.setVisibility(0);
                str = "Stats";
            } else if (itemId == qk.h.bottomTabCoverage) {
                tab_Overview = new TabCoverage();
                mainActivity.X.setVisibility(0);
                Toolbar toolbar = mainActivity.W;
                if (toolbar != null) {
                    toolbar.setVisibility(8);
                }
                str = "Map";
            } else if (itemId == qk.h.bottomTabDashboard) {
                tab_Overview = new Tab_Overview();
                mainActivity.X.setText(qk.l.overview);
                mainActivity.X.setVisibility(0);
                str = "Overview";
            } else {
                tab_Overview = null;
                str = "";
            }
            boolean z10 = MainActivity.f5997x0;
            j0 j0VarO = mainActivity.o();
            j0VarO.getClass();
            o4.a aVar = new o4.a(j0VarO);
            aVar.i(qk.h.fragment_container, tab_Overview, str);
            aVar.e();
        }
        return false;
    }

    public b(z4.f fVar, cj.a aVar) {
        br.l.e(fVar, "crossTaskDelayConfigJsonMapper");
        this.f26690a = fVar;
    }

    public b(yi.g gVar, cj.a aVar) {
        br.l.e(gVar, "httpHeadLatencyEndpointMapper");
        this.f26690a = gVar;
    }

    public b(gi.a aVar, cj.a aVar2) {
        br.l.e(aVar, "udpConfigItemMapper");
        this.f26690a = aVar;
    }

    @Override // o.k
    public void A(o.m mVar) {
    }
}
