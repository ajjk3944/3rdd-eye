package g2;

import f2.s;
import g2.C5855e;
import mh.InterfaceC6835l;
import mh.r;

/* renamed from: g2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5856f extends s {

    /* renamed from: h, reason: collision with root package name */
    private final C5855e f47540h;

    /* renamed from: i, reason: collision with root package name */
    private final r f47541i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6835l f47542j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC6835l f47543k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6835l f47544l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6835l f47545m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f47546n;

    public C5856f(C5855e c5855e, String str, r rVar) {
        super(c5855e, str);
        this.f47540h = c5855e;
        this.f47541i = rVar;
    }

    @Override // f2.s
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C5855e.b b() {
        C5855e.b bVar = (C5855e.b) super.b();
        bVar.S(this.f47542j);
        bVar.T(this.f47543k);
        bVar.U(this.f47544l);
        bVar.V(this.f47545m);
        bVar.W(this.f47546n);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f2.s
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C5855e.b e() {
        return new C5855e.b(this.f47540h, this.f47541i);
    }

    public final void h(InterfaceC6835l interfaceC6835l) {
        this.f47542j = interfaceC6835l;
    }

    public final void i(InterfaceC6835l interfaceC6835l) {
        this.f47543k = interfaceC6835l;
    }

    public final void j(InterfaceC6835l interfaceC6835l) {
        this.f47544l = interfaceC6835l;
    }

    public final void k(InterfaceC6835l interfaceC6835l) {
        this.f47545m = interfaceC6835l;
    }

    public final void l(InterfaceC6835l interfaceC6835l) {
        this.f47546n = interfaceC6835l;
    }
}
