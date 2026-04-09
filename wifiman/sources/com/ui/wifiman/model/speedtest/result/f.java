package com.ui.wifiman.model.speedtest.result;

import Yg.s;
import Zg.AbstractC3689v;
import b8.EnumC4076c;
import com.ui.wifiman.model.speedtest.result.b;
import com.ui.wifiman.model.speedtest.result.d;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import gg.i;
import gg.m;
import gg.y;
import gg.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kg.InterfaceC6465b;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import wa.InterfaceC8290a;
import xa.o;

/* loaded from: classes4.dex */
public final class f implements com.ui.wifiman.model.speedtest.result.e, com.ui.wifiman.model.speedtest.result.d {

    /* renamed from: a, reason: collision with root package name */
    private final Xb.e f43160a;

    /* renamed from: b, reason: collision with root package name */
    private final o f43161b;

    /* renamed from: c, reason: collision with root package name */
    private final y f43162c;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43163a;

        static {
            int[] iArr = new int[EnumC4076c.values().length];
            try {
                iArr[EnumC4076c.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f43163a = iArr;
        }
    }

    public static final class b implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long[] f43165b;

        public b(long[] jArr) {
            this.f43165b = jArr;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Xb.e eVar = f.this.f43160a;
                long[] jArr = this.f43165b;
                eVar.g(Arrays.copyOf(jArr, jArr.length));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class c implements InterfaceC6465b {
        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List results, InterfaceC8290a catalog) {
            AbstractC6492s.i(results, "results");
            AbstractC6492s.i(catalog, "catalog");
            Xb.d dVar = (Xb.d) AbstractC3689v.t0(results, 0);
            return new C6556a(dVar != null ? f.this.l(dVar, catalog) : null);
        }
    }

    static final class d implements m {
        d() {
        }

        @Override // gg.m
        public final Dj.a a(i resultsStream) {
            AbstractC6492s.i(resultsStream, "resultsStream");
            return Ag.c.f753a.a(resultsStream, f.this.f43161b.b());
        }
    }

    static final class e implements n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            Object objA = sVar.a();
            AbstractC6492s.h(objA, "component1(...)");
            InterfaceC8290a interfaceC8290a = (InterfaceC8290a) sVar.c();
            List list = (List) objA;
            f fVar = f.this;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fVar.l((Xb.d) it.next(), interfaceC8290a));
            }
            return arrayList;
        }
    }

    /* renamed from: com.ui.wifiman.model.speedtest.result.f$f, reason: collision with other inner class name */
    static final class C1436f implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f43170b;

        /* renamed from: com.ui.wifiman.model.speedtest.result.f$f$a */
        public static final class a implements C {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f43171a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f43172b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC8290a f43173c;

            public a(f fVar, com.ui.wifiman.model.speedtest.result.b bVar, InterfaceC8290a interfaceC8290a) {
                this.f43171a = fVar;
                this.f43172b = bVar;
                this.f43173c = interfaceC8290a;
            }

            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                try {
                    f fVar = this.f43171a;
                    Xb.d dVarL = fVar.f43160a.l(this.f43171a.k(this.f43172b));
                    AbstractC6492s.f(this.f43173c);
                    interfaceC5910A.onSuccess(fVar.l(dVarL, this.f43173c));
                } catch (Throwable th2) {
                    interfaceC5910A.onError(th2);
                }
            }
        }

        C1436f(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f43170b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC8290a catalog) {
            AbstractC6492s.i(catalog, "catalog");
            z zVarI = z.i(new a(f.this, this.f43170b, catalog));
            AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
            return zVarI;
        }
    }

    public static final class g implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f43175b;

        public g(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f43175b = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(f.this.f43160a.p(f.this.k(this.f43175b))));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f43176a = new h();

        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Boolean success) {
            AbstractC6492s.i(success, "success");
            if (success.booleanValue()) {
                return AbstractC5912b.m();
            }
            throw new IllegalStateException("speedtest result not found");
        }
    }

    public f(Xb.e db2, o productCatalog) {
        AbstractC6492s.i(db2, "db");
        AbstractC6492s.i(productCatalog, "productCatalog");
        this.f43160a = db2;
        this.f43161b = productCatalog;
        y yVarD = Gg.a.d();
        AbstractC6492s.h(yVarD, "io(...)");
        this.f43162c = yVarD;
    }

    @Override // com.ui.wifiman.model.speedtest.result.e
    public z a(com.ui.wifiman.model.speedtest.result.b result) {
        AbstractC6492s.i(result, "result");
        z zVarE = this.f43161b.b().o0().s(new C1436f(result)).O(this.f43162c).E(Gg.a.a());
        AbstractC6492s.h(zVarE, "observeOn(...)");
        return zVarE;
    }

    @Override // com.ui.wifiman.model.speedtest.result.e
    public AbstractC5912b b(long... id2) {
        AbstractC6492s.i(id2, "id");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(id2));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(this.f43162c).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    @Override // com.ui.wifiman.model.speedtest.result.d
    public Xb.c c(b.c cVar, long j10) {
        return d.a.a(this, cVar, j10);
    }

    @Override // com.ui.wifiman.model.speedtest.result.d
    public b.c d(Xb.c cVar, InterfaceC8290a interfaceC8290a) {
        return d.a.d(this, cVar, interfaceC8290a);
    }

    @Override // com.ui.wifiman.model.speedtest.result.e
    public i e(EnumC4076c enumC4076c, String str, Integer num) {
        if ((enumC4076c == null ? -1 : a.f43163a[enumC4076c.ordinal()]) != 1) {
            str = null;
        }
        i iVarN0 = (enumC4076c == EnumC4076c.DISCONNECTED ? i.K0(AbstractC3689v.l()) : (enumC4076c == null || str == null || num == null) ? (str != null || num == null) ? enumC4076c != null ? this.f43160a.c(enumC4076c) : this.f43160a.a() : this.f43160a.b(num.intValue()) : this.f43160a.e(enumC4076c, str, num.intValue())).x(new d()).N0(new e());
        AbstractC6492s.h(iVarN0, "map(...)");
        return iVarN0;
    }

    @Override // com.ui.wifiman.model.speedtest.result.e
    public i f(long j10) {
        i iVarX0 = i.v(this.f43160a.k(j10), this.f43161b.b(), new c()).F1(this.f43162c).X0(Gg.a.a());
        AbstractC6492s.h(iVarX0, "observeOn(...)");
        return iVarX0;
    }

    @Override // com.ui.wifiman.model.speedtest.result.d
    public b.AbstractC1432b g(Xb.c cVar, InterfaceC8290a interfaceC8290a) {
        return d.a.c(this, cVar, interfaceC8290a);
    }

    @Override // com.ui.wifiman.model.speedtest.result.e
    public AbstractC5912b h(com.ui.wifiman.model.speedtest.result.b result) {
        AbstractC6492s.i(result, "result");
        z zVarI = z.i(new g(result));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = zVarI.t(h.f43176a).W(this.f43162c).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }

    public Xb.d k(com.ui.wifiman.model.speedtest.result.b bVar) {
        return d.a.b(this, bVar);
    }

    public com.ui.wifiman.model.speedtest.result.b l(Xb.d dVar, InterfaceC8290a interfaceC8290a) {
        return d.a.m(this, dVar, interfaceC8290a);
    }
}
