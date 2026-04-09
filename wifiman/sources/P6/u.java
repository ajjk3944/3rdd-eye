package P6;

import gg.InterfaceC5910A;

/* loaded from: classes3.dex */
public abstract class u {

    class a extends Cg.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5910A f18112b;

        a(InterfaceC5910A interfaceC5910A) {
            this.f18112b = interfaceC5910A;
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f18112b.c(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f18112b.onSuccess(obj);
        }
    }

    class b extends Cg.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gg.t f18113b;

        b(gg.t tVar) {
            this.f18113b = tVar;
        }

        @Override // gg.x
        public void a() {
            this.f18113b.a();
        }

        @Override // gg.x
        public void h(Object obj) {
            this.f18113b.h(obj);
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            this.f18113b.c(th2);
        }
    }

    class c extends Cg.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ gg.t f18114b;

        c(gg.t tVar) {
            this.f18114b = tVar;
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f18114b.c(th2);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f18114b.h(obj);
            this.f18114b.a();
        }
    }

    public static Cg.a a(gg.t tVar) {
        return new b(tVar);
    }

    public static Cg.b b(gg.t tVar) {
        return new c(tVar);
    }

    public static Cg.b c(InterfaceC5910A interfaceC5910A) {
        return new a(interfaceC5910A);
    }
}
