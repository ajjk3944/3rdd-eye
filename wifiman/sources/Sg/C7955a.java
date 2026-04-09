package sg;

import gg.InterfaceC5914d;
import gg.s;
import gg.v;
import gg.x;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;

/* renamed from: sg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7955a extends s {

    /* renamed from: a, reason: collision with root package name */
    final gg.f f61496a;

    /* renamed from: b, reason: collision with root package name */
    final v f61497b;

    /* renamed from: sg.a$a, reason: collision with other inner class name */
    static final class C2155a extends AtomicReference implements x, InterfaceC5914d, InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final x f61498a;

        /* renamed from: b, reason: collision with root package name */
        v f61499b;

        C2155a(x xVar, v vVar) {
            this.f61499b = vVar;
            this.f61498a = xVar;
        }

        @Override // gg.x
        public void a() {
            v vVar = this.f61499b;
            if (vVar == null) {
                this.f61498a.a();
            } else {
                this.f61499b = null;
                vVar.d(this);
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.replace(this, interfaceC6043c);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f61498a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return EnumC6592b.isDisposed((InterfaceC6043c) get());
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f61498a.onError(th2);
        }
    }

    public C7955a(gg.f fVar, v vVar) {
        this.f61496a = fVar;
        this.f61497b = vVar;
    }

    @Override // gg.s
    protected void L0(x xVar) {
        C2155a c2155a = new C2155a(xVar, this.f61497b);
        xVar.c(c2155a);
        this.f61496a.e(c2155a);
    }
}
