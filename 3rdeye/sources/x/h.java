package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatApi26Impl.java */
/* loaded from: classes.dex */
public class h extends g {

    /* compiled from: OutputConfigurationCompatApi26Impl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f47610a;

        /* renamed from: b, reason: collision with root package name */
        public String f47611b;

        /* renamed from: c, reason: collision with root package name */
        public long f47612c = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f47610a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f47610a, aVar.f47610a) && this.f47612c == aVar.f47612c && Objects.equals(this.f47611b, aVar.f47611b);
        }

        public final int hashCode() {
            int iHashCode = this.f47610a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            String str = this.f47611b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i;
            int i10 = (iHashCode2 << 5) - iHashCode2;
            long j4 = this.f47612c;
            return ((int) (j4 ^ (j4 >>> 32))) ^ i10;
        }
    }

    public h(int i, Surface surface) {
        super(new a(new OutputConfiguration(i, surface)));
    }

    @Override // x.k, x.f.a
    public final void c(Surface surface) {
        ((OutputConfiguration) i()).addSurface(surface);
    }

    @Override // x.g, x.k, x.f.a
    public void d(long j4) {
        ((a) this.f47615a).f47612c = j4;
    }

    @Override // x.g, x.k, x.f.a
    public String e() {
        return ((a) this.f47615a).f47611b;
    }

    @Override // x.g, x.k, x.f.a
    public final void f() {
        ((OutputConfiguration) i()).enableSurfaceSharing();
    }

    @Override // x.g, x.k, x.f.a
    public void g(String str) {
        ((a) this.f47615a).f47611b = str;
    }

    @Override // x.g, x.k, x.f.a
    public Object i() {
        Object obj = this.f47615a;
        A2.l.l(obj instanceof a);
        return ((a) obj).f47610a;
    }

    @Override // x.g, x.k
    public final boolean j() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }
}
