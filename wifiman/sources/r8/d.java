package r8;

import De.h;
import T.InterfaceC3540l;
import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.d;

/* loaded from: classes3.dex */
public abstract class d implements h {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f60132a;

        public a(boolean z10) {
            super(null);
            this.f60132a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f60132a == ((a) obj).f60132a;
        }

        @Override // r8.d
        public boolean f() {
            return this.f60132a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60132a);
        }

        public String toString() {
            return "AP(abbrev=" + this.f60132a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f60133a;

        public b(boolean z10) {
            super(null);
            this.f60133a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f60133a == ((b) obj).f60133a;
        }

        @Override // r8.d
        public boolean f() {
            return this.f60133a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60133a);
        }

        public String toString() {
            return "Factory(abbrev=" + this.f60133a + ")";
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f60134a;

        public c(boolean z10) {
            super(null);
            this.f60134a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f60134a == ((c) obj).f60134a;
        }

        @Override // r8.d
        public boolean f() {
            return this.f60134a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60134a);
        }

        public String toString() {
            return "Gateway(abbrev=" + this.f60134a + ")";
        }
    }

    /* renamed from: r8.d$d, reason: collision with other inner class name */
    public static final class C2092d extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f60135a;

        public C2092d(boolean z10) {
            super(null);
            this.f60135a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2092d) && this.f60135a == ((C2092d) obj).f60135a;
        }

        @Override // r8.d
        public boolean f() {
            return this.f60135a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60135a);
        }

        public String toString() {
            return "Me(abbrev=" + this.f60135a + ")";
        }
    }

    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f60136a;

        public e(boolean z10) {
            super(null);
            this.f60136a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f60136a == ((e) obj).f60136a;
        }

        @Override // r8.d
        public boolean f() {
            return this.f60136a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60136a);
        }

        public String toString() {
            return "SpeedtestHttp(abbrev=" + this.f60136a + ")";
        }
    }

    public static final class f extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f60137a;

        public f(boolean z10) {
            super(null);
            this.f60137a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f60137a == ((f) obj).f60137a;
        }

        @Override // r8.d
        public boolean f() {
            return this.f60137a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f60137a);
        }

        public String toString() {
            return "SpeedtestTcp(abbrev=" + this.f60137a + ")";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // De.h
    public s9.d a() {
        d.b bVar;
        if (this instanceof C2092d) {
            bVar = new d.b(((C2092d) this).f() ? R.string.device_tag_myself_short : R.string.device_tag_myself_long);
        } else if (this instanceof a) {
            bVar = new d.b(((a) this).f() ? R.string.device_tag_ap_short : R.string.device_tag_ap_long);
        } else if (this instanceof c) {
            bVar = new d.b(((c) this).f() ? R.string.device_tag_gateway_short : R.string.device_tag_gateway_long);
        } else if (this instanceof b) {
            bVar = new d.b(((b) this).f() ? R.string.device_tag_state_factory_defaults_short : R.string.device_tag_state_factory_defaults_long);
        } else {
            if (!(this instanceof f) && !(this instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(f() ? R.string.device_tag_speedtest_server_short : R.string.device_tag_speedtest_server_long);
        }
        return bVar;
    }

    @Override // De.g
    public void c(InterfaceC3540l interfaceC3540l, int i10) {
        h.a.a(this, interfaceC3540l, i10);
    }

    public abstract boolean f();

    private d() {
    }
}
