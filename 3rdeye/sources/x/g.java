package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatApi24Impl.java */
/* loaded from: classes.dex */
public class g extends k {

    /* compiled from: OutputConfigurationCompatApi24Impl.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final OutputConfiguration f47606a;

        /* renamed from: b, reason: collision with root package name */
        public String f47607b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f47608c;

        /* renamed from: d, reason: collision with root package name */
        public long f47609d = 1;

        public a(OutputConfiguration outputConfiguration) {
            this.f47606a = outputConfiguration;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f47606a, aVar.f47606a) && this.f47608c == aVar.f47608c && this.f47609d == aVar.f47609d && Objects.equals(this.f47607b, aVar.f47607b);
        }

        public final int hashCode() {
            int iHashCode = this.f47606a.hashCode() ^ 31;
            int i = (this.f47608c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i10 = (i << 5) - i;
            String str = this.f47607b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            int i11 = (iHashCode2 << 5) - iHashCode2;
            long j4 = this.f47609d;
            return ((int) (j4 ^ (j4 >>> 32))) ^ i11;
        }
    }

    public g(int i, Surface surface) {
        super(new a(new OutputConfiguration(i, surface)));
    }

    @Override // x.k, x.f.a
    public final Surface a() {
        return ((OutputConfiguration) i()).getSurface();
    }

    @Override // x.k, x.f.a
    public void d(long j4) {
        ((a) this.f47615a).f47609d = j4;
    }

    @Override // x.k, x.f.a
    public String e() {
        return ((a) this.f47615a).f47607b;
    }

    @Override // x.k, x.f.a
    public void f() {
        ((a) this.f47615a).f47608c = true;
    }

    @Override // x.k, x.f.a
    public void g(String str) {
        ((a) this.f47615a).f47607b = str;
    }

    @Override // x.k, x.f.a
    public Object i() {
        Object obj = this.f47615a;
        A2.l.l(obj instanceof a);
        return ((a) obj).f47606a;
    }

    @Override // x.k
    public boolean j() {
        return ((a) this.f47615a).f47608c;
    }
}
