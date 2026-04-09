package og;

import gg.x;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* loaded from: classes4.dex */
public final class h implements x, InterfaceC6043c {

    /* renamed from: a, reason: collision with root package name */
    final x f55694a;

    /* renamed from: b, reason: collision with root package name */
    final InterfaceC6469f f55695b;

    /* renamed from: c, reason: collision with root package name */
    final InterfaceC6464a f55696c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC6043c f55697d;

    public h(x xVar, InterfaceC6469f interfaceC6469f, InterfaceC6464a interfaceC6464a) {
        this.f55694a = xVar;
        this.f55695b = interfaceC6469f;
        this.f55696c = interfaceC6464a;
    }

    @Override // gg.x
    public void a() {
        InterfaceC6043c interfaceC6043c = this.f55697d;
        EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
        if (interfaceC6043c != enumC6592b) {
            this.f55697d = enumC6592b;
            this.f55694a.a();
        }
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        try {
            this.f55695b.accept(interfaceC6043c);
            if (EnumC6592b.validate(this.f55697d, interfaceC6043c)) {
                this.f55697d = interfaceC6043c;
                this.f55694a.c(this);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            interfaceC6043c.dispose();
            this.f55697d = EnumC6592b.DISPOSED;
            EnumC6593c.error(th2, this.f55694a);
        }
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
        InterfaceC6043c interfaceC6043c = this.f55697d;
        EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
        if (interfaceC6043c != enumC6592b) {
            this.f55697d = enumC6592b;
            try {
                this.f55696c.run();
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                Eg.a.v(th2);
            }
            interfaceC6043c.dispose();
        }
    }

    @Override // gg.x
    public void h(Object obj) {
        this.f55694a.h(obj);
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return this.f55697d.isDisposed();
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        InterfaceC6043c interfaceC6043c = this.f55697d;
        EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
        if (interfaceC6043c == enumC6592b) {
            Eg.a.v(th2);
        } else {
            this.f55697d = enumC6592b;
            this.f55694a.onError(th2);
        }
    }
}
