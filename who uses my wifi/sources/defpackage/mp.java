package defpackage;

import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Objects;
import java.util.function.Function;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class mp implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ mp(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return em.a.e(((Integer) obj).intValue());
            case 1:
                return fm.a.e(((Integer) obj).intValue());
            case 2:
                return zf0.a.e(((Integer) obj).intValue());
            case 3:
                InetSocketAddress inetSocketAddress = (InetSocketAddress) obj;
                ew0 ew0Var = new ew0();
                ew0Var.b = new ki0();
                ew0Var.c = Duration.ofSeconds(10L);
                ew0Var.d = new dn();
                Objects.requireNonNull(inetSocketAddress, "host must not be null");
                ew0Var.a = inetSocketAddress;
                ew0Var.c = wt.f;
                return new vt(ew0Var);
            default:
                return ((gg0) obj).p(false);
        }
    }
}
