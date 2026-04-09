package com.apm.insight.runtime.a;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.runtime.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile f f5226a;

    /* renamed from: b, reason: collision with root package name */
    private Context f5227b;

    /* renamed from: c, reason: collision with root package name */
    private Map<CrashType, c> f5228c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private b f5229d;

    /* renamed from: e, reason: collision with root package name */
    private d f5230e;

    /* renamed from: com.apm.insight.runtime.a.f$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5231a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f5231a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5231a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5231a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5231a[CrashType.ANR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5231a[CrashType.DART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5231a[CrashType.CUSTOM_JAVA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5231a[CrashType.BLOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5231a[CrashType.ENSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private f(@NonNull Context context) {
        this.f5227b = context;
        try {
            this.f5229d = b.d();
            this.f5230e = new d(this.f5227b);
        } catch (Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
        }
    }

    public static f a() {
        if (f5226a == null) {
            Context contextG = com.apm.insight.e.g();
            if (contextG == null) {
                throw new IllegalArgumentException("NpthBus not init");
            }
            f5226a = new f(contextG);
        }
        return f5226a;
    }

    @Nullable
    private c a(CrashType crashType) {
        c jVar = this.f5228c.get(crashType);
        if (jVar != null) {
            return jVar;
        }
        switch (AnonymousClass1.f5231a[crashType.ordinal()]) {
            case 1:
                jVar = new j(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 2:
                jVar = new k(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 3:
                jVar = new l(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 4:
                jVar = new a(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 5:
                jVar = new h(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 6:
                jVar = new g(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 7:
                jVar = new e(this.f5227b, this.f5229d, this.f5230e);
                break;
            case 8:
                jVar = new i(this.f5227b, this.f5229d, this.f5230e);
                break;
        }
        if (jVar != null) {
            this.f5228c.put(crashType, jVar);
        }
        return jVar;
    }

    public final com.apm.insight.entity.a a(CrashType crashType, @Nullable c.a aVar) {
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
        Header headerA = Header.a(this.f5227b);
        Header.a(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        Header.b(headerA);
        aVar.a(headerA);
        return aVar;
    }
}
