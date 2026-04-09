package y7;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.AbstractC7914a;

/* renamed from: y7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8624d extends AbstractC7914a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f66379a = new a(null);

    /* renamed from: y7.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC8624d a(InetAddress address) {
            AbstractC6492s.i(address, "address");
            if (address instanceof Inet4Address) {
                return new C8622b((Inet4Address) address);
            }
            if (address instanceof Inet6Address) {
                return new C8623c((Inet6Address) address);
            }
            throw new IllegalArgumentException("Unknown address type (" + address.getClass() + ")");
        }

        private a() {
        }
    }

    @Override // s7.AbstractC7914a
    public boolean a(AbstractC7914a other) {
        AbstractC6492s.i(other, "other");
        return (other instanceof AbstractC8624d) && AbstractC6492s.d(((AbstractC8624d) other).b(), b());
    }

    public abstract InetAddress b();

    public final boolean c() {
        return b().isLinkLocalAddress();
    }

    public String toString() {
        return "LAN[" + b() + ", isLinkLocal = " + c() + "]";
    }
}
