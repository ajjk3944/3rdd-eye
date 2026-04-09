package q8;

import De.a;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import s9.d;

/* loaded from: classes3.dex */
public abstract class d implements De.a {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f58482a;

        public a(boolean z10) {
            super(null);
            this.f58482a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f58482a == ((a) obj).f58482a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f58482a);
        }

        public String toString() {
            return "Connected(abbrev=" + this.f58482a + ")";
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f58483a;

        public b(boolean z10) {
            super(null);
            this.f58483a = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f58483a == ((b) obj).f58483a;
        }

        public boolean f() {
            return this.f58483a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f58483a);
        }

        public String toString() {
            return "LE(abbrev=" + this.f58483a + ")";
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // De.a
    public s9.d a() {
        if (this instanceof a) {
            return new d.b(R.string.connection_state_connected);
        }
        if (this instanceof b) {
            return new d.b(((b) this).f() ? R.string.bluetooth_type_low_energy_short : R.string.bluetooth_type_low_energy);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // De.a
    public long b(InterfaceC3540l interfaceC3540l, int i10) {
        long j10;
        interfaceC3540l.U(-1341580706);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1341580706, i10, -1, "com.ubnt.usurvey.ui.discovery.bluetooth.BluetoothDiscoveryDeviceBadge.color (BluetoothDiscoveryDeviceTag.kt:41)");
        }
        if (this instanceof a) {
            interfaceC3540l.U(557579703);
            j10 = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f();
            interfaceC3540l.J();
        } else {
            if (!(this instanceof b)) {
                interfaceC3540l.U(557577804);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(557581239);
            j10 = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().g().j();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return j10;
    }

    @Override // De.a, De.g
    public void c(InterfaceC3540l interfaceC3540l, int i10) {
        a.C0158a.a(this, interfaceC3540l, i10);
    }

    @Override // De.a
    public boolean d() {
        return a.C0158a.b(this);
    }

    private d() {
    }
}
