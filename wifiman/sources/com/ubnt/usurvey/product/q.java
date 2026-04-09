package com.ubnt.usurvey.product;

import Ii.N;
import Yg.J;
import Yg.v;
import bb.C4079a;
import com.ui.uidb.UiDB;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.util.Date;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    private final xa.o f40770a;

    /* renamed from: b, reason: collision with root package name */
    private final za.d f40771b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f40772a;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return q.this.new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f40772a;
            if (i10 == 0) {
                v.b(obj);
                za.d dVar = q.this.f40771b;
                this.f40772a = 1;
                obj = dVar.c(this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return new C6556a(obj);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f40774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f40775b;

        static final class a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiDB.c f40776a;

            a(UiDB.c cVar) {
                this.f40776a = cVar;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                C4079a.C1151a c1151aC;
                AbstractC6492s.i(it, "it");
                UiDB.c cVar = this.f40776a;
                Z7.b.h("UiDB Sync scheduled since the last sync was at " + ((cVar == null || (c1151aC = cVar.c()) == null) ? null : new Date(c1151aC.a())), null, 2, null);
            }
        }

        /* renamed from: com.ubnt.usurvey.product.q$b$b, reason: collision with other inner class name */
        public static final class C1258b implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiDB.c f40777a;

            public C1258b(UiDB.c cVar) {
                this.f40777a = cVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    Z7.b.h("UiDB Sync not necessary since the latest sync was at " + new Date(this.f40777a.c().a()), null, 2, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        b(long j10, q qVar) {
            this.f40774a = j10;
            this.f40775b = qVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            UiDB.c cVar = (UiDB.c) c6556a.a();
            if (cVar == null || cVar.c().a() < System.currentTimeMillis() - this.f40774a) {
                return this.f40775b.f40770a.a().B(new a(cVar));
            }
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new C1258b(cVar));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR;
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f40778a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            Z7.b.j("UiDB Sync failed", it, null, 4, null);
        }
    }

    public q(xa.o catalog, za.d uiDBSnapshotStorage) {
        AbstractC6492s.i(catalog, "catalog");
        AbstractC6492s.i(uiDBSnapshotStorage, "uiDBSnapshotStorage");
        this.f40770a = catalog;
        this.f40771b = uiDBSnapshotStorage;
    }

    @Override // com.ubnt.usurvey.product.p
    public AbstractC5912b a(boolean z10, long j10) {
        AbstractC5912b abstractC5912bZ = (z10 ? this.f40770a.a() : Qi.l.c(null, new a(null), 1, null).t(new b(j10, this))).z(c.f40778a);
        AbstractC6492s.h(abstractC5912bZ, "doOnError(...)");
        return abstractC5912bZ;
    }
}
