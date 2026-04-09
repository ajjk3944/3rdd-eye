package Mf;

import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f13145a;

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f13146b;

    /* renamed from: Mf.a$a, reason: collision with other inner class name */
    public interface InterfaceC0524a {
        gg.i b(a aVar);
    }

    public static abstract class b {

        /* renamed from: Mf.a$b$a, reason: collision with other inner class name */
        public static final class C0525a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final long f13147a;

            /* renamed from: b, reason: collision with root package name */
            private final float f13148b;

            public C0525a(long j10) {
                super(null);
                this.f13147a = j10;
                this.f13148b = 1.0f;
            }

            @Override // Mf.a.b
            public float a() {
                return this.f13148b;
            }

            @Override // Mf.a.b
            public long b() {
                return this.f13147a;
            }

            @Override // Mf.a.b
            public long c() {
                return b();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0525a) && this.f13147a == ((C0525a) obj).f13147a;
            }

            public int hashCode() {
                return Long.hashCode(this.f13147a);
            }

            public String toString() {
                return "Finished(totalBytes=" + this.f13147a + ")";
            }
        }

        /* renamed from: Mf.a$b$b, reason: collision with other inner class name */
        public static final class C0526b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final long f13149a;

            /* renamed from: b, reason: collision with root package name */
            private final long f13150b;

            public C0526b(long j10, long j11) {
                super(null);
                this.f13149a = j10;
                this.f13150b = j11;
            }

            @Override // Mf.a.b
            public float a() {
                return c() / b();
            }

            @Override // Mf.a.b
            public long b() {
                return this.f13149a;
            }

            @Override // Mf.a.b
            public long c() {
                return this.f13150b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0526b)) {
                    return false;
                }
                C0526b c0526b = (C0526b) obj;
                return this.f13149a == c0526b.f13149a && this.f13150b == c0526b.f13150b;
            }

            public int hashCode() {
                return (Long.hashCode(this.f13149a) * 31) + Long.hashCode(this.f13150b);
            }

            public String toString() {
                return "Uploading(totalBytes=" + this.f13149a + ", uploadedBytes=" + this.f13150b + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract float a();

        public abstract long b();

        public abstract long c();

        private b() {
        }
    }

    public a(long j10, InputStream stream) {
        AbstractC6492s.i(stream, "stream");
        this.f13145a = j10;
        this.f13146b = stream;
    }

    public final long a() {
        return this.f13145a;
    }

    public final InputStream b() {
        return this.f13146b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f13145a == aVar.f13145a && AbstractC6492s.d(this.f13146b, aVar.f13146b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f13145a) * 31) + this.f13146b.hashCode();
    }

    public String toString() {
        return "WmwFirmware(fileSizeBytes=" + this.f13145a + ", stream=" + this.f13146b + ")";
    }
}
