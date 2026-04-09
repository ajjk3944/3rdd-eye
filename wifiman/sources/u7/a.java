package U7;

import W7.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final C0818a f22147e = new C0818a(null);

    /* renamed from: c, reason: collision with root package name */
    private final int f22148c;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f22149d;

    /* renamed from: U7.a$a, reason: collision with other inner class name */
    public static final class C0818a {
        public /* synthetic */ C0818a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(int i10) {
            if (i10 < 0 && i10 > -100) {
                return new a(Math.max(Math.min(i10, -20), -90));
            }
            return null;
        }

        public final a b() {
            return new a(-90);
        }

        private C0818a() {
        }
    }

    public a(int i10) {
        this.f22148c = i10;
        this.f22149d = b() >= -45 ? f.a.EXCELLENT : b() >= -60 ? f.a.GOOD : f.a.POOR;
    }

    @Override // W7.f
    public int b() {
        return this.f22148c;
    }

    @Override // W7.f
    public int c() {
        return -20;
    }

    @Override // W7.f
    public int d() {
        return -90;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f22148c == ((a) obj).f22148c;
    }

    @Override // W7.f
    public f.a h() {
        return this.f22149d;
    }

    @Override // W7.f
    public int hashCode() {
        return Integer.hashCode(this.f22148c);
    }

    public String toString() {
        return "BluetoothSignalStrength(dbm=" + this.f22148c + ")";
    }
}
