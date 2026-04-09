package q8;

import De.h;
import T.InterfaceC3540l;
import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.d;

/* loaded from: classes3.dex */
public abstract class e implements h {

    public static final class a extends e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f58484a;

        public a(boolean z10) {
            super(null);
            this.f58484a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f58484a == ((a) obj).f58484a;
        }

        public boolean f() {
            return this.f58484a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f58484a);
        }

        public String toString() {
            return "Booting(abbrev=" + this.f58484a + ")";
        }
    }

    public static final class b extends e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f58485a;

        public b(boolean z10) {
            super(null);
            this.f58485a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f58485a == ((b) obj).f58485a;
        }

        public boolean f() {
            return this.f58485a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f58485a);
        }

        public String toString() {
            return "Factory(abbrev=" + this.f58485a + ")";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // De.h
    public s9.d a() {
        d.b bVar;
        if (this instanceof a) {
            bVar = new d.b(((a) this).f() ? R.string.device_tag_state_booting_short : R.string.device_tag_state_booting_long);
        } else {
            if (!(this instanceof b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new d.b(((b) this).f() ? R.string.device_tag_state_factory_defaults_short : R.string.device_tag_state_factory_defaults_long);
        }
        return bVar;
    }

    @Override // De.g
    public void c(InterfaceC3540l interfaceC3540l, int i10) {
        h.a.a(this, interfaceC3540l, i10);
    }

    private e() {
    }
}
