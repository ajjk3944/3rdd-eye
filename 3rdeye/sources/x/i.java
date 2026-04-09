package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatApi28Impl.java */
/* loaded from: classes.dex */
public class i extends h {

    /* compiled from: OutputConfigurationCompatApi28Impl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f47613a;

        /* renamed from: b, reason: collision with root package name */
        public long f47614b = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f47613a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f47613a, aVar.f47613a) && this.f47614b == aVar.f47614b;
        }

        public final int hashCode() {
            int iHashCode = this.f47613a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            long j4 = this.f47614b;
            return ((int) (j4 ^ (j4 >>> 32))) ^ i;
        }
    }

    public i(int i, Surface surface) {
        super(new a(new OutputConfiguration(i, surface)));
    }

    @Override // x.h, x.g, x.k, x.f.a
    public void d(long j4) {
        ((a) this.f47615a).f47614b = j4;
    }

    @Override // x.h, x.g, x.k, x.f.a
    public final String e() {
        return null;
    }

    @Override // x.h, x.g, x.k, x.f.a
    public final void g(String str) {
        ((OutputConfiguration) i()).setPhysicalCameraId(str);
    }

    @Override // x.h, x.g, x.k, x.f.a
    public Object i() {
        Object obj = this.f47615a;
        A2.l.l(obj instanceof a);
        return ((a) obj).f47613a;
    }
}
