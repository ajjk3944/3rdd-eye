package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Tl {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f40198a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f40199b;

    /* renamed from: c, reason: collision with root package name */
    public final Ql f40200c;

    /* renamed from: d, reason: collision with root package name */
    public List f40201d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f40202e;

    /* renamed from: f, reason: collision with root package name */
    public long f40203f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40204g;

    /* renamed from: h, reason: collision with root package name */
    public long f40205h;
    public final C4666hf i;

    /* renamed from: j, reason: collision with root package name */
    public final O f40206j;

    /* renamed from: k, reason: collision with root package name */
    public final Y3 f40207k;

    /* renamed from: l, reason: collision with root package name */
    public final P6 f40208l;

    /* renamed from: m, reason: collision with root package name */
    public final C4790ma f40209m;

    /* renamed from: n, reason: collision with root package name */
    public final C4764la f40210n;

    /* renamed from: o, reason: collision with root package name */
    public final C4726jo f40211o;

    public Tl(Context context, C4666hf c4666hf) {
        this(c4666hf, new O(), new Y3(), C5065x4.l().a(context), new P6(), new C4790ma(), new C4764la(), new C4726jo());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set r0 = io.appmetrica.analytics.impl.Zl.f40487a     // Catch: java.lang.Throwable -> L3b
            r1 = r9
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.l.f(r1, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "other"
            kotlin.jvm.internal.l.f(r0, r2)     // Catch: java.lang.Throwable -> L3b
            java.util.Set r1 = c9.C2097r.K0(r1)     // Catch: java.lang.Throwable -> L3b
            java.util.Collection r0 = c9.C2095p.d0(r0)     // Catch: java.lang.Throwable -> L3b
            r1.retainAll(r0)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r8.a(r1)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L3b
        L23:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L3b
            java.util.HashSet r4 = r8.f40198a     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L23
            r9 = r3
            goto L3e
        L3b:
            r9 = move-exception
            goto L5a
        L3d:
            r9 = r2
        L3e:
            long r4 = r8.f40205h     // Catch: java.lang.Throwable -> L3b
            io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider r1 = io.appmetrica.analytics.impl.Zl.f40488b     // Catch: java.lang.Throwable -> L3b
            long r6 = r1.currentTimeSeconds()     // Catch: java.lang.Throwable -> L3b
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = r2
        L4d:
            if (r0 == 0) goto L57
            if (r9 != 0) goto L57
            if (r1 != 0) goto L57
            boolean r9 = r8.f40204g     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L58
        L57:
            r2 = r3
        L58:
            monitor-exit(r8)
            return r2
        L5a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.Tl.a(java.util.List):boolean");
    }

    public final void b(IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f40199b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            C4726jo c4726jo = this.f40211o;
            String str = identifiersResult.id;
            c4726jo.getClass();
            if (C4726jo.a(str)) {
                this.f40199b.put(StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(Arrays.asList("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        C4842oa c4842oa;
        C4666hf c4666hfD = this.i.i((IdentifiersResult) this.f40199b.get(StartupParamsCallback.APPMETRICA_UUID)).e((IdentifiersResult) this.f40199b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((IdentifiersResult) this.f40199b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((IdentifiersResult) this.f40199b.get("appmetrica_get_ad_url")).b((IdentifiersResult) this.f40199b.get("appmetrica_report_ad_url")).e(this.f40203f).h((IdentifiersResult) this.f40199b.get("appmetrica_clids")).j(Dm.a((Map) this.f40202e)).f((IdentifiersResult) this.f40199b.get("appmetrica_google_adv_id")).g((IdentifiersResult) this.f40199b.get("appmetrica_huawei_oaid")).j((IdentifiersResult) this.f40199b.get("appmetrica_yandex_adv_id")).b(this.f40204g).c(this.f40208l.f39962d).d(this.f40205h);
        C4790ma c4790ma = this.f40209m;
        synchronized (c4790ma) {
            c4842oa = c4790ma.f41252b;
        }
        c4666hfD.a(c4842oa).b();
    }

    public Tl(C4666hf c4666hf, O o10, Y3 y32, Id id, P6 p62, C4790ma c4790ma, C4764la c4764la, C4726jo c4726jo) {
        HashSet hashSet = new HashSet();
        this.f40198a = hashSet;
        this.f40199b = new HashMap();
        this.f40200c = new Ql();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.i = c4666hf;
        this.f40206j = o10;
        this.f40207k = y32;
        this.f40208l = p62;
        this.f40209m = c4790ma;
        this.f40210n = c4764la;
        this.f40211o = c4726jo;
        c(id.a());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID, c4666hf.j());
        a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, c4666hf.i());
        a("appmetrica_get_ad_url", c4666hf.d());
        a("appmetrica_report_ad_url", c4666hf.e());
        b(c4666hf.o());
        a("appmetrica_google_adv_id", c4666hf.l());
        a("appmetrica_huawei_oaid", c4666hf.m());
        a("appmetrica_yandex_adv_id", c4666hf.r());
        p62.a(c4666hf.h());
        c4790ma.a(c4666hf.k());
        this.f40201d = c4666hf.g();
        String strI = c4666hf.i((String) null);
        this.f40202e = strI != null ? Dm.a(strI) : null;
        this.f40204g = c4666hf.a(true);
        this.f40203f = c4666hf.b(0L);
        this.f40205h = c4666hf.n();
        c();
    }

    public final boolean a() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f40199b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return AbstractC4623fo.a((Map) this.f40202e);
        }
        return true;
    }

    public static boolean a(IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(String str, IdentifiersResult identifiersResult) {
        if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.f40199b.put(str, identifiersResult);
    }

    public final synchronized boolean a(Collection collection) {
        Boolean bool;
        String str;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) this.f40199b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (IdentifiersResult) this.f40208l.f39961c.get(str2);
                }
                if (identifiersResult == null) {
                    C4842oa c4842oa = this.f40209m.f41252b;
                    if (!kotlin.jvm.internal.l.b(str2, "appmetrica_lib_ssl_enabled") || (bool = c4842oa.f41368a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        IdentifierStatus identifierStatus = c4842oa.f41369b;
                        String str3 = c4842oa.f41370c;
                        if (zBooleanValue) {
                            str = "true";
                        } else if (!zBooleanValue) {
                            str = "false";
                        } else {
                            throw new b9.j();
                        }
                        identifiersResult = new IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f40204g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !AbstractC4623fo.a((Map) this.f40202e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
