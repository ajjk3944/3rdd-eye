package M4;

import com.google.ar.core.ImageMetadata;
import java.io.File;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final b f12505c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Q4.g f12506a;

    /* renamed from: b, reason: collision with root package name */
    private d f12507b;

    private static final class b implements d {
        private b() {
        }

        @Override // M4.d
        public void a() {
        }

        @Override // M4.d
        public String b() {
            return null;
        }

        @Override // M4.d
        public byte[] c() {
            return null;
        }

        @Override // M4.d
        public void d() {
        }

        @Override // M4.d
        public void e(long j10, String str) {
        }
    }

    public f(Q4.g gVar) {
        this.f12506a = gVar;
        this.f12507b = f12505c;
    }

    private File d(String str) {
        return this.f12506a.q(str, "userlog");
    }

    public void a() {
        this.f12507b.d();
    }

    public byte[] b() {
        return this.f12507b.c();
    }

    public String c() {
        return this.f12507b.b();
    }

    public final void e(String str) {
        this.f12507b.a();
        this.f12507b = f12505c;
        if (str == null) {
            return;
        }
        f(d(str), ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    void f(File file, int i10) {
        this.f12507b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f12507b.e(j10, str);
    }

    public f(Q4.g gVar, String str) {
        this(gVar);
        e(str);
    }
}
