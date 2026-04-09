package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap<String, m> f18270b = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final k f18271a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f18271a.p().b();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    Log.e("TrackManager", "flush error", e10);
                }
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f18273a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JSONObject f18274b;

        public b(e eVar, JSONObject jSONObject) {
            this.f18273a = eVar;
            this.f18274b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            try {
                m.this.f18271a.g().a(this.f18273a);
                JSONObject jSONObject = this.f18274b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.f18274b.put("track_time", jArrE[0]);
                    this.f18274b.put("track_count", jArrE[1]);
                    this.f18273a.a(this.f18274b);
                }
                this.f18273a.b(m.this.f18271a.b().f18471f);
                m.this.f18271a.g().b(this.f18273a);
            } catch (Exception e10) {
                Log.d("TrackManager", "trackEvent error", e10);
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f18271a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m b(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f18270b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public JSONObject c() {
        return this.f18271a.o();
    }

    public String d() {
        return this.f18271a.s();
    }

    public long[] e() {
        return this.f18271a.g().a();
    }

    public String f() {
        return this.f18271a.v();
    }

    public boolean g() {
        return !this.f18271a.w();
    }

    public String h() {
        if (!g()) {
            return this.f18271a.x();
        }
        if (com.mbridge.msdk.tracker.a.f18222a) {
            Log.e("TrackManager", "MBridgeTrackManager is already running");
        }
        return d();
    }

    public void a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = f18270b;
        m mVar = concurrentHashMap.get(str);
        if (y.b(mVar)) {
            concurrentHashMap.put(str, new m(str, context, xVar));
        } else {
            mVar.f18271a.a(xVar);
        }
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f18271a.w()) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        if (eVar != null && b(eVar)) {
            JSONObject jSONObjectI = eVar.i();
            if (jSONObjectI != null && !jSONObjectI.has(CampaignEx.JSON_KEY_ST_TS)) {
                try {
                    jSONObjectI.put(CampaignEx.JSON_KEY_ST_TS, System.currentTimeMillis());
                } catch (Exception e10) {
                    Log.e("TrackManager", "trackEvent error", e10);
                }
            }
            try {
                this.f18271a.h().a(new b(eVar, jSONObjectI));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    Log.e("TrackManager", "trackEvent error", e11);
                }
            }
        }
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = f18270b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                mVarArr[i10] = it.next().getValue();
                i10++;
            }
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", "getAllTrackManager error", e10);
            }
        }
        return mVarArr;
    }

    public void a() {
        try {
            this.f18271a.h().a(new a());
        } catch (Exception e10) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", "flush error", e10);
            }
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.g())) {
            return false;
        }
        return this.f18271a.a(eVar);
    }

    public void a(JSONObject jSONObject) {
        this.f18271a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
