package Bh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class r extends AbstractC2510u {

    /* renamed from: a, reason: collision with root package name */
    private final w0 f1791a;

    public r(w0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        this.f1791a = delegate;
    }

    @Override // Bh.AbstractC2510u
    public w0 b() {
        return this.f1791a;
    }

    @Override // Bh.AbstractC2510u
    public String c() {
        return b().b();
    }

    @Override // Bh.AbstractC2510u
    public AbstractC2510u f() {
        AbstractC2510u abstractC2510uJ = AbstractC2509t.j(b().d());
        AbstractC6492s.h(abstractC2510uJ, "toDescriptorVisibility(...)");
        return abstractC2510uJ;
    }
}
