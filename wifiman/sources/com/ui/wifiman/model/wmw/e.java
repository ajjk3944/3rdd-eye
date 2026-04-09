package com.ui.wifiman.model.wmw;

import Yg.s;
import Zg.AbstractC3689v;
import com.ubnt.usurvey.product.l;
import com.ui.wifiman.model.wmw.b;
import com.ui.wifiman.model.wmw.d;
import com.ui.wifiman.model.wmw.e;
import java.util.HashSet;
import java.util.Set;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6835l;
import wc.C8321a;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public final class e implements com.ui.wifiman.model.wmw.d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f44113b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f44114a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set apply(s sVar) {
            AbstractC6492s.i(sVar, "<destruct>");
            com.ui.wifiman.model.wmw.b bVar = (com.ui.wifiman.model.wmw.b) sVar.a();
            Set<C8321a> set = (Set) sVar.c();
            HashSet hashSet = new HashSet();
            long jCurrentTimeMillis = System.currentTimeMillis();
            e eVar = e.this;
            for (C8321a c8321a : set) {
                InterfaceC8439a.d dVarJ = c8321a.j();
                if ((dVarJ != null ? (l) dVarJ.N() : null) == l.WM_W_d64 && jCurrentTimeMillis - c8321a.g() < 15000) {
                    hashSet.add(new d.a(c8321a.h(), c8321a.d(), c8321a.i(), eVar.d(c8321a, bVar)));
                }
            }
            return hashSet;
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44116a = new c();

        c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("WMW Discovery SUBSCRIBED", null, 2, null);
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44117a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence c(d.a it) {
            AbstractC6492s.i(it, "it");
            return it.b().d(":") + it.c();
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void accept(Set it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("WMW Discovery results " + it.size() + ": " + AbstractC3689v.z0(it, ",", null, null, 0, null, new InterfaceC6835l() { // from class: com.ui.wifiman.model.wmw.f
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return e.d.c((d.a) obj);
                }
            }, 30, null), null, 2, null);
        }
    }

    public e(wc.h bleScanner, b.d adoptionManager) {
        AbstractC6492s.i(bleScanner, "bleScanner");
        AbstractC6492s.i(adoptionManager, "adoptionManager");
        gg.i iVarI2 = Ag.c.f753a.a(adoptionManager.a(), bleScanner.a(wc.f.BLE)).e1().N0(new b()).W().g0(c.f44116a).Z(new InterfaceC6464a() { // from class: qe.j
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.wmw.e.e();
            }
        }).f0(d.f44117a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f44114a = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.a.EnumC1533a d(C8321a c8321a, com.ui.wifiman.model.wmw.b bVar) {
        return ((bVar instanceof b.a) && AbstractC6492s.d(((b.a) bVar).a(), c8321a.h())) ? d.a.EnumC1533a.ADOPTED : (c8321a.i() == null || !t.m0(c8321a.i())) ? d.a.EnumC1533a.FREE : d.a.EnumC1533a.ADOPTED_BY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        Z7.b.h("WMW Discovery FINISHED", null, 2, null);
    }

    @Override // com.ui.wifiman.model.wmw.d
    public gg.i a() {
        return this.f44114a;
    }
}
