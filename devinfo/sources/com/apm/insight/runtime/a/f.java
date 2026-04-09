package com.apm.insight.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile f f3441a;

    /* renamed from: b, reason: collision with root package name */
    private Context f3442b;

    /* renamed from: c, reason: collision with root package name */
    private Map<CrashType, c> f3443c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private b f3444d;

    /* renamed from: e, reason: collision with root package name */
    private d f3445e;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3446a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f3446a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3446a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3446a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3446a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3446a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3446a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3446a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3446a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(Context context) {
        this.f3442b = context;
        try {
            this.f3444d = b.d();
            this.f3445e = new d(this.f3442b);
        } catch (Throwable th2) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
        }
    }

    public static f a() {
        if (f3441a == null) {
            Context contextG = com.apm.insight.e.g();
            if (contextG == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f3441a = new f(contextG);
        }
        return f3441a;
    }

    private c a(CrashType crashType) {
        c jVar = this.f3443c.get(crashType);
        if (jVar != null) {
            return jVar;
        }
        switch (AnonymousClass1.f3446a[crashType.ordinal()]) {
            case 1:
                jVar = new j(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 2:
                jVar = new k(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 3:
                jVar = new l(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 4:
                jVar = new a(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 5:
                jVar = new h(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 6:
                jVar = new g(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 7:
                jVar = new e(this.f3442b, this.f3444d, this.f3445e);
                break;
            case 8:
                jVar = new i(this.f3442b, this.f3444d, this.f3445e);
                break;
        }
        if (jVar != null) {
            this.f3443c.put(crashType, jVar);
        }
        return jVar;
    }

    public final com.apm.insight.entity.a a(CrashType crashType, c.a aVar) {
        c cVarA;
        if (crashType == null || (cVarA = a(crashType)) == null) {
            return null;
        }
        return cVarA.a(null, aVar, true);
    }

    public final com.apm.insight.entity.a a(CrashType crashType, com.apm.insight.entity.a aVar) {
        c cVarA;
        return (crashType == null || (cVarA = a(crashType)) == null) ? aVar : cVarA.a(aVar, null, false);
    }

    public final com.apm.insight.entity.a a(List<com.apm.insight.entity.a> list, JSONArray jSONArray) throws JSONException {
        if (list.isEmpty()) {
            return null;
        }
        com.apm.insight.entity.a aVar = new com.apm.insight.entity.a();
        JSONArray jSONArray2 = new JSONArray();
        Iterator<com.apm.insight.entity.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray2.put(it.next().c());
        }
        aVar.a("data", (Object) jSONArray2);
        aVar.a("all_data", (Object) jSONArray);
        Header headerA = Header.a(this.f3442b);
        Header.a(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        Header.b(headerA);
        aVar.a(headerA);
        return aVar;
    }
}
