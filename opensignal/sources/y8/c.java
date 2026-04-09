package y8;

import java.util.List;
import u8.n;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final b f25880a;

    /* renamed from: d, reason: collision with root package name */
    public final b f25881d;

    public c(b bVar, b bVar2) {
        this.f25880a = bVar;
        this.f25881d = bVar2;
    }

    @Override // y8.e
    public final u8.d E0() {
        return new n(this.f25880a.E0(), this.f25881d.E0());
    }

    @Override // y8.e
    public final List O0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // y8.e
    public final boolean Q0() {
        return this.f25880a.Q0() && this.f25881d.Q0();
    }
}
