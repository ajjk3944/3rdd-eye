package vc;

import gg.AbstractC5912b;
import gg.s;
import gg.t;
import gg.u;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: vc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8212e implements InterfaceC8209b, InterfaceC8208a {

    /* renamed from: a, reason: collision with root package name */
    private final Hg.d f63543a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5912b f63544b;

    /* renamed from: c, reason: collision with root package name */
    private final s f63545c;

    /* renamed from: vc.e$a */
    static final class a implements InterfaceC6469f {
        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("SCREEN FORCED ON state - true", null, 2, null);
            C8212e.this.f63543a.h(Boolean.TRUE);
        }
    }

    public C8212e() {
        Hg.d dVarI1 = Hg.a.l1(Boolean.FALSE).i1();
        AbstractC6492s.h(dVarI1, "toSerialized(...)");
        this.f63543a = dVarI1;
        AbstractC5912b abstractC5912bF0 = s.o(new u() { // from class: vc.c
            @Override // gg.u
            public final void a(t tVar) {
                C8212e.f(tVar);
            }
        }).G(new a()).A(new InterfaceC6464a() { // from class: vc.d
            @Override // kg.InterfaceC6464a
            public final void run() {
                C8212e.g(this.f63542a);
            }
        }).x0(1).l1().f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f63544b = abstractC5912bF0;
        s sVarL1 = dVarI1.o0(Gg.a.a()).x0(1).l1();
        AbstractC6492s.h(sVarL1, "refCount(...)");
        this.f63545c = sVarL1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(t it) {
        AbstractC6492s.i(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C8212e c8212e) {
        Z7.b.h("SCREEN FORCED ON state - false", null, 2, null);
        c8212e.f63543a.h(Boolean.FALSE);
    }

    @Override // vc.InterfaceC8209b
    public AbstractC5912b a() {
        return this.f63544b;
    }

    @Override // vc.InterfaceC8208a
    public s b() {
        return this.f63545c;
    }
}
