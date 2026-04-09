package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.tracker.x;
import com.unity3d.ads.BuildConfig;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class k {

    /* renamed from: o, reason: collision with root package name */
    private static volatile String f18255o = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f18256a;

    /* renamed from: b, reason: collision with root package name */
    private final m f18257b;

    /* renamed from: c, reason: collision with root package name */
    private Context f18258c;

    /* renamed from: d, reason: collision with root package name */
    private x f18259d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f18260e;

    /* renamed from: f, reason: collision with root package name */
    private List<String> f18261f;

    /* renamed from: g, reason: collision with root package name */
    private List<String> f18262g;

    /* renamed from: h, reason: collision with root package name */
    private volatile c f18263h;

    /* renamed from: i, reason: collision with root package name */
    private volatile l f18264i;

    /* renamed from: j, reason: collision with root package name */
    private volatile d f18265j;

    /* renamed from: k, reason: collision with root package name */
    private volatile j f18266k;

    /* renamed from: l, reason: collision with root package name */
    private volatile s f18267l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f18268m = true;

    /* renamed from: n, reason: collision with root package name */
    private volatile o f18269n;

    public k(String str, m mVar) {
        this.f18256a = str;
        this.f18257b = mVar;
    }

    public void a(Context context) {
        this.f18258c = context;
    }

    public x b() {
        x xVar = this.f18259d;
        if (xVar != null) {
            return xVar;
        }
        x xVarA = new x.b().a();
        this.f18259d = xVarA;
        return xVarA;
    }

    public Context c() {
        return this.f18258c;
    }

    public c d() {
        if (y.b(this.f18263h)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f18263h)) {
                        String strT = t();
                        this.f18263h = new c(new b(c(), e(), strT), strT);
                    }
                } finally {
                }
            }
        }
        return this.f18263h;
    }

    public String e() {
        return TextUtils.isEmpty(v()) ? String.format("track_manager_%s.db", BuildConfig.FLAVOR) : String.format("track_manager_%s.db", v());
    }

    public d f() {
        if (y.b(this.f18265j)) {
            this.f18265j = b().f18473h;
        }
        return this.f18265j;
    }

    public l g() {
        if (y.b(this.f18264i)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f18264i)) {
                        this.f18264i = new q(new g(d(), p()));
                    }
                } finally {
                }
            }
        }
        return this.f18264i;
    }

    public j h() {
        if (y.b(this.f18266k)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f18266k)) {
                        this.f18266k = new j();
                    }
                } finally {
                }
            }
        }
        return this.f18266k;
    }

    public int i() {
        if (b().f18466a < 0) {
            return 50;
        }
        return b().f18466a;
    }

    public int j() {
        return Math.max(b().f18470e, 0);
    }

    public int k() {
        if (b().f18469d <= 0) {
            return 2;
        }
        return b().f18469d;
    }

    public int l() {
        return Math.max(b().f18467b, 0);
    }

    public o m() {
        if (y.b(this.f18269n)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f18269n)) {
                        this.f18269n = new o(k(), n(), r(), q());
                    }
                } finally {
                }
            }
        }
        return this.f18269n;
    }

    public p n() {
        return b().f18472g;
    }

    public JSONObject o() {
        JSONObject jSONObject = this.f18260e;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f18260e = jSONObject2;
        return jSONObject2;
    }

    public s p() {
        if (y.b(this.f18267l)) {
            synchronized (k.class) {
                try {
                    if (y.b(this.f18267l)) {
                        this.f18267l = new s(this);
                    }
                } finally {
                }
            }
        }
        return this.f18267l;
    }

    public int q() {
        return b().f18468c;
    }

    public w r() {
        return b().f18474i;
    }

    public String s() {
        if (!TextUtils.isEmpty(f18255o)) {
            return f18255o;
        }
        String string = UUID.randomUUID().toString();
        f18255o = string;
        return string;
    }

    public String t() {
        return "event_table";
    }

    public m u() {
        return this.f18257b;
    }

    public String v() {
        return this.f18256a;
    }

    public boolean w() {
        return this.f18268m;
    }

    public String x() {
        if (!y.b(this.f18258c) && !y.b(this.f18259d)) {
            try {
                p().j();
                this.f18268m = false;
                if (TextUtils.isEmpty(f18255o)) {
                    f18255o = UUID.randomUUID().toString();
                }
                return f18255o;
            } catch (Exception e10) {
                if (a.f18222a) {
                    Log.e("TrackManager", "start error", e10);
                }
                this.f18268m = true;
            }
        }
        return "";
    }

    public void a(x xVar) {
        this.f18259d = xVar;
    }

    public void a(JSONObject jSONObject) {
        this.f18260e = jSONObject;
    }

    public boolean a(e eVar) {
        if (y.b(eVar)) {
            return false;
        }
        f fVar = b().f18475j;
        if (y.a(fVar)) {
            try {
                return fVar.a(eVar);
            } catch (Exception e10) {
                if (a.f18222a) {
                    Log.e("TrackManager", "event filter apply exception", e10);
                }
            }
        }
        String strG = eVar.g();
        if (TextUtils.isEmpty(strG)) {
            return false;
        }
        if (this.f18262g != null) {
            try {
                return !r0.contains(strG);
            } catch (Exception e11) {
                if (a.f18222a) {
                    Log.e("TrackManager", "disallowTrackEventNames contains exception", e11);
                }
            }
        }
        List<String> list = this.f18261f;
        if (list != null) {
            try {
                return list.contains(strG);
            } catch (Exception e12) {
                if (a.f18222a) {
                    Log.e("TrackManager", "allowTrackEventNames contains exception", e12);
                }
            }
        }
        return true;
    }

    public boolean a() throws IllegalStateException {
        if (!y.b(b())) {
            if (!y.b(f())) {
                if (!y.b(r())) {
                    if (!y.b(n()) && !y.b(n().b())) {
                        if (TextUtils.isEmpty(n().c())) {
                            throw new IllegalStateException("report url is null");
                        }
                        return true;
                    }
                    throw new IllegalStateException("networkStackConfig or stack can not be null");
                }
                throw new IllegalStateException("responseHandler can not be null");
            }
            throw new IllegalStateException("decorate can not be null");
        }
        throw new IllegalStateException("config can not be null");
    }
}
