package u8;

import gg.AbstractC5912b;
import gg.i;
import gg.s;
import gg.t;
import gg.u;
import hg.InterfaceC6043c;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class d implements InterfaceC8140a {

    /* renamed from: a, reason: collision with root package name */
    private final Fg.a f62715a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5912b f62716b;

    /* renamed from: c, reason: collision with root package name */
    private final i f62717c;

    static final class a implements InterfaceC6469f {
        a() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            d.this.f62715a.h(Boolean.TRUE);
        }
    }

    public d() {
        Fg.a aVarK2 = Fg.a.k2(Boolean.FALSE);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f62715a = aVarK2;
        AbstractC5912b abstractC5912bF0 = s.o(new u() { // from class: u8.b
            @Override // gg.u
            public final void a(t tVar) {
                d.f(tVar);
            }
        }).G(new a()).A(new InterfaceC6464a() { // from class: u8.c
            @Override // kg.InterfaceC6464a
            public final void run() {
                d.g(this.f62714a);
            }
        }).r0().l1().M0(Gg.a.a()).f0();
        AbstractC6492s.h(abstractC5912bF0, "ignoreElements(...)");
        this.f62716b = abstractC5912bF0;
        i iVarI2 = aVarK2.e1().Y0(Gg.a.a(), false, 1).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f62717c = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(t tVar) {
        AbstractC6492s.i(tVar, "<unused var>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(d dVar) {
        dVar.f62715a.h(Boolean.FALSE);
    }

    @Override // u8.InterfaceC8140a
    public i a() {
        return this.f62717c;
    }

    @Override // u8.InterfaceC8140a
    public AbstractC5912b b() {
        return this.f62716b;
    }
}
