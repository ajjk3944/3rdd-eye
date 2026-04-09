package com.ui.wifiman.model.wmw;

import Zg.AbstractC3689v;
import cc.C4237a;
import cc.InterfaceC4238b;
import com.ui.wifiman.model.wmw.b;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import h9.C5969a;
import java.util.List;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class c implements b.d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f44102c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4238b f44103a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f44104b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f44105a = new b();

        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(AbstractC3689v.s0(it));
        }
    }

    /* renamed from: com.ui.wifiman.model.wmw.c$c, reason: collision with other inner class name */
    static final class C1532c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1532c f44106a = new C1532c();

        C1532c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ui.wifiman.model.wmw.b apply(C6556a c6556a) {
            com.ui.wifiman.model.wmw.b c1527b;
            AbstractC6492s.i(c6556a, "<destruct>");
            C4237a c4237a = (C4237a) c6556a.a();
            if (c4237a == null) {
                return b.C1528b.f44090a;
            }
            int iD = c4237a.d();
            if (iD == 0) {
                C5969a c5969aE = C5969a.f48518b.e(c4237a.e());
                AbstractC6492s.f(c5969aE);
                c1527b = new b.a.C1527b(c4237a.f(), c5969aE);
            } else {
                if (iD != 1) {
                    throw new IllegalStateException("invalid adoption id " + c4237a.d());
                }
                C5969a c5969aE2 = C5969a.f48518b.e(c4237a.e());
                AbstractC6492s.f(c5969aE2);
                c1527b = new b.a.C1526a(c4237a.f(), c5969aE2);
            }
            return c1527b;
        }
    }

    public static final class d implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.wmw.b f44107a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f44108b;

        public d(com.ui.wifiman.model.wmw.b bVar, c cVar) {
            this.f44107a = bVar;
            this.f44108b = cVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                com.ui.wifiman.model.wmw.b bVar = this.f44107a;
                if (bVar instanceof b.C1528b) {
                    this.f44108b.f44103a.b(null);
                } else if (bVar instanceof b.a.C1526a) {
                    this.f44108b.f44103a.b(new C4237a(1, ((b.a.C1526a) this.f44107a).a().d(""), ((b.a.C1526a) this.f44107a).b(), null));
                } else {
                    if (!(bVar instanceof b.a.C1527b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f44108b.f44103a.b(new C4237a(0, ((b.a.C1527b) this.f44107a).a().d(""), ((b.a.C1527b) this.f44107a).b(), null));
                }
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public c(InterfaceC4238b dao) {
        AbstractC6492s.i(dao, "dao");
        this.f44103a = dao;
        gg.i iVarI2 = dao.a().X0(Gg.a.a()).N0(b.f44105a).N0(C1532c.f44106a).W().F1(Gg.a.d()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f44104b = iVarI2;
    }

    @Override // com.ui.wifiman.model.wmw.b.d
    public gg.i a() {
        return this.f44104b;
    }

    @Override // com.ui.wifiman.model.wmw.b.d
    public AbstractC5912b b(com.ui.wifiman.model.wmw.b adoption) {
        AbstractC6492s.i(adoption, "adoption");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new d(adoption, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }
}
