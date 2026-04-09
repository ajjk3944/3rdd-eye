package inet.ipaddr;

import bg.AbstractC4108a;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static b f49292a = b.PREFIXED_ZERO_HOSTS_ARE_SUBNETS;

    public interface a {
        Zf.d a(int i10);

        Zf.d c(int i10, int i11, Integer num);

        Zf.d[] d(int i10);

        Zf.d g(int i10, Integer num);
    }

    public enum b {
        ALL_PREFIXED_ADDRESSES_ARE_SUBNETS,
        PREFIXED_ZERO_HOSTS_ARE_SUBNETS,
        EXPLICIT_SUBNETS;

        public boolean allPrefixedAddressesAreSubnets() {
            return this == ALL_PREFIXED_ADDRESSES_ARE_SUBNETS;
        }

        public boolean prefixedSubnetsAreExplicit() {
            return this == EXPLICIT_SUBNETS;
        }

        public boolean zeroHostsAreSubnets() {
            return this == PREFIXED_ZERO_HOSTS_ARE_SUBNETS;
        }
    }

    public static b c() {
        return f49292a;
    }

    public abstract AbstractC4108a a();

    public abstract b d();

    protected boolean g(c cVar) {
        return j.u1(this, cVar);
    }
}
