package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* compiled from: OutputConfigurationCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final k f47605a;

    /* compiled from: OutputConfigurationCompat.java */
    public interface a {
        Surface a();

        void b(long j4);

        void c(Surface surface);

        void d(long j4);

        String e();

        void f();

        void g(String str);

        void h(int i);

        Object i();
    }

    public f(int i, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f47605a = new j(i, surface);
            return;
        }
        if (i10 >= 28) {
            this.f47605a = new i(i, surface);
            return;
        }
        if (i10 >= 26) {
            this.f47605a = new h(i, surface);
        } else if (i10 >= 24) {
            this.f47605a = new g(i, surface);
        } else {
            this.f47605a = new k(surface);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f47605a.equals(((f) obj).f47605a);
    }

    public final int hashCode() {
        return this.f47605a.f47615a.hashCode();
    }

    public f(OutputConfiguration outputConfiguration) {
        this.f47605a = new j(outputConfiguration);
    }

    public f(g gVar) {
        this.f47605a = gVar;
    }
}
