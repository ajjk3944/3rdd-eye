package G6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7089a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7090b;

    /* renamed from: c, reason: collision with root package name */
    public final S f7091c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f7092a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f7093b = false;

        /* renamed from: c, reason: collision with root package name */
        private S f7094c = new S(30, TimeUnit.SECONDS);

        public z a() {
            return new z(this.f7092a, this.f7093b, this.f7094c);
        }

        public a b(boolean z10) {
            this.f7092a = z10;
            return this;
        }

        public a c(boolean z10) {
            this.f7093b = z10;
            return this;
        }
    }

    z(boolean z10, boolean z11, S s10) {
        this.f7089a = z10;
        this.f7090b = z11;
        this.f7091c = s10;
    }
}
