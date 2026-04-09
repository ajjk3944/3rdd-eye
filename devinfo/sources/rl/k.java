package rl;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements mk.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mk.a f33106b;

    public /* synthetic */ k(int i4, mk.a aVar) {
        this.f33105a = i4;
        this.f33106b = aVar;
    }

    @Override // mk.a
    public final Object invoke() {
        switch (this.f33105a) {
            case 0:
                try {
                    return (List) this.f33106b.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return zj.s.f38317a;
                }
            default:
                this.f33106b.invoke();
                return yj.u.f37649a;
        }
    }
}
