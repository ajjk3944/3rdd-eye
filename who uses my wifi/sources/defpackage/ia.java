package defpackage;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ia implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ ia(int i) {
        this.a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((InetSocketAddress) obj).getAddress() instanceof Inet4Address;
            case 1:
                return Objects.nonNull((gg0) obj);
            default:
                return ((kn0) obj).getType() == 6;
        }
    }
}
