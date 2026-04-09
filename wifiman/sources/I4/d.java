package I4;

import N4.F;
import N4.G;
import f5.InterfaceC5535a;
import f5.InterfaceC5536b;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class d implements I4.a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f8610c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5535a f8611a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f8612b = new AtomicReference(null);

    private static final class b implements h {
        private b() {
        }

        @Override // I4.h
        public File a() {
            return null;
        }

        @Override // I4.h
        public File b() {
            return null;
        }

        @Override // I4.h
        public File c() {
            return null;
        }

        @Override // I4.h
        public F.a d() {
            return null;
        }

        @Override // I4.h
        public File e() {
            return null;
        }

        @Override // I4.h
        public File f() {
            return null;
        }

        @Override // I4.h
        public File g() {
            return null;
        }
    }

    public d(InterfaceC5535a interfaceC5535a) {
        this.f8611a = interfaceC5535a;
        interfaceC5535a.a(new InterfaceC5535a.InterfaceC1759a() { // from class: I4.b
            @Override // f5.InterfaceC5535a.InterfaceC1759a
            public final void a(InterfaceC5536b interfaceC5536b) {
                this.f8605a.g(interfaceC5536b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(InterfaceC5536b interfaceC5536b) {
        g.f().b("Crashlytics native component now available.");
        this.f8612b.set((I4.a) interfaceC5536b.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j10, G g10, InterfaceC5536b interfaceC5536b) {
        ((I4.a) interfaceC5536b.get()).d(str, str2, j10, g10);
    }

    @Override // I4.a
    public h a(String str) {
        I4.a aVar = (I4.a) this.f8612b.get();
        return aVar == null ? f8610c : aVar.a(str);
    }

    @Override // I4.a
    public boolean b() {
        I4.a aVar = (I4.a) this.f8612b.get();
        return aVar != null && aVar.b();
    }

    @Override // I4.a
    public boolean c(String str) {
        I4.a aVar = (I4.a) this.f8612b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // I4.a
    public void d(final String str, final String str2, final long j10, final G g10) {
        g.f().i("Deferring native open session: " + str);
        this.f8611a.a(new InterfaceC5535a.InterfaceC1759a() { // from class: I4.c
            @Override // f5.InterfaceC5535a.InterfaceC1759a
            public final void a(InterfaceC5536b interfaceC5536b) {
                d.h(str, str2, j10, g10, interfaceC5536b);
            }
        });
    }
}
