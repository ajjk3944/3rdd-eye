package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class Ll implements Ml {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f39798k = Collections.unmodifiableMap(new Il());

    /* renamed from: a, reason: collision with root package name */
    public final List f39799a;

    /* renamed from: b, reason: collision with root package name */
    public final Gi f39800b;

    /* renamed from: c, reason: collision with root package name */
    public final Tl f39801c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f39802d;

    /* renamed from: e, reason: collision with root package name */
    public PublicLogger f39803e;

    /* renamed from: f, reason: collision with root package name */
    public final Jl f39804f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f39805g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f39806h;
    public HashMap i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39807j;

    public Ll(Context context, Gi gi, C4666hf c4666hf, Handler handler) {
        this(gi, new Tl(context, c4666hf), handler);
    }

    public final void a(StartupParamsCallback startupParamsCallback, List<String> list, Map<String, String> map) {
        synchronized (this.f39805g) {
            try {
                Tl tl = this.f39801c;
                tl.getClass();
                if (!AbstractC4623fo.a((Map) map) && !AbstractC4623fo.a(map, tl.f40202e)) {
                    tl.f40202e = new HashMap(map);
                    tl.f40204g = true;
                    tl.c();
                }
                a(startupParamsCallback, list);
                if (this.f39801c.a((List) list)) {
                    a(list, new Kl(this, startupParamsCallback), map);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:12:0x0085, B:14:0x00b4, B:15:0x00bb, B:17:0x00c1, B:18:0x00c8, B:20:0x00dd, B:23:0x00e8, B:24:0x00f4, B:21:0x00e2, B:11:0x0082), top: B:30:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Ll.b(android.os.Bundle):void");
    }

    public final S6 c() {
        return this.f39804f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f39801c.f40199b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final C4894qa e() {
        C4842oa c4842oa;
        Tl tl = this.f39801c;
        C4764la c4764la = tl.f40210n;
        C4790ma c4790ma = tl.f40209m;
        synchronized (c4790ma) {
            c4842oa = c4790ma.f41252b;
        }
        c4764la.getClass();
        Boolean bool = c4842oa.f41368a;
        return new C4894qa();
    }

    public final long f() {
        return this.f39801c.f40203f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f39801c.f40199b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f39806h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f39801c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.f39805g) {
            try {
                if (!this.f39807j || this.f39801c.b()) {
                    this.f39807j = true;
                    a(this.f39799a, this.f39804f, this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ll(Gi gi, Tl tl, Handler handler) {
        this.f39799a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f39805g = new Object();
        this.f39806h = new WeakHashMap();
        this.f39807j = false;
        this.f39800b = gi;
        this.f39801c = tl;
        this.f39802d = handler;
        this.f39804f = new Jl(this);
    }

    public final void a(Bundle bundle) {
        b(bundle, null);
    }

    public final void a(PublicLogger publicLogger) {
        this.f39803e = publicLogger;
    }

    public final void a(List list, S6 s62, Map map) {
        T6 t62 = new T6(this.f39802d, s62);
        Gi gi = this.f39800b;
        gi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C4895qb(t62, list, map));
        EnumC4997ub enumC4997ub = EnumC4997ub.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = O9.f39923a;
        C4681i4 c4681i4 = new C4681i4("", "", 1536, 0, anonymousInstance);
        c4681i4.f41055m = bundle;
        C4475a5 c4475a5 = gi.f39538a;
        gi.a(Gi.a(c4681i4, c4475a5), c4475a5, 1, null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC4623fo.a((Map) map)) {
            return;
        }
        synchronized (this.f39805g) {
            try {
                HashMap mapB = Dm.b(map);
                this.i = mapB;
                this.f39800b.a(mapB);
                Tl tl = this.f39801c;
                tl.getClass();
                if (!AbstractC4623fo.a((Map) mapB) && !AbstractC4623fo.a(mapB, tl.f40202e)) {
                    tl.f40202e = new HashMap(mapB);
                    tl.f40204g = true;
                    tl.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.f39805g) {
            this.f39800b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Gl gl;
        if (this.f39806h.containsKey(startupParamsCallback)) {
            List list = (List) this.f39806h.get(startupParamsCallback);
            if (this.f39801c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    gl = Gl.UNKNOWN;
                    if (i == 1) {
                        gl = Gl.NETWORK;
                    } else if (i == 2) {
                        gl = Gl.PARSE;
                    }
                } else {
                    gl = null;
                }
                if (gl == null) {
                    if (!this.f39801c.a()) {
                        PublicLogger publicLogger = this.f39803e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        gl = Gl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f39798k, gl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.f39806h.remove(startupParamsCallback);
            if (this.f39806h.isEmpty()) {
                C4780m0 c4780m0 = this.f39800b.f39541d;
                synchronized (c4780m0.f41228f) {
                    c4780m0.f41225c = false;
                    c4780m0.c();
                }
            }
        }
    }

    public final void b(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        synchronized (this.f39805g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.f39805g) {
            try {
                List list2 = this.f39801c.f40201d;
                if (AbstractC4623fo.a((Collection) list)) {
                    if (!AbstractC4623fo.a((Collection) list2)) {
                        Tl tl = this.f39801c;
                        tl.f40201d = null;
                        tl.i.a((List<String>) null);
                        this.f39800b.a((List) null);
                    }
                } else if (!AbstractC4623fo.a(list, list2)) {
                    Tl tl2 = this.f39801c;
                    tl2.f40201d = list;
                    tl2.i.a(list);
                    this.f39800b.a(list);
                } else {
                    this.f39800b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap map = new HashMap();
        Tl tl = this.f39801c;
        synchronized (tl) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) tl.f40199b.get(str);
                    if (identifiersResult != null) {
                        map.put(str, tl.f40200c.a(identifiersResult));
                    }
                }
                tl.f40208l.a(list, map);
                tl.f40209m.a(list, map);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(map);
    }

    public final void b(String str) {
        synchronized (this.f39805g) {
            this.f39800b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f39801c.f40199b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC5122zb.a(str);
        }
        return this.i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f39806h.isEmpty()) {
            C4780m0 c4780m0 = this.f39800b.f39541d;
            synchronized (c4780m0.f41228f) {
                c4780m0.f41225c = true;
                c4780m0.b();
            }
        }
        this.f39806h.put(startupParamsCallback, list);
    }

    public final AdvIdentifiersResult a() {
        Tl tl = this.f39801c;
        O o10 = tl.f40206j;
        IdentifiersResult identifiersResult = (IdentifiersResult) tl.f40199b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) tl.f40199b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) tl.f40199b.get("appmetrica_yandex_adv_id");
        o10.getClass();
        return new AdvIdentifiersResult(O.a(identifiersResult), O.a(identifiersResult2), O.a(identifiersResult3));
    }
}
