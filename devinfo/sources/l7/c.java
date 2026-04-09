package l7;

import i7.o;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final b f28601a;

    /* renamed from: b, reason: collision with root package name */
    public final b f28602b;

    public c(b bVar, b bVar2) {
        this.f28601a = bVar;
        this.f28602b = bVar2;
    }

    @Override // l7.f
    public final i7.e g() {
        return new o(this.f28601a.g(), this.f28602b.g());
    }

    @Override // l7.f
    public final List h() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // l7.f
    public final boolean j() {
        return this.f28601a.j() && this.f28602b.j();
    }
}
