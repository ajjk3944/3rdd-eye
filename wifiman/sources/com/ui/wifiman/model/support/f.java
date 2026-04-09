package com.ui.wifiman.model.support;

import Yg.s;
import Zg.AbstractC3689v;
import Zg.U;
import android.content.Context;
import android.os.Build;
import ch.AbstractC4260a;
import com.ui.wifiman.model.support.SupportManager;
import com.ui.wifiman.model.support.a;
import com.ui.wifiman.support.UiSupport;
import dc.C5341a;
import ed.InterfaceC5453a;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.z;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class f implements SupportManager, com.ui.wifiman.model.support.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f43187a;

    /* renamed from: b, reason: collision with root package name */
    private final C5341a f43188b;

    /* renamed from: c, reason: collision with root package name */
    private final UiSupport f43189c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentHashMap f43190d;

    /* renamed from: e, reason: collision with root package name */
    private String f43191e;

    public static final class a implements C {
        public a() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(AbstractC3689v.z0(AbstractC3689v.o("", "", "===============", "App Version: " + f.this.f43188b.d() + "(" + f.this.f43188b.c() + ")", "OS Version: " + Build.VERSION.RELEASE, "Api level: " + Build.VERSION.SDK_INT, "Device: " + Build.BRAND + "; " + Build.MODEL + "; " + Build.DEVICE), "\n", null, null, 0, null, null, 62, null));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class b implements C {
        public b() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                UiSupport uiSupport = f.this.f43189c;
                Context context = f.this.f43187a;
                String str = f.this.f43191e;
                ConcurrentHashMap concurrentHashMap = f.this.f43190d;
                ArrayList arrayList = new ArrayList(concurrentHashMap.size());
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(f.this.r((a.AbstractC1437a) ((Map.Entry) it.next()).getValue()));
                }
                interfaceC5910A.onSuccess(uiSupport.e(context, str, AbstractC3689v.X0(arrayList, new d())));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f43194a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return z.p(new SupportManager.Error.SupportFileCreationError(it));
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC4260a.e(((UiSupport.b) obj).b(), ((UiSupport.b) obj2).b());
        }
    }

    public f(Context appContext, C5341a buildConfig) {
        AbstractC6492s.i(appContext, "appContext");
        AbstractC6492s.i(buildConfig, "buildConfig");
        this.f43187a = appContext;
        this.f43188b = buildConfig;
        this.f43189c = new UiSupport();
        this.f43190d = new ConcurrentHashMap();
    }

    private final UiSupport.b j(a.AbstractC1437a.C1438a c1438a) {
        return new UiSupport.b("APP SETTINGS", U.e(Yg.z.a("settings", c1438a.b().toString())));
    }

    private final UiSupport.b k(a.AbstractC1437a.b bVar) {
        Set<InterfaceC5453a.C1742a> setB = bVar.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(setB, 10)), 16));
        for (InterfaceC5453a.C1742a c1742a : setB) {
            s sVarA = Yg.z.a(c1742a.a(), c1742a.b().toString());
            linkedHashMap.put(sVarA.h(), sVarA.j());
        }
        return new UiSupport.b("ARP NEIGHBORS", linkedHashMap);
    }

    private final UiSupport.b l(a.AbstractC1437a.c cVar) {
        return new UiSupport.b("SESSION", U.e(Yg.z.a("id", cVar.b().a())));
    }

    private final UiSupport.b m(a.AbstractC1437a.d dVar) {
        return new UiSupport.b("NETWORK CONNECTION", U.e(Yg.z.a("state", dVar.b().toString())));
    }

    private final UiSupport.b n(com.ui.wifiman.model.support.b bVar) {
        return new UiSupport.b("Unifi Api Available", U.e(Yg.z.a("available", String.valueOf(bVar.b()))));
    }

    private final UiSupport.b o(com.ui.wifiman.model.support.c cVar) {
        return new UiSupport.b("Unifi Api Device Info", U.e(Yg.z.a("state", cVar.b().toString())));
    }

    private final UiSupport.b p(com.ui.wifiman.model.support.d dVar) {
        return new UiSupport.b("Unifi Api Device Neighbors", U.e(Yg.z.a("neig", dVar.b().toString())));
    }

    private final UiSupport.b q(e eVar) {
        return new UiSupport.b("Unifi Api Params", U.e(Yg.z.a("params", eVar.b().toString())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiSupport.b r(a.AbstractC1437a abstractC1437a) {
        if (abstractC1437a instanceof a.AbstractC1437a.c) {
            return l((a.AbstractC1437a.c) abstractC1437a);
        }
        if (abstractC1437a instanceof a.AbstractC1437a.d) {
            return m((a.AbstractC1437a.d) abstractC1437a);
        }
        if (abstractC1437a instanceof a.AbstractC1437a.b) {
            return k((a.AbstractC1437a.b) abstractC1437a);
        }
        if (abstractC1437a instanceof a.AbstractC1437a.C1438a) {
            return j((a.AbstractC1437a.C1438a) abstractC1437a);
        }
        if (abstractC1437a instanceof com.ui.wifiman.model.support.b) {
            return n((com.ui.wifiman.model.support.b) abstractC1437a);
        }
        if (abstractC1437a instanceof e) {
            return q((e) abstractC1437a);
        }
        if (abstractC1437a instanceof com.ui.wifiman.model.support.c) {
            return o((com.ui.wifiman.model.support.c) abstractC1437a);
        }
        if (abstractC1437a instanceof com.ui.wifiman.model.support.d) {
            return p((com.ui.wifiman.model.support.d) abstractC1437a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.ui.wifiman.model.support.SupportManager
    public z a() {
        z zVarI = z.i(new b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarF = zVarI.F(c.f43194a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }

    @Override // com.ui.wifiman.model.support.a
    public void b(a.AbstractC1437a data) {
        AbstractC6492s.i(data, "data");
        if (!(data instanceof a.AbstractC1437a.C1438a) && !(data instanceof a.AbstractC1437a.b) && !(data instanceof a.AbstractC1437a.d) && !(data instanceof com.ui.wifiman.model.support.b) && !(data instanceof e) && !(data instanceof com.ui.wifiman.model.support.c) && !(data instanceof com.ui.wifiman.model.support.d)) {
            if (!(data instanceof a.AbstractC1437a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f43191e = ((a.AbstractC1437a.c) data).b().a();
        }
        this.f43190d.put(data.a(), data);
    }

    @Override // com.ui.wifiman.model.support.SupportManager
    public z c() {
        z zVarI = z.i(new a());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }
}
