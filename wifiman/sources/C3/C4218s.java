package c3;

import a3.AbstractC3755c;
import a3.C3754b;
import a3.InterfaceC3759g;
import a3.InterfaceC3760h;

/* renamed from: c3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4218s implements InterfaceC3760h {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4215p f33819a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33820b;

    /* renamed from: c, reason: collision with root package name */
    private final C3754b f33821c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3759g f33822d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC4219t f33823e;

    C4218s(AbstractC4215p abstractC4215p, String str, C3754b c3754b, InterfaceC3759g interfaceC3759g, InterfaceC4219t interfaceC4219t) {
        this.f33819a = abstractC4215p;
        this.f33820b = str;
        this.f33821c = c3754b;
        this.f33822d = interfaceC3759g;
        this.f33823e = interfaceC4219t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }

    @Override // a3.InterfaceC3760h
    public void a(AbstractC3755c abstractC3755c, a3.j jVar) {
        this.f33823e.a(AbstractC4214o.a().e(this.f33819a).c(abstractC3755c).f(this.f33820b).d(this.f33822d).b(this.f33821c).a(), jVar);
    }

    @Override // a3.InterfaceC3760h
    public void b(AbstractC3755c abstractC3755c) {
        a(abstractC3755c, new a3.j() { // from class: c3.r
            @Override // a3.j
            public final void a(Exception exc) {
                C4218s.e(exc);
            }
        });
    }

    AbstractC4215p d() {
        return this.f33819a;
    }
}
