package de;

import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;

/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Nb.a f46042a;

    static final class a implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46043a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            Nb.c cVar = (Nb.c) c6556a.a();
            return Boolean.valueOf(cVar != null ? cVar.c() : false);
        }
    }

    public static final class b implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f46045b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f46046c;

        public b(String str, boolean z10) {
            this.f46045b = str;
            this.f46046c = z10;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                o.this.f46042a.d(this.f46045b, this.f46046c);
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    public o(Nb.a dao) {
        AbstractC6492s.i(dao, "dao");
        this.f46042a = dao;
    }

    @Override // de.n
    public gg.i a(String consoleId) {
        AbstractC6492s.i(consoleId, "consoleId");
        gg.i iVarW = this.f46042a.c(consoleId).F1(Gg.a.d()).X0(Gg.a.a()).N0(a.f46043a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        return iVarW;
    }

    @Override // de.n
    public AbstractC5912b b(String consoleId, boolean z10) {
        AbstractC6492s.i(consoleId, "consoleId");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new b(consoleId, z10));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bL = abstractC5912bR.W(Gg.a.d()).L(Gg.a.a());
        AbstractC6492s.h(abstractC5912bL, "observeOn(...)");
        return abstractC5912bL;
    }
}
