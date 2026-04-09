package C;

import androidx.camera.core.impl.L;
import androidx.camera.core.impl.R0;

/* compiled from: RetryPolicy.java */
/* loaded from: classes.dex */
public interface Z {

    /* renamed from: a, reason: collision with root package name */
    public static final L.b f671a;

    /* compiled from: RetryPolicy.java */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final a f672d = new a(0, false, false);

        /* renamed from: e, reason: collision with root package name */
        public static final a f673e = new a(500, true, false);

        /* renamed from: f, reason: collision with root package name */
        public static final a f674f;

        /* renamed from: a, reason: collision with root package name */
        public final long f675a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f676b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f677c;

        static {
            new a(100L, true, false);
            f674f = new a(0L, false, true);
        }

        public a(long j4, boolean z10, boolean z11) {
            this.f676b = z10;
            this.f675a = j4;
            if (z11) {
                A2.l.k("shouldRetry must be false when completeWithoutFailure is set to true", !z10);
            }
            this.f677c = z11;
        }
    }

    static {
        int i = Y.f670a;
        f671a = new L.b(6000L);
        new R0(6000L, new L.a(6000L));
    }

    long a();

    a c(androidx.camera.core.impl.K k10);
}
