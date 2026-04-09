package l7;

import i7.j;
import i7.n;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, List list) {
        super(6, list);
        this.f28600c = i4;
    }

    @Override // l7.f
    public final i7.e g() {
        switch (this.f28600c) {
            case 0:
                return new i7.f(0, (List) this.f218b);
            case 1:
                return new j(0, (List) this.f218b);
            case 2:
                return new i7.f(1, (List) this.f218b);
            case 3:
                return new j(1, (List) this.f218b);
            case 4:
                return new j(2, (List) this.f218b);
            case 5:
                return new n((List) this.f218b);
            default:
                return new i7.f(2, (List) this.f218b);
        }
    }
}
