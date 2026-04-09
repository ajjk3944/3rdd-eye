package Dh;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface I {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3352a = a.f3353a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3353a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Bh.F f3354b = new Bh.F("PackageViewDescriptorFactory");

        private a() {
        }

        public final Bh.F a() {
            return f3354b;
        }
    }

    public static final class b implements I {

        /* renamed from: b, reason: collision with root package name */
        public static final b f3355b = new b();

        private b() {
        }

        @Override // Dh.I
        public Bh.U a(F module, Zh.c fqName, oi.n storageManager) {
            AbstractC6492s.i(module, "module");
            AbstractC6492s.i(fqName, "fqName");
            AbstractC6492s.i(storageManager, "storageManager");
            return new C2617x(module, fqName, storageManager);
        }
    }

    Bh.U a(F f10, Zh.c cVar, oi.n nVar);
}
