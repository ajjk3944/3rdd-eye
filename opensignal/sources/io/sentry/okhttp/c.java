package io.sentry.okhttp;

import ar.k;
import br.l;
import br.n;
import java.net.InetAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class c extends n implements k {

    /* renamed from: g, reason: collision with root package name */
    public static final c f12470g;

    /* renamed from: r, reason: collision with root package name */
    public static final c f12471r;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12472d;

    static {
        int i10 = 1;
        f12470g = new c(i10, 0);
        f12471r = new c(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f12472d = i11;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f12472d) {
            case 0:
                InetAddress inetAddress = (InetAddress) obj;
                l.e(inetAddress, "address");
                String string = inetAddress.toString();
                l.d(string, "toString(...)");
                return string;
            default:
                Proxy proxy = (Proxy) obj;
                l.e(proxy, "proxy");
                String string2 = proxy.toString();
                l.d(string2, "toString(...)");
                return string2;
        }
    }
}
