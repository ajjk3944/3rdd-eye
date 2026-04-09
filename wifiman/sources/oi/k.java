package oi;

import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f55737a = a.f55738a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f55738a = new a();

        private a() {
        }

        public final d a(Runnable runnable, InterfaceC6835l interfaceC6835l) {
            return (runnable == null || interfaceC6835l == null) ? new d(null, 1, null) : new c(runnable, interfaceC6835l);
        }
    }

    void lock();

    void unlock();
}
