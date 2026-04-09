package s1;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import je.u;
import p1.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends nk.l implements mk.c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f33228b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f33229c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33230a;

    static {
        int i4 = 1;
        f33228b = new a(i4, 0);
        f33229c = new a(i4, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, int i10) {
        super(i4);
        this.f33230a = i10;
    }

    @Override // mk.c
    public final Object invoke(Object obj) {
        switch (this.f33230a) {
            case 0:
                break;
            default:
                u.g((r1.d) obj, s.g, 0L, WebSocketProtocol.PAYLOAD_SHORT);
                break;
        }
        return yj.u.f37649a;
    }
}
