package Ii;

import mh.InterfaceC6835l;

/* renamed from: Ii.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3067m extends L0 {

    /* renamed from: Ii.m$a */
    public static final class a implements InterfaceC3067m {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC6835l f9342a;

        public a(InterfaceC6835l interfaceC6835l) {
            this.f9342a = interfaceC6835l;
        }

        @Override // Ii.InterfaceC3067m
        public void a(Throwable th2) {
            this.f9342a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + S.a(this.f9342a) + '@' + S.b(this) + ']';
        }
    }

    void a(Throwable th2);
}
