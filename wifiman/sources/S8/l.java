package S8;

import W7.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class l extends W7.f {

    /* renamed from: f, reason: collision with root package name */
    public static final a f20404f = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final int f20405c;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f20406d;

    /* renamed from: e, reason: collision with root package name */
    private final f.a f20407e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(int i10) {
            if (i10 < 0 && i10 > -100) {
                return new l(Math.max(Math.min(i10, -20), -105));
            }
            return null;
        }

        private a() {
        }
    }

    public l(int i10) {
        this.f20405c = i10;
        this.f20406d = b() >= -75 ? f.a.EXCELLENT : b() >= -80 ? f.a.GOOD : f.a.POOR;
        this.f20407e = b() >= -65 ? f.a.EXCELLENT : b() >= -75 ? f.a.GOOD : f.a.POOR;
    }

    @Override // W7.f
    public int b() {
        return this.f20405c;
    }

    @Override // W7.f
    public int c() {
        return -35;
    }

    @Override // W7.f
    public int d() {
        return -95;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f20405c == ((l) obj).f20405c;
    }

    @Override // W7.f
    public f.a h() {
        return this.f20406d;
    }

    @Override // W7.f
    public int hashCode() {
        return Integer.hashCode(this.f20405c);
    }

    public final f.a j() {
        return this.f20407e;
    }

    public String toString() {
        return "WifiSignalStrength(dbm=" + this.f20405c + ")";
    }
}
