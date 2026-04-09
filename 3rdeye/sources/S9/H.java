package S9;

import R9.AbstractC1564a;
import c9.C2078B;
import c9.C2097r;
import java.util.List;

/* compiled from: TreeJsonDecoder.kt */
/* loaded from: classes3.dex */
public final class H extends E {

    /* renamed from: k, reason: collision with root package name */
    public final R9.z f12024k;

    /* renamed from: l, reason: collision with root package name */
    public final List<String> f12025l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12026m;

    /* renamed from: n, reason: collision with root package name */
    public int f12027n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(AbstractC1564a json, R9.z value) {
        super(json, value, null, null);
        kotlin.jvm.internal.l.f(json, "json");
        kotlin.jvm.internal.l.f(value, "value");
        this.f12024k = value;
        List<String> listG0 = C2097r.G0(value.f11826b.keySet());
        this.f12025l = listG0;
        this.f12026m = listG0.size() * 2;
        this.f12027n = -1;
    }

    @Override // S9.E, Q9.AbstractC1525d0
    public final String S(O9.e descriptor, int i) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        return this.f12025l.get(i / 2);
    }

    @Override // S9.E, S9.AbstractC1570b
    public final R9.i U(String tag) {
        kotlin.jvm.internal.l.f(tag, "tag");
        return this.f12027n % 2 == 0 ? R9.j.b(tag) : (R9.i) C2078B.n(this.f12024k, tag);
    }

    @Override // S9.E, S9.AbstractC1570b
    public final R9.i X() {
        return this.f12024k;
    }

    @Override // S9.E
    /* renamed from: Z */
    public final R9.z X() {
        return this.f12024k;
    }

    @Override // S9.E, S9.AbstractC1570b, P9.b
    public final void b(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
    }

    @Override // S9.E, P9.b
    public final int x(O9.e descriptor) {
        kotlin.jvm.internal.l.f(descriptor, "descriptor");
        int i = this.f12027n;
        if (i >= this.f12026m - 1) {
            return -1;
        }
        int i10 = i + 1;
        this.f12027n = i10;
        return i10;
    }
}
